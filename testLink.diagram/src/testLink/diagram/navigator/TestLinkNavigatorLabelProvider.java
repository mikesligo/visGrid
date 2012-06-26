package testLink.diagram.navigator;

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
public class TestLinkNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		testLink.diagram.part.TestLinkDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		testLink.diagram.part.TestLinkDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof testLink.diagram.navigator.TestLinkNavigatorItem
				&& !isOwnView(((testLink.diagram.navigator.TestLinkNavigatorItem) element)
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
		if (element instanceof testLink.diagram.navigator.TestLinkNavigatorGroup) {
			testLink.diagram.navigator.TestLinkNavigatorGroup group = (testLink.diagram.navigator.TestLinkNavigatorGroup) element;
			return testLink.diagram.part.TestLinkDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof testLink.diagram.navigator.TestLinkNavigatorItem) {
			testLink.diagram.navigator.TestLinkNavigatorItem navigatorItem = (testLink.diagram.navigator.TestLinkNavigatorItem) element;
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
		switch (testLink.diagram.part.TestLinkVisualIDRegistry
				.getVisualID(view)) {
		case testLink.diagram.edit.parts.OneEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://d.c?One", testLink.diagram.providers.TestLinkElementTypes.One_2001); //$NON-NLS-1$
		case testLink.diagram.edit.parts.LinkEReference0EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://d.c?Link?EReference0", testLink.diagram.providers.TestLinkElementTypes.LinkEReference0_4001); //$NON-NLS-1$
		case testLink.diagram.edit.parts.ATopEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://d.c?ATop", testLink.diagram.providers.TestLinkElementTypes.ATop_1000); //$NON-NLS-1$
		case testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://d.c?Two", testLink.diagram.providers.TestLinkElementTypes.Two_2003); //$NON-NLS-1$
		case testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://d.c?Three", testLink.diagram.providers.TestLinkElementTypes.Three_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = testLink.diagram.part.TestLinkDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& testLink.diagram.providers.TestLinkElementTypes
						.isKnownElementType(elementType)) {
			image = testLink.diagram.providers.TestLinkElementTypes
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
		if (element instanceof testLink.diagram.navigator.TestLinkNavigatorGroup) {
			testLink.diagram.navigator.TestLinkNavigatorGroup group = (testLink.diagram.navigator.TestLinkNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof testLink.diagram.navigator.TestLinkNavigatorItem) {
			testLink.diagram.navigator.TestLinkNavigatorItem navigatorItem = (testLink.diagram.navigator.TestLinkNavigatorItem) element;
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
		switch (testLink.diagram.part.TestLinkVisualIDRegistry
				.getVisualID(view)) {
		case testLink.diagram.edit.parts.OneEditPart.VISUAL_ID:
			return getOne_2001Text(view);
		case testLink.diagram.edit.parts.LinkEReference0EditPart.VISUAL_ID:
			return getLinkEReference0_4001Text(view);
		case testLink.diagram.edit.parts.ATopEditPart.VISUAL_ID:
			return getATop_1000Text(view);
		case testLink.diagram.edit.parts.TwoEditPart.VISUAL_ID:
			return getTwo_2003Text(view);
		case testLink.diagram.edit.parts.ThreeEditPart.VISUAL_ID:
			return getThree_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOne_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLinkEReference0_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getATop_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTwo_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getThree_2002Text(View view) {
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
		return testLink.diagram.edit.parts.ATopEditPart.MODEL_ID
				.equals(testLink.diagram.part.TestLinkVisualIDRegistry
						.getModelID(view));
	}

}
