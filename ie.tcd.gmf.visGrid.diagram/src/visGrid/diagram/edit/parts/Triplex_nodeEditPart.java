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
public class Triplex_nodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2042;

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
	public Triplex_nodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Triplex_nodeItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_nodeFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_nodeFigure getPrimaryShape() {
		return (Triplex_nodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeNameEditPart) {
			((visGrid.diagram.edit.parts.Triplex_nodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTriplex_nodeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_nodeConnection_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_node_4083) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Triplex_nodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_1NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_2NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_N_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_N_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_1_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_2_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_12_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeShunt_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeShunt_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeShunt_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeHouse_presentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNR_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Triplex_nodeFigure() {

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

			fFigureTriplex_nodeNameFigure = new WrappingLabel();
			fFigureTriplex_nodeNameFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNameFigure);

			fFigureTriplex_nodeBustypeFigure = new WrappingLabel();
			fFigureTriplex_nodeBustypeFigure.setText("<...>");

			this.add(fFigureTriplex_nodeBustypeFigure);

			fFigureTriplex_nodeBusflagsFigure = new WrappingLabel();
			fFigureTriplex_nodeBusflagsFigure.setText("<...>");

			this.add(fFigureTriplex_nodeBusflagsFigure);

			fFigureTriplex_nodeReference_busFigure = new WrappingLabel();
			fFigureTriplex_nodeReference_busFigure.setText("<...>");

			this.add(fFigureTriplex_nodeReference_busFigure);

			fFigureTriplex_nodeMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureTriplex_nodeMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureTriplex_nodeMaximum_voltage_errorFigure);

			fFigureTriplex_nodeVoltage_1Figure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_1Figure);

			fFigureTriplex_nodeVoltage_2Figure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_2Figure);

			fFigureTriplex_nodeVoltage_NFigure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_NFigure);

			fFigureTriplex_nodeVoltage_12Figure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_12Figure);

			fFigureTriplex_nodeVoltage_1NFigure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_1NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_1NFigure);

			fFigureTriplex_nodeVoltage_2NFigure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_2NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_2NFigure);

			fFigureTriplex_nodeCurrent_1Figure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_1Figure);

			fFigureTriplex_nodeCurrent_2Figure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_2Figure);

			fFigureTriplex_nodeCurrent_NFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_NFigure);

			fFigureTriplex_nodeCurrent_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_1_realFigure);

			fFigureTriplex_nodeCurrent_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_2_realFigure);

			fFigureTriplex_nodeCurrent_N_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_N_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_N_realFigure);

			fFigureTriplex_nodeCurrent_1_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_1_reacFigure);

			fFigureTriplex_nodeCurrent_2_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_2_reacFigure);

			fFigureTriplex_nodeCurrent_N_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_N_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_N_reacFigure);

			fFigureTriplex_nodeCurrent_12Figure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_12Figure);

			fFigureTriplex_nodeCurrent_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_12_realFigure);

			fFigureTriplex_nodeCurrent_12_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_12_reacFigure);

			fFigureTriplex_nodeResidential_nominal_current_1Figure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_1Figure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_1Figure);

			fFigureTriplex_nodeResidential_nominal_current_2Figure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_2Figure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_2Figure);

			fFigureTriplex_nodeResidential_nominal_current_12Figure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_12Figure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_12Figure);

			fFigureTriplex_nodeResidential_nominal_current_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_1_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_1_realFigure);

			fFigureTriplex_nodeResidential_nominal_current_1_imagFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_1_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_1_imagFigure);

			fFigureTriplex_nodeResidential_nominal_current_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_2_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_2_realFigure);

			fFigureTriplex_nodeResidential_nominal_current_2_imagFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_2_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_2_imagFigure);

			fFigureTriplex_nodeResidential_nominal_current_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_12_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_12_realFigure);

			fFigureTriplex_nodeResidential_nominal_current_12_imagFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_12_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_12_imagFigure);

			fFigureTriplex_nodePower_1Figure = new WrappingLabel();
			fFigureTriplex_nodePower_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodePower_1Figure);

			fFigureTriplex_nodePower_2Figure = new WrappingLabel();
			fFigureTriplex_nodePower_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodePower_2Figure);

			fFigureTriplex_nodePower_12Figure = new WrappingLabel();
			fFigureTriplex_nodePower_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodePower_12Figure);

			fFigureTriplex_nodePower_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodePower_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_1_realFigure);

			fFigureTriplex_nodePower_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodePower_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_2_realFigure);

			fFigureTriplex_nodePower_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodePower_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_12_realFigure);

			fFigureTriplex_nodePower_1_reacFigure = new WrappingLabel();
			fFigureTriplex_nodePower_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_1_reacFigure);

			fFigureTriplex_nodePower_2_reacFigure = new WrappingLabel();
			fFigureTriplex_nodePower_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_2_reacFigure);

			fFigureTriplex_nodePower_12_reacFigure = new WrappingLabel();
			fFigureTriplex_nodePower_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_12_reacFigure);

			fFigureTriplex_nodeShunt_1Figure = new WrappingLabel();
			fFigureTriplex_nodeShunt_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeShunt_1Figure);

			fFigureTriplex_nodeShunt_2Figure = new WrappingLabel();
			fFigureTriplex_nodeShunt_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeShunt_2Figure);

			fFigureTriplex_nodeShunt_12Figure = new WrappingLabel();
			fFigureTriplex_nodeShunt_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeShunt_12Figure);

			fFigureTriplex_nodeImpedance_1Figure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_1Figure);

			fFigureTriplex_nodeImpedance_2Figure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_2Figure);

			fFigureTriplex_nodeImpedance_12Figure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_12Figure);

			fFigureTriplex_nodeImpedance_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_1_realFigure);

			fFigureTriplex_nodeImpedance_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_2_realFigure);

			fFigureTriplex_nodeImpedance_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_12_realFigure);

			fFigureTriplex_nodeImpedance_1_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_1_reacFigure);

			fFigureTriplex_nodeImpedance_2_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_2_reacFigure);

			fFigureTriplex_nodeImpedance_12_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_12_reacFigure);

			fFigureTriplex_nodeHouse_presentFigure = new WrappingLabel();
			fFigureTriplex_nodeHouse_presentFigure.setText("<...>");

			this.add(fFigureTriplex_nodeHouse_presentFigure);

			fFigureTriplex_nodeNR_modeFigure = new WrappingLabel();
			fFigureTriplex_nodeNR_modeFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNR_modeFigure);

			fFigureTriplex_nodePhasesFigure = new WrappingLabel();
			fFigureTriplex_nodePhasesFigure.setText("<...>");

			this.add(fFigureTriplex_nodePhasesFigure);

			fFigureTriplex_nodeNominal_voltageFigure = new WrappingLabel();
			fFigureTriplex_nodeNominal_voltageFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNameFigure() {
			return fFigureTriplex_nodeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeBustypeFigure() {
			return fFigureTriplex_nodeBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeBusflagsFigure() {
			return fFigureTriplex_nodeBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeReference_busFigure() {
			return fFigureTriplex_nodeReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeMaximum_voltage_errorFigure() {
			return fFigureTriplex_nodeMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_1Figure() {
			return fFigureTriplex_nodeVoltage_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_2Figure() {
			return fFigureTriplex_nodeVoltage_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_NFigure() {
			return fFigureTriplex_nodeVoltage_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_12Figure() {
			return fFigureTriplex_nodeVoltage_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_1NFigure() {
			return fFigureTriplex_nodeVoltage_1NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_2NFigure() {
			return fFigureTriplex_nodeVoltage_2NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_1Figure() {
			return fFigureTriplex_nodeCurrent_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_2Figure() {
			return fFigureTriplex_nodeCurrent_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_NFigure() {
			return fFigureTriplex_nodeCurrent_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_1_realFigure() {
			return fFigureTriplex_nodeCurrent_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_2_realFigure() {
			return fFigureTriplex_nodeCurrent_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_N_realFigure() {
			return fFigureTriplex_nodeCurrent_N_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_1_reacFigure() {
			return fFigureTriplex_nodeCurrent_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_2_reacFigure() {
			return fFigureTriplex_nodeCurrent_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_N_reacFigure() {
			return fFigureTriplex_nodeCurrent_N_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_12Figure() {
			return fFigureTriplex_nodeCurrent_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_12_realFigure() {
			return fFigureTriplex_nodeCurrent_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_12_reacFigure() {
			return fFigureTriplex_nodeCurrent_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_1Figure() {
			return fFigureTriplex_nodeResidential_nominal_current_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_2Figure() {
			return fFigureTriplex_nodeResidential_nominal_current_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_12Figure() {
			return fFigureTriplex_nodeResidential_nominal_current_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_1_realFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_1_imagFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_1_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_2_realFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_2_imagFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_2_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_12_realFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_12_imagFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_12_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_1Figure() {
			return fFigureTriplex_nodePower_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_2Figure() {
			return fFigureTriplex_nodePower_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_12Figure() {
			return fFigureTriplex_nodePower_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_1_realFigure() {
			return fFigureTriplex_nodePower_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_2_realFigure() {
			return fFigureTriplex_nodePower_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_12_realFigure() {
			return fFigureTriplex_nodePower_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_1_reacFigure() {
			return fFigureTriplex_nodePower_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_2_reacFigure() {
			return fFigureTriplex_nodePower_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_12_reacFigure() {
			return fFigureTriplex_nodePower_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeShunt_1Figure() {
			return fFigureTriplex_nodeShunt_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeShunt_2Figure() {
			return fFigureTriplex_nodeShunt_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeShunt_12Figure() {
			return fFigureTriplex_nodeShunt_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_1Figure() {
			return fFigureTriplex_nodeImpedance_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_2Figure() {
			return fFigureTriplex_nodeImpedance_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_12Figure() {
			return fFigureTriplex_nodeImpedance_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_1_realFigure() {
			return fFigureTriplex_nodeImpedance_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_2_realFigure() {
			return fFigureTriplex_nodeImpedance_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_12_realFigure() {
			return fFigureTriplex_nodeImpedance_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_1_reacFigure() {
			return fFigureTriplex_nodeImpedance_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_2_reacFigure() {
			return fFigureTriplex_nodeImpedance_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_12_reacFigure() {
			return fFigureTriplex_nodeImpedance_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeHouse_presentFigure() {
			return fFigureTriplex_nodeHouse_presentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNR_modeFigure() {
			return fFigureTriplex_nodeNR_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePhasesFigure() {
			return fFigureTriplex_nodePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNominal_voltageFigure() {
			return fFigureTriplex_nodeNominal_voltageFigure;
		}

	}

}
