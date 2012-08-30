package org.LiveGraph.gui.msg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventType;
import org.LiveGraph.gui.GUIEvent;
import org.LiveGraph.gui.LiveGraphSettingsPanel;
import org.LiveGraph.settings.SettingsEvent;

/**
 * The message panel of the application. This is the only component contained in
 * the content pane of the application's message window. API users may request
 * {@link org.LiveGraph.gui.GUIManager} to create additional instances of a
 * {@code MessagePanel} if they wish to integrate the LiveGraph GUI into their application.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: MessagePanel.java</p>
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
public class MessagePanel extends LiveGraphSettingsPanel {

public static final boolean DEBUG_EVENTS = false;

private static final DateFormat logTimestampFormat = new SimpleDateFormat("HH:mm:ss");

private JTextArea messageArea = null;

/**
 * This is the default constructor. 
 */
public MessagePanel() {
	super();
	initialize();
}

/**
 * This method initializes the main window.
 */
private void initialize() {
	
	// General settings:

	Dimension panelDim = new Dimension(600, 200);
	this.setPreferredSize(panelDim);
	this.setSize(panelDim);
	this.setLayout(new BorderLayout());
	
	// Message area in the centre:
	JScrollPane centreScrollPane = new JScrollPane();	
	this.add(centreScrollPane, BorderLayout.CENTER);
	messageArea = new JTextArea();
	messageArea.setEditable(false);
	messageArea.setFont(new Font("Courier New", Font.PLAIN, 12));
	centreScrollPane.setViewportView(messageArea);
	
} // private void initialize()

/**
 * Displays a log message.
 * @param s A message.
 */
private void logLn(String s) {
	messageArea.append(s);
	JScrollBar sb = ((JScrollPane) messageArea.getParent().getParent()).getVerticalScrollBar();
	if (null != sb)
		sb.setValue(sb.getMaximum());
	messageArea.append("\n");
}

/**
 * Displays an event debug log message.
 * @param s A message
 */
private void logEventDebugLn(String s) {
	StringBuffer b = new StringBuffer();
	b.append("[EVBD](");
	b.append(logTimestampFormat.format(new Date()));
	b.append("): ");
	b.append(s);
	logLn(b.toString());
}

/**
 * Displays an info message.
 * @param s A message
 */
private void logInfoLn(String s) {
	StringBuffer b = new StringBuffer();
	b.append("[INFO](");
	b.append(logTimestampFormat.format(new Date()));
	b.append("): ");
	b.append(s);
	logLn(b.toString());
}

/**
 * Displays an error message.
 * @param s A message
 */
private void logErrorLn(String s) {
	StringBuffer b = new StringBuffer();
	b.append("[ERR ](");
	b.append(logTimestampFormat.format(new Date()));
	b.append("): ");
	b.append(s);
	logLn(b.toString());
	LiveGraph.application().guiManager().setDisplayMessageWindows(true);
}

/**
 * Displays an success message.
 * @param s A message
 */
private void logSuccessLn(String s) {
	StringBuffer b = new StringBuffer();
	b.append("[SUCC](");
	b.append(logTimestampFormat.format(new Date()));
	b.append("): ");
	b.append(s);
	logLn(b.toString());
}

/**
 * Processes events.
 * 
 * @param event Event to process.
 */
@Override
public void eventRaised(Event<? extends EventType> event) {
	
	if (DEBUG_EVENTS) {
		logEventDebugLn(null == event ? "null" : event.toString());
	}
		
	super.eventRaised(event);
	
	if (event.getDomain() == GUIEvent.class) {
		processGUIEvent(event.cast(GUIEvent.class));
		return;
	}
}

/**
 * Updates local view on GUI events.
 * 
 * @param event The GUI event.
 */
private void processGUIEvent(Event<GUIEvent> event) {
	
	switch(event.getType()) {
			
		case GUI_LogMessageInfo:
			logInfoLn((String) event.getInfoObject());
			break;
			
		case GUI_LogMessageError:
			logErrorLn((String) event.getInfoObject());
			event.addAnnotation(this, Boolean.TRUE);
			break;
			
		case GUI_LogMessageSuccess:
			logSuccessLn((String) event.getInfoObject());
			break;
			
		default:
			break;			
	}
}

/**
 * Logs when settings have been loaded or saved.
 */
@Override
protected void processSettingsEvent(Event<SettingsEvent> event) {
	
	String fn = null;
	switch(event.getType()) {
	 
		case DFS_Load:
			fn = (null == event.getInfoObject() ? "null" : '\"' + event.getInfoObject().toString() + '\"');
			logSuccessLn("Data file settings loaded from " + fn + ".");
			break;
			
		case DFS_Save:
			fn = (null == event.getInfoObject() ? "null" : '\"' + event.getInfoObject().toString() + '\"');
			logSuccessLn("Data file settings saved to " + fn + ".");
			break;
			
		case GS_Load:
			fn = (null == event.getInfoObject() ? "null" : '\"' + event.getInfoObject().toString() + '\"');
			logSuccessLn("Graph settings loaded from " + fn + ".");
			break;
			
		case GS_Save:
			fn = (null == event.getInfoObject() ? "null" : '\"' + event.getInfoObject().toString() + '\"');
			logSuccessLn("Graph settings saved to " + fn + ".");
			break;
			
		case DSS_Load:
			fn = (null == event.getInfoObject() ? "null" : '\"' + event.getInfoObject().toString() + '\"');
			logSuccessLn("Data series settings loaded from " + fn + ".");
			break;
			
		case DSS_Save:
			fn = (null == event.getInfoObject() ? "null" : '\"' + event.getInfoObject().toString() + '\"');
			logSuccessLn("Data series settings saved to " + fn + ".");
			break;	
	 
		default:
			break;
	}
}

}  // public class MessagePanel
