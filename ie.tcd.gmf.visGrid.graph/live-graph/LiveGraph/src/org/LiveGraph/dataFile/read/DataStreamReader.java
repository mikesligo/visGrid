package org.LiveGraph.dataFile.read;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.LiveGraph.dataFile.common.DataFormatException;

import com.softnetConsult.utils.exceptions.Bug;


import static org.LiveGraph.dataFile.common.DataFormatTools.*;


/**
 * A reader for a data stream (usually, a CSV file). This reader
 * will parse the data stream and extract the file information, the data
 * series headings and the actual data.<br />
 * <br />
 * The information extracted from the data stream is passed to the application
 * using an observer pattern: after a line was parsed, the appropriate 
 * {@code notifyXXXX(...)}-method of this class is called with the extracted
 * information. The {@code notifyXXXX(...)}-methods dispatch appropriate
 * notifications to all {@link DataStreamObserver}-objects registered with this
 * {@code DataStreamReader}-instance.<br />
 * If required, an application may also overwrite the {@code notifyXXXX(...)}-methods
 * to handle data read events.<br /> 
 * <br />
 * See {@link org.LiveGraph.dataFile.write.DataStreamWriter} for the details of the
 * data file format.<br />
 * <br />
 * Note, that this class has a different role than it did in version 1.01 of the
 * LiveGraph API. The {@code DataStreamReader} class from version 1.01 is replaced by
 * {@link org.LiveGraph.dataCache.DataStreamToCacheReader}.
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007 by G. Paperin.</p>
 * <p>File: DataStreamReader.java</p> 
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
 * @see DataStreamObserver
 * @see DataStreamObserverAdapter
 * @see org.LiveGraph.dataCache.DataStreamToCacheReader
 */
public class DataStreamReader implements Closeable {

/**
 * Data stream reader.
 */
private BufferedReader in = null;

/**
 * Data values separator.
 */
private String separator = DefaultSeparator;

/**
 * Whether the data values separator was already finalised. 
 */
private boolean separatorSet = false;

/**
 * Whether the data series headings are already set-up.
 */
private boolean labelsSet = false;

/**
 * The data stream index of the next data record.
 */
private int nextDatasetFileIndex = -1;

/**
 * Observers who want to know what's on the data stream.
 */
private List<DataStreamObserver> observers = null; 


/**
 * Creates a data reader on the specified stream.
 * 
 * @param is The stream from which to read. 
 */
public DataStreamReader(InputStream is) {
	
	if (null == is)
		throw new NullPointerException("Cannot read from a null stream.");
	
	this.in = new BufferedReader(new InputStreamReader(is));	
	this.separator = DefaultSeparator;
	this.separatorSet = false;
	this.labelsSet = false;
	this.nextDatasetFileIndex = -1;
	this.observers = new ArrayList<DataStreamObserver>(); 
}

/**
 * Creates a data reader on the specified stream and add one initial observer.
 * 
 * @param is The stream from which to read. 
 * @param observer An observer for the data stream contents.
 */
public DataStreamReader(InputStream is, DataStreamObserver observer) {
	this(is);
	addObserver(observer);
}


/**
 * Tells whether this reader's underlying data stream is ready to be read.
 * 
 * @return {@code true} if the next {@code readFromStream()} is guaranteed not to block for input,
 * {@code false} otherwise. Note that returning {@code false} does not guarantee that the next read
 * will block.
 * @throws IOException If an I/O error occurs.
 */
public boolean ready() throws IOException {
	return in.ready();
}

/**
 * Closes the underlying data stream. Further reading is not possible after calling this method.
 * @throws IOException If an I/O error occurs.
 */
public void close() throws IOException {
	in.close();
}

/**
 * Reads as many data lines from the underlying stream as there are available and parses them.
 *  
 * @return The number on non-empty data lines read.
 * @throws IOException If an I/O error occurs.
 * @throws DataFormatException If the data stream contents do not conform with the expected data
 * stream format.
 * @see org.LiveGraph.dataFile.write.DataStreamWriter
 * @see #readFromStream(int)
 */
public int readFromStream() throws IOException, DataFormatException {	
	return readFromStream(-1);	
}

/**
 * Reads up to a specified number of data lines from the underlying stream, and parses the lines.
 * Reading is stopped when the specified number of lines in reached or if no more lines are available.
 * 
 * @param maxLines The maximum number of data lines to read (empty lines are ignored and not counted,
 * but all other lines including comment lines are counted). If negative, all available lines will
 * be read.
 * @return The number on non-empty data lines read.
 * @throws IOException If an I/O error occurs.
 * @throws DataFormatException If the data stream contents do not conform with the expected data
 * stream format.
 * @see org.LiveGraph.dataFile.write.DataStreamWriter
 */
public int readFromStream(int maxLines) throws IOException, DataFormatException {
	
	int linesRead = 0;
	String line = null;
	while (ready() && (0 > maxLines || linesRead < maxLines) ) {
		line = in.readLine();
		line = line.trim();
		if (line.length() > 0) {
			processLine(line);
			linesRead++;
		}
	}
	return linesRead;
}

/**
 * Notifies observers regestered with this parser of a "data values separator set"-event.
 * 
 * @param separator New data separator to be passed to the observers.
 */
protected void notifySeparatorSet(String separator) {
	for (DataStreamObserver observer : observers)
		observer.eventSeparatorSet(separator, this);
}

/**
 * Notifies observers regestered with this parser of a "comment line parsed"-event.
 * 
 * @param comment The parsed comment line to be passed to the observers.
 */
protected void notifyCommentLine(String comment) {
	for (DataStreamObserver observer : observers)
		observer.eventCommentLine(comment, this);
}

/**
 * Notifies observers regestered with this parser of a "file info line parsed"-event.
 * 
 * @param info The parsed file info to be passed to the observers.
 */
protected void notifyFileInfoLine(String info) {
	for (DataStreamObserver observer : observers)
		observer.eventFileInfoLine(info, this);
}

/**
 * Notifies observers regestered with this parser of a "data series labels parsed"-event.
 * 
 * @param labels The parsed data series labels to be passed to the observers.
 */
protected void notifyLabelsSet(List<String> labels) {
	for (DataStreamObserver observer : observers)
		observer.eventLabelsSet(labels, this);
}

/**
 * Notifies observers regestered with this parser of a "dataset parsed"-event.
 * 
 * @param dataTokens The parsed data tokens to be passed to the observers.
 * @param datasetIndex The file index of the parsed dataset to be passed to the observers.
 */
protected void notifyDataLineRead(List<String> dataTokens, int datasetIndex) {
	for (DataStreamObserver observer : observers)
		observer.eventDataLineRead(dataTokens, datasetIndex, this);
}

/**
 * Adds an observer to this parser.
 * 
 * @param observer The observer to add.
 * @return {@code if the specified observer cound not be added because it was already registered},
 * {@code true otherwise}.
 */
public boolean addObserver(DataStreamObserver observer) {
	if (null == observer || hasObserver(observer))
		return false;
	return observers.add(observer);
}

/**
 * Checks whether the specified observer is registered with this parser.
 *  
 * @param observer An observer.
 * @return {@code true} if the specified {@code observer} is not {@code null} and is regestered
 * with this parser, {@code false} otherwise.
 */
public boolean hasObserver(DataStreamObserver observer) {
	if (null == observer)
		return false;
	return observers.contains(observer);	
}

/**
 * De-registeres the specified observer from this parser.
 * 
 * @param observer An observer.
 * @return {@code true} if the specified observer is not {@code null} and was on the 
 * list of registered observers and is now removed from this list, {@code false} otherwise. 
 */
public boolean removeObserver(DataStreamObserver observer) {
	if (null == observer)
		return false;
	return observers.remove(observer);
}

/**
 * Counts this parser's observers.
 * 
 * @return The number of observers registered with this parser.
 */
public int countObservers() {
	return observers.size();
}

/**
 * This static utility method converts a list of {@code String} tokens (presumably just parsed
 * from a data line) to a list of {@code Double} objects containing the tokens' values; tokens
 * that cannot be parsed to a {@code Double} are represented by {@code null}-objects in the
 * resulting list.
 * 
 * @param tokens A list of data tokens.
 * @return A list of the double values of the specified tokens.
 */
public static List<Double> convertTokensToDoubles(List<String> tokens) {
	
	if (null == tokens)
		return Collections.emptyList();
	
	List<Double> doubles = new ArrayList<Double>(tokens.size());
	for (String tok : tokens) {
		
		if (null == tok)
			continue;
		
		tok = tok.trim();
		
		Double val = null;
		if (null != tok && 0 < tok.length()) {
			try { val = Double.valueOf(tok); }
			catch (NumberFormatException e) { val = null; }
		}
		
		doubles.add(val);		
	}
	return doubles;
}


/**
 * This static utility method converts a list of strings (presumably representing a list of
 * labels just parsed from the data file) to a list of strings where each string is unique
 * in respect to its {@code equals} method (case sensitive); this happens by attaching 
 * counters to repreated strings: for instance, {@code ["boo", "foo", "boo"]} it converted to
 * {@code ["boo (1)", "foo", "boo (2)"]}.  
 *  
 * @param rawLabels The list of labels to convert.
 * @param allowEmptyLabels If this is {@code false}, all empty strings ({@code ""}) are converted
 * to underscores ({@code "_"}) before possibly applying the counters.
 * @return A list of unique data series labels based on the specified list.
 */
public static List<String> createUniqueLabels(List<String> rawLabels, boolean allowEmptyLabels) {
	
	List<String> uniqueLabels = new ArrayList<String>();
	Map<String, Integer> labelCounts = new HashMap<String, Integer>();
	 	
	// Mark labels which occure more than once:
	for (String rawLabel : rawLabels) {
		
		rawLabel = rawLabel.trim();
		if (!allowEmptyLabels && rawLabel.length() == 0)
			rawLabel = "_";
		
		if (!labelCounts.containsKey(rawLabel)) {
			
			labelCounts.put(rawLabel, 1);
			
		} else {
	
			int c = labelCounts.get(rawLabel);			
			labelCounts.put(rawLabel, ++c);
			rawLabel = rawLabel + " (" + c + ")";
		}
						
		uniqueLabels.add(rawLabel);
	}
	
	// Change first occurence of "label" into "label (1)" for the labels which appear more than once:
	for (String label : labelCounts.keySet()) {
		int c = labelCounts.get(label); 
		if (1 < c) {
			int p = uniqueLabels.indexOf(label);
			uniqueLabels.set(p, label + " (1)");
		}
	}
	
	// Done:	
	return uniqueLabels;
}


/**
 * Examines a data line and dispatches to a specialised parsing routine.
 * 
 * @param line A data line.
 * @throws DataFormatException If the data stream contents do not conform with the expected data
 * stream format.
 */
private void processLine(String line) throws DataFormatException {

	if (!separatorSet && line.startsWith(TAGSepDefinition) && line.endsWith(TAGSepDefinition)) {
		processSeparatorDefinitionLine(line);
		return;
	}
	
	if (line.startsWith(TAGComment)) {
		processCommentLine(line);
		return;
	}
	
	if (line.startsWith(TAGFileInfo)) {
		processFileInfoLine(line);
		return;
	}
	
	if (!labelsSet) {
		processSeriesLabelsLine(line);
		return;
	}
	
	if (true) {
		processDataLine(line);
		return;
	}
	
	throw new Bug("The program should never get to this line!");		
}

/**
 * Parses a data values separator definition line.
 * 
 * @param line Data line to parse.
 * @throws DataFormatException If the data line contents are not in the expected format.
 */
private void processSeparatorDefinitionLine(String line) throws DataFormatException {
	
	if (line.length() < TAGSepDefinition.length() * 2)
		throw new DataFormatException("Illegal separator definition: \"" + line + "\"");
	
	if (line.length() == TAGSepDefinition.length() * 2)
		throw new DataFormatException("Illegal separator definition: separator may not be an empty string");
	
	String sep = line.substring(TAGSepDefinition.length(), line.length() - TAGSepDefinition.length());
	
	String problem = isValidSeparator(sep);
	if (null != problem)
		throw new DataFormatException("Illegal separator definition: " + problem);
	
	separator = sep;
	separatorSet = true;
	notifySeparatorSet(separator);
}

/**
 * Parses a comments line.
 * 
 * @param line Data line to parse.
 * @throws DataFormatException If the data line contents are not in the expected format.
 */
private void processCommentLine(String line) throws DataFormatException {
	String comment = "";
	if (line.length() > TAGComment.length())
		comment = line.substring(TAGComment.length()).trim();
	
	separatorSet = true;
	notifyCommentLine(comment);
}

/**
 * Parses a file information line.
 * 
 * @param line Data line to parse.
 * @throws DataFormatException If the data line contents are not in the expected format.
 */
private void processFileInfoLine(String line) throws DataFormatException {
	String info = "";
	if (line.length() > TAGFileInfo.length())
		info = line.substring(TAGFileInfo.length()).trim();
	
	separatorSet = true;
	notifyFileInfoLine(info);
}

/**
 * Parses a data series headings line.
 * 
 * @param line Data line to parse.
 * @throws DataFormatException If the data line contents are not in the expected format.
 */
private void processSeriesLabelsLine(String line) throws DataFormatException {
	
	DataLineTokenizer tok = new DataLineTokenizer(line, separator);		
	nextDatasetFileIndex = 0;
	labelsSet = true;
	separatorSet = true;
	notifyLabelsSet(Collections.unmodifiableList(tok.getTokens()));
}

/**
 * Parses a data line.
 * 
 * @param line Data line to parse.
 * @throws DataFormatException If the data line contents are not in the expected format.
 */
private void processDataLine(String line) throws DataFormatException {
	
	DataLineTokenizer tok = new DataLineTokenizer(line, separator);
	separatorSet = true;
	notifyDataLineRead(tok.getTokens(), nextDatasetFileIndex++);
}

}
