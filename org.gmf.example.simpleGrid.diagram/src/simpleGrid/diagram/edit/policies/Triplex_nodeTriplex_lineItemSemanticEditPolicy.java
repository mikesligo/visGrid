package simpleGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class Triplex_nodeTriplex_lineItemSemanticEditPolicy extends
		simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Triplex_nodeTriplex_lineItemSemanticEditPolicy() {
		super(
				simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_nodeTriplex_line_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
