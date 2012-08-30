package org.LiveGraph.gui.msg;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.WindowConstants;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;
import org.LiveGraph.gui.GUIEvent;
import org.LiveGraph.gui.LiveGraphFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This is the application's message window.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: MessageWindow.java</p> 
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
public class MessageWindow extends LiveGraphFrame {


/**
 * This is the default constructor. 
 */
public MessageWindow() {
	super();
	initialize();
}


/**
 * This method initializes the main window.
 */
private void initialize() {
	
	// Main window size and position:
	final int WIN_WIDTH = 600;
	final int WIN_HEIGHT = 200;
	Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
	this.setBounds((scr.width - WIN_WIDTH) / 2, (scr.height - WIN_HEIGHT) / 2, WIN_WIDTH, WIN_HEIGHT);
	
	// Other main settings:
	this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);	
	this.setTitle("Messages (LiveGraph)");	
	
	// Closing handler:
	this.addWindowListener(new WindowAdapter() {
		@Override public void windowClosing(WindowEvent e) {
			LiveGraph.application().guiManager().setDisplayMessageWindows(false);
		}
	});

} // private void initialize()

/**
 * Updates local view on GUI events.
 * 
 * @param event A GUI event.
 */
@Override
protected void processGUIEvent(Event<GUIEvent> event) {
	
	super.processGUIEvent(event);
	if (GUIEvent.GUI_MessagesDisplayStateChanged == event.getType()) {
		setVisible(event.getInfoBoolean());
	}
}

}  // public class MessageWindow
