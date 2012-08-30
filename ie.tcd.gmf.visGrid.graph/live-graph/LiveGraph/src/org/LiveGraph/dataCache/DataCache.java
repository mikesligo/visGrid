package org.LiveGraph.dataCache;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventProcessingException;
import org.LiveGraph.events.EventProducer;
import org.LiveGraph.events.EventType;


import com.softnetConsult.utils.collections.NullIterator;
import com.softnetConsult.utils.collections.ReadOnlyIterator;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;


/**
 * An instance of this class caches datasets previously read from a data file in memory.
 * The cache applies a smart procedure to cache just enough data in order to plot a graph
 * on the screen. Two cache modes are currently possible: {@code CacheTailData} and
 * {@code CacheAllData}. In the first case the data sets added most recently are
 * cached (and ultimately displayed bythe plotter). In the latter case all datasets are
 * cached. If the number of datasets grows too large, the datasets located at odd indices in
 * the original data file will be deleted from the cache.
 * After this only datasets located at even indices in the original file will be cached.
 * If the cache grows too large again, this procedure is re-applied such that only datasets
 * at indices divisible by 4 in the original file are cached. As more datasets are added to the
 * cache, this procedure can be re-applied again making sure that at any time the original data
 * file is sampled at equal intervals.<br />
 * The maximum cache size is {@code CACHE_SIZE}.  
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007 by G. Paperin.</p>
 * <p>File: DataCache.java</p>
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
public class DataCache implements EventProducer {

/**
 * Maximum number if datasets to be held in memory.
 */
public static final int CACHE_SIZE = 500;


/**
 * Maximum number of delayed events during a bulk operation before the listeners are brought up to date.
 */
public static final int MAX_DELAYED_EVENTS = 1000;

/**
 * Number of datasets to always keep in memory when operating in {@code CacheTailData}-mode.
 */
public static final int TAIL_BALANCE_SIZE = (int) (0.75 * (double) CACHE_SIZE);

/**
 * Defines possible cache modes.
 * {@code CacheAllData} specifies that all datasets ever added to this cache must be sampled
 * at equal intervals. {@code CacheTailData} specifies that only the most recently datasets
 * are to be kept in memory.
 */
public static enum CacheMode { CacheAllData, CacheTailData };


/**
 * Stores the desctibtion of the data series in this cache. A data series corresponds to a column
 * in a data file.
 */
private List<DataSeries> dataSeries = null;

/**
 * Stores the data in this cache.
 */
private List<DataSet> dataSets = null;

/**
 * Current operating mode.
 */
private CacheMode currentMode = null;

/**
 * When working in {@code CacheAllData}-mode this value determines which datasets are kept in memory.
 * At any time, exactly the datasets for which {@link DataSet#getDataFileIndex()} returns a value that
 * can be divided by {@code dispersalFactor} without remainder will be kept in the cache. 
 */
private int dispersalFactor = 1;

/**
 * Caches the data file info lines.
 */
private List<String> dataFileInfo = null;

/**
 * Caches the smallest data value currently in the cache.
 */
private double minValueCached = Double.NaN;

/**
 * Caches the largest data value currently in the cache.
 */
private double maxValueCached = Double.NaN;

/**
 * Stores occured cache events when operating in the delayed mode.
 */
private Set<CacheEvent> delayedEvents = null;

/**
 * Whether the cache events are being delayed. 
 */
private boolean delayEvents = false;

/**
 * Number of events that has been delayed during the current bulk operation.
 */
private int countDelayedEvents = 0;

/**
 * Creates a new data cache in the {@code CacheAllData}-mode.
 *
 */
public DataCache() {
	this.delayedEvents = EnumSet.noneOf(CacheEvent.class);
	this.delayEvents = false;
	this.countDelayedEvents = 0;
	this.resetCache(CacheMode.CacheAllData);
}

/**
 * Creates a new cache in the specified mode.
 * 
 * @param mode Mode of the new cache.
 */
public DataCache(CacheMode mode) {
	this();	
	this.resetCache(mode);
}

/**
 * Creates a new cache in a specified mode and initilises it for the specified data series.
 * 
 * @param mode Mode to use.
 * @param seriesLabels Names of the data series.
 */
public DataCache(CacheMode mode, List<String> seriesLabels) {
	this();	
	resetCache(mode, seriesLabels);
}

/**
 * Creates a new cache in a specified mode and initilises it for the specified data series.
 * 
 * @param mode Mode to use.
 * @param seriesLabels Names of the data series.
 */
public DataCache(CacheMode mode, String [] seriesLabels) {
	this(mode, Arrays.asList(seriesLabels));
}

/**
 * Removes all data from this cache and resets is to the empty state.
 */
public void resetCache() {
	resetLabels();
	resetData();
	resetDataFileInfo();
}

/**
 * Removes all data from this cache and resets is to the empty state.
 * 
 * @param mode The mode the cache will have after the reset.
 */
public void resetCache(CacheMode mode) {
	resetLabels();
	resetData(mode);
	resetDataFileInfo();
}

/**
 * Removes all data from this cache and resets is to the empty state.
 * New data series are set up according to the specified labels.
 * 
 * @param mode The mode the cache will have after the reset.
 * @param seriesLabels The data series labels for the reset cache
 */
public void resetCache(CacheMode mode, List<String> seriesLabels) {
	resetLabels(seriesLabels);
	resetData(mode);
	resetDataFileInfo();
}

/**
 * Removes all data series informatioon from the cache without deleting the actual data.
 */
public void resetLabels() {	
	List<String> l = Collections.emptyList();
	resetLabels(l);
}

/**
 * Removes all data series informatioon from the cache and replaces is with new empty series.
 * Actual data is not affected.
 * 
 * @param seriesLabels Labels for the new data series.
 */
public void resetLabels(List<String> seriesLabels) {
	
	if (null == seriesLabels)
		throw new NullPointerException("Series labels array cannot be null"); 
	
	dataSeries = new ArrayList<DataSeries>(seriesLabels.size());
	int index = 0;
	for (String label : seriesLabels) {
		dataSeries.add(new DataSeries(label, this, index));
		index++;
	}
	
	fireEvent(CacheEvent.CACHE_UpdatedLabels);
}

/**
 * Resets the cache while keeping the same operating mode.
 * All data is deleted.
 */
public void resetData() {
	resetData(currentMode);
}

/**
 * Resets the cache to the specified mode. All data is deleted.
 * 
 * @param mode New operating mode.
 */
public void resetData(CacheMode mode) {
	
	if (null == mode)
		throw new NullPointerException("Cache mode cannot be null");
	
	if (null != dataSets) {
		dataSets.clear();
		dataSets = null;
	}
	
	currentMode = mode;
	
	resetExtremeValues();
	
	switch (currentMode) {
		case CacheAllData:	dataSets = new RemoveRangeArrayList<DataSet>(CACHE_SIZE);
							dispersalFactor = 1;
							break;
							
		case CacheTailData:	dataSets = new RemoveRangeArrayList<DataSet>(CACHE_SIZE);
							dispersalFactor = 1;
							break;
		
		default:
			throw new UnexpectedSwitchCase(currentMode);
	}
	
	fireEvent(CacheEvent.CACHE_ChangedMode);
	fireEvent(CacheEvent.CACHE_UpdatedData);
}

/**
 * Delets the information of min and max values held by this cache and any of its data series.
 *
 */
private void resetExtremeValues() {
	minValueCached = Double.NaN;
	maxValueCached = Double.NaN;
	for (DataSeries s : dataSeries)
		s.resetExtremeValues();
}

/**
 * Delets all data file info strings held by this cache.
 *
 */
public void resetDataFileInfo() {
	this.dataFileInfo = new ArrayList<String>();
	fireEvent(CacheEvent.CACHE_UpdatedDataFileInfo);
}

/**
 * @return Current operating mode.
 */
public CacheMode getCacheMode() {
	return currentMode;
}

/**
 * @return Number of data series in the cache (i.e. data columns in the data file).
 */
public int countDataSeries() {
	return dataSeries.size();
}

/**
 * @return a Read-olny iterator over this cache's data series.
 */
public ReadOnlyIterator<DataSeries> iterateDataSeries() {
	return new ReadOnlyIterator<DataSeries>(dataSeries.iterator());
}

/**
 * @param index Data series number (0-based).
 * @return The data series at the specified index.
 */
public DataSeries getDataSeries(int index) {
	return dataSeries.get(index);
}

/**
 * @return An read-only iterator over the labels of the data series in this cache.
 */
public ReadOnlyIterator<String> iterateDataSeriesLabels() {
	return new DataSeriesLabelIterator(dataSeries.iterator());
}

/** 
 * @param label A data series label.
 * @return The index of the series with the specified label or -1 if not found.
 */
public int findDataSeriesIndex(String label) {
	int index = 0;
	ReadOnlyIterator<String> it = iterateDataSeriesLabels();
	while (it.hasNext()) {				
		if (it.next().equals(label))
			return index;
		index++;
	}
	return -1;
}

/** 
 * @param label A data series label.
 * @param ignoreCase Whether case shuld be ignore in string comparison. 
 * @return The index of the series with the specified label or -1 if not found.
 */
public int findDataSeriesIndex(String label, boolean ignoreCase) {
	int index = 0;
	ReadOnlyIterator<String> it = iterateDataSeriesLabels();
	while (it.hasNext()) {		
		if (ignoreCase && it.next().equalsIgnoreCase(label))
			return index;
		if (!ignoreCase && it.next().equals(label))
			return index;
		index++;
	}
	return -1;
}

/**
 * @return Number of datasets currently in cache.
 */
public int countDataSets() {
	return dataSets.size();
}

/**
 * @return Read-only iterator over the datasets in this cache.
 */
public ReadOnlyIterator<DataSet> iterateDataSets() {
	return new ReadOnlyIterator<DataSet>(dataSets.iterator());
}

/**
 * @param cacheIndex Cache-index of a dataset.
 * @return Dataset at the specified index.
 */
public DataSet getDataSet(int cacheIndex) {
	return dataSets.get(cacheIndex);
}

/**
 * @return Smallest value currently in the cache or {@code Double.NaN} if the cache is empty.
 */
public double getMinValueCached() {
	return minValueCached;
}

/**
 * @return Largest value currently in the cache or {@code Double.NaN} if the cache is empty.
 */
public double getMaxValueCached() {
	return maxValueCached;
}

/**
 * @return The index which the first dataset in this chache had in the original datafile.
 */
public int getMinDataFileIndex() {
	try {
		return dataSets.get(0).getDataFileIndex();
	} catch (IndexOutOfBoundsException e) {
		return 0;
	} catch (NullPointerException e) {
		return 0;
	}
}

/**
 * @return The index that the last dataset in this chache had in the original datafile.
 */
public int getMaxDataFileIndex() {
	try {
		return dataSets.get(dataSets.size() - 1).getDataFileIndex();
	} catch (IndexOutOfBoundsException e) {
		return 0;
	} catch (NullPointerException e) {
		return 0;
	}
}

/**
 * @param dataFileIndex An index in the original datafile.
 * @return A dataset which was located at the specified index in the original data file, or {@code null}
 * if there is no such dataset in the cache.
 */
public DataSet findDataSet(int dataFileIndex) {
	int cacheIndex = Collections.binarySearch(dataSets, dataFileIndex);
	if (cacheIndex < 0)
		return null;
	if (cacheIndex >= dataSets.size())
		return null;
	DataSet ds = getDataSet(cacheIndex);
	if (ds.getDataFileIndex() != dataFileIndex)
		return null;
	return ds;
}

/**
 * Adds a specified dataset to this cache.
 * @param ds A dataset.
 */
public void addDataSet(DataSet ds) {
	
	// Ignore null datasets:
	if (null == ds)
		return;
	
	// Add dataset according to the current cache mode:
	boolean reallyAdded = false;
	switch (currentMode) {
		case CacheAllData:	reallyAdded = addDataSet_AllDataMode(ds);
							break;
		case CacheTailData:	reallyAdded = addDataSet_TailDataMode(ds);
							break;
	}
	
	// If the dataset has not actually been cached, there is nothing more to so:
	if (!reallyAdded)
		return;
	
	// Update min- and max-caches:
	includeExtremeValues(ds);
	
	// Notify listeners:
	fireEvent(CacheEvent.CACHE_UpdatedData);
}

/**
 * Updates the internal state of this cache and its data series to include the min and max
 * values of the specified dataset.
 * @param ds A dataset.
 */
private void includeExtremeValues(DataSet ds) {
	
	for (int s = 0; s < dataSeries.size(); s++) {
		
		double val = ds.getValue(s);
		
		if (Double.isNaN(val) || Double.isInfinite(val))
			continue;
		
		if (val < minValueCached || Double.isNaN(minValueCached))
			minValueCached = val;
		
		if (val > maxValueCached || Double.isNaN(maxValueCached))
			maxValueCached = val;
		
		dataSeries.get(s).includeExtremeValue(val);
	}
}

/**
 * Adds a dataset when cache is in {@code AllDataMode}.
 * @param ds A dataset.
 * @return Whether the dataset was actually added.
 */
private boolean addDataSet_AllDataMode(DataSet ds) {
	
	if (0 != (ds.getDataFileIndex() % dispersalFactor))
		return false;
	
	if (CACHE_SIZE > dataSets.size()) {
		dataSets.add(ds);
		return true;
	}
	
	increaseDispersalFactor();
	return addDataSet_AllDataMode(ds);
}

/**
 * Increases the value which must divide datafile indices of all cached datasets without remainder.
 * Datasets with the wrong datafile indices are removed from the cache and the cache indices are updated.
 * This method is used to compact the cache in {@code AllDataMode}-mode.
 */
private void increaseDispersalFactor() {
	
	// Remove every second dataset:
	int i = 0;
	boolean remove = false;
	while (i < dataSets.size()) {
		if (remove)
			dataSets.remove(i);
		else
			i++;
		remove = !remove;
	}
	
	if (dataSets instanceof ArrayList)	
		((ArrayList) dataSets).ensureCapacity(CACHE_SIZE);
	
	// Increase dispersal factor:
	dispersalFactor *= 2;
	
	// Rebuild the extreme values cache:
	resetExtremeValues();
	for (DataSet ds : dataSets)
		includeExtremeValues(ds);
}

/**
 * Adds a dataset when cache is in {@code TailDataMode}.
 * @param ds A dataset.
 * @return {@code true}.
 */
private boolean addDataSet_TailDataMode(DataSet ds) {
	
	if (CACHE_SIZE > dataSets.size()) {
		dataSets.add(ds);
		return true;
	}
	
	removeDatalistHead();
	return addDataSet_TailDataMode(ds);
}

/**
 * Removes the oldest datasets in this cache.
 * This method is used to compact the cache in {@code AllDataMode}-mode.
 */
private void removeDatalistHead() {
	
	// Remove datasets wich were cached the longes time ago:
	
	if (dataSets instanceof RemoveRangeArrayList) {
		((RemoveRangeArrayList) dataSets).removeRangeint(0, CACHE_SIZE - TAIL_BALANCE_SIZE);
		
	} else {
		while (TAIL_BALANCE_SIZE > dataSets.size())
			dataSets.remove(0);
	}
	
	if (dataSets instanceof ArrayList)
		((ArrayList) dataSets).ensureCapacity(CACHE_SIZE);
	
	// Rebuild the extreme values cache:
	resetExtremeValues();
	for (DataSet ds : dataSets)
		includeExtremeValues(ds);
}

/**
 * Caches info on the data file.
 * @param info File info.
 */
public void addDataFileInfo(String info) {
	this.dataFileInfo.add(info);
	fireEvent(CacheEvent.CACHE_UpdatedDataFileInfo);
}

/**
 * @return A list of all caches data file info strings.
 */
public List<String> listDataFileInfo() {
	return Collections.unmodifiableList(dataFileInfo);
}

/**
 * @return The data file info where all cached info strings are separated by new-lines and
 * concatenated into a single string.
 */
public String getDataFileInfo() {
	
	StringWriter s = new StringWriter();
	PrintWriter w = new PrintWriter(s);
	for (String infoLine : dataFileInfo)
		w.println(infoLine);
	
	w.close();
	return s.toString();
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


/**
 * Notifies the observers of a specified event. If this cache is currently in {@code delayEvents}
 * mode, the observers are not notified and the event is cached. However, even in the
 * {@code delayEvents}-mode, if the number of events delayed so far exceeds {@link #MAX_DELAYED_EVENTS},
 * all events delayed so far <em>are</em> fired - this ensured that listeners are brought up to date
 * from time to time during very long bulk operations.
 * @param eventType An event type.
 */
private void fireEvent(CacheEvent eventType) {
	
	if (null == eventType)
		return;
	
	if (!delayEvents) {
		raiseEvent(eventType);
		return;
	}
			
	delayedEvents.add(eventType);
	countDelayedEvents++;
	if (countDelayedEvents > MAX_DELAYED_EVENTS)
		raiseDelayedEvents();
}

/**
 * Notifies the observers of an event of a specified type.
 * 
 * @param eventType Type of event to raise;
 */
private void raiseEvent(CacheEvent eventType) {
	Event<CacheEvent> event = new Event<CacheEvent>(this, CacheEvent.class, eventType);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * When this method is invoked the cache enters the {@code delayEvents}-mode;
 * while in this mode events are not supplied to observers, instead they are cached
 * and fired only when {@code fireDelayedEvents} is invoked. This is can be useful
 * when the cache is modified several times in one go. In such case the notification
 * of observers can be consolidated which might save processing similar events many times.
 * 
 * @see #bulkOperationCompleted()
 */
public void bulkOperationStart() {
	if (!delayedEvents.isEmpty())
		raiseDelayedEvents();
	delayEvents = true;
}

/**
 * Ends the {@code delayEvents}-mode and returns in the normal observable mode;
 * all events cached while in that mode are fired. However, each type of event
 * is fired at most once. The order in which the events are fires is unspecified
 * and might not correspond to the order in which the events actually occured.  
 */
public void bulkOperationCompleted() {
	if (!delayEvents)
		return;
	delayEvents = false;
	raiseDelayedEvents();
}

/**
 * Raises all events delayed so far during a buld operation:
 */
private void raiseDelayedEvents() {
	
	// We want to fire the events in this particular order:
	
	if (delayedEvents.contains(CacheEvent.CACHE_ChangedMode))
		raiseEvent(CacheEvent.CACHE_ChangedMode);
		
	if (delayedEvents.contains(CacheEvent.CACHE_UpdatedDataFileInfo))
		raiseEvent(CacheEvent.CACHE_UpdatedDataFileInfo);
	
	if (delayedEvents.contains(CacheEvent.CACHE_UpdatedLabels))
		raiseEvent(CacheEvent.CACHE_UpdatedLabels);
	
	if (delayedEvents.contains(CacheEvent.CACHE_UpdatedData))
		raiseEvent(CacheEvent.CACHE_UpdatedData);
	
	// This is only required in case we forgot an event type:
	for (CacheEvent eventType : delayedEvents) {
		if (CacheEvent.CACHE_ChangedMode != eventType
				&& CacheEvent.CACHE_UpdatedDataFileInfo != eventType 
				&& CacheEvent.CACHE_UpdatedLabels != eventType
				&& CacheEvent.CACHE_UpdatedData != eventType) {
			raiseEvent(eventType);
		}
	}
	
	delayedEvents.clear();
	countDelayedEvents = 0;
}

/**
 * A {@code ArrayList} which publicly publishes its {@code removeRangeint} method.
 * @param <E> Any class.
 */
private class RemoveRangeArrayList<E> extends ArrayList<E> {
	public RemoveRangeArrayList() { super(); }
	public RemoveRangeArrayList(int initialCapacity) { super(initialCapacity); }
	public void removeRangeint(int fromIndex, int toIndex) { super.removeRange(fromIndex, toIndex); }
} // private class RemoveRangeArrayList<E>

/**
 * A read-only iterator for data series labels.
 */
private class DataSeriesLabelIterator extends ReadOnlyIterator<String> {
	private Iterator<DataSeries> iterator = null;
	
	public DataSeriesLabelIterator(Iterator<DataSeries> iter) {
		super(NullIterator.getSingeltonInstance(String.class));
		iterator = iter;
	}
	
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}
	
	@Override
	public String next() {
		return iterator.next().getLabel();
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Cannot use this iterator to remove items.");	    
	}
} // class DataSeriesLabelIterator

} // class DataCache
