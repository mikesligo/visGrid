package visGrid.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class VisGridVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ie.tcd.gmf.visGrid.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (visGrid.diagram.edit.parts.GridEditPart.MODEL_ID.equals(view
					.getType())) {
				return visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (visGrid.VisGridPackage.eINSTANCE.getGrid().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((visGrid.Grid) domainElement)) {
			return visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = visGrid.diagram.part.VisGridVisualIDRegistry
				.getModelID(containerView);
		if (!visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			if (visGrid.VisGridPackage.eINSTANCE.getTriplex_meter()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getClimate().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getDryer().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE
					.getUnderground_line_conductor().isSuperTypeOf(
							domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getCapbank().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getHistogram().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRelay().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getBattery().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getOverhead_line_conductor()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getHouse().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getTransformer_configuration()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getVolt_var_control()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRegulator_configuration()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getEnergy_storage()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getCsv_reader().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getLoad().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getMultizone().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRefrigerator()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getSeries_reactor()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getAuction().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getLink().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getInverter().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getPqload().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getPlayer().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getSubstation().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getMicroturbine()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getTriplex_node()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getTransformer()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getPlugload().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getController2()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getClotheswasher()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getStubauction()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRectifier().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getPower_electronics()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getLine_spacing()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getMotor().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getHouse_a().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getController().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getUnderground_line()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getLine_configuration()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getOccupantload()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getEvcharger().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getOverhead_line()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getLine().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getOffice().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getWaterheater()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getDc_dc_converter()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getTriplex_line()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getDishwasher().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRecorder().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getSwitch().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getComm().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getSolar().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getVoltdump().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getFreezer().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getDiesel_dg().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getMeter().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getShaper().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getTriplex_line_conductor()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getMicrowave().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getPlc().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getFault_check()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_configuration().isSuperTypeOf(
							domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getFuse().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getBilldump().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getFrequency_gen()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getLights().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getResidential_enduse()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getCollector().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getTime().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRestoration()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getZIPload().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRegulator().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getWeather().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getRange().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getGenerator().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getCapacitor().isSuperTypeOf(
					domainElement.eClass())) {
				return visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID;
			}
			if (visGrid.VisGridPackage.eINSTANCE.getWindturb_dg()
					.isSuperTypeOf(domainElement.eClass())) {
				return visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = visGrid.diagram.part.VisGridVisualIDRegistry
				.getModelID(containerView);
		if (!visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_meterMeasured_real_energyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_meterMeasured_real_powerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_meterMeasured_voltage_1EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.DryerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Underground_line_conductorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.CapbankNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.HistogramNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.HistogramFilenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RelayNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Overhead_line_conductorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.HouseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.HouseAir_temperatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Transformer_configurationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Volt_var_controlNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Csv_readerCity_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Csv_readerState_nameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Csv_readerFilenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.MultizoneNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.LinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.PlayerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.Triplex_nodeVoltage_12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Line_configurationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.EvchargerStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.EvchargerChargeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.CommNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.VoltdumpFilenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.ShaperNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Triplex_line_conductorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.PlcNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Fault_checkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.FuseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.BilldumpNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.BilldumpFilenameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.CollectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (visGrid.diagram.edit.parts.TimeRealtimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RestorationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RegulatorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			if (visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(visGrid.Grid element) {
		return true;
	}

}
