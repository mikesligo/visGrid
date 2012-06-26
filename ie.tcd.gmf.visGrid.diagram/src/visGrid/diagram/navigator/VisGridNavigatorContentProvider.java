package visGrid.diagram.navigator;

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
public class VisGridNavigatorContentProvider implements ICommonContentProvider {

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
	public VisGridNavigatorContentProvider() {
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
			ArrayList<visGrid.diagram.navigator.VisGridNavigatorItem> result = new ArrayList<visGrid.diagram.navigator.VisGridNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof visGrid.diagram.navigator.VisGridNavigatorGroup) {
			visGrid.diagram.navigator.VisGridNavigatorGroup group = (visGrid.diagram.navigator.VisGridNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof visGrid.diagram.navigator.VisGridNavigatorItem) {
			visGrid.diagram.navigator.VisGridNavigatorItem navigatorItem = (visGrid.diagram.navigator.VisGridNavigatorItem) parentElement;
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
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {

		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Volt_var_control_2067_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Volt_var_control_2067_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Occupantload_2065_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Occupantload_2065_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDiesel_dg_4136_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDiesel_dg_4136_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Diesel_dgConnection_4115_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Diesel_dgConnection_4115_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCollector_4087_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCollector_4087_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_GeneratorConnection_4099_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_GeneratorConnection_4099_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Waterheater_2068_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Waterheater_2068_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_OccupantloadConnection_4018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_OccupantloadConnection_4018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microturbine_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microturbine_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Battery_2069_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Battery_2069_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dryer_2060_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dryer_2060_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSeries_reactor_4058_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSeries_reactor_4058_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsVolt_var_control_4153_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsVolt_var_control_4153_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFault_check_4046_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFault_check_4046_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSolar_4068_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSolar_4068_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLink_4097_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLink_4097_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsHouse_a_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsHouse_a_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LinkConnection_4013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LinkConnection_4013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPqload_4060_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPqload_4060_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Diesel_dg_2079_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Diesel_dg_2079_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Generator_2075_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Generator_2075_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_2037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_2037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plugload_2031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plugload_2031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_conductor_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_conductor_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Weather_2044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Weather_2044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLights_4055_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLights_4055_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RestorationConnection_4077_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RestorationConnection_4077_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_SolarConnection_4025_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_SolarConnection_4025_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Windturb_dgConnection_4093_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Windturb_dgConnection_4093_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_DryerConnection_4047_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_DryerConnection_4047_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RangeConnection_4151_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RangeConnection_4151_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Solar_2026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Solar_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRegulator_configuration_4090_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRegulator_configuration_4090_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PlcConnection_4120_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PlcConnection_4120_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDc_dc_converter_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDc_dc_converter_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Comm_2056_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Comm_2056_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTransformer_configuration_4059_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTransformer_configuration_4059_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Recorder_2064_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Recorder_2064_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRegulator_4112_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRegulator_4112_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Connections_2077_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Connections_2077_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_spacingConnection_4125_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_spacingConnection_4125_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ClimateConnection_4015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ClimateConnection_4015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_configurationConnection_4011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_configurationConnection_4011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Series_reactor_2041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Series_reactor_2041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ZIPloadConnection_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ZIPloadConnection_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_configurationConnection_4126_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_configurationConnection_4126_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsResidential_enduse_4037_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsResidential_enduse_4037_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup links = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Grid_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSeries_reactorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSolarEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDiesel_dgEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsVolt_var_controlEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsBilldump_4066_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsBilldump_4066_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_aConnection_4044_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_aConnection_4044_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dc_dc_converterConnection_4074_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dc_dc_converterConnection_4074_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsOverhead_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOverhead_line_conductor_4150_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOverhead_line_conductor_4150_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_InverterConnection_4065_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_InverterConnection_4065_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_StubauctionConnection_4098_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_StubauctionConnection_4098_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Evcharger_2059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Evcharger_2059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_lineConnection_4039_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_lineConnection_4039_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFreezer_4079_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFreezer_4079_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsWeatherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsWeather_4145_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsWeather_4145_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRegulatorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLine_4122_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLine_4122_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RectifierConnection_4075_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RectifierConnection_4075_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMicrowave_4105_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMicrowave_4105_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Office_2054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Office_2054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.OfficeConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_OfficeConnection_4070_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_OfficeConnection_4070_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_conductor_2036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_conductor_2036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDryer_4094_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDryer_4094_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Voltdump_2046_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Voltdump_2046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductorConnection_4062_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductorConnection_4062_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_AuctionConnection_4138_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_AuctionConnection_4138_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fault_check_2063_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fault_check_2063_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFault_checkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsNode_4134_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsNode_4134_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsHistogram_4109_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsHistogram_4109_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsAuction_4028_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsAuction_4028_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Energy_storage_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Energy_storage_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsPlugloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPlugload_4104_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPlugload_4104_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsUnderground_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsUnderground_line_conductor_4014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsUnderground_line_conductor_4014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Node_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Node_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsNodeEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Residential_enduse_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Residential_enduse_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsResidential_enduseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.RegulatorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RegulatorConnection_4084_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RegulatorConnection_4084_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RelayConnection_4026_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RelayConnection_4026_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_lineConnection_4123_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_lineConnection_4123_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Pqload_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Pqload_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPqloadEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOverhead_line_4156_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOverhead_line_4156_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRestoration_4142_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRestoration_4142_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_node_2042_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_node_2042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_a_2038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_a_2038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHouse_aEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Energy_storageConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Energy_storageConnection_4042_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Energy_storageConnection_4042_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsCommEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsComm_4053_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsComm_4053_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller2_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller2_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Link_2032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Link_2032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLinkEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Restoration_2040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Restoration_2040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRestorationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CommConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CommConnection_4086_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CommConnection_4086_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Climate_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Climate_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_configuration_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_configuration_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRegulator_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Meter_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Meter_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Inverter_2045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Inverter_2045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRefrigerator_4030_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRefrigerator_4030_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPower_electronics_4061_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPower_electronics_4061_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Frequency_gen_2050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Frequency_gen_2050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_spacing_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_spacing_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMultizone_4100_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMultizone_4100_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsClimateEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsClimate_4010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsClimate_4010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCsv_reader_4064_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCsv_reader_4064_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_DishwasherConnection_4106_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_DishwasherConnection_4106_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Relay_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Relay_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Shaper_2074_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Shaper_2074_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configurationConnection_4111_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configurationConnection_4111_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Auction_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Auction_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsAuctionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Clotheswasher_2049_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Clotheswasher_2049_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capacitor_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capacitor_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsGeneratorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsGenerator_4076_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsGenerator_4076_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFuse_4052_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFuse_4052_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Player_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Player_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capbank_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capbank_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Underground_line_conductorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_conductorConnection_4128_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_conductorConnection_4128_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microwave_2055_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microwave_2055_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMicrowaveEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_FreezerConnection_4089_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_FreezerConnection_4089_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RefrigeratorConnection_4072_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RefrigeratorConnection_4072_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Csv_readerConnection_4027_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Csv_readerConnection_4027_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMotor_4143_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMotor_4143_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_line_conductor_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_line_conductor_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsHouse_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsHouse_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Underground_lineConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_lineConnection_4149_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_lineConnection_4149_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Histogram_2073_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Histogram_2073_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHistogramEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meterConnection_4133_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meterConnection_4133_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CapbankConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CapbankConnection_4016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CapbankConnection_4016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Frequency_genConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Frequency_genConnection_4082_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Frequency_genConnection_4082_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsController2EditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsController2_4092_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsController2_4092_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MotorConnection_4063_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MotorConnection_4063_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CollectorConnection_4113_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CollectorConnection_4113_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fuse_2066_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fuse_2066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFuseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsWaterheaterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsWaterheater_4114_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsWaterheater_4114_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsWindturb_dg_4102_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsWindturb_dg_4102_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_meter_4127_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_meter_4127_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsHouseEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Collector_2053_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Collector_2053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCollectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.PqloadConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PqloadConnection_4069_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PqloadConnection_4069_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Series_reactorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Series_reactorConnection_4132_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Series_reactorConnection_4132_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Regulator_configurationConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_configurationConnection_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_configurationConnection_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Csv_reader_2070_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Csv_reader_2070_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsCsv_readerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Load_2043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Load_2043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Switch_2071_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Switch_2071_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsClotheswasherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsClotheswasher_4050_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsClotheswasher_4050_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configuration_2057_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configuration_2057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTransformer_configurationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsLine_spacingEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLine_spacing_4051_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLine_spacing_4051_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_configuration_2028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_configuration_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_TransformerConnection_4040_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_TransformerConnection_4040_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_2034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_2034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsOverhead_lineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsShaperEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsShaper_4021_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsShaper_4021_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPlc_4022_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPlc_4022_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsOfficeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOffice_4023_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOffice_4023_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Multizone_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Multizone_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMultizoneEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_2030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_2030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LineConnection_4137_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LineConnection_4137_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MicroturbineConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MicroturbineConnection_4034_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MicroturbineConnection_4034_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsTriplex_nodeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_node_4083_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_node_4083_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsLoadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLoad_4140_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLoad_4140_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plc_2061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plc_2061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPlcEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Stubauction_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Stubauction_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meter_2052_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meter_2052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_meterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.WaterheaterConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_WaterheaterConnection_4019_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_WaterheaterConnection_4019_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Fault_checkConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fault_checkConnection_4049_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fault_checkConnection_4049_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsStubauctionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsStubauction_4017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsStubauction_4017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsCapacitorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCapacitor_4110_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCapacitor_4110_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsController_4057_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsController_4057_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsEnergy_storageEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsEnergy_storage_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsEnergy_storage_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ShaperConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ShaperConnection_4101_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ShaperConnection_4101_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Motor_2078_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Motor_2078_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsMotorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsTriplex_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_line_4095_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_line_4095_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.HistogramConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_HistogramConnection_4124_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_HistogramConnection_4124_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dc_dc_converter_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dc_dc_converter_2019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDc_dc_converterEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRectifier_4108_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRectifier_4108_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Windturb_dg_2051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Windturb_dg_2051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsWindturb_dgEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ZIPload_2062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ZIPload_2062_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsVoltdumpEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsVoltdump_4033_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsVoltdump_4033_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_2035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_2035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Power_electronicsConnection_4135_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Power_electronicsConnection_4135_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSubstation_4038_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSubstation_4038_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Range_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Range_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Substation_2048_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Substation_2048_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsSubstationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsRecorderEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRecorder_4081_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRecorder_4081_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlayerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PlayerConnection_4119_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PlayerConnection_4119_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Residential_enduseConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Residential_enduseConnection_4144_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Residential_enduseConnection_4144_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ControllerConnection_4085_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ControllerConnection_4085_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dishwasher_2072_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dishwasher_2072_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsFrequency_genEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFrequency_gen_4141_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsFrequency_gen_4141_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsRelayEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRelay_4155_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRelay_4155_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlugloadConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PlugloadConnection_4032_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_PlugloadConnection_4032_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsCapbankEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCapbank_4152_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsCapbank_4152_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductor_2047_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductor_2047_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_line_conductorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsZIPloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsZIPload_4107_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsZIPload_4107_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Overhead_line_conductorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_conductorConnection_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_conductorConnection_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsMicroturbineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMicroturbine_4043_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMicroturbine_4043_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsMeterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMeter_4091_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsMeter_4091_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Lights_2039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Lights_2039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLightsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CapacitorConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CapacitorConnection_4130_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_CapacitorConnection_4130_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SwitchConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_SwitchConnection_4012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_SwitchConnection_4012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Freezer_2058_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Freezer_2058_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsFreezerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ConnectionsOccupantloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOccupantload_4071_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsOccupantload_4071_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_nodeConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_nodeConnection_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_nodeConnection_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsBatteryEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsBattery_4148_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsBattery_4148_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.FuseConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_FuseConnection_4154_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_FuseConnection_4154_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.BatteryConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_BatteryConnection_4078_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_BatteryConnection_4078_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.WeatherConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_WeatherConnection_4041_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_WeatherConnection_4041_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.NodeConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_NodeConnection_4020_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_NodeConnection_4020_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsLineEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.LightsConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LightsConnection_4029_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LightsConnection_4029_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Controller2ConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller2Connection_4121_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller2Connection_4121_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RecorderConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RecorderConnection_4103_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_RecorderConnection_4103_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsControllerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.MultizoneConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MultizoneConnection_4056_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MultizoneConnection_4056_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Power_electronics_2033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Power_electronics_2033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsPower_electronicsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.HouseConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_HouseConnection_4073_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_HouseConnection_4073_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MeterConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MeterConnection_4024_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MeterConnection_4024_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsInverterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsInverter_4036_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsInverter_4036_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SubstationConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_SubstationConnection_4067_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_SubstationConnection_4067_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_line_configuration_4147_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTriplex_line_configuration_4147_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsUnderground_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsUnderground_line_4131_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsUnderground_line_4131_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Volt_var_controlConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Volt_var_controlConnection_4088_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Volt_var_controlConnection_4088_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.VoltdumpConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_VoltdumpConnection_4129_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_VoltdumpConnection_4129_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsSwitchEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSwitch_4116_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsSwitch_4116_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Refrigerator_2029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Refrigerator_2029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRefrigeratorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_BilldumpConnection_4035_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_BilldumpConnection_4035_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsLine_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLine_configuration_4045_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsLine_configuration_4045_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsTransformerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTransformer_4118_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsTransformer_4118_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsEvchargerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsEvcharger_4054_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsEvcharger_4054_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsRangeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRange_4080_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsRange_4080_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsDishwasherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDishwasher_4146_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsDishwasher_4146_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionsPlayerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPlayer_4048_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionsPlayer_4048_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ClotheswasherConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ClotheswasherConnection_4031_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ClotheswasherConnection_4031_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_configuration_2076_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_configuration_2076_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsTriplex_line_configurationEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Rectifier_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Rectifier_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsRectifierEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.EvchargerConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_EvchargerConnection_4096_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_EvchargerConnection_4096_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MicrowaveConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MicrowaveConnection_4139_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_MicrowaveConnection_4139_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Billdump_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Billdump_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsBilldumpEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LoadConnectionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LoadConnection_4117_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_LoadConnection_4117_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
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
		return visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(visGrid.diagram.part.VisGridVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<visGrid.diagram.navigator.VisGridNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<visGrid.diagram.navigator.VisGridNavigatorItem> result = new ArrayList<visGrid.diagram.navigator.VisGridNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new visGrid.diagram.navigator.VisGridNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof visGrid.diagram.navigator.VisGridAbstractNavigatorItem) {
			visGrid.diagram.navigator.VisGridAbstractNavigatorItem abstractNavigatorItem = (visGrid.diagram.navigator.VisGridAbstractNavigatorItem) element;
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