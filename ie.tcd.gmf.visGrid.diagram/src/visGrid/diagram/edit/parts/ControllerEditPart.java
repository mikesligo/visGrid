package visGrid.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ControllerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ControllerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.ControllerItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ControllerFigure();
	}

	/**
	 * @generated
	 */
	public ControllerFigure getPrimaryShape() {
		return (ControllerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ControllerNameEditPart) {
			((visGrid.diagram.edit.parts.ControllerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureControllerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ControllerNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(visGrid.diagram.part.VisGridVisualIDRegistry
				.getType(visGrid.diagram.edit.parts.ControllerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ControllerConnection_4085) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsController_4057) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ControllerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerSimple_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerBid_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerRamp_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerRamp_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerTminFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerTmaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerTargetFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerSetpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerTotalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerMarketFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerBid_priceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerBid_quantFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerSet_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureControllerBase_setpointFigure;

		/**
		 * @generated
		 */
		public ControllerFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureControllerNameFigure = new WrappingLabel();
			fFigureControllerNameFigure.setText("<...>");

			this.add(fFigureControllerNameFigure);

			fFigureControllerSimple_modeFigure = new WrappingLabel();
			fFigureControllerSimple_modeFigure.setText("<...>");

			this.add(fFigureControllerSimple_modeFigure);

			fFigureControllerBid_modeFigure = new WrappingLabel();
			fFigureControllerBid_modeFigure.setText("<...>");

			this.add(fFigureControllerBid_modeFigure);

			fFigureControllerRamp_lowFigure = new WrappingLabel();
			fFigureControllerRamp_lowFigure.setText("<...>");

			this.add(fFigureControllerRamp_lowFigure);

			fFigureControllerRamp_highFigure = new WrappingLabel();
			fFigureControllerRamp_highFigure.setText("<...>");

			this.add(fFigureControllerRamp_highFigure);

			fFigureControllerTminFigure = new WrappingLabel();
			fFigureControllerTminFigure.setText("<...>");

			this.add(fFigureControllerTminFigure);

			fFigureControllerTmaxFigure = new WrappingLabel();
			fFigureControllerTmaxFigure.setText("<...>");

			this.add(fFigureControllerTmaxFigure);

			fFigureControllerTargetFigure = new WrappingLabel();
			fFigureControllerTargetFigure.setText("<...>");

			this.add(fFigureControllerTargetFigure);

			fFigureControllerSetpointFigure = new WrappingLabel();
			fFigureControllerSetpointFigure.setText("<...>");

			this.add(fFigureControllerSetpointFigure);

			fFigureControllerDemandFigure = new WrappingLabel();
			fFigureControllerDemandFigure.setText("<...>");

			this.add(fFigureControllerDemandFigure);

			fFigureControllerLoadFigure = new WrappingLabel();
			fFigureControllerLoadFigure.setText("<...>");

			this.add(fFigureControllerLoadFigure);

			fFigureControllerTotalFigure = new WrappingLabel();
			fFigureControllerTotalFigure.setText("<...>");

			this.add(fFigureControllerTotalFigure);

			fFigureControllerMarketFigure = new WrappingLabel();
			fFigureControllerMarketFigure.setText("<...>");

			this.add(fFigureControllerMarketFigure);

			fFigureControllerBid_priceFigure = new WrappingLabel();
			fFigureControllerBid_priceFigure.setText("<...>");

			this.add(fFigureControllerBid_priceFigure);

			fFigureControllerBid_quantFigure = new WrappingLabel();
			fFigureControllerBid_quantFigure.setText("<...>");

			this.add(fFigureControllerBid_quantFigure);

			fFigureControllerSet_tempFigure = new WrappingLabel();
			fFigureControllerSet_tempFigure.setText("<...>");

			this.add(fFigureControllerSet_tempFigure);

			fFigureControllerBase_setpointFigure = new WrappingLabel();
			fFigureControllerBase_setpointFigure.setText("<...>");

			this.add(fFigureControllerBase_setpointFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerNameFigure() {
			return fFigureControllerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerSimple_modeFigure() {
			return fFigureControllerSimple_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerBid_modeFigure() {
			return fFigureControllerBid_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerRamp_lowFigure() {
			return fFigureControllerRamp_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerRamp_highFigure() {
			return fFigureControllerRamp_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerTminFigure() {
			return fFigureControllerTminFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerTmaxFigure() {
			return fFigureControllerTmaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerTargetFigure() {
			return fFigureControllerTargetFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerSetpointFigure() {
			return fFigureControllerSetpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerDemandFigure() {
			return fFigureControllerDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerLoadFigure() {
			return fFigureControllerLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerTotalFigure() {
			return fFigureControllerTotalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerMarketFigure() {
			return fFigureControllerMarketFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerBid_priceFigure() {
			return fFigureControllerBid_priceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerBid_quantFigure() {
			return fFigureControllerBid_quantFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerSet_tempFigure() {
			return fFigureControllerSet_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureControllerBase_setpointFigure() {
			return fFigureControllerBase_setpointFigure;
		}

	}

}
