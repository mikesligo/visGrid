package org.LiveGraph.dataCache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.DataCache.CacheMode;
import org.LiveGraph.dataFile.read.DataStreamReader;
import org.LiveGraph.dataFile.read.PipedInputStream;
import org.LiveGraph.dataFile.write.DataStreamWriter;
import org.LiveGraph.dataFile.write.DataStreamWriterFactory;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventListener;
import org.LiveGraph.events.EventManager;
import org.LiveGraph.events.EventProcessingException;
import org.LiveGraph.events.EventProducer;
import org.LiveGraph.events.EventType;
import org.LiveGraph.settings.DataFileSettings;
import org.LiveGraph.settings.SettingsEvent;

import com.softnetConsult.utils.exceptions.ThrowableTools;


/**
 * An object of this class is used to triger updates from a data input stream
 * into a {@link DataCache} at regular intervals.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: UpdateInvoker.java</p> 
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
public class UpdateInvoker implements Runnable, EventListener, EventProducer {

/**
 * How long to sleep for when updates are to be invoked automatically.
 */
private static final long timeTickLength = 50; // milliseconds 

/**
 * Determines wether the invoker is in memory-stream mode.
 * @see #startMemoryStreamMode(InputStream)
 */
private boolean memoryStreamMode = false;

/**
 * The data reader for the input stream.
 */
private DataStreamReader dataReader = null;

/**
 * Cache to hold the data.
 */
private DataCache dataCache = null;

/**
 * Data file from which to update.
 */
private File dataFile = null;

/**
 * Interval between updates in milliseconds.
 */
private long interval = -1;

/**
 * Whether the invoker thread should wind up at the next possibility.
 */
private boolean mustQuit = false;

/**
 * Remaining milliseconds till the next update.
 */
private long remainingMillis = -1;

/**
 * System milliseconds at last update.
 */
private long lastUpdateTime = 0;

/**
 * Milliseconds since last update.
 */
private long sinceUpdateTime = 0;


/**
 * Constructs a new invoker.
 * @param cache The application's data cache.
 */
public UpdateInvoker(DataCache cache) {
	
	if (null == cache)
		throw new NullPointerException("Cannot read data into a null cache");
	
	this.dataCache = cache;
	
	this.dataFile = null;
	this.dataReader = null;
	
	this.memoryStreamMode = false;
	
	this.mustQuit = false;
	
	this.interval = -1;
	this.remainingMillis = -1;
	this.lastUpdateTime = 0;
	this.sinceUpdateTime = 0;
}

/**
 * Sets the length of the interval between automatic data updates in milliseconds.
 * If {@code interval <= 0} the update will not be triggered automatically.
 * 
 * @param interval The length of the interval between automatic data updates in milliseconds
 * (if {@code interval <= 0} the update will not be triggered automatically).
 */
private synchronized void setInterval(long interval) {
	
	if (interval == this.interval)
		return;
	
	if (this.interval <= 0 && interval > 0)
		this.lastUpdateTime = 0;
	
	this.interval = interval;
	this.notifyAll();
}

/**
 * The length of the interval between data updates.
 * If {@code interval <= 0} the update will not be triggered automatically.
 * @return The length of the interval between automatic data updates in milliseconds;
 * a value {@code interval <= 0} indicated that no updates will be triggered automatically.
 */
public synchronized long getInterval() {
	return interval;
}

/**
 * Used to notify this invoker that is must stop running at the next possibility.
 * 
 * @param val Whether this invoker should stop running at the next possibility.
 */
public synchronized void setMustQuit(boolean val) {
	this.mustQuit = val;
	this.notifyAll();
}

/**
 * Time to next update.
 * 
 * @return Number of milliseconds left until the next update.
 */
public synchronized long getRemainingMillis() {
	return remainingMillis;
}

private void resetCache(CacheMode mode) {
	synchronized (dataCache) {
		if (null == mode)
			dataCache.resetCache();
		else
			dataCache.resetCache(mode);
    }
}

/**
 * Sets the file from which the next update will be read and closes the previously used reader.
 * 
 * @param fileName File from which to read the data from now on.
 * @throws IllegalStateException If no valid data cache is set.
 */
private void setDataFile(String fileName) {
	
	if (null == fileName)
		throw new NullPointerException("Cannot read data from a null file name");
	
	File file = new File(fileName);
		
	closeDataReader();
	dataFile = file;
}


private synchronized void closeDataReader() {

	if (null == dataReader)
		return;
	
	synchronized(dataReader) {
		try {
			dataReader.close();
		} catch(IOException e) {
			LiveGraph.application().guiManager().logErrorLn(ThrowableTools.stackTraceToString(e));
		} finally {
			dataReader = null;
		}
	}
}

/**
 * Tells whether this invoker's reader's underlying data stream is ready to be read.
 * 
 * @return {@code true} if the next {@code readFromStream()} is guaranteed not to block for input,
 * {@code false} otherwise. Note that returning {@code false} does not guarantee that the next read will block.
 * @throws IOException If an I/O error occurs.
 */
public synchronized boolean ready() throws IOException {
	
	if (null == dataReader)
		return false;
	
	try {
		synchronized (dataReader) {
			return dataReader.ready();
		}
	} catch(NullPointerException e) {
		// This will happen when dataReader became null after the check. It's ok, just return.
		return false;
	}
}

private void raiseCannotInitiateUpdate(String message) {
	Event<DataUpdateEvent> event = new Event<DataUpdateEvent>(this, DataUpdateEvent.class,
															  DataUpdateEvent.UPDIN_CannotInitiateUpdate,
															  null == message ? "" : message);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Creates a new {@link DataStreamToCacheReader} for a stream on the currently set data file.
 * Called by {@link #requestUpdate()} either when no data reader is available
 * ({@code dataReader} is {@code null}), or if a data reader is available, but "do not cacha data"
 * is activated.
 * 
 * @return {@code true} if a data reader was opened, {@code false} if a data reader could not be
 * successfully opened (also raises an {@code UPDIN_CannotInitiateUpdate}-event).
 */
private boolean openDataFileReader() {
	
	if (null == dataFile || 0 == dataFile.getPath().length()) {
		raiseCannotInitiateUpdate("No data input specified");
		return false;
	}
		
	closeDataReader();

	try {
		dataReader = new DataStreamReader(new FileInputStream(dataFile));
	} catch(FileNotFoundException e) {
		raiseCannotInitiateUpdate("File not found: " + dataFile.getName());
		LiveGraph.application().guiManager().logErrorLn(e.getMessage());
		return false;
	} catch (Exception e) {
		raiseCannotInitiateUpdate(e.getMessage());
		LiveGraph.application().guiManager().logErrorLn(e.getMessage());
		return false;
	}
	
	return true;
}

/**
 * Raises a {@code UPDIN_InitiateUpdate}-event to notify the {@code DataStreamToCacheReader} that
 * it is time for a data update.
 */
public synchronized void requestUpdate() {
	
	lastUpdateTime = System.currentTimeMillis();
	
	// Reopen data reader:
	if (null == dataReader || LiveGraph.application().getDataFileSettings().getDoNotCacheData()) {
		
		if (!openDataFileReader())
			return;
	}

	try {
		synchronized (dataReader) {
		    
			if (null == dataReader)
				return;
			
			Event<DataUpdateEvent> event = new Event<DataUpdateEvent>(
												this, DataUpdateEvent.class,
												DataUpdateEvent.UPDIN_InitiateUpdate,
												LiveGraph.application().getDataFileSettings().getDoNotCacheData(),
												0L, Double.NaN,
												dataReader);
			LiveGraph.application().eventManager().raiseEvent(event);
		}
	} catch(NullPointerException e) {
		// This will happen when dataReader became null after the check or when it could not be created.
		// It's ok, just return.
	}
}

/**
 * Send the this invoker to sleep for {@code timeTickLength} milliseconds.
 * When it wakes it, internal time state is updated an the observers notified.
 */
private void timeTick() {
	
	synchronized(this) {
		
		try {
			if (interval < 0)
				this.wait();
			else
				this.wait(timeTickLength);
		} catch(InterruptedException e) { }
		
		sinceUpdateTime = System.currentTimeMillis() - lastUpdateTime;
		remainingMillis = interval <= 0 ? -1 : Math.max(0, interval - sinceUpdateTime);
	}
	
	raiseTimerTick();
}

/**
 * Raises an event to notify listeners that this invoker has waken up to process events.
 * This gives listeners displaying various information about this invoker a chance to
 * update their state.
 */
private void raiseTimerTick() {
	Event<DataUpdateEvent> event = new Event<DataUpdateEvent>(this, DataUpdateEvent.class,
																	DataUpdateEvent.UPDIN_TimerTick);
	LiveGraph.application().eventManager().raiseEvent(event);
}


/**
 * Winds up the operations by closing the current data reader.
 */
private void tidyUp() {
	closeDataReader();
}

/**
 * Main invoker loop:
 * call {@link #timeTick()};
 * if it is time for the next update, call {@link #requestUpdate()};
 * call {@link #timeTick()} again and continue the loop until {@link #mustQuit} is set to true;
 * call {@link #tidyUp()} before quitting. 
 */
public void run() {
		
	while (true) {
		
		try {
			synchronized (this) {
				if (mustQuit) {
					tidyUp();
					return;
				}
	        }
			
			timeTick();
			
			if (sinceUpdateTime >= interval && interval > 0)
				requestUpdate();
		} catch(Throwable e) {
			LiveGraph.application().guiManager().logErrorLn(ThrowableTools.stackTraceToString(e));
		}
	}
}

/**
 * Uses a pipe buffer of 5 MB. To customise the buffer size, create your own streams and use
 * {@link #startMemoryStreamMode(InputStream)} to initiate the memory stream mode.
 * @return xxx
 */
public DataStreamWriter startMemoryStreamMode() {
	
	try {
		PipedInputStream ins = new PipedInputStream(5 * 1024 * 1024); // 5 MB
		DataStreamWriter outw = DataStreamWriterFactory.createDataWriter(ins);
		if (!startMemoryStreamMode(ins))
			return null;
		return outw;
	} catch(IOException e) {
		return null;
	}
	
}

public boolean startMemoryStreamMode(InputStream in) throws IOException {
	
	// Check not null
	if (null == in)
		throw new NullPointerException("Cannot use a null stream for memory stream mode");
	
	// Check stream class:
	if (in instanceof java.io.PipedInputStream) {
		final String correctClassName = org.LiveGraph.dataFile.read.PipedInputStream.class.getCanonicalName();
		throw new IllegalArgumentException(
					String.format("Streams of type java.io.PipedInputStream are incompatible with the memory"
								+ " stream mode. %nUse %1$s instead. %n"
								+ "For further info see the API reference for %1$s.",
								correctClassName));
	}
	
	// Check stream open:
	in.available();
	
	// Validate switching to memory stream mode:
	EventManager eventManager = LiveGraph.application().eventManager();
	Event<DataUpdateEvent> startEvent = new Event<DataUpdateEvent>(this, DataUpdateEvent.class,
																   DataUpdateEvent.UPDIN_StartMemoryStreamMode);
	try {
		if (!eventManager.validateEvent(startEvent))
			return false;
	} catch(EventProcessingException e) {
		return false;
	}
	
	// Memory stream is only possible in caching mode:
	DataFileSettings dfs = LiveGraph.application().getDataFileSettings(); 
	dfs.setDoNotCacheData(false);
	if (dfs.getDoNotCacheData())
		return false;
	
	// Make sure all previous events are processed:
	LiveGraph.application().eventManager().waitForEvents();
	
	synchronized (this) {
	
		// Close old reader and open memory stream reader:
		closeDataReader();
		resetCache(null);
		dataReader = new DataStreamReader(in);
		memoryStreamMode = true;
		eventManager.raiseEvent(startEvent);
		return true;
	}
}

public synchronized boolean endMemoryStreamMode() {
	
	// Validate switching:
	Event<DataUpdateEvent> endEvent = new Event<DataUpdateEvent>(this, DataUpdateEvent.class,
			   													 DataUpdateEvent.UPDIN_EndMemoryStreamMode);
	try {
		if (!LiveGraph.application().eventManager().validateEvent(endEvent))
			return false;
	} catch(EventProcessingException e) {
		return false;
	}

	// Close the memory stream reader:
	closeDataReader();
	memoryStreamMode = false;
	
	// Set the data file and cache mode according to the current settings:
	setDataFile(LiveGraph.application().getDataFileSettings().getDataFile());
	
	LiveGraph.application().eventManager().raiseEvent(endEvent);
	return true;
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
 * Validates (or not) settings event. When in "memory stream mode" this invoker will
 * not valudate changing of cache mode (all-data/tail-only or cache/dont-cache) or changing
 * the data file.
 * 
 * @param event The event to be validated.
 * @param soFar Whether {@code event} has been successfuly validated by whichever {@code EventListener}s
 * (if any) were invoked to validate {@code event} before this {@code EventListener}.
 * 
 * @return {@code false} if this invoker is in {@code memoryStreamMode} and if the event is of the types
 * {@code [DFS_DataFile, DFS_DoNotCacheData, DFS_ShowOnlyTailData, DFS_Load]}.
 * 
 * @see EventListener#checkEventValid(Event, boolean)
 */
public boolean checkEventValid(Event<? extends EventType> event, boolean soFar) {
	
	if (!memoryStreamMode)
		return true;
	
	EventType eventType = event.getType();
	if (SettingsEvent.DFS_DataFile == eventType
			|| SettingsEvent.DFS_DoNotCacheData == eventType
			|| SettingsEvent.DFS_ShowOnlyTailData == eventType
			|| SettingsEvent.DFS_Load == eventType) {
		
		synchronized(this) {
			if (memoryStreamMode)
				return false;
		}
	}
	
	return true;
}

/**
 * Processes events.
 * 
 * @param event Event to process.
 */
public void eventRaised(Event<? extends EventType> event) {
	
	if (null == event)
		return;
	
	if (event.getDomain() == SettingsEvent.class) {
		processSettingsEvent(event.cast(SettingsEvent.class));
	}
}

/**
 * When the application's settings change, this method is called in order
 * to update the internal state accordingly.
 * 
 * @param event Describes the change event.
 */
private void processSettingsEvent(Event<SettingsEvent> event) {

	switch(event.getType()) {
		
		case DFS_DataFile:			
			synchronized(this) {
				if (memoryStreamMode)  break;
				setDataFile((String) event.getInfoObject());
				resetCache(null);			
				requestUpdate();
			}
			break;
			
		case DFS_UpdateFrequency:
			setInterval(event.getInfoLong());
			break;
						
		case DFS_DoNotCacheData:			
			synchronized(this) {
				if (memoryStreamMode)  break;
				closeDataReader();
				if (!event.getInfoBoolean())
					resetCache(null);
			}
			break;
			
		case DFS_ShowOnlyTailData:
			synchronized(this) {
				if (memoryStreamMode)  break;
				DataCache.CacheMode newMode = (event.getInfoBoolean()
														? DataCache.CacheMode.CacheTailData
														: DataCache.CacheMode.CacheAllData);
				DataCache.CacheMode oldMode = (dataCache.getCacheMode());
				
				if (newMode != oldMode) {
					
					closeDataReader();
					resetCache(newMode);
					requestUpdate();
				}
			}
			break;
			
		case DFS_Load:
			synchronized(this) {
				if (memoryStreamMode)  break;
				DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
				setInterval(dfs.getUpdateFrequency());
				setDataFile(dfs.getDataFile());
				resetCache(dfs.getShowOnlyTailData()
											? DataCache.CacheMode.CacheTailData
											: DataCache.CacheMode.CacheAllData);
				requestUpdate();
			}
			break;
			
		default:
			break;
	}
}

/**
 * Objects of this class do not handle {@code eventProcessingFinished} notifications.
 * 
 * @param event Ignored.
 */
public void eventProcessingFinished(Event<? extends EventType> event) { }

/**
 * Objects of this class do not handle {@code eventProcessingException} notofications.
 * 
 * @param event Ignored. 
 * @param exception Never actually thrown.
 * @return {@code false}.
 */
public boolean eventProcessingException(Event<? extends EventType> event, EventProcessingException exception) {
	return false;
}

}  // public class UpdateInvoker
