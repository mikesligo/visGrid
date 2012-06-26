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
public class RectifierEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	public RectifierEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.RectifierItemSemanticEditPolicy());
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
		return primaryShape = new RectifierFigure();
	}

	/**
	 * @generated
	 */
	public RectifierFigure getPrimaryShape() {
		return (RectifierFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RectifierNameEditPart) {
			((visGrid.diagram.edit.parts.RectifierNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRectifierNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RectifierNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.RectifierNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RectifierConnection_4075) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRectifier_4108) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class RectifierFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierRectifier_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierV_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierI_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierP_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierQ_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierVdcFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhaseA_V_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhaseB_V_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhaseC_V_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhaseA_I_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhaseB_I_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhaseC_I_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPower_A_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPower_B_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPower_C_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRectifierPhasesFigure;

		/**
		 * @generated
		 */
		public RectifierFigure() {

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

			fFigureRectifierNameFigure = new WrappingLabel();
			fFigureRectifierNameFigure.setText("<...>");

			this.add(fFigureRectifierNameFigure);

			fFigureRectifierRectifier_typeFigure = new WrappingLabel();
			fFigureRectifierRectifier_typeFigure.setText("<...>");

			this.add(fFigureRectifierRectifier_typeFigure);

			fFigureRectifierGenerator_modeFigure = new WrappingLabel();
			fFigureRectifierGenerator_modeFigure.setText("<...>");

			this.add(fFigureRectifierGenerator_modeFigure);

			fFigureRectifierV_OutFigure = new WrappingLabel();
			fFigureRectifierV_OutFigure.setText("<...>");

			this.add(fFigureRectifierV_OutFigure);

			fFigureRectifierI_OutFigure = new WrappingLabel();
			fFigureRectifierI_OutFigure.setText("<...>");

			this.add(fFigureRectifierI_OutFigure);

			fFigureRectifierVA_OutFigure = new WrappingLabel();
			fFigureRectifierVA_OutFigure.setText("<...>");

			this.add(fFigureRectifierVA_OutFigure);

			fFigureRectifierP_OutFigure = new WrappingLabel();
			fFigureRectifierP_OutFigure.setText("<...>");

			this.add(fFigureRectifierP_OutFigure);

			fFigureRectifierQ_OutFigure = new WrappingLabel();
			fFigureRectifierQ_OutFigure.setText("<...>");

			this.add(fFigureRectifierQ_OutFigure);

			fFigureRectifierVdcFigure = new WrappingLabel();
			fFigureRectifierVdcFigure.setText("<...>");

			this.add(fFigureRectifierVdcFigure);

			fFigureRectifierPhaseA_V_InFigure = new WrappingLabel();
			fFigureRectifierPhaseA_V_InFigure.setText("<...>");

			this.add(fFigureRectifierPhaseA_V_InFigure);

			fFigureRectifierPhaseB_V_InFigure = new WrappingLabel();
			fFigureRectifierPhaseB_V_InFigure.setText("<...>");

			this.add(fFigureRectifierPhaseB_V_InFigure);

			fFigureRectifierPhaseC_V_InFigure = new WrappingLabel();
			fFigureRectifierPhaseC_V_InFigure.setText("<...>");

			this.add(fFigureRectifierPhaseC_V_InFigure);

			fFigureRectifierPhaseA_I_InFigure = new WrappingLabel();
			fFigureRectifierPhaseA_I_InFigure.setText("<...>");

			this.add(fFigureRectifierPhaseA_I_InFigure);

			fFigureRectifierPhaseB_I_InFigure = new WrappingLabel();
			fFigureRectifierPhaseB_I_InFigure.setText("<...>");

			this.add(fFigureRectifierPhaseB_I_InFigure);

			fFigureRectifierPhaseC_I_InFigure = new WrappingLabel();
			fFigureRectifierPhaseC_I_InFigure.setText("<...>");

			this.add(fFigureRectifierPhaseC_I_InFigure);

			fFigureRectifierPower_A_InFigure = new WrappingLabel();
			fFigureRectifierPower_A_InFigure.setText("<...>");

			this.add(fFigureRectifierPower_A_InFigure);

			fFigureRectifierPower_B_InFigure = new WrappingLabel();
			fFigureRectifierPower_B_InFigure.setText("<...>");

			this.add(fFigureRectifierPower_B_InFigure);

			fFigureRectifierPower_C_InFigure = new WrappingLabel();
			fFigureRectifierPower_C_InFigure.setText("<...>");

			this.add(fFigureRectifierPower_C_InFigure);

			fFigureRectifierPhasesFigure = new WrappingLabel();
			fFigureRectifierPhasesFigure.setText("<...>");

			this.add(fFigureRectifierPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierNameFigure() {
			return fFigureRectifierNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierRectifier_typeFigure() {
			return fFigureRectifierRectifier_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierGenerator_modeFigure() {
			return fFigureRectifierGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierV_OutFigure() {
			return fFigureRectifierV_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierI_OutFigure() {
			return fFigureRectifierI_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierVA_OutFigure() {
			return fFigureRectifierVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierP_OutFigure() {
			return fFigureRectifierP_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierQ_OutFigure() {
			return fFigureRectifierQ_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierVdcFigure() {
			return fFigureRectifierVdcFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhaseA_V_InFigure() {
			return fFigureRectifierPhaseA_V_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhaseB_V_InFigure() {
			return fFigureRectifierPhaseB_V_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhaseC_V_InFigure() {
			return fFigureRectifierPhaseC_V_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhaseA_I_InFigure() {
			return fFigureRectifierPhaseA_I_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhaseB_I_InFigure() {
			return fFigureRectifierPhaseB_I_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhaseC_I_InFigure() {
			return fFigureRectifierPhaseC_I_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPower_A_InFigure() {
			return fFigureRectifierPower_A_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPower_B_InFigure() {
			return fFigureRectifierPower_B_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPower_C_InFigure() {
			return fFigureRectifierPower_C_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRectifierPhasesFigure() {
			return fFigureRectifierPhasesFigure;
		}

	}

}
