package org.LiveGraph.gui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.PopupFactory;

import com.softnetConsult.utils.string.StringTools;
import com.softnetConsult.utils.sys.SystemTools;


/**
 * This validating adaptor listens to {@code focusLost}-messages of a
 * {@code JTextField}. If at that moment the field contains a valid
 * {@code double} value (as a string), the {@link #valueChanged(JTextField, double)}-method is
 * called. That method must be overridden by subclasses to take some appropriate
 * action. If, however, the field does not contain a valid {@code double} value,
 * the {@link #valueChanged(JTextField, double)}-method is not called and a tooltip with an error
 * message is displayed near the text fiels. The last known "good" value is then
 * restored.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: RealNumFieldValueChangeAdaptor.java</p> 
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
public abstract class RealNumFieldValueChangeAdaptor implements FocusListener, KeyListener {

/**
 * Display length for the error messgae tooltip in milliseconds.
 */
public static final long TOOLTIP_DISPLAY_LEN = 2000;

private double defaultValue = Double.NaN;
private HashMap<JTextField, Double> lastLegalvaluesCache = null;

/**
 * Constructor.
 * @param defaultValue Default "good" value.
 */
public RealNumFieldValueChangeAdaptor(double defaultValue) {
	this.defaultValue = defaultValue;
	this.lastLegalvaluesCache = new HashMap<JTextField, Double>();
}

/**
 * Does nothing.
 */
public void focusGained(FocusEvent e) {
	;
}

/**
 * Catches the focus lost event and performs field validation.
 */
public void focusLost(FocusEvent e) {	
	Object source = e.getSource();
	if (source instanceof JTextField)		
		handleEvent((JTextField) source);	
}

/**
 * Catches the enter pressed event and performs field validation.
 */
public void keyPressed(KeyEvent e) {
	Object source = e.getSource();
	if (! (source instanceof JTextField))
		return;
	if (KeyEvent.VK_ENTER != e.getKeyCode())
		return;
	handleEvent((JTextField) source);
}

/**
 * Does nothing.
 */
public void keyReleased(KeyEvent e) {
	;
}

/**
 * Does nothing.
 */
public void keyTyped(KeyEvent e) {
	;
}

/**
 * Performs the validation and handles appropriately.
 * 
 * @param field The text field that generated the event.
 */
public void handleEvent(final JTextField field) {	
	try {				
		double val = StringTools.parseDouble(field.getText());
		lastLegalvaluesCache.put(field, val);		
		double newVal = valueChanged(field, val);
		if (newVal != val) {
			field.setText(StringTools.toString(newVal));
			lastLegalvaluesCache.put(field, newVal);
		}
	} catch (NumberFormatException ex) {
		Point sc = field.getLocationOnScreen();
		sc.x += field.getWidth() / 2;
		sc.y += field.getHeight() / 2;
		JLabel info = new JLabel("You need a valid real value here. \"" + field.getText() + "\" is not a real number.");
		info.setOpaque(true);
		info.setBackground(Color.ORANGE);
		info.setForeground(Color.DARK_GRAY);
		final Popup popup = PopupFactory.getSharedInstance().getPopup(field, info, sc.x, sc.y);
		popup.show();
		Thread offSwitch = new Thread(new Runnable() {
			public void run() {
				try {
					SystemTools.sleep(TOOLTIP_DISPLAY_LEN);
				} finally {
					popup.hide();
					if (lastLegalvaluesCache.containsKey(field))
						field.setText(lastLegalvaluesCache.get(field).toString());
					else
						field.setText(StringTools.toString(defaultValue));
				}
		}}, "RealNumFieldValueChangeAdaptor.OffSwitch");
		offSwitch.start();
	}
}

/**
 * Subclasses must override that in order to take the appropriate action when the field
 * contains a valid {@code double} value.
 * 
 * @param field The text field containing the value.
 * @param newValue The {@code double} value in the field.
 * @return A string representing the value returned by this method will be used instead
 * of the current field content.  
 */
abstract public double valueChanged(JTextField field, double newValue);

}
