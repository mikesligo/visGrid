package visGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ConnectionsHouseItemSemanticEditPolicy extends
		visGrid.diagram.edit.policies.VisGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectionsHouseItemSemanticEditPolicy() {
		super(
				visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
