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
public class Controller2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2015;

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
	public Controller2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Controller2ItemSemanticEditPolicy());
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
		return primaryShape = new Controller2Figure();
	}

	/**
	 * @generated
	 */
	public Controller2Figure getPrimaryShape() {
		return (Controller2Figure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Controller2NameEditPart) {
			((visGrid.diagram.edit.parts.Controller2NameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureController2NameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Controller2NameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Controller2NameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Controller2Connection_4121) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsController2_4092) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Controller2Figure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2NameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Input_stateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Input_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Input_chainedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2ObservationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Mean_observationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Stdev_observationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2ExpectationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2SetpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2SensitivityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2PeriodFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Expectation_propFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Expectation_objFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Setpoint_propFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2State_propFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Observation_objFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Observation_propFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Mean_observation_propFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Stdev_observation_propFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Cycle_lengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Base_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Ramp_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Ramp_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Range_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Range_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Prob_offFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Output_stateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Output_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureController2Control_modeFigure;

		/**
		 * @generated
		 */
		public Controller2Figure() {

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

			fFigureController2NameFigure = new WrappingLabel();
			fFigureController2NameFigure.setText("<...>");

			this.add(fFigureController2NameFigure);

			fFigureController2Input_stateFigure = new WrappingLabel();
			fFigureController2Input_stateFigure.setText("<...>");

			this.add(fFigureController2Input_stateFigure);

			fFigureController2Input_setpointFigure = new WrappingLabel();
			fFigureController2Input_setpointFigure.setText("<...>");

			this.add(fFigureController2Input_setpointFigure);

			fFigureController2Input_chainedFigure = new WrappingLabel();
			fFigureController2Input_chainedFigure.setText("<...>");

			this.add(fFigureController2Input_chainedFigure);

			fFigureController2ObservationFigure = new WrappingLabel();
			fFigureController2ObservationFigure.setText("<...>");

			this.add(fFigureController2ObservationFigure);

			fFigureController2Mean_observationFigure = new WrappingLabel();
			fFigureController2Mean_observationFigure.setText("<...>");

			this.add(fFigureController2Mean_observationFigure);

			fFigureController2Stdev_observationFigure = new WrappingLabel();
			fFigureController2Stdev_observationFigure.setText("<...>");

			this.add(fFigureController2Stdev_observationFigure);

			fFigureController2ExpectationFigure = new WrappingLabel();
			fFigureController2ExpectationFigure.setText("<...>");

			this.add(fFigureController2ExpectationFigure);

			fFigureController2SetpointFigure = new WrappingLabel();
			fFigureController2SetpointFigure.setText("<...>");

			this.add(fFigureController2SetpointFigure);

			fFigureController2SensitivityFigure = new WrappingLabel();
			fFigureController2SensitivityFigure.setText("<...>");

			this.add(fFigureController2SensitivityFigure);

			fFigureController2PeriodFigure = new WrappingLabel();
			fFigureController2PeriodFigure.setText("<...>");

			this.add(fFigureController2PeriodFigure);

			fFigureController2Expectation_propFigure = new WrappingLabel();
			fFigureController2Expectation_propFigure.setText("<...>");

			this.add(fFigureController2Expectation_propFigure);

			fFigureController2Expectation_objFigure = new WrappingLabel();
			fFigureController2Expectation_objFigure.setText("<...>");

			this.add(fFigureController2Expectation_objFigure);

			fFigureController2Setpoint_propFigure = new WrappingLabel();
			fFigureController2Setpoint_propFigure.setText("<...>");

			this.add(fFigureController2Setpoint_propFigure);

			fFigureController2State_propFigure = new WrappingLabel();
			fFigureController2State_propFigure.setText("<...>");

			this.add(fFigureController2State_propFigure);

			fFigureController2Observation_objFigure = new WrappingLabel();
			fFigureController2Observation_objFigure.setText("<...>");

			this.add(fFigureController2Observation_objFigure);

			fFigureController2Observation_propFigure = new WrappingLabel();
			fFigureController2Observation_propFigure.setText("<...>");

			this.add(fFigureController2Observation_propFigure);

			fFigureController2Mean_observation_propFigure = new WrappingLabel();
			fFigureController2Mean_observation_propFigure.setText("<...>");

			this.add(fFigureController2Mean_observation_propFigure);

			fFigureController2Stdev_observation_propFigure = new WrappingLabel();
			fFigureController2Stdev_observation_propFigure.setText("<...>");

			this.add(fFigureController2Stdev_observation_propFigure);

			fFigureController2Cycle_lengthFigure = new WrappingLabel();
			fFigureController2Cycle_lengthFigure.setText("<...>");

			this.add(fFigureController2Cycle_lengthFigure);

			fFigureController2Base_setpointFigure = new WrappingLabel();
			fFigureController2Base_setpointFigure.setText("<...>");

			this.add(fFigureController2Base_setpointFigure);

			fFigureController2Ramp_highFigure = new WrappingLabel();
			fFigureController2Ramp_highFigure.setText("<...>");

			this.add(fFigureController2Ramp_highFigure);

			fFigureController2Ramp_lowFigure = new WrappingLabel();
			fFigureController2Ramp_lowFigure.setText("<...>");

			this.add(fFigureController2Ramp_lowFigure);

			fFigureController2Range_highFigure = new WrappingLabel();
			fFigureController2Range_highFigure.setText("<...>");

			this.add(fFigureController2Range_highFigure);

			fFigureController2Range_lowFigure = new WrappingLabel();
			fFigureController2Range_lowFigure.setText("<...>");

			this.add(fFigureController2Range_lowFigure);

			fFigureController2Prob_offFigure = new WrappingLabel();
			fFigureController2Prob_offFigure.setText("<...>");

			this.add(fFigureController2Prob_offFigure);

			fFigureController2Output_stateFigure = new WrappingLabel();
			fFigureController2Output_stateFigure.setText("<...>");

			this.add(fFigureController2Output_stateFigure);

			fFigureController2Output_setpointFigure = new WrappingLabel();
			fFigureController2Output_setpointFigure.setText("<...>");

			this.add(fFigureController2Output_setpointFigure);

			fFigureController2Control_modeFigure = new WrappingLabel();
			fFigureController2Control_modeFigure.setText("<...>");

			this.add(fFigureController2Control_modeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2NameFigure() {
			return fFigureController2NameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Input_stateFigure() {
			return fFigureController2Input_stateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Input_setpointFigure() {
			return fFigureController2Input_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Input_chainedFigure() {
			return fFigureController2Input_chainedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2ObservationFigure() {
			return fFigureController2ObservationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Mean_observationFigure() {
			return fFigureController2Mean_observationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Stdev_observationFigure() {
			return fFigureController2Stdev_observationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2ExpectationFigure() {
			return fFigureController2ExpectationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2SetpointFigure() {
			return fFigureController2SetpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2SensitivityFigure() {
			return fFigureController2SensitivityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2PeriodFigure() {
			return fFigureController2PeriodFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Expectation_propFigure() {
			return fFigureController2Expectation_propFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Expectation_objFigure() {
			return fFigureController2Expectation_objFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Setpoint_propFigure() {
			return fFigureController2Setpoint_propFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2State_propFigure() {
			return fFigureController2State_propFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Observation_objFigure() {
			return fFigureController2Observation_objFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Observation_propFigure() {
			return fFigureController2Observation_propFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Mean_observation_propFigure() {
			return fFigureController2Mean_observation_propFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Stdev_observation_propFigure() {
			return fFigureController2Stdev_observation_propFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Cycle_lengthFigure() {
			return fFigureController2Cycle_lengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Base_setpointFigure() {
			return fFigureController2Base_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Ramp_highFigure() {
			return fFigureController2Ramp_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Ramp_lowFigure() {
			return fFigureController2Ramp_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Range_highFigure() {
			return fFigureController2Range_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Range_lowFigure() {
			return fFigureController2Range_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Prob_offFigure() {
			return fFigureController2Prob_offFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Output_stateFigure() {
			return fFigureController2Output_stateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Output_setpointFigure() {
			return fFigureController2Output_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureController2Control_modeFigure() {
			return fFigureController2Control_modeFigure;
		}

	}

}
