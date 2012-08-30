package org.LiveGraph.dataFile.common;

import com.softnetConsult.utils.string.StringTools;


/**
 * This convenience class defines special tags for the LiveGraph data file format.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataFormatTools.java</p> 
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
public class DataFormatTools {

/**
 * Every comment line must start with this tag.
 */
public static final String TAGComment = "#";

/**
 * Every file description line must start with this tag.
 */
public static final String TAGFileInfo = "@";

/**
 * An alternatice separator definition in the first line of the file must be
 * ocated wetween two instances of this tag.
 */
public static final String TAGSepDefinition = TAGComment + TAGComment;

/**
 * This is the default data separator tag.
 */
public static final String DefaultSeparator = ",";


/**
 * In order to read the data correctly a tag must not be confused with data value.
 * This method checks whther a separator tag is valid. Note that while this method
 * check for most common problems, it does not guarantee a correct separator.
 *  
 * @param separator A proposed data deparator string.
 * @return {@code true} if the specified separetor tag can be used with {@code double}
 * data values; {@code false} if the specified tag is not valid.  
 */
public static String isValidSeparator(String separator) {
	
	if (null == separator)
		return "The saparator may not be a null string";
	
	try {
		double d = Double.parseDouble(separator);
		return "Separator may not represent a legal real value (" + d + ")";
	} catch (NumberFormatException e) {}
	
	try {
		double d = StringTools.parseDouble(separator);
		return "Separator may not represent a legal real value (" + d + ")";
	} catch (NumberFormatException e) {}
	
	String SEP = separator.toUpperCase();
	if (SEP.equals("P") || SEP.equals("F") || SEP.equals("A") || SEP.equals("B") || SEP.equals("C")
			 || SEP.equals("D") || SEP.equals("E") || SEP.equals("F") || SEP.equals("H") || SEP.equals("NAN")
			 || SEP.equals("INFINITY") || SEP.equals("^") || SEP.equals("-") || SEP.equals("+")
			 || SEP.equals(".") || SEP.equals("..") || SEP.equals("..."))
		return "Illegal separator (" + separator + ")";
	
	if (separator.contains("\n") || separator.contains("\r"))
		return "Separator may not contain any line feeds or carriage returns";
	
	return null;
}

}
