package simpleGrid.diagram.edit.commands;

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
public class Triplex_lineTriplex_meterReorientCommand extends
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
	public Triplex_lineTriplex_meterReorientCommand(
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
		if (false == referenceOwner instanceof simpleGrid.Triplex_line) {
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
		if (!(oldEnd instanceof simpleGrid.Triplex_meter && newEnd instanceof simpleGrid.Triplex_line)) {
			return false;
		}
		return simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistTriplex_lineTriplex_meter_4007(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof simpleGrid.Triplex_meter && newEnd instanceof simpleGrid.Triplex_meter)) {
			return false;
		}
		return simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistTriplex_lineTriplex_meter_4007(
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
		getOldSource().getTriplex_meter().remove(getOldTarget());
		getNewSource().getTriplex_meter().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getTriplex_meter().remove(getOldTarget());
		getOldSource().getTriplex_meter().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Triplex_line getOldSource() {
		return (simpleGrid.Triplex_line) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Triplex_line getNewSource() {
		return (simpleGrid.Triplex_line) newEnd;
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Triplex_meter getOldTarget() {
		return (simpleGrid.Triplex_meter) oldEnd;
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Triplex_meter getNewTarget() {
		return (simpleGrid.Triplex_meter) newEnd;
	}
}
