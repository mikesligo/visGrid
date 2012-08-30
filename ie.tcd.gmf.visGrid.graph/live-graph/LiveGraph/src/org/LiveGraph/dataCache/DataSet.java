package org.LiveGraph.dataCache;

import java.util.List;

/**
 * This class defines a dataset and encapsulates related data; a dataset holds one
 * data value for each of the data series held in the cache and corresponds to a data
 * row in the underlying data file.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataSet.java</p> 
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
public class DataSet implements Comparable<Integer> {

/**
 * Possible default return values; a default return value is used when a dataset
 * is queried for a value at an invalid index or when the index was valid, but
 * corresponding value in the underlying data file could not be interpreted as a
 * legal data value. 
 */
public static enum DefRetValue {

	NotANum(Double.NaN), Zero(0.0), MinusOne(-1.0), One(1.0);

	private double actualValue = Double.NEGATIVE_INFINITY;
	private DefRetValue(double actVal) { actualValue = actVal; }
	public double doubleValue() { return actualValue; }
} // enum DefRetValue

/**
 * The currently used default rteturn value. A default return value is used when a dataset
 * is queried for a value at an invalid index or when the index was valid, but
 * corresponding value in the underlying data file could not be interpreted as a
 * legal data value. 
 */
public static DefRetValue returnValueForIllegalIndex = DefRetValue.NotANum;

/**
 * Values of this dataset.
 */
private Double [] values = null;

/**
 * The index of the data row represented by this dataset in the original file.
 * The file index applies to datasets only. For instance, the first data row
 * in a file will have {@code dataFileIndex = 0}, although it will probably
 * not be the very first row in the file because several comment and info rows
 * as well as a column label might preceed it. 
 */
private int dataFileIndex = -1;

/**
 * Constructor.
 * @param values Dava values for this set.
 * @param dataFileIndex The dafa file index of this set.
 * @see #dataFileIndex
 */
public DataSet(List<Double> values, int dataFileIndex) {
	this.dataFileIndex = dataFileIndex;
	this.values = new Double[values.size()];
	values.toArray(this.values);	
}

/**
 * Constructor.
 * @param values Dava values for this set.
 * @param dataFileIndex The dafa file index of this set.
 * @see #dataFileIndex
 */
public DataSet(double [] values, int dataFileIndex) {
	this.dataFileIndex = dataFileIndex;
	this.values = new Double[values.length];
	int i = 0;
	for (double v : values)
		this.values[i++] = new Double(v);	
}

/**
 * Constructor.
 * @param values Dava values for this set.
 * @param dataFileIndex The dafa file index of this set.
 * @see #dataFileIndex
 */
public DataSet(Double [] values, int dataFileIndex) {
	this.dataFileIndex = dataFileIndex;
	this.values = new Double[values.length];	
	System.arraycopy(values, 0, this.values, 0, values.length);	
}

/**
 * @return The index of the data row represented by this dataset in the original file.
 * (The file index applies to datasets only. For instance, the first data row
 * in a file will have {@code dataFileIndex = 0}, although it will probably
 * not be the very first row in the file because several comment and info rows
 * as well as a column label might preceed it.) 
 */
public int getDataFileIndex() {
	return dataFileIndex;
}

/**
 * Compares this set with an integer on the basis on the set's {@link #dataFileIndex}.
 * @param dataFileIndex An integer representing a potential data file index.
 * @return A value {@code < 0} if this dataset preceeded the specified index in the data file;
 * a value {@code > 0} if this dataset followed the specified index in the data file;
 * {@code 0} if this dataset was located at specified index in the data file.
 * @see #dataFileIndex
 */
public int compareTo(Integer dataFileIndex) {
	return this.getDataFileIndex() - dataFileIndex;
}

/**
 * @param seriesIndex A data series index (0 based data column number).
 * @return The data values at the specified index.
 */
public double getValue(int seriesIndex) {
	try {
		Double val = values[seriesIndex];
		if (null == val)
			return returnValueForIllegalIndex.doubleValue();
		return val.doubleValue();
	} catch (ArrayIndexOutOfBoundsException e) {
		if (seriesIndex < 0)
			throw e;
		return returnValueForIllegalIndex.doubleValue();
	}
}

/**
 * @return A string representation of this dataset.
 */
@Override 
public String toString() {
	StringBuffer buf = new StringBuffer();
	buf.append("{");
	buf.append(Integer.toString(getDataFileIndex()));
	buf.append(": ");
	buf.append("(");
	for (int i = 0; i < values.length; i++) {
		if (0 < i)
			buf.append(", ");
		buf.append(Double.toString(getValue(i)));
	}
	buf.append(")");
	buf.append("}");
	return buf.toString();
}

} // class DataSet
