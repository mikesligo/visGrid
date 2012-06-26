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
public class Triplex_lineEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2030;

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
	public Triplex_lineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Triplex_lineItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_lineFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_lineFigure getPrimaryShape() {
		return (Triplex_lineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineNameEditPart) {
			((visGrid.diagram.edit.parts.Triplex_lineNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTriplex_lineNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Triplex_lineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_lineConnection_4039) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_4095) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Triplex_lineFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineLengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_linePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_lineNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Triplex_lineFigure() {

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

			fFigureTriplex_lineNameFigure = new WrappingLabel();
			fFigureTriplex_lineNameFigure.setText("<...>");

			this.add(fFigureTriplex_lineNameFigure);

			fFigureTriplex_lineConfigurationFigure = new WrappingLabel();
			fFigureTriplex_lineConfigurationFigure.setText("<...>");

			this.add(fFigureTriplex_lineConfigurationFigure);

			fFigureTriplex_lineLengthFigure = new WrappingLabel();
			fFigureTriplex_lineLengthFigure.setText("<...>");

			this.add(fFigureTriplex_lineLengthFigure);

			fFigureTriplex_lineStatusFigure = new WrappingLabel();
			fFigureTriplex_lineStatusFigure.setText("<...>");

			this.add(fFigureTriplex_lineStatusFigure);

			fFigureTriplex_lineFromFigure = new WrappingLabel();
			fFigureTriplex_lineFromFigure.setText("<...>");

			this.add(fFigureTriplex_lineFromFigure);

			fFigureTriplex_lineToFigure = new WrappingLabel();
			fFigureTriplex_lineToFigure.setText("<...>");

			this.add(fFigureTriplex_lineToFigure);

			fFigureTriplex_linePower_inFigure = new WrappingLabel();
			fFigureTriplex_linePower_inFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_inFigure);

			fFigureTriplex_linePower_outFigure = new WrappingLabel();
			fFigureTriplex_linePower_outFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_outFigure);

			fFigureTriplex_linePower_lossesFigure = new WrappingLabel();
			fFigureTriplex_linePower_lossesFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_lossesFigure);

			fFigureTriplex_linePower_in_AFigure = new WrappingLabel();
			fFigureTriplex_linePower_in_AFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_in_AFigure);

			fFigureTriplex_linePower_in_BFigure = new WrappingLabel();
			fFigureTriplex_linePower_in_BFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_in_BFigure);

			fFigureTriplex_linePower_in_CFigure = new WrappingLabel();
			fFigureTriplex_linePower_in_CFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_in_CFigure);

			fFigureTriplex_linePower_out_AFigure = new WrappingLabel();
			fFigureTriplex_linePower_out_AFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_out_AFigure);

			fFigureTriplex_linePower_out_BFigure = new WrappingLabel();
			fFigureTriplex_linePower_out_BFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_out_BFigure);

			fFigureTriplex_linePower_out_CFigure = new WrappingLabel();
			fFigureTriplex_linePower_out_CFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_out_CFigure);

			fFigureTriplex_linePower_losses_AFigure = new WrappingLabel();
			fFigureTriplex_linePower_losses_AFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_losses_AFigure);

			fFigureTriplex_linePower_losses_BFigure = new WrappingLabel();
			fFigureTriplex_linePower_losses_BFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_losses_BFigure);

			fFigureTriplex_linePower_losses_CFigure = new WrappingLabel();
			fFigureTriplex_linePower_losses_CFigure.setText("<...>");

			this.add(fFigureTriplex_linePower_losses_CFigure);

			fFigureTriplex_lineFlow_directionFigure = new WrappingLabel();
			fFigureTriplex_lineFlow_directionFigure.setText("<...>");

			this.add(fFigureTriplex_lineFlow_directionFigure);

			fFigureTriplex_linePhasesFigure = new WrappingLabel();
			fFigureTriplex_linePhasesFigure.setText("<...>");

			this.add(fFigureTriplex_linePhasesFigure);

			fFigureTriplex_lineNominal_voltageFigure = new WrappingLabel();
			fFigureTriplex_lineNominal_voltageFigure.setText("<...>");

			this.add(fFigureTriplex_lineNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineNameFigure() {
			return fFigureTriplex_lineNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineConfigurationFigure() {
			return fFigureTriplex_lineConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineLengthFigure() {
			return fFigureTriplex_lineLengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineStatusFigure() {
			return fFigureTriplex_lineStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineFromFigure() {
			return fFigureTriplex_lineFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineToFigure() {
			return fFigureTriplex_lineToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_inFigure() {
			return fFigureTriplex_linePower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_outFigure() {
			return fFigureTriplex_linePower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_lossesFigure() {
			return fFigureTriplex_linePower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_in_AFigure() {
			return fFigureTriplex_linePower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_in_BFigure() {
			return fFigureTriplex_linePower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_in_CFigure() {
			return fFigureTriplex_linePower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_out_AFigure() {
			return fFigureTriplex_linePower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_out_BFigure() {
			return fFigureTriplex_linePower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_out_CFigure() {
			return fFigureTriplex_linePower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_losses_AFigure() {
			return fFigureTriplex_linePower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_losses_BFigure() {
			return fFigureTriplex_linePower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePower_losses_CFigure() {
			return fFigureTriplex_linePower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineFlow_directionFigure() {
			return fFigureTriplex_lineFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_linePhasesFigure() {
			return fFigureTriplex_linePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_lineNominal_voltageFigure() {
			return fFigureTriplex_lineNominal_voltageFigure;
		}

	}

}
