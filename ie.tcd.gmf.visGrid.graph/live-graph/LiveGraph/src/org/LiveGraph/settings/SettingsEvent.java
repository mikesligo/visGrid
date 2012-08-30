package org.LiveGraph.settings;

import org.LiveGraph.events.EventType;
import org.LiveGraph.events.Validation;

/**
 * This class defines the event types for events that may be raised by any of the LiveGraph
 * settings objects to notify various application components of a changed setting.
 * <p>Currently, there are 3 settings classes ({@link DataFileSettings}, {@link GraphSettings}
 * and {@link DataSeriesSettings}) and the LiveGraph application holds a unique instance
 * of each of these classes. If either a GUI or a third-party application wishes to change
 * any of the current LiveGraph settings at run-time, it must obtain the appropriate settings
 * object from the LiveGraph application and use one of the provided setter methods. The
 * settings object will change its internal setting value then raise an event to notify all
 * LiveGraph components interested in that particular setting of the changed value.</p>
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: SettingsEvent.java</p>
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
@Validation(Validation.Requirement.MUST_VALIDATE)
public enum SettingsEvent implements EventType {


//----------- DataFileSettings events: { -------------------------------------------------------

/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataFileSettings} after
 * loading settings from a file; events of this type are <strong>validated</strong> before
 * loading the settings, and loading proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DFS_Load}, {@code DataFileSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the file name</td></tr>
 * </table>
 * </p> 
 */
DFS_Load,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataFileSettings} after
 * saving settings to a file; events of this type are <strong>validated</strong> before
 * saving the settings, and saving proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_Save}, {@code DataFileSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the file name</td></tr>
 * </table>
 * </p> 
 */
DFS_Save,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataFileSettings} after
 * changing the data source file; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DFS_DataFile}, {@code DataFileSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the file name</td></tr>
 * </table>
 * </p> 
 */
DFS_DataFile,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataFileSettings} after
 * changing the setting determining whether to show all or only the tail data;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DFS_ShowOnlyTailData}, {@code DataFileSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (tail data) or {@code false} (all data)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
DFS_ShowOnlyTailData,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataFileSettings} after
 * changing data caching setting; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DFS_DoNotCacheData}, {@code DataFileSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (don't cache) or {@code false} (do cache)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
DFS_DoNotCacheData,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataFileSettings} after
 * changing the update frequency; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DFS_UpdateFrequency}, {@code DataFileSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>undate frequency in milliseconds</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
DFS_UpdateFrequency,

//----------- } DataFileSettings events. -------------------------------------------------------


//----------- GraphSettings events: { -------------------------------------------------------

/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * loading settings from a file; events of this type are <strong>validated</strong> before
 * loading the settings, and loading proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_Load}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the file name</td></tr>
 * </table>
 * </p> 
 */
GS_Load,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * saving settings to a file; events of this type are <strong>validated</strong> before
 * saving the settings, and saving proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_Save}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the file name</td></tr>
 * </table>
 * </p> 
 */
GS_Save,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing bottom edge of the visible data area
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_MinY}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>minY</em> ({@code Double.NaN} indicates <em>auto</em>)</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_MinY,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing top edge of the visible data area;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_MaxY}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>maxY</em> ({@code Double.NaN} indicates <em>auto</em>)</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_MaxY,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing left edge of the visible data area;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_MinX}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>minX</em> ({@code Double.NaN} indicates <em>auto</em>)</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_MinX,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing right edge of the visible data area;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_MaxX}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>maxX</em> ({@code Double.NaN} indicates <em>auto</em>)</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_MaxX,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing type of the vertical grid; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_VGridType}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code VGridType} object</td></tr>
 * </table>
 * </p> 
 */
GS_VGridType,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing spacing of the vertical grid; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_VGridSize}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>vertical grid spacing</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_VGridSize,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing colour of the vertical grid; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_VGridColour}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code Color} object</td></tr>
 * </table>
 * </p> 
 */
GS_VGridColour,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing type of the horisontal grid; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_HGridType}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code HGridType} object</td></tr>
 * </table>
 * </p> 
 */
GS_HGridType,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing horisontal grid spacing; events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_HGridSize}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>horisontal grid spacing</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_HGridSize,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing the colour of the horisontal grid;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_HGridColour}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code Color} object</td></tr>
 * </table>
 * </p> 
 */
GS_HGridColour,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing the transformation mode for x-axis values;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_XAxisType}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>index of the data series to use as the a-axis</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>the x-axis transformation parameter</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code XAxisType} object</td></tr>
 * </table>
 * </p> 
 */
GS_XAxisType,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing the index of the data series to use as the a-axis;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_XAxisSeriesIndex}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>index of the data series to use as the a-axis</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>the x-axis transformation parameter</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code XAxisType} object</td></tr>
 * </table>
 * </p> 
 */
GS_XAxisSeriesIndex,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing transformation parameter for x-axis values;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_XAxisParamValue}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>index of the data series to use as the a-axis</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>the x-axis transformation parameter</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code XAxisType} object</td></tr>
 * </table>
 * </p> 
 */
GS_XAxisParamValue,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link GraphSettings} after
 * changing whther of not data points should be highlighted as the mouse is hovered over them;
 * events of this type are <strong>validated</strong> before changing
 * this settings value, and the change proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code GS_HighlightDataPoints}, {@code GraphSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (highlight) or {@code false} (don't)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
GS_HighlightDataPoints,

//----------- } GraphSettings events. -------------------------------------------------------


// ----------- DataSeriesSettings events: { -------------------------------------------------------

/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * loading the settings from a file; events of this type are <strong>validated</strong> before
 * loading, and loading proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_Load}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code String} containg the file name</td></tr>
 * </table>
 * </p> 
 * 
 * This event type indicates that the <strong>data series setttings</strong> have
 * been loaded or are about to be loaded from a file.<br />
 * 
 */
DSS_Load,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * saving the settings to a file; events of this type are <strong>validated</strong> before
 * saving, and saving proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_Save}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
DSS_Save,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * changing the visibility of several data series in one go;
 * events of this type are <strong>validated</strong> before
 * changing the visibility, and changing proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_SeriesRange_Visibility}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>{@code Pair<Integer, Integer>(fromSeries, fromSeries)}</td></tr>
 * </table>
 * </p> 
 */
DSS_SeriesRange_Visibility,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * changing the visibility of a data series; events of this type are <strong>validated</strong> before
 * changing the visibility, and changing proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_Series_Visibility}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (show) or {@code false} (don't show)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>{@code seriesIndex}</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 * </p> 
 */
DSS_Series_Visibility,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * changing the plot colour for a data series; events of this type are <strong>validated</strong> before
 * changing the colour, and changing proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_Series_Colour}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>{@code seriesIndex}</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code Color} object for the new color</td></tr>
 * </table>
 * </p> 
 */
DSS_Series_Colour,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * changing the values transformation mode for a data series;
 * events of this type are <strong>validated</strong> before
 * changing the transformation mode, and changing proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_Series_TransformMode}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>{@code seriesIndex}</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>transformation parameter</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code DataSeriesSettings.TransformMode} object</td></tr>
 * </table>
 * </p> 
 */
DSS_Series_TransformMode,


/**
 * <p>Events of this type are <strong>raised</strong> by {@link DataSeriesSettings} after
 * changing the values transformation parameter for a data series;
 * events of this type are <strong>validated</strong> before
 * changing the values transformation parameter,
 * and changing proceeds only if the event is validated by all listeners.</p>
 * <p>When issuing events of type {@code DSS_Series_TransformParam}, {@code DataSeriesSettings} initialises
 * the event info parameters as follows:
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td>{@code seriesIndex}</td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td>transformation parameter</td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code DataSeriesSettings.TransformMode} object</td></tr>
 * </table>
 * </p> 
 */
DSS_Series_TransformParam,

// ----------- } DataSeriesSettings events. -------------------------------------------------------

} // public enum SettingsEvent
