package org.LiveGraph.settings;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.events.Event;

import com.softnetConsult.utils.collections.Pair;
import com.softnetConsult.utils.math.MathTools;
import com.softnetConsult.utils.string.StringTools;

import static org.LiveGraph.settings.SettingsEvent.*;


/**
 * Ecapsulates the settings concerned with plotting each of the data series.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: DataSeriesSettings.java</p> 
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
public class DataSeriesSettings extends ObservableSettings {

/**
 * The default file extension.
 */
public static final String preferredFileExtension = ".lgdss";

/**
 * The transformation mode to the series values.
 */
public static enum TransformMode {
	
	/**
	 * Display the actual data value.
	 */
	Transform_None,
	
	/**
	 * Linearly transform the whole data series into the [0, 1] interval. 
	 */
	Transform_In0to1,
	
	/**
	 * Multiply (scale) each data value by a specified constant. 
	 */
	Transform_ScaleBySetVal,
	
	/**
	 * Take the logarithm of each data value to a specified base.
	 */
	Transform_Logarithm
};


/**
 * Holds the current settigs.
 */
private List<SeriesParameters> settings = null;

/**
 * Holds the default colours.
 */
private List<Color> defaultColours = null;


/**
 * Creates a new data series settings object and initialises it with default values.
 */
public DataSeriesSettings() {	
	createDefaultColours();
	settings = new ArrayList<SeriesParameters>();
}

/**
 * Creates a new data series settings object and loads the settigs from the specified file.
 * 
 * @param fileName The file name to use.
 */
public DataSeriesSettings(String fileName) {
	this();
	load(fileName);
}

/**
 * Creates a set of "nice" default colours for the plot.
 */
private void createDefaultColours() {
	final int DEF_COLOURS_COUNT = 14;
	
	defaultColours = new ArrayList<Color>(DEF_COLOURS_COUNT);
	
	for (int i = 0; i < DEF_COLOURS_COUNT; i++) {
		
		float h = (2.f / (float) DEF_COLOURS_COUNT) * ((float) i);
		float s = (0 == (2 * i / DEF_COLOURS_COUNT) % 2 ? 1.f : .5f);
		float b = (0 == i % 2 ? .7f : 1.f);
		
		Color col = Color.getHSBColor(h, s, b);
		defaultColours.add(col);
	}
}

// Default values for the series if none other spacified:

private boolean	  	  getDefaultShow(int s)			  { return true; }
private Color	  	  getDefaultColour(int s)		  { return defaultColours.get(s % defaultColours.size()); }
private TransformMode getDefaultTransformMode(int s)  { return TransformMode.Transform_None; }
private double	  	  getDefaultTransformParam(int s) { return 1.0; }


/**
 * Ensures that this settings container contains at least the settings for the data
 * series with the specified index and all indices before that. If this settings
 * object does not yet contain any settings for any of the series with these indices,
 * new settings data structures will be created and initialised with default values. 
 *  
 * @param maxSeriesIndex It will be ensured that this container contains settings for
 * at least all data series up to this index.
 */
private void ensureLength(int maxSeriesIndex) {
	while (settings.size() < maxSeriesIndex + 1) {
		int newSerInd = settings.size();
		SeriesParameters params = new SeriesParameters(getDefaultShow(newSerInd),
													   getDefaultColour(newSerInd),
													   getDefaultTransformMode(newSerInd),
													   getDefaultTransformParam(newSerInd));		
		settings.add(params);
	}
}

/**
 * Loads the settings from a specified file.
 * 
 * @param fileName The file to load the settings from.
 * @return {@code true} if the settings were loaded, {@code false} if an exception occured. 
 */
public boolean load(String fileName) {
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_Load, fileName);
	if (null == actionEvent)
		return false;
	
	Properties props = new Properties();
	try {
		FileInputStream in = new FileInputStream(fileName);
		try { props.loadFromXML(in); }
		finally { in.close(); }		
	} catch(IOException e) {
		e.printStackTrace();
		return false;
	}
	
	int describedSeriesCount = 0;
	try {
		describedSeriesCount = Integer.parseInt(props.getProperty("DescribedSeriesCount"));
	} catch (NumberFormatException e) {
		return false;
	}
	
	settings.clear();
	for (int i = 0; i < describedSeriesCount; i++) {
		try {
			
			boolean show = "1".equals(props.getProperty("Show."+i));
			
			String colS = props.getProperty("Colour."+i);
			int r = Integer.parseInt(colS.substring(0, 2), 16);
			int g = Integer.parseInt(colS.substring(2, 4), 16);
			int b = Integer.parseInt(colS.substring(4, 6), 16);
			Color col = new Color(r, g, b);
			
			String transModeS = props.getProperty("TransformMode."+i);
			TransformMode transMode = TransformMode.Transform_None;
			if (TransformMode.Transform_In0to1.toString().equalsIgnoreCase(transModeS))
				transMode = TransformMode.Transform_In0to1;
			else if (TransformMode.Transform_ScaleBySetVal.toString().equalsIgnoreCase(transModeS))
				transMode = TransformMode.Transform_ScaleBySetVal;
			else if ("Transform_SetVal".equalsIgnoreCase(transModeS)) // For compatibility with ver 1.1.2.
				transMode = TransformMode.Transform_ScaleBySetVal;
			else if (TransformMode.Transform_Logarithm.toString().equalsIgnoreCase(transModeS))
				transMode = TransformMode.Transform_Logarithm;
			
			double param = 1.0;
			String paramStr = props.getProperty("TransformParam."+i);
			// For compatibility with ver 1.1.2 and prior:
			if (null == paramStr && props.containsKey("ScaleFactor."+i)) 
				paramStr = props.getProperty("ScaleFactor."+i);
			
			if (null != paramStr) {
				try	{
					param = StringTools.parseDouble(paramStr);
				} catch (NumberFormatException e) {
					param = Double.parseDouble(paramStr);
				}
			}
			
			param = ensureGoodTransformParam(transMode, param);
			
			settings.add(new SeriesParameters(show, col, transMode, param));
			
		} catch (NumberFormatException e) { }
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
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_Save, fileName);
	if (null == actionEvent)
		return false;
	
	Properties props = new Properties();
	props.setProperty("DescribedSeriesCount", Integer.toString(settings.size()));
	for (int i = 0; i < settings.size(); i++) {
		SeriesParameters series = settings.get(i);
		props.setProperty("Show."+i,	  series.show ? "1" : "0");
		props.setProperty("Colour."+i,	  String.format("%02x%02x%02x", series.colour.getRed(),
																		series.colour.getGreen(),
																		series.colour.getBlue()));
		props.setProperty("TransformMode."+i, series.transMode.toString());
		props.setProperty("TransformParam."+i, StringTools.toString(series.param));		
	}	
	
	try {
		FileOutputStream out = new FileOutputStream(fileName);	
		try { props.storeToXML(out, "LiveGraph version " + LiveGraph.version + ". DataSeriesSettings."); }
		finally { out.close(); }
		notifyObservers(actionEvent);
		return true;
	} catch(IOException e) {
		e.printStackTrace();
		return false;
	}
}

/**
 * Sets whether the data series with the specified index should be included in the plot.
 * 
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @param show {@code true} if the data series with the specified index is to be included in the plot,
 * {@code false} otherwise.
 */
public void setShow(int seriesIndex, boolean show) {
	
	if (seriesIndex < 0)
		return;
	
	if (show == getShow(seriesIndex))
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_Series_Visibility,
																show, seriesIndex, Double.NaN, null);
	if (null == actionEvent)
		return;
	
	ensureLength(seriesIndex);
	settings.get(seriesIndex).show = show;
	notifyObservers(actionEvent);
}

/**
 * Sets whether the data series between the specified indices should be included in the plot.
 * 
 * @param from Starting data series index (inclusive).
 * @param to Finishing data series index (inclusive).
 * @param show {@code true} if the data series with the specified index is to be included in tthe plot,
 * {@code false} otherwise.
 */
public void setShowAll(int from, int to, boolean show) {
	
	from = Math.max(0, from);
	to = Math.max(0, to);
	
	if (from > to) {
		int t = from; from = to; to = t;
	}
	
	Pair<Integer, Integer> bounds = new Pair<Integer, Integer>(from, to);
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_SeriesRange_Visibility,
																false, 0L, Double.NaN, bounds);
	if (null == actionEvent)
		return;
		
	ensureLength(to);
	for (int i = from; i <= to; i++)
		settings.get(i).show = show;
	notifyObservers(actionEvent);
}

/**
 * Toggles whether the data series between the specified indices should be included in the plot.
 * 
 * @param from Starting data series index (inclusive).
 * @param to Finishing data series index (inclusive).
 */
public void setShowToggleAll(int from, int to) {
	
	from = Math.max(0, from);
	to = Math.max(0, to);
	
	if (from > to) {
		int t = from; from = to; to = t;
	}
	
	Pair<Integer, Integer> bounds = new Pair<Integer, Integer>(from, to);
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_SeriesRange_Visibility,
																false, 0L, Double.NaN, bounds);
	if (null == actionEvent)
		return;
		
	ensureLength(to);
	for (int i = from; i <= to; i++)
		settings.get(i).show = !settings.get(i).show;
	notifyObservers(actionEvent);
}

/**
 * Sets the colour for the plot of the data series with the specified index.
 * 
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @param colour The colour for the plot of the data series with the specified index.
 */
public void setColour(int seriesIndex, Color colour) {
	
	if (seriesIndex < 0)
		return;
	
	if (null == colour)
		throw new NullPointerException("Null colour is not allowed.");
	
	if (colour == getColour(seriesIndex))
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_Series_Colour,
																false, seriesIndex, Double.NaN, colour);
	if (null == actionEvent)
		return;
	
	ensureLength(seriesIndex);
	settings.get(seriesIndex).colour = colour;
	notifyObservers(actionEvent);
}

/**
 * Sets the transformation mode for the plotted values of the data series with the specified index.
 *  
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @param transformMode The transformation mode for the plotted values of the data series with
 * the specified index.
 */
public void setTransformMode(int seriesIndex, TransformMode transformMode) {
	
	if (seriesIndex < 0)
		return;
	
	if (null == transformMode)
		throw new NullPointerException("Null transformation mode mode is not allowed.");
	
	if (transformMode == getTransformMode(seriesIndex))
		return;
	
	double p = getTransformParam(seriesIndex);
	double np = ensureGoodTransformParam(transformMode, p);
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_Series_TransformMode,
																false, seriesIndex, np, transformMode);
	if (null == actionEvent)
		return;
	
	if (p != np && null == checkObservers(DSS_Series_TransformParam, false, seriesIndex, np, transformMode))
		return;
	
	ensureLength(seriesIndex);
	
	settings.get(seriesIndex).transMode = transformMode;
	notifyObservers(actionEvent);
	
	if (p != np)
		setTransformParam(seriesIndex, np);	
}

/**
 * Sets the parameter for the transformation of the plotted values of the data
 * series with the specified index; this parameter is currently required only for the
 * mode {@code Transform_ScaleBySetVal};

 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @param parameter The parameter for the transformation of the plotted values of the data series with
 * the specified index.
 */
public void setTransformParam(int seriesIndex, double parameter) {
	
	if (seriesIndex < 0)
		return;
	
	TransformMode transMode = getTransformMode(seriesIndex);
	parameter = ensureGoodTransformParam(transMode, parameter);
	
	if (parameter == getTransformParam(seriesIndex))
		return;
	
	Event<? extends SettingsEvent> actionEvent = checkObservers(DSS_Series_TransformParam,
																false, seriesIndex, parameter, transMode);
	if (null == actionEvent)
		return;
	
	ensureLength(seriesIndex);
	settings.get(seriesIndex).param = parameter;
	
	notifyObservers(actionEvent);
}

/**
 * Setts whether the data series with the specified index should be included in tthe plot.
 * If no setting value has been defined for the specified series, a defalut value will be
 * returned as specified by {@link #getDefaultShow(int)}.
 * 
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @return {@code true} if the data series with the specified index is to be included in tthe plot,
 * {@code false} otherwise.
 * @see #getDefaultShow(int)
 */
public boolean getShow(int seriesIndex) {
	if (seriesIndex < 0 || settings.size() <= seriesIndex)
		return getDefaultShow(seriesIndex);
	return settings.get(seriesIndex).show;
}

/**
 * Gets the colour for the plot of the data series with the specified index.
 * If no setting value has been defined for the specified series, a defalut value will be
 * returned as specified by {@link #getDefaultColour(int)}.
 * 
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @return The colour for the plot of the data series with the specified index.
 * @see #getDefaultColour(int)
 */
public Color getColour(int seriesIndex) {
	if (seriesIndex < 0 || settings.size() <= seriesIndex)
		return getDefaultColour(seriesIndex);
	return settings.get(seriesIndex).colour;
}

/**
 * Gets the transformation mode for the plotted values of the data series with the specified index.
 * If no setting value has been defined for the specified series, a defalut value will be
 * returned as specified by {@link #getDefaultTransformMode(int)}.
 * 
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @return The transformation mode for the plotted values of the data series with the specified index.
 * @see #getDefaultTransformMode(int)
 */
public TransformMode getTransformMode(int seriesIndex) {
	if (seriesIndex < 0 || settings.size() <= seriesIndex)
		return getDefaultTransformMode(seriesIndex);
	return settings.get(seriesIndex).transMode;
}

/**
 * Gets the parameter for the transformation of the plotted values of the data series with
 * the specified index; this parameter is currently required only for the mode {@code Transform_ScaleBySetVal}.
 * If no setting value has been defined for the specified series, a defalut value will be
 * returned as specified by {@link #getDefaultTransformParam(int)}.
 * 
 * @param seriesIndex A data series index (corresponds to the column index in the data file).
 * @return The parameter for the transformation of the plotted values of the data series with
 * the specified index.
 * @see #getDefaultTransformParam(int)
 */
public double getTransformParam(int seriesIndex) {
	if (seriesIndex < 0 || settings.size() <= seriesIndex)
		return getDefaultTransformParam(seriesIndex);
	return settings.get(seriesIndex).param;
}


/**
 * Ensure that the transformation parameter has a legal value for the given
 * transformation mode. The transformation parameter must be a real number and if
 * the transformation mode is {@code Transform_Logarithm}, it must be
 * non-negative and not 1.
 * 
 * @param transformMode The transform mode for which to verify the parameter.
 * @param parameter The transfom parameter to check.
 * @return The corrected transform parameter.
 */
private double ensureGoodTransformParam(TransformMode transformMode, double parameter) {
	
	if (Double.isInfinite(parameter))
		parameter = (parameter > 0. ? 1. : -1.);
	
	if (Double.isNaN(parameter))
		parameter = 0.;

	if (transformMode == TransformMode.Transform_Logarithm) {
		
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

/**
 * This struct-class is used to group the settings for one data series in a single
 * data structure.
 */
private static class SeriesParameters {

	/**
	 * Whether this data series should be shown at all.
	 */
	private boolean show = false;
	
	/**
	 * Colour to use for this series.
	 */
	private Color colour = null;
	
	/**
	 * Transformation mode for series values.
	 */
	private TransformMode transMode = null;
	
	/**
	 * Parameter for series' values transformation. 
	 */
	private double param = Double.NaN;
	
	/**
	 * Creates an uninitialised series settings data structure.
	 */
	private SeriesParameters() {}
	
	/**
	 * Creates an series settings data structure and initialises it with the specified values.
	 * 
	 * @param show Display?
	 * @param colour Line colour.
	 * @param transMode Values transformation.
	 * @param param Transformation parameter.
	 */
	private SeriesParameters(boolean show, Color colour, TransformMode transMode, double param) {
		this.show = show;
		this.colour = colour;
		this.transMode = transMode;
		this.param = param;
	}
} // private class SeriesParameters

} // public class DataSeriesSettings
