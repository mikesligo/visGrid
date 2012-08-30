package org.LiveGraph.gui;


import org.LiveGraph.events.EventType;

public enum GUIEvent implements EventType {

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>a {@code List&lt;Integer&gt;}-object containing
 * 												series indices of highlighted series</td></tr>
 * </table>
 */
GUI_DataSeriesHighlighted,


/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (showing) or {@code false} (hidden)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
GUI_DataFileSettingsDisplayStateChanged,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (showing) or {@code false} (hidden)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
GUI_GraphSettingsDisplayStateChanged,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (showing) or {@code false} (hidden)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
GUI_DataSeriesSettingsDisplayStateChanged,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (showing) or {@code false} (hidden)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
GUI_PlotDisplayStateChanged,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td>{@code true} (showing) or {@code false} (hidden)</td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
GUI_MessagesDisplayStateChanged,


/**
 * This event is raised by the {@code GUIManager} in response to the invokation of
 * {@link GUIManager#logSuccessLn(Object)} in order to notify all listeners who would
 * like to log messages.
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>The {@code String} to log</td></tr>
 * </table>
 */
GUI_LogMessageSuccess,

/**
 * This event is raised by the {@code GUIManager} in response to the invokation of
 * {@link GUIManager#logErrorLn(Object)} in order to notify all listeners who would
 * like to log messages. It can be considered crucial that every error message does
 * eventually get logged. In oder to notify the {@code GUIManager} that the error message
 * was actually logged or displayed, an {@code EventListener} that successfully processed
 * an event of this type <em>must</em> attach an annotation to the event, with the
 * annotation info being an object of type {@code Boolean} representing the value
 * {@code true}. After the event has been processed by all listeners, {@code GUIManager}
 * will examine all annotations of the event. If it can find one or more annotations with
 * the info-object being a {@code Boolean} that evaluates to {@code true}, it will do
 * nothing. Otherwise it it assume that the error message was not diaplayed/logged. In
 * that case it will immediately display a modal dialog with the error message and also
 * write the message to {@code System.err}.<br />
 * Note that this procedure does not apply to {@code GUI_LogMessageSuccess} and
 * {@code GUI_LogMessageInfo} events as it is assumed that they are less crucial and it
 * is up to the application whether they should be displayed. 
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>The {@code String} to log</td></tr>
 * </table>
 */
GUI_LogMessageError,

/**
 * This event is raised by the {@code GUIManager} in response to the invokation of
 * {@link GUIManager#logInfoLn(Object)} in order to notify all listeners who would
 * like to log messages.
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td>The {@code String} to log</td></tr>
 * </table>
 */
GUI_LogMessageInfo,

/**
 * <table>
 * <tr><th>Info parameter</th>				<th>Value</th></tr>
 * <tr><td>{@code getInfoBoolean()}</td>	<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoLong()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoDouble()}</td>		<td><em>unspecified</em></td></tr>
 * <tr><td>{@code getInfoObject()}</td>		<td><em>unspecified</em></td></tr>
 * </table>
 */
GUI_DisposeAll,

} // public enum GUIEvent
