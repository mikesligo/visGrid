package simpleGrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class Triplex_meterHouseItemSemanticEditPolicy extends
		simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Triplex_meterHouseItemSemanticEditPolicy() {
		super(
				simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meterHouse_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
