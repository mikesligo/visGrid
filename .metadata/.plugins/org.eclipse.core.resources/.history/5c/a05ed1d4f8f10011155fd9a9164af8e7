package org.LiveGraph.dataFile.read;

import java.util.List;


/**
 * Defines an observer that is notified about parsing events of a data stream.
 * Objects implementing this interface can be registered with a {@link DataStreamReader}
 * which will then notify these objects whenever new information has been read from the
 * underlying data stream. 
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007 by G. Paperin.</p>
 * <p>File: DataStreamObserver.java</p> 
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
public interface DataStreamObserver {

/**
 * Is called when a data values separator has been parsed by the data reader.
 * 
 * @param separator The new data values separator string.
 * @param reader The reader which produced this event.
 */
public void eventSeparatorSet(String separator, DataStreamReader reader);

/**
 * Is called when a comment line has been encontered by the data reader.
 * 
 * @param comment The comment line.
 * @param reader The reader which produced this event.
 */
public void eventCommentLine(String comment, DataStreamReader reader);

/**
 * Is called when a file info/description comment line has been parsed by the data reader.
 * 
 * @param info File description/info string.
 * @param reader The reader which produced this event.
 */
public void eventFileInfoLine(String info, DataStreamReader reader);

/**
 * Is called when data series labels have been parsed by the data reader.
 * 
 * @param labels An <em>unmodifiable</em> list containing all parsed data series labels.
 * @param reader The reader which produced this event.
 */
public void eventLabelsSet(List<String> labels, DataStreamReader reader);

/**
 * Is called each time a data line (data set) has been parsed by the data reader.
 * 
 * @param dataTokens An <em>unmodifiable</em> list containing all data tokens parsed from this line.
 * @param datasetIndex The number of this data line in the stream (i.e. dataset file index).
 * @param reader The reader which produced this event.
 */
public void eventDataLineRead(List<String> dataTokens, int datasetIndex, DataStreamReader reader);

}
