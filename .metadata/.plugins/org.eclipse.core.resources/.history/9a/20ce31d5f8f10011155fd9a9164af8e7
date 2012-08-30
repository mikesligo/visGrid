package org.LiveGraph.gui;

import javax.swing.JPanel;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventListener;
import org.LiveGraph.events.EventManager;
import org.LiveGraph.events.EventType;
import org.LiveGraph.settings.SettingsEvent;


/**
 * This is the superclass for LiveGraph main settings panels that may be inserted directly into
 * a window (or some other kind of GUI frame).This class executes event handling commonly shared
 * between settings panels. Each panel may ovverride any of this behaviour if desired. 
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: LiveGraphSettingsPanel.java</p>
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
public abstract class LiveGraphSettingsPanel extends JPanel implements EventListener {

/**
 * Permits to register as listener with the main LiveGraph event manager and
 * only with the main LiveGraph event manager.
 * 
 * @param manager The {@code EventManager} for the registering attempt.
 * @return {@code (LiveGraph.application().eventManager() == manager)}.
 * @see EventListener#permissionRegisterWithEventManager(EventManager)
 */
public boolean permissionRegisterWithEventManager(EventManager manager) {
	return LiveGraph.application().eventManager() == manager;
}

/**
 * Does not permit any unregistering.
 * 
 * @param manager The {@code EventManager} for the registering attempt.
 * @return {@code false}.
 * @see EventListener#permissionUnregisterWithEventManager(EventManager)
 */
public boolean permissionUnregisterWithEventManager(EventManager manager) {
	return false;
}

/**
 * Does nothing.
 * 
 * @param manager The {@code EventManager} with which this {@code EventListener} is now registered.
 * @see EventListener#completedRegisterWithEventManager(EventManager)
 */
public void completedRegisterWithEventManager(EventManager manager) { }

/**
 * Does nothing.
 * 
 * @param manager The {@code EventManager} with which this {@code EventListener} is now unregistered.
 * @see EventListener#completedUnregisterWithEventManager(EventManager)
 */
public void completedUnregisterWithEventManager(EventManager manager) { }

/**
 * Does nothing.
 * 
 * @param event An event in which this {@code EventListener} may be interested.
 * @return {@code false}.
 * @see EventListener#checkEventInterest(Event)
 */
public boolean checkEventInterest(Event<? extends EventType> event) {
	return false;
}

/**
 * Does nothing.
 * 
 * @param event The event to be validated.
 * @param soFar Whether {@code event} has been successfuly validated by whichever {@code EventListener}s
 * (if any) were invoked to validate {@code event} before this {@code EventListener}.
 * @return {@code true}.
 * @see EventListener#checkEventValid(Event, boolean)
 */
public boolean checkEventValid(Event<? extends EventType> event, boolean soFar) {
	return true;
}

/**
 * Calls {@link #processSettingsEvent(Event)} to process LiveGraph settings events.
 * Subclasses can override this method to process events of other types, however,
 * they <em>must</em> make sure to call this superclass method to ensure that
 * the settings events handled here are processed correctly. 
 * 
 * @param event Event to process.
 */
public void eventRaised(Event<? extends EventType> event) {
	
	if (event.getDomain() == SettingsEvent.class) {
		processSettingsEvent(event.cast(SettingsEvent.class));
		return;
	}
}

/**
 * This method must be overridden by subclasses in order to process settings events.
 * 
 * @param event A settings event.
 */
protected abstract void processSettingsEvent(Event<SettingsEvent> event);

} // public class LiveGraphSettingsPanel
