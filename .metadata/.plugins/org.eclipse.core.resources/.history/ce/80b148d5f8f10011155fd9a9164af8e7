package org.LiveGraph.gui.dss;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.CacheEvent;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventType;
import org.LiveGraph.gui.GUIEvent;
import org.LiveGraph.gui.LiveGraphSettingsPanel;
import org.LiveGraph.settings.DataSeriesSettings;
import org.LiveGraph.settings.GraphSettings;
import org.LiveGraph.settings.SettingsEvent;
import org.LiveGraph.settings.DataSeriesSettings.TransformMode;

import com.softnetConsult.utils.collections.Pair;
import com.softnetConsult.utils.collections.ReadOnlyIterator;
import com.softnetConsult.utils.exceptions.Bug;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;
import com.softnetConsult.utils.swing.DisEnablingPanel;
import com.softnetConsult.utils.swing.SwingTools;
import com.softnetConsult.utils.sys.SystemTools;


/**
 * The data series settings panel of the application. This is the only component contained in
 * the content pane of the application's data series settings window. API users may request
 * {@link org.LiveGraph.gui.GUIManager} to create additional instances of a
 * {@code SeriesSettingsPanel} if they wish to integrate the LiveGraph GUI into their application.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: SeriesSettingsPanel.java</p>
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
public class SeriesSettingsPanel extends LiveGraphSettingsPanel {

private static final long HIGHLIGHT_LEN = 1500; 

private List<String> seriesLabels = null; 
private AbstractTableModel tableModel = null;
private JTable table = null;
private ListSelectionModel selectionModel = null;

private JComboBox scaleTypeCombo = null;

private DisEnablingPanel topPanel;
private JButton advPanelButt = null, advGoButt = null;
private JPanel advPanel = null;
private int helpCols = 0;
private JTextField advFrom = null, advTo = null, advEvery = null;
private JComboBox advAction = null;

/**
 * This is the default constructor.
 */
public SeriesSettingsPanel() {
	super();
	initialize();
}

/**
 * This method initializes the panel.
 */
private void initialize() {
	
	// General settings:

	Dimension panelDim = new Dimension(450, 200);
	this.setPreferredSize(panelDim);
	this.setSize(panelDim);
	this.setLayout(new BorderLayout(0, 0));

	// Buttons at the top:
	
	JPanel panel = null;
	JButton button = null;
	JLabel label = null;
	
	topPanel = new DisEnablingPanel(new BorderLayout());
	this.add(topPanel, BorderLayout.NORTH);
	
	panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
	topPanel.add(panel, BorderLayout.NORTH);
	
	button = new JButton("Show all");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (null == tableModel)  return;
			DataSeriesSettings dss = LiveGraph.application().getDataSeriesSettings();
			dss.setShowAll(0, tableModel.getRowCount() - 1, true);			
			tableModel.fireTableDataChanged();
        }
	});
	panel.add(button);
	
	button = new JButton("Hide all");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (null == tableModel)  return;
			DataSeriesSettings dss = LiveGraph.application().getDataSeriesSettings();
			dss.setShowAll(0, tableModel.getRowCount() - 1, false);			
			tableModel.fireTableDataChanged();
        }
	});
	panel.add(button);
	
	button = new JButton("Toggle all");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (null == tableModel)  return;
			DataSeriesSettings dss = LiveGraph.application().getDataSeriesSettings();
			dss.setShowToggleAll(0, tableModel.getRowCount() - 1);			
			tableModel.fireTableDataChanged();
        }
	});
	panel.add(button);
	
	// Advanced selection panel:
	advPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
	
	advPanelButt = new JButton(">>");
	advPanelButt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			setAdvancedPanelVisibility(!advPanel.isVisible());			
        }
	});
	panel.add(advPanelButt);
		
	topPanel.add(advPanel, BorderLayout.CENTER);	
	
	advPanel.add(label = new JLabel("From:"));
	label.setFont(SwingTools.getPlainFont(label));
	advFrom = new JTextField("0", 4);
	advPanel.add(advFrom);
	
	advPanel.add(label = new JLabel("To:"));
	label.setFont(SwingTools.getPlainFont(label));
	advTo = new JTextField("10000", 4);
	advPanel.add(advTo);
	
	advPanel.add(label = new JLabel("Every:"));
	label.setFont(SwingTools.getPlainFont(label));
	advEvery = new JTextField("10", 8);
	advPanel.add(advEvery);
	
	advAction = new JComboBox(new String[] {"Show", "Hide", "Toggle"});
	advAction.setFont(SwingTools.getPlainFont(advAction));
	advPanel.add(advAction);
	
	advGoButt = new JButton("Go");
	advGoButt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			runAdvancedSelector();			
        }
	});
	advPanel.add(advGoButt);
	
	// Main table:
	
	panel = new JPanel(new BorderLayout(0, 0));
	
	table = createTable();
	panel.add(new JScrollPane(table), BorderLayout.CENTER);
	this.add(panel, BorderLayout.CENTER);
	
	setAdvancedPanelVisibility(false);
	
} // private void initialize()

/**
 * Creates and initialises the labels table.
 * @return The labels table.
 */
private JTable createTable() {
	
	final String[] scaleModes = new String[] {"Actual value",
											  "Transform into [0..1]",
											  "Scale by specified value",
											  "Log to specified base"};
	
	final String[] colNames = new String[] {"Show", "Label", "Colour",
											"Transformation", "Transform parameter"};
	
	final String[] helperColumnNames = new String[] {"Index"};
	
	seriesLabels = new ArrayList<String>();
	
	tableModel = new AbstractTableModel() {
				
		public int getColumnCount() {
	        return colNames.length + helpCols;
        }

		public int getRowCount() {
	        return seriesLabels.size();
        }
		
		@Override
		public String getColumnName(int col) {
			if (col < helpCols)
				return helperColumnNames[col];
			return colNames[col - helpCols];
		}

		public Object getValueAt(int row, int col) {
			
			if (1 == helpCols && 0 == col)
				return row;
			
			DataSeriesSettings dsSetts = LiveGraph.application().getDataSeriesSettings();
			if (null == dsSetts)
				dsSetts = new DataSeriesSettings();
			
			switch (col - helpCols) {
				case 0: return dsSetts.getShow(row);
				case 1: try {
							return seriesLabels.get(row);
						} catch(IndexOutOfBoundsException e) {
							return "";
						}
				case 2: return dsSetts.getColour(row);
				case 3: switch(dsSetts.getTransformMode(row)) {
							case Transform_None:			return scaleModes[0];
							case Transform_In0to1:			return scaleModes[1];
							case Transform_ScaleBySetVal:	return scaleModes[2];
							case Transform_Logarithm:		return scaleModes[3];
							default:  throw new UnexpectedSwitchCase(dsSetts.getTransformMode(row));
						}
				case 4: return dsSetts.getTransformParam(row);
				default: throw new Bug("Forgot to provide getValueAt for table column " + col + ".");
			}
        }
		
		@Override
		public void setValueAt(Object val, int row, int col) {
			super.setValueAt(val, row, col);			
			switch (col - helpCols) {
				case 0: LiveGraph.application().getDataSeriesSettings().setShow(row, ((Boolean) val).booleanValue());
						break;
			  //case 1: same as the default case.
				case 2: LiveGraph.application().getDataSeriesSettings().setColour(row, (Color) val);
						break;
				case 3: if (scaleModes[0].equals(val))
							LiveGraph.application().getDataSeriesSettings().setTransformMode(row, TransformMode.Transform_None);
						else if (scaleModes[1].equals(val))
							LiveGraph.application().getDataSeriesSettings().setTransformMode(row, TransformMode.Transform_In0to1);
						else if (scaleModes[2].equals(val))
							LiveGraph.application().getDataSeriesSettings().setTransformMode(row, TransformMode.Transform_ScaleBySetVal);
						else if (scaleModes[3].equals(val))
							LiveGraph.application().getDataSeriesSettings().setTransformMode(row, TransformMode.Transform_Logarithm);
						else
							throw new Bug("Unexpected scale mode (" + val + ")!");
						break;
				case 4: LiveGraph.application().getDataSeriesSettings().setTransformParam(row, ((Double) val).doubleValue());
						break;
				default: throw new Bug("Column " + col + " is not supposed to be editable.");
			}
		}
		
		@Override
		public boolean isCellEditable(int row, int col) {
			return (col >= helpCols && col != 1 + helpCols);			
		}
		
		@Override
		public Class<?> getColumnClass(int col) {
			if (1 == helpCols && 0 == col)
				return Integer.class;
			switch (col - helpCols) {
				case 0: return Boolean.class;
				case 1: return String.class;
				case 2: return Color.class;
				case 3: return String.class;
				case 4: return Double.class;
				default: throw new Bug("Forgot to provide getColumnClass for table column " + col + ".");
			}
	    }
		
	}; // AbstractTableModel model = new AbstractTableModel()
	
	
	//JTable table = new JTable(tableModel);
	
	JTable table = new JTable(tableModel) {
		@Override public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {			
			; // Prevent the table selection to be changed by user input.
		}
	};
	
	
	selectionModel = table.getSelectionModel();
	selectionModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	
	scaleTypeCombo = new JComboBox(scaleModes);		
	scaleTypeCombo.setFont(SwingTools.getPlainFont(scaleTypeCombo));
	
	table.getColumnModel().getColumn(3 + helpCols).setCellEditor(new DefaultCellEditor(scaleTypeCombo));
	
	table.setDefaultEditor(Color.class, new ColourEditor());
	table.setDefaultRenderer(Color.class, new TableCellRenderer() {
		private JLabel label = new JLabel();
		public Component getTableCellRendererComponent(JTable table, Object colour,
													   boolean isSelected, boolean hasFocus, int row, int column) {			
			label.setOpaque(true);
			Color brdCol = isSelected ? table.getSelectionBackground() : table.getBackground();
			label.setBorder(BorderFactory.createLineBorder(brdCol, 3));
			label.setBackground((Color) colour);
			return label;
		}
	
	});
	
	Component rc = table.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(
																		table, null, false, false, 0, 0);
	FontMetrics fm = rc.getFontMetrics(rc.getFont());
	int w, sumW;
	
	sumW = w = fm.stringWidth(colNames[0 + helpCols]) + 10;
	table.getColumnModel().getColumn(0 + helpCols).setPreferredWidth(w);
	
	sumW += w = fm.stringWidth(colNames[2 + helpCols]) + 10;
	table.getColumnModel().getColumn(2 + helpCols).setPreferredWidth(w);
	
	w = 0;
	for (String sm : scaleModes) { w = Math.max(w, fm.stringWidth(sm)); }
	sumW += w = Math.max(w, fm.stringWidth(colNames[3 + helpCols])) + 10;	
	table.getColumnModel().getColumn(3 + helpCols).setPreferredWidth(w);
	
	sumW += w = fm.stringWidth(colNames[4 + helpCols]) + 10;
	table.getColumnModel().getColumn(4 + helpCols).setPreferredWidth(w);
	
	w = table.getPreferredScrollableViewportSize().width - sumW - 20;
	table.getColumnModel().getColumn(1 + helpCols).setPreferredWidth(w);
	
	return table;
	
} // private JTable createTable()


/**
 * Shows and hides the advanced selector panel.
 * @param show Whether to show the advanced selector panel.
 */
private void setAdvancedPanelVisibility(boolean show) {
	
	advPanelButt.setText(show ? "<<" : ">>");
	advPanel.setVisible(show);
	
	if (show) {
		helpCols = 1;
	} else {
		helpCols = 0;
	}
		
	tableModel.fireTableStructureChanged();
	table.getColumnModel().getColumn(3 + helpCols).setCellEditor(new DefaultCellEditor(scaleTypeCombo));
}

/**
 * Executes the advanced selection of data series.
 */
private void runAdvancedSelector() {
	
	// Get values:
	int start, end;
	List<Integer> mods;
	int action;
	try {		
		start = Integer.parseInt(advFrom.getText());
		end = Integer.parseInt(advTo.getText());		
		
		StringTokenizer tok = new StringTokenizer(advEvery.getText(), ",; ");
		mods = new ArrayList<Integer>();
		while(tok.hasMoreTokens()) {
			int t = Integer.parseInt(tok.nextToken());
			if (t > 0)
				mods.add(t);
		}
		
		Object act = advAction.getSelectedItem();
		if ("Show".equals(act))
			action = 1;
		else if ("Hide".equals(act))
			action = 2;
		else if ("Toggle".equals(act))
			action = 3;
		else
			action = -1;
		
	} catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(this, e.getMessage(), "Invalid number format", JOptionPane.ERROR_MESSAGE);
		return;
	}
	
	if (0 > start)
		start = 0;
	if (tableModel.getRowCount() <= start)
		start = tableModel.getRowCount() - 1;
	
	if (0 > end || tableModel.getRowCount() <= end)
		end = tableModel.getRowCount() - 1;
	
	if (start > end) {
		int t = start; start = end; end = t;
	}
	
	advFrom.setText(Integer.toString(start));
	advTo.setText(Integer.toString(end));
	
	topPanel.setEnabled(false);
	DataSeriesSettings setts = LiveGraph.application().getDataSeriesSettings();	
	for (int r = start; r <= end; r++) {
		
		advGoButt.setText(Integer.toString(r));
		
		int offs = r - start;
		boolean apply = false;
		for (int m = 0; !apply && m < mods.size(); m++) {
			apply = (0 == offs % mods.get(m));
		}
		
		if (!apply)
			continue;
		
		switch(action) {
			case 1: setts.setShow(r, true); break;
			case 2: setts.setShow(r, false); break;
			case 3: setts.setShow(r, !setts.getShow(r)); break;
			default: throw new UnexpectedSwitchCase(action);
		}
	}
	advGoButt.setText("Go");
	topPanel.setEnabled(true);	
}


/**
 * Updates the series labels from the specified iterator.
 * @param labels Series labels.
 */
public void setSeriesLabels(ReadOnlyIterator<String> labels) {
	
	seriesLabels = new ArrayList<String>();
	
	if (null == labels)
		return;
	
	while (labels.hasNext())
		seriesLabels.add(labels.next());   
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
	
	if (event.getDomain() == GUIEvent.class) {
		processGUIEvent(event.cast(GUIEvent.class));
		return;
	}
}

/**
 * When the application's settings change, this method is called in order
 * to update the GUI accordingly.<br/>
 * - Updates the table display when series settings were loaded from a file
 * or when a setting changes.<br />
 * - When a series was selected as x-axis, the corresponding setting is highlighted for a second.<br />
 * 
 * @param event Describes the change event.
 */
@Override
protected void processSettingsEvent(Event<SettingsEvent> event) {

	switch(event.getType()) {
		
		case DSS_Load:
			tableModel.fireTableDataChanged();
			break;
			
		case DSS_SeriesRange_Visibility:
			Pair range = (Pair) event.getInfoObject();
			tableModel.fireTableRowsUpdated((Integer) range.elem1, (Integer) range.elem2);
			break;
			
		case DSS_Series_Visibility:
		case DSS_Series_Colour:
		case DSS_Series_TransformMode:
		case DSS_Series_TransformParam:
			int si = (int) event.getInfoLong();
			tableModel.fireTableRowsUpdated(si, si);
			break;
			
		case GS_XAxisType:
		case GS_XAxisSeriesIndex:
			if (event.getInfoObject() == GraphSettings.XAxisType.XAxis_DSNum)
				break;
			final int serInd = (int) event.getInfoLong();
			tableModel.fireTableRowsUpdated(serInd, serInd);
			selectionModel.setSelectionInterval(serInd, serInd);
			(new Thread(new Runnable() {
				public void run() {
					SystemTools.sleep(HIGHLIGHT_LEN);
					if (!selectionModel.getValueIsAdjusting()
							&& selectionModel.getMinSelectionIndex() == serInd
							&& selectionModel.getMaxSelectionIndex() == serInd) {
						selectionModel.clearSelection();
					}
	            }
			}, "SeriesMarkedAsXAxis-TableSelectionController")).start();
			break;	
			
		default:
			break;
			
	}
	
}  // protected void processSettingsEvent

/**
 * Locally updates the series-lables when they have been changed in the data cache.
 * 
 * @param event The cache event.
 */
private void processCacheEvent(Event<CacheEvent> event) {
	
	if (CacheEvent.CACHE_UpdatedLabels == event.getType()) {
		
		DataCache cache = (DataCache) event.getProducer();
		synchronized (cache) {
			setSeriesLabels(cache.iterateDataSeriesLabels());
        }			
		tableModel.fireTableDataChanged();
	}
} // private void processCacheEvent

/**
 * Updates local view on GUI events.
 * 
 * @param event The GUI event.
 */
private void processGUIEvent(Event<GUIEvent> event) {
	
	if (GUIEvent.GUI_DataSeriesHighlighted == event.getType()) {
		
		@SuppressWarnings("unchecked")
		List<Integer> seriesIndices = (List<Integer>) event.getInfoObject();
		
		if (null == seriesIndices)
			return;
		
		selectionModel.clearSelection();
		
		if (seriesIndices.isEmpty())
			return;
		
		for (int s : seriesIndices)
			selectionModel.addSelectionInterval(s, s);
		/*
		(new Thread(new Runnable() {
			public void run() {
				try { Thread.sleep(HIGHLIGHT_LEN); } catch (InterruptedException e) {}
				selectionModel.clearSelection();
	        }
		}, "HighlightSeries-TableSelectionController")).start();
		*/			
	}
}  // private void processGUIEvent

/**
 * A colour selection cell editor for the settings table.  
 */
private class ColourEditor extends AbstractCellEditor implements TableCellEditor {

	private Color selColor;
	private JButton button;
	
	public ColourEditor() {
		button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setBackground(selColor);
				Color c = JColorChooser.showDialog(button, "Choose a colour for the data series.", selColor);
				if (null != c) 
					selColor = c;
				fireEditingStopped();
            }
		});	
	}
	
	public Object getCellEditorValue() {
		return selColor;
	}

	public Component getTableCellEditorComponent(JTable table, Object value,
												 boolean isSelected, int row, int column) {
		selColor = (Color) value;
		Color brdCol = isSelected ? table.getSelectionBackground() : table.getBackground();
		button.setBorder(BorderFactory.createLineBorder(brdCol, 3));
		return button;
	}
}  //private class ColourEditor

}  // public class SeriesSettingsPanel
