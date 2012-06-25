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
public class TransformerTransformer_configurationReorientCommand extends
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
	public TransformerTransformer_configurationReorientCommand(
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
		if (false == referenceOwner instanceof simpleGrid.Transformer) {
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
		if (!(oldEnd instanceof simpleGrid.Transformer_configuration && newEnd instanceof simpleGrid.Transformer)) {
			return false;
		}
		return simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistTransformerTransformer_configuration_4006(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof simpleGrid.Transformer_configuration && newEnd instanceof simpleGrid.Transformer_configuration)) {
			return false;
		}
		return simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistTransformerTransformer_configuration_4006(
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
		getOldSource().getTransformer_configuration().remove(getOldTarget());
		getNewSource().getTransformer_configuration().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getTransformer_configuration().remove(getOldTarget());
		getOldSource().getTransformer_configuration().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Transformer getOldSource() {
		return (simpleGrid.Transformer) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Transformer getNewSource() {
		return (simpleGrid.Transformer) newEnd;
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Transformer_configuration getOldTarget() {
		return (simpleGrid.Transformer_configuration) oldEnd;
	}

	/**
	 * @generated
	 */
	protected simpleGrid.Transformer_configuration getNewTarget() {
		return (simpleGrid.Transformer_configuration) newEnd;
	}
}
