package testLink.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ATopItemSemanticEditPolicy extends
		testLink.diagram.edit.policies.TestLinkBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ATopItemSemanticEditPolicy() {
		super(testLink.diagram.providers.TestLinkElementTypes.ATop_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (testLink.diagram.providers.TestLinkElementTypes.One_2001 == req
				.getElementType()) {
			return getGEFWrapper(new testLink.diagram.edit.commands.OneCreateCommand(
					req));
		}
		if (testLink.diagram.providers.TestLinkElementTypes.Three_2002 == req
				.getElementType()) {
			return getGEFWrapper(new testLink.diagram.edit.commands.ThreeCreateCommand(
					req));
		}
		if (testLink.diagram.providers.TestLinkElementTypes.Two_2003 == req
				.getElementType()) {
			return getGEFWrapper(new testLink.diagram.edit.commands.TwoCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
