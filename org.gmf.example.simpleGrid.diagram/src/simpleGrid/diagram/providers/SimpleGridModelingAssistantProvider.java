package simpleGrid.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class SimpleGridModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof simpleGrid.diagram.edit.parts.GridEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(11);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006);
			types.add(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			return ((simpleGrid.diagram.edit.parts.TransformerEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_meterEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.NodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.NodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_lineEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			return ((simpleGrid.diagram.edit.parts.HouseEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Transformer_configurationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			return ((simpleGrid.diagram.edit.parts.TransformerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_meterEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.WaterheaterEditPart) {
			return ((simpleGrid.diagram.edit.parts.WaterheaterEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_lineEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			return ((simpleGrid.diagram.edit.parts.HouseEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			return ((simpleGrid.diagram.edit.parts.TransformerEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_meterEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.NodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.NodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_lineEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			return ((simpleGrid.diagram.edit.parts.HouseEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Transformer_configurationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			return ((simpleGrid.diagram.edit.parts.TransformerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_meterEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.WaterheaterEditPart) {
			return ((simpleGrid.diagram.edit.parts.WaterheaterEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_lineEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			return ((simpleGrid.diagram.edit.parts.HouseEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_nodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.TransformerEditPart) {
			return ((simpleGrid.diagram.edit.parts.TransformerEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_meterEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_meterEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.NodeEditPart) {
			return ((simpleGrid.diagram.edit.parts.NodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.Triplex_lineEditPart) {
			return ((simpleGrid.diagram.edit.parts.Triplex_lineEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof simpleGrid.diagram.edit.parts.HouseEditPart) {
			return ((simpleGrid.diagram.edit.parts.HouseEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(simpleGrid.diagram.part.Messages.SimpleGridModelingAssistantProviderMessage);
		dialog.setTitle(simpleGrid.diagram.part.Messages.SimpleGridModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
