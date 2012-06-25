package simpleGrid.diagram.part;

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
public class SimpleGridVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.gmf.example.simpleGrid.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID.equals(view
					.getType())) {
				return simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view.getType());
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
				simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
						.getInstance().logError(
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
		if (simpleGrid.SimpleGridPackage.eINSTANCE.getGrid().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((simpleGrid.Grid) domainElement)) {
			return simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
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
		String containerModelID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getModelID(containerView);
		if (!simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			if (simpleGrid.SimpleGridPackage.eINSTANCE
					.getTransformer_configuration().isSuperTypeOf(
							domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getClimate()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getTriplex_node()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getTransformer()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getTriplex_meter()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getWaterheater()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_Line_configuration().isSuperTypeOf(
							domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE
					.getTriplex_line_conductor().isSuperTypeOf(
							domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getTriplex_line()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID;
			}
			if (simpleGrid.SimpleGridPackage.eINSTANCE.getHouse()
					.isSuperTypeOf(domainElement.eClass())) {
				return simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getModelID(containerView);
		if (!simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			if (simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(simpleGrid.Grid element) {
		return true;
	}

}
