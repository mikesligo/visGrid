package simpleGrid.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class SimpleGridElementTypes {

	/**
	 * @generated
	 */
	private SimpleGridElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Grid_1000 = getElementType("org.gmf.example.simpleGrid.diagram.Grid_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_configuration_2004 = getElementType("org.gmf.example.simpleGrid.diagram.Transformer_configuration_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Climate_2009 = getElementType("org.gmf.example.simpleGrid.diagram.Climate_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_node_2002 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_node_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transformer_2010 = getElementType("org.gmf.example.simpleGrid.diagram.Transformer_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_meter_2005 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_meter_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2007 = getElementType("org.gmf.example.simpleGrid.diagram.Node_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Waterheater_2003 = getElementType("org.gmf.example.simpleGrid.diagram.Waterheater_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_Line_configuration_2001 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_Line_configuration_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_conductor_2008 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_line_conductor_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_line_2006 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_line_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType House_2011 = getElementType("org.gmf.example.simpleGrid.diagram.House_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TransformerTransformer_configuration_4006 = getElementType("org.gmf.example.simpleGrid.diagram.TransformerTransformer_configuration_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HouseWaterheater_4017 = getElementType("org.gmf.example.simpleGrid.diagram.HouseWaterheater_4017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_Line_configurationTriplex_line_conductor_4008 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_Line_configurationTriplex_line_conductor_4008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_lineTriplex_line_configuration_4011 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_lineTriplex_line_configuration_4011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_nodeTriplex_line_4005 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_nodeTriplex_line_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NodeTransformer_4014 = getElementType("org.gmf.example.simpleGrid.diagram.NodeTransformer_4014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_meterHouse_4001 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_meterHouse_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Triplex_lineTriplex_meter_4007 = getElementType("org.gmf.example.simpleGrid.diagram.Triplex_lineTriplex_meter_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TransformerTriplex_node_4013 = getElementType("org.gmf.example.simpleGrid.diagram.TransformerTriplex_node_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Grid_1000,
					simpleGrid.SimpleGridPackage.eINSTANCE.getGrid());

			elements.put(Transformer_configuration_2004,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTransformer_configuration());

			elements.put(Climate_2009,
					simpleGrid.SimpleGridPackage.eINSTANCE.getClimate());

			elements.put(Triplex_node_2002,
					simpleGrid.SimpleGridPackage.eINSTANCE.getTriplex_node());

			elements.put(Transformer_2010,
					simpleGrid.SimpleGridPackage.eINSTANCE.getTransformer());

			elements.put(Triplex_meter_2005,
					simpleGrid.SimpleGridPackage.eINSTANCE.getTriplex_meter());

			elements.put(Node_2007,
					simpleGrid.SimpleGridPackage.eINSTANCE.getNode());

			elements.put(Waterheater_2003,
					simpleGrid.SimpleGridPackage.eINSTANCE.getWaterheater());

			elements.put(Triplex_Line_configuration_2001,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_Line_configuration());

			elements.put(Triplex_line_conductor_2008,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_line_conductor());

			elements.put(Triplex_line_2006,
					simpleGrid.SimpleGridPackage.eINSTANCE.getTriplex_line());

			elements.put(House_2011,
					simpleGrid.SimpleGridPackage.eINSTANCE.getHouse());

			elements.put(TransformerTransformer_configuration_4006,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTransformer_Transformer_configuration());

			elements.put(HouseWaterheater_4017,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getHouse_Waterheater());

			elements.put(
					Triplex_Line_configurationTriplex_line_conductor_4008,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_Line_configuration_Triplex_line_conductor());

			elements.put(Triplex_lineTriplex_line_configuration_4011,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_line_Triplex_line_configuration());

			elements.put(Triplex_nodeTriplex_line_4005,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_node_Triplex_line());

			elements.put(NodeTransformer_4014,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getNode_Transformer());

			elements.put(Triplex_meterHouse_4001,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_meter_House());

			elements.put(Triplex_lineTriplex_meter_4007,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTriplex_line_Triplex_meter());

			elements.put(TransformerTriplex_node_4013,
					simpleGrid.SimpleGridPackage.eINSTANCE
							.getTransformer_Triplex_node());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Grid_1000);
			KNOWN_ELEMENT_TYPES.add(Transformer_configuration_2004);
			KNOWN_ELEMENT_TYPES.add(Climate_2009);
			KNOWN_ELEMENT_TYPES.add(Triplex_node_2002);
			KNOWN_ELEMENT_TYPES.add(Transformer_2010);
			KNOWN_ELEMENT_TYPES.add(Triplex_meter_2005);
			KNOWN_ELEMENT_TYPES.add(Node_2007);
			KNOWN_ELEMENT_TYPES.add(Waterheater_2003);
			KNOWN_ELEMENT_TYPES.add(Triplex_Line_configuration_2001);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_conductor_2008);
			KNOWN_ELEMENT_TYPES.add(Triplex_line_2006);
			KNOWN_ELEMENT_TYPES.add(House_2011);
			KNOWN_ELEMENT_TYPES.add(TransformerTransformer_configuration_4006);
			KNOWN_ELEMENT_TYPES.add(HouseWaterheater_4017);
			KNOWN_ELEMENT_TYPES
					.add(Triplex_Line_configurationTriplex_line_conductor_4008);
			KNOWN_ELEMENT_TYPES
					.add(Triplex_lineTriplex_line_configuration_4011);
			KNOWN_ELEMENT_TYPES.add(Triplex_nodeTriplex_line_4005);
			KNOWN_ELEMENT_TYPES.add(NodeTransformer_4014);
			KNOWN_ELEMENT_TYPES.add(Triplex_meterHouse_4001);
			KNOWN_ELEMENT_TYPES.add(Triplex_lineTriplex_meter_4007);
			KNOWN_ELEMENT_TYPES.add(TransformerTriplex_node_4013);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return Grid_1000;
		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return Transformer_configuration_2004;
		case simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return Climate_2009;
		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return Triplex_node_2002;
		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return Transformer_2010;
		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return Triplex_meter_2005;
		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return Node_2007;
		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return Waterheater_2003;
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID:
			return Triplex_Line_configuration_2001;
		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return Triplex_line_conductor_2008;
		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return Triplex_line_2006;
		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return House_2011;
		case simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID:
			return TransformerTransformer_configuration_4006;
		case simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID:
			return HouseWaterheater_4017;
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID:
			return Triplex_Line_configurationTriplex_line_conductor_4008;
		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID:
			return Triplex_lineTriplex_line_configuration_4011;
		case simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID:
			return Triplex_nodeTriplex_line_4005;
		case simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID:
			return NodeTransformer_4014;
		case simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID:
			return Triplex_meterHouse_4001;
		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID:
			return Triplex_lineTriplex_meter_4007;
		case simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID:
			return TransformerTriplex_node_4013;
		}
		return null;
	}

}
