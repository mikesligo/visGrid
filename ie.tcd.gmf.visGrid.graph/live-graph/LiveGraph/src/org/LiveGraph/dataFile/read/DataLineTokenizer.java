package org.LiveGraph.dataFile.read;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.softnetConsult.utils.collections.ReadOnlyIterator;


/**
 * This tokeniser can split a string into tokens using a separator which is a string
 * itself. (Note that the standard tokeniser {@code java.util.StringTokenizer} only supports
 * single characters as separators.) This tokeniser supports empty tokens.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataLineTokenizer.java</p> 
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
public class DataLineTokenizer implements Iterable<String> {

/**
 * Internal buffer for the tokens.
 */
private List<String> tokens = null;

/**
 * Creates a new tokeniser on the specified string using the specified separator.
 * 
 * @param line The string to tokenise.
 * @param separator The separator to use.
 */
public DataLineTokenizer(String line, String separator) {
	tokens = new ArrayList<String>();
	parseLine(line, separator);
}

/**
 * Internal routine used for parsing.
 * 
 * @param line The string to tokenise.
 * @param sep The separator to use.
 */
private void parseLine(String line, String sep) {
	int p1 = 0, p2 = 0;
	
	while (p1 <= line.length()) {
		p2 = line.indexOf(sep, p1);
		if (-1 == p2)
			p2 = line.length();
		String tok = line.substring(p1, p2);
		tokens.add(tok);
		p1 = p2 + sep.length();
	}
}

/**
 * Provides a read-only iteration over the tokens of this tokeniser.
 * 
 *  @return A read-only iterator over the tokens of this tokeniser
 */
public ReadOnlyIterator<String> iterator() {
	return new ReadOnlyIterator<String>(tokens.iterator());
}

/**
 * Provides this tokeniser's tokens as an unmodifiable list.
 * 
 * @return A read-only list of this tokeniser's tokens.
 */
public List<String> getTokens() {
	return Collections.unmodifiableList(tokens);
}

}
