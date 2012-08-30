package org.LiveGraph.settings;

import static org.LiveGraph.settings.SettingsEvent.*;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;

import com.softnetConsult.utils.math.MathTools;
import com.softnetConsult.utils.string.StringTools;

/**
 * Encapsulates settings concerned with the data graphs and the plot canvas.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: GraphSettings.java</p> 
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
public class GraphSettings extends ObservableSettings {

/**
 * Standard file extension.
 */
public static final String preferredFileExtension = ".lggs";

/**
 * Possible types for the vertical grid.
 */
public static enum VGridType {
	/**
	 * No vertical grid.
	 */
	VGrid_None,
	
	/**
	 * Vertical grid is based on dataset indices.
	 */
	VGrid_DSNumAligned,
	
	/**
	 * Vertical grid is based on X data values. 
	 */
	VGrid_XAUnitAligned
};

/**
 * Possible types for the horizontal grid.
 */
public static enum HGridType {
	/**
	 * No horisontal grid.
	 */
	HGrid_None,
	
	/**
	 * Horisontal grid is based on Y data values.
	 */
	HGrid_Simple
};

/**
 * Possible types for the x-axis.
 */
public static enum XAxisType {
	/**
	 * Use dataset numbers as x-axis units.
	 */
	XAxis_DSNum,
	
	/**
	 * Plot against a specified data series
	 * (use the values of a specified data series as x-axis values).
	 */
	XAxis_DataValSimple,
	
	/**
	 * Plot against a specified data series transformed into the unit interval
	 * (use the values of a specified data series linearly transformed into the
	 * interval [0..1] as x-axis values).
	 */
	XAxis_DataValTrans0to1,
	
	/**
	 * Plot against a specified data series scaled by a specified constant
	 * (use the values of a specified data series multiplied by a specified value as x-axis values).
	 */
	XAxis_DataValScaleBySetVal,
	
	/**
	 * Plot against the logarithm of a specified data series to a specified base
	 * (use the values of logarithms of a specified data series taken to a specified base as x-axis values). 
	 */
	XAxis_DataValLogToSetBase,
	
	/**
	 * Plot against time
	 * (assume that the values of a specified data series represent seconds taken to a specified power
	 * of 10 (e.g. if {@code -3} is specified, the values represent milliseconds); plot against
	 * that axis while appropriately formatting the time (e.g. {@code hhh:mm:ss.xxx}).
	 */
	XAxis_DataValSecsToSetPower
};


/**
 * Bottom edge of the visible data area.
 * Default value: {@code Double.NaN} ({@code Auto}).
 */
private double minY = Double.NaN;

/**
 * Top edge of the visible data area.
 * Default value: {@code Double.NaN} ({@code Auto}).
 */
private double maxY = Double.NaN;

/**
 * Left edge of the visible data area.
 * Default value: {@code Double.NaN} ({@code Auto}).
 */
private double minX = Double.NaN;

/**
 * Right edge of the visible data area.
 * Default value: {@code Double.NaN} ({@code Auto}).
 */
private double maxX = Double.NaN;

/**
 * Type of the vertical grid.
 * Default value: {@code VGridType.VGrid_None}.
 */
private VGridType vGridType = VGridType.VGrid_None;

/**
 * Spacing of the vertical grid in data coordinates.
 * Default value: {@code 50}.
 */
private double vGridSize = 50.0;

/**
 * Color of the vertical grid.
 * Default value: {@code #C0C0C0}.
 */
private Color vGridColour = new Color(Integer.parseInt("C0", 16),
									  Integer.parseInt("C0", 16),
									  Integer.parseInt("C0", 16));

/**
 * Type of the horisontal grid.
 * Default value: {@code HGridType.HGrid_None}.
 */
private HGridType hGridType = HGridType.HGrid_None;

/**
 * Spacing of the horisontal grid in data coordinates.
 * Default value: {@code 50}.
 */
private double hGridSize = 50.0;

/**
 * Color of the horisontal grid.
 * Default value: {@code #C0C0C0}.
 */
private Color hGridColour = new Color(Integer.parseInt("C0", 16),
									  Integer.parseInt("C0", 16),
									  Integer.parseInt("C0", 16));

/**
 * Against what to plot the values.
 * Default value: {@code XAxisType.XAxis_DSNum}.
 */
private XAxisType xAxisType = XAxisType.XAxis_DSNum;

/**
 * Against which data series to plot (index).
 * Default value: {@code 0}.
 */
private int xAxisSeriesIndex = 0;

/**
 * Parameter for transformation of x-values.
 * Default value: {@code 1}.
 */
private double xAxisParamValue = 1.0;

/**
 * Whether to highlight data points as mouse is moved over the graph.
 * Default value: {@code true}.
 */
private boolean highlightDataPoints = true;


/**
 * Creates a new graph settings object with the default settings.
 */
public GraphSettings() {
	super();
	checkDisableHighlightingForOldJava();
}

/**
 * Creates a new graph settings object and loads the settings from the specified file.
 * 
 * @param fileName File to load the settigs from.
 */
public GraphSettings(String fileName) {
	this();
	load(fileName);
}

/**
 * Loads the settings from the specified file.
 * 
 * @param fileName File to load the settigs from.
 * @return {@code true} if the settings were loaded, {@code false} if an exception occured.
 */
public boolean load(String fileName) {
	
	// Check observers:
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_Load, fileName);
	if (null == actionEvent)
		return false;
	
	// Used for loading:
	Properties values = new Properties();
	
	// Read from file:
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
			
	// Parse values and set:
			
	String s = values.getProperty("MinY", "Auto");
	if ("Auto".equalsIgnoreCase(s)) {
		minY = Double.NaN;
	} else {
		try {
			minY =  StringTools.parseDouble(s);
		} catch (NumberFormatException e) {
			minY =  Double.parseDouble(s);
		}
	}
	
	
	s = values.getProperty("MaxY", "Auto");
	if ("Auto".equalsIgnoreCase(s)) {
		maxY = Double.NaN;
	} else {
		try {
			maxY =  StringTools.parseDouble(s);
		} catch (NumberFormatException e) {
			maxY =  Double.parseDouble(s);
		}
	}
	
	
	s = values.getProperty("MinX", "Auto");
	if ("Auto".equalsIgnoreCase(s)) {
		minX = Double.NaN;
	} else {
		try {
			minX =  StringTools.parseDouble(s);
		} catch (NumberFormatException e) {
			minX =  Double.parseDouble(s);
		}
	}
	
	
	s = values.getProperty("MaxX", "Auto");
	if ("Auto".equalsIgnoreCase(s)) {
		maxX = Double.NaN;
	} else {
		try {
			maxX =  StringTools.parseDouble(s);
		} catch (NumberFormatException e) {
			maxX =  Double.parseDouble(s);
		}
	}
	
	
	s = values.getProperty("VGridType", "VGrid_None");
	vGridType = VGridType.VGrid_None;
	for (VGridType t : VGridType.values()) {
		if (t.name().equalsIgnoreCase(s)) {
			vGridType = t;
			break;
		}
	}
	
	
	s = values.getProperty("VGridSize", "50");
	try {
		vGridSize = StringTools.parseDouble(s);
	} catch (NumberFormatException e) {
		vGridSize =  Double.parseDouble(s);
	}
	if (Double.isNaN(vGridSize) || Double.isInfinite(vGridSize) || 0.0 > vGridSize)
		vGridSize = 0.0;	
	
	
	s = values.getProperty("VGridColour", "C0C0C0");
	int r, g, b;
	try { r = Integer.parseInt(s.substring(0, 2), 16); } catch(NumberFormatException e) { r = 0; }
	try { g = Integer.parseInt(s.substring(2, 4), 16); } catch(NumberFormatException e) { g = 0; }
	try { b = Integer.parseInt(s.substring(4, 6), 16); } catch(NumberFormatException e) { b = 0; }
	vGridColour = new Color(r, g, b);
	
	
	s = values.getProperty("HGridType", "HGrid_None");
	hGridType = HGridType.HGrid_None;
	for (HGridType t : HGridType.values()) {
		if (t.name().equalsIgnoreCase(s)) {
			hGridType = t;
			break;
		}
	}
	
	
	s = values.getProperty("HGridSize", "50");
	try {
		hGridSize = StringTools.parseDouble(s);
	} catch (NumberFormatException e) {
		hGridSize =  Double.parseDouble(s);
	}
	if (Double.isNaN(hGridSize) || Double.isInfinite(hGridSize) || 0.0 > hGridSize)
		hGridSize = 0.0;	

	
	s = values.getProperty("HGridColour", "C0C0C0");
	try { r = Integer.parseInt(s.substring(0, 2), 16); } catch(NumberFormatException e) { r = 0; }
	try { g = Integer.parseInt(s.substring(2, 4), 16); } catch(NumberFormatException e) { g = 0; }
	try { b = Integer.parseInt(s.substring(4, 6), 16); } catch(NumberFormatException e) { b = 0; }
	hGridColour = new Color(r, g, b);
	
	
	s = values.getProperty("XAxisType", "XAxis_DSNum");
	xAxisType = XAxisType.XAxis_DSNum;
	for (XAxisType t : XAxisType.values()) {
		if (t.name().equalsIgnoreCase(s)) {
			xAxisType = t;
			break;
		}
	}
	if (s.equalsIgnoreCase("XAxis_DataValScaledSet")) // Support ver 1.1.2 and prev:
		xAxisType = XAxisType.XAxis_DataValScaleBySetVal;
	
	
	s = values.getProperty("XAxisSeriesIndex", "0");
	xAxisSeriesIndex = Integer.parseInt(values.getProperty("XAxisSeriesIndex"));
	if (0 > xAxisSeriesIndex)
		xAxisSeriesIndex = 0;	
	
	
	s = values.getProperty("XAxisParamValue");
	if (null == s) // Compatibility with version 1.1.2 and before:
		values.getProperty("XAxisScaleValue");
	if (null == s)
		s = "1";
	try {
		xAxisParamValue = StringTools.parseDouble(s);
	} catch (NumberFormatException e) {
		xAxisParamValue =  Double.parseDouble(s);
	}
	if (Double.isNaN(xAxisParamValue) || Double.isInfinite(xAxisParamValue))
		xAxisParamValue = 1.0;
	xAxisParamValue = ensureGoodXAxisParameter(xAxisType, xAxisParamValue);

	
	s = values.getProperty("HighlightDataPoints", "1");
	highlightDataPoints = "1".equalsIgnoreCase(s); 
	if (values.containsKey("SavedWithIncompatibleJavaVersion")
			&& "1".equalsIgnoreCase(values.getProperty("SavedWithIncompatibleJavaVersion"))
			&& !highlightDataPoints
			&& LiveGraph.application().runsCorrectJavaVersion()) {
		highlightDataPoints = true;
	}	
	checkDisableHighlightingForOldJava();
	
	
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
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_Save, fileName);
	if (null == actionEvent)
		return false;
	
	Properties values = new Properties();
	
	if(!LiveGraph.application().runsCorrectJavaVersion())
		values.setProperty("SavedWithIncompatibleJavaVersion", "1");
	
	values.setProperty("MinY", Double.isNaN(getMinY()) ? "Auto" : StringTools.toString(getMinY()));
	values.setProperty("MaxY", Double.isNaN(getMaxY()) ? "Auto" : StringTools.toString(getMaxY()));
	values.setProperty("MinX", Double.isNaN(getMinX()) ? "Auto" : StringTools.toString(getMinX()));
	values.setProperty("MaxX", Double.isNaN(getMaxX()) ? "Auto" : StringTools.toString(getMaxX()));
	
	values.setProperty("VGridType", getVGridType().name());
	values.setProperty("VGridSize", StringTools.toString(getVGridSize()));
	values.setProperty("VGridColour", String.format("%02x%02x%02x",
													getVGridColour().getRed(),
													getVGridColour().getGreen(),
													getVGridColour().getBlue()));
	
	values.setProperty("HGridType", getHGridType().name());
	values.setProperty("HGridSize", StringTools.toString(getHGridSize()));
	values.setProperty("HGridColour", String.format("%02x%02x%02x",
													getHGridColour().getRed(),
													getHGridColour().getGreen(),
													getHGridColour().getBlue()));
	
	values.setProperty("XAxisType", getXAxisType().name());
	values.setProperty("XAxisSeriesIndex", Integer.toString(getXAxisSeriesIndex()));
	values.setProperty("XAxisParamValue", StringTools.toString(getXAxisParamValue()));
	
	values.setProperty("HighlightDataPoints", getHighlightDataPoints() ? "1" : "0");
	
	try {
		
		FileOutputStream out = new FileOutputStream(fileName);
		try {
			values.storeToXML(out, "LiveGraph version " + LiveGraph.version + ". GraphSettings.");
		} finally {
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
 * Gets the minimum Y value for the plot viewport.
 * 
 * @return The minimum value along the Y axis for the graph view
 * or {@code java.lang.Double.NaN} if the current global minimum of all data series
 * should be used instead.  
 */
public double getMinY() {
	return minY;
}

/**
 * Sets the minimum Y value for the plot viewport.
 * 
 * @param v The minimum value along the Y axis for the graph view
 * or {@code java.lang.Double.NaN} if the global minimum of all data series
 * should be used at all times.  
 */
public void setMinY(double v) {
	
	if (v == getMinY())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_MinY, v);
	if (null == actionEvent)
		return;
	
	minY = v;
	notifyObservers(actionEvent);
}

/**
 * Gets the maximum Y value for the plot viewport.
 * 
 * @return The maximum value along the Y axis for the graph view
 * or {@code java.lang.Double.NaN} if the current global maximum of all data series
 * should be used instead.  
 */
public double getMaxY() {
	return maxY;
}

/**
 * Sets the maximum Y value for the plot viewport.
 * 
 * @param v The maximum value along the Y axis for the graph view
 * or {@code java.lang.Double.NaN} if the global maximum of all data series
 * should be used at all times.  
 */
public void setMaxY(double v) {
	
	if (v == getMaxY())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_MaxY, v);
	if (null == actionEvent)
		return;
	
	maxY = v;
	notifyObservers(actionEvent);
}

/**
 * Gets the minimum X value for the plot viewport.
 * 
 * @return The minimum value along the X axis for the graph view
 * or {@code java.lang.Double.NaN} if the currently smallest X value of all data series
 * should be used instead.  
 */
public double getMinX() {
	return minX;
}

/**
 * Sets the minimum X value for the plot viewport.
 * 
 * @param v The minimum value along the X axis for the graph view
 * or {@code java.lang.Double.NaN} if the smallest X value of all data series
 * should be used at all times.  
 */
public void setMinX(double v) {
	
	if (v == getMinX())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_MinX, v);
	if (null == actionEvent)
		return;
	
	minX = v;
	notifyObservers(actionEvent);
}

/**
 * Gets the maximum X value for the plot viewport.
 * 
 * @return The maximum value along the X axis for the graph view
 * or {@code java.lang.Double.NaN} if the currently largest X value of all data series
 * should be used instead.  
 */
public double getMaxX() {
	return maxX;
}

/**
 * Sets the maximum X value for the plot viewport.
 * 
 * @param v The maximum value along the X axis for the graph view
 * or {@code java.lang.Double.NaN} if the largest X value of all data series
 * should be used at all times.  
 */
public void setMaxX(double v) {
	
	if (v == getMaxX())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_MaxX, v);
	if (null == actionEvent)
		return;
	
	maxX = v;
	notifyObservers(actionEvent);
}

/**
 * Sets the vertical grid type.
 * 
 * @return The vertical grid type.
 */
public VGridType getVGridType() {
	return vGridType;
}

/**
 * Gets the vertical grid type.
 * 
 * @param v The vertical grid type.
 */
public void setVGridType(VGridType v) {
	
	if (null == v)
		v = VGridType.VGrid_None;
	
	if (v == getVGridType())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_VGridType, v);
	if (null == actionEvent)
		return;
	
	vGridType = v;
	notifyObservers(actionEvent);
}

/**
 * Gets the interval between the vertical grid bars.
 * 
 * @return The interval between the vertical grid bars.
 */
public double getVGridSize() {
	return vGridSize;
}

/**
 * Sets the interval between the vertical grid bars.
 * 
 * @param val The interval between the vertical grid bars.
 */
public void setVGridSize(double val) {
	
	if (Double.isNaN(val) || Double.isInfinite(val) || 0.0 > val)
		val = 0.0;
	
	if (val == getVGridSize())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_VGridSize, val);
	if (null == actionEvent)
		return;
	
	
	vGridSize = val;
	notifyObservers(actionEvent);
}

/**
 * Gets the colour to use for drawing the vertical grid bars.
 * 
 * @return The colour to use for drawing the vertical grid bars.
 */
public Color getVGridColour() {
	return vGridColour;
}

/**
 * Sets the colour to use for drawing the vertical grid bars.
 * @param c The colour to use for drawing the vertical grid bars.
 */
public void setVGridColour(Color c) {
	
	if (null == c)
		c = new Color(Integer.parseInt("C0", 16), Integer.parseInt("C0", 16), Integer.parseInt("C0", 16));
	
	if (c == getVGridColour())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_VGridColour, c);
	if (null == actionEvent)
		return;
	
	vGridColour = c;
	notifyObservers(actionEvent);
}

/**
 * Gets the horizontal grid type.
 * @return The horizontal grid type.
 */
public HGridType getHGridType() {	
	return hGridType;
}

/**
 * Sets the horizontal grid type.
 * @param v The horizontal grid type.
 */
public void setHGridType(HGridType v) {
	
	if (null == v)
		v = HGridType.HGrid_None;
	
	if (v == getHGridType())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_HGridType, v);
	if (null == actionEvent)
		return;
	
	hGridType = v;
	notifyObservers(actionEvent);
}

/**
 * Gets the interval between the horizontal grib bars.
 * 
 * @return The interval between the horizontal grib bars.
 */
public double getHGridSize() {
	return hGridSize;
}

/**
 * Sets the interval between the horizontal grib bars.
 * @param val The interval between the horizontal grib bars.
 */
public void setHGridSize(double val) {	
	
	if (Double.isNaN(val) || Double.isInfinite(val) || 0.0 > val)
		val = 0.0;
	
	if (val == getHGridSize())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_HGridSize, val);
	if (null == actionEvent)
		return;
	
	hGridSize = val;
	notifyObservers(actionEvent);
}


/**
 * Gets the colour for drawing the horizontal grid bars.
 * 
 * @return The colour for drawing the horizontal grid bars.
 */
public Color getHGridColour() {
	return hGridColour;
}

/**
 * Sets the colour for drawing the horizontal grid bars.
 * 
 * @param c The colour for drawing the horizontal grid bars.
 */
public void setHGridColour(Color c) {	
	
	if (null == c)
		c = new Color(Integer.parseInt("C0", 16), Integer.parseInt("C0", 16), Integer.parseInt("C0", 16));
	
	if (c == getHGridColour())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_HGridColour, c);
	if (null == actionEvent)
		return;
	
	hGridColour = c;
	notifyObservers(actionEvent);
}

/**
 * Gets the type for the x-axis.
 * 
 * @return The type for the x-axis.
 */
public XAxisType getXAxisType() {
	return xAxisType;
}

/**
 * Sets the type for the x-axis.
 * 
 * @param v The type for the x-axis.
 */
public void setXAxisType(XAxisType v) {
	
	if (null == v)
		v = XAxisType.XAxis_DSNum;
	
	if (v == getXAxisType())
		return;
	
	double p = getXAxisParamValue();
	double np = ensureGoodXAxisParameter(v, p);
	
	int xAxisSerInd = getXAxisSeriesIndex();
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_XAxisType, false, xAxisSerInd, np, v);
	if (null == actionEvent)
		return;
	
	if (p != np && null == checkObservers(GS_XAxisParamValue, false, xAxisSerInd, np, v))
		return;
	
	xAxisType = v;
	
	if (p != np)
		setXAxisParamValue(np);
	
	notifyObservers(actionEvent);
}

/**
 * Gets the index of the data series to use as the x-axis.
 * 
 * @return The index of the data series to use as the x-axis.
 */
public int getXAxisSeriesIndex() {
	return xAxisSeriesIndex;
}

/**
 * Sets the index of the data series to use as the x-axis.
 * 
 * @param val The index of the data series to use as the x-axis.
 */
public void setXAxisSeriesIndex(int val) {
	
	if (0 > val)
		val = 0;
	
	if (val == getXAxisSeriesIndex())
		return;
	
	double axisParam = getXAxisParamValue();
	XAxisType axisType = getXAxisType();
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_XAxisSeriesIndex,
																false, val, axisParam, axisType);
	if (null == actionEvent)
		return;
	
	xAxisSeriesIndex = val;
	notifyObservers(actionEvent);
}

/**
 * Gets the x-axis transformation parameter.
 * 
 * @return The x-axis transformation parameter.
 */
public double getXAxisParamValue() {
	return xAxisParamValue;
}

/**
 * Sets x-axis transformation parameter.
 * 
 * @param val x-axis transformation parameter.
 */
public void setXAxisParamValue(double val) {
	
	if (Double.isNaN(val) || Double.isInfinite(val))
		val = 1.0;
	
	if (val == getXAxisParamValue())
		return;
	
	XAxisType axisType = getXAxisType();
	
	val = ensureGoodXAxisParameter(axisType, val);
	
	int xAxisSeriesIndex = getXAxisSeriesIndex();
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_XAxisParamValue,
																false, xAxisSeriesIndex, val, axisType);
	if (null == actionEvent)
		return;
	
	xAxisParamValue = val;
	notifyObservers(actionEvent);
}

/**
 * Gets whether the data points in the vicinity of the mouse cursor should be highlighted.
 * (Note, this is a hidden setting and cannot be changes via the GUI.)
 * 
 * @return {@code true} if the data points in the vicinity of the mouse cursor should be highlighted,
 * {@code false} otherwise.
 */
public boolean getHighlightDataPoints() {
	return highlightDataPoints;
}

/**
 * Gets whether the data points in the vicinity of the mouse cursor should be highlighted.
 * (Note, this is a hidden setting and cannot be changes via the GUI.)
 * 
 * @param v {@code true} if the data points in the vicinity of the mouse cursor are to be highlighted,
 * {@code false} otherwise.
 */
public void setHighlightDataPoints(boolean v) {
	
	if (v == getHighlightDataPoints())
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(GS_HighlightDataPoints, v);
	if (null == actionEvent)
		return;
	
	boolean prev = highlightDataPoints;
	highlightDataPoints = v;
	checkDisableHighlightingForOldJava();
	
	if (prev != highlightDataPoints)
		notifyObservers(actionEvent);
}

/**
 * If the Java version is too old, data point highlighting is disabled.
 */
private void checkDisableHighlightingForOldJava() {
	if (!LiveGraph.application().runsCorrectJavaVersion())
		highlightDataPoints = false;
}

/**
 * Ensure that the transformation parameter has a legal value for the given
 * x-axis type. The transformation parameter must be a real number. In addition,
 * if the x-axis type is {@code XAxis_DataValLogToSetBase}, it must be
 * non-negative and not 1.
 * 
 * @param xAxisType The x-axis type for which to verify the parameter.
 * @param parameter The transfom parameter to check.
 * @return The corrected transform parameter.
 */
private double ensureGoodXAxisParameter(XAxisType xAxisType, double parameter) {
	
	if (Double.isInfinite(parameter))
		parameter = (parameter > 0. ? 1. : -1.);
	
	if (Double.isNaN(parameter))
		parameter = 0.;

	if (xAxisType == XAxisType.XAxis_DataValLogToSetBase) {
		
		double d = MathTools.log(parameter, 1.);
		if (Double.isNaN(d) || Double.isInfinite(d)) {
			
			if (0 > parameter)
				parameter = -parameter;
			if (1. == parameter)
				parameter = 0.;
		}
	}
	
	return parameter;
}

} // public class GraphSettings