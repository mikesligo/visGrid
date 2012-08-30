package org.LiveGraph.plot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.CacheEvent;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.dataCache.DataSeries;
import org.LiveGraph.dataCache.DataSet;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventListener;
import org.LiveGraph.events.EventManager;
import org.LiveGraph.events.EventType;
import org.LiveGraph.settings.DataSeriesSettings;
import org.LiveGraph.settings.GraphSettings;
import org.LiveGraph.settings.ObservableSettings;
import org.LiveGraph.settings.SettingsEvent;
import org.LiveGraph.settings.DataSeriesSettings.TransformMode;
import org.LiveGraph.settings.GraphSettings.HGridType;
import org.LiveGraph.settings.GraphSettings.VGridType;
import org.LiveGraph.settings.GraphSettings.XAxisType;

import com.softnetConsult.utils.collections.Pair;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;
import com.softnetConsult.utils.math.MathTools;
import com.softnetConsult.utils.mutableWrappers.MutableInt;
import com.softnetConsult.utils.sys.SystemTools;


/**
 * This class handles the conversion of the cached data to a screen image and the
 * drawing of the image on a {@code Graphics} object.
 * <br />
 * This class uses an {@code AffineTransform} object to convert the data held in the
 * cache to a data plot in screen coordinates. In order to keep the {@code AffineTransform}
 * object appropriate for the current display at all times a plotter listens to
 * various {@link DataCache} and {@link ObservableSettings} events; in addition it offers
 * a {@link #setScreenSize(int, int)}-method which must be called each time when the
 * canvas-panel that uses the plotter changes its size.
 * <br />
 * Whenever the {@link #dataCache} changes, a plotter uses the current {@link #datScrTransform}
 * object to convert the data from the cache into a plot in screen coordinates according to
 * the current global graph- and series-settings. The screen data obtained this way is locally
 * cached in the {@link #screenDataBuffer} array. This way the data does not need to be
 * re-computed each time the plot must be drawn on the screen.
 * <br />
 * In this version the plotter handles data values transformations required by the display
 * options (if any) on the fly. If new options should be added to the interface, this mechanism
 * should be replaces by a more flexible solution.
 * 
 * <p style="font-size:smaller;">This product includes software developed by the
 *    <strong>LiveGraph</strong> project and its contributors.<br />
 *    (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>)<br />
 *    Copyright (c) 2007-2009 G. Paperin.<br />
 *    All rights reserved.
 * </p>
 * <p style="font-size:smaller;">File: Plotter.java</p> 
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
public class Plotter implements EventListener {

/**
 * Vertical margin.
 */
private static final int VMARGIN = 20;

/**
 * Horisiontal margin.
 */
private static final int HMARGIN = 20;

/*
 * Minimum plot size.
 */
private static final Dimension minScreenSize = new Dimension(150, 100);

/**
 * Y axis colour.
 */
private static final Color VAXIS_COL = Color.BLACK;

/**
 * X axis colour.
 */
private static final Color HAXIS_COL = Color.BLACK;

/**
 * Label font size.
 */
private static final int FONT_SIZE = 9;

/**
 * Gap between axes labels.
 */
private static final int AXES_LBL_GAP = 100;

/**
 * Size of the scale marks on the axes.
 */
private static final int AXES_MARKS_SIZE = 4;

/**
 * Radius for datapoints marks on small graphs.
 */
private static final int DATAPOINT_RAD = 3;

/**
 * The minimum distance between grid lines (in pixels).
 */
private static final int MIN_GRIDLINE_DIST = 3;


/**
 * The data cache. 
 */
private DataCache dataCache = null;

/**
 * Data series settings.
 */
private DataSeriesSettings seriesSetts = null;

/**
 * Graph settings.
 */
private GraphSettings graphSetts = null;


/**
 * Whether anythig at all is to be displayed.
 */
private boolean showAtLeastOneSeries = false;

/**
 * Buffers the screen coordinates of the graphs.
 */
private SeriesScreenData[] screenDataBuffer = null;

/**
 * Used to synchronise of the screen data buffer.
 */
private Object screenDataBufferLock = new Object();

/**
 * Buffers the x coordinates.
 */
private double[] xCoordinates = null;

/**
 * Used for sorting points by x values. 
 */
private PointsByIndexComparator pointsByIndexComparator = null; 


/**
 * Viewable area in data coordinates.
 */
private Rectangle2D.Double dataViewport = null;

/**
 * Screen size in pixels.
 */
private Dimension screenSize = null;

/**
 * Data space to screen space transformation.
 */
private AffineTransform datScrTransform = null;


/**
 * Whether screen data computation is in progress.
 */
private boolean dataComputationRunning = false;

/**
 * Whether screen data computation is in progress.
 */
private boolean pointHighlightComputationRunning = false;

/**
 * Whether the next change of h-grid settings was initiated by this plotter and should
 * therefore be ignored by the plotter's handler.
 */
private boolean selfSettingHGridSize = false;

/**
 * The h-grid size get by a settings change that was not initiated by this
 * plotter itself.
 */
private double userHGridStep = Double.NaN;

/**
 * The actual h-grid step after the consideration of plot size.
 */
private double hGridStep = Double.NaN;

/**
 * Whether the next change of v-grid settings was initiated by this plotter and should
 * therefore be ignored by the plotter's handler.
 */
private boolean selfSettingVGridSize = false;

/**
 * The v-grid size get by a settings change that was not initiated by this
 * plotter itself.
 */
private double userVGridStep = Double.NaN;

/**
 * The actual v-grid step after the consideration of plot size.
 */
private double vGridStep = Double.NaN;


/**
 * Whether dara points close to the mouse position should be highlighted. 
 */
private boolean highlightPoints = true;


/**
 * Creates a plotter for the data held in the specified cache.
 * @param dataCache Cache holding the data to plot.
 */
public Plotter(DataCache dataCache) {
	
	if (null == dataCache)
		throw new NullPointerException("Plotter cannot act on a null cache"); 
	
	this.dataCache = dataCache;
	
	this.seriesSetts = LiveGraph.application().getDataSeriesSettings();
	this.graphSetts = LiveGraph.application().getGraphSettings();
	
	this.resetScreenDataBuffer();
	
	this.xCoordinates = new double[DataCache.CACHE_SIZE];
	this.pointsByIndexComparator = new PointsByIndexComparator();
	
	this.dataViewport = new Rectangle2D.Double();
	this.screenSize = new Dimension(minScreenSize);
	this.datScrTransform = new AffineTransform();
	
	this.dataComputationRunning = false;
	this.pointHighlightComputationRunning = false;
	
	this.selfSettingHGridSize = false;
	this.userHGridStep = graphSetts.getHGridSize();
	this.hGridStep = graphSetts.getHGridSize();
	
	this.selfSettingVGridSize = false;
	this.userVGridStep = graphSetts.getVGridSize();
	this.vGridStep = graphSetts.getVGridSize();
	
	this.computeGridSteps();
	
	this.highlightPoints = true;
	
	this.updateScreenData();
}

/**
 * Gets whether the screen area is large enough to paint the graph.
 * 
 * @return {@code true} iff the screen area is large enough to paint the graph.
 */
public boolean screenTooSmall() {
	return (minScreenSize.height > screenSize.height || minScreenSize.width > screenSize.width);
}

/**
 * Gets whether at least one series is to be plotted.
 * 
 * @return {@code true} if at seast one data series should be plotted, {@code false} otherwise.
 */
public boolean getShowAtLeastOneSeries() {
	return this.showAtLeastOneSeries;
}

/**
 * Paints the previously computed graphs along with the axes, labels, grids and so on to the
 * specified graphics context.
 * @param g Paint context.
 */
public void paint(Graphics g) {
		
	// If screen is to small, just paint a message:	
	if (screenTooSmall()) {
		g.setColor(Color.BLACK);	
		g.setFont(new Font(g.getFont().getName(), g.getFont().getStyle(), FONT_SIZE));
		FontMetrics fMetrics = g.getFontMetrics();
		g.drawString("LiveGraph " + LiveGraph.version, 2, fMetrics.getHeight() + 2);
		g.drawString("Enlarge this window to see the plot.", 2, 2 * fMetrics.getHeight() + 4);
		return;
	}

	
	// If there is nothing to show, just print a message:	
	if (!showAtLeastOneSeries) {
		g.setColor(Color.BLACK);
		g.setFont(new Font(g.getFont().getName(), g.getFont().getStyle(), FONT_SIZE));
		FontMetrics fMetrics = g.getFontMetrics();
		g.drawString("LiveGraph " + LiveGraph.version, 2, fMetrics.getHeight() + 2);
		g.drawString("No data to display.", 2, 2 * fMetrics.getHeight() + 4);
		return;
	}
	
	
	// If data computation is running, do not do anything:	
	if (dataComputationRunning)
		return;
	
	// Now do the actual painting:
	synchronized(screenDataBufferLock) {
		try {
			paintGrids(g);
			paintAxes(g);
			paintData(g);
		}catch (NullPointerException e) {
			; // Discart this weird exception.. Synch problem?
			  // Next redraw- better luck.
		}
	}
	
} // public void paint(Graphics g)


/**
 * Paints the grid.
 * @param g The graphics context.
 */
private void paintGrids(Graphics g) {
	
	// Plot horizontal grid:
	
	if (HGridType.HGrid_Simple == graphSetts.getHGridType()) {
		
		g.setColor(graphSetts.getHGridColour());
		
		double dataViewportBottom = dataViewport.y - dataViewport.height;
		
		double gy = dataViewportBottom + -(dataViewportBottom % hGridStep);
		if (0 <= dataViewportBottom)			
			gy += hGridStep;
		
		Point2D.Double p1 = new Point2D.Double();
		Point2D.Double p2 = new Point2D.Double();
		
		while (gy <= dataViewport.y) {
			
			p1.setLocation(dataViewport.x, gy);
			p2.setLocation(dataViewport.x + dataViewport.width, gy);
			datScrTransform.transform(p1, p1);
			datScrTransform.transform(p2, p2);
			g.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
			gy += hGridStep;
		}
	}
	
	
	// Plot vertical grid if it is alligned at x-axis units:
	
	if (VGridType.VGrid_XAUnitAligned == graphSetts.getVGridType()) {
		
		g.setColor(graphSetts.getVGridColour());
		
		double gx = dataViewport.x + -(dataViewport.x % vGridStep);
		if (0 <= dataViewport.x)
			gx += vGridStep;
		
		Point2D.Double p1 = new Point2D.Double();
		Point2D.Double p2 = new Point2D.Double();
		
		while (gx <= dataViewport.x + dataViewport.width) {
			
			p1.setLocation(gx, dataViewport.y);
			p2.setLocation(gx, dataViewport.y - dataViewport.height);
			datScrTransform.transform(p1, p1);
			datScrTransform.transform(p2, p2);
			g.drawLine((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
			gx += vGridStep;
		}
	}
	
	
	// Plot vertical grid if it is alligned at dataset file indices:
	
	// Get any (e.g. the first) data series which will be drawn:	
	SeriesScreenData firstSeriesVisible = null;
	for (int s = 0; s < screenDataBuffer.length; s++) {
		if (screenDataBuffer[s].doShow) {
			firstSeriesVisible = screenDataBuffer[s];
			break;
		}
	}
	
	if (VGridType.VGrid_DSNumAligned == graphSetts.getVGridType()) {
		
		g.setColor(graphSetts.getVGridColour());
		
		int gy1 = VMARGIN;
		int gy2 = VMARGIN + screenSize.height;
	
		int curDSInd, gx;
		int[] fsvDSIndices = firstSeriesVisible.dsIndices;
		int lastDSInd = fsvDSIndices[0];
		boolean forcePlot = dataViewport.x < (double) lastDSInd;
		
		for (int p = 0; p < firstSeriesVisible.plotPoints; p++) {
			
			curDSInd = firstSeriesVisible.dsIndices[p];
			if (curDSInd - lastDSInd >= vGridStep || forcePlot) {				
				gx = (int) firstSeriesVisible.points[p].x;
				g.drawLine(gx, gy1, gx, gy2);
				lastDSInd = curDSInd;
				forcePlot = false;
			}
			
		}		
	}
} // private void paintGrids


/**
 * Paints the coordinate axes.
 * @param g The graphics context.
 */
private void paintAxes(Graphics g) {
	
	// Setup font:
	
	Font font = g.getFont();
	g.setFont(new Font(font.getName(), font.getStyle(), FONT_SIZE));
	FontMetrics fMetrics = g.getFontMetrics();
	
	// Plot horizontal axis:
	
	int xAxisY = VMARGIN + screenSize.height;
	
	g.setColor(HAXIS_COL);
	g.drawLine(HMARGIN / 2, xAxisY, HMARGIN * 3 / 2 + screenSize.width, xAxisY);
	
	// Find propper rounding:
	Point h1s = new Point(HMARGIN, xAxisY);
	Point h2s = new Point(HMARGIN * 3 / 2 + screenSize.width, xAxisY);
	Point2D.Double h1d = screenToDataPoint(h1s);
	Point2D.Double h2d = screenToDataPoint(h2s);
	double hDiff = Math.abs(h1d.x - h2d.x);
	int roundExpH = -1 + (int) Math.rint(MathTools.log(10.0, hDiff));
	String formatH = "%.0f";
	if (roundExpH < 0)
		formatH = "%." + (-roundExpH) + "f";
	
	boolean xAxisTime = (graphSetts.getXAxisType() == XAxisType.XAxis_DataValSecsToSetPower); 
	
	// Find location for the first label (after the one that is directly on the axes cross):
	h1s.setLocation(HMARGIN, xAxisY);
	h1d = screenToDataPoint(h1s);
	
	h2s.setLocation(HMARGIN + AXES_LBL_GAP * (xAxisTime ? 2 : 1), xAxisY);
	h2d = screenToDataPoint(h2s);
	
	h2d.setLocation(MathTools.round(h2d.x, roundExpH), h2d.y);
	datScrTransform.transform(h2d, h2s);
	int firstHLabelXS = h2s.x;
	double firstHLabelXD = h2d.x;
	
	// Find label gap for all subsequent labels:
	h1s.setLocation(h2s);
	h2s.setLocation(h2s.x + AXES_LBL_GAP * (xAxisTime ? 2 : 1), xAxisY);
	h2d = screenToDataPoint(h2s);
	h2d.setLocation(MathTools.round(h2d.x, roundExpH), h2d.y);
	datScrTransform.transform(h2d, h2s);
	int xAxisLabelGap = h2s.x - h1s.x;
	if (0 >= xAxisLabelGap)
		xAxisLabelGap = AXES_LBL_GAP * (xAxisTime ? 2 : 1);
	
	// Paint labels:
	int lh = 0; 
	while(lh < 50) { // Something keeps going wrong, so provide an exit condition

		String lbl;
		if (0 == lh) {
			h1s.setLocation(HMARGIN, xAxisY);
			h1d = screenToDataPoint(h1s);
			
			if (xAxisTime) {
				long d = Math.round(h1d.x * 1000.0);
				if (d > 185542587187199999L)
					lbl = "more than " + (h1d.x < 0. ? "-" : "") + Integer.MAX_VALUE + "days";
				else
					lbl = (h1d.x < 0. ? "-" : "") + SystemTools.formatTimePeriod(0L, d);
				
			} else {
				StringBuffer b = new StringBuffer(String.format("%f", h1d.x));
				int bl = b.length();
				while(0 < bl && '0' == b.charAt(bl - 1))
					b.setLength(--bl);
				
				if (0 == bl || !Character.isDigit(b.charAt(bl - 1)))
					b.append('0');
		
				lbl = b.toString();
			}
			
		} else if (1 == lh) {
			h1s.setLocation(firstHLabelXS, xAxisY);
			h1d.setLocation(firstHLabelXD, h1d.y);
			if (xAxisTime) {
				long d = Math.round(h1d.x * 1000.0);
				if (d > 185542587187199999L)
					lbl = "more than " + (h1d.x < 0. ? "-" : "") + Integer.MAX_VALUE + "days";
				else
					lbl = (h1d.x < 0. ? "-" : "") + SystemTools.formatTimePeriod(0L, d);
			} else { 
				lbl = String.format(formatH, h1d.x);
			}
			
		} else {
			h2s.setLocation(h1s);
			h1s.setLocation(h1s.x + xAxisLabelGap, xAxisY);
			h1d = screenToDataPoint(h1s);
			h1d.setLocation(MathTools.round(h1d.x, roundExpH), h1d.y);
			datScrTransform.transform(h1d, h1s);
			
			int abort = 50; // Something keeps going wrong, so provide an exit condition
			while(h1s.x == h2s.x && abort > 0) {
				h1d.setLocation(MathTools.round(h1d.x + Math.pow(10.0, roundExpH), roundExpH), h1d.y);
				datScrTransform.transform(h1d, h1s);
				abort--;
			}
			
			if (xAxisTime) {
				long d = Math.round(h1d.x * 1000.0);
				if (d > 185542587187199999L)
					lbl = "more than " + (h1d.x < 0. ? "-" : "") + Integer.MAX_VALUE + "days";
				else
					lbl = (h1d.x < 0. ? "-" : "") + SystemTools.formatTimePeriod(0L, d);
			} else { 
				lbl = String.format(formatH, h1d.x);
			}
		}
		
		if (h1s.x + 2 + fMetrics.stringWidth(lbl) + 2 > HMARGIN * 2 + screenSize.width)
			break;
		if (HMARGIN < h1s.x)
			g.drawLine(h1s.x, xAxisY - AXES_MARKS_SIZE / 2, h1s.x, xAxisY + AXES_MARKS_SIZE / 2);				
		g.drawString(lbl, h1s.x + 2, xAxisY + AXES_MARKS_SIZE / 2 + fMetrics.getHeight());
		lh++;
	} // while(lh < 1000)
	
	
	// Plot vertical axis:
	
	int yAxisX = HMARGIN;
	
	g.setColor(VAXIS_COL);
	g.drawLine(yAxisX, VMARGIN * 3 / 2 + screenSize.height, yAxisX, VMARGIN / 2);
	
	// Find propper rounding:
	Point v1s = new Point(yAxisX, VMARGIN + screenSize.height);
	Point v2s = new Point(yAxisX, VMARGIN / 2);
	Point2D.Double v1d = screenToDataPoint(v1s);
	Point2D.Double v2d = screenToDataPoint(v2s);
	double vDiff = Math.abs(v1d.y - v2d.y);
	int roundExpV = -1 + (int) Math.rint(MathTools.log(10.0, vDiff));
	String formatV = "%.0f";
	if (roundExpV < 0)
		formatV = "%." + (-roundExpV) + "f";
	
	
	// Find location for the first label (after the one that is directly on the axes cross):
	v1s.setLocation(yAxisX, VMARGIN + screenSize.height);
	v1d = screenToDataPoint(v1s);
	
	v2s.setLocation(yAxisX, VMARGIN + screenSize.height - AXES_LBL_GAP);
	v2d = screenToDataPoint(v2s);
	
	v2d.setLocation(v2d.x, MathTools.round(v2d.y, roundExpV));
	datScrTransform.transform(v2d, v2s);
	int firstVLabelYS = v2s.y;
	double firstVLabelYD = v2d.y;
	
	// Find label gap for all subsequent labels:
	v1s.setLocation(v2s);
	v2s.setLocation(yAxisX, v2s.y - AXES_LBL_GAP);
	v2d = screenToDataPoint(v2s);
	v2d.setLocation(v2d.x, MathTools.round(v2d.y, roundExpV));
	datScrTransform.transform(v2d, v2s);
	int yAxisLabelGap = v2s.y - v1s.y;
	if (0 >= yAxisLabelGap)
		yAxisLabelGap = AXES_LBL_GAP;
	
	// Paint labels:
	int lv = 0; 
	while(lv < 50) { // Something keeps going wrong, so provide an exit condition

		String lbl;
		if (0 == lv) {
			v1s.setLocation(yAxisX, VMARGIN + screenSize.height);
			v1d = screenToDataPoint(v1s);
			
			StringBuffer b = new StringBuffer(String.format("%f", v1d.y));
			int bl = b.length();
			while(0 < bl && '0' == b.charAt(bl - 1))
				b.setLength(--bl);
			
			if (0 == bl || !Character.isDigit(b.charAt(bl - 1)))
				b.append('0');
	
			lbl = b.toString();
			
		} else if (1 == lv) {
			v1s.setLocation(yAxisX, firstVLabelYS);
			v1d.setLocation(v1d.x, firstVLabelYD);
			lbl = String.format(formatV, v1d.y);
			
		} else {
			v2s.setLocation(v1s);
			v1s.setLocation(yAxisX, v1s.y - yAxisLabelGap);
			v1d = screenToDataPoint(v1s);
			v1d.setLocation(v1d.x, MathTools.round(v1d.y, roundExpV));
			datScrTransform.transform(v1d, v1s);
			
			int abort = 50; // Something keeps going wrong, so provide an exit condition
			while(v1s.y == v2s.y && abort > 0) {
				v1d.setLocation(v1d.x, MathTools.round(v1d.y + Math.pow(10.0, roundExpV), roundExpV));
				datScrTransform.transform(v1d, v1s);
				abort--;
			}
			
			lbl = String.format(formatV, v1d.y);
		}
		
		if (v1s.y - 2 - fMetrics.getHeight() - 2 < 0)
			break;
		
		if (VMARGIN + screenSize.height > v1s.y)
			g.drawLine(yAxisX - AXES_MARKS_SIZE / 2, v1s.y, yAxisX + AXES_MARKS_SIZE / 2, v1s.y);
		
		g.drawString(lbl, yAxisX + AXES_MARKS_SIZE / 2 + 2, v1s.y - 2);
		
		lv++;
	} // while(lv < 1000)
	
	
	
} // private void paintAxes


/**
 * Paints the data series.
 * @param g The graphics context.
 */
private void paintData(Graphics g) {
	
	// Get any (e.g. the first) data series which will be drawn:
	if (null == screenDataBuffer)
		return;
	SeriesScreenData firstSeriesVisible = null;
	for (int s = 0; s < screenDataBuffer.length; s++) {
		if (screenDataBuffer[s].doShow) {
			firstSeriesVisible = screenDataBuffer[s];
			break;
		}
	}
	
	// Plot data:	
	boolean drawPoints = true;
	if (0 < firstSeriesVisible.plotPoints)
		drawPoints = (screenSize.width / firstSeriesVisible.plotPoints > 4 * DATAPOINT_RAD);
	
	SeriesScreenData series = null;
	for (int s = 0; s < screenDataBuffer.length; s++) {
		
		series = screenDataBuffer[s];
		if (!series.doShow)
			continue;
		
		g.setColor(series.colour);
		
		Point2D.Double[] points = series.points;
		int x1 = (int) points[0].x;
		int y1 = (int) points[0].y;
		int x2, y2;
		boolean connect = true;
		for (int p = 0; p < series.plotPoints; p++) {	
			if (Double.isNaN(points[p].x) || Double.isNaN(points[p].y)
					|| Double.isInfinite(points[p].x) || Double.isInfinite(points[p].y)) {
				connect = false;
				continue;				
			}			
			x2 = (int) points[p].x;
			y2 = (int) points[p].y;
			if (!connect) {
				x1 = x2;
				y1 = y2;
				connect = true;
			}
			g.drawLine(x1, y1, x2, y2);
			if (drawPoints) {
				g.drawLine(x2 - DATAPOINT_RAD, y2 - DATAPOINT_RAD, x2 + DATAPOINT_RAD, y2 + DATAPOINT_RAD);
				g.drawLine(x2 - DATAPOINT_RAD, y2 + DATAPOINT_RAD, x2 + DATAPOINT_RAD, y2 - DATAPOINT_RAD);
				g.drawLine(x2, y2 + DATAPOINT_RAD, x2, y2 - DATAPOINT_RAD);
				g.drawLine(x2 - DATAPOINT_RAD, y2, x2 + DATAPOINT_RAD, y2);
			}
			if (series.hlPoints[p]) {
				g.drawOval(x2 - DATAPOINT_RAD - 1, y2 - DATAPOINT_RAD - 1, 2 + 2 * DATAPOINT_RAD, 2 + 2 * DATAPOINT_RAD);
			}
			x1 = x2;
			y1 = y2;
		}
	}
} // private void paintData


/**
 * Computes the screen coordinates for the visible data series.
 */
private synchronized void computeScreenData() {
	
	if (dataComputationRunning)
		return;
	
	if (screenTooSmall())
		return;
	
	if (null == screenDataBuffer)
		return;
	
	dataComputationRunning = true;
	
	computeXCoordinates();
	
	showAtLeastOneSeries = false;
	for (int s = 0; s < screenDataBuffer.length; s++) {
		
		if (!seriesSetts.getShow(s)) {
			screenDataBuffer[s].doShow = false;
			continue;
		}
		
		screenDataBuffer[s].doShow = true;
		showAtLeastOneSeries = true;
		computeScreenDataForSeries(s);		
	}
	
	dataComputationRunning = false;
}

/**
 * Compute the x coordinates in data space according to the current settings.
 */
private void computeXCoordinates() {
	
	// If the option is to use a data series, but the index is invalid, we default to dataset numbers:
	
	synchronized(dataCache) {
		
		XAxisType xAxisType = graphSetts.getXAxisType();
		int xSerInd = -1;
		if (XAxisType.XAxis_DSNum != xAxisType) {
			xSerInd = graphSetts.getXAxisSeriesIndex();		
			if (0 > xSerInd || dataCache.countDataSeries() <= xSerInd)
				xAxisType = XAxisType.XAxis_DSNum; 		
		}
		
		// Now we can follow the secure option:
		
		int dataLen = dataCache.countDataSets();
		
		switch(xAxisType) {
			
			case XAxis_DSNum:			
				for (int i = 0; i < dataLen; i++)
					xCoordinates[i] = dataCache.getDataSet(i).getDataFileIndex();
				break;			
				
			case XAxis_DataValSimple:
				for (int i = 0; i < dataLen; i++)
					xCoordinates[i] = dataCache.getDataSet(i).getValue(xSerInd);
				break;
				
			case XAxis_DataValScaleBySetVal:
				double scaleFactor = graphSetts.getXAxisParamValue();
				for (int i = 0; i < dataLen; i++)
					xCoordinates[i] = dataCache.getDataSet(i).getValue(xSerInd) * scaleFactor;
				break;
				
			case XAxis_DataValTrans0to1:
				DataSeries xSer = dataCache.getDataSeries(xSerInd);
				double transfShift = xSer.getMinValue();
				double transfScale = xSer.getMaxValue() - transfShift;
				transfScale = (0 == transfScale ? 0. : 1. / transfScale);
				for (int i = 0; i < dataLen; i++)
					xCoordinates[i] = (dataCache.getDataSet(i).getValue(xSerInd) - transfShift) * transfScale;
				break;
				
			case XAxis_DataValLogToSetBase:
				double base = graphSetts.getXAxisParamValue();
				for (int i = 0; i < dataLen; i++)
					xCoordinates[i] = MathTools.log(base, dataCache.getDataSet(i).getValue(xSerInd));
				break;
				
			case XAxis_DataValSecsToSetPower:
				double power = graphSetts.getXAxisParamValue();
				double secondsFactor = Math.pow(10.0, power);
				for (int i = 0; i < dataLen; i++)
					xCoordinates[i] = dataCache.getDataSet(i).getValue(xSerInd) * secondsFactor;
				break;
				
			default:
				throw new UnexpectedSwitchCase(xAxisType);
		} // switch(xAxisType)
	} // synchronized(dataCache)
}

/**
 * Compute the screen coordinates for the specified series.
 * 
 * @param seriesIndex The cache index of the series to be computed.
 */
private void computeScreenDataForSeries(int seriesIndex) {
	
	boolean dataComputationWasRunning = dataComputationRunning;
	dataComputationRunning = true;
	
	// Preset data:
	SeriesScreenData scrData = screenDataBuffer[seriesIndex];
	scrData.plotPoints = 0;	
	int sp = 0;
	synchronized(dataCache) {
		int dataPointCount = dataCache.countDataSets();
		
		// Look at each data point of the series:
		double x, y;
		DataSet ds;	
		for (int dp = 0; dp < dataPointCount; dp++) {
			
			// Get raw Y and X:
			ds = dataCache.getDataSet(dp);
			y = ds.getValue(seriesIndex);		
			y = scrData.transformer.transf(y);
			x = xCoordinates[dp];
			
			// Transform the point to screen coordinates:
			scrData.dsIndices[sp] = ds.getDataFileIndex();
			scrData.points[sp].y = y;
			scrData.points[sp].x = x;
			datScrTransform.transform(scrData.points[sp], scrData.points[sp]);
			
			// Save point index for latter sorting:
			scrData.sortedPoints[sp].value = sp;
			
			sp++;
		}
	} // synchronized(dataCache)
	
	// Save the number of points actually computed:
	scrData.plotPoints = sp;
	
	// Sort points for fast access when highlighting with the mouse:
	if (highlightPoints) {
		Arrays.fill(scrData.hlPoints, 0, sp, false);
		pointsByIndexComparator.setSeries(scrData);
		Arrays.sort(scrData.sortedPoints, 0, sp, pointsByIndexComparator);
	}
	
	dataComputationRunning = dataComputationWasRunning;
}


/**
 * Highlights the points around the specified point.
 * This is normally called when the mouse is moved over the plotter canvas.
 * 
 * @param sp A marker screen point.
 * @return A list of series indices on which at least one point was highlighted.
 */
public List<Integer> highlightAround(Point sp) {
	
	// If highlighting should not be done for a reason, we do not highlight anything:
	if (pointHighlightComputationRunning || dataComputationRunning || !highlightPoints) {
		List<Integer> hlSeries = Collections.emptyList();
		return hlSeries;
	}
	
	pointHighlightComputationRunning = true;
	
	List<Integer> hlSeries = new ArrayList<Integer>();
	
	// Get the rectabgle within which points will be highlighted:
	Rectangle sRect = new Rectangle(sp.x - DATAPOINT_RAD - 1, sp.y - DATAPOINT_RAD - 1,
									1 + 2 * (DATAPOINT_RAD + 1),1 + 2 * (DATAPOINT_RAD + 1));
	
	// Look for points to highlight on each series:
	SeriesScreenData series;
	for (int s = 0; s < screenDataBuffer.length; s++) {
		
		series = screenDataBuffer[s];
		if (0 == series.plotPoints)
			continue;
		
		// Skip series which are not plotted:
		if (null == series || !series.doShow)
			continue;
		
		// Clear highlight flags fopr all points of the series:
		boolean hlThisSeries = false;
		Arrays.fill(series.hlPoints, 0, series.plotPoints, false);
		
		// Find index at which the marker point would be inserted into the x-sorted series points array: 
		pointsByIndexComparator.setSeries(series);
		series.points[DataCache.CACHE_SIZE].setLocation(sp.x, sp.y);
		int mi = Arrays.binarySearch(series.sortedPoints, 0, series.plotPoints,
									 new MutableInt(DataCache.CACHE_SIZE), pointsByIndexComparator);
		if (0 > mi)  mi = -mi;
		
		// Extend array index to the left to include all points within the selection rectangle:
		int li = mi;
		if (li >= series.plotPoints) {
			li = series.plotPoints - 1;
		} else {
			while (0 <= li && series.points[series.sortedPoints[li].value].x >= sRect.x)
				li--;
			if (-1 == li) li = 0;
		}
		
		// Extend array index to the right to include all points within the selection rectangle:
		int ri = mi;
		int sRectRB = sRect.x + sRect.width;
		while (0 <= ri && ri < series.plotPoints && series.points[series.sortedPoints[ri].value].x <= sRectRB)
			ri++;
		if (ri >= series.plotPoints) ri = series.plotPoints - 1;
		
		// Now loop through the points within the determined index boundaries:
		for (int i = li; i <= ri; i++) {
		
			// Highlight a point iff it actually lies within the selection rectangle:
			if (sRect.contains(series.points[series.sortedPoints[i].value])) {
				series.hlPoints[series.sortedPoints[i].value] = true;
				hlThisSeries = true;
			}			
		}

		// If at least one point on the series was highlighted,
		// than we add the series index to the highlighted series list:
		if (hlThisSeries)
			hlSeries.add(s);
		
	}
	
	// Done:
	pointHighlightComputationRunning = false;
	return hlSeries;
}

/**
 * Computes the actual grid mesh sizes taking in account the current plot size.
 */
private void computeGridSteps() {
	
	// For horizontal grid:
	
	if (HGridType.HGrid_Simple == graphSetts.getHGridType()) {
		
		boolean hStepChanged = false;
		
		if (hGridStep != userHGridStep) {
			hGridStep = userHGridStep;
			hStepChanged = true;
		}
		
		if (hGridStep < 0.0) {
			hGridStep = -hGridStep;
			hStepChanged = true;
		}
				 
		double minHGridStep = dataViewport.height * MIN_GRIDLINE_DIST / screenSize.height;
		if (hGridStep < minHGridStep
				&& !Double.isInfinite(dataViewport.height) && 0. != dataViewport.height) {
			
			hGridStep = minHGridStep;
			double rounded = MathTools.round(hGridStep, -3);
			if (rounded < hGridStep)
				hGridStep = MathTools.round(rounded + 0.001, -3);
			else
				hGridStep = rounded;
			
			hStepChanged = true;
		}
		
		if (hStepChanged) {
			selfSettingHGridSize = true;
			graphSetts.setHGridSize(hGridStep);
			selfSettingHGridSize = false;
		}
	}
	
	// For vertical grid if it is x-axis unit-alligned:
	
	if (VGridType.VGrid_XAUnitAligned == graphSetts.getVGridType()) {
		
		boolean vStepChanged = false;
		
		if (vGridStep != userVGridStep) {
			vGridStep = userVGridStep;
			vStepChanged = true;
		}
		
		if (vGridStep < 0.0) {
			vGridStep = -vGridStep;
			vStepChanged = true;
		}
				 
		double minVGridStep = dataViewport.width * MIN_GRIDLINE_DIST / screenSize.width;
		if (vGridStep < minVGridStep
				&& !Double.isInfinite(dataViewport.width) && 0. != dataViewport.width) {
			
			vGridStep = minVGridStep;
			double rounded = MathTools.round(vGridStep, -3);
			if (rounded < vGridStep)
				vGridStep = MathTools.round(rounded + 0.001, -3);
			else
				vGridStep = rounded;
			
			vStepChanged = true;
		}
		
		if (vStepChanged) {
			selfSettingVGridSize = true;
			graphSetts.setVGridSize(vGridStep);
			selfSettingVGridSize = false;
		}
	}
	
	// For vertical grid if it is dataset-alligned:
	
	if (VGridType.VGrid_DSNumAligned == graphSetts.getVGridType()) {
		
		boolean vStepChanged = false;
		
		if (vGridStep != userVGridStep) {
			vGridStep = userVGridStep;
			vStepChanged = true;
		}
		
		double rounded = Math.rint(vGridStep);
		if (rounded != vGridStep) {
			vGridStep = rounded;
			vStepChanged = true;
		}
		
		if (vGridStep < 0.0) {
			vGridStep = -vGridStep;
			vStepChanged = true;
		}
		
		if (vGridStep == 0.0) {
			vGridStep = 1.;
			vStepChanged = true;
		}
		
		if (vStepChanged) {
			selfSettingVGridSize = true;
			graphSetts.setVGridSize(vGridStep);
			selfSettingVGridSize = false;
		}
	}
} // private void computeGridSteps()

/**
 * Map the specified point in screen coordinates into the data space.
 * 
 * @param sp A point in screen coordinates.
 * @return The corresponding data point.
 */
public Point2D.Double screenToDataPoint(Point sp) {
	
	Point2D.Double dp = new Point2D.Double();
	try {
		datScrTransform.inverseTransform(sp, dp);
	} catch(NoninvertibleTransformException e) {
		dp.setLocation(0, 0);
	}
	return dp;
}

/**
 * Updates the data to screen transform map according to the currently visible data area and screen size.
 */
private void updateDatScrTransform() {
	
	datScrTransform.setToIdentity();
	
	datScrTransform.translate(HMARGIN, (screenSize.height + VMARGIN));
	datScrTransform.scale(1, -1);
	datScrTransform.scale(screenSize.width / dataViewport.width, screenSize.height / dataViewport.height);
	datScrTransform.translate(-dataViewport.x, dataViewport.height - dataViewport.y);
}


/**
 * Reallocates the screen data buffer.
 */
private void resetScreenDataBuffer() {
	synchronized(screenDataBufferLock) {
		showAtLeastOneSeries = false;
		screenDataBuffer = new SeriesScreenData[dataCache.countDataSeries()];
		for (int s = 0; s < screenDataBuffer.length; s++) {
			screenDataBuffer[s] = new SeriesScreenData(s);
			screenDataBuffer[s].colour = seriesSetts.getColour(s);
			updateSeriesTransformer(s);
		}
	}
}


/**
 * First, recomputes the currently visible data area according to the current graph and series settings;
 * then, computes the screen coordinates for the visible data series.
 *
 */
private void updateScreenData() {
	resetDataViewport();
	computeScreenData();
}

/**
 * Updates the Transformer for the specified series (Transformer is the object that applies the
 * data transformation set in the series settings).
 * 
 * @param seriesIndex The series index for which the Transformer must be updated.
 */
private void updateSeriesTransformer(final int seriesIndex) {
	
	if (null == screenDataBuffer)
		return;
	
	if (seriesIndex < 0 || screenDataBuffer.length <= seriesIndex)
		return;
	
	SeriesScreenData serData = screenDataBuffer[seriesIndex];
	if (null == serData)
		return;
	
	TransformMode transformMode = seriesSetts.getTransformMode(seriesIndex);
	switch (transformMode) {
		case Transform_None:			serData.transformer = IDTransform;
										break;
										
		case Transform_ScaleBySetVal:	final double f = seriesSetts.getTransformParam(seriesIndex);
										serData.transformer = new Transformer() {
											public final double transf(final double v) { return v * f; }
										};
										break;
										
		case Transform_In0to1:			synchronized(dataCache) {
											if (0 <= seriesIndex && seriesIndex < dataCache.countDataSeries()) {
												DataSeries dSer = dataCache.getDataSeries(seriesIndex);
												double serMax = dSer.getMaxValue();
												final double shift = dSer.getMinValue();
												final double scale = (0. == (serMax - shift)
																		? 0.
																		: 1. / (serMax - shift));
												serData.transformer = new Transformer() {
													public final double transf(final double v) {
														return (v - shift) * scale;
													}
												};
											} else {
												serData.transformer = new Transformer() {
													public final double transf(final double v) {
														return 0.5;
													}
												};
											}
										}
										break;
										
		case Transform_Logarithm:		final double b = seriesSetts.getTransformParam(seriesIndex);
										serData.transformer = new Transformer() {
											public final double transf(final double v) {
												return MathTools.log(b, v);
											}
										};
										break;
										
		default:						throw new UnexpectedSwitchCase(transformMode);
	}
}

/**
 * Recomputes the currently visible data area according to the current graph and series settings.
 */
private void resetDataViewport() {
	
	// If current screen is too small we dont compute:
	if (screenTooSmall())
		return;
	
	// If computation is running, we do not compute any more:
	if (dataComputationRunning)
		return;
	
	// Determine minY according to the options:
	double minY = graphSetts.getMinY();
	if (Double.isNaN(minY)) {
		
		minY = Double.MAX_VALUE;
		synchronized(dataCache) {
			int serCnt = Math.min(dataCache.countDataSeries(), screenDataBuffer.length);
			for (int s = 0; s < serCnt; s++) {
				
				if (!seriesSetts.getShow(s))
					continue;
				
				double v = screenDataBuffer[s].transformer.transf(dataCache.getDataSeries(s).getMinValue());
				if (v < minY && !Double.isInfinite(v))
					minY = v;
			}
		}
	}
	
	// Determine maxY according to the options:
	double maxY = graphSetts.getMaxY();
	if (Double.isNaN(maxY)) {		
		
		maxY = -Double.MAX_VALUE;
		synchronized(dataCache) {
			int serCnt = Math.min(dataCache.countDataSeries(), screenDataBuffer.length);
			for (int s = 0; s < serCnt; s++) {
				
				if (!seriesSetts.getShow(s))
					continue;
				
				double v = screenDataBuffer[s].transformer.transf(dataCache.getDataSeries(s).getMaxValue());
				if (v > maxY && !Double.isInfinite(v))
					maxY = v;
			}
		}
	}
	
	// Determine minX and maxX accodring to the options:
	double minX = graphSetts.getMinX();
	double maxX = graphSetts.getMaxX();
	
	// Get the X-Axis type:
	XAxisType xAxisType = graphSetts.getXAxisType();
	
	// If minX or maxX are automatic and according to some data value (i.e. not dataset number):
	if ( (Double.isNaN(minX) || Double.isNaN(maxX) ) && xAxisType != XAxisType.XAxis_DSNum) {
				
		// Check that x-axis data series index is valid and fetch min & max values:
		int xAxisSerIndex = graphSetts.getXAxisSeriesIndex();
		DataSeries xSer = null;
		double dsMinX = Double.NaN;
		double dsMaxX = Double.NaN;
		synchronized(dataCache) {
			if (0 <= xAxisSerIndex && dataCache.countDataSeries() > xAxisSerIndex) {
				xSer = dataCache.getDataSeries(xAxisSerIndex);
				dsMinX = xSer.getMinValue();
				dsMaxX = xSer.getMaxValue();
			}
        }
		// If x-axis data series index is valid:
		if (null != xSer) {
			switch(xAxisType) {
				
				// X axis is an unscaled data series:
				case XAxis_DataValSimple:
					if (Double.isNaN(minX))
						minX = dsMinX;
					if (Double.isNaN(maxX))
						maxX = dsMaxX;
					break;
					
				// X axis is a data series transformed into [0..1]:
				case XAxis_DataValTrans0to1:
					if (Double.isNaN(minX))
						minX = 0;
					if (Double.isNaN(maxX))
						maxX = 1;
					break;
				
				// X axis is a data series scaled by a set value:
				case XAxis_DataValScaleBySetVal:
					double scaleF = graphSetts.getXAxisParamValue();
					if (Double.isNaN(minX))
						minX = dsMinX * scaleF;
					if (Double.isNaN(maxX))
						maxX = dsMaxX * scaleF;
					break;
					
				// X axis is a the logarithm of a data series to a set base:
				case XAxis_DataValLogToSetBase:
					double base = graphSetts.getXAxisParamValue();
					if (Double.isNaN(minX)) {
						double v = MathTools.log(base, dsMinX); 
						minX = (Double.isInfinite(v) || Double.isNaN(v) ? minX : v);
					}
					if (Double.isNaN(maxX)) {
						double v = MathTools.log(base, dsMaxX);
						maxX = (Double.isInfinite(v) || Double.isNaN(v) ? maxX : v);
					}
					break;
					
				// X axis is seconds as data series values tken to a set power of 10:
				case XAxis_DataValSecsToSetPower:
					double power = graphSetts.getXAxisParamValue();
					double factor = Math.pow(10.0, power);
					if (Double.isNaN(minX))
						minX = dsMinX * factor;
					if (Double.isNaN(maxX))
						maxX = dsMaxX * factor;
					break;
				
				default:
					throw new UnexpectedSwitchCase(xAxisType);
			} // switch(graphSetts.getXAxisType())
						
		} // if (null != xSer)
	} // if minX or maxX are automatic and according to some data value (i.e. not dataset number)
	
	// Now minX and maxX can only be NaN in one of the following cases:
	//   - x axis type is XAxis_DSNum (dataset number)
	//   - x axis series index is invalid
	//   - xSer.getMinValue or xSer.getMaxValue returned NaN
	//   - transformation of the x-axis returned infinity or NaN
	// In all cases we do the same thing: default to dataset index:
	
	if (Double.isNaN(minX))
		minX = dataCache.getMinDataFileIndex();
	if (Double.isNaN(maxX))
		maxX = dataCache.getMaxDataFileIndex();
	
	// If the X-boundaries are equal - shift them apart:
	if (minX == maxX) {
		if (0.0 == minX)	{ minX = -0.1; maxX = 0.1; }
		if (0.0 < minX)		{ minX = 0.0;  maxX *= 1.1; }
		if (0.0 > minX)		{ minX *= 1.1; maxX = 0.0; }
	}
	
	// If the X-boundaries are the wrong way around - swap them:
	if (minX > maxX) {
		double t = maxX; maxX = minX; minX = t;
	}
	
	// If the Y-boundaries are equal - shift them apart:
	if (minY == maxY) {
		if (0.0 == minY)	{ minY = -0.1; maxY = 0.1; }
		if (0.0 < minY)		{ minY = 0.0;  maxY *= 1.1; }
		if (0.0 > minY)		{ minY *= 1.1; maxY = 0.0; }
	}
	
	// If the Y-boundaries are the wrong way around - swap them:
	if (minY > maxY) {
		double t = maxY; maxY = minY; minY = t;
	}
	
	dataViewport.setRect(minX, maxY, maxX - minX, maxY - minY);
	updateDatScrTransform();
	computeGridSteps();
} // private void resetDataViewport()


/**
 * Set the current view screen size. 
 * @param width Canvas width in pixels.
 * @param height Canvas height in pixels
 */
public void setScreenSize(int width, int height) {
	
	if (dataComputationRunning)
		return;
	
	screenSize.width = width - (HMARGIN << 1);
	screenSize.height = height - (VMARGIN << 1);
	updateDatScrTransform();
	computeScreenData();
	computeGridSteps();
}

/**
 * Gets canvas screen size (X).
 * 
 * @return Canvas screen size (X).
 */
public int getScreenWidth() {
	return screenSize.width + (HMARGIN << 1);
}

/**
 * Gets canvas screen size (Y).
 * 
 * @return Canvas screen size (Y).
 */
public int getScreenHeight() {
	return screenSize.height + (VMARGIN << 1);
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
	
	if (event.getDomain() == SettingsEvent.class) {
		processSettingsEvent(event.cast(SettingsEvent.class));
		return;
	}
	
	if (event.getDomain() == CacheEvent.class) {
		processCacheEvent(event.cast(CacheEvent.class));
		return;
	}
}

/**
 * Calls the neccesary recomputations when graph settings or series settings have changed.
 * 
 * @param event Describes the change event.
 */
private void processSettingsEvent(Event<SettingsEvent> event) {
	
	int seriesIndex;
	
	switch(event.getType()) {
		
		case DSS_Load:
			DataSeriesSettings dss = LiveGraph.application().getDataSeriesSettings();
			for (int s = 0; s < screenDataBuffer.length; s++) {
				screenDataBuffer[s].colour = dss.getColour(s);
				updateSeriesTransformer(s);
			}
			updateScreenData();
			break;
			
		case DSS_SeriesRange_Visibility:
			Pair range = (Pair) event.getInfoObject();
			int from = (Integer) range.elem1;
			int to = (Integer) range.elem2;
			for (int s = from; s <= to && s < screenDataBuffer.length; s++)
				updateSeriesTransformer(s);
			break;
			
		case DSS_Series_Visibility:
		case DSS_Series_TransformMode:
			seriesIndex = (int) event.getInfoLong();
			updateSeriesTransformer(seriesIndex);
			updateScreenData();	
			break;
			
		case DSS_Series_Colour:
			synchronized(screenDataBufferLock) {
				seriesIndex = (int) event.getInfoLong();
				if (0 >= seriesIndex && seriesIndex < screenDataBuffer.length) {
					screenDataBuffer[seriesIndex].colour = (Color) event.getInfoObject();
				}
			}
			break;
			
		case DSS_Series_TransformParam:
			seriesIndex = (int) event.getInfoLong();
			TransformMode transformMode = (TransformMode) event.getInfoObject();
			if (TransformMode.Transform_ScaleBySetVal == transformMode
					|| TransformMode.Transform_Logarithm == transformMode) {
				updateSeriesTransformer(seriesIndex);
				updateScreenData();
			}
			break;
			
		case GS_Load:
			if (!selfSettingVGridSize) {
				userVGridStep = graphSetts.getVGridSize();
				userHGridStep = graphSetts.getHGridSize();
				computeGridSteps();
			}
			updateScreenData();
			highlightPoints = graphSetts.getHighlightDataPoints();
			highlightAround(new Point(-1, -1));
			break;
			
		case GS_MinY:
		case GS_MaxY:
		case GS_MinX:
		case GS_MaxX:
			updateScreenData();
			break;
			
		case GS_VGridType:
		case GS_VGridSize:
			if (!selfSettingVGridSize) {
				userVGridStep = graphSetts.getVGridSize();
				computeGridSteps();
			}
			break;
			
		case GS_HGridType:
		case GS_HGridSize:
			if (!selfSettingHGridSize) {
				userHGridStep = graphSetts.getHGridSize();
				computeGridSteps();
			}
			break;
		
		case GS_XAxisType:
		case GS_XAxisSeriesIndex:
		case GS_XAxisParamValue:
			updateScreenData();
			break;
			
		case GS_HighlightDataPoints:
			highlightPoints = graphSetts.getHighlightDataPoints();
			highlightAround(new Point(-1, -1));
			break;
			
		default:
			break;
			
	}
	
}  // private void processSettingsEvent(Event<SettingsEvent> event)


/**
 * If cached label info is changed, the screen buffer is recreated;
 * if cached data is updated the view port and the screen data are recomputed.
 * 
 * @param event The cache event.
 */
private void processCacheEvent(Event<CacheEvent> event) {
	
	if (event.getProducer() != dataCache)
		return;
	
	switch(event.getType()) {
	
		case CACHE_UpdatedLabels:
			resetScreenDataBuffer();
			updateScreenData();
			break;
	
		case CACHE_UpdatedData:
		for (int s = 0; s < screenDataBuffer.length; s++) {
			if (screenDataBuffer[s].doShow)
				updateSeriesTransformer(s);
		}
		updateScreenData();
		break;
	}
}


/**
 * A data structure to hold the locally cached plot data for a data series.
 */
private class SeriesScreenData {

	/*package*/ Color colour = Color.BLACK;
	/*package*/ int series = -1;
	/*package*/ Point2D.Double[] points = new Point2D.Double[DataCache.CACHE_SIZE + 1];
	/*package*/ MutableInt[] sortedPoints = new MutableInt[DataCache.CACHE_SIZE];
	/*package*/ boolean[] hlPoints = new boolean[DataCache.CACHE_SIZE];
	/*package*/ int[] dsIndices = new int[DataCache.CACHE_SIZE];
	/*package*/ int plotPoints = 0;
	/*package*/ boolean doShow = false; 
	/*package*/ Transformer transformer = IDTransform;
	
	/*package*/ SeriesScreenData(int series) {
		this.series = series;
		for(int i = 0; i < DataCache.CACHE_SIZE; i++) {
			points[i] = new Point2D.Double();
			sortedPoints[i] = new MutableInt();
		}
		points[DataCache.CACHE_SIZE] = new Point2D.Double();
	}

} // private class SeriesScreenData


/**
 * Used in order to compare points referenced by their index in {@link SeriesScreenData#points};
 * the comparison is by x-xoordinates. 
 */
private class PointsByIndexComparator implements Comparator<MutableInt> {
	private SeriesScreenData series = null;
	/*package*/ void setSeries(SeriesScreenData series) { this.series = series; }
	public int compare(MutableInt pi1, MutableInt pi2) {
		Point2D.Double p1 = series.points[pi1.value];
		Point2D.Double p2 = series.points[pi2.value];
		if (p1.x < p2.x)
			return -1;
		if (p1.x > p2.x)
			return 1;
		return 0;
    }	
} // private class PointsByIndexComparator

/**
 * Used to encapsulate data series points translation routines.
 */
private interface Transformer {
	public double transf(final double v);
}
private static Transformer IDTransform = new Transformer(){
	public final double transf(final double v) { return v; }
};

} // public class Plotter
