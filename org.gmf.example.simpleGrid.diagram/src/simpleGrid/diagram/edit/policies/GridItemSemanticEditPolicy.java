package simpleGrid.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class GridItemSemanticEditPolicy extends
		simpleGrid.diagram.edit.policies.SimpleGridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GridItemSemanticEditPolicy() {
		super(simpleGrid.diagram.providers.SimpleGridElementTypes.Grid_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.Transformer_configurationCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.ClimateCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.Triplex_nodeCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.TransformerCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.Triplex_meterCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.NodeCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.WaterheaterCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.Triplex_Line_configurationCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_conductor_2008 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.Triplex_line_conductorCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.Triplex_lineCreateCommand(
					req));
		}
		if (simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011 == req
				.getElementType()) {
			return getGEFWrapper(new simpleGrid.diagram.edit.commands.HouseCreateCommand(
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
