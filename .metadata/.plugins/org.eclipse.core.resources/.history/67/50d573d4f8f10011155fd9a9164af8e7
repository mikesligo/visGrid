package org.LiveGraph.dataCache;

import java.util.Iterator;

import com.softnetConsult.utils.collections.NullIterator;
import com.softnetConsult.utils.collections.ReadOnlyIterator;


/**
 * Repsesents a data series inside the cache; stores all series specific information
 * and provides convenience methods for accessing that information. A data series
 * usually cossesponds to a data column inside a data file. 
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007 by G. Paperin.</p>
 * <p>File: DataSeries.java</p>
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
public class DataSeries {

/**
 * Serien name/label.
 */
private String label = null;

/**
 * The cache in which the data of this series is stored.
 */
private DataCache adminCache = null;

/**
 * The (0 based) index of this series' data in the cache.
 */
private int seriesIndexInCache = -1;

/**
 * Min data value in this series.
 */
private double minValue = Double.NaN;

/**
 * Max data value in this series.
 */
private double maxValue = Double.NaN;

/**
 * The constructor.
 * 
 * @param label Series label.
 * @param adminCache The cache adminestering the data.
 * @param seriesIndexInCache The index of this series in the cache.
 */
/*package*/ DataSeries(String label, DataCache adminCache, int seriesIndexInCache) {
	this.label = label;
	this.adminCache = adminCache;
	this.seriesIndexInCache = seriesIndexInCache;
	resetExtremeValues();
}

/**
 * @return This series' name / label.
 */
public String getLabel() {
	return label;
}

/**
 * @return The cache holding the data of this series.
 */
public DataCache getAdministratingCache() {
	return adminCache;
}

/**
 * @return The series' data index in the cache. 
 */
public int getSeriesIndexInCache() {
	return seriesIndexInCache;
}

/**
 * @return Number of datasets the cache currently holds for this series.
 */
public int countDataSets() {
	return adminCache.countDataSets();
}

/**
 * @return A read-only iterator over the data values of this series currently held in cache.
 */
public ReadOnlyIterator<Double> iterateDataValues() {
	
	return new DataValuesIterator(adminCache.iterateDataSets(), seriesIndexInCache);
}

/**
 * @param cacheIndex A cache index of a dataset.
 * @return This series' dataset the held at the specified index in the cache.
 */
public double getDataValue(int cacheIndex) {
	return adminCache.getDataSet(cacheIndex).getValue(seriesIndexInCache);
}

/**
 * @param cacheIndex A cache index of a dataset.
 * @return The index in the original file of the dataset at the specified cache index.
 */
public int getDatasetFileIndex(int cacheIndex) {
	return adminCache.getDataSet(cacheIndex).getDataFileIndex();
}

/**
 * @param dataFileIndex An data row index of the original data file. 
 * @return The data value of this series' dataset which was located at the specified
 * index in the original data file; if that dataset is not in the cache, this method
 * returns {@link DataSet#returnValueForIllegalIndex}.doubleValue(). 
 */
public double findDataValue(int dataFileIndex) {
	
	DataSet ds = adminCache.findDataSet(dataFileIndex);
	
	if (null == ds)
		return DataSet.returnValueForIllegalIndex.doubleValue();
	
	return ds.getValue(seriesIndexInCache);
}

/**
 * @param val Makes sure that min and max value caches of this series include the
 * specified value.
 */
/*package*/ void includeExtremeValue(double val) {
	
	if (Double.isNaN(val) || Double.isInfinite(val))
		return;
	
	if (val < minValue || Double.isNaN(minValue) )
		minValue = val;
	
	if (val > maxValue || Double.isNaN(maxValue))
		maxValue = val;
}

/**
 * @return The smallest data value of this series or {@code Double.NaN} if this series
 * is empty.  
 */
public double getMinValue() {
	return minValue;
}

/**
 * @return The largest data value of this series or {@code Double.NaN} if this series
 * is empty.  
 */
public double getMaxValue() {
	return maxValue;
}

/**
 * Resets the min and max value caches for this series.
 */
/*package*/ void resetExtremeValues() {
	minValue = Double.NaN;
	maxValue = Double.NaN;
}

/**
 * A read-only iterator over the data values of a series.
 */
private class DataValuesIterator extends ReadOnlyIterator<Double> {

	private Iterator<DataSet> iterator = null;
	private int seriesIndexInCache = -1;
	
	public DataValuesIterator(Iterator<DataSet> iter, int seriesIndexInCache) {
		super(NullIterator.getSingeltonInstance(Double.class));
		this.iterator = iter;
		this.seriesIndexInCache = seriesIndexInCache;
	}
	
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}
	
	@Override
	public Double next() {
		return iterator.next().getValue(seriesIndexInCache);
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Cannot use this iterator to remove items.");	    
	}

} // class DataSeriesLabelIterator

} // class DataSeries
