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
public class LineEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2021;

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
	public LineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.LineItemSemanticEditPolicy());
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
		return primaryShape = new LineFigure();
	}

	/**
	 * @generated
	 */
	public LineFigure getPrimaryShape() {
		return (LineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LineNameEditPart) {
			((visGrid.diagram.edit.parts.LineNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLineNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LineNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.LineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LineConnection_4137) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_4122) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class LineFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineLengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLinePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLineNominal_voltageFigure;

		/**
		 * @generated
		 */
		public LineFigure() {

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

			fFigureLineNameFigure = new WrappingLabel();
			fFigureLineNameFigure.setText("<...>");

			this.add(fFigureLineNameFigure);

			fFigureLineConfigurationFigure = new WrappingLabel();
			fFigureLineConfigurationFigure.setText("<...>");

			this.add(fFigureLineConfigurationFigure);

			fFigureLineLengthFigure = new WrappingLabel();
			fFigureLineLengthFigure.setText("<...>");

			this.add(fFigureLineLengthFigure);

			fFigureLineStatusFigure = new WrappingLabel();
			fFigureLineStatusFigure.setText("<...>");

			this.add(fFigureLineStatusFigure);

			fFigureLineFromFigure = new WrappingLabel();
			fFigureLineFromFigure.setText("<...>");

			this.add(fFigureLineFromFigure);

			fFigureLineToFigure = new WrappingLabel();
			fFigureLineToFigure.setText("<...>");

			this.add(fFigureLineToFigure);

			fFigureLinePower_inFigure = new WrappingLabel();
			fFigureLinePower_inFigure.setText("<...>");

			this.add(fFigureLinePower_inFigure);

			fFigureLinePower_outFigure = new WrappingLabel();
			fFigureLinePower_outFigure.setText("<...>");

			this.add(fFigureLinePower_outFigure);

			fFigureLinePower_lossesFigure = new WrappingLabel();
			fFigureLinePower_lossesFigure.setText("<...>");

			this.add(fFigureLinePower_lossesFigure);

			fFigureLinePower_in_AFigure = new WrappingLabel();
			fFigureLinePower_in_AFigure.setText("<...>");

			this.add(fFigureLinePower_in_AFigure);

			fFigureLinePower_in_BFigure = new WrappingLabel();
			fFigureLinePower_in_BFigure.setText("<...>");

			this.add(fFigureLinePower_in_BFigure);

			fFigureLinePower_in_CFigure = new WrappingLabel();
			fFigureLinePower_in_CFigure.setText("<...>");

			this.add(fFigureLinePower_in_CFigure);

			fFigureLinePower_out_AFigure = new WrappingLabel();
			fFigureLinePower_out_AFigure.setText("<...>");

			this.add(fFigureLinePower_out_AFigure);

			fFigureLinePower_out_BFigure = new WrappingLabel();
			fFigureLinePower_out_BFigure.setText("<...>");

			this.add(fFigureLinePower_out_BFigure);

			fFigureLinePower_out_CFigure = new WrappingLabel();
			fFigureLinePower_out_CFigure.setText("<...>");

			this.add(fFigureLinePower_out_CFigure);

			fFigureLinePower_losses_AFigure = new WrappingLabel();
			fFigureLinePower_losses_AFigure.setText("<...>");

			this.add(fFigureLinePower_losses_AFigure);

			fFigureLinePower_losses_BFigure = new WrappingLabel();
			fFigureLinePower_losses_BFigure.setText("<...>");

			this.add(fFigureLinePower_losses_BFigure);

			fFigureLinePower_losses_CFigure = new WrappingLabel();
			fFigureLinePower_losses_CFigure.setText("<...>");

			this.add(fFigureLinePower_losses_CFigure);

			fFigureLineFlow_directionFigure = new WrappingLabel();
			fFigureLineFlow_directionFigure.setText("<...>");

			this.add(fFigureLineFlow_directionFigure);

			fFigureLinePhasesFigure = new WrappingLabel();
			fFigureLinePhasesFigure.setText("<...>");

			this.add(fFigureLinePhasesFigure);

			fFigureLineNominal_voltageFigure = new WrappingLabel();
			fFigureLineNominal_voltageFigure.setText("<...>");

			this.add(fFigureLineNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineNameFigure() {
			return fFigureLineNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineConfigurationFigure() {
			return fFigureLineConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineLengthFigure() {
			return fFigureLineLengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineStatusFigure() {
			return fFigureLineStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineFromFigure() {
			return fFigureLineFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineToFigure() {
			return fFigureLineToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_inFigure() {
			return fFigureLinePower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_outFigure() {
			return fFigureLinePower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_lossesFigure() {
			return fFigureLinePower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_in_AFigure() {
			return fFigureLinePower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_in_BFigure() {
			return fFigureLinePower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_in_CFigure() {
			return fFigureLinePower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_out_AFigure() {
			return fFigureLinePower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_out_BFigure() {
			return fFigureLinePower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_out_CFigure() {
			return fFigureLinePower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_losses_AFigure() {
			return fFigureLinePower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_losses_BFigure() {
			return fFigureLinePower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePower_losses_CFigure() {
			return fFigureLinePower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineFlow_directionFigure() {
			return fFigureLineFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLinePhasesFigure() {
			return fFigureLinePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLineNominal_voltageFigure() {
			return fFigureLineNominal_voltageFigure;
		}

	}

}
