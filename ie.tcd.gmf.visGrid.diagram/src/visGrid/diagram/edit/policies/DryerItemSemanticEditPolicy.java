package visGrid.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DryerItemSemanticEditPolicy extends
		visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DryerItemSemanticEditPolicy() {
		super(visGrid.diagram.providers.VisGridElementTypes.Dryer_2060);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(incomingLink) == visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (visGrid.diagram.part.VisGridVisualIDRegistry
					.getVisualID(outgoingLink) == visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.DryerConnectionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (visGrid.diagram.providers.VisGridElementTypes.DryerConnection_4047 == req
				.getElementType()) {
			return null;
		}
		if (visGrid.diagram.providers.VisGridElementTypes.ConnectionsDryer_4094 == req
				.getElementType()) {
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDryerCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case visGrid.diagram.edit.parts.DryerConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.DryerConnectionReorientCommand(
					req));
		case visGrid.diagram.edit.parts.ConnectionsDryerEditPart.VISUAL_ID:
			return getGEFWrapper(new visGrid.diagram.edit.commands.ConnectionsDryerReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}