package org.LiveGraph.gui.dfs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileFilter;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.CacheEvent;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.dataCache.UpdateInvoker;
import org.LiveGraph.dataCache.DataUpdateEvent;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventType;
import org.LiveGraph.gui.LiveGraphSettingsPanel;
import org.LiveGraph.gui.Tools;
import org.LiveGraph.settings.DataFileSettings;
import org.LiveGraph.settings.SettingsEvent;

import com.softnetConsult.utils.exceptions.Bug;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;
import com.softnetConsult.utils.files.FileTools;
import com.softnetConsult.utils.swing.SwingTools;


/**
 * The data file settings panel of the application. This is the only component contained in
 * the content pane of the application's data file settings window. API users may request
 * {@link org.LiveGraph.gui.GUIManager} to create additional instances of a
 * {@code DataFileSettingsPanel} if they wish to integrate the LiveGraph GUI into their application.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: DataFileSettingsPanel.java</p>
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
public class DataFileSettingsPanel extends LiveGraphSettingsPanel {

private static final String [] updateIntervalLabels = {
									"100 Hz. (Expert mode). Never use \"Do not cache data\"!",
									"50 Hz. (Expert mode). Never use \"Do not cache data\"!",
									"10 Hz (10 times per second). Avoid using \"Do not cache data\".",
									"2 Hz (twice per second). Avoid using \"Do not cache data\".",
									"every 1 second (1 Hz). Consider avoiding using \"Do not cache data\".",
									"every 2 seconds (0.5 Hz). Consider avoiding using \"Do not cache data\".",
									"every 3 seconds (0.333 Hz). Consider avoiding using \"Do not cache data\".",
									"every 5 seconds (0.2 Hz).",
									"every 10 seconds (0.1 Hz).",
									"every 15 seconds.", "every 20 seconds.",													   
									"every 30 seconds.", "every 45 seconds.",
									"every 1 minute.", "every 90 seconds (1.5 minutes).",
									"every 2 minutes.", "every 3 minutes.",
									"every 5 minutes.", "every 10 minutes.",
									"every 15 minutes.", "every 20 minutes.",
									"every 30 minutes.", "every 45 minutes.",
									"every 1 hour.", "only manual update."};

private static final long [] updateIntervalValues = {
									10, 20, 100, 500,
									1000, 2000, 3000, 5000, 10000, 15000,
									20000, 30000, 45000, 60000, 90000, 120000, 180000,
									300000, 600000, 900000, 1200000, 1800000, 2700000,
									3600000, -1};
static {
	if (updateIntervalLabels.length != updateIntervalValues.length)
		throw new Bug("The arrays \"updateIntervalLabels\" and \"updateIntervalValues\" are"
				+ " not of the same size!");
}

private JLabel intervalLabel = null;
private JTextArea fileInfoArea = null;
private JLabel fileNameLabel = null;
private JSlider updateIntervallSlider = null;
private JLabel nextUpdateLabel = null;
private Color nextUpdateLabelDefaultColour = null;
private JCheckBox dontCacheBox = null;
private JRadioButton showTailDataButton = null;
private JRadioButton showAllDataButton = null;
private JFileChooser openFileDialog = null;
private JButton openButton = null;

/**
 * This is the default constructor.
 */
public DataFileSettingsPanel() {
	super();
	initialize();
}

/**
 * This method initializes the data file settings panel.
 */
private void initialize() {
	
	// General settings:
	
	final JPanel thisPanel = this;	
	Dimension panelDim = new Dimension(470, 300);
	this.setPreferredSize(panelDim);
	this.setSize(panelDim);	
	thisPanel.setLayout(new BorderLayout());
	
	DataFileSettings dfSettings = LiveGraph.application().getDataFileSettings();
	if (null == dfSettings)
		dfSettings = new DataFileSettings();
	
	// Layout:	
	
	JButton button = null;
	Dimension dim = null;
	
	// Settings controls:
	
	JPanel settingsPanel = new JPanel(new GridBagLayout());	
	settingsPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	thisPanel.add(settingsPanel, BorderLayout.NORTH);	
	settingsPanel.add(new Box.Filler((dim = new Dimension(1, 1)), dim, dim),
					  new GridBagConstraints(3, 0, 1, 1, 1, 0,
											 GridBagConstraints.WEST,
											 GridBagConstraints.BOTH,
											 new Insets(0, 0, 0, 0),
											 0, 0));
	
	// File name input:	
	
	settingsPanel.add(new JLabel("Data file:"), org.LiveGraph.gui.Tools.createGridBagConstraints(0, 0, 3, 1));
	
	openFileDialog = null;
	try {
		openFileDialog = new JFileChooser("");
		openFileDialog.addChoosableFileFilter(new FileFilter() {
	        @Override public boolean accept(File f) {
	        	if (null == f) return false;
	        	if (f.isDirectory()) return true;
	        	return ".csv".equalsIgnoreCase(FileTools.getExtension(f));
		    }
	        @Override public String getDescription() { return "Comma separated values (*.csv)"; }
		});
		openFileDialog.addChoosableFileFilter(new FileFilter() {
			@Override public boolean accept(File f) {
	        	if (null == f) return false;
	        	if (f.isDirectory()) return true;
	        	return ".dat".equalsIgnoreCase(FileTools.getExtension(f));
		    }
			@Override public String getDescription() { return "Generic data files (*.dat)"; }
		});
		openFileDialog.addChoosableFileFilter(new FileFilter() {
			@Override public boolean accept(File f) {
	        	if (null == f) return false;
	        	if (f.isDirectory()) return true;
	        	return ".lgdat".equalsIgnoreCase(FileTools.getExtension(f));
		    }
			@Override public String getDescription() { return "LiveGraph data files (*.lgdat)"; }
		});
		try {
			openFileDialog.setCurrentDirectory(new File(System.getProperty("user.dir")));
		} catch(SecurityException e) {
			openFileDialog.setCurrentDirectory(new File(System.getProperty("user.home")));
		}
	} catch(SecurityException e) {
		openFileDialog = null;
	}
	
	fileNameLabel = new JLabel("- no data file selected -");
	setFileNameLabel(dfSettings.getDataFile());
	fileNameLabel.setFont(SwingTools.getPlainFont(fileNameLabel));
	settingsPanel.add(fileNameLabel, Tools.createGridBagConstraints(0, 1, 4, 1));
	settingsPanel.add((openButton = new JButton("Open...")), Tools.createGridBagConstraints(4, 1, 1, 1));
	openButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if (JFileChooser.APPROVE_OPTION != openFileDialog.showOpenDialog(thisPanel))
				return;
			if (!openFileDialog.getSelectedFile().exists())
				return;
			
			String filePath = openFileDialog.getSelectedFile().getAbsolutePath();
			DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
			dfs.setDataFile(filePath);
			LiveGraph.application().guiManager().logInfoLn("Data source file : \"" + dfs.getDataFile() + "\".");
        }		
	});
	openButton.setEnabled(null != openFileDialog);
	
	// Cache options:
	
	ButtonGroup bGroup = new ButtonGroup();
	bGroup.add(showAllDataButton = new JRadioButton("Show all data", !dfSettings.getShowOnlyTailData()));
	bGroup.add(showTailDataButton = new JRadioButton("Show tail data", dfSettings.getShowOnlyTailData()));
	showAllDataButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
			dfs.setShowOnlyTailData(!showAllDataButton.isSelected());
			showAllDataButton.setSelected(!dfs.getShowOnlyTailData());
			showTailDataButton.setSelected(dfs.getShowOnlyTailData());
			System.out.println("DFS:" + dfs.getShowOnlyTailData());
        }		
	});	
	showTailDataButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
			dfs.setShowOnlyTailData(showTailDataButton.isSelected());
			showAllDataButton.setSelected(!dfs.getShowOnlyTailData());
			showTailDataButton.setSelected(dfs.getShowOnlyTailData());
			System.out.println("DFS:" + dfs.getShowOnlyTailData());
        }		
	});
	settingsPanel.add(showAllDataButton, Tools.createGridBagConstraints(0, 3, 1, 1));
	settingsPanel.add(showTailDataButton, Tools.createGridBagConstraints(1, 3, 1, 1));
	
	dontCacheBox = new JCheckBox("Do not cache data", dfSettings.getDoNotCacheData());
	dontCacheBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
			dfs.setDoNotCacheData(dontCacheBox.isSelected());
			dontCacheBox.setSelected(dfs.getDoNotCacheData());
        }		
	});
	settingsPanel.add(dontCacheBox, Tools.createGridBagConstraints(2, 3, 3, 1));
	
	// Update interval slider:
	
	settingsPanel.add(new JLabel("Update frequency:"), Tools.createGridBagConstraints(0, 4, 3, 1));
	
	intervalLabel = new JLabel(updateIntervalLabels[updateIntervalLabels.length - 1]);
	intervalLabel.setFont(SwingTools.getPlainFont(intervalLabel));
	settingsPanel.add(intervalLabel, Tools.createGridBagConstraints(0, 6, 5, 1));
	
	updateIntervallSlider = new JSlider(0, updateIntervalLabels.length - 1, updateIntervalLabels.length - 1);
	updateIntervallSlider.setMinorTickSpacing(1);	
	updateIntervallSlider.setSnapToTicks(true);
	updateIntervallSlider.setPaintTicks(true);
	updateIntervallSlider.setPaintTrack(true);
	updateIntervallSlider.setPaintLabels(false);
	updateIntervallSlider.setMajorTickSpacing(1);
	settingsPanel.add(updateIntervallSlider, Tools.createGridBagConstraints(0, 5, 5, 1));
	setUpdateFrequencyLabels(dfSettings.getUpdateFrequency());
	updateIntervallSlider.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent e) {
			int v = updateIntervallSlider.getValue();
			DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
			dfs.setUpdateFrequency(updateIntervalValues[v]);
			setUpdateFrequencyLabels(dfs.getUpdateFrequency());
        }		
	});
	
	
	// Update buttons & cache settings:

	nextUpdateLabel = new JLabel(formatNextUpdateLabelString(dfSettings.getUpdateFrequency()));
	settingsPanel.add(nextUpdateLabel, Tools.createGridBagConstraints(0, 7, 4, 1));
	nextUpdateLabelDefaultColour = nextUpdateLabel.getForeground();
	
	settingsPanel.add((button = new JButton("Update now")), Tools.createGridBagConstraints(4, 7, 1, 1));
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LiveGraph.application().updateInvoker().requestUpdate();
        }		
	});	
	
	
	// File info text field:
	
	this.fileInfoArea = new JTextArea();
	this.fileInfoArea.setEditable(false);
	JPanel fileInfoPanel = new JPanel(new BorderLayout(5, 5));
	fileInfoPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	fileInfoPanel.add(new JLabel("File info:"), BorderLayout.NORTH);
	fileInfoPanel.add(new JScrollPane(this.fileInfoArea), BorderLayout.CENTER);
	thisPanel.add(fileInfoPanel, BorderLayout.CENTER);
	
}  // private void initialize()

/**
 * Displayes data file info.
 * @param text Info.
 */
private void setDataFileInfoText(String text) {
	fileInfoArea.setText(text + "\n ");
	JScrollBar sb = ((JScrollPane) fileInfoArea.getParent().getParent()).getVerticalScrollBar();
	if (null != sb)
		sb.setValue(sb.getMaximum());
} // private void setDataFileInfoText


/**
 * Sets the file name label in the window. If the label is too long, the baginning it stripped off.
 * @param fileName Data file name.
 */
private void setFileNameLabel(String fileName) {
	final String noDataFileLabel = "- no data file selected -"; 
	if (null == fileName || 0 == fileName.trim().length()) {
		fileNameLabel.setText(noDataFileLabel);
		return;
	}
	fileName = fileName.trim();
	FontMetrics fm = fileNameLabel.getFontMetrics(fileNameLabel.getFont());
	if (fm.stringWidth(fileName) > fileNameLabel.getWidth() - 10) {
		while (fileName.length() > noDataFileLabel.length()
				&& fm.stringWidth("..." + fileName) > fileNameLabel.getWidth() - 10) {
			fileName = fileName.substring(1);	
		}
		fileName = "..." + fileName;
	}					
	fileNameLabel.setText(fileName);
} // private void setFileNameLabel


/**
 * Updates the view of the update inverval slider and label according to the specified update frequency.
 * @param f Update frequency.
 */
private void setUpdateFrequencyLabels(long f) {
	int p = (0 >= f ? updateIntervalValues.length - 1 : Arrays.binarySearch(updateIntervalValues, f));
	String lab;
	if (0 > p)
		lab = "every " + f + " milliseconds.";
	else
		lab = updateIntervalLabels[p];
	updateIntervallSlider.setValue(p);
	intervalLabel.setText(lab);
}

/**
 * Formats the text for the {@code nextUpdateLabel}.
 * 
 * @param remaining Milliseconds.
 * @return A formatted string.
 */
private String formatNextUpdateLabelString(long remaining) {
	
	if (remaining < 0) {
		return "Next update: on button click.";
	}
	
	long h = remaining / 3600000;
	long m = (remaining % 3600000) / 60000;
	long s = ((remaining % 3600000) % 60000) / 1000;
	long mill = ((remaining % 3600000) % 60000) % 1000;
	
	StringBuffer t = new StringBuffer("Next update: ");
	if (h > 0) {
		t.append(h);
		t.append(h == 1 ? " hour " : " hours ");
	}
	
	if (h > 0 || m > 0) {
		t.append(m);
		t.append(m == 1 ? " minute " : " minutes ");
	}
	
	t.append(s);
	t.append(".");
	
	if (mill < 10)
		t.append("00");
	else if (mill < 100) {
		t.append("0");
	}
	
	t.append(mill);
	t.append(" seconds.");
	
	return t.toString();
}

/**
 * Processes events.
 * 
 * @param event Event to process.
 */
@Override
public void eventRaised(Event<? extends EventType> event) {
	
	super.eventRaised(event);
	
	if (event.getDomain() == CacheEvent.class) {
		processCacheEvent(event.cast(CacheEvent.class));
		return;
	}
	
	if (event.getDomain() == DataUpdateEvent.class) {
		processDataUpdateEvent(event.cast(DataUpdateEvent.class));
		return;
	}
}

/**
 * Updates the view when data file settings change.
 * 
 * @param event Describes the change event.
 */
@Override
protected void processSettingsEvent(Event<SettingsEvent> event) {

	final DataFileSettings settings = LiveGraph.application().getDataFileSettings();
	final boolean loadEvent = (SettingsEvent.DFS_Load == event.getType());
	
	if (SettingsEvent.DFS_DataFile == event.getType() || loadEvent) {
		setFileNameLabel(settings.getDataFile());
	}
	
	if (SettingsEvent.DFS_ShowOnlyTailData == event.getType() || loadEvent) {
		showAllDataButton.setSelected(!settings.getShowOnlyTailData());
		showTailDataButton.setSelected(settings.getShowOnlyTailData());
	}
	
	if (SettingsEvent.DFS_DoNotCacheData == event.getType() || loadEvent) {
		dontCacheBox.setSelected(settings.getDoNotCacheData());
	}
	
	if (SettingsEvent.DFS_UpdateFrequency == event.getType() || loadEvent) {
		setUpdateFrequencyLabels(settings.getUpdateFrequency());
	}
}


/**
 * Updates data file info when the cache changes.
 * 
 * @param event The cache event.
 */
private void processCacheEvent(Event<CacheEvent> event) {
	
	switch(event.getType()) {
		case CACHE_UpdatedLabels:			
		case CACHE_ChangedMode:
		case CACHE_UpdatedData:
			break;
		case CACHE_UpdatedDataFileInfo:
			setDataFileInfoText(((DataCache) event.getProducer()).getDataFileInfo());
			break;
		default:
			throw new UnexpectedSwitchCase(event.getType());
			
	}
}

/**
 * Updates the panel when an {@code UpdateInvoker} event occured.
 * 
 * @param event The event.
 */
private void processDataUpdateEvent(Event<DataUpdateEvent> event) {
	
	switch(event.getType()) {
		
		case UPDIN_TimerTick:
			nextUpdateLabel.setForeground(nextUpdateLabelDefaultColour);
			long remaining = ((UpdateInvoker) event.getProducer()).getRemainingMillis();
			nextUpdateLabel.setText(formatNextUpdateLabelString(remaining));
			break;
			
		case UPDIN_UpdateStart:
			nextUpdateLabel.setForeground(nextUpdateLabelDefaultColour);
			nextUpdateLabel.setText("Update in progress.");
			break;
			
		case UPDIN_UpdateFinishSuccess:
			nextUpdateLabel.setForeground(nextUpdateLabelDefaultColour);
			nextUpdateLabel.setText("Update finished successfully.");
			break;
			
		case UPDIN_CannotInitiateUpdate:
		case UPDIN_UpdateFinishError:
			nextUpdateLabel.setForeground(Color.RED);
			String out = ((String) event.getInfoObject()).trim();
			nextUpdateLabel.setText(out);
			break;
			
		case UPDIN_StartMemoryStreamMode:
			openButton.setEnabled(false);
			dontCacheBox.setSelected(LiveGraph.application().getDataFileSettings().getDoNotCacheData());
			showAllDataButton.setEnabled(false);
			showTailDataButton.setEnabled(false);
			dontCacheBox.setEnabled(false);
			setFileNameLabel("Data loaded directly from main memory.");
			break;
			
		case UPDIN_EndMemoryStreamMode:			
			openButton.setEnabled(true);			
			showAllDataButton.setEnabled(true);
			showTailDataButton.setEnabled(true);
			dontCacheBox.setEnabled(true);
			DataFileSettings dfs = LiveGraph.application().getDataFileSettings();
			dontCacheBox.setSelected(dfs.getDoNotCacheData());
			setFileNameLabel(dfs.getDataFile());
			break;
		
		default:
			break;			
	}
}

} // public class DataFileSettingsPanel
