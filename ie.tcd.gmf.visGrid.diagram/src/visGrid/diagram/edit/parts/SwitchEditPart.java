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
public class SwitchEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2071;

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
	public SwitchEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.SwitchItemSemanticEditPolicy());
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
		return primaryShape = new SwitchFigure();
	}

	/**
	 * @generated
	 */
	public SwitchFigure getPrimaryShape() {
		return (SwitchFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.SwitchNameEditPart) {
			((visGrid.diagram.edit.parts.SwitchNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSwitchNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.SwitchNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.SwitchNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.SwitchConnection_4012) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSwitch_4116) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class SwitchFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchFromFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchToFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_inFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_outFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_lossesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_in_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_in_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_in_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_out_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_out_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_out_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_losses_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_losses_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPower_losses_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchFlow_directionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSwitchNominal_voltageFigure;

		/**
		 * @generated
		 */
		public SwitchFigure() {

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

			fFigureSwitchNameFigure = new WrappingLabel();
			fFigureSwitchNameFigure.setText("<...>");

			this.add(fFigureSwitchNameFigure);

			fFigureSwitchStatusFigure = new WrappingLabel();
			fFigureSwitchStatusFigure.setText("<...>");

			this.add(fFigureSwitchStatusFigure);

			fFigureSwitchFromFigure = new WrappingLabel();
			fFigureSwitchFromFigure.setText("<...>");

			this.add(fFigureSwitchFromFigure);

			fFigureSwitchToFigure = new WrappingLabel();
			fFigureSwitchToFigure.setText("<...>");

			this.add(fFigureSwitchToFigure);

			fFigureSwitchPower_inFigure = new WrappingLabel();
			fFigureSwitchPower_inFigure.setText("<...>");

			this.add(fFigureSwitchPower_inFigure);

			fFigureSwitchPower_outFigure = new WrappingLabel();
			fFigureSwitchPower_outFigure.setText("<...>");

			this.add(fFigureSwitchPower_outFigure);

			fFigureSwitchPower_lossesFigure = new WrappingLabel();
			fFigureSwitchPower_lossesFigure.setText("<...>");

			this.add(fFigureSwitchPower_lossesFigure);

			fFigureSwitchPower_in_AFigure = new WrappingLabel();
			fFigureSwitchPower_in_AFigure.setText("<...>");

			this.add(fFigureSwitchPower_in_AFigure);

			fFigureSwitchPower_in_BFigure = new WrappingLabel();
			fFigureSwitchPower_in_BFigure.setText("<...>");

			this.add(fFigureSwitchPower_in_BFigure);

			fFigureSwitchPower_in_CFigure = new WrappingLabel();
			fFigureSwitchPower_in_CFigure.setText("<...>");

			this.add(fFigureSwitchPower_in_CFigure);

			fFigureSwitchPower_out_AFigure = new WrappingLabel();
			fFigureSwitchPower_out_AFigure.setText("<...>");

			this.add(fFigureSwitchPower_out_AFigure);

			fFigureSwitchPower_out_BFigure = new WrappingLabel();
			fFigureSwitchPower_out_BFigure.setText("<...>");

			this.add(fFigureSwitchPower_out_BFigure);

			fFigureSwitchPower_out_CFigure = new WrappingLabel();
			fFigureSwitchPower_out_CFigure.setText("<...>");

			this.add(fFigureSwitchPower_out_CFigure);

			fFigureSwitchPower_losses_AFigure = new WrappingLabel();
			fFigureSwitchPower_losses_AFigure.setText("<...>");

			this.add(fFigureSwitchPower_losses_AFigure);

			fFigureSwitchPower_losses_BFigure = new WrappingLabel();
			fFigureSwitchPower_losses_BFigure.setText("<...>");

			this.add(fFigureSwitchPower_losses_BFigure);

			fFigureSwitchPower_losses_CFigure = new WrappingLabel();
			fFigureSwitchPower_losses_CFigure.setText("<...>");

			this.add(fFigureSwitchPower_losses_CFigure);

			fFigureSwitchFlow_directionFigure = new WrappingLabel();
			fFigureSwitchFlow_directionFigure.setText("<...>");

			this.add(fFigureSwitchFlow_directionFigure);

			fFigureSwitchPhasesFigure = new WrappingLabel();
			fFigureSwitchPhasesFigure.setText("<...>");

			this.add(fFigureSwitchPhasesFigure);

			fFigureSwitchNominal_voltageFigure = new WrappingLabel();
			fFigureSwitchNominal_voltageFigure.setText("<...>");

			this.add(fFigureSwitchNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchNameFigure() {
			return fFigureSwitchNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchStatusFigure() {
			return fFigureSwitchStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchFromFigure() {
			return fFigureSwitchFromFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchToFigure() {
			return fFigureSwitchToFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_inFigure() {
			return fFigureSwitchPower_inFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_outFigure() {
			return fFigureSwitchPower_outFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_lossesFigure() {
			return fFigureSwitchPower_lossesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_in_AFigure() {
			return fFigureSwitchPower_in_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_in_BFigure() {
			return fFigureSwitchPower_in_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_in_CFigure() {
			return fFigureSwitchPower_in_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_out_AFigure() {
			return fFigureSwitchPower_out_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_out_BFigure() {
			return fFigureSwitchPower_out_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_out_CFigure() {
			return fFigureSwitchPower_out_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_losses_AFigure() {
			return fFigureSwitchPower_losses_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_losses_BFigure() {
			return fFigureSwitchPower_losses_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPower_losses_CFigure() {
			return fFigureSwitchPower_losses_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchFlow_directionFigure() {
			return fFigureSwitchFlow_directionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchPhasesFigure() {
			return fFigureSwitchPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSwitchNominal_voltageFigure() {
			return fFigureSwitchNominal_voltageFigure;
		}

	}

}
