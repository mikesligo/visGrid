package visGrid.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionsUnderground_line_conductorReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ConnectionsUnderground_line_conductorReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof visGrid.Connections) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof visGrid.Underground_line_conductor && newEnd instanceof visGrid.Connections)) {
			return false;
		}
		return visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnectionsUnderground_line_conductor_4014(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof visGrid.Underground_line_conductor && newEnd instanceof visGrid.Underground_line_conductor)) {
			return false;
		}
		return visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistConnectionsUnderground_line_conductor_4014(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getUnderground_line_conductor().remove(getOldTarget());
		getNewSource().getUnderground_line_conductor().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getUnderground_line_conductor().remove(getOldTarget());
		getOldSource().getUnderground_line_conductor().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected visGrid.Connections getOldSource() {
		return (visGrid.Connections) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected visGrid.Connections getNewSource() {
		return (visGrid.Connections) newEnd;
	}

	/**
	 * @generated
	 */
	protected visGrid.Underground_line_conductor getOldTarget() {
		return (visGrid.Underground_line_conductor) oldEnd;
	}

	/**
	 * @generated
	 */
	protected visGrid.Underground_line_conductor getNewTarget() {
		return (visGrid.Underground_line_conductor) newEnd;
	}
}
