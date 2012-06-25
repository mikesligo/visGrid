package simpleGrid.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class SimpleGridNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public SimpleGridNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<simpleGrid.diagram.navigator.SimpleGridNavigatorItem> result = new ArrayList<simpleGrid.diagram.navigator.SimpleGridNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorGroup) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup group = (simpleGrid.diagram.navigator.SimpleGridNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorItem) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorItem navigatorItem = (simpleGrid.diagram.navigator.SimpleGridNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (simpleGrid.diagram.part.SimpleGridVisualIDRegistry
				.getVisualID(view)) {

		case simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Transformer_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Transformer_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_lineTriplex_line_configuration_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_lineTriplex_line_configuration_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_TransformerTriplex_node_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_TransformerTriplex_node_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_HouseWaterheater_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_HouseWaterheater_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_Line_configuration_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_Line_configuration_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_House_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_House_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configuration_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Waterheater_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_lineTriplex_meter_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_lineTriplex_meter_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_nodeTriplex_line_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_nodeTriplex_line_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.GridEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup links = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Grid_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.HouseWaterheaterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_Line_configurationTriplex_line_conductor_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_Line_configurationTriplex_line_conductor_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_Line_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineTriplex_line_configurationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_node_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_node_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_nodeTriplex_lineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerTriplex_nodeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.TransformerTransformer_configurationEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_TransformerTransformer_configuration_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_TransformerTransformer_configuration_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductor_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_Line_configurationTriplex_line_conductorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meter_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup incominglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meter_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_lineTriplex_meterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_NodeTransformer_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_NodeTransformer_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup outgoinglinks = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Node_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.NodeTransformerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case simpleGrid.diagram.edit.parts.Triplex_meterHouseEditPart.VISUAL_ID: {
			LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem> result = new LinkedList<simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup target = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meterHouse_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			simpleGrid.diagram.navigator.SimpleGridNavigatorGroup source = new simpleGrid.diagram.navigator.SimpleGridNavigatorGroup(
					simpleGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meterHouse_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					simpleGrid.diagram.part.SimpleGridVisualIDRegistry
							.getType(simpleGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return simpleGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(simpleGrid.diagram.part.SimpleGridVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<simpleGrid.diagram.navigator.SimpleGridNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<simpleGrid.diagram.navigator.SimpleGridNavigatorItem> result = new ArrayList<simpleGrid.diagram.navigator.SimpleGridNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new simpleGrid.diagram.navigator.SimpleGridNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem) {
			simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem abstractNavigatorItem = (simpleGrid.diagram.navigator.SimpleGridAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
