package org.LiveGraph.dataCache;

import org.LiveGraph.events.EventType;
import org.LiveGraph.events.Validation;


/**
 * Event types related to data updates.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: UpdateInvokerObserver.java</p> 
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
public enum DataUpdateEvent implements EventType {


/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} if the {@code DataStreamReader} object
 * 												should be closed at the end of the update,
 * 												{@code false} if the {@code DataStreamReader} should
 * 												not be closed at the end of the update</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>The {@code DataStreamReader} object that
 * 												is the source for the update.</td></tr>
 * </table>
 */
UPDIN_InitiateUpdate,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>Error message ({@code String})</td></tr>
 * </table>
 */
UPDIN_CannotInitiateUpdate,


/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
UPDIN_TimerTick,

/**
 * Validated before actually starting an update, if validation fails the update is not started.
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
@Validation(Validation.Requirement.MUST_VALIDATE)
UPDIN_UpdateStart,

/**
 * Validated before switching into memory stream mode, if validation fails the switching is not performed;
 * event is raised directly after switching to notify the application.
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
@Validation(Validation.Requirement.MUST_VALIDATE)
UPDIN_StartMemoryStreamMode,

/**
 * Validated before switching from memory stream mode into normal (data file) mode,
 * if validation fails the switching is not performed;
 * event is raised directly after switching to notify the application.
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
@Validation(Validation.Requirement.MUST_VALIDATE)
UPDIN_EndMemoryStreamMode,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
UPDIN_UpdateFinishSuccess,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the error message</td></tr>
 * </table>
 */
UPDIN_UpdateFinishError

}  // public enum DataUpdateEvent
