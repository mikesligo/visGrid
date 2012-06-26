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
		for (Iterator<?> it = modelElement.getClimate().iterator(); it
				.hasNext();) {
			visGrid.Climate childElement = (visGrid.Climate) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMeter().iterator(); it.hasNext();) {
			visGrid.Meter childElement = (visGrid.Meter) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLine_spacing().iterator(); it
				.hasNext();) {
			visGrid.Line_spacing childElement = (visGrid.Line_spacing) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOverhead_line_conductor()
				.iterator(); it.hasNext();) {
			visGrid.Overhead_line_conductor childElement = (visGrid.Overhead_line_conductor) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRegulator().iterator(); it
				.hasNext();) {
			visGrid.Regulator childElement = (visGrid.Regulator) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getController().iterator(); it
				.hasNext();) {
			visGrid.Controller childElement = (visGrid.Controller) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNode().iterator(); it.hasNext();) {
			visGrid.Node childElement = (visGrid.Node) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRectifier().iterator(); it
				.hasNext();) {
			visGrid.Rectifier childElement = (visGrid.Rectifier) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelay().iterator(); it.hasNext();) {
			visGrid.Relay childElement = (visGrid.Relay) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRegulator_configuration()
				.iterator(); it.hasNext();) {
			visGrid.Regulator_configuration childElement = (visGrid.Regulator_configuration) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPqload().iterator(); it.hasNext();) {
			visGrid.Pqload childElement = (visGrid.Pqload) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHouse().iterator(); it.hasNext();) {
			visGrid.House childElement = (visGrid.House) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getResidential_enduse().iterator(); it
				.hasNext();) {
			visGrid.Residential_enduse childElement = (visGrid.Residential_enduse) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEnergy_storage().iterator(); it
				.hasNext();) {
			visGrid.Energy_storage childElement = (visGrid.Energy_storage) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getController2().iterator(); it
				.hasNext();) {
			visGrid.Controller2 childElement = (visGrid.Controller2) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBilldump().iterator(); it
				.hasNext();) {
			visGrid.Billdump childElement = (visGrid.Billdump) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCapbank().iterator(); it
				.hasNext();) {
			visGrid.Capbank childElement = (visGrid.Capbank) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPlayer().iterator(); it.hasNext();) {
			visGrid.Player childElement = (visGrid.Player) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDc_dc_converter().iterator(); it
				.hasNext();) {
			visGrid.Dc_dc_converter childElement = (visGrid.Dc_dc_converter) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStubauction().iterator(); it
				.hasNext();) {
			visGrid.Stubauction childElement = (visGrid.Stubauction) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLine().iterator(); it.hasNext();) {
			visGrid.Line childElement = (visGrid.Line) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRange().iterator(); it.hasNext();) {
			visGrid.Range childElement = (visGrid.Range) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCapacitor().iterator(); it
				.hasNext();) {
			visGrid.Capacitor childElement = (visGrid.Capacitor) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMicroturbine().iterator(); it
				.hasNext();) {
			visGrid.Microturbine childElement = (visGrid.Microturbine) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAuction().iterator(); it
				.hasNext();) {
			visGrid.Auction childElement = (visGrid.Auction) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSolar().iterator(); it.hasNext();) {
			visGrid.Solar childElement = (visGrid.Solar) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultizone().iterator(); it
				.hasNext();) {
			visGrid.Multizone childElement = (visGrid.Multizone) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLine_configuration().iterator(); it
				.hasNext();) {
			visGrid.Line_configuration childElement = (visGrid.Line_configuration) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRefrigerator().iterator(); it
				.hasNext();) {
			visGrid.Refrigerator childElement = (visGrid.Refrigerator) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_line().iterator(); it
				.hasNext();) {
			visGrid.Triplex_line childElement = (visGrid.Triplex_line) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPlugload().iterator(); it
				.hasNext();) {
			visGrid.Plugload childElement = (visGrid.Plugload) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLink().iterator(); it.hasNext();) {
			visGrid.Link childElement = (visGrid.Link) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPower_electronics().iterator(); it
				.hasNext();) {
			visGrid.Power_electronics childElement = (visGrid.Power_electronics) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOverhead_line().iterator(); it
				.hasNext();) {
			visGrid.Overhead_line childElement = (visGrid.Overhead_line) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTransformer().iterator(); it
				.hasNext();) {
			visGrid.Transformer childElement = (visGrid.Transformer) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getUnderground_line_conductor()
				.iterator(); it.hasNext();) {
			visGrid.Underground_line_conductor childElement = (visGrid.Underground_line_conductor) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getUnderground_line().iterator(); it
				.hasNext();) {
			visGrid.Underground_line childElement = (visGrid.Underground_line) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHouse_a().iterator(); it
				.hasNext();) {
			visGrid.House_a childElement = (visGrid.House_a) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLights().iterator(); it.hasNext();) {
			visGrid.Lights childElement = (visGrid.Lights) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRestoration().iterator(); it
				.hasNext();) {
			visGrid.Restoration childElement = (visGrid.Restoration) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSeries_reactor().iterator(); it
				.hasNext();) {
			visGrid.Series_reactor childElement = (visGrid.Series_reactor) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_node().iterator(); it
				.hasNext();) {
			visGrid.Triplex_node childElement = (visGrid.Triplex_node) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLoad().iterator(); it.hasNext();) {
			visGrid.Load childElement = (visGrid.Load) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWeather().iterator(); it
				.hasNext();) {
			visGrid.Weather childElement = (visGrid.Weather) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInverter().iterator(); it
				.hasNext();) {
			visGrid.Inverter childElement = (visGrid.Inverter) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getVoltdump().iterator(); it
				.hasNext();) {
			visGrid.Voltdump childElement = (visGrid.Voltdump) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_line_conductor()
				.iterator(); it.hasNext();) {
			visGrid.Triplex_line_conductor childElement = (visGrid.Triplex_line_conductor) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSubstation().iterator(); it
				.hasNext();) {
			visGrid.Substation childElement = (visGrid.Substation) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getClotheswasher().iterator(); it
				.hasNext();) {
			visGrid.Clotheswasher childElement = (visGrid.Clotheswasher) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFrequency_gen().iterator(); it
				.hasNext();) {
			visGrid.Frequency_gen childElement = (visGrid.Frequency_gen) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWindturb_dg().iterator(); it
				.hasNext();) {
			visGrid.Windturb_dg childElement = (visGrid.Windturb_dg) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_meter().iterator(); it
				.hasNext();) {
			visGrid.Triplex_meter childElement = (visGrid.Triplex_meter) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCollector().iterator(); it
				.hasNext();) {
			visGrid.Collector childElement = (visGrid.Collector) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOffice().iterator(); it.hasNext();) {
			visGrid.Office childElement = (visGrid.Office) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMicrowave().iterator(); it
				.hasNext();) {
			visGrid.Microwave childElement = (visGrid.Microwave) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComm().iterator(); it.hasNext();) {
			visGrid.Comm childElement = (visGrid.Comm) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTransformer_configuration()
				.iterator(); it.hasNext();) {
			visGrid.Transformer_configuration childElement = (visGrid.Transformer_configuration) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFreezer().iterator(); it
				.hasNext();) {
			visGrid.Freezer childElement = (visGrid.Freezer) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEvcharger().iterator(); it
				.hasNext();) {
			visGrid.Evcharger childElement = (visGrid.Evcharger) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDryer().iterator(); it.hasNext();) {
			visGrid.Dryer childElement = (visGrid.Dryer) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPlc().iterator(); it.hasNext();) {
			visGrid.Plc childElement = (visGrid.Plc) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getZIPload().iterator(); it
				.hasNext();) {
			visGrid.ZIPload childElement = (visGrid.ZIPload) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFault_check().iterator(); it
				.hasNext();) {
			visGrid.Fault_check childElement = (visGrid.Fault_check) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRecorder().iterator(); it
				.hasNext();) {
			visGrid.Recorder childElement = (visGrid.Recorder) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOccupantload().iterator(); it
				.hasNext();) {
			visGrid.Occupantload childElement = (visGrid.Occupantload) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFuse().iterator(); it.hasNext();) {
			visGrid.Fuse childElement = (visGrid.Fuse) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getVolt_var_control().iterator(); it
				.hasNext();) {
			visGrid.Volt_var_control childElement = (visGrid.Volt_var_control) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWaterheater().iterator(); it
				.hasNext();) {
			visGrid.Waterheater childElement = (visGrid.Waterheater) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBattery().iterator(); it
				.hasNext();) {
			visGrid.Battery childElement = (visGrid.Battery) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getCsv_reader().iterator(); it
				.hasNext();) {
			visGrid.Csv_reader childElement = (visGrid.Csv_reader) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSwitch().iterator(); it.hasNext();) {
			visGrid.Switch childElement = (visGrid.Switch) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDishwasher().iterator(); it
				.hasNext();) {
			visGrid.Dishwasher childElement = (visGrid.Dishwasher) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHistogram().iterator(); it
				.hasNext();) {
			visGrid.Histogram childElement = (visGrid.Histogram) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getShaper().iterator(); it.hasNext();) {
			visGrid.Shaper childElement = (visGrid.Shaper) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGenerator().iterator(); it
				.hasNext();) {
			visGrid.Generator childElement = (visGrid.Generator) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_line_configuration()
				.iterator(); it.hasNext();) {
			visGrid.Triplex_line_configuration childElement = (visGrid.Triplex_line_configuration) it
					.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getConnection().iterator(); it
				.hasNext();) {
			visGrid.Connections childElement = (visGrid.Connections) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMotor().iterator(); it.hasNext();) {
			visGrid.Motor childElement = (visGrid.Motor) it.next();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			visGrid.Diesel_dg childElement = modelElement.getDiesel_dg();
			int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID) {
				result.add(new visGrid.diagram.part.VisGridNodeDescriptor(
						childElement, visualID));
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
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2001ContainedLinks(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2002ContainedLinks(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2003ContainedLinks(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2004ContainedLinks(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2005ContainedLinks(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2006ContainedLinks(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007ContainedLinks(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2008ContainedLinks(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2009ContainedLinks(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2010ContainedLinks(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2011ContainedLinks(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2012ContainedLinks(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2013ContainedLinks(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2014ContainedLinks(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2015ContainedLinks(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2016ContainedLinks(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2017ContainedLinks(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2018ContainedLinks(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2019ContainedLinks(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2020ContainedLinks(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2021ContainedLinks(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2022ContainedLinks(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2023ContainedLinks(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2024ContainedLinks(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2025ContainedLinks(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2026ContainedLinks(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2027ContainedLinks(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2028ContainedLinks(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2029ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2030ContainedLinks(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2031ContainedLinks(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2032ContainedLinks(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2033ContainedLinks(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2034ContainedLinks(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2035ContainedLinks(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2036ContainedLinks(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2037ContainedLinks(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2038ContainedLinks(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2039ContainedLinks(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2040ContainedLinks(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2041ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042ContainedLinks(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2043ContainedLinks(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044ContainedLinks(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2045ContainedLinks(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2046ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2047ContainedLinks(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2048ContainedLinks(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2049ContainedLinks(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2050ContainedLinks(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2051ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2052ContainedLinks(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2053ContainedLinks(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2054ContainedLinks(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2055ContainedLinks(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2056ContainedLinks(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2057ContainedLinks(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2058ContainedLinks(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2059ContainedLinks(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2060ContainedLinks(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2061ContainedLinks(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2062ContainedLinks(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2063ContainedLinks(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2064ContainedLinks(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2065ContainedLinks(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2066ContainedLinks(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2067ContainedLinks(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2068ContainedLinks(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2069ContainedLinks(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2070ContainedLinks(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071ContainedLinks(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2072ContainedLinks(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2073ContainedLinks(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2074ContainedLinks(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2075ContainedLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2076ContainedLinks(view);
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
			return getConnections_2077ContainedLinks(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2078ContainedLinks(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2079ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingLinks(
			View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2001IncomingLinks(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2002IncomingLinks(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2003IncomingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2004IncomingLinks(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2005IncomingLinks(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2006IncomingLinks(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007IncomingLinks(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2008IncomingLinks(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2009IncomingLinks(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2010IncomingLinks(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2011IncomingLinks(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2012IncomingLinks(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2013IncomingLinks(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2014IncomingLinks(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2015IncomingLinks(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2016IncomingLinks(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2017IncomingLinks(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2018IncomingLinks(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2019IncomingLinks(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2020IncomingLinks(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2021IncomingLinks(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2022IncomingLinks(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2023IncomingLinks(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2024IncomingLinks(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2025IncomingLinks(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2026IncomingLinks(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2027IncomingLinks(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2028IncomingLinks(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2029IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2030IncomingLinks(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2031IncomingLinks(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2032IncomingLinks(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2033IncomingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2034IncomingLinks(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2035IncomingLinks(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2036IncomingLinks(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2037IncomingLinks(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2038IncomingLinks(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2039IncomingLinks(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2040IncomingLinks(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2041IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042IncomingLinks(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2043IncomingLinks(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044IncomingLinks(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2045IncomingLinks(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2046IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2047IncomingLinks(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2048IncomingLinks(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2049IncomingLinks(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2050IncomingLinks(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2051IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2052IncomingLinks(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2053IncomingLinks(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2054IncomingLinks(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2055IncomingLinks(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2056IncomingLinks(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2057IncomingLinks(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2058IncomingLinks(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2059IncomingLinks(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2060IncomingLinks(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2061IncomingLinks(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2062IncomingLinks(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2063IncomingLinks(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2064IncomingLinks(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2065IncomingLinks(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2066IncomingLinks(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2067IncomingLinks(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2068IncomingLinks(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2069IncomingLinks(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2070IncomingLinks(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071IncomingLinks(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2072IncomingLinks(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2073IncomingLinks(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2074IncomingLinks(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2075IncomingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2076IncomingLinks(view);
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
			return getConnections_2077IncomingLinks(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2078IncomingLinks(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2079IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2001OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
			return getMeter_2002OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
			return getLine_spacing_2003OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
			return getOverhead_line_conductor_2004OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
			return getRegulator_2005OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
			return getController_2006OutgoingLinks(view);
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
			return getRectifier_2008OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
			return getRelay_2009OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
			return getRegulator_configuration_2010OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
			return getPqload_2011OutgoingLinks(view);
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2012OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
			return getResidential_enduse_2013OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
			return getEnergy_storage_2014OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
			return getController2_2015OutgoingLinks(view);
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
			return getBilldump_2016OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
			return getCapbank_2017OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
			return getPlayer_2018OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
			return getDc_dc_converter_2019OutgoingLinks(view);
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
			return getStubauction_2020OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
			return getLine_2021OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_2022OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
			return getCapacitor_2023OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
			return getMicroturbine_2024OutgoingLinks(view);
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
			return getAuction_2025OutgoingLinks(view);
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
			return getSolar_2026OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
			return getMultizone_2027OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
			return getLine_configuration_2028OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
			return getRefrigerator_2029OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2030OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
			return getPlugload_2031OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_2032OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
			return getPower_electronics_2033OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
			return getOverhead_line_2034OutgoingLinks(view);
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2035OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
			return getUnderground_line_conductor_2036OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
			return getUnderground_line_2037OutgoingLinks(view);
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
			return getHouse_a_2038OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
			return getLights_2039OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
			return getRestoration_2040OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
			return getSeries_reactor_2041OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2042OutgoingLinks(view);
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
			return getLoad_2043OutgoingLinks(view);
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
			return getWeather_2044OutgoingLinks(view);
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
			return getInverter_2045OutgoingLinks(view);
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
			return getVoltdump_2046OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2047OutgoingLinks(view);
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
			return getSubstation_2048OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
			return getClotheswasher_2049OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
			return getFrequency_gen_2050OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
			return getWindturb_dg_2051OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2052OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
			return getCollector_2053OutgoingLinks(view);
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
			return getOffice_2054OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
			return getMicrowave_2055OutgoingLinks(view);
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
			return getComm_2056OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2057OutgoingLinks(view);
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
			return getFreezer_2058OutgoingLinks(view);
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
			return getEvcharger_2059OutgoingLinks(view);
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
			return getDryer_2060OutgoingLinks(view);
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
			return getPlc_2061OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
			return getZIPload_2062OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
			return getFault_check_2063OutgoingLinks(view);
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
			return getRecorder_2064OutgoingLinks(view);
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
			return getOccupantload_2065OutgoingLinks(view);
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
			return getFuse_2066OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
			return getVolt_var_control_2067OutgoingLinks(view);
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2068OutgoingLinks(view);
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
			return getBattery_2069OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
			return getCsv_reader_2070OutgoingLinks(view);
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
			return getSwitch_2071OutgoingLinks(view);
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
			return getDishwasher_2072OutgoingLinks(view);
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
			return getHistogram_2073OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
			return getShaper_2074OutgoingLinks(view);
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
			return getGenerator_2075OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_line_configuration_2076OutgoingLinks(view);
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
			return getConnections_2077OutgoingLinks(view);
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
			return getMotor_2078OutgoingLinks(view);
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return getDiesel_dg_2079OutgoingLinks(view);
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
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClimate_2001ContainedLinks(
			View view) {
		visGrid.Climate modelElement = (visGrid.Climate) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Climate_Connection_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMeter_2002ContainedLinks(
			View view) {
		visGrid.Meter modelElement = (visGrid.Meter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Meter_Connection_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_spacing_2003ContainedLinks(
			View view) {
		visGrid.Line_spacing modelElement = (visGrid.Line_spacing) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Line_spacing_Connection_4125(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_conductor_2004ContainedLinks(
			View view) {
		visGrid.Overhead_line_conductor modelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Overhead_line_conductor_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_2005ContainedLinks(
			View view) {
		visGrid.Regulator modelElement = (visGrid.Regulator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Regulator_Connection_4084(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController_2006ContainedLinks(
			View view) {
		visGrid.Controller modelElement = (visGrid.Controller) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller_Connection_4085(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getNode_2007ContainedLinks(
			View view) {
		visGrid.Node modelElement = (visGrid.Node) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Node_Connection_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRectifier_2008ContainedLinks(
			View view) {
		visGrid.Rectifier modelElement = (visGrid.Rectifier) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rectifier_Connection_4075(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRelay_2009ContainedLinks(
			View view) {
		visGrid.Relay modelElement = (visGrid.Relay) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relay_Connection_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_configuration_2010ContainedLinks(
			View view) {
		visGrid.Regulator_configuration modelElement = (visGrid.Regulator_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Regulator_configuration_Connection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPqload_2011ContainedLinks(
			View view) {
		visGrid.Pqload modelElement = (visGrid.Pqload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pqload_Connection_4069(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_2012ContainedLinks(
			View view) {
		visGrid.House modelElement = (visGrid.House) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_House_Connection_4073(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getResidential_enduse_2013ContainedLinks(
			View view) {
		visGrid.Residential_enduse modelElement = (visGrid.Residential_enduse) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Residential_enduse_Connection_4144(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEnergy_storage_2014ContainedLinks(
			View view) {
		visGrid.Energy_storage modelElement = (visGrid.Energy_storage) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Energy_storage_Connection_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController2_2015ContainedLinks(
			View view) {
		visGrid.Controller2 modelElement = (visGrid.Controller2) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller2_Connection_4121(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBilldump_2016ContainedLinks(
			View view) {
		visGrid.Billdump modelElement = (visGrid.Billdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Billdump_Connection_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapbank_2017ContainedLinks(
			View view) {
		visGrid.Capbank modelElement = (visGrid.Capbank) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capbank_Connection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlayer_2018ContainedLinks(
			View view) {
		visGrid.Player modelElement = (visGrid.Player) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Player_Connection_4119(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDc_dc_converter_2019ContainedLinks(
			View view) {
		visGrid.Dc_dc_converter modelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dc_dc_converter_Connection_4074(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getStubauction_2020ContainedLinks(
			View view) {
		visGrid.Stubauction modelElement = (visGrid.Stubauction) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Stubauction_Connection_4098(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_2021ContainedLinks(
			View view) {
		visGrid.Line modelElement = (visGrid.Line) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Line_Connection_4137(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRange_2022ContainedLinks(
			View view) {
		visGrid.Range modelElement = (visGrid.Range) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Range_Connection_4151(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapacitor_2023ContainedLinks(
			View view) {
		visGrid.Capacitor modelElement = (visGrid.Capacitor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capacitor_Connection_4130(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicroturbine_2024ContainedLinks(
			View view) {
		visGrid.Microturbine modelElement = (visGrid.Microturbine) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Microturbine_Connection_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getAuction_2025ContainedLinks(
			View view) {
		visGrid.Auction modelElement = (visGrid.Auction) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Auction_Connection_4138(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSolar_2026ContainedLinks(
			View view) {
		visGrid.Solar modelElement = (visGrid.Solar) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Solar_Connection_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMultizone_2027ContainedLinks(
			View view) {
		visGrid.Multizone modelElement = (visGrid.Multizone) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Multizone_Connection_4056(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_configuration_2028ContainedLinks(
			View view) {
		visGrid.Line_configuration modelElement = (visGrid.Line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Line_configuration_Connection_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRefrigerator_2029ContainedLinks(
			View view) {
		visGrid.Refrigerator modelElement = (visGrid.Refrigerator) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Refrigerator_Connection_4072(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_2030ContainedLinks(
			View view) {
		visGrid.Triplex_line modelElement = (visGrid.Triplex_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_Connection_4039(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlugload_2031ContainedLinks(
			View view) {
		visGrid.Plugload modelElement = (visGrid.Plugload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Plugload_Connection_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLink_2032ContainedLinks(
			View view) {
		visGrid.Link modelElement = (visGrid.Link) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_Connection_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPower_electronics_2033ContainedLinks(
			View view) {
		visGrid.Power_electronics modelElement = (visGrid.Power_electronics) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Power_electronics_Connection_4135(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_2034ContainedLinks(
			View view) {
		visGrid.Overhead_line modelElement = (visGrid.Overhead_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Overhead_line_Connection_4123(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_2035ContainedLinks(
			View view) {
		visGrid.Transformer modelElement = (visGrid.Transformer) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_Connection_4040(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_conductor_2036ContainedLinks(
			View view) {
		visGrid.Underground_line_conductor modelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Underground_line_conductor_Connection_4128(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_2037ContainedLinks(
			View view) {
		visGrid.Underground_line modelElement = (visGrid.Underground_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Underground_line_Connection_4149(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_a_2038ContainedLinks(
			View view) {
		visGrid.House_a modelElement = (visGrid.House_a) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_House_a_Connection_4044(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLights_2039ContainedLinks(
			View view) {
		visGrid.Lights modelElement = (visGrid.Lights) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Lights_Connection_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRestoration_2040ContainedLinks(
			View view) {
		visGrid.Restoration modelElement = (visGrid.Restoration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Restoration_Connection_4077(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSeries_reactor_2041ContainedLinks(
			View view) {
		visGrid.Series_reactor modelElement = (visGrid.Series_reactor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Series_reactor_Connection_4132(modelElement));
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_node_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLoad_2043ContainedLinks(
			View view) {
		visGrid.Load modelElement = (visGrid.Load) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Load_Connection_4117(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWeather_2044ContainedLinks(
			View view) {
		visGrid.Weather modelElement = (visGrid.Weather) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Weather_Connection_4041(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getInverter_2045ContainedLinks(
			View view) {
		visGrid.Inverter modelElement = (visGrid.Inverter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Inverter_Connection_4065(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVoltdump_2046ContainedLinks(
			View view) {
		visGrid.Voltdump modelElement = (visGrid.Voltdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Voltdump_Connection_4129(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_conductor_2047ContainedLinks(
			View view) {
		visGrid.Triplex_line_conductor modelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_conductor_Connection_4062(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSubstation_2048ContainedLinks(
			View view) {
		visGrid.Substation modelElement = (visGrid.Substation) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Substation_Connection_4067(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClotheswasher_2049ContainedLinks(
			View view) {
		visGrid.Clotheswasher modelElement = (visGrid.Clotheswasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Clotheswasher_Connection_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFrequency_gen_2050ContainedLinks(
			View view) {
		visGrid.Frequency_gen modelElement = (visGrid.Frequency_gen) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Frequency_gen_Connection_4082(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWindturb_dg_2051ContainedLinks(
			View view) {
		visGrid.Windturb_dg modelElement = (visGrid.Windturb_dg) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Windturb_dg_Connection_4093(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_meter_2052ContainedLinks(
			View view) {
		visGrid.Triplex_meter modelElement = (visGrid.Triplex_meter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_meter_Connection_4133(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCollector_2053ContainedLinks(
			View view) {
		visGrid.Collector modelElement = (visGrid.Collector) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Collector_Connection_4113(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOffice_2054ContainedLinks(
			View view) {
		visGrid.Office modelElement = (visGrid.Office) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Office_Connection_4070(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicrowave_2055ContainedLinks(
			View view) {
		visGrid.Microwave modelElement = (visGrid.Microwave) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Microwave_Connection_4139(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getComm_2056ContainedLinks(
			View view) {
		visGrid.Comm modelElement = (visGrid.Comm) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Comm_Connection_4086(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_configuration_2057ContainedLinks(
			View view) {
		visGrid.Transformer_configuration modelElement = (visGrid.Transformer_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_configuration_Connection_4111(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFreezer_2058ContainedLinks(
			View view) {
		visGrid.Freezer modelElement = (visGrid.Freezer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Freezer_Connection_4089(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEvcharger_2059ContainedLinks(
			View view) {
		visGrid.Evcharger modelElement = (visGrid.Evcharger) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Evcharger_Connection_4096(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDryer_2060ContainedLinks(
			View view) {
		visGrid.Dryer modelElement = (visGrid.Dryer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dryer_Connection_4047(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlc_2061ContainedLinks(
			View view) {
		visGrid.Plc modelElement = (visGrid.Plc) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Plc_Connection_4120(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getZIPload_2062ContainedLinks(
			View view) {
		visGrid.ZIPload modelElement = (visGrid.ZIPload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ZIPload_Connection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFault_check_2063ContainedLinks(
			View view) {
		visGrid.Fault_check modelElement = (visGrid.Fault_check) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Fault_check_Connection_4049(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRecorder_2064ContainedLinks(
			View view) {
		visGrid.Recorder modelElement = (visGrid.Recorder) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Recorder_Connection_4103(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOccupantload_2065ContainedLinks(
			View view) {
		visGrid.Occupantload modelElement = (visGrid.Occupantload) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Occupantload_Connection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFuse_2066ContainedLinks(
			View view) {
		visGrid.Fuse modelElement = (visGrid.Fuse) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Fuse_Connection_4154(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVolt_var_control_2067ContainedLinks(
			View view) {
		visGrid.Volt_var_control modelElement = (visGrid.Volt_var_control) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Volt_var_control_Connection_4088(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWaterheater_2068ContainedLinks(
			View view) {
		visGrid.Waterheater modelElement = (visGrid.Waterheater) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Waterheater_Connection_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBattery_2069ContainedLinks(
			View view) {
		visGrid.Battery modelElement = (visGrid.Battery) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Battery_Connection_4078(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCsv_reader_2070ContainedLinks(
			View view) {
		visGrid.Csv_reader modelElement = (visGrid.Csv_reader) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Csv_reader_Connection_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSwitch_2071ContainedLinks(
			View view) {
		visGrid.Switch modelElement = (visGrid.Switch) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDishwasher_2072ContainedLinks(
			View view) {
		visGrid.Dishwasher modelElement = (visGrid.Dishwasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dishwasher_Connection_4106(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHistogram_2073ContainedLinks(
			View view) {
		visGrid.Histogram modelElement = (visGrid.Histogram) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Histogram_Connection_4124(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getShaper_2074ContainedLinks(
			View view) {
		visGrid.Shaper modelElement = (visGrid.Shaper) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Shaper_Connection_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGenerator_2075ContainedLinks(
			View view) {
		visGrid.Generator modelElement = (visGrid.Generator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generator_Connection_4099(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_configuration_2076ContainedLinks(
			View view) {
		visGrid.Triplex_line_configuration modelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_configuration_Connection_4126(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getConnections_2077ContainedLinks(
			View view) {
		visGrid.Connections modelElement = (visGrid.Connections) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_House_a_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_conductor_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Energy_storage_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Dc_dc_converter_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_House_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Climate_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Underground_line_conductor_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Stubauction_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Shaper_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Plc_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Office_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Auction_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Refrigerator_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Voltdump_4033(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Inverter_4036(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Residential_enduse_4037(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Substation_4038(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Microturbine_4043(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Line_configuration_4045(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Fault_check_4046(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Player_4048(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Clotheswasher_4050(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Line_spacing_4051(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Fuse_4052(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Comm_4053(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Evcharger_4054(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Lights_4055(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Controller_4057(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Series_reactor_4058(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Transformer_configuration_4059(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Pqload_4060(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Power_electronics_4061(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Csv_reader_4064(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Billdump_4066(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Solar_4068(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Occupantload_4071(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Generator_4076(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Freezer_4079(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Range_4080(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Recorder_4081(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_node_4083(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Collector_4087(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Regulator_configuration_4090(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Meter_4091(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Controller2_4092(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Dryer_4094(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_4095(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Link_4097(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Multizone_4100(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Windturb_dg_4102(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Plugload_4104(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Microwave_4105(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_ZIPload_4107(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Rectifier_4108(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Histogram_4109(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Capacitor_4110(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Regulator_4112(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Waterheater_4114(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Switch_4116(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Transformer_4118(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Line_4122(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_meter_4127(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Underground_line_4131(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Node_4134(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Diesel_dg_4136(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Load_4140(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Frequency_gen_4141(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Restoration_4142(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Motor_4143(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Weather_4145(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Dishwasher_4146(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_configuration_4147(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Battery_4148(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Overhead_line_conductor_4150(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Capbank_4152(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Volt_var_control_4153(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Relay_4155(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Overhead_line_4156(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMotor_2078ContainedLinks(
			View view) {
		visGrid.Motor modelElement = (visGrid.Motor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Motor_Connection_4063(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDiesel_dg_2079ContainedLinks(
			View view) {
		visGrid.Diesel_dg modelElement = (visGrid.Diesel_dg) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Diesel_dg_Connection_4115(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClimate_2001IncomingLinks(
			View view) {
		visGrid.Climate modelElement = (visGrid.Climate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Climate_4010(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMeter_2002IncomingLinks(
			View view) {
		visGrid.Meter modelElement = (visGrid.Meter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Meter_4091(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_spacing_2003IncomingLinks(
			View view) {
		visGrid.Line_spacing modelElement = (visGrid.Line_spacing) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Line_spacing_4051(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_conductor_2004IncomingLinks(
			View view) {
		visGrid.Overhead_line_conductor modelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Overhead_line_conductor_4150(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_2005IncomingLinks(
			View view) {
		visGrid.Regulator modelElement = (visGrid.Regulator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Regulator_4112(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController_2006IncomingLinks(
			View view) {
		visGrid.Controller modelElement = (visGrid.Controller) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Controller_4057(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getNode_2007IncomingLinks(
			View view) {
		visGrid.Node modelElement = (visGrid.Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Node_4134(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRectifier_2008IncomingLinks(
			View view) {
		visGrid.Rectifier modelElement = (visGrid.Rectifier) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Rectifier_4108(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRelay_2009IncomingLinks(
			View view) {
		visGrid.Relay modelElement = (visGrid.Relay) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Relay_4155(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_configuration_2010IncomingLinks(
			View view) {
		visGrid.Regulator_configuration modelElement = (visGrid.Regulator_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Regulator_configuration_4090(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPqload_2011IncomingLinks(
			View view) {
		visGrid.Pqload modelElement = (visGrid.Pqload) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Pqload_4060(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_2012IncomingLinks(
			View view) {
		visGrid.House modelElement = (visGrid.House) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_House_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getResidential_enduse_2013IncomingLinks(
			View view) {
		visGrid.Residential_enduse modelElement = (visGrid.Residential_enduse) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Residential_enduse_4037(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEnergy_storage_2014IncomingLinks(
			View view) {
		visGrid.Energy_storage modelElement = (visGrid.Energy_storage) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Energy_storage_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController2_2015IncomingLinks(
			View view) {
		visGrid.Controller2 modelElement = (visGrid.Controller2) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Controller2_4092(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBilldump_2016IncomingLinks(
			View view) {
		visGrid.Billdump modelElement = (visGrid.Billdump) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Billdump_4066(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapbank_2017IncomingLinks(
			View view) {
		visGrid.Capbank modelElement = (visGrid.Capbank) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Capbank_4152(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlayer_2018IncomingLinks(
			View view) {
		visGrid.Player modelElement = (visGrid.Player) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Player_4048(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDc_dc_converter_2019IncomingLinks(
			View view) {
		visGrid.Dc_dc_converter modelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Dc_dc_converter_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getStubauction_2020IncomingLinks(
			View view) {
		visGrid.Stubauction modelElement = (visGrid.Stubauction) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Stubauction_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_2021IncomingLinks(
			View view) {
		visGrid.Line modelElement = (visGrid.Line) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Line_4122(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRange_2022IncomingLinks(
			View view) {
		visGrid.Range modelElement = (visGrid.Range) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Range_4080(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapacitor_2023IncomingLinks(
			View view) {
		visGrid.Capacitor modelElement = (visGrid.Capacitor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Capacitor_4110(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicroturbine_2024IncomingLinks(
			View view) {
		visGrid.Microturbine modelElement = (visGrid.Microturbine) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Microturbine_4043(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getAuction_2025IncomingLinks(
			View view) {
		visGrid.Auction modelElement = (visGrid.Auction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Auction_4028(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSolar_2026IncomingLinks(
			View view) {
		visGrid.Solar modelElement = (visGrid.Solar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Solar_4068(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMultizone_2027IncomingLinks(
			View view) {
		visGrid.Multizone modelElement = (visGrid.Multizone) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Multizone_4100(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_configuration_2028IncomingLinks(
			View view) {
		visGrid.Line_configuration modelElement = (visGrid.Line_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Line_configuration_4045(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRefrigerator_2029IncomingLinks(
			View view) {
		visGrid.Refrigerator modelElement = (visGrid.Refrigerator) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Refrigerator_4030(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_2030IncomingLinks(
			View view) {
		visGrid.Triplex_line modelElement = (visGrid.Triplex_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Triplex_line_4095(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlugload_2031IncomingLinks(
			View view) {
		visGrid.Plugload modelElement = (visGrid.Plugload) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Plugload_4104(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLink_2032IncomingLinks(
			View view) {
		visGrid.Link modelElement = (visGrid.Link) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Link_4097(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPower_electronics_2033IncomingLinks(
			View view) {
		visGrid.Power_electronics modelElement = (visGrid.Power_electronics) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Power_electronics_4061(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_2034IncomingLinks(
			View view) {
		visGrid.Overhead_line modelElement = (visGrid.Overhead_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Overhead_line_4156(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_2035IncomingLinks(
			View view) {
		visGrid.Transformer modelElement = (visGrid.Transformer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Transformer_4118(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_conductor_2036IncomingLinks(
			View view) {
		visGrid.Underground_line_conductor modelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Underground_line_conductor_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_2037IncomingLinks(
			View view) {
		visGrid.Underground_line modelElement = (visGrid.Underground_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Underground_line_4131(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_a_2038IncomingLinks(
			View view) {
		visGrid.House_a modelElement = (visGrid.House_a) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_House_a_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLights_2039IncomingLinks(
			View view) {
		visGrid.Lights modelElement = (visGrid.Lights) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Lights_4055(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRestoration_2040IncomingLinks(
			View view) {
		visGrid.Restoration modelElement = (visGrid.Restoration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Restoration_4142(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSeries_reactor_2041IncomingLinks(
			View view) {
		visGrid.Series_reactor modelElement = (visGrid.Series_reactor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Series_reactor_4058(
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
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Triplex_node_4083(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLoad_2043IncomingLinks(
			View view) {
		visGrid.Load modelElement = (visGrid.Load) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Load_4140(
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
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Weather_4145(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getInverter_2045IncomingLinks(
			View view) {
		visGrid.Inverter modelElement = (visGrid.Inverter) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Inverter_4036(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVoltdump_2046IncomingLinks(
			View view) {
		visGrid.Voltdump modelElement = (visGrid.Voltdump) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Voltdump_4033(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_conductor_2047IncomingLinks(
			View view) {
		visGrid.Triplex_line_conductor modelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Triplex_line_conductor_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSubstation_2048IncomingLinks(
			View view) {
		visGrid.Substation modelElement = (visGrid.Substation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Substation_4038(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClotheswasher_2049IncomingLinks(
			View view) {
		visGrid.Clotheswasher modelElement = (visGrid.Clotheswasher) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Clotheswasher_4050(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFrequency_gen_2050IncomingLinks(
			View view) {
		visGrid.Frequency_gen modelElement = (visGrid.Frequency_gen) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Frequency_gen_4141(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWindturb_dg_2051IncomingLinks(
			View view) {
		visGrid.Windturb_dg modelElement = (visGrid.Windturb_dg) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Windturb_dg_4102(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_meter_2052IncomingLinks(
			View view) {
		visGrid.Triplex_meter modelElement = (visGrid.Triplex_meter) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Triplex_meter_4127(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCollector_2053IncomingLinks(
			View view) {
		visGrid.Collector modelElement = (visGrid.Collector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Collector_4087(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOffice_2054IncomingLinks(
			View view) {
		visGrid.Office modelElement = (visGrid.Office) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Office_4023(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicrowave_2055IncomingLinks(
			View view) {
		visGrid.Microwave modelElement = (visGrid.Microwave) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Microwave_4105(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getComm_2056IncomingLinks(
			View view) {
		visGrid.Comm modelElement = (visGrid.Comm) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Comm_4053(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_configuration_2057IncomingLinks(
			View view) {
		visGrid.Transformer_configuration modelElement = (visGrid.Transformer_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Transformer_configuration_4059(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFreezer_2058IncomingLinks(
			View view) {
		visGrid.Freezer modelElement = (visGrid.Freezer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Freezer_4079(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEvcharger_2059IncomingLinks(
			View view) {
		visGrid.Evcharger modelElement = (visGrid.Evcharger) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Evcharger_4054(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDryer_2060IncomingLinks(
			View view) {
		visGrid.Dryer modelElement = (visGrid.Dryer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Dryer_4094(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlc_2061IncomingLinks(
			View view) {
		visGrid.Plc modelElement = (visGrid.Plc) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Plc_4022(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getZIPload_2062IncomingLinks(
			View view) {
		visGrid.ZIPload modelElement = (visGrid.ZIPload) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_ZIPload_4107(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFault_check_2063IncomingLinks(
			View view) {
		visGrid.Fault_check modelElement = (visGrid.Fault_check) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Fault_check_4046(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRecorder_2064IncomingLinks(
			View view) {
		visGrid.Recorder modelElement = (visGrid.Recorder) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Recorder_4081(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOccupantload_2065IncomingLinks(
			View view) {
		visGrid.Occupantload modelElement = (visGrid.Occupantload) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Occupantload_4071(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFuse_2066IncomingLinks(
			View view) {
		visGrid.Fuse modelElement = (visGrid.Fuse) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Fuse_4052(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVolt_var_control_2067IncomingLinks(
			View view) {
		visGrid.Volt_var_control modelElement = (visGrid.Volt_var_control) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Volt_var_control_4153(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWaterheater_2068IncomingLinks(
			View view) {
		visGrid.Waterheater modelElement = (visGrid.Waterheater) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Waterheater_4114(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBattery_2069IncomingLinks(
			View view) {
		visGrid.Battery modelElement = (visGrid.Battery) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Battery_4148(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCsv_reader_2070IncomingLinks(
			View view) {
		visGrid.Csv_reader modelElement = (visGrid.Csv_reader) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Csv_reader_4064(
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
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Switch_4116(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDishwasher_2072IncomingLinks(
			View view) {
		visGrid.Dishwasher modelElement = (visGrid.Dishwasher) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Dishwasher_4146(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHistogram_2073IncomingLinks(
			View view) {
		visGrid.Histogram modelElement = (visGrid.Histogram) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Histogram_4109(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getShaper_2074IncomingLinks(
			View view) {
		visGrid.Shaper modelElement = (visGrid.Shaper) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Shaper_4021(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGenerator_2075IncomingLinks(
			View view) {
		visGrid.Generator modelElement = (visGrid.Generator) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Generator_4076(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_configuration_2076IncomingLinks(
			View view) {
		visGrid.Triplex_line_configuration modelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Triplex_line_configuration_4147(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getConnections_2077IncomingLinks(
			View view) {
		visGrid.Connections modelElement = (visGrid.Connections) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_node_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Overhead_line_conductor_Connection_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Regulator_configuration_Connection_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ZIPload_Connection_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Line_configuration_Connection_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Switch_Connection_4012(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Link_Connection_4013(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Climate_Connection_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capbank_Connection_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Occupantload_Connection_4018(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Waterheater_Connection_4019(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Node_Connection_4020(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Meter_Connection_4024(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Solar_Connection_4025(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Relay_Connection_4026(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Csv_reader_Connection_4027(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Lights_Connection_4029(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Clotheswasher_Connection_4031(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Plugload_Connection_4032(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Microturbine_Connection_4034(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Billdump_Connection_4035(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_line_Connection_4039(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Transformer_Connection_4040(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Weather_Connection_4041(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Energy_storage_Connection_4042(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_House_a_Connection_4044(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dryer_Connection_4047(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fault_check_Connection_4049(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Multizone_Connection_4056(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_line_conductor_Connection_4062(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Motor_Connection_4063(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Inverter_Connection_4065(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Substation_Connection_4067(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Pqload_Connection_4069(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Office_Connection_4070(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Refrigerator_Connection_4072(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_House_Connection_4073(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dc_dc_converter_Connection_4074(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Rectifier_Connection_4075(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Restoration_Connection_4077(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Battery_Connection_4078(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Frequency_gen_Connection_4082(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Regulator_Connection_4084(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Controller_Connection_4085(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Comm_Connection_4086(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Volt_var_control_Connection_4088(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Freezer_Connection_4089(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Windturb_dg_Connection_4093(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Evcharger_Connection_4096(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Stubauction_Connection_4098(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Generator_Connection_4099(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Shaper_Connection_4101(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Recorder_Connection_4103(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Dishwasher_Connection_4106(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Transformer_configuration_Connection_4111(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Collector_Connection_4113(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Diesel_dg_Connection_4115(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Load_Connection_4117(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Player_Connection_4119(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Plc_Connection_4120(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Controller2_Connection_4121(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Overhead_line_Connection_4123(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Histogram_Connection_4124(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Line_spacing_Connection_4125(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_line_configuration_Connection_4126(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Underground_line_conductor_Connection_4128(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Voltdump_Connection_4129(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Capacitor_Connection_4130(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Series_reactor_Connection_4132(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_meter_Connection_4133(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Power_electronics_Connection_4135(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Line_Connection_4137(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Auction_Connection_4138(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Microwave_Connection_4139(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Residential_enduse_Connection_4144(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Underground_line_Connection_4149(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Range_Connection_4151(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Fuse_Connection_4154(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMotor_2078IncomingLinks(
			View view) {
		visGrid.Motor modelElement = (visGrid.Motor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Motor_4143(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDiesel_dg_2079IncomingLinks(
			View view) {
		visGrid.Diesel_dg modelElement = (visGrid.Diesel_dg) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connections_Diesel_dg_4136(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClimate_2001OutgoingLinks(
			View view) {
		visGrid.Climate modelElement = (visGrid.Climate) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Climate_Connection_4015(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMeter_2002OutgoingLinks(
			View view) {
		visGrid.Meter modelElement = (visGrid.Meter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Meter_Connection_4024(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_spacing_2003OutgoingLinks(
			View view) {
		visGrid.Line_spacing modelElement = (visGrid.Line_spacing) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Line_spacing_Connection_4125(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_conductor_2004OutgoingLinks(
			View view) {
		visGrid.Overhead_line_conductor modelElement = (visGrid.Overhead_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Overhead_line_conductor_Connection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_2005OutgoingLinks(
			View view) {
		visGrid.Regulator modelElement = (visGrid.Regulator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Regulator_Connection_4084(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController_2006OutgoingLinks(
			View view) {
		visGrid.Controller modelElement = (visGrid.Controller) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller_Connection_4085(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getNode_2007OutgoingLinks(
			View view) {
		visGrid.Node modelElement = (visGrid.Node) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Node_Connection_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRectifier_2008OutgoingLinks(
			View view) {
		visGrid.Rectifier modelElement = (visGrid.Rectifier) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rectifier_Connection_4075(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRelay_2009OutgoingLinks(
			View view) {
		visGrid.Relay modelElement = (visGrid.Relay) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Relay_Connection_4026(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRegulator_configuration_2010OutgoingLinks(
			View view) {
		visGrid.Regulator_configuration modelElement = (visGrid.Regulator_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Regulator_configuration_Connection_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPqload_2011OutgoingLinks(
			View view) {
		visGrid.Pqload modelElement = (visGrid.Pqload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Pqload_Connection_4069(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_2012OutgoingLinks(
			View view) {
		visGrid.House modelElement = (visGrid.House) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_House_Connection_4073(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getResidential_enduse_2013OutgoingLinks(
			View view) {
		visGrid.Residential_enduse modelElement = (visGrid.Residential_enduse) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Residential_enduse_Connection_4144(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEnergy_storage_2014OutgoingLinks(
			View view) {
		visGrid.Energy_storage modelElement = (visGrid.Energy_storage) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Energy_storage_Connection_4042(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getController2_2015OutgoingLinks(
			View view) {
		visGrid.Controller2 modelElement = (visGrid.Controller2) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Controller2_Connection_4121(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBilldump_2016OutgoingLinks(
			View view) {
		visGrid.Billdump modelElement = (visGrid.Billdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Billdump_Connection_4035(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapbank_2017OutgoingLinks(
			View view) {
		visGrid.Capbank modelElement = (visGrid.Capbank) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capbank_Connection_4016(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlayer_2018OutgoingLinks(
			View view) {
		visGrid.Player modelElement = (visGrid.Player) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Player_Connection_4119(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDc_dc_converter_2019OutgoingLinks(
			View view) {
		visGrid.Dc_dc_converter modelElement = (visGrid.Dc_dc_converter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dc_dc_converter_Connection_4074(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getStubauction_2020OutgoingLinks(
			View view) {
		visGrid.Stubauction modelElement = (visGrid.Stubauction) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Stubauction_Connection_4098(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_2021OutgoingLinks(
			View view) {
		visGrid.Line modelElement = (visGrid.Line) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Line_Connection_4137(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRange_2022OutgoingLinks(
			View view) {
		visGrid.Range modelElement = (visGrid.Range) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Range_Connection_4151(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCapacitor_2023OutgoingLinks(
			View view) {
		visGrid.Capacitor modelElement = (visGrid.Capacitor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Capacitor_Connection_4130(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicroturbine_2024OutgoingLinks(
			View view) {
		visGrid.Microturbine modelElement = (visGrid.Microturbine) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Microturbine_Connection_4034(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getAuction_2025OutgoingLinks(
			View view) {
		visGrid.Auction modelElement = (visGrid.Auction) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Auction_Connection_4138(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSolar_2026OutgoingLinks(
			View view) {
		visGrid.Solar modelElement = (visGrid.Solar) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Solar_Connection_4025(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMultizone_2027OutgoingLinks(
			View view) {
		visGrid.Multizone modelElement = (visGrid.Multizone) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Multizone_Connection_4056(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLine_configuration_2028OutgoingLinks(
			View view) {
		visGrid.Line_configuration modelElement = (visGrid.Line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Line_configuration_Connection_4011(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRefrigerator_2029OutgoingLinks(
			View view) {
		visGrid.Refrigerator modelElement = (visGrid.Refrigerator) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Refrigerator_Connection_4072(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_2030OutgoingLinks(
			View view) {
		visGrid.Triplex_line modelElement = (visGrid.Triplex_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_Connection_4039(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlugload_2031OutgoingLinks(
			View view) {
		visGrid.Plugload modelElement = (visGrid.Plugload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Plugload_Connection_4032(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLink_2032OutgoingLinks(
			View view) {
		visGrid.Link modelElement = (visGrid.Link) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_Connection_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPower_electronics_2033OutgoingLinks(
			View view) {
		visGrid.Power_electronics modelElement = (visGrid.Power_electronics) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Power_electronics_Connection_4135(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOverhead_line_2034OutgoingLinks(
			View view) {
		visGrid.Overhead_line modelElement = (visGrid.Overhead_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Overhead_line_Connection_4123(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_2035OutgoingLinks(
			View view) {
		visGrid.Transformer modelElement = (visGrid.Transformer) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_Connection_4040(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_conductor_2036OutgoingLinks(
			View view) {
		visGrid.Underground_line_conductor modelElement = (visGrid.Underground_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Underground_line_conductor_Connection_4128(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getUnderground_line_2037OutgoingLinks(
			View view) {
		visGrid.Underground_line modelElement = (visGrid.Underground_line) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Underground_line_Connection_4149(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHouse_a_2038OutgoingLinks(
			View view) {
		visGrid.House_a modelElement = (visGrid.House_a) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_House_a_Connection_4044(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLights_2039OutgoingLinks(
			View view) {
		visGrid.Lights modelElement = (visGrid.Lights) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Lights_Connection_4029(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRestoration_2040OutgoingLinks(
			View view) {
		visGrid.Restoration modelElement = (visGrid.Restoration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Restoration_Connection_4077(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSeries_reactor_2041OutgoingLinks(
			View view) {
		visGrid.Series_reactor modelElement = (visGrid.Series_reactor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Series_reactor_Connection_4132(modelElement));
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_node_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getLoad_2043OutgoingLinks(
			View view) {
		visGrid.Load modelElement = (visGrid.Load) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Load_Connection_4117(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWeather_2044OutgoingLinks(
			View view) {
		visGrid.Weather modelElement = (visGrid.Weather) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Weather_Connection_4041(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getInverter_2045OutgoingLinks(
			View view) {
		visGrid.Inverter modelElement = (visGrid.Inverter) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Inverter_Connection_4065(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVoltdump_2046OutgoingLinks(
			View view) {
		visGrid.Voltdump modelElement = (visGrid.Voltdump) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Voltdump_Connection_4129(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_conductor_2047OutgoingLinks(
			View view) {
		visGrid.Triplex_line_conductor modelElement = (visGrid.Triplex_line_conductor) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_conductor_Connection_4062(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSubstation_2048OutgoingLinks(
			View view) {
		visGrid.Substation modelElement = (visGrid.Substation) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Substation_Connection_4067(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getClotheswasher_2049OutgoingLinks(
			View view) {
		visGrid.Clotheswasher modelElement = (visGrid.Clotheswasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Clotheswasher_Connection_4031(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFrequency_gen_2050OutgoingLinks(
			View view) {
		visGrid.Frequency_gen modelElement = (visGrid.Frequency_gen) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Frequency_gen_Connection_4082(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWindturb_dg_2051OutgoingLinks(
			View view) {
		visGrid.Windturb_dg modelElement = (visGrid.Windturb_dg) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Windturb_dg_Connection_4093(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_meter_2052OutgoingLinks(
			View view) {
		visGrid.Triplex_meter modelElement = (visGrid.Triplex_meter) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_meter_Connection_4133(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCollector_2053OutgoingLinks(
			View view) {
		visGrid.Collector modelElement = (visGrid.Collector) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Collector_Connection_4113(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOffice_2054OutgoingLinks(
			View view) {
		visGrid.Office modelElement = (visGrid.Office) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Office_Connection_4070(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMicrowave_2055OutgoingLinks(
			View view) {
		visGrid.Microwave modelElement = (visGrid.Microwave) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Microwave_Connection_4139(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getComm_2056OutgoingLinks(
			View view) {
		visGrid.Comm modelElement = (visGrid.Comm) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Comm_Connection_4086(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTransformer_configuration_2057OutgoingLinks(
			View view) {
		visGrid.Transformer_configuration modelElement = (visGrid.Transformer_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_configuration_Connection_4111(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFreezer_2058OutgoingLinks(
			View view) {
		visGrid.Freezer modelElement = (visGrid.Freezer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Freezer_Connection_4089(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getEvcharger_2059OutgoingLinks(
			View view) {
		visGrid.Evcharger modelElement = (visGrid.Evcharger) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Evcharger_Connection_4096(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDryer_2060OutgoingLinks(
			View view) {
		visGrid.Dryer modelElement = (visGrid.Dryer) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dryer_Connection_4047(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getPlc_2061OutgoingLinks(
			View view) {
		visGrid.Plc modelElement = (visGrid.Plc) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Plc_Connection_4120(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getZIPload_2062OutgoingLinks(
			View view) {
		visGrid.ZIPload modelElement = (visGrid.ZIPload) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ZIPload_Connection_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFault_check_2063OutgoingLinks(
			View view) {
		visGrid.Fault_check modelElement = (visGrid.Fault_check) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Fault_check_Connection_4049(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getRecorder_2064OutgoingLinks(
			View view) {
		visGrid.Recorder modelElement = (visGrid.Recorder) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Recorder_Connection_4103(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getOccupantload_2065OutgoingLinks(
			View view) {
		visGrid.Occupantload modelElement = (visGrid.Occupantload) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Occupantload_Connection_4018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getFuse_2066OutgoingLinks(
			View view) {
		visGrid.Fuse modelElement = (visGrid.Fuse) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Fuse_Connection_4154(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getVolt_var_control_2067OutgoingLinks(
			View view) {
		visGrid.Volt_var_control modelElement = (visGrid.Volt_var_control) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Volt_var_control_Connection_4088(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getWaterheater_2068OutgoingLinks(
			View view) {
		visGrid.Waterheater modelElement = (visGrid.Waterheater) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Waterheater_Connection_4019(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getBattery_2069OutgoingLinks(
			View view) {
		visGrid.Battery modelElement = (visGrid.Battery) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Battery_Connection_4078(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getCsv_reader_2070OutgoingLinks(
			View view) {
		visGrid.Csv_reader modelElement = (visGrid.Csv_reader) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Csv_reader_Connection_4027(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getSwitch_2071OutgoingLinks(
			View view) {
		visGrid.Switch modelElement = (visGrid.Switch) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Switch_Connection_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDishwasher_2072OutgoingLinks(
			View view) {
		visGrid.Dishwasher modelElement = (visGrid.Dishwasher) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Dishwasher_Connection_4106(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getHistogram_2073OutgoingLinks(
			View view) {
		visGrid.Histogram modelElement = (visGrid.Histogram) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Histogram_Connection_4124(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getShaper_2074OutgoingLinks(
			View view) {
		visGrid.Shaper modelElement = (visGrid.Shaper) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Shaper_Connection_4101(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getGenerator_2075OutgoingLinks(
			View view) {
		visGrid.Generator modelElement = (visGrid.Generator) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Generator_Connection_4099(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getTriplex_line_configuration_2076OutgoingLinks(
			View view) {
		visGrid.Triplex_line_configuration modelElement = (visGrid.Triplex_line_configuration) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_configuration_Connection_4126(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getConnections_2077OutgoingLinks(
			View view) {
		visGrid.Connections modelElement = (visGrid.Connections) view
				.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_House_a_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_conductor_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Energy_storage_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Dc_dc_converter_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_House_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Climate_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Underground_line_conductor_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Stubauction_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Shaper_4021(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Plc_4022(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Office_4023(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Auction_4028(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Refrigerator_4030(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Voltdump_4033(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Inverter_4036(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Residential_enduse_4037(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Substation_4038(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Microturbine_4043(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Line_configuration_4045(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Fault_check_4046(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Player_4048(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Clotheswasher_4050(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Line_spacing_4051(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Fuse_4052(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Comm_4053(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Evcharger_4054(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Lights_4055(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Controller_4057(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Series_reactor_4058(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Transformer_configuration_4059(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Pqload_4060(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Power_electronics_4061(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Csv_reader_4064(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Billdump_4066(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Solar_4068(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Occupantload_4071(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Generator_4076(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Freezer_4079(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Range_4080(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Recorder_4081(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_node_4083(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Collector_4087(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Regulator_configuration_4090(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Meter_4091(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Controller2_4092(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Dryer_4094(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_4095(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Link_4097(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Multizone_4100(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Windturb_dg_4102(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Plugload_4104(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Microwave_4105(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_ZIPload_4107(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Rectifier_4108(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Histogram_4109(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Capacitor_4110(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Regulator_4112(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Waterheater_4114(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Switch_4116(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Transformer_4118(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Line_4122(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_meter_4127(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Underground_line_4131(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Node_4134(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Diesel_dg_4136(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Load_4140(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Frequency_gen_4141(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Restoration_4142(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Motor_4143(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Weather_4145(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Dishwasher_4146(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_configuration_4147(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Battery_4148(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Overhead_line_conductor_4150(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Capbank_4152(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Volt_var_control_4153(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Relay_4155(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connections_Overhead_line_4156(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getMotor_2078OutgoingLinks(
			View view) {
		visGrid.Motor modelElement = (visGrid.Motor) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Motor_Connection_4063(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<visGrid.diagram.part.VisGridLinkDescriptor> getDiesel_dg_2079OutgoingLinks(
			View view) {
		visGrid.Diesel_dg modelElement = (visGrid.Diesel_dg) view.getElement();
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Diesel_dg_Connection_4115(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_node_Connection_4001(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTriplex_node_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001,
						visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Overhead_line_conductor_Connection_4002(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getOverhead_line_conductor_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002,
						visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_House_a_4003(
			visGrid.House_a target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_House_a()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003,
						visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Triplex_line_conductor_4004(
			visGrid.Triplex_line_conductor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Triplex_line_conductor()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004,
						visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Energy_storage_4005(
			visGrid.Energy_storage target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Energy_storage()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005,
						visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Dc_dc_converter_4006(
			visGrid.Dc_dc_converter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Dc_dc_converter()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006,
						visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Regulator_configuration_Connection_4007(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRegulator_configuration_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007,
						visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_House_4008(
			visGrid.House target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_House()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008,
						visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_ZIPload_Connection_4009(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getZIPload_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009,
						visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Climate_4010(
			visGrid.Climate target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Climate()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010,
						visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Line_configuration_Connection_4011(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getLine_configuration_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011,
						visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Switch_Connection_4012(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getSwitch_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012,
						visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Link_Connection_4013(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getLink_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013,
						visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Underground_line_conductor_4014(
			visGrid.Underground_line_conductor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Underground_line_conductor()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014,
						visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Climate_Connection_4015(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getClimate_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015,
						visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Capbank_Connection_4016(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getCapbank_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016,
						visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Stubauction_4017(
			visGrid.Stubauction target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Stubauction()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017,
						visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Occupantload_Connection_4018(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getOccupantload_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018,
						visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Waterheater_Connection_4019(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getWaterheater_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019,
						visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Node_Connection_4020(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getNode_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020,
						visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Shaper_4021(
			visGrid.Shaper target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Shaper()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021,
						visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Plc_4022(
			visGrid.Plc target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Plc()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022,
						visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Office_4023(
			visGrid.Office target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Office()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023,
						visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Meter_Connection_4024(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getMeter_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024,
						visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Solar_Connection_4025(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getSolar_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025,
						visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Relay_Connection_4026(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRelay_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026,
						visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Csv_reader_Connection_4027(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getCsv_reader_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027,
						visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Auction_4028(
			visGrid.Auction target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Auction()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028,
						visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Lights_Connection_4029(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getLights_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029,
						visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Refrigerator_4030(
			visGrid.Refrigerator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Refrigerator()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030,
						visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Clotheswasher_Connection_4031(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getClotheswasher_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031,
						visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Plugload_Connection_4032(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getPlugload_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032,
						visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Voltdump_4033(
			visGrid.Voltdump target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Voltdump()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033,
						visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Microturbine_Connection_4034(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getMicroturbine_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034,
						visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Billdump_Connection_4035(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getBilldump_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035,
						visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Inverter_4036(
			visGrid.Inverter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Inverter()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036,
						visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Residential_enduse_4037(
			visGrid.Residential_enduse target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Residential_enduse()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037,
						visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Substation_4038(
			visGrid.Substation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Substation()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038,
						visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_line_Connection_4039(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039,
						visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Transformer_Connection_4040(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTransformer_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040,
						visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Weather_Connection_4041(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getWeather_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041,
						visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Energy_storage_Connection_4042(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getEnergy_storage_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042,
						visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Microturbine_4043(
			visGrid.Microturbine target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Microturbine()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043,
						visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_House_a_Connection_4044(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getHouse_a_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044,
						visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Line_configuration_4045(
			visGrid.Line_configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Line_configuration()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045,
						visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Fault_check_4046(
			visGrid.Fault_check target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Fault_check()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046,
						visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Dryer_Connection_4047(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getDryer_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047,
						visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Player_4048(
			visGrid.Player target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Player()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048,
						visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Fault_check_Connection_4049(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getFault_check_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049,
						visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Clotheswasher_4050(
			visGrid.Clotheswasher target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Clotheswasher()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050,
						visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Line_spacing_4051(
			visGrid.Line_spacing target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Line_spacing()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051,
						visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Fuse_4052(
			visGrid.Fuse target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Fuse()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052,
						visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Comm_4053(
			visGrid.Comm target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Comm()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053,
						visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Evcharger_4054(
			visGrid.Evcharger target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Evcharger()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054,
						visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Lights_4055(
			visGrid.Lights target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Lights()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055,
						visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Multizone_Connection_4056(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getMultizone_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056,
						visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Controller_4057(
			visGrid.Controller target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Controller()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057,
						visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Series_reactor_4058(
			visGrid.Series_reactor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Series_reactor()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058,
						visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Transformer_configuration_4059(
			visGrid.Transformer_configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Transformer_configuration()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059,
						visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Pqload_4060(
			visGrid.Pqload target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Pqload()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060,
						visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Power_electronics_4061(
			visGrid.Power_electronics target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Power_electronics()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061,
						visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_line_conductor_Connection_4062(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_conductor_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062,
						visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Motor_Connection_4063(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getMotor_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063,
						visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Csv_reader_4064(
			visGrid.Csv_reader target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Csv_reader()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064,
						visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Inverter_Connection_4065(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getInverter_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065,
						visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Billdump_4066(
			visGrid.Billdump target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Billdump()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066,
						visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Substation_Connection_4067(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getSubstation_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067,
						visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Solar_4068(
			visGrid.Solar target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Solar()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068,
						visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Pqload_Connection_4069(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getPqload_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069,
						visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Office_Connection_4070(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getOffice_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070,
						visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Occupantload_4071(
			visGrid.Occupantload target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Occupantload()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071,
						visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Refrigerator_Connection_4072(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRefrigerator_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072,
						visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_House_Connection_4073(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getHouse_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073,
						visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Dc_dc_converter_Connection_4074(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getDc_dc_converter_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074,
						visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Rectifier_Connection_4075(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRectifier_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075,
						visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Generator_4076(
			visGrid.Generator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Generator()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076,
						visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Restoration_Connection_4077(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRestoration_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077,
						visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Battery_Connection_4078(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getBattery_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078,
						visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Freezer_4079(
			visGrid.Freezer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Freezer()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079,
						visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Range_4080(
			visGrid.Range target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Range()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080,
						visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Recorder_4081(
			visGrid.Recorder target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Recorder()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081,
						visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Frequency_gen_Connection_4082(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getFrequency_gen_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082,
						visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Triplex_node_4083(
			visGrid.Triplex_node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Triplex_node()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083,
						visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Regulator_Connection_4084(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRegulator_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084,
						visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Controller_Connection_4085(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getController_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085,
						visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Comm_Connection_4086(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getComm_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086,
						visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Collector_4087(
			visGrid.Collector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Collector()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087,
						visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Volt_var_control_Connection_4088(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getVolt_var_control_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088,
						visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Freezer_Connection_4089(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getFreezer_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089,
						visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Regulator_configuration_4090(
			visGrid.Regulator_configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Regulator_configuration()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090,
						visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Meter_4091(
			visGrid.Meter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Meter()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091,
						visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Controller2_4092(
			visGrid.Controller2 target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Controller2()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092,
						visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Windturb_dg_Connection_4093(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getWindturb_dg_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093,
						visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Dryer_4094(
			visGrid.Dryer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Dryer()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094,
						visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Triplex_line_4095(
			visGrid.Triplex_line target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Triplex_line()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095,
						visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Evcharger_Connection_4096(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getEvcharger_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096,
						visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Link_4097(
			visGrid.Link target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Link()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097,
						visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Stubauction_Connection_4098(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getStubauction_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098,
						visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Generator_Connection_4099(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getGenerator_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099,
						visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Multizone_4100(
			visGrid.Multizone target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Multizone()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100,
						visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Shaper_Connection_4101(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getShaper_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101,
						visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Windturb_dg_4102(
			visGrid.Windturb_dg target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Windturb_dg()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102,
						visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Recorder_Connection_4103(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRecorder_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103,
						visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Plugload_4104(
			visGrid.Plugload target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Plugload()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104,
						visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Microwave_4105(
			visGrid.Microwave target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Microwave()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105,
						visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Dishwasher_Connection_4106(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getDishwasher_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106,
						visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_ZIPload_4107(
			visGrid.ZIPload target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_ZIPload()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107,
						visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Rectifier_4108(
			visGrid.Rectifier target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Rectifier()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108,
						visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Histogram_4109(
			visGrid.Histogram target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Histogram()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109,
						visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Capacitor_4110(
			visGrid.Capacitor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Capacitor()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110,
						visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Transformer_configuration_Connection_4111(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTransformer_configuration_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111,
						visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Regulator_4112(
			visGrid.Regulator target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Regulator()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112,
						visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Collector_Connection_4113(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getCollector_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113,
						visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Waterheater_4114(
			visGrid.Waterheater target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Waterheater()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114,
						visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Diesel_dg_Connection_4115(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getDiesel_dg_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115,
						visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Switch_4116(
			visGrid.Switch target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Switch()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116,
						visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Load_Connection_4117(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getLoad_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117,
						visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Transformer_4118(
			visGrid.Transformer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Transformer()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118,
						visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Player_Connection_4119(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getPlayer_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119,
						visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Plc_Connection_4120(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getPlc_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120,
						visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Controller2_Connection_4121(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getController2_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121,
						visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Line_4122(
			visGrid.Line target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Line()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122,
						visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Overhead_line_Connection_4123(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getOverhead_line_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123,
						visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Histogram_Connection_4124(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getHistogram_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124,
						visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Line_spacing_Connection_4125(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getLine_spacing_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125,
						visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_line_configuration_Connection_4126(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTriplex_line_configuration_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126,
						visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Triplex_meter_4127(
			visGrid.Triplex_meter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Triplex_meter()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127,
						visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Underground_line_conductor_Connection_4128(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getUnderground_line_conductor_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128,
						visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Voltdump_Connection_4129(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getVoltdump_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129,
						visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Capacitor_Connection_4130(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getCapacitor_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130,
						visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Underground_line_4131(
			visGrid.Underground_line target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Underground_line()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131,
						visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Series_reactor_Connection_4132(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getSeries_reactor_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132,
						visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_meter_Connection_4133(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getTriplex_meter_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133,
						visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Node_4134(
			visGrid.Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Node()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134,
						visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Power_electronics_Connection_4135(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getPower_electronics_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135,
						visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Diesel_dg_4136(
			visGrid.Diesel_dg target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Diesel_dg()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136,
						visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Line_Connection_4137(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getLine_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137,
						visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Auction_Connection_4138(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getAuction_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138,
						visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Microwave_Connection_4139(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getMicrowave_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139,
						visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Load_4140(
			visGrid.Load target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Load()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140,
						visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Frequency_gen_4141(
			visGrid.Frequency_gen target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Frequency_gen()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141,
						visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Restoration_4142(
			visGrid.Restoration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Restoration()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142,
						visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Motor_4143(
			visGrid.Motor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Motor()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143,
						visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Residential_enduse_Connection_4144(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getResidential_enduse_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144,
						visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Weather_4145(
			visGrid.Weather target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Weather()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145,
						visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Dishwasher_4146(
			visGrid.Dishwasher target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Dishwasher()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146,
						visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Triplex_line_configuration_4147(
			visGrid.Triplex_line_configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Triplex_line_configuration()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147,
						visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Battery_4148(
			visGrid.Battery target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Battery()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148,
						visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Underground_line_Connection_4149(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getUnderground_line_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149,
						visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Overhead_line_conductor_4150(
			visGrid.Overhead_line_conductor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Overhead_line_conductor()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150,
						visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Range_Connection_4151(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getRange_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151,
						visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Capbank_4152(
			visGrid.Capbank target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Capbank()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152,
						visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Volt_var_control_4153(
			visGrid.Volt_var_control target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Volt_var_control()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153,
						visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Fuse_Connection_4154(
			visGrid.Connections target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getFuse_Connection()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154,
						visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Relay_4155(
			visGrid.Relay target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Relay()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155,
						visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Connections_Overhead_line_4156(
			visGrid.Overhead_line target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == visGrid.VisGridPackage.eINSTANCE
					.getConnections_Overhead_line()) {
				result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
						setting.getEObject(),
						target,
						visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156,
						visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_node_Connection_4001(
			visGrid.Triplex_node source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001,
					visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Overhead_line_conductor_Connection_4002(
			visGrid.Overhead_line_conductor source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductorConnection_4002,
					visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_House_a_4003(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getHouse_a().iterator(); destinations
				.hasNext();) {
			visGrid.House_a destination = (visGrid.House_a) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003,
					visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_conductor_4004(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_line_conductor()
				.iterator(); destinations.hasNext();) {
			visGrid.Triplex_line_conductor destination = (visGrid.Triplex_line_conductor) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_conductor_4004,
					visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Energy_storage_4005(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getEnergy_storage().iterator(); destinations
				.hasNext();) {
			visGrid.Energy_storage destination = (visGrid.Energy_storage) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005,
					visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Dc_dc_converter_4006(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getDc_dc_converter().iterator(); destinations
				.hasNext();) {
			visGrid.Dc_dc_converter destination = (visGrid.Dc_dc_converter) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006,
					visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Regulator_configuration_Connection_4007(
			visGrid.Regulator_configuration source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007,
					visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_House_4008(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getHouse().iterator(); destinations
				.hasNext();) {
			visGrid.House destination = (visGrid.House) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008,
					visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_ZIPload_Connection_4009(
			visGrid.ZIPload source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009,
					visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Climate_4010(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getClimate().iterator(); destinations
				.hasNext();) {
			visGrid.Climate destination = (visGrid.Climate) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010,
					visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Line_configuration_Connection_4011(
			visGrid.Line_configuration source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Line_configurationConnection_4011,
					visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Switch_Connection_4012(
			visGrid.Switch source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012,
					visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Link_Connection_4013(
			visGrid.Link source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.LinkConnection_4013,
					visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Underground_line_conductor_4014(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getUnderground_line_conductor()
				.iterator(); destinations.hasNext();) {
			visGrid.Underground_line_conductor destination = (visGrid.Underground_line_conductor) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_conductor_4014,
					visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Climate_Connection_4015(
			visGrid.Climate source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015,
					visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capbank_Connection_4016(
			visGrid.Capbank source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.CapbankConnection_4016,
					visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Stubauction_4017(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getStubauction().iterator(); destinations
				.hasNext();) {
			visGrid.Stubauction destination = (visGrid.Stubauction) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017,
					visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Occupantload_Connection_4018(
			visGrid.Occupantload source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018,
					visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Waterheater_Connection_4019(
			visGrid.Waterheater source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019,
					visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Node_Connection_4020(
			visGrid.Node source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020,
					visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Shaper_4021(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getShaper().iterator(); destinations
				.hasNext();) {
			visGrid.Shaper destination = (visGrid.Shaper) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsShaper_4021,
					visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Plc_4022(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getPlc().iterator(); destinations
				.hasNext();) {
			visGrid.Plc destination = (visGrid.Plc) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlc_4022,
					visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Office_4023(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getOffice().iterator(); destinations
				.hasNext();) {
			visGrid.Office destination = (visGrid.Office) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsOffice_4023,
					visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Meter_Connection_4024(
			visGrid.Meter source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024,
					visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Solar_Connection_4025(
			visGrid.Solar source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025,
					visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Relay_Connection_4026(
			visGrid.Relay source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RelayConnection_4026,
					visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Csv_reader_Connection_4027(
			visGrid.Csv_reader source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027,
					visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Auction_4028(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getAuction().iterator(); destinations
				.hasNext();) {
			visGrid.Auction destination = (visGrid.Auction) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028,
					visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Lights_Connection_4029(
			visGrid.Lights source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029,
					visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Refrigerator_4030(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRefrigerator().iterator(); destinations
				.hasNext();) {
			visGrid.Refrigerator destination = (visGrid.Refrigerator) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030,
					visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Clotheswasher_Connection_4031(
			visGrid.Clotheswasher source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031,
					visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Plugload_Connection_4032(
			visGrid.Plugload source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032,
					visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Voltdump_4033(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getVoltdump().iterator(); destinations
				.hasNext();) {
			visGrid.Voltdump destination = (visGrid.Voltdump) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsVoltdump_4033,
					visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Microturbine_Connection_4034(
			visGrid.Microturbine source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034,
					visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Billdump_Connection_4035(
			visGrid.Billdump source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.BilldumpConnection_4035,
					visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Inverter_4036(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getInverter().iterator(); destinations
				.hasNext();) {
			visGrid.Inverter destination = (visGrid.Inverter) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036,
					visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Residential_enduse_4037(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getResidential_enduse()
				.iterator(); destinations.hasNext();) {
			visGrid.Residential_enduse destination = (visGrid.Residential_enduse) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037,
					visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Substation_4038(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getSubstation().iterator(); destinations
				.hasNext();) {
			visGrid.Substation destination = (visGrid.Substation) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038,
					visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_line_Connection_4039(
			visGrid.Triplex_line source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039,
					visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transformer_Connection_4040(
			visGrid.Transformer source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040,
					visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Weather_Connection_4041(
			visGrid.Weather source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041,
					visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Energy_storage_Connection_4042(
			visGrid.Energy_storage source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042,
					visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Microturbine_4043(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getMicroturbine().iterator(); destinations
				.hasNext();) {
			visGrid.Microturbine destination = (visGrid.Microturbine) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043,
					visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_House_a_Connection_4044(
			visGrid.House_a source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044,
					visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Line_configuration_4045(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getLine_configuration()
				.iterator(); destinations.hasNext();) {
			visGrid.Line_configuration destination = (visGrid.Line_configuration) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_configuration_4045,
					visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Fault_check_4046(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getFault_check().iterator(); destinations
				.hasNext();) {
			visGrid.Fault_check destination = (visGrid.Fault_check) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsFault_check_4046,
					visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Dryer_Connection_4047(
			visGrid.Dryer source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047,
					visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Player_4048(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getPlayer().iterator(); destinations
				.hasNext();) {
			visGrid.Player destination = (visGrid.Player) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlayer_4048,
					visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Fault_check_Connection_4049(
			visGrid.Fault_check source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Fault_checkConnection_4049,
					visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Clotheswasher_4050(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getClotheswasher().iterator(); destinations
				.hasNext();) {
			visGrid.Clotheswasher destination = (visGrid.Clotheswasher) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050,
					visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Line_spacing_4051(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getLine_spacing().iterator(); destinations
				.hasNext();) {
			visGrid.Line_spacing destination = (visGrid.Line_spacing) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051,
					visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Fuse_4052(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getFuse().iterator(); destinations
				.hasNext();) {
			visGrid.Fuse destination = (visGrid.Fuse) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsFuse_4052,
					visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Comm_4053(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getComm().iterator(); destinations
				.hasNext();) {
			visGrid.Comm destination = (visGrid.Comm) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsComm_4053,
					visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Evcharger_4054(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getEvcharger().iterator(); destinations
				.hasNext();) {
			visGrid.Evcharger destination = (visGrid.Evcharger) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054,
					visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Lights_4055(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getLights().iterator(); destinations
				.hasNext();) {
			visGrid.Lights destination = (visGrid.Lights) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055,
					visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Multizone_Connection_4056(
			visGrid.Multizone source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.MultizoneConnection_4056,
					visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Controller_4057(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getController().iterator(); destinations
				.hasNext();) {
			visGrid.Controller destination = (visGrid.Controller) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057,
					visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Series_reactor_4058(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getSeries_reactor().iterator(); destinations
				.hasNext();) {
			visGrid.Series_reactor destination = (visGrid.Series_reactor) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058,
					visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Transformer_configuration_4059(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTransformer_configuration()
				.iterator(); destinations.hasNext();) {
			visGrid.Transformer_configuration destination = (visGrid.Transformer_configuration) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_configuration_4059,
					visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Pqload_4060(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getPqload().iterator(); destinations
				.hasNext();) {
			visGrid.Pqload destination = (visGrid.Pqload) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsPqload_4060,
					visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Power_electronics_4061(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getPower_electronics()
				.iterator(); destinations.hasNext();) {
			visGrid.Power_electronics destination = (visGrid.Power_electronics) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061,
					visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_line_conductor_Connection_4062(
			visGrid.Triplex_line_conductor source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductorConnection_4062,
					visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Motor_Connection_4063(
			visGrid.Motor source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063,
					visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Csv_reader_4064(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getCsv_reader().iterator(); destinations
				.hasNext();) {
			visGrid.Csv_reader destination = (visGrid.Csv_reader) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064,
					visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Inverter_Connection_4065(
			visGrid.Inverter source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065,
					visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Billdump_4066(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getBilldump().iterator(); destinations
				.hasNext();) {
			visGrid.Billdump destination = (visGrid.Billdump) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsBilldump_4066,
					visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Substation_Connection_4067(
			visGrid.Substation source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067,
					visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Solar_4068(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getSolar().iterator(); destinations
				.hasNext();) {
			visGrid.Solar destination = (visGrid.Solar) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068,
					visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Pqload_Connection_4069(
			visGrid.Pqload source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.PqloadConnection_4069,
					visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Office_Connection_4070(
			visGrid.Office source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.OfficeConnection_4070,
					visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Occupantload_4071(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getOccupantload().iterator(); destinations
				.hasNext();) {
			visGrid.Occupantload destination = (visGrid.Occupantload) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071,
					visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Refrigerator_Connection_4072(
			visGrid.Refrigerator source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072,
					visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_House_Connection_4073(
			visGrid.House source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.HouseConnection_4073,
					visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Dc_dc_converter_Connection_4074(
			visGrid.Dc_dc_converter source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074,
					visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rectifier_Connection_4075(
			visGrid.Rectifier source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075,
					visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Generator_4076(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getGenerator().iterator(); destinations
				.hasNext();) {
			visGrid.Generator destination = (visGrid.Generator) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076,
					visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Restoration_Connection_4077(
			visGrid.Restoration source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RestorationConnection_4077,
					visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Battery_Connection_4078(
			visGrid.Battery source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078,
					visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Freezer_4079(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getFreezer().iterator(); destinations
				.hasNext();) {
			visGrid.Freezer destination = (visGrid.Freezer) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079,
					visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Range_4080(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRange().iterator(); destinations
				.hasNext();) {
			visGrid.Range destination = (visGrid.Range) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080,
					visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Recorder_4081(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRecorder().iterator(); destinations
				.hasNext();) {
			visGrid.Recorder destination = (visGrid.Recorder) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081,
					visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Frequency_gen_Connection_4082(
			visGrid.Frequency_gen source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082,
					visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Triplex_node_4083(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_node().iterator(); destinations
				.hasNext();) {
			visGrid.Triplex_node destination = (visGrid.Triplex_node) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083,
					visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Regulator_Connection_4084(
			visGrid.Regulator source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RegulatorConnection_4084,
					visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Controller_Connection_4085(
			visGrid.Controller source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085,
					visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Comm_Connection_4086(
			visGrid.Comm source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.CommConnection_4086,
					visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Collector_4087(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getCollector().iterator(); destinations
				.hasNext();) {
			visGrid.Collector destination = (visGrid.Collector) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsCollector_4087,
					visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Volt_var_control_Connection_4088(
			visGrid.Volt_var_control source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Volt_var_controlConnection_4088,
					visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Freezer_Connection_4089(
			visGrid.Freezer source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089,
					visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Regulator_configuration_4090(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRegulator_configuration()
				.iterator(); destinations.hasNext();) {
			visGrid.Regulator_configuration destination = (visGrid.Regulator_configuration) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090,
					visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Meter_4091(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getMeter().iterator(); destinations
				.hasNext();) {
			visGrid.Meter destination = (visGrid.Meter) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091,
					visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Controller2_4092(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getController2().iterator(); destinations
				.hasNext();) {
			visGrid.Controller2 destination = (visGrid.Controller2) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092,
					visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Windturb_dg_Connection_4093(
			visGrid.Windturb_dg source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093,
					visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Dryer_4094(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getDryer().iterator(); destinations
				.hasNext();) {
			visGrid.Dryer destination = (visGrid.Dryer) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094,
					visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_4095(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_line().iterator(); destinations
				.hasNext();) {
			visGrid.Triplex_line destination = (visGrid.Triplex_line) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095,
					visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Evcharger_Connection_4096(
			visGrid.Evcharger source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096,
					visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Link_4097(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getLink().iterator(); destinations
				.hasNext();) {
			visGrid.Link destination = (visGrid.Link) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsLink_4097,
					visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Stubauction_Connection_4098(
			visGrid.Stubauction source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098,
					visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Generator_Connection_4099(
			visGrid.Generator source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099,
					visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Multizone_4100(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getMultizone().iterator(); destinations
				.hasNext();) {
			visGrid.Multizone destination = (visGrid.Multizone) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsMultizone_4100,
					visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Shaper_Connection_4101(
			visGrid.Shaper source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ShaperConnection_4101,
					visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Windturb_dg_4102(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getWindturb_dg().iterator(); destinations
				.hasNext();) {
			visGrid.Windturb_dg destination = (visGrid.Windturb_dg) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102,
					visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Recorder_Connection_4103(
			visGrid.Recorder source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103,
					visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Plugload_4104(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getPlugload().iterator(); destinations
				.hasNext();) {
			visGrid.Plugload destination = (visGrid.Plugload) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104,
					visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Microwave_4105(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getMicrowave().iterator(); destinations
				.hasNext();) {
			visGrid.Microwave destination = (visGrid.Microwave) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105,
					visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Dishwasher_Connection_4106(
			visGrid.Dishwasher source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106,
					visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_ZIPload_4107(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getZIPload().iterator(); destinations
				.hasNext();) {
			visGrid.ZIPload destination = (visGrid.ZIPload) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107,
					visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Rectifier_4108(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRectifier().iterator(); destinations
				.hasNext();) {
			visGrid.Rectifier destination = (visGrid.Rectifier) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108,
					visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Histogram_4109(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getHistogram().iterator(); destinations
				.hasNext();) {
			visGrid.Histogram destination = (visGrid.Histogram) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsHistogram_4109,
					visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Capacitor_4110(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getCapacitor().iterator(); destinations
				.hasNext();) {
			visGrid.Capacitor destination = (visGrid.Capacitor) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110,
					visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transformer_configuration_Connection_4111(
			visGrid.Transformer_configuration source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Transformer_configurationConnection_4111,
					visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Regulator_4112(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRegulator().iterator(); destinations
				.hasNext();) {
			visGrid.Regulator destination = (visGrid.Regulator) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_4112,
					visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Collector_Connection_4113(
			visGrid.Collector source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.CollectorConnection_4113,
					visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Waterheater_4114(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getWaterheater().iterator(); destinations
				.hasNext();) {
			visGrid.Waterheater destination = (visGrid.Waterheater) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114,
					visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Diesel_dg_Connection_4115(
			visGrid.Diesel_dg source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115,
					visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Switch_4116(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getSwitch().iterator(); destinations
				.hasNext();) {
			visGrid.Switch destination = (visGrid.Switch) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116,
					visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Load_Connection_4117(
			visGrid.Load source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117,
					visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Transformer_4118(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTransformer().iterator(); destinations
				.hasNext();) {
			visGrid.Transformer destination = (visGrid.Transformer) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118,
					visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Player_Connection_4119(
			visGrid.Player source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.PlayerConnection_4119,
					visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Plc_Connection_4120(
			visGrid.Plc source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.PlcConnection_4120,
					visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Controller2_Connection_4121(
			visGrid.Controller2 source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121,
					visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Line_4122(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getLine().iterator(); destinations
				.hasNext();) {
			visGrid.Line destination = (visGrid.Line) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122,
					visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Overhead_line_Connection_4123(
			visGrid.Overhead_line source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123,
					visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Histogram_Connection_4124(
			visGrid.Histogram source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.HistogramConnection_4124,
					visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Line_spacing_Connection_4125(
			visGrid.Line_spacing source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125,
					visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_line_configuration_Connection_4126(
			visGrid.Triplex_line_configuration source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126,
					visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Triplex_meter_4127(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_meter().iterator(); destinations
				.hasNext();) {
			visGrid.Triplex_meter destination = (visGrid.Triplex_meter) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_meter_4127,
					visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Underground_line_conductor_Connection_4128(
			visGrid.Underground_line_conductor source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductorConnection_4128,
					visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Voltdump_Connection_4129(
			visGrid.Voltdump source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.VoltdumpConnection_4129,
					visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Capacitor_Connection_4130(
			visGrid.Capacitor source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130,
					visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Underground_line_4131(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getUnderground_line().iterator(); destinations
				.hasNext();) {
			visGrid.Underground_line destination = (visGrid.Underground_line) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131,
					visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Series_reactor_Connection_4132(
			visGrid.Series_reactor source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132,
					visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_meter_Connection_4133(
			visGrid.Triplex_meter source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Triplex_meterConnection_4133,
					visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Node_4134(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getNode().iterator(); destinations
				.hasNext();) {
			visGrid.Node destination = (visGrid.Node) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134,
					visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Power_electronics_Connection_4135(
			visGrid.Power_electronics source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135,
					visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Diesel_dg_4136(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getDiesel_dg().iterator(); destinations
				.hasNext();) {
			visGrid.Diesel_dg destination = (visGrid.Diesel_dg) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136,
					visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Line_Connection_4137(
			visGrid.Line source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137,
					visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Auction_Connection_4138(
			visGrid.Auction source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138,
					visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Microwave_Connection_4139(
			visGrid.Microwave source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139,
					visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Load_4140(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getLoad().iterator(); destinations
				.hasNext();) {
			visGrid.Load destination = (visGrid.Load) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140,
					visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Frequency_gen_4141(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getFrequency_gen().iterator(); destinations
				.hasNext();) {
			visGrid.Frequency_gen destination = (visGrid.Frequency_gen) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141,
					visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Restoration_4142(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRestoration().iterator(); destinations
				.hasNext();) {
			visGrid.Restoration destination = (visGrid.Restoration) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRestoration_4142,
					visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Motor_4143(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getMotor().iterator(); destinations
				.hasNext();) {
			visGrid.Motor destination = (visGrid.Motor) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143,
					visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Residential_enduse_Connection_4144(
			visGrid.Residential_enduse source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144,
					visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Weather_4145(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getWeather().iterator(); destinations
				.hasNext();) {
			visGrid.Weather destination = (visGrid.Weather) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145,
					visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Dishwasher_4146(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getDishwasher().iterator(); destinations
				.hasNext();) {
			visGrid.Dishwasher destination = (visGrid.Dishwasher) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146,
					visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Triplex_line_configuration_4147(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_line_configuration()
				.iterator(); destinations.hasNext();) {
			visGrid.Triplex_line_configuration destination = (visGrid.Triplex_line_configuration) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147,
					visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Battery_4148(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getBattery().iterator(); destinations
				.hasNext();) {
			visGrid.Battery destination = (visGrid.Battery) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148,
					visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Underground_line_Connection_4149(
			visGrid.Underground_line source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149,
					visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Overhead_line_conductor_4150(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getOverhead_line_conductor()
				.iterator(); destinations.hasNext();) {
			visGrid.Overhead_line_conductor destination = (visGrid.Overhead_line_conductor) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_conductor_4150,
					visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Range_Connection_4151(
			visGrid.Range source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151,
					visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Capbank_4152(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getCapbank().iterator(); destinations
				.hasNext();) {
			visGrid.Capbank destination = (visGrid.Capbank) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapbank_4152,
					visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Volt_var_control_4153(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getVolt_var_control().iterator(); destinations
				.hasNext();) {
			visGrid.Volt_var_control destination = (visGrid.Volt_var_control) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsVolt_var_control_4153,
					visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Fuse_Connection_4154(
			visGrid.Fuse source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getConnection().iterator(); destinations
				.hasNext();) {
			visGrid.Connections destination = (visGrid.Connections) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.FuseConnection_4154,
					visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Relay_4155(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getRelay().iterator(); destinations
				.hasNext();) {
			visGrid.Relay destination = (visGrid.Relay) destinations.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsRelay_4155,
					visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<visGrid.diagram.part.VisGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connections_Overhead_line_4156(
			visGrid.Connections source) {
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getOverhead_line().iterator(); destinations
				.hasNext();) {
			visGrid.Overhead_line destination = (visGrid.Overhead_line) destinations
					.next();
			result.add(new visGrid.diagram.part.VisGridLinkDescriptor(
					source,
					destination,
					visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156,
					visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID));
		}
		return result;
	}

}
