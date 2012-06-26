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
public class Regulator_configurationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2010;

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
	public Regulator_configurationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Regulator_configurationItemSemanticEditPolicy());
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
		return primaryShape = new Regulator_configurationFigure();
	}

	/**
	 * @generated
	 */
	public Regulator_configurationFigure getPrimaryShape() {
		return (Regulator_configurationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationNameEditPart) {
			((visGrid.diagram.edit.parts.Regulator_configurationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRegulator_configurationNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Regulator_configurationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Regulator_configurationConnection_4007) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRegulator_configuration_4090) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Regulator_configurationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationConnect_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationBand_centerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationBand_widthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationTime_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationDwell_timeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationRaise_tapsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationLower_tapsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCurrent_transducer_ratioFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationPower_transducer_ratioFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCompensator_r_setting_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCompensator_r_setting_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCompensator_r_setting_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCompensator_x_setting_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCompensator_x_setting_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCompensator_x_setting_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationCT_phaseFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationPT_phaseFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationRegulationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationControl_levelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationControlFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationTap_pos_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationTap_pos_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRegulator_configurationTap_pos_CFigure;

		/**
		 * @generated
		 */
		public Regulator_configurationFigure() {

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

			fFigureRegulator_configurationNameFigure = new WrappingLabel();
			fFigureRegulator_configurationNameFigure.setText("<...>");

			this.add(fFigureRegulator_configurationNameFigure);

			fFigureRegulator_configurationConnect_typeFigure = new WrappingLabel();
			fFigureRegulator_configurationConnect_typeFigure.setText("<...>");

			this.add(fFigureRegulator_configurationConnect_typeFigure);

			fFigureRegulator_configurationBand_centerFigure = new WrappingLabel();
			fFigureRegulator_configurationBand_centerFigure.setText("<...>");

			this.add(fFigureRegulator_configurationBand_centerFigure);

			fFigureRegulator_configurationBand_widthFigure = new WrappingLabel();
			fFigureRegulator_configurationBand_widthFigure.setText("<...>");

			this.add(fFigureRegulator_configurationBand_widthFigure);

			fFigureRegulator_configurationTime_delayFigure = new WrappingLabel();
			fFigureRegulator_configurationTime_delayFigure.setText("<...>");

			this.add(fFigureRegulator_configurationTime_delayFigure);

			fFigureRegulator_configurationDwell_timeFigure = new WrappingLabel();
			fFigureRegulator_configurationDwell_timeFigure.setText("<...>");

			this.add(fFigureRegulator_configurationDwell_timeFigure);

			fFigureRegulator_configurationRaise_tapsFigure = new WrappingLabel();
			fFigureRegulator_configurationRaise_tapsFigure.setText("<...>");

			this.add(fFigureRegulator_configurationRaise_tapsFigure);

			fFigureRegulator_configurationLower_tapsFigure = new WrappingLabel();
			fFigureRegulator_configurationLower_tapsFigure.setText("<...>");

			this.add(fFigureRegulator_configurationLower_tapsFigure);

			fFigureRegulator_configurationCurrent_transducer_ratioFigure = new WrappingLabel();
			fFigureRegulator_configurationCurrent_transducer_ratioFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCurrent_transducer_ratioFigure);

			fFigureRegulator_configurationPower_transducer_ratioFigure = new WrappingLabel();
			fFigureRegulator_configurationPower_transducer_ratioFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationPower_transducer_ratioFigure);

			fFigureRegulator_configurationCompensator_r_setting_AFigure = new WrappingLabel();
			fFigureRegulator_configurationCompensator_r_setting_AFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCompensator_r_setting_AFigure);

			fFigureRegulator_configurationCompensator_r_setting_BFigure = new WrappingLabel();
			fFigureRegulator_configurationCompensator_r_setting_BFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCompensator_r_setting_BFigure);

			fFigureRegulator_configurationCompensator_r_setting_CFigure = new WrappingLabel();
			fFigureRegulator_configurationCompensator_r_setting_CFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCompensator_r_setting_CFigure);

			fFigureRegulator_configurationCompensator_x_setting_AFigure = new WrappingLabel();
			fFigureRegulator_configurationCompensator_x_setting_AFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCompensator_x_setting_AFigure);

			fFigureRegulator_configurationCompensator_x_setting_BFigure = new WrappingLabel();
			fFigureRegulator_configurationCompensator_x_setting_BFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCompensator_x_setting_BFigure);

			fFigureRegulator_configurationCompensator_x_setting_CFigure = new WrappingLabel();
			fFigureRegulator_configurationCompensator_x_setting_CFigure
					.setText("<...>");

			this.add(fFigureRegulator_configurationCompensator_x_setting_CFigure);

			fFigureRegulator_configurationCT_phaseFigure = new WrappingLabel();
			fFigureRegulator_configurationCT_phaseFigure.setText("<...>");

			this.add(fFigureRegulator_configurationCT_phaseFigure);

			fFigureRegulator_configurationPT_phaseFigure = new WrappingLabel();
			fFigureRegulator_configurationPT_phaseFigure.setText("<...>");

			this.add(fFigureRegulator_configurationPT_phaseFigure);

			fFigureRegulator_configurationRegulationFigure = new WrappingLabel();
			fFigureRegulator_configurationRegulationFigure.setText("<...>");

			this.add(fFigureRegulator_configurationRegulationFigure);

			fFigureRegulator_configurationControl_levelFigure = new WrappingLabel();
			fFigureRegulator_configurationControl_levelFigure.setText("<...>");

			this.add(fFigureRegulator_configurationControl_levelFigure);

			fFigureRegulator_configurationControlFigure = new WrappingLabel();
			fFigureRegulator_configurationControlFigure.setText("<...>");

			this.add(fFigureRegulator_configurationControlFigure);

			fFigureRegulator_configurationTypeFigure = new WrappingLabel();
			fFigureRegulator_configurationTypeFigure.setText("<...>");

			this.add(fFigureRegulator_configurationTypeFigure);

			fFigureRegulator_configurationTap_pos_AFigure = new WrappingLabel();
			fFigureRegulator_configurationTap_pos_AFigure.setText("<...>");

			this.add(fFigureRegulator_configurationTap_pos_AFigure);

			fFigureRegulator_configurationTap_pos_BFigure = new WrappingLabel();
			fFigureRegulator_configurationTap_pos_BFigure.setText("<...>");

			this.add(fFigureRegulator_configurationTap_pos_BFigure);

			fFigureRegulator_configurationTap_pos_CFigure = new WrappingLabel();
			fFigureRegulator_configurationTap_pos_CFigure.setText("<...>");

			this.add(fFigureRegulator_configurationTap_pos_CFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationNameFigure() {
			return fFigureRegulator_configurationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationConnect_typeFigure() {
			return fFigureRegulator_configurationConnect_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationBand_centerFigure() {
			return fFigureRegulator_configurationBand_centerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationBand_widthFigure() {
			return fFigureRegulator_configurationBand_widthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationTime_delayFigure() {
			return fFigureRegulator_configurationTime_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationDwell_timeFigure() {
			return fFigureRegulator_configurationDwell_timeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationRaise_tapsFigure() {
			return fFigureRegulator_configurationRaise_tapsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationLower_tapsFigure() {
			return fFigureRegulator_configurationLower_tapsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCurrent_transducer_ratioFigure() {
			return fFigureRegulator_configurationCurrent_transducer_ratioFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationPower_transducer_ratioFigure() {
			return fFigureRegulator_configurationPower_transducer_ratioFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCompensator_r_setting_AFigure() {
			return fFigureRegulator_configurationCompensator_r_setting_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCompensator_r_setting_BFigure() {
			return fFigureRegulator_configurationCompensator_r_setting_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCompensator_r_setting_CFigure() {
			return fFigureRegulator_configurationCompensator_r_setting_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCompensator_x_setting_AFigure() {
			return fFigureRegulator_configurationCompensator_x_setting_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCompensator_x_setting_BFigure() {
			return fFigureRegulator_configurationCompensator_x_setting_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCompensator_x_setting_CFigure() {
			return fFigureRegulator_configurationCompensator_x_setting_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationCT_phaseFigure() {
			return fFigureRegulator_configurationCT_phaseFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationPT_phaseFigure() {
			return fFigureRegulator_configurationPT_phaseFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationRegulationFigure() {
			return fFigureRegulator_configurationRegulationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationControl_levelFigure() {
			return fFigureRegulator_configurationControl_levelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationControlFigure() {
			return fFigureRegulator_configurationControlFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationTypeFigure() {
			return fFigureRegulator_configurationTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationTap_pos_AFigure() {
			return fFigureRegulator_configurationTap_pos_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationTap_pos_BFigure() {
			return fFigureRegulator_configurationTap_pos_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRegulator_configurationTap_pos_CFigure() {
			return fFigureRegulator_configurationTap_pos_CFigure;
		}

	}

}
