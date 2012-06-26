package visGrid.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
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
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Volt_var_control", visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2067); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Occupantload", visGrid.diagram.providers.VisGridElementTypes.Occupantload_2065); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Diesel_dg", visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Diesel_dg?Connection", visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Collector", visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Generator?Connection", visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Waterheater", visGrid.diagram.providers.VisGridElementTypes.Waterheater_2068); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Occupantload?Connection", visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Microturbine", visGrid.diagram.providers.VisGridElementTypes.Microturbine_2024); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Battery", visGrid.diagram.providers.VisGridElementTypes.Battery_2069); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Dryer", visGrid.diagram.providers.VisGridElementTypes.Dryer_2060); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Series_reactor", visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Volt_var_control", visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Fault_check", visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Solar", visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Link", visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?House_a", visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Link?Connection", visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Pqload", visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Diesel_dg", visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2079); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Generator", visGrid.diagram.providers.VisGridElementTypes.Generator_2075); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Underground_line", visGrid.diagram.providers.VisGridElementTypes.Underground_line_2037); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Plugload", visGrid.diagram.providers.VisGridElementTypes.Plugload_2031); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Overhead_line_conductor", visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2004); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Weather", visGrid.diagram.providers.VisGridElementTypes.Weather_2044); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Lights", visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Restoration?Connection", visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Solar?Connection", visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Windturb_dg?Connection", visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Dryer?Connection", visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Range?Connection", visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Solar", visGrid.diagram.providers.VisGridElementTypes.Solar_2026); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Regulator_configuration", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Plc?Connection", visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Dc_dc_converter", visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Comm", visGrid.diagram.providers.VisGridElementTypes.Comm_2056); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Transformer_configuration", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Recorder", visGrid.diagram.providers.VisGridElementTypes.Recorder_2064); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Regulator", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Connections", visGrid.diagram.providers.VisGridElementTypes.Connections_2077); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Line_spacing?Connection", visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Climate?Connection", visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Line_configuration?Connection", visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Series_reactor", visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2041); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?ZIPload?Connection", visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_line_configuration?Connection", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Residential_enduse", visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tcd.ie?Grid", visGrid.diagram.providers.VisGridElementTypes.Grid_1000); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Billdump", visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?House_a?Connection", visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Dc_dc_converter?Connection", visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Overhead_line_conductor", visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Inverter?Connection", visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Stubauction?Connection", visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Evcharger", visGrid.diagram.providers.VisGridElementTypes.Evcharger_2059); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_line?Connection", visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Freezer", visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Weather", visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Regulator", visGrid.diagram.providers.VisGridElementTypes.Regulator_2005); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Line", visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Rectifier?Connection", visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Microwave", visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Office", visGrid.diagram.providers.VisGridElementTypes.Office_2054); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Office?Connection", visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Underground_line_conductor", visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2036); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Dryer", visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Voltdump", visGrid.diagram.providers.VisGridElementTypes.Voltdump_2046); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_line_conductor?Connection", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Auction?Connection", visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Fault_check", visGrid.diagram.providers.VisGridElementTypes.Fault_check_2063); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Node", visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Histogram", visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Auction", visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Energy_storage", visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2014); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Plugload", visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Underground_line_conductor", visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Node", visGrid.diagram.providers.VisGridElementTypes.Node_2007); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Residential_enduse", visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2013); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Regulator?Connection", visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Relay?Connection", visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Overhead_line?Connection", visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Pqload", visGrid.diagram.providers.VisGridElementTypes.Pqload_2011); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Overhead_line", visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Restoration", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_node", visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?House_a", visGrid.diagram.providers.VisGridElementTypes.House_a_2038); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Energy_storage?Connection", visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Comm", visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Controller2", visGrid.diagram.providers.VisGridElementTypes.Controller2_2015); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Link", visGrid.diagram.providers.VisGridElementTypes.Link_2032); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Restoration", visGrid.diagram.providers.VisGridElementTypes.Restoration_2040); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Comm?Connection", visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Climate", visGrid.diagram.providers.VisGridElementTypes.Climate_2001); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Regulator_configuration", visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2010); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Meter", visGrid.diagram.providers.VisGridElementTypes.Meter_2002); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Inverter", visGrid.diagram.providers.VisGridElementTypes.Inverter_2045); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Refrigerator", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Power_electronics", visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Frequency_gen", visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2050); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Line_spacing", visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2003); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Multizone", visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Climate", visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Csv_reader", visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Dishwasher?Connection", visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Relay", visGrid.diagram.providers.VisGridElementTypes.Relay_2009); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Shaper", visGrid.diagram.providers.VisGridElementTypes.Shaper_2074); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Transformer_configuration?Connection", visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Auction", visGrid.diagram.providers.VisGridElementTypes.Auction_2025); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Clotheswasher", visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2049); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Capacitor", visGrid.diagram.providers.VisGridElementTypes.Capacitor_2023); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Generator", visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Fuse", visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Player", visGrid.diagram.providers.VisGridElementTypes.Player_2018); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Capbank", visGrid.diagram.providers.VisGridElementTypes.Capbank_2017); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Underground_line_conductor?Connection", visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Microwave", visGrid.diagram.providers.VisGridElementTypes.Microwave_2055); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Freezer?Connection", visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Refrigerator?Connection", visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Csv_reader?Connection", visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Motor", visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Triplex_line_conductor", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?House", visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Underground_line?Connection", visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Histogram", visGrid.diagram.providers.VisGridElementTypes.Histogram_2073); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_meter?Connection", visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Capbank?Connection", visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Frequency_gen?Connection", visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Controller2", visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Motor?Connection", visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Collector?Connection", visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Fuse", visGrid.diagram.providers.VisGridElementTypes.Fuse_2066); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Waterheater", visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Windturb_dg", visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Triplex_meter", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?House", visGrid.diagram.providers.VisGridElementTypes.House_2012); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Collector", visGrid.diagram.providers.VisGridElementTypes.Collector_2053); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Pqload?Connection", visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Series_reactor?Connection", visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Regulator_configuration?Connection", visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Csv_reader", visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2070); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Load", visGrid.diagram.providers.VisGridElementTypes.Load_2043); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Switch", visGrid.diagram.providers.VisGridElementTypes.Switch_2071); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Clotheswasher", visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Transformer_configuration", visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2057); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Line_spacing", visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Line_configuration", visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2028); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Transformer?Connection", visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Overhead_line", visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2034); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Shaper", visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Plc", visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Office", visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Multizone", visGrid.diagram.providers.VisGridElementTypes.Multizone_2027); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2030); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Line?Connection", visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Microturbine?Connection", visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Triplex_node", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Load", visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Plc", visGrid.diagram.providers.VisGridElementTypes.Plc_2061); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Stubauction", visGrid.diagram.providers.VisGridElementTypes.Stubauction_2020); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_meter", visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2052); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Waterheater?Connection", visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Fault_check?Connection", visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Stubauction", visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Capacitor", visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Controller", visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Energy_storage", visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Shaper?Connection", visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Motor", visGrid.diagram.providers.VisGridElementTypes.Motor_2078); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Triplex_line", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Histogram?Connection", visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Dc_dc_converter", visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2019); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Rectifier", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Windturb_dg", visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2051); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?ZIPload", visGrid.diagram.providers.VisGridElementTypes.ZIPload_2062); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Voltdump", visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Transformer", visGrid.diagram.providers.VisGridElementTypes.Transformer_2035); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Power_electronics?Connection", visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Substation", visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Range", visGrid.diagram.providers.VisGridElementTypes.Range_2022); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Substation", visGrid.diagram.providers.VisGridElementTypes.Substation_2048); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Recorder", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Player?Connection", visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Residential_enduse?Connection", visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Controller?Connection", visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Dishwasher", visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Frequency_gen", visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Relay", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Plugload?Connection", visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Capbank", visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line_conductor", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2047); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?ZIPload", visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Overhead_line_conductor?Connection", visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Microturbine", visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Meter", visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Lights", visGrid.diagram.providers.VisGridElementTypes.Lights_2039); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Capacitor?Connection", visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Switch?Connection", visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Freezer", visGrid.diagram.providers.VisGridElementTypes.Freezer_2058); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Occupantload", visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_node?Connection", visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Battery", visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Fuse?Connection", visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Battery?Connection", visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Weather?Connection", visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Node?Connection", visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Line", visGrid.diagram.providers.VisGridElementTypes.Line_2021); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Lights?Connection", visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Controller2?Connection", visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Recorder?Connection", visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Controller", visGrid.diagram.providers.VisGridElementTypes.Controller_2006); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Multizone?Connection", visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Power_electronics", visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2033); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?House?Connection", visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Meter?Connection", visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Inverter", visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Substation?Connection", visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Triplex_line_configuration", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Underground_line", visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Volt_var_control?Connection", visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Voltdump?Connection", visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Switch", visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Refrigerator", visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2029); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Billdump?Connection", visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Line_configuration", visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Transformer", visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Evcharger", visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Range", visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Dishwasher", visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Connections?Player", visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Clotheswasher?Connection", visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line_configuration", visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2076); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Rectifier", visGrid.diagram.providers.VisGridElementTypes.Rectifier_2008); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Evcharger?Connection", visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Microwave?Connection", visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Billdump", visGrid.diagram.providers.VisGridElementTypes.Billdump_2016); //$NON-NLS-1$
		case visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Load?Connection", visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117); //$NON-NLS-1$
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
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2067Text(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2065Text(view);
		case visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID:
			return getConnectionsDiesel_dg_4136Text(view);
		case visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID:
			return getDiesel_dgConnection_4115Text(view);
		case visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID:
			return getConnectionsCollector_4087Text(view);
		case visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID:
			return getGeneratorConnection_4099Text(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2068Text(view);
		case visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID:
			return getOccupantloadConnection_4018Text(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2024Text(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2069Text(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2060Text(view);
		case visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID:
			return getConnectionsSeries_reactor_4058Text(view);
		case visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID:
			return getConnectionsVolt_var_control_4153Text(view);
		case visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID:
			return getConnectionsFault_check_4046Text(view);
		case visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID:
			return getConnectionsSolar_4068Text(view);
		case visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID:
			return getConnectionsLink_4097Text(view);
		case visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID:
			return getConnectionsHouse_a_4003Text(view);
		case visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID:
			return getLinkConnection_4013Text(view);
		case visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID:
			return getConnectionsPqload_4060Text(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2079Text(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2075Text(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2037Text(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2031Text(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2004Text(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044Text(view);
		case visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID:
			return getConnectionsLights_4055Text(view);
		case visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID:
			return getRestorationConnection_4077Text(view);
		case visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID:
			return getSolarConnection_4025Text(view);
		case visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID:
			return getWindturb_dgConnection_4093Text(view);
		case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID:
			return getDryerConnection_4047Text(view);
		case visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID:
			return getRangeConnection_4151Text(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2026Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID:
			return getConnectionsRegulator_configuration_4090Text(view);
		case visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID:
			return getPlcConnection_4120Text(view);
		case visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID:
			return getConnectionsDc_dc_converter_4006Text(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2056Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID:
			return getConnectionsTransformer_configuration_4059Text(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2064Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID:
			return getConnectionsRegulator_4112Text(view);
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
			return getConnections_2077Text(view);
		case visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID:
			return getLine_spacingConnection_4125Text(view);
		case visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID:
			return getClimateConnection_4015Text(view);
		case visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID:
			return getLine_configurationConnection_4011Text(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2041Text(view);
		case visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID:
			return getZIPloadConnection_4009Text(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID:
			return getTriplex_line_configurationConnection_4126Text(view);
		case visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID:
			return getConnectionsResidential_enduse_4037Text(view);
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000Text(view);
		case visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID:
			return getConnectionsBilldump_4066Text(view);
		case visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID:
			return getHouse_aConnection_4044Text(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID:
			return getDc_dc_converterConnection_4074Text(view);
		case visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID:
			return getConnectionsOverhead_line_conductor_4150Text(view);
		case visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID:
			return getInverterConnection_4065Text(view);
		case visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID:
			return getStubauctionConnection_4098Text(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2059Text(view);
		case visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID:
			return getTriplex_lineConnection_4039Text(view);
		case visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID:
			return getConnectionsFreezer_4079Text(view);
		case visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID:
			return getConnectionsWeather_4145Text(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2005Text(view);
		case visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID:
			return getConnectionsLine_4122Text(view);
		case visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID:
			return getRectifierConnection_4075Text(view);
		case visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID:
			return getConnectionsMicrowave_4105Text(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2054Text(view);
		case visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID:
			return getOfficeConnection_4070Text(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2036Text(view);
		case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID:
			return getConnectionsDryer_4094Text(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2046Text(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID:
			return getTriplex_line_conductorConnection_4062Text(view);
		case visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID:
			return getAuctionConnection_4138Text(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2063Text(view);
		case visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID:
			return getConnectionsNode_4134Text(view);
		case visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID:
			return getConnectionsHistogram_4109Text(view);
		case visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID:
			return getConnectionsAuction_4028Text(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2014Text(view);
		case visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID:
			return getConnectionsPlugload_4104Text(view);
		case visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID:
			return getConnectionsUnderground_line_conductor_4014Text(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007Text(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2013Text(view);
		case visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID:
			return getRegulatorConnection_4084Text(view);
		case visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID:
			return getRelayConnection_4026Text(view);
		case visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID:
			return getOverhead_lineConnection_4123Text(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2011Text(view);
		case visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID:
			return getConnectionsOverhead_line_4156Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID:
			return getConnectionsRestoration_4142Text(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042Text(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2038Text(view);
		case visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID:
			return getEnergy_storageConnection_4042Text(view);
		case visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID:
			return getConnectionsComm_4053Text(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2015Text(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2032Text(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2040Text(view);
		case visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID:
			return getCommConnection_4086Text(view);
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2001Text(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2010Text(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2002Text(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2045Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID:
			return getConnectionsRefrigerator_4030Text(view);
		case visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID:
			return getConnectionsPower_electronics_4061Text(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2050Text(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2003Text(view);
		case visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID:
			return getConnectionsMultizone_4100Text(view);
		case visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID:
			return getConnectionsClimate_4010Text(view);
		case visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID:
			return getConnectionsCsv_reader_4064Text(view);
		case visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID:
			return getDishwasherConnection_4106Text(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2009Text(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2074Text(view);
		case visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID:
			return getTransformer_configurationConnection_4111Text(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2025Text(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2049Text(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2023Text(view);
		case visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID:
			return getConnectionsGenerator_4076Text(view);
		case visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID:
			return getConnectionsFuse_4052Text(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2018Text(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2017Text(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID:
			return getUnderground_line_conductorConnection_4128Text(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2055Text(view);
		case visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID:
			return getFreezerConnection_4089Text(view);
		case visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID:
			return getRefrigeratorConnection_4072Text(view);
		case visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID:
			return getCsv_readerConnection_4027Text(view);
		case visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID:
			return getConnectionsMotor_4143Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID:
			return getConnectionsTriplex_line_conductor_4004Text(view);
		case visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID:
			return getConnectionsHouse_4008Text(view);
		case visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID:
			return getUnderground_lineConnection_4149Text(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2073Text(view);
		case visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID:
			return getTriplex_meterConnection_4133Text(view);
		case visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID:
			return getCapbankConnection_4016Text(view);
		case visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID:
			return getFrequency_genConnection_4082Text(view);
		case visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID:
			return getConnectionsController2_4092Text(view);
		case visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID:
			return getMotorConnection_4063Text(view);
		case visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID:
			return getCollectorConnection_4113Text(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2066Text(view);
		case visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID:
			return getConnectionsWaterheater_4114Text(view);
		case visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID:
			return getConnectionsWindturb_dg_4102Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID:
			return getConnectionsTriplex_meter_4127Text(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2012Text(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2053Text(view);
		case visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID:
			return getPqloadConnection_4069Text(view);
		case visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID:
			return getSeries_reactorConnection_4132Text(view);
		case visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID:
			return getRegulator_configurationConnection_4007Text(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2070Text(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2043Text(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071Text(view);
		case visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID:
			return getConnectionsClotheswasher_4050Text(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2057Text(view);
		case visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID:
			return getConnectionsLine_spacing_4051Text(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2028Text(view);
		case visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID:
			return getTransformerConnection_4040Text(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2034Text(view);
		case visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID:
			return getConnectionsShaper_4021Text(view);
		case visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID:
			return getConnectionsPlc_4022Text(view);
		case visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID:
			return getConnectionsOffice_4023Text(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2027Text(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2030Text(view);
		case visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID:
			return getLineConnection_4137Text(view);
		case visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID:
			return getMicroturbineConnection_4034Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID:
			return getConnectionsTriplex_node_4083Text(view);
		case visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID:
			return getConnectionsLoad_4140Text(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2061Text(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2020Text(view);
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2052Text(view);
		case visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID:
			return getWaterheaterConnection_4019Text(view);
		case visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID:
			return getFault_checkConnection_4049Text(view);
		case visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID:
			return getConnectionsStubauction_4017Text(view);
		case visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID:
			return getConnectionsCapacitor_4110Text(view);
		case visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID:
			return getConnectionsController_4057Text(view);
		case visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID:
			return getConnectionsEnergy_storage_4005Text(view);
		case visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID:
			return getShaperConnection_4101Text(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2078Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID:
			return getConnectionsTriplex_line_4095Text(view);
		case visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID:
			return getHistogramConnection_4124Text(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2019Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID:
			return getConnectionsRectifier_4108Text(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2051Text(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2062Text(view);
		case visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID:
			return getConnectionsVoltdump_4033Text(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2035Text(view);
		case visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID:
			return getPower_electronicsConnection_4135Text(view);
		case visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID:
			return getConnectionsSubstation_4038Text(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2022Text(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2048Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID:
			return getConnectionsRecorder_4081Text(view);
		case visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID:
			return getPlayerConnection_4119Text(view);
		case visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID:
			return getResidential_enduseConnection_4144Text(view);
		case visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID:
			return getControllerConnection_4085Text(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2072Text(view);
		case visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID:
			return getConnectionsFrequency_gen_4141Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID:
			return getConnectionsRelay_4155Text(view);
		case visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID:
			return getPlugloadConnection_4032Text(view);
		case visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID:
			return getConnectionsCapbank_4152Text(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2047Text(view);
		case visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID:
			return getConnectionsZIPload_4107Text(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID:
			return getOverhead_line_conductorConnection_4002Text(view);
		case visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID:
			return getConnectionsMicroturbine_4043Text(view);
		case visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID:
			return getConnectionsMeter_4091Text(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2039Text(view);
		case visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID:
			return getCapacitorConnection_4130Text(view);
		case visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID:
			return getSwitchConnection_4012Text(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2058Text(view);
		case visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID:
			return getConnectionsOccupantload_4071Text(view);
		case visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID:
			return getTriplex_nodeConnection_4001Text(view);
		case visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID:
			return getConnectionsBattery_4148Text(view);
		case visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID:
			return getFuseConnection_4154Text(view);
		case visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID:
			return getBatteryConnection_4078Text(view);
		case visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID:
			return getWeatherConnection_4041Text(view);
		case visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID:
			return getNodeConnection_4020Text(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2021Text(view);
		case visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID:
			return getLightsConnection_4029Text(view);
		case visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID:
			return getController2Connection_4121Text(view);
		case visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID:
			return getRecorderConnection_4103Text(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2006Text(view);
		case visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID:
			return getMultizoneConnection_4056Text(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2033Text(view);
		case visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID:
			return getHouseConnection_4073Text(view);
		case visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID:
			return getMeterConnection_4024Text(view);
		case visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID:
			return getConnectionsInverter_4036Text(view);
		case visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID:
			return getSubstationConnection_4067Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID:
			return getConnectionsTriplex_line_configuration_4147Text(view);
		case visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID:
			return getConnectionsUnderground_line_4131Text(view);
		case visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID:
			return getVolt_var_controlConnection_4088Text(view);
		case visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID:
			return getVoltdumpConnection_4129Text(view);
		case visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID:
			return getConnectionsSwitch_4116Text(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2029Text(view);
		case visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID:
			return getBilldumpConnection_4035Text(view);
		case visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID:
			return getConnectionsLine_configuration_4045Text(view);
		case visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID:
			return getConnectionsTransformer_4118Text(view);
		case visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID:
			return getConnectionsEvcharger_4054Text(view);
		case visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID:
			return getConnectionsRange_4080Text(view);
		case visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID:
			return getConnectionsDishwasher_4146Text(view);
		case visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID:
			return getConnectionsPlayer_4048Text(view);
		case visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID:
			return getClotheswasherConnection_4031Text(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2076Text(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2008Text(view);
		case visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID:
			return getEvchargerConnection_4096Text(view);
		case visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID:
			return getMicrowaveConnection_4139Text(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2016Text(view);
		case visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID:
			return getLoadConnection_4117Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getVolt_var_control_2067Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2067,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Volt_var_controlNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOccupantload_2065Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Occupantload_2065,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsDiesel_dg_4136Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDiesel_dgConnection_4115Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsCollector_4087Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGeneratorConnection_4099Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWaterheater_2068Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Waterheater_2068,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOccupantloadConnection_4018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMicroturbine_2024Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Microturbine_2024,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBattery_2069Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Battery_2069,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDryer_2060Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Dryer_2060,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsSeries_reactor_4058Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsVolt_var_control_4153Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsFault_check_4046Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsSolar_4068Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsLink_4097Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsHouse_a_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLinkConnection_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsPqload_4060Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDiesel_dg_2079Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2079,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGenerator_2075Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Generator_2075,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnderground_line_2037Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Underground_line_2037,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPlugload_2031Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Plugload_2031,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOverhead_line_conductor_2004Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2004,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWeather_2044Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Weather_2044,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsLights_4055Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRestorationConnection_4077Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSolarConnection_4025Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWindturb_dgConnection_4093Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDryerConnection_4047Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRangeConnection_4151Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSolar_2026Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Solar_2026,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsRegulator_configuration_4090Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlcConnection_4120Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsDc_dc_converter_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getComm_2056Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Comm_2056,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.CommNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsTransformer_configuration_4059Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRecorder_2064Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Recorder_2064,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsRegulator_4112Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnections_2077Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLine_spacingConnection_4125Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClimateConnection_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLine_configurationConnection_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSeries_reactor_2041Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2041,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getZIPloadConnection_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_configurationConnection_4126Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsResidential_enduse_4037Text(View view) {
		return ""; //$NON-NLS-1$
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
	private String getConnectionsBilldump_4066Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHouse_aConnection_4044Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDc_dc_converterConnection_4074Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsOverhead_line_conductor_4150Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInverterConnection_4065Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStubauctionConnection_4098Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEvcharger_2059Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Evcharger_2059,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_lineConnection_4039Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsFreezer_4079Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsWeather_4145Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRegulator_2005Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Regulator_2005,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RegulatorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsLine_4122Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRectifierConnection_4075Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsMicrowave_4105Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOffice_2054Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Office_2054,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOfficeConnection_4070Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnderground_line_conductor_2036Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2036,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsDryer_4094Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVoltdump_2046Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Voltdump_2046,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_conductorConnection_4062Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAuctionConnection_4138Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFault_check_2063Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Fault_check_2063,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Fault_checkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsNode_4134Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsHistogram_4109Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsAuction_4028Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEnergy_storage_2014Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2014,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsPlugload_4104Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsUnderground_line_conductor_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNode_2007Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Node_2007,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResidential_enduse_2013Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2013,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegulatorConnection_4084Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelayConnection_4026Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOverhead_lineConnection_4123Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPqload_2011Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Pqload_2011,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsOverhead_line_4156Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsRestoration_4142Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_node_2042Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHouse_a_2038Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.House_a_2038,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnergy_storageConnection_4042Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsComm_4053Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getController2_2015Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Controller2_2015,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLink_2032Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Link_2032,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.LinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRestoration_2040Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Restoration_2040,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RestorationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCommConnection_4086Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClimate_2001Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Climate_2001,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRegulator_configuration_2010Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2010,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMeter_2002Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Meter_2002,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInverter_2045Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Inverter_2045,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsRefrigerator_4030Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsPower_electronics_4061Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFrequency_gen_2050Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2050,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLine_spacing_2003Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2003,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsMultizone_4100Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsClimate_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsCsv_reader_4064Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDishwasherConnection_4106Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRelay_2009Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Relay_2009,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RelayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getShaper_2074Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Shaper_2074,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.ShaperNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformer_configurationConnection_4111Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAuction_2025Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Auction_2025,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClotheswasher_2049Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2049,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapacitor_2023Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Capacitor_2023,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsGenerator_4076Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsFuse_4052Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlayer_2018Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Player_2018,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.PlayerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapbank_2017Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Capbank_2017,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.CapbankNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnderground_line_conductorConnection_4128Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMicrowave_2055Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Microwave_2055,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFreezerConnection_4089Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRefrigeratorConnection_4072Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCsv_readerConnection_4027Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsMotor_4143Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsTriplex_line_conductor_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsHouse_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnderground_lineConnection_4149Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHistogram_2073Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Histogram_2073,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.HistogramNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_meterConnection_4133Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCapbankConnection_4016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFrequency_genConnection_4082Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsController2_4092Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMotorConnection_4063Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCollectorConnection_4113Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFuse_2066Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Fuse_2066,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.FuseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsWaterheater_4114Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsWindturb_dg_4102Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsTriplex_meter_4127Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHouse_2012Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.House_2012,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCollector_2053Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Collector_2053,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.CollectorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPqloadConnection_4069Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSeries_reactorConnection_4132Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRegulator_configurationConnection_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCsv_reader_2070Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2070,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoad_2043Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Load_2043,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSwitch_2071Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Switch_2071,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsClotheswasher_4050Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransformer_configuration_2057Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2057,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsLine_spacing_4051Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLine_configuration_2028Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2028,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Line_configurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformerConnection_4040Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOverhead_line_2034Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2034,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsShaper_4021Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsPlc_4022Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsOffice_4023Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultizone_2027Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Multizone_2027,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.MultizoneNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_2030Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2030,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLineConnection_4137Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMicroturbineConnection_4034Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsTriplex_node_4083Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsLoad_4140Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlc_2061Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Plc_2061,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.PlcNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStubauction_2020Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Stubauction_2020,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_meter_2052Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2052,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWaterheaterConnection_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFault_checkConnection_4049Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsStubauction_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsCapacitor_4110Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsController_4057Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsEnergy_storage_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getShaperConnection_4101Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMotor_2078Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Motor_2078,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsTriplex_line_4095Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHistogramConnection_4124Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDc_dc_converter_2019Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2019,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsRectifier_4108Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWindturb_dg_2051Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2051,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getZIPload_2062Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.ZIPload_2062,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsVoltdump_4033Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransformer_2035Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Transformer_2035,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPower_electronicsConnection_4135Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsSubstation_4038Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRange_2022Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Range_2022,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubstation_2048Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Substation_2048,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsRecorder_4081Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlayerConnection_4119Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getResidential_enduseConnection_4144Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getControllerConnection_4085Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDishwasher_2072Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsFrequency_gen_4141Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsRelay_4155Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPlugloadConnection_4032Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsCapbank_4152Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_conductor_2047Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2047,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsZIPload_4107Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOverhead_line_conductorConnection_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsMicroturbine_4043Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsMeter_4091Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLights_2039Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Lights_2039,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCapacitorConnection_4130Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSwitchConnection_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFreezer_2058Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Freezer_2058,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionsOccupantload_4071Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_nodeConnection_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsBattery_4148Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFuseConnection_4154Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBatteryConnection_4078Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWeatherConnection_4041Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNodeConnection_4020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLine_2021Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Line_2021,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLightsConnection_4029Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getController2Connection_4121Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRecorderConnection_4103Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getController_2006Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Controller_2006,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultizoneConnection_4056Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPower_electronics_2033Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2033,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHouseConnection_4073Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMeterConnection_4024Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsInverter_4036Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSubstationConnection_4067Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsTriplex_line_configuration_4147Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsUnderground_line_4131Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVolt_var_controlConnection_4088Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getVoltdumpConnection_4129Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsSwitch_4116Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRefrigerator_2029Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2029,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBilldumpConnection_4035Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsLine_configuration_4045Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsTransformer_4118Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsEvcharger_4054Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsRange_4080Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsDishwasher_4146Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectionsPlayer_4048Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClotheswasherConnection_4031Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_configuration_2076Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2076,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRectifier_2008Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Rectifier_2008,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEvchargerConnection_4096Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMicrowaveConnection_4139Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBilldump_2016Text(View view) {
		IParser parser = visGrid.diagram.providers.VisGridParserProvider
				.getParser(
						visGrid.diagram.providers.VisGridElementTypes.Billdump_2016,
						view.getElement() != null ? view.getElement() : view,
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getType(visGrid.diagram.edit.parts.BilldumpNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLoadConnection_4117Text(View view) {
		return ""; //$NON-NLS-1$
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
