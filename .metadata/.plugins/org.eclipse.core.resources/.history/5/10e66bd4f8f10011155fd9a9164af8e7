package org.LiveGraph.bootstrap;


import static org.LiveGraph.bootstrap.UpgradeManager.AutoCheckFrequency.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.gui.GUIManager;
import org.LiveGraph.gui.Tools;

import com.softnetConsult.utils.exceptions.Bug;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;
import com.softnetConsult.utils.files.FileTools;
import com.softnetConsult.utils.mutableWrappers.MutableInt;
import com.softnetConsult.utils.sys.SystemTools;

/**
 * This class performs the automatic or user initiated update checks for the LiveGraph application.
 * Methods of this class are responsible for handling the update options files, the update GUI and
 * for querying the LiveGraph server to determine whether an update is available. The information
 * sent by the UpgradeManager to the update server is encoded in an HTTP request URL and contains
 * exactly the following items:<br />
 * <ol>
 * <li>The current LiveGraph version as defined in {@link org.LiveGraph.LiveGraph#version}.</li>
 * <li>The action that lead to the update check, i.e. either {@code "UserInitiated"}, or one
 * of the possible values defined within in the {@code enum} {@link AutoCheckFrequency}, as
 * specified by the current value of {@link #frequency}.</li>
 * </ol>	
 * The update server returns a fully formatted HTML document describing whtehr an update is
 * required; this HTML document is then dispayed by the {@code UpgradeManager} in an appropriate
 * GUI window. 
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: UpgradeManager.java</p>
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
public class UpgradeManager {

/**
 * File name for saving of auto-update settings.
 */
public static final String upgradeOptionsFileName = "autoUpdate.lguds";


/**
 * Possible frequency values for automatic update checks.
 */
public enum AutoCheckFrequency {

	/**
	 * Attempt to perform an automatic update check every day.
	 */
	DAILY(1),
	
	/**
	 * Attempt to perform an automatic update check every 7 days.
	 */
	WEEKLY(7),
	
	/**
	 * Attempt to perform an automatic update check every month
	 * (a month is taken as a period of 30 days; under this assumption a year has 360 days, the
	 * actual ckecking date will thus slowly move towards smaller month-dates).
	 */
	MONTHLY(30),
	
	/**
	 * Never attempt update checks, unless the user has initiated a check expricitly. 
	 */
	MANUAL_ONLY(Integer.MAX_VALUE),
	
	/**
	 * Default value: attempt to perform an automatic update check every 30 days
	 * (this setting is used unless otherwise specified).
	 */
	DEFAULT(MONTHLY.getFrequency());
	
	/**
	 * Auto-update ckeck frequency in days.
	 */
	private int freq = 1;
	
	/**
	 * Constructor initialises auto-update ckeck frequency of the {@code enum} constants.
	 * @param freq Auto-update ckeck frequency in days.
	 */
	private AutoCheckFrequency(int freq) { this.freq = freq; }
	
	/**
	 * Returns the auto-update ckeck frequency associated with this {@code enum} constact.
	 * @return the auto-update ckeck frequency associated with this {@code enum} constact.
	 */
	public int getFrequency()			 { return freq; }
}

/**
 * The frequency for auto-update chceks.
 */
private AutoCheckFrequency frequency = DEFAULT;

/**
 * The timstamp of the last performed auto-update check.
 */
private long lastCheckTS = 0L;

/**
 * An internal flag that is set while an auto-update check is being performed.
 */
private volatile boolean checkRunning = false;

/**
 * An internal flag that is set when an auto-update check that is currently running must be stopped. 
 */
private volatile boolean checkAbort = false;


/**
 * Called by the main application to perform an automatic update check against the LiveGraph
 * update server.
 */
public void autoUpdate() {
	
	// If LiveGraph is not running stand-alone - do not perform check:
	if (!LiveGraph.application().standalone())
		return;
	
	// Load auto-update checking settings:
	loadSettings();
	
	// If check frequency is set to "manual only" - do not perform check:
	if (MANUAL_ONLY == frequency)
		return;
	
	// Ensure that at least the number of days specified in the the auto-update frequency setting
	// has elapsed since the previous auto-update check:
	
	Calendar now = Calendar.getInstance();
	Calendar last = Calendar.getInstance();
	last.setTimeInMillis(lastCheckTS);
	
	last.add(Calendar.DATE, frequency.getFrequency());
	if (last.after(now))
		return;
	
	// Auto-update check should be performed.
	// Query the user to get permission to actually connect to the server:
	
	final Object[] options = new Object[] { "Check now", "Remind me later", "Auto-update options..."};
	Object sel = JOptionPane.showOptionDialog(
					null,
					"Would you like to allow LiveGraph to check whether a software update is available?",
					"Auto-Update",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[0]);

	// Process uder response:
	
	// No selection is treated like "cancel" (i.e. do nothing now and repeat procedure next time):
	if (null == sel)
		return;
	
	if (! (sel instanceof Integer)) {
		throw new Bug("Unexpected type: " + sel.getClass().getName());
	} else {
		int opt = ((Integer) sel).intValue();
		switch(opt) {
			
			// Go ahead performing auto-update check: 
			case 0:
				checkForUpdates(true);
				break;
				
			// Cancel (i.e. do nothing now and repeat procedure next time - "remind me later"):
			case 1:
				break;
				
			// Instead of auto-update check, open the auto-update options dialog:
			case 2:
				upgradeOptionsDialog();
				break;
			
			default:
				throw new UnexpectedSwitchCase(opt);
		}
	}
}


/**
 * Formats the actual URL for querying the update server.
 * 
 * @param automatic Whether the update check is automatic ({@code true}) or
 * user-initiated ({@code false}).
 * @return The URL query string for contacting the update server; the string contains information
 * on the current LiveGraph version and the currently set auto-update check frequency.
 */
private String formatUpdateCheckURL(boolean automatic) {
	final String template = "http://live-graph.org/update-check/?version=%s&requestType=%s";
	return String.format(template,
						 LiveGraph.version,
						 automatic ? frequency.name() : "UserInitiated");
}

/**
 * When it has been determined that an update check is to be performed, this method is called to
 * start a separate worker thread that is responsible for performing the actual update check
 * against the update server.
 *  
 * @param automatic Whether the update check is automatic ({@code true}) or
 * user-initiated ({@code false}).
 */
private void checkForUpdates(final boolean automatic) {
	
	Runnable checker = new Runnable() {
		public void run() {
			doCheckForUpdates(automatic);
		}
	};
	
	Thread worker = new Thread(checker, "LiveGraph Software Update Checker");
	worker.start();
}


/**
 * Called by a designated worker thread (that is started in {@link #checkForUpdates(boolean)}) to
 * actually perform an update check against the update server.
 *  
 * @param automatic Whether the update check is automatic ({@code true}) or
 * user-initiated ({@code false}).
 */
private synchronized void doCheckForUpdates(boolean automatic) {
	
	// Create dialog window:
	final JDialog dialog = new JDialog((JDialog) null, "LiveGraph auto update", false);
	dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	dialog.getContentPane().setLayout(new BorderLayout());
	
	// Create close button:
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	final JButton closeButton = new JButton("Close");
	closeButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			closeButton.setText("Closing...");
			closeButton.setEnabled(false);
			if (checkRunning)	checkAbort = true;
			else				dialog.dispose();
        }
	});
	panel.add(closeButton, BorderLayout.CENTER);
	dialog.getContentPane().add(panel, BorderLayout.SOUTH);

	// Create text pane:
	JTextPane textPane = new JTextPane();
	textPane.setEditable(false);
	Document doc = textPane.getDocument();
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.getViewport().add(textPane);
	dialog.getContentPane().add(scrollPane);
	dialog.pack();
	
	// Set dialog size and display:
	final int WIDTH = 620;
	final int HEIGHT = 600;
	Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
	dialog.setBounds((scr.width - WIDTH) / 2, (scr.height - HEIGHT) / 2, WIDTH, HEIGHT);
	dialog.addWindowListener(new WindowAdapter() {
		@Override public void windowClosing(WindowEvent e) {
			closeButton.setText("Closing...");
			closeButton.setEnabled(false);
			if (checkRunning)	checkAbort = true;
			else				dialog.dispose();
		}
	});
	checkRunning = true;
	dialog.setVisible(true);
	SystemTools.sleep(100);
	
	// Check for update availability:
	final String urlStr = formatUpdateCheckURL(automatic);
	try {
		URL url = new URL(urlStr);
		URLConnection conn = url.openConnection();
		conn.setConnectTimeout(1000);
		conn.setReadTimeout(10000);
		InputStream ins = null;
		try {
			doc.insertString(doc.getLength(), "\nAttempting to connect to server... ", null);
			dialog.repaint();
			ins = conn.getInputStream();
			doc.insertString(doc.getLength(), "Connected. Loading info...", null);
		} catch(SocketTimeoutException e) {
			doc.insertString(doc.getLength(), "Could not connect. Will retry shortly.", null);
			ins = null;
		}
		
		for (int attempt = 1; !checkAbort && null == ins && attempt <= 3; attempt++) {
			SystemTools.sleep(5000);
			if (checkAbort)
				break;
			url = new URL(urlStr);
			conn = url.openConnection();
			conn.setConnectTimeout(10000);
			conn.setReadTimeout(10000);
			doc.insertString(doc.getLength(), "\nReconnection attempt " + attempt + " of 3."
											+ " Attempting to connect to server... ", null);
			try {
				conn.connect();
				ins = conn.getInputStream();
				doc.insertString(doc.getLength(), "Connected. Loading info...", null);
			} catch(SocketTimeoutException e) {
				ins = null;
				doc.insertString(doc.getLength(), "Could not connect. Will retry shortly.", null);
			}
		}
		
		if (null == ins) {
			doc.insertString(doc.getLength(), "\n\nCould not connect to server.", null);
			doc.insertString(doc.getLength(), "\nVisit http://www.live-graph.org/downloads.html to"
											+ " check whether you have the latest version.", null);
		} else if (!checkAbort) {
			try {
				try {
					String oldBtnTxt = closeButton.getText();
					boolean oldBtnEnbl = closeButton.isEnabled();
					closeButton.setEnabled(false);
					closeButton.setText("READING...");
					
					textPane.setContentType("text/html");
					textPane.read(ins, textPane.getEditorKit().createDefaultDocument());
					
					closeButton.setText(oldBtnTxt);
					closeButton.setEnabled(oldBtnEnbl);
					
					lastCheckTS = System.currentTimeMillis();
					saveSettings();
				} finally {
					ins.close();
				}
			} catch(SocketTimeoutException e) {
				doc = textPane.getDocument();
				doc.insertString(doc.getLength(), "\n\nCould not read from the server.", null);
				doc.insertString(doc.getLength(), "\nVisit http://www.live-graph.org/downloads.html to"
												+ " check whether you have the latest version.", null);
			}
		}
	} catch (IOException ioe) {
		dialog.dispose();
		// Exceptions other than handled above can be treated by the default exception handler:
		throw new RuntimeException(ioe);
	} catch (BadLocationException ble) {
		dialog.dispose();
		throw new Bug("This should never happen!", ble);
	}
	
	checkRunning = false;
	if (checkAbort)
		dialog.dispose();
}


/**
 * Displays and handles the LiveGraph auto-update settings dialog.
 */
public synchronized void upgradeOptionsDialog() {
	
	
	// If application is not in stand-alone mode, display info message instead of update settings:
	if (!LiveGraph.application().standalone()) {
		JOptionPane.showMessageDialog(
				null,
				"Automatic update settings are not available since LiveGraph is not running is stand-alone mode.",
				"LiveGraph is not running in stand-alone mode",
				JOptionPane.INFORMATION_MESSAGE);
		return;
	}
	
	// Load the auto-update settings:
	loadSettings();
	
	// Create dialog window:
	final JDialog dialog = new JDialog((JDialog) null, "LiveGraph auto update settings", true);
	dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	dialog.getContentPane().setLayout(new GridBagLayout());
	dialog.addWindowListener(new WindowAdapter() {
		@Override public void windowClosing(WindowEvent e) {
			dialog.dispose();
		}
	});
	
	// Last update info:
	dialog.getContentPane().add(new JLabel("Last update check:"), Tools.createGridBagConstraints(0, 0, 1, 1));
	String lastCheckStr = "never";
	if (0L < lastCheckTS) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastCheckTS);
		lastCheckStr = format.format(cal.getTime());
	}
	dialog.getContentPane().add(new JLabel(lastCheckStr), Tools.createGridBagConstraints(1, 0, 1, 1));
	
	// Update frequency chooser:
	dialog.getContentPane().add(new JLabel("Auto-update frequency:"), Tools.createGridBagConstraints(0, 1, 1, 1));
	final JComboBox freqCombo = new JComboBox();
	int i = 0, selected = -1;
	for (AutoCheckFrequency f : AutoCheckFrequency.values()) {
		if (DEFAULT == f)
			continue;
		freqCombo.addItem(f.toString());
		if (f.getFrequency() == frequency.getFrequency())
			selected = i;		
		i++;
	}
	freqCombo.setSelectedIndex(selected);
	dialog.getContentPane().add(freqCombo, Tools.createGridBagConstraints(1, 1, 1, 1));
	
	// Spacer:
	dialog.getContentPane().add(Box.createVerticalStrut(10), Tools.createGridBagConstraints(0, 2, 2, 1));
	
	// Buttons:
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	dialog.getContentPane().add(panel, Tools.createGridBagConstraints(0, 3, 2, 1));
	
	// If save button clicked - save:
	JButton button = new JButton("Save");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String sel = (null == freqCombo.getSelectedItem() ? "" : freqCombo.getSelectedItem().toString()); 
			for (AutoCheckFrequency f : AutoCheckFrequency.values()) {
				if (f.toString().equals(sel)) {
					frequency = f;
					break;
				}
			}
			saveSettings();
			dialog.dispose();
        }
	});
	panel.add(button);
	
	// If cancel button clicked - just close dialog:
	button = new JButton("Cancel");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dialog.dispose();
        }
	});
	panel.add(button);
	
	// If check now button clicked - disposed dialog and set flag to initiate update check:
	button = new JButton("Check now");
	final MutableInt needToCheckNow = new MutableInt(0);
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dialog.dispose();
			needToCheckNow.value = 1;
        }
	});
	panel.add(button);
	
	// Set dialog size:
	dialog.pack();
	Dimension ds = dialog.getSize();
	ds.width = ds.width + 10;
	ds.height = ds.height + 10; 
	Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
	dialog.setBounds((scr.width - ds.width) / 2, (scr.height - ds.height) / 2, ds.width, ds.height);
	
	// Display the modal dialog:
	dialog.setVisible(true);
	
	// If flag is set - initiate update check now:
	if (1 == needToCheckNow.value)
		checkForUpdates(false);
}


/**
 * Load the auto-update settings from the hard disk.
 */
private void loadSettings() {
	
	// GUI manager for output:
	GUIManager gui = LiveGraph.application().guiManager();
	
	// If NOT in standalone mode, log info and do not load anything
	if (!LiveGraph.application().standalone()) {
		gui.logInfoLn("Will not try loading auto-update options as LiveGraph is not"
					+ " running in stand-alone mode. Will use default settings.");
		return;
	}
	
	// Obtain the settings file name in the expected directory:
	String fn = "";
	try {
		fn = FileTools.concatDirFile(System.getProperty("user.dir"), upgradeOptionsFileName);
	} catch(SecurityException e) {
		try {
			fn = FileTools.concatDirFile(System.getProperty("user.home"), upgradeOptionsFileName);
		} catch(SecurityException ew) {
			// If we have so few permissions, we should not try to read the update settings:
			return;
		}
	}
	
	File file = new File(fn);
	
	
	// Make sure file exists:
	if (!file.exists() || !file.isFile()) {
		gui.logInfoLn("Auto-update options file not found. Will use default settings. (" + fn + ")");
		frequency = DEFAULT;
		lastCheckTS = 0L;
		return;
	}
	
	// Read from settings file:
	Properties props = new Properties();
	try {
		FileInputStream ins = new FileInputStream(fn);
		try {
			props.loadFromXML(ins);
		} finally {
			ins.close();
		}
	} catch(IOException e) {
		gui.logErrorLn("Error while loading auto-update options from \"" + fn + "\": " + e.getMessage());
		frequency = DEFAULT;
		lastCheckTS = 0L;
		return;
	}

	// Parse the read info:
	lastCheckTS = Long.parseLong(props.getProperty("lastCheckTS", "0"));
	frequency = DEFAULT;
	for (AutoCheckFrequency v : AutoCheckFrequency.values()) {
		if (v.name().equals(props.getProperty("frequency", DEFAULT.name()))) {
			frequency = v;
			break;
		}
	}
	
	// Log success message:
	gui.logSuccessLn("Auto-update options loaded from \"" + fn + "\".");
}


/**
 * Saves the auto-update file settings to a file:
 */
private void saveSettings() {
	
	// GUI manager for output:
	GUIManager gui = LiveGraph.application().guiManager();
	
	
	// If NOT in standalone mode - log info and do nothing:
	if (!LiveGraph.application().standalone()) {
		gui.logInfoLn("Will not try saving auto-update options as LiveGraph is not"
					+ " running in stand-alone mode.");
		return;
	}
	
	// Obtain file name in expected directory:
	String fn = "";
	try {
		fn = FileTools.concatDirFile(System.getProperty("user.dir"), upgradeOptionsFileName);
	} catch(SecurityException e) {
		try {
			fn = FileTools.concatDirFile(System.getProperty("user.home"), upgradeOptionsFileName);
		} catch(SecurityException ew) {
			// If we have so few permissions, we should not try to write the update settings:
			return;
		}
	}
	
	// Build properties object for saving:
	Properties props = new Properties();
	props.setProperty("lastCheckTS", Long.toString(lastCheckTS));
	props.setProperty("frequency", frequency.name());
	
	// Write to settings file:
	try {
		FileOutputStream outs = new FileOutputStream(fn);
		try {
			props.storeToXML(outs,
							 "LiveGraph version " + LiveGraph.version + ". Automatic software update settings.");
		} finally {
			outs.close();
		}
		gui.logSuccessLn("Auto-update options saved to \"" + fn + "\".");
	} catch(IOException e) {
		gui.logErrorLn("Error while saving auto-update options to \"" + fn + "\": " + e.getMessage());
		return;
	}
}

} // public class UpgradeManager
