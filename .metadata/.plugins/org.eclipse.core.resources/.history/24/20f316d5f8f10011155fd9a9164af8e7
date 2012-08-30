package org.LiveGraph.extras.synchParser;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.LiveGraph.dataFile.common.DataFormatException;
import org.LiveGraph.dataFile.read.DataStreamObserver;
import org.LiveGraph.dataFile.read.DataStreamReader;
import org.LiveGraph.extras.synchParser.SynchronousDataStreamParser.ParsedLine.LineType;


/**
 * A synchronous parser for LiveGraph data files.
 * 
 * <p>The preferred way for an application ro read a LiveGraph data file is to create
 * a {@link DataStreamReader}, which is a stateful call-back parser for such files.
 * An application can register a number of {@link DataStreamObserver} objects with the
 * call-back parser in order to be notified whenever the parser has read any meaningful
 * data from the associated input stream. However, under specific circumstances, this
 * asynchronous way of parsing may by unsuitable or inconvenient for some 3rd party
 * applications.</p>
 * 
 * <p>This class warps around an instance of {@code DataStreamReader} in order to provide
 * a synchronous data input stream parser for a LiveGraph data stream. It provides a single
 * method - {@code parseLine()} - that reads and processes a single non-empty line from the
 * associated input stream. In addition this class provides a number of methods to communicate
 * with the wraped {@code DataStreamReader} instance, in particular an interface to manage
 * additional {@link DataStreamObserver} objects that can be used to receive the data parsed
 * by this parser in the common way.</p>
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: SynchronousDataStreamParser.java</p> 
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
 * @author Greg Paperin (http://www.paperin.org)
 * @version {@value org.LiveGraph.LiveGraph#version}
 * 
 * @see DataStreamReader
 * @see DataStreamObserver
 */
public class SynchronousDataStreamParser implements Closeable {


/**
 * The reader used to parse the input stream.
 */
private DataStreamReader reader;


/**
 * The internal data receiver for the call-back parser.
 */
private SynchronousDataStreamParser.DataReceiver receiver;


/**
 * Stores the information about the most recently parsed line.
 */
private ParsedLine parsedLine;


/**
 * Caches the data series labels for this parser's data stream. 
 */
private List<String> seriesLabels;


/**
 * Creates a new LiveGraph data parser for the specified input stream.
 * 
 * @param is The stream to read from.
 */
public SynchronousDataStreamParser(InputStream is) {
	this.receiver = new SynchronousDataStreamParser.DataReceiver();
	this.reader = new DataStreamReader(is, this.receiver);
	this.parsedLine = null;
	this.seriesLabels = null;
}


/**
 * Adds an observer to this parser.
 * This method passes directly through to the underlying {@link DataStreamReader} object.
 * 
 * @param observer The observer to add.
 * @return {@code false} if the specified observer cound not be added because it was
 * already registered, {@code true} otherwise.
 * @see DataStreamReader#addObserver(DataStreamObserver)
 */
public boolean addObserver(DataStreamObserver observer) {
	return reader.addObserver(observer);
}


/**
 * Closes the underlying asynchronous parser and therefore the underlying data stream.
 * Further reading is not possible after calling this method.
 * This method passes directly through to the underlying {@link DataStreamReader} object.
 * 
 * @throws IOException If an I/O error occurs.
 * @see DataStreamReader#close()
 */
public void close() throws IOException {
	reader.close();
}


/**
 * Tells whether this parser's underlying data stream is ready to be read.
 * This method passes directly through to the underlying {@link DataStreamReader} object.
 * 
 * @return {@code true} if the next {@code parseLine()} is guaranteed not to block for input,
 * {@code false} otherwise. Note that returning {@code false} does not guarantee that the
 * next read will block.
 * @throws IOException If an I/O error occurs.
 * @see DataStreamReader#ready()
 */
public boolean ready() throws IOException {
	return reader.ready();
}


/**
 * Checks whether the specified observer is registered with this parser.
 * This method passes directly through to the underlying {@link DataStreamReader} object.
 *  
 * @param observer An observer.
 * @return {@code true} if the specified {@code observer} is not {@code null} and is regestered
 * with this parser, {@code false} otherwise.
 * @see DataStreamReader#hasObserver(DataStreamObserver)
 */
public boolean hasObserver(DataStreamObserver observer) {
	return reader.hasObserver(observer);	
}


/**
 * De-registeres the specified observer from this parser.
 * This method passes directly through to the underlying {@link DataStreamReader} object.
 * 
 * @param observer An observer.
 * @return {@code true} if the specified observer is not {@code null} and was on the 
 * list of registered observers and is now removed from this list, {@code false} otherwise.
 * @see DataStreamReader#removeObserver(DataStreamObserver) 
 */
public boolean removeObserver(DataStreamObserver observer) {
	return reader.removeObserver(observer);
}


/**
 * Counts this parser's observers.
 * This method passes directly through to the underlying {@link DataStreamReader} object.
 * 
 * @return The number of observers registered with this parser.
 * @see DataStreamReader#countObservers()
 */
public int countObservers() {
	return reader.countObservers();
}


/**
 * Reads a data line from the underlying stream, and parses it.
 * 
 * @return The result of parsing the next line from the underlying input stream or 
 * {@code null} if no data was available on the stream or if an error occured.
 * @throws IOException If an I/O error occurs.
 * @throws DataFormatException If the data stream contents do not conform with the
 * expected data stream format.
 * @see DataStreamReader#readFromStream(int)
 */
public ParsedLine parseLine() throws DataFormatException, IOException {
	parsedLine = null;
	try {
		reader.readFromStream(1);
	} catch (RuntimeException e) {
		Throwable cause = e.getCause();
		if (null != cause && (cause instanceof DataFormatException))
			throw (DataFormatException) cause;
		if (null != cause && (cause instanceof IOException))
			throw (IOException) cause;
		throw e;	
	}
	return parsedLine;
}

/**
 * Reads and parses data lines from the underlying stream until a line of the
 * specified type has been read and so returns the data line of the specified
 * type first encountered.
 *  
 * @param lineType The type of the data line to search for.
 * @return The next data line of the specified type that occures in the
 * underlying data stream or {@code null} if no further data lines can be read
 * before a line of the specified type is encountered.
 * @throws DataFormatException If the data stream contents do not conform with the
 * expected data stream format.
 * @throws IOException If an I/O error occurs.
 * @see #parseLine()
 * @see DataStreamReader#readFromStream(int)
 */
public ParsedLine parseNext(final LineType lineType) throws DataFormatException, IOException {
	
	while (ready()) {
		ParsedLine line = parseLine();
		if (null == line)
			return null;
		if (lineType == line.type())
			return line;
	}
	
	return null;
}


/**
 * Gets the most recent line that was parsed using an invocation of {@code parseLine()}.
 * 
 * @return The line that was parsed during the last invocation of {@code parseLine()},
 * or {@code null} if {@code parseLine()} has not yet been invoked for this parser
 * or if the last invokation of {@code parseLine()} has failed.
 */
public ParsedLine lastParsedLine() {
	return parsedLine;
}


/**
 * A {@code SynchronousDataStreamParser} holds a single instance of this private class in order to
 * receive call-back parsing events from the underlying {@code DataStreamReader}.
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: SynchronousDataStreamParser.java</p> 
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
 * @author Greg Paperin (http://www.paperin.org)
 * @version {@value org.LiveGraph.LiveGraph#version} 
 * 
 * @see SynchronousDataStreamParser
 */
private class DataReceiver implements DataStreamObserver {

	public void eventCommentLine(String comment, DataStreamReader reader) {
		parsedLine = new ParsedLine();
		parsedLine.initComment(comment);
	}
	
	public void eventDataLineRead(List<String> dataTokens, int datasetIndex, DataStreamReader reader) {
		
		
		if (null == seriesLabels) {
			throw new IllegalStateException(new DataFormatException("Illegaly received a data"
																  + " line before a series"
																  + " labels line"));
		}
		
		parsedLine = new ParsedLine();
		
		ArrayList<LabeledValue<String>> values = new ArrayList<LabeledValue<String>>();
		for (int i = 0; i < dataTokens.size(); i++) {
			if (i >= seriesLabels.size()) {
				throw new IllegalStateException(
							new DataFormatException("The number of tokens in dataset at index "
												  + datasetIndex + " is larger than the number"
												  + " of data series labels ("
												  + seriesLabels.size() + ")"));
			}
			values.add(new LabeledValue<String>(seriesLabels.get(i), dataTokens.get(i)));
		}
		
		parsedLine.initData(values, datasetIndex);
	}
	
	public void eventFileInfoLine(String info, DataStreamReader reader) {
		parsedLine = new ParsedLine();
		parsedLine.initInfo(info);
	}
	
	public void eventLabelsSet(List<String> labels, DataStreamReader reader) {
		parsedLine = new ParsedLine();
		labels = DataStreamReader.createUniqueLabels(labels, false);
		parsedLine.initLabels(labels);
		seriesLabels = parsedLine.getLabels();
	}
	
	public void eventSeparatorSet(String separator, DataStreamReader reader) {
		parsedLine = new ParsedLine();
		parsedLine.initSeparator(separator);
	}
} // private class DataReceiver implements DataStreamObserver


/**
 * Encapsulates the information about a single data line parsed by a
 * {@code SynchronousDataStreamParser}.
 * While objects of this class can be modified by private methods,
 * the public interface is immutable.
 * 
 * <p>For general info - see {@link SynchronousDataStreamParser}.</p>
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: SynchronousDataStreamParser.java</p> 
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
 * @author Greg Paperin (http://www.paperin.org)
 * @version {@value org.LiveGraph.LiveGraph#version}
 */
public static class ParsedLine {

	/**
	 * Defines the possible types for a data file line.
	 * The types directly correspont to the data line types defined in the LiveGraph data file
	 * definition. The type {@code NONE} describes an uninitialised {@code ParsedLine} object.
	 */
	public static enum LineType {NONE, COMMENT, INFO, SEPARATOR_DEF, LABELS, DATA};
	
	/**
	 * The type of this line.
	 */
	private LineType type = LineType.NONE;
	
	/**
	 * Holds the data for the comment, the file info, or the separator depending on the
	 * type of this line.
	 */
	private String singleStringData = null;
	
	/**
	 * Holds the dataset index if this line is of type {@code Type.DATA}.
	 */
	private int datasetIndex = -1;
	
	/**
	 * Hols the data series labels if this line is of type {@code Type.LABELS} or {@code Type.DATA}.
	 */
	private List<String> labels = null;
	
	/**
	 * Holds the labeled data tokens if this line is of type {@code Type.DATA}.
	 */
	private List<LabeledValue<String>> values = null;
	
	/**
	 * Holds the labeled data tokens that are parsed as {@code Double}s
	 * (if this line is of type {@code Type.DATA}).
	 */
	private List<LabeledValue<Double>> doubleValues = null;
	
	/**
	 * Holds a mapping of series labels to data tokes if this line is of type {@code Type.DATA}.
	 */
	private Map<String, String> valuesMap = null;
	
	/**
	 * Holds a mapping of series labels to data tokes that are parsed as {@code Double}s
	 * (if this line is of type {@code Type.DATA}).
	 */
	private Map<String, Double> doubleValuesMap = null;
	
	/**
	 * Inits this line as a comment line.
	 * @param s The comment.
	 */
	private void initComment(String s) {
		if (null == s)
			s = "";
		type = LineType.COMMENT;
		singleStringData = s;
	}
	
	/**
	 * Inits this line as a file info line.
	 * @param s The file info.
	 */
	private void initInfo(String s) {
		if (null == s)
			s = "";
		type = LineType.INFO;
		singleStringData = s;
	}
	
	/**
	 * Inits this line as a separator sefinition line.
	 * @param s The separator.
	 */
	private void initSeparator(String s) {
		if (null == s)
			s = "";
		type = LineType.SEPARATOR_DEF;
		singleStringData = s;
	}
	
	/**
	 * Inits this line as a data series labels line.
	 * @param labs The labels.
	 */
	private void initLabels(List<String> labs) {
		if (null == labs)
			labels = Collections.emptyList();
		else
			labels = Collections.unmodifiableList(labs);
		type = LineType.LABELS;
	}

	/**
	 * Inits this line as a data values line.
	 * @param data The data tokens.
	 * @param dsIndex The dataset file index.
	 */
	private void initData(List<LabeledValue<String>> data, int dsIndex) {
		if (null == data)
			values = Collections.emptyList();
		else
			values = Collections.unmodifiableList(data);
		type = LineType.DATA;
		datasetIndex = dsIndex;
	}
	
	/**
	 * Gets the type of this parsed line.
	 * @return The type of this parsed line.
	 */
	public LineType type() {
		return type;
	}
	
	/**
	 * Returns the comment on this line if this line is of type {@code Type.COMMENT},
	 * otherwise throws a {@code IllegalStateException} exception.
	 * 
	 * @return The comment string on this line.
	 * @throws IllegalStateException If this is not a comment line.
	 */
	public String getComment() {
		if (LineType.COMMENT != type)
			throw new IllegalStateException("Cannot get comment from a line of type " + type);
		return singleStringData;
	}
	
	/**
	 * Returns the file info on this line if this line is of type {@code Type.INFO},
	 * otherwise throws a {@code IllegalStateException} exception.
	 * 
	 * @return The file info string on this line.
	 * @throws IllegalStateException If this is not a file info line.
	 */
	public String getInfo() {
		if (LineType.INFO != type)
			throw new IllegalStateException("Cannot get file info from a line of type " + type);
		return singleStringData;
	}
	
	/**
	 * Returns the data values separator on this line if this line is of
	 * type {@code Type.SEPARATOR_DEF}, otherwise throws a {@code IllegalStateException} exception.
	 * 
	 * @return The separator definition on this line.
	 * @throws IllegalStateException If this is not a separator definition line.
	 */
	public String getSeparator() {
		if (LineType.SEPARATOR_DEF != type)
			throw new IllegalStateException("Cannot get data separator from a line of type " + type);
		return singleStringData;
	}
	
	/**
	 * Returns the data series labels on this line if this line is of type {@code Type.LABELS},
	 * or extracts the labels from the labaled values and returns them
	 * if this line is of type {@code Type.DATA},
	 * otherwise throws a {@code IllegalStateException} exception.
	 * 
	 * @return The data series labels.
	 * @throws IllegalStateException If this is not a series labels or data values.
	 */
	public List<String> getLabels() {
		if (LineType.LABELS != type && LineType.DATA != type)
			throw new IllegalStateException("Cannot get labels from a line of type " + type);
		if (LineType.DATA == type) {
			labels = new ArrayList<String>();
			for (LabeledValue<String> v : values) {
				if (null == v)
					labels.add(null);
				else
					labels.add(v.label());
			}
			labels = Collections.unmodifiableList(labels);
		}		
		return labels;
	}
	
	/**
	 * Returns the data file index of this data line if this line is of type {@code Type.DATA},
	 * otherwise throws a {@code IllegalStateException} exception.
	 * 
	 * @return The data file index of this data line.
	 * @throws IllegalStateException If this is not a data line.
	 */
	public int getDatasetIndex() {
		if (LineType.DATA != type)
			throw new IllegalStateException("Cannot get dataset index from a line of type " + type);
		return datasetIndex;
	}
	
	/**
	 * Returns the data tokens from this data line if this line is of type {@code Type.DATA},
	 * otherwise throws a {@code IllegalStateException} exception.
	 * 
	 * @return The labeled data tokens from this data line.
	 * @throws IllegalStateException If this is not a data line.
	 */
	public List<LabeledValue<String>> getValues() {
		if (LineType.DATA != type)
			throw new IllegalStateException("Cannot get data values from a line of type " + type);
		return values;
	}
	
	/**
	 * Returns the data tokens from this data line parsed as {@code Double}s
	 * if this line is of type {@code Type.DATA}, otherwise throws
	 * a {@code IllegalStateException} exception.
	 * 
	 * @return The labeled data tokens from this data line parsed as {@code Double}s;
	 * if a token cannot be parsed as a {@code Double}, it is represented through
	 * a {@code null} value.
	 * @throws IllegalStateException If this is not a data line.
	 */
	public List<LabeledValue<Double>> getDoubleValues() {
		if (LineType.DATA != type)
			throw new IllegalStateException("Cannot get data values from a line of type " + type);
		if (null == doubleValues) {
			doubleValues = new ArrayList<LabeledValue<Double>>();
			for (LabeledValue<String> v : values) {
				if (null == v)
					doubleValues.add(null);
				else {
					Double d = null;
					if (null != v.value()) {
						try { d = Double.parseDouble(v.value()); }
						catch(NumberFormatException e) { d = null; }
					}
					doubleValues.add(new LabeledValue<Double>(v.label(), d));
				}
			}
			doubleValues = Collections.unmodifiableList(doubleValues);
		}
		return doubleValues;
	}
	
	/**
	 * If this line is of type {@code Type.DATA} this method returns a mapping from
	 * series labels to the corresponding data tokens, otherwise it throws
	 * a {@code IllegalStateException} exception.
	 * 
	 * @return A map between series labels and the corresponding data tokens,
	 * {@code null}-labels are not included.
	 * @throws IllegalStateException If this is not a data line.
	 */
	public Map<String, String> getValuesMap() {
		if (LineType.DATA != type)
			throw new IllegalStateException("Cannot get data values from a line of type " + type);
		if (null == valuesMap) {
			valuesMap = new HashMap<String, String>(values.size());
			for (LabeledValue<String> value : values) {
				if (null != value && null != value.label())
					valuesMap.put(value.label(), value.value());
			}
			valuesMap = Collections.unmodifiableMap(valuesMap);
		}
		return valuesMap;
	}
	
	/**
	 * If this line is of type {@code Type.DATA} this method returns a mapping from
	 * series labels to the corresponding data tokens parsed as {@code Double}s,
	 * otherwise it throws a {@code IllegalStateException} exception.
	 * 
	 * @return A map between series labels and the corresponding data tokens parsed
	 * as {@code Double}s. {@code null}-labels are not included; tokens that cannot
	 * be parsed as a {@code Double} are represented by a {@code null} value.
	 * @throws IllegalStateException If this is not a data line.
	 */
	public Map<String, Double> getDoubleValuesMap() {
		if (LineType.DATA != type)
			throw new IllegalStateException("Cannot get data values from a line of type " + type);
		if (null == doubleValuesMap) {
			doubleValuesMap = new HashMap<String, Double>(values.size());
			for (LabeledValue<String> value : values) {
				if (null == value || null == value.label())
					continue;
				Double d = null;
				if (null != value.value()) {
					try { d = Double.parseDouble(value.value()); }
					catch(NumberFormatException e) { d = null; }
				}
				doubleValuesMap.put(value.label(), d);
			}
			doubleValuesMap = Collections.unmodifiableMap(doubleValuesMap);
		}
		return doubleValuesMap;
	}
	
} // public static class ParsedLine

} // SynchronousDataStreamParser
