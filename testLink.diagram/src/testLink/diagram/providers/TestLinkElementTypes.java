package testLink.diagram.providers;

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
public class TestLinkElementTypes {

	/**
	 * @generated
	 */
	private TestLinkElementTypes() {
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
	public static final IElementType ATop_1000 = getElementType("testLink.diagram.ATop_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType One_2001 = getElementType("testLink.diagram.One_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Three_2002 = getElementType("testLink.diagram.Three_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Two_2003 = getElementType("testLink.diagram.Two_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LinkEReference0_4001 = getElementType("testLink.diagram.LinkEReference0_4001"); //$NON-NLS-1$

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
				return testLink.diagram.part.TestLinkDiagramEditorPlugin
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

			elements.put(ATop_1000,
					testLink.TestLinkPackage.eINSTANCE.getATop());

			elements.put(One_2001, testLink.TestLinkPackage.eINSTANCE.getOne());

			elements.put(Three_2002,
					testLink.TestLinkPackage.eINSTANCE.getThree());

			elements.put(Two_2003, testLink.TestLinkPackage.eINSTANCE.getTwo());

			elements.put(LinkEReference0_4001,
					testLink.TestLinkPackage.eINSTANCE.getLink_EReference0());
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
			KNOWN_ELEMENT_TYPES.add(ATop_1000);
			KNOWN_ELEMENT_TYPES.add(One_2001);
			KNOWN_ELEMENT_TYPES.add(Three_2002);
			KNOWN_ELEMENT_TYPES.add(Two_2003);
			KNOWN_ELEMENT_TYPES.add(LinkEReference0_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case testLink.diagram.edit.parts.ATopEditPart.VISUAL_ID:
			return ATop_1000;
		case testLink.diagram.edit.parts.OneEditPart.VISUAL_ID:
			return One_2001;
		case testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID:
			return Three_2002;
		case testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID:
			return Two_2003;
		case testLink.diagram.edit.parts.LinkEReference0EditPart.VISUAL_ID:
			return LinkEReference0_4001;
		}
		return null;
	}

}
