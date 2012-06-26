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
public class Overhead_lineEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2034;

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
	public Overhead_lineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Overhead_lineItemSemanticEditPolicy());
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
		return primaryShape = new Overhead_lineFigure();
	}

	/**
	 * @generated
	 */
	public Overhead_lineFigure getPrimaryShape() {
		return (Overhead_lineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineNameEditPart) {
			((visGrid.diagram.edit.parts.Overhead_lineNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOverhead_lineNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Overhead_lineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Overhead_lineConnection_4123) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsOverhead_line_4156) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Overhead_lineFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineLengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_linePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOverhead_lineNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Overhead_lineFigure() {

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

			fFigureOverhead_lineNameFigure = new WrappingLabel();
			fFigureOverhead_lineNameFigure.setText("<...>");

			this.add(fFigureOverhead_lineNameFigure);

			fFigureOverhead_lineConfigurationFigure = new WrappingLabel();
			fFigureOverhead_lineConfigurationFigure.setText("<...>");

			this.add(fFigureOverhead_lineConfigurationFigure);

			fFigureOverhead_lineLengthFigure = new WrappingLabel();
			fFigureOverhead_lineLengthFigure.setText("<...>");

			this.add(fFigureOverhead_lineLengthFigure);

			fFigureOverhead_lineStatusFigure = new WrappingLabel();
			fFigureOverhead_lineStatusFigure.setText("<...>");

			this.add(fFigureOverhead_lineStatusFigure);

			fFigureOverhead_lineFromFigure = new WrappingLabel();
			fFigureOverhead_lineFromFigure.setText("<...>");

			this.add(fFigureOverhead_lineFromFigure);

			fFigureOverhead_lineToFigure = new WrappingLabel();
			fFigureOverhead_lineToFigure.setText("<...>");

			this.add(fFigureOverhead_lineToFigure);

			fFigureOverhead_linePower_inFigure = new WrappingLabel();
			fFigureOverhead_linePower_inFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_inFigure);

			fFigureOverhead_linePower_outFigure = new WrappingLabel();
			fFigureOverhead_linePower_outFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_outFigure);

			fFigureOverhead_linePower_lossesFigure = new WrappingLabel();
			fFigureOverhead_linePower_lossesFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_lossesFigure);

			fFigureOverhead_linePower_in_AFigure = new WrappingLabel();
			fFigureOverhead_linePower_in_AFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_in_AFigure);

			fFigureOverhead_linePower_in_BFigure = new WrappingLabel();
			fFigureOverhead_linePower_in_BFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_in_BFigure);

			fFigureOverhead_linePower_in_CFigure = new WrappingLabel();
			fFigureOverhead_linePower_in_CFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_in_CFigure);

			fFigureOverhead_linePower_out_AFigure = new WrappingLabel();
			fFigureOverhead_linePower_out_AFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_out_AFigure);

			fFigureOverhead_linePower_out_BFigure = new WrappingLabel();
			fFigureOverhead_linePower_out_BFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_out_BFigure);

			fFigureOverhead_linePower_out_CFigure = new WrappingLabel();
			fFigureOverhead_linePower_out_CFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_out_CFigure);

			fFigureOverhead_linePower_losses_AFigure = new WrappingLabel();
			fFigureOverhead_linePower_losses_AFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_losses_AFigure);

			fFigureOverhead_linePower_losses_BFigure = new WrappingLabel();
			fFigureOverhead_linePower_losses_BFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_losses_BFigure);

			fFigureOverhead_linePower_losses_CFigure = new WrappingLabel();
			fFigureOverhead_linePower_losses_CFigure.setText("<...>");

			this.add(fFigureOverhead_linePower_losses_CFigure);

			fFigureOverhead_lineFlow_directionFigure = new WrappingLabel();
			fFigureOverhead_lineFlow_directionFigure.setText("<...>");

			this.add(fFigureOverhead_lineFlow_directionFigure);

			fFigureOverhead_linePhasesFigure = new WrappingLabel();
			fFigureOverhead_linePhasesFigure.setText("<...>");

			this.add(fFigureOverhead_linePhasesFigure);

			fFigureOverhead_lineNominal_voltageFigure = new WrappingLabel();
			fFigureOverhead_lineNominal_voltageFigure.setText("<...>");

			this.add(fFigureOverhead_lineNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineNameFigure() {
			return fFigureOverhead_lineNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineConfigurationFigure() {
			return fFigureOverhead_lineConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineLengthFigure() {
			return fFigureOverhead_lineLengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineStatusFigure() {
			return fFigureOverhead_lineStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineFromFigure() {
			return fFigureOverhead_lineFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineToFigure() {
			return fFigureOverhead_lineToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_inFigure() {
			return fFigureOverhead_linePower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_outFigure() {
			return fFigureOverhead_linePower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_lossesFigure() {
			return fFigureOverhead_linePower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_in_AFigure() {
			return fFigureOverhead_linePower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_in_BFigure() {
			return fFigureOverhead_linePower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_in_CFigure() {
			return fFigureOverhead_linePower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_out_AFigure() {
			return fFigureOverhead_linePower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_out_BFigure() {
			return fFigureOverhead_linePower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_out_CFigure() {
			return fFigureOverhead_linePower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_losses_AFigure() {
			return fFigureOverhead_linePower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_losses_BFigure() {
			return fFigureOverhead_linePower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePower_losses_CFigure() {
			return fFigureOverhead_linePower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineFlow_directionFigure() {
			return fFigureOverhead_lineFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_linePhasesFigure() {
			return fFigureOverhead_linePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOverhead_lineNominal_voltageFigure() {
			return fFigureOverhead_lineNominal_voltageFigure;
		}

	}

}
