package org.LiveGraph.gui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventAnnotation;
import org.LiveGraph.events.EventProcessingException;
import org.LiveGraph.events.EventProducer;
import org.LiveGraph.events.EventType;
import org.LiveGraph.gui.dfs.DataFileSettingsPanel;
import org.LiveGraph.gui.dfs.DataFileSettingsWindow;
import org.LiveGraph.gui.dss.SeriesSettingsPanel;
import org.LiveGraph.gui.dss.SeriesSettingsWindow;
import org.LiveGraph.gui.gs.GraphSettingsPanel;
import org.LiveGraph.gui.gs.GraphSettingsWindow;
import org.LiveGraph.gui.msg.MessagePanel;
import org.LiveGraph.gui.msg.MessageWindow;
import org.LiveGraph.gui.plot.PlotPanel;
import org.LiveGraph.gui.plot.PlotWindow;
import org.LiveGraph.plot.Plotter;

import com.softnetConsult.utils.exceptions.ThrowableTools;

import static  org.LiveGraph.gui.GUIEvent.*;


public class GUIManager implements EventProducer {

/**
 * The data cache that is used to provide data series information
 * to new panels and also when constructing new {@code Plotter} objects
 * required for creating new {@code PlotPanel}s. 
 */
private DataCache dataCache = null;


/**
 * Constructor doesn't do much.
 */
public GUIManager() { }

/**
 * Sets tha data cache that is used to provide data series information
 * to new panels and also when constructing new {@code Plotter} objects
 * required for creating new {@code PlotPanel}s. 
 * @param cache
 */
public void setDataCache(DataCache cache) {
	dataCache = cache;
}

/**
 * Creates a new fully registered instance of a main menu bar.
 * @return a new main menu bar.
 */
public JMenuBar createMainMenuBar() {
	MainMenuBar menuBar = new MainMenuBar();
	LiveGraph.application().eventManager().registerListener(menuBar);
	return menuBar;
}

public JPanel createDataFileSettingsPanel() {
	DataFileSettingsPanel panel = new DataFileSettingsPanel();
	LiveGraph.application().eventManager().registerListener(panel);
	return panel;
}

public JPanel createGraphSettingsPanel() {
	GraphSettingsPanel panel = new GraphSettingsPanel();
	if (null != dataCache) {
		synchronized(dataCache) {
			panel.setSeriesLabels(dataCache.iterateDataSeriesLabels());
		}
	}
	LiveGraph.application().eventManager().registerListener(panel);
	return panel;
}

public JPanel createSeriesSettingsPanel() {
	SeriesSettingsPanel panel = new SeriesSettingsPanel();
	if (null != dataCache) {
		synchronized(dataCache) {
			panel.setSeriesLabels(dataCache.iterateDataSeriesLabels());
		}
	}
	LiveGraph.application().eventManager().registerListener(panel);
	return panel;
}

public JPanel createMessagePanel() {
	MessagePanel panel = new MessagePanel();
	LiveGraph.application().eventManager().registerListener(panel);
	return panel;
}

public JPanel createPlotPanel() {
	
	Plotter plotter = new Plotter(dataCache);
	LiveGraph.application().eventManager().registerListener(plotter);
	
	PlotPanel panel = new PlotPanel(plotter);
	if (null != dataCache) {
		synchronized(dataCache) {
			panel.setSeriesLabels(dataCache.iterateDataSeriesLabels());
		}
	}
	LiveGraph.application().eventManager().registerListener(panel);
	return panel;
}

/**
 * Create a data file settings window and set-up its communication with other objects.
 * @return data file settings window.
 */
public JFrame createDataFileSettingsWindow() {
	DataFileSettingsWindow win = new DataFileSettingsWindow();
	LiveGraph.application().eventManager().registerListener(win);
	JPanel panel = createDataFileSettingsPanel();
	win.getContentPane().add(panel);
	return win;
}

/**
 * Create a graph settings window and set-up its communication with other objects.
 * @return graph settings window.
 */
public JFrame createGraphSettingsWindow() {
	GraphSettingsWindow win = new GraphSettingsWindow();
	LiveGraph.application().eventManager().registerListener(win);
	JPanel panel = createGraphSettingsPanel();
	win.getContentPane().add(panel);
	return win;
}

/**
 * Create a data series settings window and set-up its communication with other objects.
 * @return data series settings window.
 */
public JFrame createSeriesSettingsWindow() {
	SeriesSettingsWindow win = new SeriesSettingsWindow();
	LiveGraph.application().eventManager().registerListener(win);
	JPanel panel = createSeriesSettingsPanel();
	win.getContentPane().add(panel);
	return win;
}

/**
 * Create a message window and set-up its communication with other objects.
 * @return data series settings window.
 */
public JFrame createMessageWindow() {
	MessageWindow win = new MessageWindow();
	LiveGraph.application().eventManager().registerListener(win);
	JPanel panel = createMessagePanel();
	win.getContentPane().add(panel);
	return win;
}

/**
 * Create a plot window and set-up its communication with other objects.
 * 
 * @return plot window.
 */
public JFrame createPlotWindow() {
	PlotWindow win = new PlotWindow();
	win.setJMenuBar(createMainMenuBar());
	LiveGraph.application().eventManager().registerListener(win);
	JPanel panel = createPlotPanel();
	win.getContentPane().add(panel);
	return win;
}


/**
 * Displays or hides the message window.
 * 
 * @param state Whether to display ({@code true}) or to hide ({@code false}).
 */
public void setDisplayMessageWindows(boolean state) {	
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_MessagesDisplayStateChanged,
												state);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Displays or hides the data file settings window.
 * 
 * @param state Whether to display ({@code true}) or to hide ({@code false}).
 */
public void setDisplayDataFileSettingsWindows(boolean state) {	
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_DataFileSettingsDisplayStateChanged,
												state);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Displays or hides the graph settings window.
 * 
 * @param state Whether to display ({@code true}) or to hide ({@code false}).
 */
public void setDisplayGraphSettingsWindows(boolean state) {	
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_GraphSettingsDisplayStateChanged,
												state);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Displays or hides the data series settings window.
 * 
 * @param state Whether to display ({@code true}) or to hide ({@code false}).
 */
public void setDisplaySeriesSettingsWindows(boolean state) {	
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_DataSeriesSettingsDisplayStateChanged,
												state);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Displays or hides the plot window.
 * 
 * @param state Whether to display ({@code true}) or to hide ({@code false}).
 */
public void setDisplayPlotWindows(boolean state) {	
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_PlotDisplayStateChanged,
												state);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Raises an event to inform listeners that an info message should be displayed.
 * 
 * @param o The message.
 */
public void logInfoLn(Object o) {
	String s = (null == o ? "null" : o.toString());
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_LogMessageInfo, s);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Raises an event to inform listeners that an error message should be displayed.
 * 
 * @param o The message.
 */
public void logErrorLn(Object o) {
	try {
		String s = (null == o ? "null" : o.toString());
		Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_LogMessageError, s);
		LiveGraph.application().eventManager().raiseEvent(event);
	} catch (Throwable ex) {
		logErrorLnModal2(o, ex);
	}
}

public void logErrorLnModal(Object o) {
	
	String msg = (null == o ? "null" : o.toString());
	System.err.println(msg);
	JOptionPane.showMessageDialog(null, msg, "LiveGraph error", JOptionPane.ERROR_MESSAGE);
}

private void logErrorLnModal2(Object o, Throwable ex) {
	
	String s = String.format("LiveGraph was going to display an error message,%n" +
			 "but another error occured during the display process.%n%n" +
			 "The original error message was:%n" +
			 "%s%n%n" +
			 "The error that occured during display is:%n" +
			 "%s%n",
			 (null == o ? "null" : o.toString()),
			 ThrowableTools.stackTraceToString(ex));

	logErrorLnModal(s);
}

/**
 * Raises an event to inform listeners that a success message should be displayed.
 * 
 * @param o The message.
 */
public void logSuccessLn(Object o) {
	String s = (null == o ? "null" : o.toString());
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_LogMessageSuccess, s);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Notifies the listeners about the highlighted series.
 * 
 * @param hlSeries highlighted series indices.
 */
public void dataSeriesHighlighted(List<Integer> hlSeries) {
	
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUIEvent.GUI_DataSeriesHighlighted,
												hlSeries);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * Raises an event that requests all listening GUI components to call their {@code dispose()} methods.
 */
public void disposeAllGUI() {
	Event<GUIEvent> event = new Event<GUIEvent>(this, GUIEvent.class, GUI_DisposeAll);
	LiveGraph.application().eventManager().raiseEvent(event);
}

/**
 * ...
 * 
 * @param event ... .
 */
public void eventProcessingFinished(Event<? extends EventType> event) {
	
	if (event.getDomain() == GUIEvent.class) {
		guiEventProcessingFinished(event.cast(GUIEvent.class));
		return;
	}
}

/**
 * ...
 * 
 * @param event ... .
 */
public void guiEventProcessingFinished(Event<GUIEvent> event) {
	
	switch(event.getType()) {
		
		// Check whther an error message was actually logged:
		case GUI_LogMessageError:
			// Look for positive event annotations:
			List<EventAnnotation> annotations = event.getAnnotations();
			boolean ok = false;
			for (EventAnnotation ann : annotations) {
				Object info = ann.getInfo();
				if (null != info && info instanceof Boolean) {
					if (((Boolean) info).booleanValue()) {
						ok = true;
						break;
					}
				}
			}
			// If no positive event annotations found, display without raising an event:
			if (!ok) {
				logErrorLnModal(event.getInfoObject());
			}
			break;
		default:
			break;
	}
}

/**
 * ...
 * 
 * @param event ... 
 * @param exception ...
 * @return ...
 */
public boolean eventProcessingException(Event<? extends EventType> event, EventProcessingException exception) {
	
	if (event.getDomain() == GUIEvent.class) {
		return guiEventProcessingException(event.cast(GUIEvent.class), exception);
	}
	
	return false;
}


public boolean guiEventProcessingException(Event<GUIEvent> event, EventProcessingException exception) {
	
	switch(event.getType()) {
		
		// If an exception occured while logging an error message, we have to display both, the
		// original error message AND the occured exception without raisig further events:
		case GUI_LogMessageError:
			logErrorLnModal2(event.getInfoObject(), exception);			
			return true;
			
		default:
			return false;
	}
}

}   // public class GUIManager
