package simpleGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class TransformerTriplex_nodeItemSemanticEditPolicy extends
		simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransformerTriplex_nodeItemSemanticEditPolicy() {
		super(
				simpleGrid.diagram.providers.SimpleGridElementTypes.TransformerTriplex_node_4013);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
