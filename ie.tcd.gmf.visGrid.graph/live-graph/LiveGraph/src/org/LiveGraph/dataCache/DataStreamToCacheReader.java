package org.LiveGraph.dataCache;

import java.io.IOException;
import java.util.List;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataFile.common.DataFormatException;
import org.LiveGraph.dataFile.read.DataStreamObserver;
import org.LiveGraph.dataFile.read.DataStreamReader;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventListener;
import org.LiveGraph.events.EventManager;
import org.LiveGraph.events.EventProcessingException;
import org.LiveGraph.events.EventProducer;
import org.LiveGraph.events.EventType;

import com.softnetConsult.utils.exceptions.ThrowableTools;

import static org.LiveGraph.dataCache.DataUpdateEvent.*;


/**
 * This reader will parse a data stream using {@link DataStreamReader} and store all
 * information in a data cache for further processing by the application.<br />
 * <br />
 * See {@link org.LiveGraph.dataFile.write.DataStreamWriter} for the details of the data file format. 
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataStreamToCacheReader.java</p> 
 * <p style="font-size:smaller;">Redistribution and use in source and binary forms, with or
 *    without modification, are permitted provided that the following terms and conditions are met:
 * </p>
 * <p style="font-size:smaller;">1. Redistributions of source code must retain the above
 *    acknowledgement of the LiveGraph project and its web-site, the above copyright notice,
 *    this list of conditions and the following disclaimer.<br />
 *    2. Redistributions in binary form must reproduce the above acknowledgement of the
 *    LiveGraph project and its web-site, the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with
 *    the distribution.<br />
 *    3. All advertising materials mentioning features or use of this software or any derived
 *    software must display the following acknowledgement:<br />
 *    <em>This product includes software developed by the LiveGraph project and its
 *    contributors.<br />(http://www.live-graph.org)</em><br />
 *    4. All advertising materials distributed in form of HTML pages or any other technology
 *    permitting active hyper-links that mention features or use of this software or any
 *    derived software must display the acknowledgment specified in condition 3 of this
 *    agreement, and in addition, include a visible and working hyper-link to the LiveGraph
 *    homepage (http://www.live-graph.org).
 * </p>
 * <p style="font-size:smaller;">THIS SOFTWARE IS PROVIDED &quot;AS IS&quot;, WITHOUT WARRANTY
 *    OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 *    MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND  NONINFRINGEMENT. IN NO EVENT SHALL
 *    THE AUTHORS, CONTRIBUTORS OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM, OUT OF OR
 *    IN CONNECTION WITH THE SOFTWARE OR THE USE OR  OTHER DEALINGS IN THE SOFTWARE.
 * </p>
 * 
 * @author Greg Paperin (<a href="http://www.paperin.org" target="_blank">http://www.paperin.org</a>)
 * @version {@value org.LiveGraph.LiveGraph#version}
 */
public class DataStreamToCacheReader implements DataStreamObserver, EventListener, EventProducer {

/**
 * The maximum period of time the reader will wait to be able to do an update before canceling the update.
 */
public static final long maxWaitForUpdate = 500L;

/**
 * Cache for storage of extracted data.
 */
private DataCache cache = null;

/**
 * Whether an update is currently running. 
 */
private boolean updateInProgress = false;

/**
 * Data reader used for the previous update.
 */
private DataStreamReader previousReader = null;

/**
 * Creates a data reader on the specified stream.
 * 
 * @param cache The data cache into which to store the data. 
 */
public DataStreamToCacheReader(DataCache cache) {
	
	if (null == cache)
		throw new NullPointerException("Cannot use a null cache.");
	
	this.cache = cache;
	this.previousReader = null;
	this.updateInProgress = false;
}


/**
 * Reads as many data lines from the underlying stream as there are available, parses the lines and
 * stores the extracted information (if any) in this reader's data cache.
 *  
 * @param reader Data source.
 * @param closeAfterRead Whether to close reader after reading. 
 * @throws IOException If an I/O error occurs.
 * @throws DataFormatException If the data stream contents do not conform with the expected data
 * stream format.
 * @see org.LiveGraph.dataFile.write.DataStreamWriter
 * @see org.LiveGraph.dataFile.read.DataStreamReader
 */
private void readFromStream(DataStreamReader reader, boolean closeAfterRead)
																throws IOException, DataFormatException {
	synchronized (reader) {
		
		synchronized (cache) {
			cache.bulkOperationStart();
			try {
				if (LiveGraph.application().getDataFileSettings().getDoNotCacheData())
					cache.resetCache();
				while(checkReaderOpen(reader) && reader.ready()) {
					reader.readFromStream(DataCache.MAX_DELAYED_EVENTS + 1);
					try { cache.wait(1); }
					catch(InterruptedException e) { }
				}
			} finally {
				cache.bulkOperationCompleted();
			}
		}
		
		if (closeAfterRead)
			reader.close();
	}
}

/**
 * Whether an update is currently running.
 * @return Whether an update is currently running.
 */
public synchronized boolean isUpdateInProgress() {
	return updateInProgress;
}

/**
 * Sets the internal {@code updateInProgress} state.
 * @param state The new state.
 */
private synchronized void setUpdateInProgress(boolean state) {
	updateInProgress = state;
}

/**
 * Checks whether the specified reader is still open by trying to execute an action on it.
 * 
 * @param reader A data stream reader.
 * @return {@code true} if the reader is not closed, {@code false} otherwise.
 */
private boolean checkReaderOpen(DataStreamReader reader) {
	synchronized(reader) {
	    try {
	    	reader.ready();
	    	return true;
	    } catch(IOException e) {
	    	return false;
	    }
    }
}

/**
 * Used by {@code checkUpdateCanStart}: Verifies that an update may begin by first checking
 * whether another update is not in progress and then requesting all event listeners to verify a
 * {@code UPDIN_UpdateStart}-event.
 * 
 * @return A readily validated event of type {@code DataUpdateEvent.UPDIN_UpdateStart} if an update may begin,
 * {@code null} if the verification was not successfull.
 */
private Event<DataUpdateEvent> doCheckUpdateCanStart() {
	
	// Check that another update is not in progress:
	if (isUpdateInProgress())
		return null;
	
	// Validate update:
	EventManager eventManager = LiveGraph.application().eventManager();
	Event<DataUpdateEvent> event = new Event<DataUpdateEvent>(this, DataUpdateEvent.class, UPDIN_UpdateStart);
	
	try {
		if (eventManager.validateEvent(event))
			return event;
	} catch (EventProcessingException e) { }
	return null;
}

/**
 * Verifies that an update may begin by first checking whether another update is
 * not in progress and then requesting all event listeners to verify a
 * {@code UPDIN_UpdateStart}-event. If the verification is not successful, the method
 * pauses the current thread and then reattempts the verification. This may be repeated
 * several times. If the verification was not successfull after {@code maxWaitForUpdate}
 * milliseconds, it will be regarded as failed. 
 * This private method assumes that the calling method has synchronised on {@code this}.
 * 
 * @param reader Data source for the update.
 * 
 * @return A readily validated event of type {@code DataUpdateEvent.UPDIN_UpdateStart} if an update may begin,
 * {@code null} otherwise.
 */
private Event<DataUpdateEvent> checkUpdateCanStart(DataStreamReader reader) {
	
	Event<DataUpdateEvent> startEvent = doCheckUpdateCanStart();
	if (null != startEvent)
		return startEvent;
	
	long startedWaiting = System.currentTimeMillis();
	do {
		
		// If the reader is not open any more, we do not need to wait and can fail-fast:
		if (!checkReaderOpen(reader))
			return null;
		
		try { this.wait(5); }
		catch(InterruptedException e) { }
		
		startEvent = doCheckUpdateCanStart();
		if (null != startEvent)
			return startEvent;
	} while(System.currentTimeMillis() - startedWaiting < maxWaitForUpdate);
	
	return null;
}

/**
 * Attempts to initiate a data update in a new thread.
 * First this method verifies that no other update is already in progress, then it
 * validates a {@code UPDIN_UpdateStart}-event against all listeners. If both
 * succeeds, a new thread is started that will read the stream into the cache.
 * The verification may be attempted several times, but no longer than
 * {@code maxWaitForUpdate} milliseconds.
 * 
 * @param reader Data source.
 * @param closeAfterRead Whether to close reader after reading. 
 */
private synchronized void startDataUpdate(final DataStreamReader reader, final boolean closeAfterRead) {
	
	if (null == reader)
		return;
	
	Event<DataUpdateEvent> startEvent = checkUpdateCanStart(reader);
	if (null == startEvent)
		return;
		
	setUpdateInProgress(true);
	
	// Even if reader is closed during this operation it should not fail, no no need for synch:
	if (previousReader != reader) {
		reader.addObserver(this);
		previousReader = reader;
	}
	
	try {
	
		LiveGraph.application().eventManager().raiseEvent(startEvent);
		
		Runnable updateWorker = new Runnable() {
			public void run() {
				try {
					try {
						readFromStream(reader, closeAfterRead);				
					} catch(Exception e) {				
						raiseUpdateFinishedError(e);
					}
					raiseUpdateFinishedSusccess();
				} finally {
					setUpdateInProgress(false);
				}
			}
		};
		
		Thread readerThread = new Thread(updateWorker, "LiveGraph Data File Reader");
		readerThread.start();
	
	// Make the best effort to reset the in-progress flag if an error occurs:
	} catch(RuntimeException e) {
		setUpdateInProgress(false);
		throw e;
	} catch(Error e) {
		setUpdateInProgress(false);
		throw e;
	}
}


/**
 * Raises an event to notify listeners that an update has finished without any errors.
 */
private void raiseUpdateFinishedSusccess() {
	Event<DataUpdateEvent> event = new Event<DataUpdateEvent>(this, DataUpdateEvent.class,
																DataUpdateEvent.UPDIN_UpdateFinishSuccess);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Raises an event to notify listeners that an update has finished with errors.
 *  
 * @param err The {@code Throwable} describing the error.
 */
private void raiseUpdateFinishedError(Throwable err) {
	
	String shortMsg = err.getMessage() + "(" + err.getClass().getSimpleName() + ")";
	String longMsg = ThrowableTools.stackTraceToString(err);
	
	Event<DataUpdateEvent> event = new Event<DataUpdateEvent>(this, DataUpdateEvent.class,
															  DataUpdateEvent.UPDIN_UpdateFinishError,
															  shortMsg);
	LiveGraph.application().eventManager().raiseEvent(event);
	LiveGraph.application().guiManager().logErrorLn(longMsg);
}


/**
 * Used for callback by the {@link DataStreamReader}; does nothing.
 */
public void eventCommentLine(String line, DataStreamReader reader) {
	; // No action required.	
}

/**
 * Used for callback by the {@link DataStreamReader}; adds a dataset to the cache.
 */
public void eventDataLineRead(List<String> dataTokens, int datasetIndex, DataStreamReader reader) {
	
	List<Double> vals = DataStreamReader.convertTokensToDoubles(dataTokens);
	DataSet ds = new DataSet(vals, datasetIndex);
	cache.addDataSet(ds);	
}

/**
 * Used for callback by the {@link DataStreamReader}; adds a file info line to the cache.
 */
public void eventFileInfoLine(String info, DataStreamReader reader) {
	cache.addDataFileInfo(info);	
}

/**
 * Used for callback by the {@link DataStreamReader}; setts the data column labels in the cache.
 */
public void eventLabelsSet(List<String> labels, DataStreamReader reader) {
	List<String> uniqueLabels = DataStreamReader.createUniqueLabels(labels, true); 
	cache.resetLabels(uniqueLabels);	
}

/**
 * Used for callback by the {@link DataStreamReader}; does nothing.
 */
public void eventSeparatorSet(String separator, DataStreamReader reader) {
	; // No action required.	
}


/**
 * Permits to register as listener with the main LiveGraph event manager and
 * only with the main LiveGraph event manager.
 * 
 * @param manager The {@code EventManager} for the registering attempt.
 * @return {@code (LiveGraph.application().eventManager() == manager)}.
 * @see EventListener#permissionRegisterWithEventManager(EventManager)
 */
public boolean permissionRegisterWithEventManager(EventManager manager) {
	return LiveGraph.application().eventManager() == manager;
}

/**
 * Does not permit any unregistering.
 * 
 * @param manager The {@code EventManager} for the registering attempt.
 * @return {@code false}.
 * @see EventListener#permissionUnregisterWithEventManager(EventManager)
 */
public boolean permissionUnregisterWithEventManager(EventManager manager) {
	return false;
}

/**
 * Does nothing.
 * 
 * @param manager The {@code EventManager} with which this {@code EventListener} is now registered.
 * @see EventListener#completedRegisterWithEventManager(EventManager)
 */
public void completedRegisterWithEventManager(EventManager manager) { }

/**
 * Does nothing.
 * 
 * @param manager The {@code EventManager} with which this {@code EventListener} is now unregistered.
 * @see EventListener#completedUnregisterWithEventManager(EventManager)
 */
public void completedUnregisterWithEventManager(EventManager manager) { }

/**
 * Does nothing.
 * 
 * @param event An event in which this {@code EventListener} may be interested.
 * @return {@code false}.
 * @see EventListener#checkEventInterest(Event)
 */
public boolean checkEventInterest(Event<? extends EventType> event) {
	return false;
}

/**
 * Does nothing.
 * 
 * @param event The event to be validated.
 * @param soFar Whether {@code event} has been successfuly validated by whichever {@code EventListener}s
 * (if any) were invoked to validate {@code event} before this {@code EventListener}.
 * @return {@code true}.
 * @see EventListener#checkEventValid(Event, boolean)
 */
public boolean checkEventValid(Event<? extends EventType> event, boolean soFar) {
	return true;
}

/**
 * Processes LiveGraph events.
 * 
 * @param event The event to process.
 */
public void eventRaised(Event<? extends EventType> event) throws Exception {

	if (event.getDomain() == DataUpdateEvent.class) {
		processDataUpdateEvent(event.cast(DataUpdateEvent.class));
		return;
	}
}

/**
 * Attempts to initiate an update when a {@code UPDIN_InitiateUpdate}-event is received.
 * 
 * @param event The event to process.
 */
private void processDataUpdateEvent(Event<DataUpdateEvent> event) {
	
	if (UPDIN_InitiateUpdate == event.getType()) {
		startDataUpdate((DataStreamReader) event.getInfoObject(), event.getInfoBoolean());
		return;
	}
	
}

/**
 * Does nothing.
 * @param event Event that cause an exception.
 * @param exception The exception.
 * @return {@code false}.
 */
public boolean eventProcessingException(Event<? extends EventType> event, EventProcessingException exception) {
	return false;
}

/**
 * Does nothing.
 *  @param event Event that was processed.
 */
public void eventProcessingFinished(Event<? extends EventType> event) {	}

}  // public class DataStreamToCacheReader
