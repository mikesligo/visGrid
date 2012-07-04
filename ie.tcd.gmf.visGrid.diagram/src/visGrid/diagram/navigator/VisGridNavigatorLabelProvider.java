package visGrid.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class VisGridNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		visGrid.diagram.part.VisGridDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		visGrid.diagram.part.VisGridDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof visGrid.diagram.navigator.VisGridNavigatorItem
				&& !isOwnView(((visGrid.diagram.navigator.VisGridNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof visGrid.diagram.navigator.VisGridNavigatorGroup) {
			visGrid.diagram.navigator.VisGridNavigatorGroup group = (visGrid.diagram.navigator.VisGridNavigatorGroup) element;
			return visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof visGrid.diagram.navigator.VisGridNavigatorItem) {
			visGrid.diagram.navigator.VisGridNavigatorItem navigatorItem = (visGrid.diagram.navigator.VisGridNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Line_configuration", visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Pqload", visGrid.diagram.providers.VisGridElementTypes.Pqload_2006); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Link", visGrid.diagram.providers.VisGridElementTypes.Link_2004); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Rectifier", visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_node", visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Microwave", visGrid.diagram.providers.VisGridElementTypes.Microwave_2018); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Node", visGrid.diagram.providers.VisGridElementTypes.Node_2054); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Motor", visGrid.diagram.providers.VisGridElementTypes.Motor_2065); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Inverter", visGrid.diagram.providers.VisGridElementTypes.Inverter_2058); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line_configuration", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Restoration", visGrid.diagram.providers.VisGridElementTypes.Restoration_2013); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Histogram", visGrid.diagram.providers.VisGridElementTypes.Histogram_2069); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Multizone", visGrid.diagram.providers.VisGridElementTypes.Multizone_2066); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Dryer", visGrid.diagram.providers.VisGridElementTypes.Dryer_2052); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Refrigerator", visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_meter", visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Comm", visGrid.diagram.providers.VisGridElementTypes.Comm_2074); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Collector", visGrid.diagram.providers.VisGridElementTypes.Collector_2021); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Line_spacing", visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?House", visGrid.diagram.providers.VisGridElementTypes.House_2016); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Switch", visGrid.diagram.providers.VisGridElementTypes.Switch_2071); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Volt_var_control", visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Fuse", visGrid.diagram.providers.VisGridElementTypes.Fuse_2057); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connection?connections", visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Controller", visGrid.diagram.providers.VisGridElementTypes.Controller_2040); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Battery", visGrid.diagram.providers.VisGridElementTypes.Battery_2002); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Billdump", visGrid.diagram.providers.VisGridElementTypes.Billdump_2070); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Occupantload", visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Diesel_dg", visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Power_electronics", visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Stubauction", visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Regulator", visGrid.diagram.providers.VisGridElementTypes.Regulator_2031); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Relay", visGrid.diagram.providers.VisGridElementTypes.Relay_2017); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line_conductor", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Lights", visGrid.diagram.providers.VisGridElementTypes.Lights_2056); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Overhead_line_conductor", visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Shaper", visGrid.diagram.providers.VisGridElementTypes.Shaper_2003); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tcd.ie?Grid", visGrid.diagram.providers.VisGridElementTypes.Grid_1000); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Evcharger", visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Auction", visGrid.diagram.providers.VisGridElementTypes.Auction_2047); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Transformer_configuration", visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Recorder", visGrid.diagram.providers.VisGridElementTypes.Recorder_2046); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Solar", visGrid.diagram.providers.VisGridElementTypes.Solar_2051); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Freezer", visGrid.diagram.providers.VisGridElementTypes.Freezer_2014); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Series_reactor", visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Energy_storage", visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Substation", visGrid.diagram.providers.VisGridElementTypes.Substation_2067); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Waterheater", visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Dishwasher", visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Csv_reader", visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Regulator_configuration", visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connection?parent", visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Climate", visGrid.diagram.providers.VisGridElementTypes.Climate_2059); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Microturbine", visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Dc_dc_converter", visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Underground_line_conductor", visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Plugload", visGrid.diagram.providers.VisGridElementTypes.Plugload_2019); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Windturb_dg", visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Clotheswasher", visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Voltdump", visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Player", visGrid.diagram.providers.VisGridElementTypes.Player_2015); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Office", visGrid.diagram.providers.VisGridElementTypes.Office_2060); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Controller2", visGrid.diagram.providers.VisGridElementTypes.Controller2_2029); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Weather", visGrid.diagram.providers.VisGridElementTypes.Weather_2044); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Range", visGrid.diagram.providers.VisGridElementTypes.Range_2043); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Line", visGrid.diagram.providers.VisGridElementTypes.Line_2034); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Plc", visGrid.diagram.providers.VisGridElementTypes.Plc_2073); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Residential_enduse", visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Underground_line", visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Load", visGrid.diagram.providers.VisGridElementTypes.Load_2005); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?House_a", visGrid.diagram.providers.VisGridElementTypes.House_a_2008); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Generator", visGrid.diagram.providers.VisGridElementTypes.Generator_2072); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Overhead_line", visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Capbank", visGrid.diagram.providers.VisGridElementTypes.Capbank_2024); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Transformer", visGrid.diagram.providers.VisGridElementTypes.Transformer_2001); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Fault_check", visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Meter", visGrid.diagram.providers.VisGridElementTypes.Meter_2049); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Capacitor", visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Frequency_gen", visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?ZIPload", visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = visGrid.diagram.part.VisGridDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& visGrid.diagram.providers.VisGridElementTypes
						.isKnownElementType(elementType)) {
			image = visGrid.diagram.providers.VisGridElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof visGrid.diagram.navigator.VisGridNavigatorGroup) {
			visGrid.diagram.navigator.VisGridNavigatorGroup group = (visGrid.diagram.navigator.VisGridNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof visGrid.diagram.navigator.VisGridNavigatorItem) {
			visGrid.diagram.navigator.VisGridNavigatorItem navigatorItem = (visGrid.diagram.navigator.VisGridNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2053Text(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2006Text(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004Text(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2075Text(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042Text(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2018Text(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2054Text(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2065Text(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2058Text(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2030Text(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2013Text(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2069Text(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2066Text(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2052Text(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2020Text(view);
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2050Text(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2074Text(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2021Text(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2025Text(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2016Text(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071Text(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2022Text(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2057Text(view);
		case visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID:
			return getConnectionConnections_4002Text(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2040Text(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2002Text(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2070Text(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2037Text(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2077Text(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2061Text(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2048Text(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2031Text(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2017Text(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2064Text(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2056Text(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2039Text(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2003Text(view);
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000Text(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2012Text(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2047Text(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2007Text(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2046Text(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2027Text(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2051Text(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2014Text(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2032Text(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2076Text(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2067Text(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2062Text(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2010Text(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2033Text(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2009Text(view);
		case visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID:
			return getConnectionParent_4001Text(view);
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2059Text(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2038Text(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2068Text(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2026Text(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2019Text(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2078Text(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2063Text(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2023Text(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2015Text(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2060Text(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2029Text(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044Text(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2043Text(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2034Text(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2073Text(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2011Text(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2041Text(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2005Text(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2008Text(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2072Text(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2036Text(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2024Text(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2001Text(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2028Text(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2049Text(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2045Text(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2035Text(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2055Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getLine_configuration_2053Text(View view) {
		visGrid.Line_configuration domainModelElement = (visGrid.Line_configuration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPqload_2006Text(View view) {
		visGrid.Pqload domainModelElement = (visGrid.Pqload) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_2004Text(View view) {
		visGrid.Link domainModelElement = (visGrid.Link) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRectifier_2075Text(View view) {
		visGrid.Rectifier domainModelElement = (visGrid.Rectifier) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_node_2042Text(View view) {
		visGrid.Triplex_node domainModelElement = (visGrid.Triplex_node) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMicrowave_2018Text(View view) {
		visGrid.Microwave domainModelElement = (visGrid.Microwave) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2054Text(View view) {
		visGrid.Node domainModelElement = (visGrid.Node) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMotor_2065Text(View view) {
		visGrid.Motor domainModelElement = (visGrid.Motor) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInverter_2058Text(View view) {
		visGrid.Inverter domainModelElement = (visGrid.Inverter) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_configuration_2030Text(View view) {
		visGrid.Triplex_line_configuration domainModelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRestoration_2013Text(View view) {
		visGrid.Restoration domainModelElement = (visGrid.Restoration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHistogram_2069Text(View view) {
		visGrid.Histogram domainModelElement = (visGrid.Histogram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultizone_2066Text(View view) {
		visGrid.Multizone domainModelElement = (visGrid.Multizone) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDryer_2052Text(View view) {
		visGrid.Dryer domainModelElement = (visGrid.Dryer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRefrigerator_2020Text(View view) {
		visGrid.Refrigerator domainModelElement = (visGrid.Refrigerator) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_meter_2050Text(View view) {
		visGrid.Triplex_meter domainModelElement = (visGrid.Triplex_meter) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComm_2074Text(View view) {
		visGrid.Comm domainModelElement = (visGrid.Comm) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollector_2021Text(View view) {
		visGrid.Collector domainModelElement = (visGrid.Collector) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLine_spacing_2025Text(View view) {
		visGrid.Line_spacing domainModelElement = (visGrid.Line_spacing) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHouse_2016Text(View view) {
		visGrid.House domainModelElement = (visGrid.House) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitch_2071Text(View view) {
		visGrid.Switch domainModelElement = (visGrid.Switch) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVolt_var_control_2022Text(View view) {
		visGrid.Volt_var_control domainModelElement = (visGrid.Volt_var_control) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFuse_2057Text(View view) {
		visGrid.Fuse domainModelElement = (visGrid.Fuse) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionConnections_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getController_2040Text(View view) {
		visGrid.Controller domainModelElement = (visGrid.Controller) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBattery_2002Text(View view) {
		visGrid.Battery domainModelElement = (visGrid.Battery) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBilldump_2070Text(View view) {
		visGrid.Billdump domainModelElement = (visGrid.Billdump) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOccupantload_2037Text(View view) {
		visGrid.Occupantload domainModelElement = (visGrid.Occupantload) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDiesel_dg_2077Text(View view) {
		visGrid.Diesel_dg domainModelElement = (visGrid.Diesel_dg) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPower_electronics_2061Text(View view) {
		visGrid.Power_electronics domainModelElement = (visGrid.Power_electronics) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStubauction_2048Text(View view) {
		visGrid.Stubauction domainModelElement = (visGrid.Stubauction) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegulator_2031Text(View view) {
		visGrid.Regulator domainModelElement = (visGrid.Regulator) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelay_2017Text(View view) {
		visGrid.Relay domainModelElement = (visGrid.Relay) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_conductor_2064Text(View view) {
		visGrid.Triplex_line_conductor domainModelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLights_2056Text(View view) {
		visGrid.Lights domainModelElement = (visGrid.Lights) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOverhead_line_conductor_2039Text(View view) {
		visGrid.Overhead_line_conductor domainModelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getShaper_2003Text(View view) {
		visGrid.Shaper domainModelElement = (visGrid.Shaper) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGrid_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvcharger_2012Text(View view) {
		visGrid.Evcharger domainModelElement = (visGrid.Evcharger) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAuction_2047Text(View view) {
		visGrid.Auction domainModelElement = (visGrid.Auction) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformer_configuration_2007Text(View view) {
		visGrid.Transformer_configuration domainModelElement = (visGrid.Transformer_configuration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecorder_2046Text(View view) {
		visGrid.Recorder domainModelElement = (visGrid.Recorder) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_2027Text(View view) {
		visGrid.Triplex_line domainModelElement = (visGrid.Triplex_line) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSolar_2051Text(View view) {
		visGrid.Solar domainModelElement = (visGrid.Solar) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFreezer_2014Text(View view) {
		visGrid.Freezer domainModelElement = (visGrid.Freezer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSeries_reactor_2032Text(View view) {
		visGrid.Series_reactor domainModelElement = (visGrid.Series_reactor) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnergy_storage_2076Text(View view) {
		visGrid.Energy_storage domainModelElement = (visGrid.Energy_storage) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubstation_2067Text(View view) {
		visGrid.Substation domainModelElement = (visGrid.Substation) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWaterheater_2062Text(View view) {
		visGrid.Waterheater domainModelElement = (visGrid.Waterheater) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDishwasher_2010Text(View view) {
		visGrid.Dishwasher domainModelElement = (visGrid.Dishwasher) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCsv_reader_2033Text(View view) {
		visGrid.Csv_reader domainModelElement = (visGrid.Csv_reader) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegulator_configuration_2009Text(View view) {
		visGrid.Regulator_configuration domainModelElement = (visGrid.Regulator_configuration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionParent_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClimate_2059Text(View view) {
		visGrid.Climate domainModelElement = (visGrid.Climate) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMicroturbine_2038Text(View view) {
		visGrid.Microturbine domainModelElement = (visGrid.Microturbine) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDc_dc_converter_2068Text(View view) {
		visGrid.Dc_dc_converter domainModelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnderground_line_conductor_2026Text(View view) {
		visGrid.Underground_line_conductor domainModelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlugload_2019Text(View view) {
		visGrid.Plugload domainModelElement = (visGrid.Plugload) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWindturb_dg_2078Text(View view) {
		visGrid.Windturb_dg domainModelElement = (visGrid.Windturb_dg) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClotheswasher_2063Text(View view) {
		visGrid.Clotheswasher domainModelElement = (visGrid.Clotheswasher) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVoltdump_2023Text(View view) {
		visGrid.Voltdump domainModelElement = (visGrid.Voltdump) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlayer_2015Text(View view) {
		visGrid.Player domainModelElement = (visGrid.Player) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOffice_2060Text(View view) {
		visGrid.Office domainModelElement = (visGrid.Office) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getController2_2029Text(View view) {
		visGrid.Controller2 domainModelElement = (visGrid.Controller2) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWeather_2044Text(View view) {
		visGrid.Weather domainModelElement = (visGrid.Weather) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRange_2043Text(View view) {
		visGrid.Range domainModelElement = (visGrid.Range) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLine_2034Text(View view) {
		visGrid.Line domainModelElement = (visGrid.Line) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlc_2073Text(View view) {
		visGrid.Plc domainModelElement = (visGrid.Plc) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResidential_enduse_2011Text(View view) {
		visGrid.Residential_enduse domainModelElement = (visGrid.Residential_enduse) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnderground_line_2041Text(View view) {
		visGrid.Underground_line domainModelElement = (visGrid.Underground_line) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoad_2005Text(View view) {
		visGrid.Load domainModelElement = (visGrid.Load) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHouse_a_2008Text(View view) {
		visGrid.House_a domainModelElement = (visGrid.House_a) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGenerator_2072Text(View view) {
		visGrid.Generator domainModelElement = (visGrid.Generator) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOverhead_line_2036Text(View view) {
		visGrid.Overhead_line domainModelElement = (visGrid.Overhead_line) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapbank_2024Text(View view) {
		visGrid.Capbank domainModelElement = (visGrid.Capbank) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformer_2001Text(View view) {
		visGrid.Transformer domainModelElement = (visGrid.Transformer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFault_check_2028Text(View view) {
		visGrid.Fault_check domainModelElement = (visGrid.Fault_check) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeter_2049Text(View view) {
		visGrid.Meter domainModelElement = (visGrid.Meter) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapacitor_2045Text(View view) {
		visGrid.Capacitor domainModelElement = (visGrid.Capacitor) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFrequency_gen_2035Text(View view) {
		visGrid.Frequency_gen domainModelElement = (visGrid.Frequency_gen) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getZIPload_2055Text(View view) {
		visGrid.ZIPload domainModelElement = (visGrid.ZIPload) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(visGrid.diagram.part.VisGridVisualIDRegistry
						.getModelID(view));
	}

}
