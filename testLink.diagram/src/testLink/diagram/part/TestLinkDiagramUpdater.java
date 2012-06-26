package testLink.diagram.part;

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
public class TestLinkDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkNodeDescriptor> getSemanticChildren(
			View view) {
		switch (testLink.diagram.part.TestLinkVisualIDRegistry
				.getVisualID(view)) {
		case testLink.diagram.edit.parts.ATopEditPart.VISUAL_ID:
			return getATop_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkNodeDescriptor> getATop_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		testLink.ATop modelElement = (testLink.ATop) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkNodeDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEReference6().iterator(); it
				.hasNext();) {
			testLink.One childElement = (testLink.One) it.next();
			int visualID = testLink.diagram.part.TestLinkVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == testLink.diagram.edit.parts.OneEditPart.VISUAL_ID) {
				result.add(new testLink.diagram.part.TestLinkNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEReference4().iterator(); it
				.hasNext();) {
			testLink.Three childElement = (testLink.Three) it.next();
			int visualID = testLink.diagram.part.TestLinkVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID) {
				result.add(new testLink.diagram.part.TestLinkNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEReference5().iterator(); it
				.hasNext();) {
			testLink.Two childElement = (testLink.Two) it.next();
			int visualID = testLink.diagram.part.TestLinkVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID) {
				result.add(new testLink.diagram.part.TestLinkNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getContainedLinks(
			View view) {
		switch (testLink.diagram.part.TestLinkVisualIDRegistry
				.getVisualID(view)) {
		case testLink.diagram.edit.parts.ATopEditPart.VISUAL_ID:
			return getATop_1000ContainedLinks(view);
		case testLink.diagram.edit.parts.OneEditPart.VISUAL_ID:
			return getOne_2001ContainedLinks(view);
		case testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID:
			return getThree_2002ContainedLinks(view);
		case testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID:
			return getTwo_2003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getIncomingLinks(
			View view) {
		switch (testLink.diagram.part.TestLinkVisualIDRegistry
				.getVisualID(view)) {
		case testLink.diagram.edit.parts.OneEditPart.VISUAL_ID:
			return getOne_2001IncomingLinks(view);
		case testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID:
			return getThree_2002IncomingLinks(view);
		case testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID:
			return getTwo_2003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (testLink.diagram.part.TestLinkVisualIDRegistry
				.getVisualID(view)) {
		case testLink.diagram.edit.parts.OneEditPart.VISUAL_ID:
			return getOne_2001OutgoingLinks(view);
		case testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID:
			return getThree_2002OutgoingLinks(view);
		case testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID:
			return getTwo_2003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getATop_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getOne_2001ContainedLinks(
			View view) {
		testLink.One modelElement = (testLink.One) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getThree_2002ContainedLinks(
			View view) {
		testLink.Three modelElement = (testLink.Three) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getTwo_2003ContainedLinks(
			View view) {
		testLink.Two modelElement = (testLink.Two) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getOne_2001IncomingLinks(
			View view) {
		testLink.One modelElement = (testLink.One) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Link_EReference0_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getThree_2002IncomingLinks(
			View view) {
		testLink.Three modelElement = (testLink.Three) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Link_EReference0_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getTwo_2003IncomingLinks(
			View view) {
		testLink.Two modelElement = (testLink.Two) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Link_EReference0_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getOne_2001OutgoingLinks(
			View view) {
		testLink.One modelElement = (testLink.One) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getThree_2002OutgoingLinks(
			View view) {
		testLink.Three modelElement = (testLink.Three) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<testLink.diagram.part.TestLinkLinkDescriptor> getTwo_2003OutgoingLinks(
			View view) {
		testLink.Two modelElement = (testLink.Two) view.getElement();
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<testLink.diagram.part.TestLinkLinkDescriptor> getIncomingFeatureModelFacetLinks_Link_EReference0_4001(
			testLink.Link target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == testLink.TestLinkPackage.eINSTANCE
					.getLink_EReference0()) {
				result.add(new testLink.diagram.part.TestLinkLinkDescriptor(
						setting.getEObject(),
						target,
						testLink.diagram.providers.TestLinkElementTypes.LinkEReference0_4001,
						testLink.diagram.edit.parts.LinkEReference0EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<testLink.diagram.part.TestLinkLinkDescriptor> getOutgoingFeatureModelFacetLinks_Link_EReference0_4001(
			testLink.Link source) {
		LinkedList<testLink.diagram.part.TestLinkLinkDescriptor> result = new LinkedList<testLink.diagram.part.TestLinkLinkDescriptor>();
		for (Iterator<?> destinations = source.getEReference0().iterator(); destinations
				.hasNext();) {
			testLink.Link destination = (testLink.Link) destinations.next();
			result.add(new testLink.diagram.part.TestLinkLinkDescriptor(
					source,
					destination,
					testLink.diagram.providers.TestLinkElementTypes.LinkEReference0_4001,
					testLink.diagram.edit.parts.LinkEReference0EditPart.VISUAL_ID));
		}
		return result;
	}

}
