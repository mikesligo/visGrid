package simpleGrid.diagram.part;

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
public class SimpleGridDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridNodeDescriptor> getSemanticChildren(
			View view) {
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridNodeDescriptor> getGrid_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		simpleGrid.Grid modelElement = (simpleGrid.Grid) view.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridNodeDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTransformer_configuration()
				.iterator(); it.hasNext();) {
			simpleGrid.Transformer_configuration childElement = (simpleGrid.Transformer_configuration) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		{
			simpleGrid.Climate childElement = modelElement.getClimate();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_nodes().iterator(); it
				.hasNext();) {
			simpleGrid.Triplex_node childElement = (simpleGrid.Triplex_node) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTransformer().iterator(); it
				.hasNext();) {
			simpleGrid.Transformer childElement = (simpleGrid.Transformer) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_meter().iterator(); it
				.hasNext();) {
			simpleGrid.Triplex_meter childElement = (simpleGrid.Triplex_meter) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNode().iterator(); it.hasNext();) {
			simpleGrid.Node childElement = (simpleGrid.Node) it.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWaterheater().iterator(); it
				.hasNext();) {
			simpleGrid.Waterheater childElement = (simpleGrid.Waterheater) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_line_configuration()
				.iterator(); it.hasNext();) {
			simpleGrid.Triplex_Line_configuration childElement = (simpleGrid.Triplex_Line_configuration) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_line_conductor()
				.iterator(); it.hasNext();) {
			simpleGrid.Triplex_line_conductor childElement = (simpleGrid.Triplex_line_conductor) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTriplex_line().iterator(); it
				.hasNext();) {
			simpleGrid.Triplex_line childElement = (simpleGrid.Triplex_line) it
					.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHouse().iterator(); it.hasNext();) {
			simpleGrid.House childElement = (simpleGrid.House) it.next();
			int visualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID) {
				result.add(new simpleGrid.diagram.part.SimpleGridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getContainedLinks(
			View view) {
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2004ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2009ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2002ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2010ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2005ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2003ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID:
			return getTriplex_Line_configuration_2001ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2008ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2006ContainedLinks(view);
		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2011ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingLinks(
			View view) {
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {
		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2004IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2009IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2002IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2010IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2005IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2003IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID:
			return getTriplex_Line_configuration_2001IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2008IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2006IncomingLinks(view);
		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2011IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {
		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2004OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2009OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2002OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2010OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2005OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2003OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID:
			return getTriplex_Line_configuration_2001OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2008OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2006OutgoingLinks(view);
		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2011OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getGrid_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTransformer_configuration_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getClimate_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_node_2002ContainedLinks(
			View view) {
		simpleGrid.Triplex_node modelElement = (simpleGrid.Triplex_node) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_node_Triplex_line_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTransformer_2010ContainedLinks(
			View view) {
		simpleGrid.Transformer modelElement = (simpleGrid.Transformer) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_Transformer_configuration_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_Triplex_node_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_meter_2005ContainedLinks(
			View view) {
		simpleGrid.Triplex_meter modelElement = (simpleGrid.Triplex_meter) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_meter_House_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getNode_2007ContainedLinks(
			View view) {
		simpleGrid.Node modelElement = (simpleGrid.Node) view.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Node_Transformer_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getWaterheater_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_Line_configuration_2001ContainedLinks(
			View view) {
		simpleGrid.Triplex_Line_configuration modelElement = (simpleGrid.Triplex_Line_configuration) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_Line_configuration_Triplex_line_conductor_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_line_conductor_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_line_2006ContainedLinks(
			View view) {
		simpleGrid.Triplex_line modelElement = (simpleGrid.Triplex_line) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_Triplex_line_configuration_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_Triplex_meter_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getHouse_2011ContainedLinks(
			View view) {
		simpleGrid.House modelElement = (simpleGrid.House) view.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_House_Waterheater_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTransformer_configuration_2004IncomingLinks(
			View view) {
		simpleGrid.Transformer_configuration modelElement = (simpleGrid.Transformer_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Transformer_Transformer_configuration_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getClimate_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_node_2002IncomingLinks(
			View view) {
		simpleGrid.Triplex_node modelElement = (simpleGrid.Triplex_node) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Transformer_Triplex_node_4013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTransformer_2010IncomingLinks(
			View view) {
		simpleGrid.Transformer modelElement = (simpleGrid.Transformer) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Node_Transformer_4014(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_meter_2005IncomingLinks(
			View view) {
		simpleGrid.Triplex_meter modelElement = (simpleGrid.Triplex_meter) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_line_Triplex_meter_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getNode_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getWaterheater_2003IncomingLinks(
			View view) {
		simpleGrid.Waterheater modelElement = (simpleGrid.Waterheater) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_House_Waterheater_4017(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_Line_configuration_2001IncomingLinks(
			View view) {
		simpleGrid.Triplex_Line_configuration modelElement = (simpleGrid.Triplex_Line_configuration) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_line_Triplex_line_configuration_4011(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_line_conductor_2008IncomingLinks(
			View view) {
		simpleGrid.Triplex_line_conductor modelElement = (simpleGrid.Triplex_line_conductor) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_Line_configuration_Triplex_line_conductor_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_line_2006IncomingLinks(
			View view) {
		simpleGrid.Triplex_line modelElement = (simpleGrid.Triplex_line) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_node_Triplex_line_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getHouse_2011IncomingLinks(
			View view) {
		simpleGrid.House modelElement = (simpleGrid.House) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Triplex_meter_House_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTransformer_configuration_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getClimate_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_node_2002OutgoingLinks(
			View view) {
		simpleGrid.Triplex_node modelElement = (simpleGrid.Triplex_node) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_node_Triplex_line_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTransformer_2010OutgoingLinks(
			View view) {
		simpleGrid.Transformer modelElement = (simpleGrid.Transformer) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_Transformer_configuration_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transformer_Triplex_node_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_meter_2005OutgoingLinks(
			View view) {
		simpleGrid.Triplex_meter modelElement = (simpleGrid.Triplex_meter) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_meter_House_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getNode_2007OutgoingLinks(
			View view) {
		simpleGrid.Node modelElement = (simpleGrid.Node) view.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Node_Transformer_4014(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getWaterheater_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_Line_configuration_2001OutgoingLinks(
			View view) {
		simpleGrid.Triplex_Line_configuration modelElement = (simpleGrid.Triplex_Line_configuration) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_Line_configuration_Triplex_line_conductor_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_line_conductor_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getTriplex_line_2006OutgoingLinks(
			View view) {
		simpleGrid.Triplex_line modelElement = (simpleGrid.Triplex_line) view
				.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_Triplex_line_configuration_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Triplex_line_Triplex_meter_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getHouse_2011OutgoingLinks(
			View view) {
		simpleGrid.House modelElement = (simpleGrid.House) view.getElement();
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_House_Waterheater_4017(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Transformer_Transformer_configuration_4006(
			simpleGrid.Transformer_configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTransformer_Transformer_configuration()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006,
						simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_House_Waterheater_4017(
			simpleGrid.Waterheater target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getHouse_Waterheater()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017,
						simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_Line_configuration_Triplex_line_conductor_4008(
			simpleGrid.Triplex_line_conductor target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_Line_configuration_Triplex_line_conductor()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configurationTriplex_line_conductor_4008,
						simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_line_Triplex_line_configuration_4011(
			simpleGrid.Triplex_Line_configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_line_Triplex_line_configuration()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_line_configuration_4011,
						simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_node_Triplex_line_4005(
			simpleGrid.Triplex_line target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_node_Triplex_line()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005,
						simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Node_Transformer_4014(
			simpleGrid.Transformer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getNode_Transformer()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.NodeTransformer_4014,
						simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_meter_House_4001(
			simpleGrid.House target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_meter_House()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001,
						simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Triplex_line_Triplex_meter_4007(
			simpleGrid.Triplex_meter target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_line_Triplex_meter()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007,
						simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getIncomingFeatureModelFacetLinks_Transformer_Triplex_node_4013(
			simpleGrid.Triplex_node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == simpleGrid.SimpleGridPackage.eINSTANCE
					.getTransformer_Triplex_node()) {
				result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
						setting.getEObject(),
						target,
						simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013,
						simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transformer_Transformer_configuration_4006(
			simpleGrid.Transformer source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTransformer_configuration()
				.iterator(); destinations.hasNext();) {
			simpleGrid.Transformer_configuration destination = (simpleGrid.Transformer_configuration) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006,
					simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_House_Waterheater_4017(
			simpleGrid.House source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getWaterheater().iterator(); destinations
				.hasNext();) {
			simpleGrid.Waterheater destination = (simpleGrid.Waterheater) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017,
					simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_Line_configuration_Triplex_line_conductor_4008(
			simpleGrid.Triplex_Line_configuration source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_line_conductor()
				.iterator(); destinations.hasNext();) {
			simpleGrid.Triplex_line_conductor destination = (simpleGrid.Triplex_line_conductor) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configurationTriplex_line_conductor_4008,
					simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_line_Triplex_line_configuration_4011(
			simpleGrid.Triplex_line source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_line_configuration()
				.iterator(); destinations.hasNext();) {
			simpleGrid.Triplex_Line_configuration destination = (simpleGrid.Triplex_Line_configuration) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_line_configuration_4011,
					simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_node_Triplex_line_4005(
			simpleGrid.Triplex_node source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_line().iterator(); destinations
				.hasNext();) {
			simpleGrid.Triplex_line destination = (simpleGrid.Triplex_line) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005,
					simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Node_Transformer_4014(
			simpleGrid.Node source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTransformer().iterator(); destinations
				.hasNext();) {
			simpleGrid.Transformer destination = (simpleGrid.Transformer) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.NodeTransformer_4014,
					simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_meter_House_4001(
			simpleGrid.Triplex_meter source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getHouse().iterator(); destinations
				.hasNext();) {
			simpleGrid.House destination = (simpleGrid.House) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001,
					simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Triplex_line_Triplex_meter_4007(
			simpleGrid.Triplex_line source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_meter().iterator(); destinations
				.hasNext();) {
			simpleGrid.Triplex_meter destination = (simpleGrid.Triplex_meter) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007,
					simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<simpleGrid.diagram.part.SimpleGridLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transformer_Triplex_node_4013(
			simpleGrid.Transformer source) {
		LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor> result = new LinkedList<simpleGrid.diagram.part.SimpleGridLinkDescriptor>();
		for (Iterator<?> destinations = source.getTriplex_node().iterator(); destinations
				.hasNext();) {
			simpleGrid.Triplex_node destination = (simpleGrid.Triplex_node) destinations
					.next();
			result.add(new simpleGrid.diagram.part.SimpleGridLinkDescriptor(
					source,
					destination,
					simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013,
					simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID));
		}
		return result;
	}

}
