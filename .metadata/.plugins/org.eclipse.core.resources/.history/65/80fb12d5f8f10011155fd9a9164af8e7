package org.LiveGraph.extras.synchParser;


/**
 * Holds a label/value pair of two variables of types {@code String} (the label)
 * and {@code ValueType} (the value), where {@code ValueType} can be any class.
 * Lists of objects of this type are used when obtaining data from
 * {@link SynchronousDataStreamParser.ParsedLine} objects.
 * 
 * <p><strong>LiveGraph</strong> (http://www.live-graph.org).</p>
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: LabeledValue.java</p> 
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
 * @param <ValueType> The type class for the value held by a {@code LabeledValue} object.
 */
public class LabeledValue<ValueType> {

private String label;
private ValueType value;

public LabeledValue(String label, ValueType value) {
	if (null == label)
		throw new NullPointerException("label may not be null");
	this.label = label;
	this.value = value;
}

public String label() {
	return label;
}

public ValueType value() {
	return value;
}

}  // public class LabeledValue<ValueType>
