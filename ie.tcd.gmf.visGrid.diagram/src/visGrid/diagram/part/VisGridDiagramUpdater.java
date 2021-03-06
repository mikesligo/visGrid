package visGrid.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class VisGridDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridNodeDescriptor> getSemanticChildren(
			View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridNodeDescriptor> getGrid_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		visGrid.Grid modelElement = (visGrid.Grid) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridNodeDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConnections().iterator(); it
				.hasNext();) {
			visGrid.Connection childElement = (visGrid.Connection) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTime().iterator(); it.hasNext();) {
			visGrid.Time childElement = (visGrid.Time) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getContainedLinks(
			View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2050ContainedLinks(view);
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2059ContainedLinks(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2052ContainedLinks(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2026ContainedLinks(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2024ContainedLinks(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2069ContainedLinks(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2017ContainedLinks(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2002ContainedLinks(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2054ContainedLinks(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2039ContainedLinks(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2016ContainedLinks(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2007ContainedLinks(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2022ContainedLinks(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2009ContainedLinks(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2076ContainedLinks(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2033ContainedLinks(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2005ContainedLinks(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2066ContainedLinks(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2020ContainedLinks(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2032ContainedLinks(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2047ContainedLinks(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004ContainedLinks(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2058ContainedLinks(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2006ContainedLinks(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2015ContainedLinks(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2067ContainedLinks(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2038ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042ContainedLinks(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2001ContainedLinks(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2019ContainedLinks(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2029ContainedLinks(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2063ContainedLinks(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2048ContainedLinks(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2075ContainedLinks(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2061ContainedLinks(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2025ContainedLinks(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2065ContainedLinks(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2008ContainedLinks(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2040ContainedLinks(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2041ContainedLinks(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2053ContainedLinks(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2037ContainedLinks(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2012ContainedLinks(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2036ContainedLinks(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2034ContainedLinks(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2060ContainedLinks(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2062ContainedLinks(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2068ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2027ContainedLinks(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2010ContainedLinks(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2046ContainedLinks(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071ContainedLinks(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2074ContainedLinks(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2051ContainedLinks(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2023ContainedLinks(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2014ContainedLinks(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2077ContainedLinks(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2049ContainedLinks(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2003ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2064ContainedLinks(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2018ContainedLinks(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2073ContainedLinks(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2028ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2030ContainedLinks(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2057ContainedLinks(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2070ContainedLinks(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2035ContainedLinks(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2056ContainedLinks(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2011ContainedLinks(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2021ContainedLinks(view);
		case visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID:
			return getTime_2082ContainedLinks(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2013ContainedLinks(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2055ContainedLinks(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2031ContainedLinks(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044ContainedLinks(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2043ContainedLinks(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2072ContainedLinks(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2045ContainedLinks(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2078ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingLinks(
			View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2050IncomingLinks(view);
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2059IncomingLinks(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2052IncomingLinks(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2026IncomingLinks(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2024IncomingLinks(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2069IncomingLinks(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2017IncomingLinks(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2002IncomingLinks(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2054IncomingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2039IncomingLinks(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2016IncomingLinks(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2007IncomingLinks(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2022IncomingLinks(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2009IncomingLinks(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2076IncomingLinks(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2033IncomingLinks(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2005IncomingLinks(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2066IncomingLinks(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2020IncomingLinks(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2032IncomingLinks(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2047IncomingLinks(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004IncomingLinks(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2058IncomingLinks(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2006IncomingLinks(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2015IncomingLinks(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2067IncomingLinks(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2038IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042IncomingLinks(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2001IncomingLinks(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2019IncomingLinks(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2029IncomingLinks(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2063IncomingLinks(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2048IncomingLinks(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2075IncomingLinks(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2061IncomingLinks(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2025IncomingLinks(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2065IncomingLinks(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2008IncomingLinks(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2040IncomingLinks(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2041IncomingLinks(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2053IncomingLinks(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2037IncomingLinks(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2012IncomingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2036IncomingLinks(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2034IncomingLinks(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2060IncomingLinks(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2062IncomingLinks(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2068IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2027IncomingLinks(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2010IncomingLinks(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2046IncomingLinks(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071IncomingLinks(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2074IncomingLinks(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2051IncomingLinks(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2023IncomingLinks(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2014IncomingLinks(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2077IncomingLinks(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2049IncomingLinks(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2003IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2064IncomingLinks(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2018IncomingLinks(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2073IncomingLinks(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2028IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2030IncomingLinks(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2057IncomingLinks(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2070IncomingLinks(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2035IncomingLinks(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2056IncomingLinks(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2011IncomingLinks(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2021IncomingLinks(view);
		case visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID:
			return getTime_2082IncomingLinks(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2013IncomingLinks(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2055IncomingLinks(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2031IncomingLinks(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044IncomingLinks(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2043IncomingLinks(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2072IncomingLinks(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2045IncomingLinks(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2078IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2050OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2059OutgoingLinks(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2052OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2026OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2024OutgoingLinks(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2069OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2017OutgoingLinks(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2002OutgoingLinks(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2054OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2039OutgoingLinks(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2016OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2007OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2022OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2009OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2076OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2033OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2005OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2066OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2020OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2032OutgoingLinks(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2047OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2004OutgoingLinks(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2058OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2006OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2015OutgoingLinks(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2067OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2038OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042OutgoingLinks(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2001OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2019OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2029OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2063OutgoingLinks(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2048OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2075OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2061OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2025OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2065OutgoingLinks(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2008OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2040OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2041OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2053OutgoingLinks(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2037OutgoingLinks(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2012OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2036OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2034OutgoingLinks(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2060OutgoingLinks(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2062OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2068OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2027OutgoingLinks(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2010OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2046OutgoingLinks(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2074OutgoingLinks(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2051OutgoingLinks(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2023OutgoingLinks(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2014OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2077OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2049OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2003OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2064OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2018OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2073OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2028OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2030OutgoingLinks(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2057OutgoingLinks(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2070OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2035OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2056OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2011OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2021OutgoingLinks(view);
		case visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID:
			return getTime_2082OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2013OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2055OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2031OutgoingLinks(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2043OutgoingLinks(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2072OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2045OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2078OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGrid_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_meter_2050ContainedLinks(
			View view) {
		visGrid.Triplex_meter modelElement = (visGrid.Triplex_meter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClimate_2059ContainedLinks(
			View view) {
		visGrid.Climate modelElement = (visGrid.Climate) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDryer_2052ContainedLinks(
			View view) {
		visGrid.Dryer modelElement = (visGrid.Dryer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_conductor_2026ContainedLinks(
			View view) {
		visGrid.Underground_line_conductor modelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapbank_2024ContainedLinks(
			View view) {
		visGrid.Capbank modelElement = (visGrid.Capbank) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHistogram_2069ContainedLinks(
			View view) {
		visGrid.Histogram modelElement = (visGrid.Histogram) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRelay_2017ContainedLinks(
			View view) {
		visGrid.Relay modelElement = (visGrid.Relay) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBattery_2002ContainedLinks(
			View view) {
		visGrid.Battery modelElement = (visGrid.Battery) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getNode_2054ContainedLinks(
			View view) {
		visGrid.Node modelElement = (visGrid.Node) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_conductor_2039ContainedLinks(
			View view) {
		visGrid.Overhead_line_conductor modelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_2016ContainedLinks(
			View view) {
		visGrid.House modelElement = (visGrid.House) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_configuration_2007ContainedLinks(
			View view) {
		visGrid.Transformer_configuration modelElement = (visGrid.Transformer_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVolt_var_control_2022ContainedLinks(
			View view) {
		visGrid.Volt_var_control modelElement = (visGrid.Volt_var_control) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_configuration_2009ContainedLinks(
			View view) {
		visGrid.Regulator_configuration modelElement = (visGrid.Regulator_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEnergy_storage_2076ContainedLinks(
			View view) {
		visGrid.Energy_storage modelElement = (visGrid.Energy_storage) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCsv_reader_2033ContainedLinks(
			View view) {
		visGrid.Csv_reader modelElement = (visGrid.Csv_reader) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLoad_2005ContainedLinks(
			View view) {
		visGrid.Load modelElement = (visGrid.Load) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMultizone_2066ContainedLinks(
			View view) {
		visGrid.Multizone modelElement = (visGrid.Multizone) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRefrigerator_2020ContainedLinks(
			View view) {
		visGrid.Refrigerator modelElement = (visGrid.Refrigerator) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSeries_reactor_2032ContainedLinks(
			View view) {
		visGrid.Series_reactor modelElement = (visGrid.Series_reactor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getAuction_2047ContainedLinks(
			View view) {
		visGrid.Auction modelElement = (visGrid.Auction) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLink_2004ContainedLinks(
			View view) {
		visGrid.Link modelElement = (visGrid.Link) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getInverter_2058ContainedLinks(
			View view) {
		visGrid.Inverter modelElement = (visGrid.Inverter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPqload_2006ContainedLinks(
			View view) {
		visGrid.Pqload modelElement = (visGrid.Pqload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlayer_2015ContainedLinks(
			View view) {
		visGrid.Player modelElement = (visGrid.Player) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSubstation_2067ContainedLinks(
			View view) {
		visGrid.Substation modelElement = (visGrid.Substation) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicroturbine_2038ContainedLinks(
			View view) {
		visGrid.Microturbine modelElement = (visGrid.Microturbine) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_node_2042ContainedLinks(
			View view) {
		visGrid.Triplex_node modelElement = (visGrid.Triplex_node) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_2001ContainedLinks(
			View view) {
		visGrid.Transformer modelElement = (visGrid.Transformer) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlugload_2019ContainedLinks(
			View view) {
		visGrid.Plugload modelElement = (visGrid.Plugload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController2_2029ContainedLinks(
			View view) {
		visGrid.Controller2 modelElement = (visGrid.Controller2) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClotheswasher_2063ContainedLinks(
			View view) {
		visGrid.Clotheswasher modelElement = (visGrid.Clotheswasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getStubauction_2048ContainedLinks(
			View view) {
		visGrid.Stubauction modelElement = (visGrid.Stubauction) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRectifier_2075ContainedLinks(
			View view) {
		visGrid.Rectifier modelElement = (visGrid.Rectifier) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPower_electronics_2061ContainedLinks(
			View view) {
		visGrid.Power_electronics modelElement = (visGrid.Power_electronics) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_spacing_2025ContainedLinks(
			View view) {
		visGrid.Line_spacing modelElement = (visGrid.Line_spacing) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMotor_2065ContainedLinks(
			View view) {
		visGrid.Motor modelElement = (visGrid.Motor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_a_2008ContainedLinks(
			View view) {
		visGrid.House_a modelElement = (visGrid.House_a) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController_2040ContainedLinks(
			View view) {
		visGrid.Controller modelElement = (visGrid.Controller) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_2041ContainedLinks(
			View view) {
		visGrid.Underground_line modelElement = (visGrid.Underground_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_configuration_2053ContainedLinks(
			View view) {
		visGrid.Line_configuration modelElement = (visGrid.Line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOccupantload_2037ContainedLinks(
			View view) {
		visGrid.Occupantload modelElement = (visGrid.Occupantload) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEvcharger_2012ContainedLinks(
			View view) {
		visGrid.Evcharger modelElement = (visGrid.Evcharger) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_2036ContainedLinks(
			View view) {
		visGrid.Overhead_line modelElement = (visGrid.Overhead_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_2034ContainedLinks(
			View view) {
		visGrid.Line modelElement = (visGrid.Line) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOffice_2060ContainedLinks(
			View view) {
		visGrid.Office modelElement = (visGrid.Office) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWaterheater_2062ContainedLinks(
			View view) {
		visGrid.Waterheater modelElement = (visGrid.Waterheater) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDc_dc_converter_2068ContainedLinks(
			View view) {
		visGrid.Dc_dc_converter modelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_2027ContainedLinks(
			View view) {
		visGrid.Triplex_line modelElement = (visGrid.Triplex_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDishwasher_2010ContainedLinks(
			View view) {
		visGrid.Dishwasher modelElement = (visGrid.Dishwasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRecorder_2046ContainedLinks(
			View view) {
		visGrid.Recorder modelElement = (visGrid.Recorder) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSwitch_2071ContainedLinks(
			View view) {
		visGrid.Switch modelElement = (visGrid.Switch) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getComm_2074ContainedLinks(
			View view) {
		visGrid.Comm modelElement = (visGrid.Comm) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSolar_2051ContainedLinks(
			View view) {
		visGrid.Solar modelElement = (visGrid.Solar) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVoltdump_2023ContainedLinks(
			View view) {
		visGrid.Voltdump modelElement = (visGrid.Voltdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFreezer_2014ContainedLinks(
			View view) {
		visGrid.Freezer modelElement = (visGrid.Freezer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDiesel_dg_2077ContainedLinks(
			View view) {
		visGrid.Diesel_dg modelElement = (visGrid.Diesel_dg) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMeter_2049ContainedLinks(
			View view) {
		visGrid.Meter modelElement = (visGrid.Meter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getShaper_2003ContainedLinks(
			View view) {
		visGrid.Shaper modelElement = (visGrid.Shaper) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_conductor_2064ContainedLinks(
			View view) {
		visGrid.Triplex_line_conductor modelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicrowave_2018ContainedLinks(
			View view) {
		visGrid.Microwave modelElement = (visGrid.Microwave) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlc_2073ContainedLinks(
			View view) {
		visGrid.Plc modelElement = (visGrid.Plc) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFault_check_2028ContainedLinks(
			View view) {
		visGrid.Fault_check modelElement = (visGrid.Fault_check) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_configuration_2030ContainedLinks(
			View view) {
		visGrid.Triplex_line_configuration modelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFuse_2057ContainedLinks(
			View view) {
		visGrid.Fuse modelElement = (visGrid.Fuse) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBilldump_2070ContainedLinks(
			View view) {
		visGrid.Billdump modelElement = (visGrid.Billdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFrequency_gen_2035ContainedLinks(
			View view) {
		visGrid.Frequency_gen modelElement = (visGrid.Frequency_gen) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLights_2056ContainedLinks(
			View view) {
		visGrid.Lights modelElement = (visGrid.Lights) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getResidential_enduse_2011ContainedLinks(
			View view) {
		visGrid.Residential_enduse modelElement = (visGrid.Residential_enduse) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCollector_2021ContainedLinks(
			View view) {
		visGrid.Collector modelElement = (visGrid.Collector) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTime_2082ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRestoration_2013ContainedLinks(
			View view) {
		visGrid.Restoration modelElement = (visGrid.Restoration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getZIPload_2055ContainedLinks(
			View view) {
		visGrid.ZIPload modelElement = (visGrid.ZIPload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_2031ContainedLinks(
			View view) {
		visGrid.Regulator modelElement = (visGrid.Regulator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWeather_2044ContainedLinks(
			View view) {
		visGrid.Weather modelElement = (visGrid.Weather) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRange_2043ContainedLinks(
			View view) {
		visGrid.Range modelElement = (visGrid.Range) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGenerator_2072ContainedLinks(
			View view) {
		visGrid.Generator modelElement = (visGrid.Generator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapacitor_2045ContainedLinks(
			View view) {
		visGrid.Capacitor modelElement = (visGrid.Capacitor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWindturb_dg_2078ContainedLinks(
			View view) {
		visGrid.Windturb_dg modelElement = (visGrid.Windturb_dg) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_meter_2050IncomingLinks(
			View view) {
		visGrid.Triplex_meter modelElement = (visGrid.Triplex_meter) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClimate_2059IncomingLinks(
			View view) {
		visGrid.Climate modelElement = (visGrid.Climate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDryer_2052IncomingLinks(
			View view) {
		visGrid.Dryer modelElement = (visGrid.Dryer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_conductor_2026IncomingLinks(
			View view) {
		visGrid.Underground_line_conductor modelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapbank_2024IncomingLinks(
			View view) {
		visGrid.Capbank modelElement = (visGrid.Capbank) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHistogram_2069IncomingLinks(
			View view) {
		visGrid.Histogram modelElement = (visGrid.Histogram) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRelay_2017IncomingLinks(
			View view) {
		visGrid.Relay modelElement = (visGrid.Relay) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBattery_2002IncomingLinks(
			View view) {
		visGrid.Battery modelElement = (visGrid.Battery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getNode_2054IncomingLinks(
			View view) {
		visGrid.Node modelElement = (visGrid.Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_conductor_2039IncomingLinks(
			View view) {
		visGrid.Overhead_line_conductor modelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_2016IncomingLinks(
			View view) {
		visGrid.House modelElement = (visGrid.House) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_configuration_2007IncomingLinks(
			View view) {
		visGrid.Transformer_configuration modelElement = (visGrid.Transformer_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVolt_var_control_2022IncomingLinks(
			View view) {
		visGrid.Volt_var_control modelElement = (visGrid.Volt_var_control) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_configuration_2009IncomingLinks(
			View view) {
		visGrid.Regulator_configuration modelElement = (visGrid.Regulator_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEnergy_storage_2076IncomingLinks(
			View view) {
		visGrid.Energy_storage modelElement = (visGrid.Energy_storage) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCsv_reader_2033IncomingLinks(
			View view) {
		visGrid.Csv_reader modelElement = (visGrid.Csv_reader) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLoad_2005IncomingLinks(
			View view) {
		visGrid.Load modelElement = (visGrid.Load) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMultizone_2066IncomingLinks(
			View view) {
		visGrid.Multizone modelElement = (visGrid.Multizone) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRefrigerator_2020IncomingLinks(
			View view) {
		visGrid.Refrigerator modelElement = (visGrid.Refrigerator) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSeries_reactor_2032IncomingLinks(
			View view) {
		visGrid.Series_reactor modelElement = (visGrid.Series_reactor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getAuction_2047IncomingLinks(
			View view) {
		visGrid.Auction modelElement = (visGrid.Auction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLink_2004IncomingLinks(
			View view) {
		visGrid.Link modelElement = (visGrid.Link) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getInverter_2058IncomingLinks(
			View view) {
		visGrid.Inverter modelElement = (visGrid.Inverter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPqload_2006IncomingLinks(
			View view) {
		visGrid.Pqload modelElement = (visGrid.Pqload) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlayer_2015IncomingLinks(
			View view) {
		visGrid.Player modelElement = (visGrid.Player) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSubstation_2067IncomingLinks(
			View view) {
		visGrid.Substation modelElement = (visGrid.Substation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicroturbine_2038IncomingLinks(
			View view) {
		visGrid.Microturbine modelElement = (visGrid.Microturbine) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_node_2042IncomingLinks(
			View view) {
		visGrid.Triplex_node modelElement = (visGrid.Triplex_node) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_2001IncomingLinks(
			View view) {
		visGrid.Transformer modelElement = (visGrid.Transformer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlugload_2019IncomingLinks(
			View view) {
		visGrid.Plugload modelElement = (visGrid.Plugload) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController2_2029IncomingLinks(
			View view) {
		visGrid.Controller2 modelElement = (visGrid.Controller2) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClotheswasher_2063IncomingLinks(
			View view) {
		visGrid.Clotheswasher modelElement = (visGrid.Clotheswasher) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getStubauction_2048IncomingLinks(
			View view) {
		visGrid.Stubauction modelElement = (visGrid.Stubauction) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRectifier_2075IncomingLinks(
			View view) {
		visGrid.Rectifier modelElement = (visGrid.Rectifier) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPower_electronics_2061IncomingLinks(
			View view) {
		visGrid.Power_electronics modelElement = (visGrid.Power_electronics) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_spacing_2025IncomingLinks(
			View view) {
		visGrid.Line_spacing modelElement = (visGrid.Line_spacing) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMotor_2065IncomingLinks(
			View view) {
		visGrid.Motor modelElement = (visGrid.Motor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_a_2008IncomingLinks(
			View view) {
		visGrid.House_a modelElement = (visGrid.House_a) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController_2040IncomingLinks(
			View view) {
		visGrid.Controller modelElement = (visGrid.Controller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_2041IncomingLinks(
			View view) {
		visGrid.Underground_line modelElement = (visGrid.Underground_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_configuration_2053IncomingLinks(
			View view) {
		visGrid.Line_configuration modelElement = (visGrid.Line_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOccupantload_2037IncomingLinks(
			View view) {
		visGrid.Occupantload modelElement = (visGrid.Occupantload) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEvcharger_2012IncomingLinks(
			View view) {
		visGrid.Evcharger modelElement = (visGrid.Evcharger) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_2036IncomingLinks(
			View view) {
		visGrid.Overhead_line modelElement = (visGrid.Overhead_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_2034IncomingLinks(
			View view) {
		visGrid.Line modelElement = (visGrid.Line) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOffice_2060IncomingLinks(
			View view) {
		visGrid.Office modelElement = (visGrid.Office) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWaterheater_2062IncomingLinks(
			View view) {
		visGrid.Waterheater modelElement = (visGrid.Waterheater) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDc_dc_converter_2068IncomingLinks(
			View view) {
		visGrid.Dc_dc_converter modelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_2027IncomingLinks(
			View view) {
		visGrid.Triplex_line modelElement = (visGrid.Triplex_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDishwasher_2010IncomingLinks(
			View view) {
		visGrid.Dishwasher modelElement = (visGrid.Dishwasher) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRecorder_2046IncomingLinks(
			View view) {
		visGrid.Recorder modelElement = (visGrid.Recorder) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSwitch_2071IncomingLinks(
			View view) {
		visGrid.Switch modelElement = (visGrid.Switch) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getComm_2074IncomingLinks(
			View view) {
		visGrid.Comm modelElement = (visGrid.Comm) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSolar_2051IncomingLinks(
			View view) {
		visGrid.Solar modelElement = (visGrid.Solar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVoltdump_2023IncomingLinks(
			View view) {
		visGrid.Voltdump modelElement = (visGrid.Voltdump) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFreezer_2014IncomingLinks(
			View view) {
		visGrid.Freezer modelElement = (visGrid.Freezer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDiesel_dg_2077IncomingLinks(
			View view) {
		visGrid.Diesel_dg modelElement = (visGrid.Diesel_dg) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMeter_2049IncomingLinks(
			View view) {
		visGrid.Meter modelElement = (visGrid.Meter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getShaper_2003IncomingLinks(
			View view) {
		visGrid.Shaper modelElement = (visGrid.Shaper) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_conductor_2064IncomingLinks(
			View view) {
		visGrid.Triplex_line_conductor modelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicrowave_2018IncomingLinks(
			View view) {
		visGrid.Microwave modelElement = (visGrid.Microwave) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlc_2073IncomingLinks(
			View view) {
		visGrid.Plc modelElement = (visGrid.Plc) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFault_check_2028IncomingLinks(
			View view) {
		visGrid.Fault_check modelElement = (visGrid.Fault_check) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_configuration_2030IncomingLinks(
			View view) {
		visGrid.Triplex_line_configuration modelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFuse_2057IncomingLinks(
			View view) {
		visGrid.Fuse modelElement = (visGrid.Fuse) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBilldump_2070IncomingLinks(
			View view) {
		visGrid.Billdump modelElement = (visGrid.Billdump) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFrequency_gen_2035IncomingLinks(
			View view) {
		visGrid.Frequency_gen modelElement = (visGrid.Frequency_gen) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLights_2056IncomingLinks(
			View view) {
		visGrid.Lights modelElement = (visGrid.Lights) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getResidential_enduse_2011IncomingLinks(
			View view) {
		visGrid.Residential_enduse modelElement = (visGrid.Residential_enduse) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCollector_2021IncomingLinks(
			View view) {
		visGrid.Collector modelElement = (visGrid.Collector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTime_2082IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRestoration_2013IncomingLinks(
			View view) {
		visGrid.Restoration modelElement = (visGrid.Restoration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getZIPload_2055IncomingLinks(
			View view) {
		visGrid.ZIPload modelElement = (visGrid.ZIPload) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_2031IncomingLinks(
			View view) {
		visGrid.Regulator modelElement = (visGrid.Regulator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWeather_2044IncomingLinks(
			View view) {
		visGrid.Weather modelElement = (visGrid.Weather) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRange_2043IncomingLinks(
			View view) {
		visGrid.Range modelElement = (visGrid.Range) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGenerator_2072IncomingLinks(
			View view) {
		visGrid.Generator modelElement = (visGrid.Generator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapacitor_2045IncomingLinks(
			View view) {
		visGrid.Capacitor modelElement = (visGrid.Capacitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWindturb_dg_2078IncomingLinks(
			View view) {
		visGrid.Windturb_dg modelElement = (visGrid.Windturb_dg) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_meter_2050OutgoingLinks(
			View view) {
		visGrid.Triplex_meter modelElement = (visGrid.Triplex_meter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClimate_2059OutgoingLinks(
			View view) {
		visGrid.Climate modelElement = (visGrid.Climate) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDryer_2052OutgoingLinks(
			View view) {
		visGrid.Dryer modelElement = (visGrid.Dryer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_conductor_2026OutgoingLinks(
			View view) {
		visGrid.Underground_line_conductor modelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapbank_2024OutgoingLinks(
			View view) {
		visGrid.Capbank modelElement = (visGrid.Capbank) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHistogram_2069OutgoingLinks(
			View view) {
		visGrid.Histogram modelElement = (visGrid.Histogram) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRelay_2017OutgoingLinks(
			View view) {
		visGrid.Relay modelElement = (visGrid.Relay) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBattery_2002OutgoingLinks(
			View view) {
		visGrid.Battery modelElement = (visGrid.Battery) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getNode_2054OutgoingLinks(
			View view) {
		visGrid.Node modelElement = (visGrid.Node) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_conductor_2039OutgoingLinks(
			View view) {
		visGrid.Overhead_line_conductor modelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_2016OutgoingLinks(
			View view) {
		visGrid.House modelElement = (visGrid.House) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_configuration_2007OutgoingLinks(
			View view) {
		visGrid.Transformer_configuration modelElement = (visGrid.Transformer_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVolt_var_control_2022OutgoingLinks(
			View view) {
		visGrid.Volt_var_control modelElement = (visGrid.Volt_var_control) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_configuration_2009OutgoingLinks(
			View view) {
		visGrid.Regulator_configuration modelElement = (visGrid.Regulator_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEnergy_storage_2076OutgoingLinks(
			View view) {
		visGrid.Energy_storage modelElement = (visGrid.Energy_storage) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCsv_reader_2033OutgoingLinks(
			View view) {
		visGrid.Csv_reader modelElement = (visGrid.Csv_reader) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLoad_2005OutgoingLinks(
			View view) {
		visGrid.Load modelElement = (visGrid.Load) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMultizone_2066OutgoingLinks(
			View view) {
		visGrid.Multizone modelElement = (visGrid.Multizone) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRefrigerator_2020OutgoingLinks(
			View view) {
		visGrid.Refrigerator modelElement = (visGrid.Refrigerator) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSeries_reactor_2032OutgoingLinks(
			View view) {
		visGrid.Series_reactor modelElement = (visGrid.Series_reactor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getAuction_2047OutgoingLinks(
			View view) {
		visGrid.Auction modelElement = (visGrid.Auction) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLink_2004OutgoingLinks(
			View view) {
		visGrid.Link modelElement = (visGrid.Link) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getInverter_2058OutgoingLinks(
			View view) {
		visGrid.Inverter modelElement = (visGrid.Inverter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPqload_2006OutgoingLinks(
			View view) {
		visGrid.Pqload modelElement = (visGrid.Pqload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlayer_2015OutgoingLinks(
			View view) {
		visGrid.Player modelElement = (visGrid.Player) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSubstation_2067OutgoingLinks(
			View view) {
		visGrid.Substation modelElement = (visGrid.Substation) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicroturbine_2038OutgoingLinks(
			View view) {
		visGrid.Microturbine modelElement = (visGrid.Microturbine) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_node_2042OutgoingLinks(
			View view) {
		visGrid.Triplex_node modelElement = (visGrid.Triplex_node) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_2001OutgoingLinks(
			View view) {
		visGrid.Transformer modelElement = (visGrid.Transformer) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlugload_2019OutgoingLinks(
			View view) {
		visGrid.Plugload modelElement = (visGrid.Plugload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController2_2029OutgoingLinks(
			View view) {
		visGrid.Controller2 modelElement = (visGrid.Controller2) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClotheswasher_2063OutgoingLinks(
			View view) {
		visGrid.Clotheswasher modelElement = (visGrid.Clotheswasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getStubauction_2048OutgoingLinks(
			View view) {
		visGrid.Stubauction modelElement = (visGrid.Stubauction) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRectifier_2075OutgoingLinks(
			View view) {
		visGrid.Rectifier modelElement = (visGrid.Rectifier) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPower_electronics_2061OutgoingLinks(
			View view) {
		visGrid.Power_electronics modelElement = (visGrid.Power_electronics) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_spacing_2025OutgoingLinks(
			View view) {
		visGrid.Line_spacing modelElement = (visGrid.Line_spacing) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMotor_2065OutgoingLinks(
			View view) {
		visGrid.Motor modelElement = (visGrid.Motor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_a_2008OutgoingLinks(
			View view) {
		visGrid.House_a modelElement = (visGrid.House_a) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController_2040OutgoingLinks(
			View view) {
		visGrid.Controller modelElement = (visGrid.Controller) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_2041OutgoingLinks(
			View view) {
		visGrid.Underground_line modelElement = (visGrid.Underground_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_configuration_2053OutgoingLinks(
			View view) {
		visGrid.Line_configuration modelElement = (visGrid.Line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOccupantload_2037OutgoingLinks(
			View view) {
		visGrid.Occupantload modelElement = (visGrid.Occupantload) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEvcharger_2012OutgoingLinks(
			View view) {
		visGrid.Evcharger modelElement = (visGrid.Evcharger) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_2036OutgoingLinks(
			View view) {
		visGrid.Overhead_line modelElement = (visGrid.Overhead_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_2034OutgoingLinks(
			View view) {
		visGrid.Line modelElement = (visGrid.Line) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOffice_2060OutgoingLinks(
			View view) {
		visGrid.Office modelElement = (visGrid.Office) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWaterheater_2062OutgoingLinks(
			View view) {
		visGrid.Waterheater modelElement = (visGrid.Waterheater) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDc_dc_converter_2068OutgoingLinks(
			View view) {
		visGrid.Dc_dc_converter modelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_2027OutgoingLinks(
			View view) {
		visGrid.Triplex_line modelElement = (visGrid.Triplex_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDishwasher_2010OutgoingLinks(
			View view) {
		visGrid.Dishwasher modelElement = (visGrid.Dishwasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRecorder_2046OutgoingLinks(
			View view) {
		visGrid.Recorder modelElement = (visGrid.Recorder) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSwitch_2071OutgoingLinks(
			View view) {
		visGrid.Switch modelElement = (visGrid.Switch) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getComm_2074OutgoingLinks(
			View view) {
		visGrid.Comm modelElement = (visGrid.Comm) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSolar_2051OutgoingLinks(
			View view) {
		visGrid.Solar modelElement = (visGrid.Solar) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVoltdump_2023OutgoingLinks(
			View view) {
		visGrid.Voltdump modelElement = (visGrid.Voltdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFreezer_2014OutgoingLinks(
			View view) {
		visGrid.Freezer modelElement = (visGrid.Freezer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDiesel_dg_2077OutgoingLinks(
			View view) {
		visGrid.Diesel_dg modelElement = (visGrid.Diesel_dg) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMeter_2049OutgoingLinks(
			View view) {
		visGrid.Meter modelElement = (visGrid.Meter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getShaper_2003OutgoingLinks(
			View view) {
		visGrid.Shaper modelElement = (visGrid.Shaper) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_conductor_2064OutgoingLinks(
			View view) {
		visGrid.Triplex_line_conductor modelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicrowave_2018OutgoingLinks(
			View view) {
		visGrid.Microwave modelElement = (visGrid.Microwave) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlc_2073OutgoingLinks(
			View view) {
		visGrid.Plc modelElement = (visGrid.Plc) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFault_check_2028OutgoingLinks(
			View view) {
		visGrid.Fault_check modelElement = (visGrid.Fault_check) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_configuration_2030OutgoingLinks(
			View view) {
		visGrid.Triplex_line_configuration modelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFuse_2057OutgoingLinks(
			View view) {
		visGrid.Fuse modelElement = (visGrid.Fuse) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBilldump_2070OutgoingLinks(
			View view) {
		visGrid.Billdump modelElement = (visGrid.Billdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFrequency_gen_2035OutgoingLinks(
			View view) {
		visGrid.Frequency_gen modelElement = (visGrid.Frequency_gen) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLights_2056OutgoingLinks(
			View view) {
		visGrid.Lights modelElement = (visGrid.Lights) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getResidential_enduse_2011OutgoingLinks(
			View view) {
		visGrid.Residential_enduse modelElement = (visGrid.Residential_enduse) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCollector_2021OutgoingLinks(
			View view) {
		visGrid.Collector modelElement = (visGrid.Collector) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTime_2082OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRestoration_2013OutgoingLinks(
			View view) {
		visGrid.Restoration modelElement = (visGrid.Restoration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getZIPload_2055OutgoingLinks(
			View view) {
		visGrid.ZIPload modelElement = (visGrid.ZIPload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_2031OutgoingLinks(
			View view) {
		visGrid.Regulator modelElement = (visGrid.Regulator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWeather_2044OutgoingLinks(
			View view) {
		visGrid.Weather modelElement = (visGrid.Weather) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRange_2043OutgoingLinks(
			View view) {
		visGrid.Range modelElement = (visGrid.Range) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGenerator_2072OutgoingLinks(
			View view) {
		visGrid.Generator modelElement = (visGrid.Generator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapacitor_2045OutgoingLinks(
			View view) {
		visGrid.Capacitor modelElement = (visGrid.Capacitor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWindturb_dg_2078OutgoingLinks(
			View view) {
		visGrid.Windturb_dg modelElement = (visGrid.Windturb_dg) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connection_Parent_4001(
			visGrid.Connection target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnection_Parent()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001,
						visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connection_Connections_4002(
			visGrid.Connection target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnection_Connections()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002,
						visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connection_Parent_4001(
			visGrid.Connection source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getParent().iterator(); destinations
				.hasNext();) {
			visGrid.Connection destination = (visGrid.Connection) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001,
					visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connection_Connections_4002(
			visGrid.Connection source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnections().iterator(); destinations
				.hasNext();) {
			visGrid.Connection destination = (visGrid.Connection) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002,
					visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
		}
		return result;
	}

}
