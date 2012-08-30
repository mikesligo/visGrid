package org.LiveGraph.settings;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventProcessingException;
import org.LiveGraph.events.EventProducer;
import org.LiveGraph.events.EventType;
import org.LiveGraph.events.UncheckedEventProcessingException;

/**
 * Base class for all settings classes which can hadle observers to listen to
 * settings events. This class handles all observer and event handling.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: ObservableSettings.java</p> 
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
public class ObservableSettings implements EventProducer {

public void eventProcessingFinished(Event<? extends EventType> event) { }

/**
 * Objects of this class do not handle {@code eventProcessingException} notofications.
 * 
 * @param event Ignored. 
 * @param exception Never actually thrown.
 * @return {@code false}.
 */
public boolean eventProcessingException(Event<? extends EventType> event, EventProcessingException exception) {
	return false;
}

public void notifyObservers(Event<? extends SettingsEvent> event) {
	LiveGraph.application().eventManager().raiseEvent(event);
}

public Event<SettingsEvent> checkObservers(SettingsEvent eventType, boolean info) throws UncheckedEventProcessingException {
	
	Class<? extends SettingsEvent> eventTypeClass = eventType.getClass();	
	Event<SettingsEvent> event = new Event<SettingsEvent>(this, eventTypeClass, eventType, info);
	try {
		if (LiveGraph.application().eventManager().validateEvent(event))
			return event;
		return null;
	} catch(EventProcessingException e) {
		throw new UncheckedEventProcessingException(e);
	}
}


public Event<SettingsEvent> checkObservers(SettingsEvent eventType, long info) throws UncheckedEventProcessingException {
	
	Class<? extends SettingsEvent> eventTypeClass = eventType.getClass();	
	Event<SettingsEvent> event = new Event<SettingsEvent>(this, eventTypeClass, eventType, info);
	try {
		if (LiveGraph.application().eventManager().validateEvent(event))
			return event;
		return null;
	} catch(EventProcessingException e) {
		throw new UncheckedEventProcessingException(e);
	}
}


public Event<SettingsEvent> checkObservers(SettingsEvent eventType, double info) throws UncheckedEventProcessingException {
	
	Class<? extends SettingsEvent> eventTypeClass = eventType.getClass();	
	Event<SettingsEvent> event = new Event<SettingsEvent>(this, eventTypeClass, eventType, info);
	try {
		if (LiveGraph.application().eventManager().validateEvent(event))
			return event;
		return null;
	} catch(EventProcessingException e) {
		throw new UncheckedEventProcessingException(e);
	}
}


public Event<SettingsEvent> checkObservers(SettingsEvent eventType, Object info) throws UncheckedEventProcessingException {
	
	Class<? extends SettingsEvent> eventTypeClass = eventType.getClass();	
	Event<SettingsEvent> event = new Event<SettingsEvent>(this, eventTypeClass, eventType, info);
	try {
		if (LiveGraph.application().eventManager().validateEvent(event))
			return event;
		return null;
	} catch(EventProcessingException e) {
		throw new UncheckedEventProcessingException(e);
	}
}


public Event<SettingsEvent> checkObservers(SettingsEvent eventType,
							  boolean infoBoolean, long infoLong, double infoDouble, Object infoObject)
																	throws UncheckedEventProcessingException {
	
	Class<? extends SettingsEvent> eventTypeClass = eventType.getClass();	
	Event<SettingsEvent> event = new Event<SettingsEvent>(this, eventTypeClass, eventType,
														  infoBoolean, infoLong, infoDouble, infoObject);
	try {
		if (LiveGraph.application().eventManager().validateEvent(event))
			return event;
		return null;
	} catch(EventProcessingException e) {
		throw new UncheckedEventProcessingException(e);
	}
}

}
