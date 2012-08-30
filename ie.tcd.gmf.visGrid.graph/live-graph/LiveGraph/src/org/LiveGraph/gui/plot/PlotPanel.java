package org.LiveGraph.gui.plot;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.border.EtchedBorder;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.CacheEvent;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventType;
import org.LiveGraph.gui.LiveGraphSettingsPanel;
import org.LiveGraph.plot.Plotter;
import org.LiveGraph.settings.SettingsEvent;

import com.softnetConsult.utils.collections.ReadOnlyIterator;
import com.softnetConsult.utils.swing.SwingTools;

/**
 * The plotter panel of the application. This is the only component contained in
 * the content pane of the application's plot window. API users may request
 * {@link org.LiveGraph.gui.GUIManager} to create additional instances of a
 * {@code PlotPanel} if they wish to integrate the LiveGraph GUI into their application.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: PlotPanel.java</p>
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
public class PlotPanel extends LiveGraphSettingsPanel {

private JLabel statusLabel = null;
private Plotter plotter = null;
private JPanel canvas = null;
private boolean highlightDataPoints = true;
private Popup hlSerPopup = null; 
private List<String> seriesLabels = null;

/**
 * Creates and setts up a plotter panel.
 * 
 * @param plotter The plotter object for this window.
 */
public PlotPanel(Plotter plotter) {
	super();
	
	if (null == plotter)
		throw new NullPointerException("Cannot use a null plotter to construct a PlotPanel");
	
	this.plotter = plotter;
	this.highlightDataPoints = true;
	if (null != LiveGraph.application().getGraphSettings())
		this.highlightDataPoints = LiveGraph.application().getGraphSettings().getHighlightDataPoints();
	this.seriesLabels = new ArrayList<String>();
	this.initialize();
}

/**
 * This method initializes the panel.
 */
private void initialize() {
	
	// General settings:

	Dimension panelDim = new Dimension(450, 500);
	this.setPreferredSize(panelDim);
	this.setSize(panelDim);
	this.setLayout(new BorderLayout());
	
	JPanel panel = null;
	
	// Ststus label:
	
	statusLabel = new JLabel();
	statusLabel.setFont(SwingTools.getPlainFont(statusLabel));
	
	panel = new JPanel(new BorderLayout());
	
	panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 3, 5, 5),
													   BorderFactory.createEtchedBorder(EtchedBorder.RAISED)));	
	panel.setPreferredSize(new Dimension(panelDim.width, 30));
	panel.add(statusLabel, BorderLayout.CENTER);
	
	this.add(panel , BorderLayout.SOUTH);
	
	// Plot canvas:	
	
	hlSerPopup = null; 
	canvas = new JPanel() {
		@Override public void paint(Graphics g) {
			super.paint(g);
			plotter.paint(g);
		}		
		@Override public void setBounds(int x, int y, int width, int height) {
			super.setBounds(x, y, width, height);
			plotter.setScreenSize(width, height);
		}
	};
	canvas.setBackground(Color.WHITE);
	canvas.addMouseListener(new MouseAdapter() {
		@Override public void mouseExited(MouseEvent e) {
			setStatusMessage("");
			if (highlightDataPoints) {
				List<Integer> l = Collections.emptyList();
				LiveGraph.application().guiManager().dataSeriesHighlighted(l);
			}
		}
		@Override public void mouseReleased(MouseEvent e) {
			if (highlightDataPoints && MouseEvent.BUTTON1 == e.getButton() && null != hlSerPopup) {
				hlSerPopup.hide();
				hlSerPopup = null;
			}
		}
		@Override public void mousePressed(MouseEvent e) {
			if (highlightDataPoints && MouseEvent.BUTTON1 == e.getButton())
				showHlSeriesPopup(plotter.highlightAround(e.getPoint()), e.getXOnScreen(), e.getYOnScreen());
		}
	});
	canvas.addMouseMotionListener(new MouseMotionAdapter() {
		@Override public void mouseDragged(MouseEvent e) { this.mouseMoved(e); }
		@Override public void mouseMoved(MouseEvent e) {
			if (plotter.screenTooSmall()) {
				setStatusMessage("Enlarge this window.");
				return;
			}
			if (!plotter.getShowAtLeastOneSeries()) {
				setStatusMessage("No data selected for display.");
				return;
			} 
			Point ep = e.getPoint();
			Point2D.Double dp = plotter.screenToDataPoint(ep);
			setStatusMessage(String.format("(%.3f, %.3f)", dp.x, dp.y));
			if (highlightDataPoints) {
				List<Integer> hlSeries = plotter.highlightAround(ep);
				LiveGraph.application().guiManager().dataSeriesHighlighted(hlSeries);			
				canvas.repaint();
				if (MouseEvent.MOUSE_DRAGGED == e.getID() && null != hlSerPopup)
					showHlSeriesPopup(hlSeries, e.getXOnScreen(), e.getYOnScreen());
			}
		}
	});
	
	panel = new JPanel(new BorderLayout());
	panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 3, 5),
			   										   BorderFactory.createEtchedBorder(EtchedBorder.RAISED)));
	panel.add(canvas, BorderLayout.CENTER);
	this.add(panel, BorderLayout.CENTER);
} // private void initialize()


/**
 * Shows the popup with the labels of highlighted data series.
 * 
 * @param hlSeries List of indices of highlighted data series.
 * @param mx Current mouse position on screen (x).
 * @param my Current mouse position on screen (y).
 */
private void showHlSeriesPopup(List<Integer> hlSeries, int mx, int my) {
		
	JPanel panel = new JPanel(new GridLayout(hlSeries.size(), 1, 2, 2));
	panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
	JLabel label = null;
	
	if (hlSeries.isEmpty()) {
		
		label = new JLabel("- no data series highlighted -");
		panel.add(label);
		
	} else {
		synchronized(seriesLabels) {
			for (int s : hlSeries) {
				
				if (s >= seriesLabels.size())
					continue;
				
				label = new JLabel(seriesLabels.get(s));
				label.setFont(SwingTools.getPlainFont(label));
				label.setForeground(LiveGraph.application().getDataSeriesSettings().getColour(s));
				panel.add(label);	
			}
		}
	}
	
	
	if (null != hlSerPopup)
		hlSerPopup.hide();							
	hlSerPopup = PopupFactory.getSharedInstance().getPopup(canvas, panel, mx + 15, my + 15);
	hlSerPopup.show();
}

/**
 * Update the status bar message.
 * @param msg message.
 */
public void setStatusMessage(String msg) {
	if (null == msg)
		return;
	statusLabel.setText(msg);
}

/**
 * Updates the series labels from the specified iterator.
 * @param labels Series labels.
 */
public void setSeriesLabels(ReadOnlyIterator<String> labels) {
	
	synchronized(seriesLabels) {
		
		seriesLabels.clear();
		
		if (null == labels)
			return;
		
		while (labels.hasNext())
			seriesLabels.add(labels.next());
	}
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
}

/**
 * When the application's settings change, this method is called in order
 * to update the GUI accordingly.<br/>
 * - Repaints the plot canvas when the data file settings change.<br />
 * - Repaints the plot canvas when the graph settings change.<br />
 * 
 * @param event Describes the change event.
 */
@Override
protected void processSettingsEvent(Event<SettingsEvent> event) {

	switch(event.getType()) {
		
		case GS_HighlightDataPoints:
			highlightDataPoints = event.getInfoBoolean();
			// no break intended here.
			
		case GS_Load:
		case GS_Save:
		case GS_MinY:
		case GS_MaxY:
		case GS_MinX:
		case GS_MaxX:
		case GS_VGridType:
		case GS_VGridSize:
		case GS_VGridColour:
		case GS_HGridType:
		case GS_HGridSize:
		case GS_HGridColour:
		case GS_XAxisType:
		case GS_XAxisSeriesIndex:
		case GS_XAxisParamValue:
			
		case DSS_Load:
		case DSS_Save:
		case DSS_SeriesRange_Visibility:
		case DSS_Series_Visibility:
		case DSS_Series_Colour:
		case DSS_Series_TransformMode:
		case DSS_Series_TransformParam:
			
			canvas.repaint();
			break;
			
		default:
			break;
	}	
}

/**
 * Repaints the plot canvas when the cache was updated.
 * 
 * @param event The cache event.
 */
private void processCacheEvent(Event<CacheEvent> event) {
	
	switch(event.getType()) {
		
		case CACHE_UpdatedData:
			canvas.repaint();
			break;
			
		case CACHE_UpdatedLabels:
			DataCache cache = (DataCache) event.getProducer();
			synchronized (cache) {
				setSeriesLabels(cache.iterateDataSeriesLabels());
			}
			break;
		
		default:
			break;			
	}
}

}  // public class PlotPanel
