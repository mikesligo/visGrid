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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class NodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public NodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.NodeItemSemanticEditPolicy());
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
		return primaryShape = new NodeFigure();
	}

	/**
	 * @generated
	 */
	public NodeFigure getPrimaryShape() {
		return (NodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.NodeNameEditPart) {
			((visGrid.diagram.edit.parts.NodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureNodeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.NodeNameEditPart) {
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
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodePlate() {
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
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodeFigure() {
		org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure figure = createNodePlate();
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
				.getType(visGrid.diagram.edit.parts.NodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.NodeConnection_4020) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsNode_4134) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class NodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodePower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodePower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodePower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeNominal_voltageFigure;

		/**
		 * @generated
		 */
		public NodeFigure() {

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

			fFigureNodeNameFigure = new WrappingLabel();
			fFigureNodeNameFigure.setText("<...>");

			this.add(fFigureNodeNameFigure);

			fFigureNodeBustypeFigure = new WrappingLabel();
			fFigureNodeBustypeFigure.setText("<...>");

			this.add(fFigureNodeBustypeFigure);

			fFigureNodeBusflagsFigure = new WrappingLabel();
			fFigureNodeBusflagsFigure.setText("<...>");

			this.add(fFigureNodeBusflagsFigure);

			fFigureNodeReference_busFigure = new WrappingLabel();
			fFigureNodeReference_busFigure.setText("<...>");

			this.add(fFigureNodeReference_busFigure);

			fFigureNodeMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureNodeMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureNodeMaximum_voltage_errorFigure);

			fFigureNodeVoltage_AFigure = new WrappingLabel();
			fFigureNodeVoltage_AFigure.setText("<...>");

			this.add(fFigureNodeVoltage_AFigure);

			fFigureNodeVoltage_BFigure = new WrappingLabel();
			fFigureNodeVoltage_BFigure.setText("<...>");

			this.add(fFigureNodeVoltage_BFigure);

			fFigureNodeVoltage_CFigure = new WrappingLabel();
			fFigureNodeVoltage_CFigure.setText("<...>");

			this.add(fFigureNodeVoltage_CFigure);

			fFigureNodeVoltage_ABFigure = new WrappingLabel();
			fFigureNodeVoltage_ABFigure.setText("<...>");

			this.add(fFigureNodeVoltage_ABFigure);

			fFigureNodeVoltage_BCFigure = new WrappingLabel();
			fFigureNodeVoltage_BCFigure.setText("<...>");

			this.add(fFigureNodeVoltage_BCFigure);

			fFigureNodeVoltage_CAFigure = new WrappingLabel();
			fFigureNodeVoltage_CAFigure.setText("<...>");

			this.add(fFigureNodeVoltage_CAFigure);

			fFigureNodeCurrent_AFigure = new WrappingLabel();
			fFigureNodeCurrent_AFigure.setText("<...>");

			this.add(fFigureNodeCurrent_AFigure);

			fFigureNodeCurrent_BFigure = new WrappingLabel();
			fFigureNodeCurrent_BFigure.setText("<...>");

			this.add(fFigureNodeCurrent_BFigure);

			fFigureNodeCurrent_CFigure = new WrappingLabel();
			fFigureNodeCurrent_CFigure.setText("<...>");

			this.add(fFigureNodeCurrent_CFigure);

			fFigureNodePower_AFigure = new WrappingLabel();
			fFigureNodePower_AFigure.setText("<...>");

			this.add(fFigureNodePower_AFigure);

			fFigureNodePower_BFigure = new WrappingLabel();
			fFigureNodePower_BFigure.setText("<...>");

			this.add(fFigureNodePower_BFigure);

			fFigureNodePower_CFigure = new WrappingLabel();
			fFigureNodePower_CFigure.setText("<...>");

			this.add(fFigureNodePower_CFigure);

			fFigureNodeShunt_AFigure = new WrappingLabel();
			fFigureNodeShunt_AFigure.setText("<...>");

			this.add(fFigureNodeShunt_AFigure);

			fFigureNodeShunt_BFigure = new WrappingLabel();
			fFigureNodeShunt_BFigure.setText("<...>");

			this.add(fFigureNodeShunt_BFigure);

			fFigureNodeShunt_CFigure = new WrappingLabel();
			fFigureNodeShunt_CFigure.setText("<...>");

			this.add(fFigureNodeShunt_CFigure);

			fFigureNodePhasesFigure = new WrappingLabel();
			fFigureNodePhasesFigure.setText("<...>");

			this.add(fFigureNodePhasesFigure);

			fFigureNodeNominal_voltageFigure = new WrappingLabel();
			fFigureNodeNominal_voltageFigure.setText("<...>");

			this.add(fFigureNodeNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeNameFigure() {
			return fFigureNodeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeBustypeFigure() {
			return fFigureNodeBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeBusflagsFigure() {
			return fFigureNodeBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeReference_busFigure() {
			return fFigureNodeReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeMaximum_voltage_errorFigure() {
			return fFigureNodeMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeVoltage_AFigure() {
			return fFigureNodeVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeVoltage_BFigure() {
			return fFigureNodeVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeVoltage_CFigure() {
			return fFigureNodeVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeVoltage_ABFigure() {
			return fFigureNodeVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeVoltage_BCFigure() {
			return fFigureNodeVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeVoltage_CAFigure() {
			return fFigureNodeVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeCurrent_AFigure() {
			return fFigureNodeCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeCurrent_BFigure() {
			return fFigureNodeCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeCurrent_CFigure() {
			return fFigureNodeCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodePower_AFigure() {
			return fFigureNodePower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodePower_BFigure() {
			return fFigureNodePower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodePower_CFigure() {
			return fFigureNodePower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeShunt_AFigure() {
			return fFigureNodeShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeShunt_BFigure() {
			return fFigureNodeShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeShunt_CFigure() {
			return fFigureNodeShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodePhasesFigure() {
			return fFigureNodePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeNominal_voltageFigure() {
			return fFigureNodeNominal_voltageFigure;
		}

	}

}
