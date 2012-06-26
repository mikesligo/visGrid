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
public class Underground_lineEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2037;

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
	public Underground_lineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Underground_lineItemSemanticEditPolicy());
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
		return primaryShape = new Underground_lineFigure();
	}

	/**
	 * @generated
	 */
	public Underground_lineFigure getPrimaryShape() {
		return (Underground_lineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Underground_lineNameEditPart) {
			((visGrid.diagram.edit.parts.Underground_lineNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureUnderground_lineNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Underground_lineNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Underground_lineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Underground_lineConnection_4149) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsUnderground_line_4131) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Underground_lineFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineLengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_linePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnderground_lineNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Underground_lineFigure() {

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

			fFigureUnderground_lineNameFigure = new WrappingLabel();
			fFigureUnderground_lineNameFigure.setText("<...>");

			this.add(fFigureUnderground_lineNameFigure);

			fFigureUnderground_lineConfigurationFigure = new WrappingLabel();
			fFigureUnderground_lineConfigurationFigure.setText("<...>");

			this.add(fFigureUnderground_lineConfigurationFigure);

			fFigureUnderground_lineLengthFigure = new WrappingLabel();
			fFigureUnderground_lineLengthFigure.setText("<...>");

			this.add(fFigureUnderground_lineLengthFigure);

			fFigureUnderground_lineStatusFigure = new WrappingLabel();
			fFigureUnderground_lineStatusFigure.setText("<...>");

			this.add(fFigureUnderground_lineStatusFigure);

			fFigureUnderground_lineFromFigure = new WrappingLabel();
			fFigureUnderground_lineFromFigure.setText("<...>");

			this.add(fFigureUnderground_lineFromFigure);

			fFigureUnderground_lineToFigure = new WrappingLabel();
			fFigureUnderground_lineToFigure.setText("<...>");

			this.add(fFigureUnderground_lineToFigure);

			fFigureUnderground_linePower_inFigure = new WrappingLabel();
			fFigureUnderground_linePower_inFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_inFigure);

			fFigureUnderground_linePower_outFigure = new WrappingLabel();
			fFigureUnderground_linePower_outFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_outFigure);

			fFigureUnderground_linePower_lossesFigure = new WrappingLabel();
			fFigureUnderground_linePower_lossesFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_lossesFigure);

			fFigureUnderground_linePower_in_AFigure = new WrappingLabel();
			fFigureUnderground_linePower_in_AFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_in_AFigure);

			fFigureUnderground_linePower_in_BFigure = new WrappingLabel();
			fFigureUnderground_linePower_in_BFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_in_BFigure);

			fFigureUnderground_linePower_in_CFigure = new WrappingLabel();
			fFigureUnderground_linePower_in_CFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_in_CFigure);

			fFigureUnderground_linePower_out_AFigure = new WrappingLabel();
			fFigureUnderground_linePower_out_AFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_out_AFigure);

			fFigureUnderground_linePower_out_BFigure = new WrappingLabel();
			fFigureUnderground_linePower_out_BFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_out_BFigure);

			fFigureUnderground_linePower_out_CFigure = new WrappingLabel();
			fFigureUnderground_linePower_out_CFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_out_CFigure);

			fFigureUnderground_linePower_losses_AFigure = new WrappingLabel();
			fFigureUnderground_linePower_losses_AFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_losses_AFigure);

			fFigureUnderground_linePower_losses_BFigure = new WrappingLabel();
			fFigureUnderground_linePower_losses_BFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_losses_BFigure);

			fFigureUnderground_linePower_losses_CFigure = new WrappingLabel();
			fFigureUnderground_linePower_losses_CFigure.setText("<...>");

			this.add(fFigureUnderground_linePower_losses_CFigure);

			fFigureUnderground_lineFlow_directionFigure = new WrappingLabel();
			fFigureUnderground_lineFlow_directionFigure.setText("<...>");

			this.add(fFigureUnderground_lineFlow_directionFigure);

			fFigureUnderground_linePhasesFigure = new WrappingLabel();
			fFigureUnderground_linePhasesFigure.setText("<...>");

			this.add(fFigureUnderground_linePhasesFigure);

			fFigureUnderground_lineNominal_voltageFigure = new WrappingLabel();
			fFigureUnderground_lineNominal_voltageFigure.setText("<...>");

			this.add(fFigureUnderground_lineNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineNameFigure() {
			return fFigureUnderground_lineNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineConfigurationFigure() {
			return fFigureUnderground_lineConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineLengthFigure() {
			return fFigureUnderground_lineLengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineStatusFigure() {
			return fFigureUnderground_lineStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineFromFigure() {
			return fFigureUnderground_lineFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineToFigure() {
			return fFigureUnderground_lineToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_inFigure() {
			return fFigureUnderground_linePower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_outFigure() {
			return fFigureUnderground_linePower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_lossesFigure() {
			return fFigureUnderground_linePower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_in_AFigure() {
			return fFigureUnderground_linePower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_in_BFigure() {
			return fFigureUnderground_linePower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_in_CFigure() {
			return fFigureUnderground_linePower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_out_AFigure() {
			return fFigureUnderground_linePower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_out_BFigure() {
			return fFigureUnderground_linePower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_out_CFigure() {
			return fFigureUnderground_linePower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_losses_AFigure() {
			return fFigureUnderground_linePower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_losses_BFigure() {
			return fFigureUnderground_linePower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePower_losses_CFigure() {
			return fFigureUnderground_linePower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineFlow_directionFigure() {
			return fFigureUnderground_lineFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_linePhasesFigure() {
			return fFigureUnderground_linePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnderground_lineNominal_voltageFigure() {
			return fFigureUnderground_lineNominal_voltageFigure;
		}

	}

}
