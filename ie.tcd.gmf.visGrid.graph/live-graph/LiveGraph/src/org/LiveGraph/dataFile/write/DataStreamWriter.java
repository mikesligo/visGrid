package org.LiveGraph.dataFile.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.LiveGraph.dataFile.common.DataFormatTools.*;

/**
 * {@code DataStreamWriter} objects are used for writing files in the LiveGraph file format.
 * {@code DataStreamWriter} does not extend {@code java.io.Writer} because the structure
 * of the data being written is different and the making use of the methods published by
 * the standard API class would be counter-intuitive; however, {@code DataStreamWriter}
 * objects should be used in much the same manner as a normal {@code Writer} in an
 * application.<br /> 
 * <br />
 * The {@code DataStreamWriter} class provides methods for setting up the data file separator,
 * adding information lines and comments to the data file, defining the number of and the
 * labels for the data series and, eventually, for writing the data.<br />
 * Before any data is sent to the writer the data series should be set up with a series of
 * calls to {@link #addDataSeries(String)}. Once a dataset is written to the stream, no
 * more data series may be added.<br />
 * A dataset is written by a series of calls to one of the {@code setDataValue(...)}
 * methods. Calls to those methods do not cause any data to be written. Instead, the values
 * are associated with the appropriate data series and cached. In order to actually write the
 * data to the underlying stream the method {@link #writeDataSet()} must be invoked. It flushes
 * the cache to the data stream and prepares for the processing of the next dataset.<br />
 * In order to allow for concise code when using this class in applications, no methods
 * of {@code DataStreamWriter} throw any I/O exceptions. If an {@code IOException} is 
 * thrown by the underlying stream, it is immediately caught by this class. In order to
 * allow the application to nevertheless access and control the error handling, the methods
 * {@link #hadIOException()}, {@link #getIOException()} and {@link #resetIOException()} are
 * provided.<br/>
 * <br />
 * An example of how to use this class can be found in
 * {@link org.LiveGraph.demoDataSource.LiveGraphDemo}.<br />
 * 
 * <p>Here is a formal description of the file format produced by this class:</p>
 * <p>The LiveGraph API reads and stores data in text-based data files. The file format is
 * based on the widely used comma-separated-values (CSV) format. LiveGraph&prime;s file format
 * was defined in such a way that a standard CSV file will be accepted and correctly parsed
 * by the application (except that the very first data line might be interpreted as column
 * headings - see below).</p>
 * 
 * <p>The format definition is as follows:</p>
 * 
 * <p>1. <strong>File is character and line based</strong>.<br />
 * LiveGraph data files are text-files (i.e. not binary files). Files are read (written) on
 * a line-by-line basis. Only after a complete line was read and parsed (or written) will
 * the next line be considered.</p>
 * 
 * <p>2. <strong>Empty lines are ignored</strong>.<br />
 * Any empty line or a line containing only white spaces is ignored without any further
 * consequences.</p>
 * 
 * <p>3. <strong>Data values separator definition line</strong>.<br />
 * The first non-empty line in a LiveGraph data file may contain an <em>optional</em> data
 * values separator definition. A data values separator is a string which will separate data
 * values in data lines.<br />
 * A data values separator definition line must start and finish with the tag
 * &quot<samp>##</samp>&quot;. The entire string between the opening &quot<samp>##</samp>&quot;
 * and the closing &quot<samp>##</samp>&quot; will be the treated as the separator. For instance,
 * the line &quot<samp>##(*)##</samp>&quot; defines the data values separator
 * &quot<samp>(*)</samp>&quot;.<br />
 * A data values separator definition may not appear anywhere else than on the first non-empty
 * line of the data file.<br />
 * If the data values separator definition is omitted the default data values separator will be
 * the string &quot<samp>,</samp>&quot; (comma).</p>
 * 
 * <p>4. <strong>Comment lines</strong>.<br />
 * Any line where the first non-whitespace character is &quot<samp>#</samp>&quot; (except for
 * the data values separator definition line) is treated as a comment and is ignored. Note that
 * no comments may be placed before the optional data values separator definition line.</p>
 * 
 * <p>5. <strong>File information and description lines</strong>.<br />
 * Any line where the first non-whitespace character is &quot<samp>{@literal @}</samp>&quot; is treated as
 * a file information or description line. A file information line does not have any effect on
 * the interpretation of the data contained in the file; however, it may be used by a
 * processing application to provide information to the end-user.</p>
 * 
 * <p>6. <strong>Data series labels line</strong>.<br />
 * The first non-empty line in a data file which is not a data separator definition line or a
 * comment line or a file information line is treated as data series labels line. This line
 * defines the number and the labels of the data columns in the file. The line is split in
 * tokens using the data values separator. The number of tokens defines the number of data
 * columns in the file and the tokens define the labels of the columns. Note that the labels
 * might be empty strings. For example:</p>
 * 
 * <pre>
 *     ##;##
 *     {@literal @Example 1}
 *     ID;Age;;Height
 *     . . .
 * </pre>
 * <pre>
 *     {@literal @Example 2}
 *     ,ID;Height,Age,weight,
 *     . . .
 * </pre>
 * 
 * <p>In example 1 the data separator is defined to be &quot<samp>;</samp>&quot; (semicolon).
 * 4 data series are defined here: &quot<samp>ID</samp>&quot;, &quot<samp>Age</samp>&quot;,
 * &quot<samp></samp>&quot; and &quot<samp>Height</samp>&quot (note that the third series
 * label here is an empty string).<br />
 * In example 2 no data separator is defined, so the default separator &quot<samp>,</samp>&quot
 * (comma) is used. Note that &quot<samp>;</samp>&quot is not a separator in this case. This
 * gives 5 data series with the following labels: &quot<samp></samp>&quot,
 * &quot<samp>ID;Height</samp>&quot, &quot<samp>Age</samp>&quot, &quot<samp>weight</samp>&quot
 * and &quot<samp></samp>&quot. Note that the first and the last series labels are empty
 * strings. They are separated from the following (preceding) labels by the data separator.</p>
 * 
 * <p>7. <strong>Data lines</strong>.<br />
 * Any non-empty line after the series labels line which is not a comment line or a file
 * information line is treated as data values line. Data lines contain the actual data. They
 * are parsed into tokens in the same way as the data series labels line, which means that
 * some tokens may be empty strings. The LiveGraph API allows any string to be used as a token.
 * (Note that the plotter application converts each token to a double precision floating point
 * value; if a token is not a character string representing a valid decimal number, it will be
 * converted to a not-a-number floating point value. This is interpreted by the plotter as a
 * gap in the data series.) All data values on the same line are considered to belong to the
 * same dataset. The data series of each value in a given dataset is determined by comparing
 * the position index of the corresponding data token in the line to the number of the series
 * label token in the labels line.</p> 
 * 
 * <p>Here is an example data file:</p>
 * 
 * <pre>
 *     ##|##
 *     {@literal @File info for the user}
 *     {@literal @More info}
 *     #Comment
 *     Seconds|Dead mosquitos|Hungry frogs
 *     1|0|100
 *     600|1000|50
 *     1500|5000|0
 *     #Another comment
 * </pre>
 * <p>Here is another example:</p>
 * <pre>
 *     Seconds,Dead mosquitos,Hungry frogs
 *     1,0,100
 *     600,1000,50
 *     1500,5000,0
 * </pre>
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataStreamWriter.java</p> 
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
public class DataStreamWriter {

/**
 * Streat writer for printing to the output stream.
 */
private BufferedWriter out = null;

/**
 * Whether the data separator can still be changed. 
 */
private boolean canChangeSeparator = true;

/**
 * The currently used data values separator.
 */
private String separator = DefaultSeparator;


/**
 * Whether new data series can still be added. 
 */
private boolean canAddDataSeries = true;

/**
 * Holds the data series labels.
 */
private List<String> dataSeriesLabels = null;

/**
 * Holds the series index cursor within the current dataset. 
 */
private int currentSeriesIndex = 0;


/**
 * Values of the current dataset.
 */
private Map<String, String> dataCache = null;


/**
 * Raised IOException (if any).
 */
private IOException ioException = null;

private static File objFile;


/**
 * Creates a new data writer to write on the specified stream.
 * 
 * @param os The stream to the the data will be written.
 */
public DataStreamWriter(OutputStream os) {
	this.out = new BufferedWriter(new OutputStreamWriter(os));
	this.canChangeSeparator = true;
	this.separator = DefaultSeparator;
	this.canAddDataSeries = true;
	this.dataSeriesLabels = new ArrayList<String>();
	this.currentSeriesIndex = 0;	
	this.dataCache = new HashMap<String, String>();
	this.ioException = null;	
	this.objFile = null;
}


public DataStreamWriter(OutputStream os, File file) {
	this.out = new BufferedWriter(new OutputStreamWriter(os));
	this.canChangeSeparator = true;
	this.separator = DefaultSeparator;
	this.canAddDataSeries = true;
	this.dataSeriesLabels = new ArrayList<String>();
	this.currentSeriesIndex = 0;	
	this.dataCache = new HashMap<String, String>();
	this.ioException = null;	
	this.objFile = file;
}


/**
 * Closes the underlying output stream.
 * If any of the data values which have previously been cached by any of the
 * {@code setDataValue(...)}-methods are not written yet, they wre written to the stream before it is closed.
 * Once this method was invoken, no more data can be written. 
 */
public void close() {
	if (!dataCache.isEmpty())
		writeDataSet();
	try {		
		out.close();
	} catch (IOException e) {
		ioException = e;
	}
}

/**
 * Sets the separator between data columns and values. (Note - if the separator ends up being a substring
 * of any data series label or any data value, than the parsing will lead to undefined results including
 * possible unstable system behaviour).
 * 
 * @param sep The new separator.
 * @throws IllegalStateException If the separator cannot be changed because other data was already written.
 * @throws IllegalArgumentException If the specified separator is not allowed.
 * @see org.LiveGraph.dataFile.common.DataFormatTools#isValidSeparator(String)
 */
public void setSeparator(String sep) {
	if (!canChangeSeparator)
		throw new IllegalStateException("Separator cannot be changed any more");
	
	String problem = isValidSeparator(sep);
	if (null != problem)
		throw new IllegalArgumentException(problem);
	
	separator = sep;
}

/**
 * If a non-default separator was set it is written to the output stream, unless other data
 * was already written.
 */
private void checkWriteSeparatorDefinition() {
	
	if (!canChangeSeparator)
		return;
	
	canChangeSeparator = false;
	if (DefaultSeparator.equals(separator))
		return;
	try {
		out.write(TAGSepDefinition);
		out.write(separator);
		out.write(TAGSepDefinition);
		out.newLine();
		out.flush();
	} catch (IOException e) {
		ioException = e;
	}
}

/**
 * Writes data series label information to the output stream.
 */
private void checkWriteSeriesLabels() {
	
	if (!canAddDataSeries)
		return;
	
	canAddDataSeries = false;
	try {
		String sep = "";
		for (String label : dataSeriesLabels) {
			out.write(sep);
			out.write(label);
			sep = this.separator;
		}
		out.newLine();
		out.flush();
	} catch (IOException e) {
		ioException = e;
	}	
}

/**
 * Writes the specified comment to the output stream.
 * If a data values separator has been previously set, it is written to the stream before the comment line.
 * A sepataror may not be set after invoking this method.
 * 
 * @param comm A comment line.
 */
public void writeComment(String comm) {
	checkWriteSeparatorDefinition();
	try {
		out.write(TAGComment);
		out.write(comm.trim());
		out.newLine();
		out.flush();
	} catch (IOException e) {
		ioException = e;
	}
}

/**
 * Writes the specified information or file description line to the output stream.
 * If a data values separator has been previously set, it is written to the stream before the information line.
 * A sepataror may not be set after invoking this method.
 * 
 * @param info An information or file description line.
 */
public void writeFileInfo(String info) {
	checkWriteSeparatorDefinition();
	try {
		out.write(TAGFileInfo);
		out.write(info.trim());
		out.newLine();
		out.flush();
	} catch (IOException e) {
		ioException = e;
	}
}

/**
 * Checks whether this writer knows a data series with the specified label.
 * 
 * @param label A data series label.
 * @return {@code true} if a data series has been defined on this writer,
 * {@code false} otherwise.
 */
public boolean dataSeriesExists(String label) {
	return dataSeriesLabels.contains(label);
}


/**
 * Defines a new data series with the specified label for this writer. The data columns
 * representing the data series are placed in the order in which the data series have
 * been defined.
 *  
 * @param label Label for the new data series.
 * @throws NullPointerException If the label is {@code null}.
 * @throws IllegalStateException If no more data series may be defined because datasets
 * have already been written to the output stream.
 */
public void addDataSeries(String label) {
	if (null == label)
		throw new NullPointerException("Data series label may not be null");
	
	if (!canAddDataSeries)
		throw new IllegalStateException("Cannot add new data series at any more");
	
	label = label.trim();
	
	if (dataSeriesExists(label))
		return;
	
	dataSeriesLabels.add(label);
}

/**
 * Assigns the specified value to the specified data series in the current dataset.
 * 
 * @param seriesLabel Label of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 */
public void setDataValue(String seriesLabel, double value) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	dataCache.put(seriesLabel.trim(), Double.toString(value));
}

/**
 * Assigns the specified value to the data series at the specified index in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If {@code seriesIndex < 0} or if
 * {@code seriesIndex >= (number of data-series defined for this writer)}. 
 */
public void setDataValue(int seriesIndex, double value) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >= " + dataSeriesLabels.size()+")");
	dataCache.put(dataSeriesLabels.get(seriesIndex), Double.toString(value));
}

/**
 * Assigns the specified value to the next data series in the current dataset.
 * The "next"-pointer is reset each time a dataset is written to the stream.
 *  
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If there are no more data series defined for this writer.
 */
public void setDataValue(double value) {
	setDataValue(currentSeriesIndex++, value);	
}

/**
 * Assigns the specified value to the specified data series in the current dataset.
 * 
 * @param seriesLabel Label of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 */
public void setDataValue(String seriesLabel, float value) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	dataCache.put(seriesLabel.trim(), Float.toString(value));
}

/**
 * Assigns the specified value to the data series at the specified index in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If {@code seriesIndex < 0} or if
 * {@code seriesIndex >= (number of data-series defined for this writer)}. 
 */
public void setDataValue(int seriesIndex, float value) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >=" + dataSeriesLabels.size()+")");
	dataCache.put(dataSeriesLabels.get(seriesIndex), Float.toString(value));
}

/**
 * Assigns the specified value to the next data series in the current dataset.
 * The "next"-pointer is reset each time a dataset is written to the stream.
 *  
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If there are no more data series defined for this writer.
 */
public void setDataValue(float value) {
	setDataValue(currentSeriesIndex++, value);	
}

/**
 * Assigns the specified value to the specified data series in the current dataset.
 * 
 * @param seriesLabel Label of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 */
public void setDataValue(String seriesLabel, long value) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	dataCache.put(seriesLabel.trim(), Long.toString(value));
}

/**
 * Assigns the specified value to the data series at the specified index in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If {@code seriesIndex < 0} or if
 * {@code seriesIndex >= (number of data-series defined for this writer)}. 
 */
public void setDataValue(int seriesIndex, long value) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >=" + dataSeriesLabels.size()+")");
	dataCache.put(dataSeriesLabels.get(seriesIndex), Long.toString(value));
}

/**
 * Assigns the specified value to the next data series in the current dataset.
 * The "next"-pointer is reset each time a dataset is written to the stream.
 *  
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If there are no more data series defined for this writer.
 */
public void setDataValue(long value) {
	setDataValue(currentSeriesIndex++, value);	
}

/**
 * Assigns the specified value to the specified data series in the current dataset.
 * 
 * @param seriesLabel Label of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 */
public void setDataValue(String seriesLabel, int value) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	dataCache.put(seriesLabel.trim(), Integer.toString(value));
}

/**
 * Assigns the specified value to the data series at the specified index in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If {@code seriesIndex < 0} or if
 * {@code seriesIndex >= (number of data-series defined for this writer)}. 
 */
public void setDataValue(int seriesIndex, int value) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >=" + dataSeriesLabels.size()+")");
	dataCache.put(dataSeriesLabels.get(seriesIndex), Integer.toString(value));
}

/**
 * Assigns the specified value to the next data series in the current dataset.
 * The "next"-pointer is reset each time a dataset is written to the stream.
 *  
 * @param value A value to include in the current dataset.
 * @throws IllegalArgumentException If there are no more data series defined for this writer.
 */
public void setDataValue(int value) {
	setDataValue(currentSeriesIndex++, value);	
}

/**
 * Assigns the specified value to the specified data series in the current dataset.
 * 
 * @param seriesLabel Label of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset ({@code true} will be
 * converted to {@code 1} and {@code false} will be converted to {@code 0}).
 */
public void setDataValue(String seriesLabel, boolean value) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	dataCache.put(seriesLabel.trim(), value ? "1" : "0");
}

/**
 * Assigns the specified value to the data series at the specified index in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset ({@code true} will be
 * converted to {@code 1} and {@code false} will be converted to {@code 0}).
 * @throws IllegalArgumentException If {@code seriesIndex < 0} or if
 * {@code seriesIndex >= (number of data-series defined for this writer)}. 
 */
public void setDataValue(int seriesIndex, boolean value) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >=" + dataSeriesLabels.size()+")");
	dataCache.put(dataSeriesLabels.get(seriesIndex), value ? "1" : "0");
}

/**
 * Assigns the specified value to the next data series in the current dataset.
 * The "next"-pointer is reset each time a dataset is written to the stream.
 *  
 * @param value A value to include in the current dataset ({@code true} will be
 * converted to {@code 1} and {@code false} will be converted to {@code 0}).
 * @throws IllegalArgumentException If there are no more data series defined for this writer.
 */
public void setDataValue(boolean value) {
	setDataValue(currentSeriesIndex++, value);	
}

/**
 * Assigns the specified value to the specified data series in the current dataset.
 * 
 * @param seriesLabel Label of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset ({@code null} will be
 * converted to the empty string {@code ""}).
 */
public void setDataValue(String seriesLabel, String value) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	dataCache.put(seriesLabel.trim(), null == value ? "" : value);
}

/**
 * Assigns the specified value to the data series at the specified index in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the series to which {@code value} is to be assigned. 
 * @param value A value to include in the current dataset ({@code null} will be
 * converted to the empty string {@code ""}).
 * @throws IllegalArgumentException If {@code seriesIndex < 0} or if
 * {@code seriesIndex >= (number of data-series defined for this writer)}. 
 */
public void setDataValue(int seriesIndex, String value) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >=" + dataSeriesLabels.size()+")");
	dataCache.put(dataSeriesLabels.get(seriesIndex), null == value ? "" : value);
}

/**
 * Assigns the specified value to the next data series in the current dataset.
 * The "next"-pointer is reset each time a dataset is written to the stream.
 *  
 * @param value A value to include in the current dataset ({@code null} will be
 * converted to the empty string {@code ""}).
 * @throws IllegalArgumentException If there are no more data series defined for this writer.
 */
public void setDataValue(String value) {
	setDataValue(currentSeriesIndex++, value);	
}

/**
 * Gets the data value which has been previously associated with the specified data series in the
 * current dataset.
 * 
 * @param seriesLabel The label of the data series to query.
 * @return The data value which has been previously associated with the specified series in the
 * current dataset as a {@code String} or {@code null} if no value was associated with the specified
 * data series. 
 */
public String getDataValue(String seriesLabel) {
	if (null == seriesLabel)
		throw new NullPointerException("Data series label may not be null");
	return dataCache.get(seriesLabel.trim());
}

/**
 * Gets the data value which has been previously associated with the specified data series in the
 * current dataset.
 * 
 * @param seriesIndex Column index of the data series to query.
 * @return The data value which has been previously associated with the specified series in the
 * current dataset as a {@code String} or {@code null} if no value was associated with the specified
 * data series. 
 */
public String getDataValue(int seriesIndex) {
	if (0 > seriesIndex)
		throw new IllegalArgumentException("Series index may not be negative");
	if (dataSeriesLabels.size() <= seriesIndex)
		throw new IllegalArgumentException("Series index may not be >= number of data series (" + 
										   seriesIndex + " >=" + dataSeriesLabels.size()+")");
	
	return dataCache.get(dataSeriesLabels.get(seriesIndex));
}

/**
 * Writes the current dataset to the output stream.
 * If a data separator was explicitly defined and not yet written, it is written to the output stream
 * before the data.
 * If the data series (column) labels were not yet written, they are written to the output stream
 * before the data.
 * After invoking this method the data separator cannot be changed and no more new data series can be defined.
 */
public void writeDataSet() {
	checkWriteSeparatorDefinition();
	checkWriteSeriesLabels();
	try {
		String sep = "";
		String val = null;
		for (String label : dataSeriesLabels) {
			val = dataCache.get(label);
			if (null == val)
				val = "";
			out.write(sep);			
			out.write(val);
			sep = this.separator;
		}
		out.newLine();
		out.flush();
	} catch (IOException e) {
		ioException = e;
	}
	dataCache.clear();
	currentSeriesIndex = 0;
}

/**
 * Check whether a recent operation caused an {@code IOException}. 
 * @return {@code true} if an {@code IOException} was encountered after this writer was created or after
 * the last call to {@link #resetIOException()}, {@code false} otherwise.
 */
public boolean hadIOException() {
	return (null != ioException);
}

/**
 * Gets the last {@code IOException} encountered by this writer.
 * 
 * @return If {@link #hadIOException()} returns {@code true} - the last {@code IOException} encountered
 * by this writer, otherwise - {@code null}.
 */
public IOException getIOException() {
	return ioException;
}

/**
 * Deletes any internal state concerned with previously encountered {@code IOException}s.
 *
 */
public void resetIOException() {
	ioException = null;
}


public static File getObjFile() {
	return objFile;
}


public static void setObjFile(File objFile) {
	DataStreamWriter.objFile = objFile;
}

} // public class DataStreamWriter
