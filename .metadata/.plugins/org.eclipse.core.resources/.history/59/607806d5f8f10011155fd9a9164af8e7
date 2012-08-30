package org.LiveGraph.events;

import org.LiveGraph.LiveGraph;


/**
 * The system level event types of the LiveGraph event engine are defined here.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: SystemEvent.java</p>
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
 *
 */
public enum SystemEvent implements EventType {


/**
 * <p>Events of this type are <strong>raised</strong> by {@link EventManager} when an
 * exception occurs during the processing of a LiveGraph event; events of this type
 * are never <strong>validated</strong>.</p>
 * 
 * <p>If an {@code Exception} occurs during the normal processing of an event by
 * any {@code EventListener}, the exception is caught, saved, and the processing of the event
 * by other listeners is continued. After <em>all</em> {@code EventListener}s have been invoked
 * for any given event, and if any exceptions have occured during the processing of that event,
 * all of these exceptions are wrapped into a single instance of {@link EventProcessingException}.
 * That {@code EventProcessingException} is passed to the {@code EventProducer} that fired the
 * event responsible for the exception using the
 * {@link EventProducer#eventProcessingException(Event, EventProcessingException)}-callback. The
 * producer may consume the exception (by returning {@code true} from the
 * {@code eventProcessingException}-call) or ignore it (by returning {@code false}). If the
 * exception is consumed, it will no longer be processed. If the exception is not consumed, the
 * {@code EventManager} will print it to {@code System.err} and then raise an event of
 * type {@code SYS_EventProcessingException} in a normal manner with
 * the {@code EventProcessingException} as the event's {@code getInfoObject()}-parameter.<br />
 * The purpose of this whole procedure is to make sure that the event dispathing does not break if
 * an exception occurs and that the application has sufficient oportunity to handle exceptions.</p>
 * 
 * <p>If an {@code Error} (rather than an {@code Exception}) occurs during the normal processing
 * of an event by any {@code EventListener}, the processing of that event is <em>not</em> continued
 * by other listeners, as in the case of {@code Exception}s and {@code RuntimeException}s.
 * Instead, the processing of the current event is terminated, the error is wrapped in an instance
 * of {@link EventProcessingException}, and then processed as described above.</p>
 * 
 * <p>If an exception or error occurs during the processing of
 * a {@code SYS_EventProcessingException}-event, the {@code EventManager} will behave as described
 * above, with the difference that no additional {@code SYS_EventProcessingException}-event will be
 * raised.</p>
 * 
 * <p>The main event diapatching loop is protected by a try-catch-all block. It cannot be reminated by
 * an event or by an exception/error in an event handler. If the application wishes to terminate the
 * event dispatcher it must call {@link EventManager#shutDownWhenFinished()}
 * or {@link EventManager#shutDownImmediately()}. However, in most cases the event dispatcher should
 * never be accessed by an application directly (other than to raise events). API users should
 * use {@link LiveGraph#disposeGUIAndExit()} to correctly free LiveGraph resources.</p>
 * 
 * <p>When issuing events of type {@code SYS_EventProcessingException},
 * {@code EventManager} initialises the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>The {@code EventProcessingException} object</td></tr>
 * </table>
 * </p> 
 */
SYS_EventProcessingException,

/**
 * Events if this type should not cause any action; such events may be used for housekeeping purposes
 * such as to notifying the listeners that the event manager is active, pooling the event queue,
 * measuring the event turnaround time, making sure that all events enqueued up to a certain point
 * are processed or others.
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
@Validation(Validation.Requirement.NEVER_VALIDATE)
SYS_NoOp,

}  // public enum SystemEvent
