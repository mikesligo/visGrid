package visGrid.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GridCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Climate());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Meter());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Line_spacing());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Overhead_line_conductor());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Regulator());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Controller());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Node());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Rectifier());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Relay());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Regulator_configuration());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Pqload());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_House());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Residential_enduse());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Energy_storage());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Controller2());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Billdump());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Capbank());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Player());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Dc_dc_converter());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Stubauction());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Line());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Range());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Capacitor());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Microturbine());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Auction());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Solar());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Multizone());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Line_configuration());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Refrigerator());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Triplex_line());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Plugload());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Link());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Power_electronics());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Overhead_line());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Transformer());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Underground_line_conductor());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Underground_line());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_House_a());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Lights());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Restoration());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Series_reactor());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Triplex_node());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Load());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Weather());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Inverter());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Voltdump());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Triplex_line_conductor());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Substation());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Clotheswasher());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Frequency_gen());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Windturb_dg());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Triplex_meter());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Collector());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Office());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Microwave());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Comm());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Transformer_configuration());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Freezer());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Evcharger());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Dryer());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Plc());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_ZIPload());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Fault_check());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Recorder());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Occupantload());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Fuse());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Volt_var_control());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Waterheater());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Battery());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Csv_reader());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Switch());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Dishwasher());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Histogram());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Shaper());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Generator());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Triplex_line_configuration());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Connection());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Motor());
			myFeaturesToSynchronize.add(visGrid.VisGridPackage.eINSTANCE
					.getGrid_Diesel_dg());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<visGrid.diagram.part.VisGridNodeDescriptor> childDescriptors = visGrid.diagram.part.VisGridDiagramUpdater
				.getGrid_1000SemanticChildren(viewObject);
		for (visGrid.diagram.part.VisGridNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren,
			final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = visGrid.diagram.part.VisGridVisualIDRegistry
				.getVisualID(view);
		switch (visualID) {
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID:
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<visGrid.diagram.part.VisGridNodeDescriptor> childDescriptors = visGrid.diagram.part.VisGridDiagramUpdater
				.getGrid_1000SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<visGrid.diagram.part.VisGridNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			visGrid.diagram.part.VisGridNodeDescriptor next = descriptorsIterator
					.next();
			String hint = visGrid.diagram.part.VisGridVisualIDRegistry
					.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (visGrid.diagram.part.VisGridNodeDescriptor next : childDescriptors) {
			String hint = visGrid.diagram.part.VisGridVisualIDRegistry
					.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(
					new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> refreshConnections() {
		Map<EObject, View> domain2NotationMap = new HashMap<EObject, View>();
		Collection<visGrid.diagram.part.VisGridLinkDescriptor> linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator<visGrid.diagram.part.VisGridLinkDescriptor> linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				visGrid.diagram.part.VisGridLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection<visGrid.diagram.part.VisGridLinkDescriptor> collectAllLinks(
			View view, Map<EObject, View> domain2NotationMap) {
		if (!visGrid.diagram.edit.parts.GridEditPart.MODEL_ID
				.equals(visGrid.diagram.part.VisGridVisualIDRegistry
						.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<visGrid.diagram.part.VisGridLinkDescriptor> result = new LinkedList<visGrid.diagram.part.VisGridLinkDescriptor>();
		switch (visGrid.diagram.part.VisGridVisualIDRegistry.getVisualID(view)) {
		case visGrid.diagram.edit.parts.GridEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getGrid_1000ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.ClimateEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getClimate_2001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.MeterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getMeter_2002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Line_spacingEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getLine_spacing_2003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Overhead_line_conductorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getOverhead_line_conductor_2004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RegulatorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRegulator_2005ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.ControllerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getController_2006ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.NodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getNode_2007ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RectifierEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRectifier_2008ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RelayEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRelay_2009ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Regulator_configurationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRegulator_configuration_2010ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.PqloadEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getPqload_2011ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.HouseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getHouse_2012ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Residential_enduseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getResidential_enduse_2013ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Energy_storageEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getEnergy_storage_2014ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Controller2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getController2_2015ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.BilldumpEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getBilldump_2016ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.CapbankEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getCapbank_2017ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.PlayerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getPlayer_2018ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Dc_dc_converterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getDc_dc_converter_2019ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.StubauctionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getStubauction_2020ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.LineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getLine_2021ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RangeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRange_2022ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.CapacitorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getCapacitor_2023ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.MicroturbineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getMicroturbine_2024ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.AuctionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getAuction_2025ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.SolarEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getSolar_2026ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.MultizoneEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getMultizone_2027ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Line_configurationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getLine_configuration_2028ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RefrigeratorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRefrigerator_2029ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Triplex_lineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTriplex_line_2030ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.PlugloadEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getPlugload_2031ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.LinkEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getLink_2032ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Power_electronicsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getPower_electronics_2033ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Overhead_lineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getOverhead_line_2034ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.TransformerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTransformer_2035ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Underground_line_conductorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getUnderground_line_conductor_2036ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Underground_lineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getUnderground_line_2037ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.House_aEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getHouse_a_2038ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.LightsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getLights_2039ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RestorationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRestoration_2040ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Series_reactorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getSeries_reactor_2041ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Triplex_nodeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTriplex_node_2042ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.LoadEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getLoad_2043ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.WeatherEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getWeather_2044ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.InverterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getInverter_2045ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.VoltdumpEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getVoltdump_2046ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Triplex_line_conductorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTriplex_line_conductor_2047ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.SubstationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getSubstation_2048ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.ClotheswasherEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getClotheswasher_2049ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Frequency_genEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getFrequency_gen_2050ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Windturb_dgEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getWindturb_dg_2051ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Triplex_meterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTriplex_meter_2052ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.CollectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getCollector_2053ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.OfficeEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getOffice_2054ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.MicrowaveEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getMicrowave_2055ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.CommEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getComm_2056ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Transformer_configurationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTransformer_configuration_2057ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.FreezerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getFreezer_2058ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.EvchargerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getEvcharger_2059ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.DryerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getDryer_2060ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.PlcEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getPlc_2061ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.ZIPloadEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getZIPload_2062ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Fault_checkEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getFault_check_2063ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.RecorderEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getRecorder_2064ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.OccupantloadEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getOccupantload_2065ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.FuseEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getFuse_2066ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Volt_var_controlEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getVolt_var_control_2067ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.WaterheaterEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getWaterheater_2068ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.BatteryEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getBattery_2069ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Csv_readerEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getCsv_reader_2070ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.SwitchEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getSwitch_2071ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.DishwasherEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getDishwasher_2072ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.HistogramEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getHistogram_2073ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.ShaperEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getShaper_2074ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.GeneratorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getGenerator_2075ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Triplex_line_configurationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getTriplex_line_configuration_2076ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.ConnectionsEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getConnections_2077ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.MotorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getMotor_2078ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case visGrid.diagram.edit.parts.Diesel_dgEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(visGrid.diagram.part.VisGridDiagramUpdater
						.getDiesel_dg_2079ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> createConnections(
			Collection<visGrid.diagram.part.VisGridLinkDescriptor> linkDescriptors,
			Map<EObject, View> domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (visGrid.diagram.part.VisGridLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getEditPart(
					nextLinkDescriptor.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(
					nextLinkDescriptor.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					visGrid.diagram.part.VisGridVisualIDRegistry
							.getType(nextLinkDescriptor.getVisualID()),
					ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map<EObject, View> domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry()
					.get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}
}
