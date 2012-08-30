package org.LiveGraph.settings;

import static org.LiveGraph.settings.SettingsEvent.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;

/**
 * Encapsulates the settings concerned with reading the data file, the update frequency
 * and the caching method. 
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataFileSettings.java</p> 
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
public class DataFileSettings extends ObservableSettings {

/**
 * Standard file extension.
 */
public static final String preferredFileExtension = ".lgdfs";

/**
 * Data file name.
 * Default value: {@code ""}.
 */
private String dataFile = "";

/**
 * Show only tail data (or all data).
 * Default value: {@code false}.
 */
private boolean showOnlyTailData = false;

/**
 * Do not cache data (i.e. read every time from stream) or cache.
 * Default value: {@code false}.
 */
private boolean doNotCacheData = false;

/**
 * Data update frequency in milliseconds.
 * Default value: {@code -1}.
 */
private long updateFrequency = -1L;


/**
 * Creates a new data file settings object with the default settings values.
 */
public DataFileSettings() {
	super();
}

/**
 * Creates a new data file settings object and loads the settings values from
 * the specified file.
 *  
 * @param fileName File to load the settings from.
 */
public DataFileSettings(String fileName) {
	this();
	load(fileName, false);
}

/**
 * Loads the settings from a specified file.
 * 
 * @param fileName The file to load the settings from.
 * @param ignoreFileName Whether to ignore the DataFile values from the loaded file.
 * @return {@code true} if the settings were loaded, {@code false} if an exception occured. 
 */
public boolean load(String fileName, boolean ignoreFileName) {
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DFS_Load, fileName);
	if (null == actionEvent)
		return false;
	
	Properties values = new Properties();
	try {
		FileInputStream in = new FileInputStream(fileName);
		try {
			values.loadFromXML(in);
		} finally {
			in.close();
		}		
	} catch(IOException e) {
		e.printStackTrace();
		return false;
	}
			
	String s = values.getProperty("ShowOnlyTailData");
	showOnlyTailData = "1".equalsIgnoreCase(null != s ? s : "0");
	
	s = values.getProperty("DoNotCacheData");
	doNotCacheData = "1".equalsIgnoreCase(null != s ? s : "0");
	
	s = values.getProperty("UpdateFrequency");
	updateFrequency = Long.parseLong(null != s ? s : "-1");
	
	if (!ignoreFileName) {
		s = values.getProperty("DataFile");
		dataFile = (null != s ? s : "");
	}
					
	notifyObservers(actionEvent);
	return true;
}

/**
 * Saves the settings to a specified file.
 * 
 * @param fileName The file to save the settings to.
 * @return {@code true} if the settings were saved, {@code false} if an exception occured. 
 */
public boolean save(String fileName) {
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DFS_Save, fileName);
	if (null == actionEvent)
		return false;
		
	Properties values = new Properties();
	values.setProperty("DataFile", dataFile);
	values.setProperty("ShowOnlyTailData", showOnlyTailData ? "1" : "0");
	values.setProperty("DoNotCacheData", doNotCacheData ? "1" : "0");
	values.setProperty("UpdateFrequency", Long.toString(updateFrequency));
	
	try {
		FileOutputStream out = new FileOutputStream(fileName);
		try {
			values.storeToXML(out, "LiveGraph version " + LiveGraph.version + ". DataFileSettings.");
		}
		finally {
			out.close();
		}
		
		notifyObservers(actionEvent);
		return true;
	} catch(IOException e) {
		e.printStackTrace();
		return false;
	}
}

/**
 * Gets the data file.
 * 
 * @return Name of the data stream to plot.
 */
public String getDataFile() {
	return dataFile;
}

/**
 * Sets the data file.
 * 
 * @param fn Name of the data stream to plot.
 */
public void setDataFile(String fn) {
	
	// Apply this setting even if same data file is already in use as its contants may have changed.
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DFS_DataFile, fn);
	if (null == actionEvent)
		return;
	
	dataFile = fn;
	notifyObservers(actionEvent);
}


/**
 * Gets whether to plot only tail data.
 *  
 * @return {@code true} if only the datasets at the end of the data setream should be plotted,
 * {@code false} if data sets should be sampled from the complete data stream.
 */
public boolean getShowOnlyTailData() {
	return showOnlyTailData;
}

/**
 * Setts whether to plot only tail data.
 *  
 * @param v {@code true} if only the datasets at the end of the data setream should be plotted,
 * {@code false} if data sets should be sampled from the complete data stream.
 */
public void setShowOnlyTailData(boolean v) {
	
	if (v == getShowOnlyTailData())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DFS_ShowOnlyTailData, v);
	if (null == actionEvent)
		return;
	
	showOnlyTailData = v;
	notifyObservers(actionEvent);
}

/**
 * Gets whether the data stream should not be cached in memory.
 *  
 * @return {@code true} if the data stream should be read from the start each time the graph is updated,
 * {@code false} if data should be cached in memory and only the new data sets should be read on each update. 
 */
public boolean getDoNotCacheData() {
	return doNotCacheData;
}

/**
 * Sets whether the data stream should not be cached in memory.
 *  
 * @param v {@code true} if the data stream should be read from the start each time the graph is updated,
 * {@code false} if data should be cached in memory and only the new data sets should be read on each update. 
 */
public void setDoNotCacheData(boolean v) {
	
	if (v == getDoNotCacheData())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DFS_DoNotCacheData, v);
	if (null == actionEvent)
		return;
	
	doNotCacheData = v;
	notifyObservers(actionEvent);
}

/**
 * Gets the interval between automatic graph updates.
 * 
 * @return The number of milliseconds to wait between trying to read from the data stream next time.
 * If this values is {@code < 1} no automatic update should be initiated.
 */
public long getUpdateFrequency() {
	return updateFrequency;
}

/**
 * Sets the interval between automatic graph updates.
 * 
 * @param f The number of milliseconds to wait between trying to read from the data stream next time.
 * Pass a value {@code f < 1} to indicate that no automatic update should be initiated.
 */
public void setUpdateFrequency(long f) {
	
	if (f == getUpdateFrequency())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DFS_UpdateFrequency, f);
	if (null == actionEvent)
		return;
	
	updateFrequency = f;
	notifyObservers(actionEvent);
}

} // public class DataFileSettings