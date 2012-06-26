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
public class InverterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2045;

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
	public InverterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.InverterItemSemanticEditPolicy());
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
		return primaryShape = new InverterFigure();
	}

	/**
	 * @generated
	 */
	public InverterFigure getPrimaryShape() {
		return (InverterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.InverterNameEditPart) {
			((visGrid.diagram.edit.parts.InverterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureInverterNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.InverterNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.InverterNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.InverterConnection_4065) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsInverter_4036) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class InverterFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterInverter_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterV_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterI_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterVA_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterVdcFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhaseA_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhaseB_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhaseC_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhaseA_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhaseB_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhaseC_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterP_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterQ_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureInverterPhasesFigure;

		/**
		 * @generated
		 */
		public InverterFigure() {

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

			fFigureInverterNameFigure = new WrappingLabel();
			fFigureInverterNameFigure.setText("<...>");

			this.add(fFigureInverterNameFigure);

			fFigureInverterInverter_typeFigure = new WrappingLabel();
			fFigureInverterInverter_typeFigure.setText("<...>");

			this.add(fFigureInverterInverter_typeFigure);

			fFigureInverterGenerator_statusFigure = new WrappingLabel();
			fFigureInverterGenerator_statusFigure.setText("<...>");

			this.add(fFigureInverterGenerator_statusFigure);

			fFigureInverterGenerator_modeFigure = new WrappingLabel();
			fFigureInverterGenerator_modeFigure.setText("<...>");

			this.add(fFigureInverterGenerator_modeFigure);

			fFigureInverterV_InFigure = new WrappingLabel();
			fFigureInverterV_InFigure.setText("<...>");

			this.add(fFigureInverterV_InFigure);

			fFigureInverterI_InFigure = new WrappingLabel();
			fFigureInverterI_InFigure.setText("<...>");

			this.add(fFigureInverterI_InFigure);

			fFigureInverterVA_InFigure = new WrappingLabel();
			fFigureInverterVA_InFigure.setText("<...>");

			this.add(fFigureInverterVA_InFigure);

			fFigureInverterVdcFigure = new WrappingLabel();
			fFigureInverterVdcFigure.setText("<...>");

			this.add(fFigureInverterVdcFigure);

			fFigureInverterPhaseA_V_OutFigure = new WrappingLabel();
			fFigureInverterPhaseA_V_OutFigure.setText("<...>");

			this.add(fFigureInverterPhaseA_V_OutFigure);

			fFigureInverterPhaseB_V_OutFigure = new WrappingLabel();
			fFigureInverterPhaseB_V_OutFigure.setText("<...>");

			this.add(fFigureInverterPhaseB_V_OutFigure);

			fFigureInverterPhaseC_V_OutFigure = new WrappingLabel();
			fFigureInverterPhaseC_V_OutFigure.setText("<...>");

			this.add(fFigureInverterPhaseC_V_OutFigure);

			fFigureInverterPhaseA_I_OutFigure = new WrappingLabel();
			fFigureInverterPhaseA_I_OutFigure.setText("<...>");

			this.add(fFigureInverterPhaseA_I_OutFigure);

			fFigureInverterPhaseB_I_OutFigure = new WrappingLabel();
			fFigureInverterPhaseB_I_OutFigure.setText("<...>");

			this.add(fFigureInverterPhaseB_I_OutFigure);

			fFigureInverterPhaseC_I_OutFigure = new WrappingLabel();
			fFigureInverterPhaseC_I_OutFigure.setText("<...>");

			this.add(fFigureInverterPhaseC_I_OutFigure);

			fFigureInverterPower_AFigure = new WrappingLabel();
			fFigureInverterPower_AFigure.setText("<...>");

			this.add(fFigureInverterPower_AFigure);

			fFigureInverterPower_BFigure = new WrappingLabel();
			fFigureInverterPower_BFigure.setText("<...>");

			this.add(fFigureInverterPower_BFigure);

			fFigureInverterPower_CFigure = new WrappingLabel();
			fFigureInverterPower_CFigure.setText("<...>");

			this.add(fFigureInverterPower_CFigure);

			fFigureInverterP_OutFigure = new WrappingLabel();
			fFigureInverterP_OutFigure.setText("<...>");

			this.add(fFigureInverterP_OutFigure);

			fFigureInverterQ_OutFigure = new WrappingLabel();
			fFigureInverterQ_OutFigure.setText("<...>");

			this.add(fFigureInverterQ_OutFigure);

			fFigureInverterPower_factorFigure = new WrappingLabel();
			fFigureInverterPower_factorFigure.setText("<...>");

			this.add(fFigureInverterPower_factorFigure);

			fFigureInverterPhasesFigure = new WrappingLabel();
			fFigureInverterPhasesFigure.setText("<...>");

			this.add(fFigureInverterPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterNameFigure() {
			return fFigureInverterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterInverter_typeFigure() {
			return fFigureInverterInverter_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterGenerator_statusFigure() {
			return fFigureInverterGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterGenerator_modeFigure() {
			return fFigureInverterGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterV_InFigure() {
			return fFigureInverterV_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterI_InFigure() {
			return fFigureInverterI_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterVA_InFigure() {
			return fFigureInverterVA_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterVdcFigure() {
			return fFigureInverterVdcFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhaseA_V_OutFigure() {
			return fFigureInverterPhaseA_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhaseB_V_OutFigure() {
			return fFigureInverterPhaseB_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhaseC_V_OutFigure() {
			return fFigureInverterPhaseC_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhaseA_I_OutFigure() {
			return fFigureInverterPhaseA_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhaseB_I_OutFigure() {
			return fFigureInverterPhaseB_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhaseC_I_OutFigure() {
			return fFigureInverterPhaseC_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPower_AFigure() {
			return fFigureInverterPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPower_BFigure() {
			return fFigureInverterPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPower_CFigure() {
			return fFigureInverterPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterP_OutFigure() {
			return fFigureInverterP_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterQ_OutFigure() {
			return fFigureInverterQ_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPower_factorFigure() {
			return fFigureInverterPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInverterPhasesFigure() {
			return fFigureInverterPhasesFigure;
		}

	}

}
