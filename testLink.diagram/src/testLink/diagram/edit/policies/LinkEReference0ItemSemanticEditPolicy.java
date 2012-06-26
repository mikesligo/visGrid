package testLink.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class LinkEReference0ItemSemanticEditPolicy extends
		testLink.diagram.edit.policies.TestLinkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinkEReference0ItemSemanticEditPolicy() {
		super(
				testLink.diagram.providers.TestLinkElementTypes.LinkEReference0_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
