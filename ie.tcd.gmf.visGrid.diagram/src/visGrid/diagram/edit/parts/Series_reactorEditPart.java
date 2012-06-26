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
public class Series_reactorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2041;

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
	public Series_reactorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Series_reactorItemSemanticEditPolicy());
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
		return primaryShape = new Series_reactorFigure();
	}

	/**
	 * @generated
	 */
	public Series_reactorFigure getPrimaryShape() {
		return (Series_reactorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Series_reactorNameEditPart) {
			((visGrid.diagram.edit.parts.Series_reactorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureSeries_reactorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Series_reactorNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Series_reactorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Series_reactorConnection_4132) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSeries_reactor_4058) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Series_reactorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_A_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_A_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_A_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_B_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_B_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_B_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_C_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_C_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhase_C_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorRated_current_limitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSeries_reactorNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Series_reactorFigure() {

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

			fFigureSeries_reactorNameFigure = new WrappingLabel();
			fFigureSeries_reactorNameFigure.setText("<...>");

			this.add(fFigureSeries_reactorNameFigure);

			fFigureSeries_reactorPhase_A_impedanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_A_impedanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_A_impedanceFigure);

			fFigureSeries_reactorPhase_A_resistanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_A_resistanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_A_resistanceFigure);

			fFigureSeries_reactorPhase_A_reactanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_A_reactanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_A_reactanceFigure);

			fFigureSeries_reactorPhase_B_impedanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_B_impedanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_B_impedanceFigure);

			fFigureSeries_reactorPhase_B_resistanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_B_resistanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_B_resistanceFigure);

			fFigureSeries_reactorPhase_B_reactanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_B_reactanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_B_reactanceFigure);

			fFigureSeries_reactorPhase_C_impedanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_C_impedanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_C_impedanceFigure);

			fFigureSeries_reactorPhase_C_resistanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_C_resistanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_C_resistanceFigure);

			fFigureSeries_reactorPhase_C_reactanceFigure = new WrappingLabel();
			fFigureSeries_reactorPhase_C_reactanceFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhase_C_reactanceFigure);

			fFigureSeries_reactorRated_current_limitFigure = new WrappingLabel();
			fFigureSeries_reactorRated_current_limitFigure.setText("<...>");

			this.add(fFigureSeries_reactorRated_current_limitFigure);

			fFigureSeries_reactorStatusFigure = new WrappingLabel();
			fFigureSeries_reactorStatusFigure.setText("<...>");

			this.add(fFigureSeries_reactorStatusFigure);

			fFigureSeries_reactorFromFigure = new WrappingLabel();
			fFigureSeries_reactorFromFigure.setText("<...>");

			this.add(fFigureSeries_reactorFromFigure);

			fFigureSeries_reactorToFigure = new WrappingLabel();
			fFigureSeries_reactorToFigure.setText("<...>");

			this.add(fFigureSeries_reactorToFigure);

			fFigureSeries_reactorPower_inFigure = new WrappingLabel();
			fFigureSeries_reactorPower_inFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_inFigure);

			fFigureSeries_reactorPower_outFigure = new WrappingLabel();
			fFigureSeries_reactorPower_outFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_outFigure);

			fFigureSeries_reactorPower_lossesFigure = new WrappingLabel();
			fFigureSeries_reactorPower_lossesFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_lossesFigure);

			fFigureSeries_reactorPower_in_AFigure = new WrappingLabel();
			fFigureSeries_reactorPower_in_AFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_in_AFigure);

			fFigureSeries_reactorPower_in_BFigure = new WrappingLabel();
			fFigureSeries_reactorPower_in_BFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_in_BFigure);

			fFigureSeries_reactorPower_in_CFigure = new WrappingLabel();
			fFigureSeries_reactorPower_in_CFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_in_CFigure);

			fFigureSeries_reactorPower_out_AFigure = new WrappingLabel();
			fFigureSeries_reactorPower_out_AFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_out_AFigure);

			fFigureSeries_reactorPower_out_BFigure = new WrappingLabel();
			fFigureSeries_reactorPower_out_BFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_out_BFigure);

			fFigureSeries_reactorPower_out_CFigure = new WrappingLabel();
			fFigureSeries_reactorPower_out_CFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_out_CFigure);

			fFigureSeries_reactorPower_losses_AFigure = new WrappingLabel();
			fFigureSeries_reactorPower_losses_AFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_losses_AFigure);

			fFigureSeries_reactorPower_losses_BFigure = new WrappingLabel();
			fFigureSeries_reactorPower_losses_BFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_losses_BFigure);

			fFigureSeries_reactorPower_losses_CFigure = new WrappingLabel();
			fFigureSeries_reactorPower_losses_CFigure.setText("<...>");

			this.add(fFigureSeries_reactorPower_losses_CFigure);

			fFigureSeries_reactorFlow_directionFigure = new WrappingLabel();
			fFigureSeries_reactorFlow_directionFigure.setText("<...>");

			this.add(fFigureSeries_reactorFlow_directionFigure);

			fFigureSeries_reactorPhasesFigure = new WrappingLabel();
			fFigureSeries_reactorPhasesFigure.setText("<...>");

			this.add(fFigureSeries_reactorPhasesFigure);

			fFigureSeries_reactorNominal_voltageFigure = new WrappingLabel();
			fFigureSeries_reactorNominal_voltageFigure.setText("<...>");

			this.add(fFigureSeries_reactorNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorNameFigure() {
			return fFigureSeries_reactorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_A_impedanceFigure() {
			return fFigureSeries_reactorPhase_A_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_A_resistanceFigure() {
			return fFigureSeries_reactorPhase_A_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_A_reactanceFigure() {
			return fFigureSeries_reactorPhase_A_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_B_impedanceFigure() {
			return fFigureSeries_reactorPhase_B_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_B_resistanceFigure() {
			return fFigureSeries_reactorPhase_B_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_B_reactanceFigure() {
			return fFigureSeries_reactorPhase_B_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_C_impedanceFigure() {
			return fFigureSeries_reactorPhase_C_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_C_resistanceFigure() {
			return fFigureSeries_reactorPhase_C_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhase_C_reactanceFigure() {
			return fFigureSeries_reactorPhase_C_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorRated_current_limitFigure() {
			return fFigureSeries_reactorRated_current_limitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorStatusFigure() {
			return fFigureSeries_reactorStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorFromFigure() {
			return fFigureSeries_reactorFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorToFigure() {
			return fFigureSeries_reactorToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_inFigure() {
			return fFigureSeries_reactorPower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_outFigure() {
			return fFigureSeries_reactorPower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_lossesFigure() {
			return fFigureSeries_reactorPower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_in_AFigure() {
			return fFigureSeries_reactorPower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_in_BFigure() {
			return fFigureSeries_reactorPower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_in_CFigure() {
			return fFigureSeries_reactorPower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_out_AFigure() {
			return fFigureSeries_reactorPower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_out_BFigure() {
			return fFigureSeries_reactorPower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_out_CFigure() {
			return fFigureSeries_reactorPower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_losses_AFigure() {
			return fFigureSeries_reactorPower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_losses_BFigure() {
			return fFigureSeries_reactorPower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPower_losses_CFigure() {
			return fFigureSeries_reactorPower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorFlow_directionFigure() {
			return fFigureSeries_reactorFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorPhasesFigure() {
			return fFigureSeries_reactorPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSeries_reactorNominal_voltageFigure() {
			return fFigureSeries_reactorNominal_voltageFigure;
		}

	}

}
