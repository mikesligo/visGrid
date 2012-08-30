package org.LiveGraph.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.Box;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventListener;
import org.LiveGraph.events.EventManager;
import org.LiveGraph.events.EventType;
import org.LiveGraph.settings.DataFileSettings;
import org.LiveGraph.settings.DataSeriesSettings;
import org.LiveGraph.settings.GraphSettings;


/**
 * Provides a LiveGraph application menu bar.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: MainMenuBar.java</p>
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
/*package*/ class MainMenuBar extends JMenuBar implements EventListener {

private JFileChooser dataFileSettingsFileDlg = null;
private JFileChooser graphSettingsFileDlg = null;
private JFileChooser seriesSettingsFileDlg = null;

private JCheckBoxMenuItem dataFileSettingsDisplayMenuItem = null;
private JCheckBoxMenuItem graphSettingsDisplayMenuItem = null;
private JCheckBoxMenuItem seriesSettingsDisplayMenuItem = null;
private JCheckBoxMenuItem messsagesDisplayMenuItem = null;

public MainMenuBar() {
	init();
}

private void init() {
	
	// File Dialogs:
	
	try {
		dataFileSettingsFileDlg = new JFileChooser("");
		dataFileSettingsFileDlg.setFileFilter(new FileFilter() {
			@Override public boolean accept(File f) {
	        	if (null == f) return false;
	        	if (f.isDirectory()) return true;
	        	int p = f.getName().lastIndexOf(".");        
	        	return p < 0
	        			? false
	        			: f.getName().substring(p).equalsIgnoreCase(DataFileSettings.preferredFileExtension);
		    }
			@Override public String getDescription() {
	        	return "LiveGraph data file settings (*" + DataFileSettings.preferredFileExtension + ")";
	        }
		});
		try {
			dataFileSettingsFileDlg.setCurrentDirectory(new File(System.getProperty("user.dir")));
		} catch(SecurityException e) {
			dataFileSettingsFileDlg.setCurrentDirectory(new File(System.getProperty("user.home")));
		}
	} catch(SecurityException e) {
		dataFileSettingsFileDlg = null;
	}
	
	
	try {
		graphSettingsFileDlg = new JFileChooser("");
		graphSettingsFileDlg.setFileFilter(new FileFilter() {
			@Override public boolean accept(File f) {
	        	if (null == f) return false;
	        	if (f.isDirectory()) return true;
	        	int p = f.getName().lastIndexOf(".");        
	        	return p < 0
	        			? false
	        			: f.getName().substring(p).equalsIgnoreCase(GraphSettings.preferredFileExtension);
		    }
			@Override public String getDescription() {
	        	return "LiveGraph graph settings (*" + GraphSettings.preferredFileExtension + ")";
	        }
		});	
		try {
			graphSettingsFileDlg.setCurrentDirectory(new File(System.getProperty("user.dir")));
		} catch(SecurityException e) {
			graphSettingsFileDlg.setCurrentDirectory(new File(System.getProperty("user.home")));
		}
	} catch(SecurityException e) {
		graphSettingsFileDlg = null;
	}
	
	
	try {
		seriesSettingsFileDlg = new JFileChooser();
		seriesSettingsFileDlg.setFileFilter(new FileFilter() {
			@Override public boolean accept(File f) {
	        	if (null == f) return false;
	        	if (f.isDirectory()) return true;
	        	int p = f.getName().lastIndexOf(".");        
	        	return p < 0
	        			? false
	        			: f.getName().substring(p).equalsIgnoreCase(DataSeriesSettings.preferredFileExtension);
		    }
			@Override public String getDescription() {
	        	return "LiveGraph data series settings (*" + DataSeriesSettings.preferredFileExtension + ")";
	        }
		});
		try {
			seriesSettingsFileDlg.setCurrentDirectory(new File(System.getProperty("user.dir")));
		} catch(SecurityException e) {
			seriesSettingsFileDlg.setCurrentDirectory(new File(System.getProperty("user.home")));
		}
	} catch(SecurityException e) {
		seriesSettingsFileDlg = null;
	}
	
	
	// Temp variables:
	JMenu menu = null;
	JMenuItem mItem = null;
	
	
	// Data file setings menu:
	
	menu = new JMenu("Data file");
	
	mItem = new JMenuItem("Load data file settings...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { loadDataFileSettings(); }
	});	
	menu.add(mItem);
	mItem.setEnabled(null != dataFileSettingsFileDlg);
	
	mItem = new JMenuItem("Save data file settings...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { saveDataFileSettings(); }
	});
	menu.add(mItem);
	mItem.setEnabled(null != dataFileSettingsFileDlg);
	menu.addSeparator();
	
	dataFileSettingsDisplayMenuItem = new JCheckBoxMenuItem("Display data file settings");
	dataFileSettingsDisplayMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			visibilityDataFileSettings();
		}
	});
	menu.add(dataFileSettingsDisplayMenuItem);
	this.add(menu);
	
	
	// Graph setings menu:
	
	menu = new JMenu("Graph settings");
	
	mItem = new JMenuItem("Load graph settings...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { loadGraphSettings(); }
	});
	menu.add(mItem);
	mItem.setEnabled(null != graphSettingsFileDlg);
	
	mItem = new JMenuItem("Save graph settings...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { saveGraphSettings(); }
	});
	menu.add(mItem);
	mItem.setEnabled(null != graphSettingsFileDlg);
	menu.addSeparator();
	
	graphSettingsDisplayMenuItem = new JCheckBoxMenuItem("Display graph settings");
	graphSettingsDisplayMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { visibilityGraphSettings(); }
	});
	menu.add(graphSettingsDisplayMenuItem);
	this.add(menu);
	
	
	// Data series settings menu:
	
	menu = new JMenu("Data series");
	
	mItem = new JMenuItem("Load data series settings...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { loadDataSeriesSettings(); }
	});
	menu.add(mItem);
	mItem.setEnabled(null != seriesSettingsFileDlg);
	
	mItem = new JMenuItem("Save data series settings...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { saveDataSeriesSettings(); }
	});
	menu.add(mItem);
	mItem.setEnabled(null != seriesSettingsFileDlg);
	menu.addSeparator();
	
	seriesSettingsDisplayMenuItem = new JCheckBoxMenuItem("Display data series settings");	
	seriesSettingsDisplayMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { visibilityDataSeriesSettings(); }
	});
	menu.add(seriesSettingsDisplayMenuItem);	
	this.add(menu);
	
	
	// Messages menu:
	
	menu = new JMenu("Messages");
	
	messsagesDisplayMenuItem = new JCheckBoxMenuItem("Display message window");	
	messsagesDisplayMenuItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { visibilityMessageWindow(); }
	});
	menu.add(messsagesDisplayMenuItem);	
	this.add(menu);
	
	
	// Plot menu:
	
	menu = new JMenu("Plot");
	mItem = new JMenuItem("Export graph to image...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { exportPlot(); }
	});
	menu.add(mItem);
	this.add(menu);

	this.add(Box.createHorizontalGlue());
	
	
	// Help menu:
	
	menu = new JMenu("Help");	
	mItem = new JMenuItem("Support...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { showSupportInfo(); }
	});
	menu.add(mItem);
	
	mItem = new JMenuItem("Software update...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { displayUpdateDialog(); }
	});
	menu.add(mItem);
	mItem.setEnabled(LiveGraph.application().standalone());
	
	mItem = new JMenuItem("Info...");
	mItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { showProgramInfo(); }
	});
	menu.add(mItem);
	this.add(menu);
}


private void loadDataFileSettings() {
	
	if (JFileChooser.APPROVE_OPTION != dataFileSettingsFileDlg.showOpenDialog(this.getParent()))
		return;
	
	File selFile = dataFileSettingsFileDlg.getSelectedFile();
	if (!selFile.exists())
		return;
	
	if (!LiveGraph.application().getDataFileSettings().load(selFile.getAbsolutePath(), false))
		LiveGraph.application().guiManager().logErrorLn("Error while loading data file settings from " + selFile.getName() + ".");
		
}

private void saveDataFileSettings() {
	
	if (JFileChooser.APPROVE_OPTION != dataFileSettingsFileDlg.showSaveDialog(this.getParent()))
		return;
	
	File selFile = dataFileSettingsFileDlg.getSelectedFile();
	if (!selFile.getParentFile().exists())
		return;
	
	if (!selFile.getName().contains("."))
		selFile = new File(selFile.getAbsolutePath() + DataFileSettings.preferredFileExtension);
	
	if (!LiveGraph.application().getDataFileSettings().save(selFile.getAbsolutePath()))
		LiveGraph.application().guiManager().logErrorLn("Error while saving data file settings to " + selFile.getName() + ".");
}

private void visibilityDataFileSettings() {
	LiveGraph.application().guiManager().setDisplayDataFileSettingsWindows(dataFileSettingsDisplayMenuItem.getState());
	// For testing - remove later:
	//LiveGraph.application().guiManager().createDataFileSettingsWindow();
	//LiveGraph.application().guiManager().setDisplayDataFileSettingsWindows(true);
}

private void loadGraphSettings() {
	
	if (JFileChooser.APPROVE_OPTION != graphSettingsFileDlg.showOpenDialog(this.getParent()))
		return;
	
	File selFile = graphSettingsFileDlg.getSelectedFile();
	if (!selFile.exists())
		return;
	
	if (!LiveGraph.application().getGraphSettings().load(selFile.getAbsolutePath()))
		LiveGraph.application().guiManager().logErrorLn("Error while loading graph settings from " + selFile.getName() + ".");
		
}

private void saveGraphSettings() {
	
	if (JFileChooser.APPROVE_OPTION != graphSettingsFileDlg.showSaveDialog(this.getParent()))
		return;
	
	File selFile = graphSettingsFileDlg.getSelectedFile();
	if (!selFile.getParentFile().exists())
		return;
	
	if (!selFile.getName().contains("."))
		selFile = new File(selFile.getAbsolutePath() + GraphSettings.preferredFileExtension);
	
	if (!LiveGraph.application().getGraphSettings().save(selFile.getAbsolutePath()))
		LiveGraph.application().guiManager().logErrorLn("Error while saving graph settings to " + selFile.getName() + ".");
}

private void visibilityGraphSettings() {
    LiveGraph.application().guiManager().setDisplayGraphSettingsWindows(graphSettingsDisplayMenuItem.getState());
	// For testing - remove later:
    //LiveGraph.application().guiManager().createGraphSettingsWindow();
	//LiveGraph.application().guiManager().setDisplayGraphSettingsWindows(true);
}

private void loadDataSeriesSettings() {
	
	if (JFileChooser.APPROVE_OPTION != seriesSettingsFileDlg.showOpenDialog(this.getParent()))
		return;
	
	File selFile = seriesSettingsFileDlg.getSelectedFile();
	if (!selFile.exists())
		return;
	
	if (!LiveGraph.application().getDataSeriesSettings().load(selFile.getAbsolutePath()))
		LiveGraph.application().guiManager().logErrorLn("Error while loading data series settings from " + selFile.getName() + ".");
}

private void saveDataSeriesSettings() {
	
	if (JFileChooser.APPROVE_OPTION != seriesSettingsFileDlg.showSaveDialog(this.getParent()))
		return;
	
	File selFile = seriesSettingsFileDlg.getSelectedFile();
	if (!selFile.getParentFile().exists())
		return;
	
	if (!selFile.getName().contains("."))
		selFile = new File(selFile.getAbsolutePath() + DataSeriesSettings.preferredFileExtension);
	
	if (!LiveGraph.application().getDataSeriesSettings().save(selFile.getAbsolutePath()))
		LiveGraph.application().guiManager().logErrorLn("Error while saving data series settings to " + selFile.getName() + ".");
}

private void visibilityDataSeriesSettings() {
    LiveGraph.application().guiManager().setDisplaySeriesSettingsWindows(seriesSettingsDisplayMenuItem.getState());
	// For testing - remove later:
    //LiveGraph.application().guiManager().createSeriesSettingsWindow();
	//LiveGraph.application().guiManager().setDisplaySeriesSettingsWindows(true);
}

private void visibilityMessageWindow() {
    LiveGraph.application().guiManager().setDisplayMessageWindows(messsagesDisplayMenuItem.getState());
}

private void exportPlot() {
	LiveGraph.application().getGraphExporter().exportGraph();
}

private void showSupportInfo() {
	JOptionPane.showMessageDialog(this.getParent(),
				  "For help using LiveGraph " + LiveGraph.version + " please refer to the user manual at:\n" +
				  "http://www.live-graph.org/userManual.html\n\n" +
				  "In addition you can visit our support forums at:\n" +
				  "http://sourceforge.net/forum/?group_id=191061\n\n" +
				  "For further information browse the LiveGraph website at:\n" +
				  "http://www.live-graph.org\n ",
				  "Help",
				  JOptionPane.INFORMATION_MESSAGE);
}

private void displayUpdateDialog() {
	LiveGraph.application().upgradeManager().upgradeOptionsDialog();
}

private void showProgramInfo() {
	JOptionPane.showMessageDialog(this.getParent(),
				  "LiveGraph\nVersion " + LiveGraph.version + "\n" +
				  "http://www.live-graph.org\n\n" +
				  "Developed by Greg Paperin\n(http://www.paperin.org)\n" +
				  "at Monash University\n ",
				  "LiveGraph " + LiveGraph.version + " credits",
				  JOptionPane.INFORMATION_MESSAGE);
}


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
 * Processes events.
 * 
 * @param event Event to process.
 * @throws FileNotFoundException If could not read new data file.
 */
public void eventRaised(Event<? extends EventType> event) throws FileNotFoundException {
	
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
		
		case GUI_DataFileSettingsDisplayStateChanged:
			dataFileSettingsDisplayMenuItem.setState(event.getInfoBoolean());
			break;
			
		case GUI_GraphSettingsDisplayStateChanged:
			graphSettingsDisplayMenuItem.setState(event.getInfoBoolean());
			break;
			
		case GUI_DataSeriesSettingsDisplayStateChanged:
			seriesSettingsDisplayMenuItem.setState(event.getInfoBoolean());
			break;

		case GUI_MessagesDisplayStateChanged:
			messsagesDisplayMenuItem.setState(event.getInfoBoolean());
			break;
			
		default:
			break;
			
	}
} // private void processGUIEvent(Event<GUIEvent> event)

} // public class MainMenuBar 
