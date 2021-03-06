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

		case visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionConnections_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionConnections_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
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

		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microwave_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microwave_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_a_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_a_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Range_2043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Range_2043_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Solar_2051_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Solar_2051_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Office_2060_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Office_2060_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capbank_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capbank_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Weather_2044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Weather_2044_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.TimeEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
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
							.getType(visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Climate_2059_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Climate_2059_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Diesel_dg_2077_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Diesel_dg_2077_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Battery_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Battery_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Series_reactor_2032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Series_reactor_2032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Occupantload_2037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Occupantload_2037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dryer_2052_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dryer_2052_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
					visGrid.diagram.part.Messages.NavigatorGroupName_Substation_2067_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Substation_2067_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Generator_2072_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Generator_2072_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Histogram_2069_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Histogram_2069_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup target = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionParent_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup source = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ConnectionParent_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
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

		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Pqload_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Pqload_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller_2040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller_2040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Comm_2074_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Comm_2074_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Clotheswasher_2063_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Clotheswasher_2063_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Node_2054_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Node_2054_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Energy_storage_2076_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Energy_storage_2076_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductor_2064_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_conductor_2064_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Player_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Player_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Recorder_2046_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Recorder_2046_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plc_2073_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plc_2073_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Relay_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Relay_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microturbine_2038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Microturbine_2038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_House_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Lights_2056_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Lights_2056_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Freezer_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Freezer_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Csv_reader_2033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Csv_reader_2033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meter_2050_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_meter_2050_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Motor_2065_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Motor_2065_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configuration_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Transformer_configuration_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_configuration_2030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_line_configuration_2030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_conductor_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_conductor_2026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_spacing_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_spacing_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
					visGrid.diagram.part.Messages.NavigatorGroupName_Collector_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Collector_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Volt_var_control_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Volt_var_control_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_node_2042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Triplex_node_2042_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Meter_2049_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Meter_2049_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dishwasher_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dishwasher_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Refrigerator_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Refrigerator_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plugload_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Plugload_2019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Frequency_gen_2035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Frequency_gen_2035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Link_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Link_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Switch_2071_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Switch_2071_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Power_electronics_2061_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Power_electronics_2061_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Voltdump_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Voltdump_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_configuration_2053_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_configuration_2053_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller2_2029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Controller2_2029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Inverter_2058_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Inverter_2058_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ZIPload_2055_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_ZIPload_2055_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fault_check_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fault_check_2028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Evcharger_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Evcharger_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_2041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Underground_line_2041_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Auction_2047_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Auction_2047_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_conductor_2039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_conductor_2039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Residential_enduse_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Residential_enduse_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capacitor_2045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Capacitor_2045_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
					visGrid.diagram.part.Messages.NavigatorGroupName_Stubauction_2048_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Stubauction_2048_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_2034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Line_2034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Windturb_dg_2078_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Windturb_dg_2078_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fuse_2057_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Fuse_2057_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Multizone_2066_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Multizone_2066_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dc_dc_converter_2068_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Dc_dc_converter_2068_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_2031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_2031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Waterheater_2062_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Waterheater_2062_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_2036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Overhead_line_2036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Billdump_2070_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Billdump_2070_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Shaper_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Shaper_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_configuration_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Regulator_configuration_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Load_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Load_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Rectifier_2075_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Rectifier_2075_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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

		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID: {
			LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem> result = new LinkedList<visGrid.diagram.navigator.VisGridAbstractNavigatorItem>();
			Node sv = (Node) view;
			visGrid.diagram.navigator.VisGridNavigatorGroup incominglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Restoration_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			visGrid.diagram.navigator.VisGridNavigatorGroup outgoinglinks = new visGrid.diagram.navigator.VisGridNavigatorGroup(
					visGrid.diagram.part.Messages.NavigatorGroupName_Restoration_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionParentEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(visGrid.diagram.edit.parts.ConnectionConnectionsEditPart.VISUAL_ID));
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
