package org.LiveGraph.gui.gs;

import static org.LiveGraph.settings.GraphSettings.HGridType.HGrid_None;
import static org.LiveGraph.settings.GraphSettings.HGridType.HGrid_Simple;
import static org.LiveGraph.settings.GraphSettings.VGridType.VGrid_DSNumAligned;
import static org.LiveGraph.settings.GraphSettings.VGridType.VGrid_None;
import static org.LiveGraph.settings.GraphSettings.VGridType.VGrid_XAUnitAligned;
import static org.LiveGraph.settings.GraphSettings.XAxisType.XAxis_DSNum;
import static org.LiveGraph.settings.GraphSettings.XAxisType.XAxis_DataValLogToSetBase;
import static org.LiveGraph.settings.GraphSettings.XAxisType.XAxis_DataValScaleBySetVal;
import static org.LiveGraph.settings.GraphSettings.XAxisType.XAxis_DataValSecsToSetPower;
import static org.LiveGraph.settings.GraphSettings.XAxisType.XAxis_DataValSimple;
import static org.LiveGraph.settings.GraphSettings.XAxisType.XAxis_DataValTrans0to1;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import org.LiveGraph.LiveGraph;
import org.LiveGraph.dataCache.CacheEvent;
import org.LiveGraph.dataCache.DataCache;
import org.LiveGraph.events.Event;
import org.LiveGraph.events.EventType;
import org.LiveGraph.gui.LiveGraphSettingsPanel;
import org.LiveGraph.gui.RealNumFieldValueChangeAdaptor;
import org.LiveGraph.gui.Tools;
import org.LiveGraph.settings.GraphSettings;
import org.LiveGraph.settings.SettingsEvent;

import com.softnetConsult.utils.collections.ReadOnlyIterator;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;
import com.softnetConsult.utils.string.StringTools;
import com.softnetConsult.utils.swing.DisEnablingPanel;
import com.softnetConsult.utils.swing.ResizablePopupComboBox;
import com.softnetConsult.utils.swing.SwingTools;


/**
 * The graph settings panel of the application. This is the only component contained in
 * the content pane of the application's graph settings window. API users may request
 * {@link org.LiveGraph.gui.GUIManager} to create additional instances of a
 * {@code GraphSettingsPanel} if they wish to integrate the LiveGraph GUI into their application.
 * 
 * <p>
 *   <strong>LiveGraph</strong>
 *   (<a href="http://www.live-graph.org" target="_blank">http://www.live-graph.org</a>).
 * </p> 
 * <p>Copyright (c) 2007-2009 by G. Paperin.</p>
 * <p>File: GraphSettingsPanel.java</p>
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
public class GraphSettingsPanel extends LiveGraphSettingsPanel {

private static final String[] xAxisTypeLabels = new String[] {
									"Dataset numbers  ",
									"Data series  ",
									"Data series transformed into [0..1]  ",
									"Data series scaled by the specified value  ",
									"Logarithm of a data series to the specified base  ",
									"Data series as seconds * 10^(specified power)  "};

private static final String[] xAxisParameterLabels = new String[] {
									"Parameter:",
									"Parameter:",
									"Parameter:",
									"Factor:",
									"Base:",
									"Power:"}; 

private JTextField minYField = null, maxYField = null, minXField = null, maxXField = null;
private JLabel minYLabelExpl = null, maxYLabelExpl = null, minXLabelExpl = null, maxXLabelExpl = null; 
private JLabel minYLabelAuto = null, maxYLabelAuto = null, minXLabelAuto = null, maxXLabelAuto = null;
private JRadioButton minYValButton = null, minYAutoButton = null, maxYValButton = null, maxYAutoButton = null;
private JRadioButton minXValButton = null, minXAutoButton = null, maxXValButton = null, maxXAutoButton = null;

private JTextField vGridSizeField = null, hGridSizeField = null;
private JRadioButton vGridNoneButton = null, vGridDSNumAlignedButton = null, vGridXAUnitAlignedButton = null;
private JRadioButton hGridNoneButton = null, hGridSimpleButton = null;
private JButton vGridColourButton = null;
private JButton hGridColourButton = null;
private DisEnablingPanel hGridDetsPanel = null, vGridDetsPanel = null;

private JComboBox xAxisTypeCombo = null;
private JLabel xAxisSeriesLabel = null;
private JComboBox xAxisSeriesCombo = null;
private JLabel xAxisParameterLabel = null;
private JTextField xAxisParameterField = null;
private int preferredXAxisSeriesIndex = 0;

private boolean updatingSeriesLabels = false;


/**
 * This is the default constructor.
 */
public GraphSettingsPanel() {
	super();
	initialize();
}

/**
 * This method initializes the panel.
 */
private void initialize() {
	
	// General settings:

	Dimension panelDim = new Dimension(470, 400);
	this.setPreferredSize(panelDim);
	this.setSize(panelDim);
	final JPanel thisPanel = this;			
	thisPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	thisPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	GraphSettings gSettings = LiveGraph.application().getGraphSettings();
	if (null == gSettings)
		gSettings = new GraphSettings();
	
	// Layout:
	
	//AbstractButton button = null;
	JLabel label = null;
	ButtonGroup bGroup = null;
	Dimension dim = null;
	RealNumFieldValueChangeAdaptor fvalAdpt = null;
	double defVal = Double.NaN;
	
	// Viewport settings:
	JPanel viewportPanel = new JPanel(new GridBagLayout());
	thisPanel.add(viewportPanel);
	viewportPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	viewportPanel.add(new JLabel("Viewport:"), Tools.createGridBagConstraints(0, 0, 5, 1));
	/*
	viewportPanel.add(new Box.Filler((dim = new Dimension(1, 1)), dim, dim),
					  new GridBagConstraints(0, 5, 6, 1, 1, 1,
											 GridBagConstraints.WEST,
											 GridBagConstraints.BOTH,
											 new Insets(0, 0, 0, 0),
											 0, 0));
											 */	
	
	viewportPanel.add(new JSeparator(SwingConstants.VERTICAL),
					  new GridBagConstraints(5, 1, 1, 2, 0, 1,
							  				 GridBagConstraints.NORTHWEST,
							  				 GridBagConstraints.BOTH,
							  				 new Insets(5, 5, 5, 5),
							  				 0, 0));

	
	// Min Y: 
	viewportPanel.add((minYLabelExpl = new JLabel("Min Y:")), Tools.createGridBagConstraints(0, 1, 1, 1));
	minYLabelExpl.setFont(SwingTools.getPlainFont(minYLabelExpl));
	bGroup = new ButtonGroup();
	
	minYValButton = new JRadioButton("", !Double.isNaN(gSettings.getMinY()));
	viewportPanel.add(minYValButton, Tools.createGridBagConstraints(1, 1, 1, 1));
	bGroup.add(minYValButton);
	defVal = Double.isNaN(gSettings.getMinY()) ? 0. : gSettings.getMinY();
	minYField = new JTextField(StringTools.toString(defVal), 6);
	viewportPanel.add(minYField, Tools.createGridBagConstraints(2, 1, 1, 1));	
	minYField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(defVal) {
		@Override public double valueChanged(JTextField field, double newValue) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
        	gs.setMinY(field.isEnabled() ? newValue : Double.NaN);
        	newValue = Double.isNaN(gs.getMinY()) ? 0. : gs.getMinY(); 
        	return newValue;
        }  
	});
	minYField.addKeyListener(fvalAdpt);

	minYLabelAuto = new JLabel("auto");
	minYLabelAuto.setFont(SwingTools.getPlainFont(minYLabelAuto));	
	viewportPanel.add(minYLabelAuto, Tools.createGridBagConstraints(4, 1, 1, 1));
	
	minYValButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMinY(StringTools.parseDouble(minYField.getText()));
			minYValButton.setSelected(!Double.isNaN(gs.getMinY()));
			minYAutoButton.setSelected(Double.isNaN(gs.getMinY()));
        }
	});
	
	minYAutoButton = new JRadioButton("", Double.isNaN(gSettings.getMinY()));
	viewportPanel.add(minYAutoButton, Tools.createGridBagConstraints(3, 1, 1, 1));
	bGroup.add(minYAutoButton);
	minYAutoButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMinY(Double.NaN);
			minYValButton.setSelected(!Double.isNaN(gs.getMinY()));
			minYAutoButton.setSelected(Double.isNaN(gs.getMinY()));
        }
	});
	minYField.setEnabled(!Double.isNaN(gSettings.getMinY()));
	
	// Max Y: 
	viewportPanel.add((maxYLabelExpl = new JLabel("Max Y:")), Tools.createGridBagConstraints(6, 1, 1, 1));
	maxYLabelExpl.setFont(SwingTools.getPlainFont(maxYLabelExpl));
	bGroup = new ButtonGroup();
	
	maxYValButton = new JRadioButton("", !Double.isNaN(gSettings.getMaxY()));
	viewportPanel.add(maxYValButton, Tools.createGridBagConstraints(7, 1, 1, 1));
	bGroup.add(maxYValButton);
	defVal = Double.isNaN(gSettings.getMaxY()) ? 100. : gSettings.getMaxY();
	maxYField = new JTextField(StringTools.toString(defVal), 6);
	viewportPanel.add(maxYField, Tools.createGridBagConstraints(8, 1, 1, 1));
	maxYField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(defVal) {
		@Override public double valueChanged(JTextField field, double newValue) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
        	gs.setMaxY(field.isEnabled() ? newValue : Double.NaN);
        	newValue = Double.isNaN(gs.getMaxY()) ? 0. : gs.getMaxY(); 
        	return newValue;
        }
	});
	maxYField.addKeyListener(fvalAdpt);

	maxYLabelAuto = new JLabel("auto");
	maxYLabelAuto.setFont(SwingTools.getPlainFont(label));
	viewportPanel.add(maxYLabelAuto, Tools.createGridBagConstraints(10, 1, 1, 1));
	maxYValButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMaxY(StringTools.parseDouble(maxYField.getText()));
			maxYValButton.setSelected(!Double.isNaN(gs.getMaxY()));
			maxYAutoButton.setSelected(Double.isNaN(gs.getMaxY()));
        }
	});
	
	maxYAutoButton = new JRadioButton("", Double.isNaN(gSettings.getMaxY()));
	viewportPanel.add(maxYAutoButton, Tools.createGridBagConstraints(9, 1, 1, 1));
	bGroup.add(maxYAutoButton);
	maxYAutoButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMaxY(Double.NaN);
			maxYValButton.setSelected(!Double.isNaN(gs.getMaxY()));
			maxYAutoButton.setSelected(Double.isNaN(gs.getMaxY()));
        }
	});
	maxYField.setEnabled(false);
	
	// Min X: 
	viewportPanel.add((minXLabelExpl = new JLabel("Min X:")), Tools.createGridBagConstraints(0, 2, 1, 1));
	minXLabelExpl.setFont(SwingTools.getPlainFont(minXLabelExpl));
	bGroup = new ButtonGroup();
	
	minXValButton = new JRadioButton("", !Double.isNaN(gSettings.getMinX()));
	viewportPanel.add(minXValButton, Tools.createGridBagConstraints(1, 2, 1, 1));
	bGroup.add(minXValButton);
	defVal = Double.isNaN(gSettings.getMinX()) ? -1. : gSettings.getMinX();
	minXField = new JTextField(StringTools.toString(defVal), 6);
	viewportPanel.add(minXField, Tools.createGridBagConstraints(2, 2, 1, 1));
	minXField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(defVal) {
		@Override public double valueChanged(JTextField field, double newValue) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
        	gs.setMinX(field.isEnabled() ? newValue : Double.NaN);
        	newValue = Double.isNaN(gs.getMinX()) ? 0. : gs.getMinX(); 
        	return newValue;
        }
	});
	minXField.addKeyListener(fvalAdpt);

	minXLabelAuto = new JLabel("auto");
	minXLabelAuto.setFont(SwingTools.getPlainFont(minXLabelAuto));
	viewportPanel.add(minXLabelAuto, Tools.createGridBagConstraints(4, 2, 1, 1));
	minXValButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMinX(StringTools.parseDouble(minXField.getText()));
			minXValButton.setSelected(!Double.isNaN(gs.getMinX()));
			minXAutoButton.setSelected(Double.isNaN(gs.getMinX()));
        }
	});
	
	minXAutoButton = new JRadioButton("", Double.isNaN(gSettings.getMinX()));
	viewportPanel.add(minXAutoButton, Tools.createGridBagConstraints(3, 2, 1, 1));
	bGroup.add(minXAutoButton);
	minXAutoButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMinX(Double.NaN);
			minXValButton.setSelected(!Double.isNaN(gs.getMinX()));
			minXAutoButton.setSelected(Double.isNaN(gs.getMinX()));
        }
	});
	minXField.setEnabled(false);
	
	// Max X: 
	viewportPanel.add((maxXLabelExpl = new JLabel("Max X:")), Tools.createGridBagConstraints(6, 2, 1, 1));
	maxXLabelExpl.setFont(SwingTools.getPlainFont(maxXLabelExpl));
	bGroup = new ButtonGroup();
	
	maxXValButton = new JRadioButton("", !Double.isNaN(gSettings.getMaxX()));
	viewportPanel.add(maxXValButton, Tools.createGridBagConstraints(7, 2, 1, 1));
	bGroup.add(maxXValButton);
	defVal = Double.isNaN(gSettings.getMaxX()) ? 10000. : gSettings.getMaxX();
	maxXField = new JTextField(StringTools.toString(defVal), 6);
	viewportPanel.add(maxXField, Tools.createGridBagConstraints(8, 2, 1, 1));
	maxXField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(defVal) {
		@Override public double valueChanged(JTextField field, double newValue) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
        	gs.setMaxX(field.isEnabled() ? newValue : Double.NaN);
        	newValue = Double.isNaN(gs.getMaxX()) ? 0. : gs.getMaxX(); 
        	return newValue;
        }
	});
	maxXField.addKeyListener(fvalAdpt);

	maxXLabelAuto = new JLabel("auto");
	maxXLabelAuto.setFont(SwingTools.getPlainFont(maxXLabelAuto));
	viewportPanel.add(maxXLabelAuto, Tools.createGridBagConstraints(10, 2, 1, 1));
	maxXValButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMaxX(StringTools.parseDouble(maxXField.getText()));
			maxXValButton.setSelected(!Double.isNaN(gs.getMaxX()));
			maxXAutoButton.setSelected(Double.isNaN(gs.getMaxX()));
        }
	});
	
	maxXAutoButton = new JRadioButton("", Double.isNaN(gSettings.getMaxX()));
	viewportPanel.add(maxXAutoButton, Tools.createGridBagConstraints(9, 2, 1, 1));
	bGroup.add(maxXAutoButton);
	maxXAutoButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setMaxX(Double.NaN);
			maxXValButton.setSelected(!Double.isNaN(gs.getMaxX()));
			maxXAutoButton.setSelected(Double.isNaN(gs.getMaxX()));
        }
	});
	maxXField.setEnabled(false);
	
	// Grid settings:
	JPanel gridPanel = new JPanel(new GridBagLayout());
	thisPanel.add(gridPanel);
	gridPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	
	gridPanel.add(new JSeparator(SwingConstants.VERTICAL),
				  new GridBagConstraints(3, 1, 1, 4, 0, 1,
					  					 GridBagConstraints.NORTHWEST,
					  					 GridBagConstraints.BOTH,
					  					 new Insets(5, 10, 5, 10),
					  					 0, 0));
	
	// Vertical grid:
	gridPanel.add(new JLabel("Vertical grid:"), Tools.createGridBagConstraints(0, 0, 3, 1));	
	bGroup = new ButtonGroup();
	
	vGridDetsPanel = new DisEnablingPanel(new GridBagLayout());
	gridPanel.add(vGridDetsPanel, Tools.createGridBagConstraints(1, 4, 1, 1));
	
	vGridNoneButton = new JRadioButton("Do not display a grid",
									   gSettings.getVGridType() == VGrid_None);
	vGridNoneButton.setFont(SwingTools.getPlainFont(vGridNoneButton));
	gridPanel.add(vGridNoneButton, Tools.createGridBagConstraints(0, 1, 3, 1));
	bGroup.add(vGridNoneButton);
	vGridNoneButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setVGridType(VGrid_None);
			vGridNoneButton.setSelected(VGrid_None == gs.getVGridType());
			vGridDSNumAlignedButton.setSelected(VGrid_DSNumAligned == gs.getVGridType());
			vGridXAUnitAlignedButton.setSelected(VGrid_XAUnitAligned == gs.getVGridType());
			vGridDetsPanel.setEnabled(VGrid_None != gs.getVGridType());
        }
	});
	
	vGridDSNumAlignedButton = new JRadioButton("Grid aligned on dataset indices",
											   gSettings.getVGridType() == VGrid_DSNumAligned);
	vGridDSNumAlignedButton.setFont(SwingTools.getPlainFont(vGridDSNumAlignedButton));
	gridPanel.add(vGridDSNumAlignedButton, Tools.createGridBagConstraints(0, 2, 3, 1));
	bGroup.add(vGridDSNumAlignedButton);
	vGridDSNumAlignedButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setVGridType(VGrid_DSNumAligned);
			vGridNoneButton.setSelected(VGrid_None == gs.getVGridType());
			vGridDSNumAlignedButton.setSelected(VGrid_DSNumAligned == gs.getVGridType());
			vGridXAUnitAlignedButton.setSelected(VGrid_XAUnitAligned == gs.getVGridType());
			vGridDetsPanel.setEnabled(VGrid_None != gs.getVGridType());
        }
	});
	
	vGridXAUnitAlignedButton = new JRadioButton("Grid aligned on X-axis units",
												gSettings.getVGridType() == VGrid_XAUnitAligned);
	vGridXAUnitAlignedButton.setFont(SwingTools.getPlainFont(vGridXAUnitAlignedButton));
	gridPanel.add(vGridXAUnitAlignedButton, Tools.createGridBagConstraints(0, 3, 3, 1));
	bGroup.add(vGridXAUnitAlignedButton);
	vGridXAUnitAlignedButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setVGridType(VGrid_XAUnitAligned);
			vGridNoneButton.setSelected(VGrid_None == gs.getVGridType());
			vGridDSNumAlignedButton.setSelected(VGrid_DSNumAligned == gs.getVGridType());
			vGridXAUnitAlignedButton.setSelected(VGrid_XAUnitAligned == gs.getVGridType());
			vGridDetsPanel.setEnabled(VGrid_None != gs.getVGridType());
        }
	});
	
	dim = new Dimension(20, 10);
	gridPanel.add(new Box.Filler(dim, dim, dim), Tools.createGridBagConstraints(0, 4, 1, 1));
	
	label = new JLabel("Grid size:");
	label.setFont(SwingTools.getPlainFont(label));
	vGridDetsPanel.add(label, Tools.createGridBagConstraints(0, 0, 1, 1));
	
	vGridSizeField = new JTextField(StringTools.toString(gSettings.getVGridSize()), 4);
	vGridDetsPanel.add(vGridSizeField, Tools.createGridBagConstraints(1, 0, 1, 1));
	vGridSizeField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(gSettings.getVGridSize()) {
		@Override public double valueChanged(JTextField field, double newValue) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
        	gs.setVGridSize(newValue);
        	return gs.getVGridSize();
        }
	});
	vGridSizeField.addKeyListener(fvalAdpt);
	
	label = new JLabel("Grid colour:");
	label.setFont(SwingTools.getPlainFont(label));
	vGridDetsPanel.add(label, Tools.createGridBagConstraints(0, 1, 1, 1));
	
	vGridColourButton = new JButton();
	vGridColourButton.setBackground(gSettings.getVGridColour());
	dim = new Dimension(35, 15);
	vGridColourButton.setSize(dim);
	vGridColourButton.setPreferredSize(dim);
	vGridDetsPanel.add(vGridColourButton, Tools.createGridBagConstraints(1, 1, 1, 1));
	vGridColourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Color nc = JColorChooser.showDialog(thisPanel, "Choose a colour for the vertical grid:",
												LiveGraph.application().getGraphSettings().getHGridColour());
			if (null == nc)	return;
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setVGridColour(nc);
			vGridColourButton.setBackground(gs.getVGridColour());
		}
	});
	vGridDetsPanel.setEnabled(false);
	
	// Horizontal grid:
	gridPanel.add(new JLabel("Horizontal grid:"), Tools.createGridBagConstraints(4, 0, 3, 1));	
	bGroup = new ButtonGroup();
	
	hGridDetsPanel = new DisEnablingPanel(new GridBagLayout());
	gridPanel.add(hGridDetsPanel, Tools.createGridBagConstraints(5, 4, 1, 1));
	
	hGridNoneButton = new JRadioButton("Do not display a grid",
									   gSettings.getHGridType() == HGrid_None);
	hGridNoneButton.setFont(SwingTools.getPlainFont(hGridNoneButton));
	gridPanel.add(hGridNoneButton, Tools.createGridBagConstraints(4, 1, 3, 1));
	bGroup.add(hGridNoneButton);
	hGridNoneButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setHGridType(HGrid_None);
			hGridNoneButton.setSelected(HGrid_None == gs.getHGridType());
			hGridSimpleButton.setSelected(HGrid_Simple == gs.getHGridType());
			hGridDetsPanel.setEnabled(HGrid_None != gs.getHGridType());
        }
	});
	
	hGridSimpleButton = new JRadioButton("Display a horizontal grid",
										 gSettings.getHGridType() == HGrid_Simple);
	hGridSimpleButton.setFont(SwingTools.getPlainFont(hGridSimpleButton));
	gridPanel.add(hGridSimpleButton, Tools.createGridBagConstraints(4, 2, 3, 1));
	bGroup.add(hGridSimpleButton);
	hGridSimpleButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setHGridType(HGrid_Simple);
			hGridNoneButton.setSelected(HGrid_None == gs.getHGridType());
			hGridSimpleButton.setSelected(HGrid_Simple == gs.getHGridType());
			hGridDetsPanel.setEnabled(HGrid_None != gs.getHGridType());
        }
	});
	
	dim = new Dimension(20, 10);
	gridPanel.add(new Box.Filler(dim, dim, dim), Tools.createGridBagConstraints(0, 4, 1, 1));
	
	label = new JLabel("Grid size:");
	label.setFont(SwingTools.getPlainFont(label));
	hGridDetsPanel.add(label, Tools.createGridBagConstraints(0, 0, 1, 1));
	
	hGridSizeField = new JTextField(StringTools.toString(gSettings.getHGridSize()), 4);
	hGridDetsPanel.add(hGridSizeField, Tools.createGridBagConstraints(1, 0, 1, 1));
	hGridSizeField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(gSettings.getHGridSize()) {
		@Override public double valueChanged(JTextField field, double newValue) { 
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setHGridSize(newValue);
        	return gs.getHGridSize();
        }
	});
	hGridSizeField.addKeyListener(fvalAdpt);
	
	label = new JLabel("Grid colour:");
	label.setFont(SwingTools.getPlainFont(label));
	hGridDetsPanel.add(label, Tools.createGridBagConstraints(0, 1, 1, 1));
	
	hGridColourButton = new JButton();
	hGridColourButton.setBackground(gSettings.getHGridColour());
	dim = new Dimension(35, 15);
	hGridColourButton.setSize(dim);
	hGridColourButton.setPreferredSize(dim);
	hGridDetsPanel.add(hGridColourButton, Tools.createGridBagConstraints(1, 1, 1, 1));
	hGridColourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Color nc = JColorChooser.showDialog(thisPanel, "Choose a colour for the horizontal grid:",
												LiveGraph.application().getGraphSettings().getHGridColour());
			if (null == nc)	return;
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setHGridColour(nc);
			vGridColourButton.setBackground(gs.getHGridColour());
		}
	});
	hGridDetsPanel.setEnabled(false);
	
	//	X axis settings:
	JPanel xAxisPanel = new JPanel(new GridBagLayout());
	thisPanel.add(xAxisPanel);
	xAxisPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
	
	xAxisPanel.add(new JLabel("X axis:"), Tools.createGridBagConstraints(0, 0, 1, 1));
	
	label = new JLabel("Type:");
	xAxisPanel.add(label, Tools.createGridBagConstraints(0, 1, 1, 1));
	label.setFont(SwingTools.getPlainFont(label));	
	label.setPreferredSize(new Dimension(100, label.getPreferredSize().height));
	label.setMinimumSize(new Dimension(100, label.getMinimumSize().height));
	
	xAxisTypeCombo = new ResizablePopupComboBox(xAxisTypeLabels);
	switch(gSettings.getXAxisType()) {
		case XAxis_DSNum:					xAxisTypeCombo.setSelectedIndex(0); break;
		case XAxis_DataValSimple:			xAxisTypeCombo.setSelectedIndex(1); break;
		case XAxis_DataValTrans0to1:		xAxisTypeCombo.setSelectedIndex(2); break;
		case XAxis_DataValScaleBySetVal:	xAxisTypeCombo.setSelectedIndex(3); break;
		case XAxis_DataValLogToSetBase:		xAxisTypeCombo.setSelectedIndex(4); break;
		case XAxis_DataValSecsToSetPower:	xAxisTypeCombo.setSelectedIndex(5); break;
		default:							throw new UnexpectedSwitchCase(gSettings.getXAxisType());
	}
	xAxisPanel.add(xAxisTypeCombo, Tools.createGridBagConstraints(1, 1, 1, 1));
	xAxisTypeCombo.setFont(SwingTools.getPlainFont(xAxisTypeCombo));
	dim = new Dimension(panelDim.width - 150, xAxisTypeCombo.getPreferredSize().height);
	xAxisTypeCombo.setPreferredSize(dim);
	xAxisTypeCombo.setMinimumSize(dim);
	xAxisTypeCombo.setMaximumSize(dim);
	xAxisTypeCombo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int sel = xAxisTypeCombo.getSelectedIndex(); 
			if (0 > sel)
				return;
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			switch(sel) {
				case 0:	 gs.setXAxisType(XAxis_DSNum); break;
				case 1:	 gs.setXAxisType(XAxis_DataValSimple); break;
				case 2:	 gs.setXAxisType(XAxis_DataValTrans0to1); break;
				case 3:	 gs.setXAxisType(XAxis_DataValScaleBySetVal); break;
				case 4:	 gs.setXAxisType(XAxis_DataValLogToSetBase); break;
				case 5:	 gs.setXAxisType(XAxis_DataValSecsToSetPower); break;
				default: throw new UnexpectedSwitchCase(sel);
			}
			xAxisTypeSet(gs.getXAxisType());
        }
	});
	
	xAxisSeriesLabel = new JLabel("Series:");
	xAxisPanel.add(xAxisSeriesLabel, Tools.createGridBagConstraints(0, 2, 1, 1));
	xAxisSeriesLabel.setFont(SwingTools.getPlainFont(xAxisSeriesLabel));
	xAxisSeriesLabel.setEnabled(false);
	xAxisSeriesLabel.setPreferredSize(new Dimension(100, xAxisSeriesLabel.getPreferredSize().height));
	xAxisSeriesLabel.setMinimumSize(new Dimension(100, xAxisSeriesLabel.getMinimumSize().height));
	
	xAxisSeriesCombo = new ResizablePopupComboBox(new String[] {});
	preferredXAxisSeriesIndex = gSettings.getXAxisSeriesIndex();	
	xAxisPanel.add(xAxisSeriesCombo, Tools.createGridBagConstraints(1, 2, 1, 1));
	dim = new Dimension(panelDim.width - 150, xAxisSeriesCombo.getPreferredSize().height);
	xAxisSeriesCombo.setPreferredSize(dim);
	xAxisSeriesCombo.setMinimumSize(dim);
	xAxisSeriesCombo.setMaximumSize(dim);
	updatingSeriesLabels = false;
	xAxisSeriesCombo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (updatingSeriesLabels || 0 > xAxisSeriesCombo.getSelectedIndex())
				return;
			GraphSettings gs = LiveGraph.application().getGraphSettings();
			gs.setXAxisSeriesIndex(xAxisSeriesCombo.getSelectedIndex());
			
			preferredXAxisSeriesIndex = Math.max(0, gs.getXAxisSeriesIndex());
			xAxisSeriesCombo.setSelectedIndex(Math.min(xAxisSeriesCombo.getItemCount() - 1,
													   preferredXAxisSeriesIndex));
        }
	});
	
	xAxisParameterLabel = new JLabel("Parameter:");
	xAxisPanel.add(xAxisParameterLabel, Tools.createGridBagConstraints(0, 3, 1, 1));
	xAxisParameterLabel.setFont(SwingTools.getPlainFont(xAxisParameterLabel));
	xAxisParameterLabel.setEnabled(false);
	xAxisParameterLabel.setPreferredSize(new Dimension(100, xAxisParameterLabel.getPreferredSize().height));
	xAxisParameterLabel.setMinimumSize(new Dimension(100, xAxisParameterLabel.getMinimumSize().height));
	
	
	xAxisParameterField = new JTextField(StringTools.toString(gSettings.getXAxisParamValue()));
	xAxisPanel.add(xAxisParameterField, Tools.createGridBagConstraints(1, 3, 1, 1));
	dim = new Dimension(panelDim.width - 150, xAxisParameterField.getPreferredSize().height);
	xAxisParameterField.setPreferredSize(dim);
	xAxisParameterField.setMinimumSize(dim);
	xAxisParameterField.setMaximumSize(dim);
	xAxisParameterField.addFocusListener(fvalAdpt = new RealNumFieldValueChangeAdaptor(gSettings.getXAxisParamValue()) {
		@Override public double valueChanged(JTextField field, double newValue) {
			GraphSettings gs = LiveGraph.application().getGraphSettings();
        	gs.setXAxisParamValue(newValue);
        	return gs.getXAxisParamValue();
        }
	});
	xAxisParameterField.addKeyListener(fvalAdpt);


	// Set all panes to the same width:
	viewportPanel.setPreferredSize(new Dimension(panelDim.width - 20, viewportPanel.getPreferredSize().height));
	gridPanel.setPreferredSize(new Dimension(panelDim.width - 20, gridPanel.getPreferredSize().height));
	xAxisPanel.setPreferredSize(new Dimension(panelDim.width - 20, xAxisPanel.getPreferredSize().height));
	
} // private void initialize()

/**
 * Updates the series selection drop down box with the specified series labels.
 * @param labels Series labels.
 */
public void setSeriesLabels(ReadOnlyIterator<String> labels) {
	
	updatingSeriesLabels = true;
	
	xAxisSeriesCombo.removeAllItems();
	
	if (null == labels) {
		updatingSeriesLabels = false;
		return;
	}
	
	while (labels.hasNext()) {
		xAxisSeriesCombo.addItem(labels.next());
	}
	
	if (preferredXAxisSeriesIndex < xAxisSeriesCombo.getItemCount())
		xAxisSeriesCombo.setSelectedIndex(preferredXAxisSeriesIndex);
	else
		xAxisSeriesCombo.setSelectedIndex(xAxisSeriesCombo.getItemCount() - 1);
	
	updatingSeriesLabels = false;
}

private void xAxisTypeSet(GraphSettings.XAxisType xAxisType) {
	switch (xAxisType) {
		case XAxis_DSNum:				  xAxisTypeCombo.setSelectedIndex(0);
										  xAxisSeriesLabel.setEnabled(false);
										  xAxisSeriesCombo.setEnabled(false);
										  xAxisParameterLabel.setText(xAxisParameterLabels[0]);
										  xAxisParameterLabel.setEnabled(false);
										  xAxisParameterField.setEnabled(false);
										  break;
		case XAxis_DataValSimple:		  xAxisTypeCombo.setSelectedIndex(1);
										  xAxisSeriesLabel.setEnabled(true);
										  xAxisSeriesCombo.setEnabled(true);
										  xAxisParameterLabel.setText(xAxisParameterLabels[1]);
										  xAxisParameterLabel.setEnabled(false);
										  xAxisParameterField.setEnabled(false);
										  break;
		case XAxis_DataValTrans0to1:	  xAxisTypeCombo.setSelectedIndex(2);
										  xAxisSeriesLabel.setEnabled(true);
										  xAxisSeriesCombo.setEnabled(true);
										  xAxisParameterLabel.setText(xAxisParameterLabels[2]);
										  xAxisParameterLabel.setEnabled(false);
										  xAxisParameterField.setEnabled(false);
										  break;
		case XAxis_DataValScaleBySetVal:  xAxisTypeCombo.setSelectedIndex(3);
										  xAxisSeriesLabel.setEnabled(true);
										  xAxisSeriesCombo.setEnabled(true);
										  xAxisParameterLabel.setText(xAxisParameterLabels[3]);
										  xAxisParameterLabel.setEnabled(true);
										  xAxisParameterField.setEnabled(true);
										  break;
		case XAxis_DataValLogToSetBase:   xAxisTypeCombo.setSelectedIndex(4);
										  xAxisSeriesLabel.setEnabled(true);
										  xAxisSeriesCombo.setEnabled(true);
										  xAxisParameterLabel.setText(xAxisParameterLabels[4]);
										  xAxisParameterLabel.setEnabled(true);
										  xAxisParameterField.setEnabled(true);
										  break;
		case XAxis_DataValSecsToSetPower: xAxisTypeCombo.setSelectedIndex(5);
										  xAxisSeriesLabel.setEnabled(true);
										  xAxisSeriesCombo.setEnabled(true);
										  xAxisParameterLabel.setText(xAxisParameterLabels[5]);
										  xAxisParameterLabel.setEnabled(true);
										  xAxisParameterField.setEnabled(true);
										  break;
		default:						  throw new UnexpectedSwitchCase(xAxisType);
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
 * Updates the series labels when the cache is updated.
 * 
 * @param event The cache event.
 */
private void processCacheEvent(Event<CacheEvent> event) {
	
	if (CacheEvent.CACHE_UpdatedLabels == event.getType()) {
		DataCache cache = (DataCache) event.getProducer();
		synchronized (cache) {
			setSeriesLabels(cache.iterateDataSeriesLabels());
		}
	}
}

/**
 * Updates the display of the graph settings when they have been changed.
 * 
 * @param event Describes the change event.
 */
@Override
protected void processSettingsEvent(Event<SettingsEvent> event) {

	final GraphSettings settings = LiveGraph.application().getGraphSettings();
	final boolean loadEvent = (SettingsEvent.GS_Load == event.getType());
	
	if (SettingsEvent.GS_MinY == event.getType() || loadEvent) {
		if (Double.isNaN(settings.getMinY())) {
			minYAutoButton.setSelected(true);
			minYValButton.setSelected(false);
			minYField.setEnabled(false);
		} else {
			minYAutoButton.setSelected(false);
			minYValButton.setSelected(true);
			minYField.setEnabled(true);
			minYField.setText(StringTools.toString(settings.getMinY()));			
		}
	}
	
	if (SettingsEvent.GS_MaxY == event.getType() || loadEvent) {
		if (Double.isNaN(settings.getMaxY())) {
			maxYAutoButton.setSelected(true);
			maxYValButton.setSelected(false);
			maxYField.setEnabled(false);
		} else {
			maxYAutoButton.setSelected(false);
			maxYValButton.setSelected(true);
			maxYField.setEnabled(true);
			maxYField.setText(StringTools.toString(settings.getMaxY()));
		}
	}
	
	if (SettingsEvent.GS_MinX == event.getType() || loadEvent) {
		if (Double.isNaN(settings.getMinX())) {
			minXAutoButton.setSelected(true);
			minXValButton.setSelected(false);
			minXField.setEnabled(false);
		} else {	
			minXAutoButton.setSelected(false);
			minXValButton.setSelected(true);
			minXField.setEnabled(true);
			minXField.setText(StringTools.toString(settings.getMinX()));
		}
	}
	
	if (SettingsEvent.GS_MaxX == event.getType() || loadEvent) {
		if (Double.isNaN(settings.getMaxX())) {
			maxXAutoButton.setSelected(true);
			maxXValButton.setSelected(false);
			maxXField.setEnabled(false);
		} else {
			maxXAutoButton.setSelected(false);
			maxXValButton.setSelected(true);
			maxXField.setEnabled(true);
			maxXField.setText(StringTools.toString(settings.getMaxX()));		
		}
	}
	
	if (SettingsEvent.GS_VGridType == event.getType() || loadEvent) {
		switch (settings.getVGridType()) {
			case VGrid_None:			vGridDetsPanel.setEnabled(false);
										vGridNoneButton.setSelected(true);
										break;
			case VGrid_DSNumAligned:	vGridDetsPanel.setEnabled(true);
										vGridDSNumAlignedButton.setSelected(true);
										break;
			case VGrid_XAUnitAligned:	vGridDetsPanel.setEnabled(true);
										vGridXAUnitAlignedButton.setSelected(true);
										break;
			default: throw new UnexpectedSwitchCase(settings.getVGridType());
		}
	}
	
	if (SettingsEvent.GS_VGridSize == event.getType() || loadEvent) {
		vGridSizeField.setText(StringTools.toString(settings.getVGridSize()));
	}
	
	if (SettingsEvent.GS_VGridColour == event.getType() || loadEvent) {
		vGridColourButton.setBackground(settings.getVGridColour());
	}
	
	if (SettingsEvent.GS_HGridType == event.getType() || loadEvent) {
		switch (settings.getHGridType()) {
			case HGrid_None:	hGridDetsPanel.setEnabled(false);
								hGridNoneButton.setSelected(true);
								break;
			case HGrid_Simple:	hGridDetsPanel.setEnabled(true);
								hGridSimpleButton.setSelected(true);
								break;
			default: throw new UnexpectedSwitchCase(settings.getHGridType());
		}
	}
	
	if (SettingsEvent.GS_HGridSize == event.getType() || loadEvent) {
		hGridSizeField.setText(StringTools.toString(settings.getHGridSize()));
	}
	
	if (SettingsEvent.GS_HGridColour == event.getType() || loadEvent) {
		hGridColourButton.setBackground(settings.getHGridColour());
	}
	
	if (SettingsEvent.GS_XAxisType == event.getType() || loadEvent) {
		xAxisTypeSet(settings.getXAxisType());
	}
	
	if (SettingsEvent.GS_XAxisSeriesIndex == event.getType() || loadEvent) {
		preferredXAxisSeriesIndex = Math.max(0, settings.getXAxisSeriesIndex());
		xAxisSeriesCombo.setSelectedIndex(Math.min(xAxisSeriesCombo.getItemCount() - 1,
												   preferredXAxisSeriesIndex));
	}
	
	if (SettingsEvent.GS_XAxisParamValue == event.getType() || loadEvent) {
		xAxisParameterField.setText(StringTools.toString(settings.getXAxisParamValue()));
	}
}  // protected void processSettingsEvent

}  // public class GraphSettingsPanel
