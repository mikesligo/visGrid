package simpleGrid.diagram.navigator;

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
public class SimpleGridNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorItem
				&& !isOwnView(((simpleGrid.diagram.navigator.SimpleGridNavigatorItem) element)
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
		if (element instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorGroup) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup group = (simpleGrid.diagram.navigator.SimpleGridNavigatorGroup) element;
			return simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorItem) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorItem navigatorItem = (simpleGrid.diagram.navigator.SimpleGridNavigatorItem) element;
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
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {
		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Transformer", simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_line?triplex_line_configuration", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_line_configuration_4011); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Transformer?triplex_node", simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?House?waterheater", simpleGrid.diagram.providers.SimpleGridElementTypes.HouseWaterheater_4017); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_Line_configuration", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?House", simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Transformer_configuration", simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Waterheater", simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_line?triplex_meter", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_lineTriplex_meter_4007); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_node?triplex_line", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tcd.ie?Grid", simpleGrid.diagram.providers.SimpleGridElementTypes.Grid_1000); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_Line_configuration?triplex_line_conductor", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configurationTriplex_line_conductor_4008); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_node", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Transformer?transformer_configuration", simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTransformer_configuration_4006); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_line_conductor", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Triplex_meter", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Node?transformer", simpleGrid.diagram.providers.SimpleGridElementTypes.NodeTransformer_4014); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Node", simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tcd.ie?Climate", simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009); //$NON-NLS-1$
		case simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tcd.ie?Triplex_meter?house", simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& simpleGrid.diagram.providers.SimpleGridElementTypes
						.isKnownElementType(elementType)) {
			image = simpleGrid.diagram.providers.SimpleGridElementTypes
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
		if (element instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorGroup) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup group = (simpleGrid.diagram.navigator.SimpleGridNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorItem) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorItem navigatorItem = (simpleGrid.diagram.navigator.SimpleGridNavigatorItem) element;
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
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {
		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
			return getTransformer_2010Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID:
			return getTriplex_lineTriplex_line_configuration_4011Text(view);
		case simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID:
			return getTransformerTriplex_node_4013Text(view);
		case simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID:
			return getHouseWaterheater_4017Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID:
			return getTriplex_Line_configuration_2001Text(view);
		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
			return getHouse_2011Text(view);
		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
			return getTransformer_configuration_2004Text(view);
		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
			return getWaterheater_2003Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID:
			return getTriplex_lineTriplex_meter_4007Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID:
			return getTriplex_nodeTriplex_line_4005Text(view);
		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID:
			return getGrid_1000Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_Line_configurationTriplex_line_conductor_4008Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
			return getTriplex_line_2006Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
			return getTriplex_node_2002Text(view);
		case simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID:
			return getTransformerTransformer_configuration_4006Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
			return getTriplex_line_conductor_2008Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
			return getTriplex_meter_2005Text(view);
		case simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID:
			return getNodeTransformer_4014Text(view);
		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
			return getNode_2007Text(view);
		case simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
			return getClimate_2009Text(view);
		case simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID:
			return getTriplex_meterHouse_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTransformer_2010Text(View view) {
		simpleGrid.Transformer domainModelElement = (simpleGrid.Transformer) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_lineTriplex_line_configuration_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTransformerTriplex_node_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getHouseWaterheater_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_Line_configuration_2001Text(View view) {
		simpleGrid.Triplex_Line_configuration domainModelElement = (simpleGrid.Triplex_Line_configuration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHouse_2011Text(View view) {
		simpleGrid.House domainModelElement = (simpleGrid.House) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformer_configuration_2004Text(View view) {
		simpleGrid.Transformer_configuration domainModelElement = (simpleGrid.Transformer_configuration) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWaterheater_2003Text(View view) {
		simpleGrid.Waterheater domainModelElement = (simpleGrid.Waterheater) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_lineTriplex_meter_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_nodeTriplex_line_4005Text(View view) {
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
	private String getTriplex_Line_configurationTriplex_line_conductor_4008Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_2006Text(View view) {
		simpleGrid.Triplex_line domainModelElement = (simpleGrid.Triplex_line) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_node_2002Text(View view) {
		simpleGrid.Triplex_node domainModelElement = (simpleGrid.Triplex_node) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransformerTransformer_configuration_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTriplex_line_conductor_2008Text(View view) {
		simpleGrid.Triplex_line_conductor domainModelElement = (simpleGrid.Triplex_line_conductor) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getResistance();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_meter_2005Text(View view) {
		simpleGrid.Triplex_meter domainModelElement = (simpleGrid.Triplex_meter) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNodeTransformer_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getNode_2007Text(View view) {
		simpleGrid.Node domainModelElement = (simpleGrid.Node) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClimate_2009Text(View view) {
		simpleGrid.Climate domainModelElement = (simpleGrid.Climate) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTriplex_meterHouse_4001Text(View view) {
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
		return simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(simpleGrid.diagram.part.SimpleGridVisualIDRegistry
						.getModelID(view));
	}

}
