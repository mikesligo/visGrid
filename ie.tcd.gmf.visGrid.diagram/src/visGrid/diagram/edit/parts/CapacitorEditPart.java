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
public class CapacitorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2023;

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
	public CapacitorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.CapacitorItemSemanticEditPolicy());
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
		return primaryShape = new CapacitorFigure();
	}

	/**
	 * @generated
	 */
	public CapacitorFigure getPrimaryShape() {
		return (CapacitorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.CapacitorNameEditPart) {
			((visGrid.diagram.edit.parts.CapacitorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureCapacitorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.CapacitorNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.CapacitorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.CapacitorConnection_4130) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsCapacitor_4110) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CapacitorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorPt_phaseFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorPhases_connectedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorSwitchAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorSwitchBFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorSwitchCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorControlFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_set_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_set_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVAr_set_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVAr_set_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCurrent_set_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCurrent_set_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCapacitor_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCapacitor_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCapacitor_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCap_nominal_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorTime_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorDwell_timeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorLockout_timeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorRemote_senseFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorRemote_sense_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorControl_levelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCapacitorNominal_voltageFigure;

		/**
		 * @generated
		 */
		public CapacitorFigure() {

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

			fFigureCapacitorNameFigure = new WrappingLabel();
			fFigureCapacitorNameFigure.setText("<...>");

			this.add(fFigureCapacitorNameFigure);

			fFigureCapacitorPt_phaseFigure = new WrappingLabel();
			fFigureCapacitorPt_phaseFigure.setText("<...>");

			this.add(fFigureCapacitorPt_phaseFigure);

			fFigureCapacitorPhases_connectedFigure = new WrappingLabel();
			fFigureCapacitorPhases_connectedFigure.setText("<...>");

			this.add(fFigureCapacitorPhases_connectedFigure);

			fFigureCapacitorSwitchAFigure = new WrappingLabel();
			fFigureCapacitorSwitchAFigure.setText("<...>");

			this.add(fFigureCapacitorSwitchAFigure);

			fFigureCapacitorSwitchBFigure = new WrappingLabel();
			fFigureCapacitorSwitchBFigure.setText("<...>");

			this.add(fFigureCapacitorSwitchBFigure);

			fFigureCapacitorSwitchCFigure = new WrappingLabel();
			fFigureCapacitorSwitchCFigure.setText("<...>");

			this.add(fFigureCapacitorSwitchCFigure);

			fFigureCapacitorControlFigure = new WrappingLabel();
			fFigureCapacitorControlFigure.setText("<...>");

			this.add(fFigureCapacitorControlFigure);

			fFigureCapacitorVoltage_set_highFigure = new WrappingLabel();
			fFigureCapacitorVoltage_set_highFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_set_highFigure);

			fFigureCapacitorVoltage_set_lowFigure = new WrappingLabel();
			fFigureCapacitorVoltage_set_lowFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_set_lowFigure);

			fFigureCapacitorVAr_set_highFigure = new WrappingLabel();
			fFigureCapacitorVAr_set_highFigure.setText("<...>");

			this.add(fFigureCapacitorVAr_set_highFigure);

			fFigureCapacitorVAr_set_lowFigure = new WrappingLabel();
			fFigureCapacitorVAr_set_lowFigure.setText("<...>");

			this.add(fFigureCapacitorVAr_set_lowFigure);

			fFigureCapacitorCurrent_set_lowFigure = new WrappingLabel();
			fFigureCapacitorCurrent_set_lowFigure.setText("<...>");

			this.add(fFigureCapacitorCurrent_set_lowFigure);

			fFigureCapacitorCurrent_set_highFigure = new WrappingLabel();
			fFigureCapacitorCurrent_set_highFigure.setText("<...>");

			this.add(fFigureCapacitorCurrent_set_highFigure);

			fFigureCapacitorCapacitor_AFigure = new WrappingLabel();
			fFigureCapacitorCapacitor_AFigure.setText("<...>");

			this.add(fFigureCapacitorCapacitor_AFigure);

			fFigureCapacitorCapacitor_BFigure = new WrappingLabel();
			fFigureCapacitorCapacitor_BFigure.setText("<...>");

			this.add(fFigureCapacitorCapacitor_BFigure);

			fFigureCapacitorCapacitor_CFigure = new WrappingLabel();
			fFigureCapacitorCapacitor_CFigure.setText("<...>");

			this.add(fFigureCapacitorCapacitor_CFigure);

			fFigureCapacitorCap_nominal_voltageFigure = new WrappingLabel();
			fFigureCapacitorCap_nominal_voltageFigure.setText("<...>");

			this.add(fFigureCapacitorCap_nominal_voltageFigure);

			fFigureCapacitorTime_delayFigure = new WrappingLabel();
			fFigureCapacitorTime_delayFigure.setText("<...>");

			this.add(fFigureCapacitorTime_delayFigure);

			fFigureCapacitorDwell_timeFigure = new WrappingLabel();
			fFigureCapacitorDwell_timeFigure.setText("<...>");

			this.add(fFigureCapacitorDwell_timeFigure);

			fFigureCapacitorLockout_timeFigure = new WrappingLabel();
			fFigureCapacitorLockout_timeFigure.setText("<...>");

			this.add(fFigureCapacitorLockout_timeFigure);

			fFigureCapacitorRemote_senseFigure = new WrappingLabel();
			fFigureCapacitorRemote_senseFigure.setText("<...>");

			this.add(fFigureCapacitorRemote_senseFigure);

			fFigureCapacitorRemote_sense_BFigure = new WrappingLabel();
			fFigureCapacitorRemote_sense_BFigure.setText("<...>");

			this.add(fFigureCapacitorRemote_sense_BFigure);

			fFigureCapacitorControl_levelFigure = new WrappingLabel();
			fFigureCapacitorControl_levelFigure.setText("<...>");

			this.add(fFigureCapacitorControl_levelFigure);

			fFigureCapacitorBustypeFigure = new WrappingLabel();
			fFigureCapacitorBustypeFigure.setText("<...>");

			this.add(fFigureCapacitorBustypeFigure);

			fFigureCapacitorBusflagsFigure = new WrappingLabel();
			fFigureCapacitorBusflagsFigure.setText("<...>");

			this.add(fFigureCapacitorBusflagsFigure);

			fFigureCapacitorReference_busFigure = new WrappingLabel();
			fFigureCapacitorReference_busFigure.setText("<...>");

			this.add(fFigureCapacitorReference_busFigure);

			fFigureCapacitorMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureCapacitorMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureCapacitorMaximum_voltage_errorFigure);

			fFigureCapacitorVoltage_AFigure = new WrappingLabel();
			fFigureCapacitorVoltage_AFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_AFigure);

			fFigureCapacitorVoltage_BFigure = new WrappingLabel();
			fFigureCapacitorVoltage_BFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_BFigure);

			fFigureCapacitorVoltage_CFigure = new WrappingLabel();
			fFigureCapacitorVoltage_CFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_CFigure);

			fFigureCapacitorVoltage_ABFigure = new WrappingLabel();
			fFigureCapacitorVoltage_ABFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_ABFigure);

			fFigureCapacitorVoltage_BCFigure = new WrappingLabel();
			fFigureCapacitorVoltage_BCFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_BCFigure);

			fFigureCapacitorVoltage_CAFigure = new WrappingLabel();
			fFigureCapacitorVoltage_CAFigure.setText("<...>");

			this.add(fFigureCapacitorVoltage_CAFigure);

			fFigureCapacitorCurrent_AFigure = new WrappingLabel();
			fFigureCapacitorCurrent_AFigure.setText("<...>");

			this.add(fFigureCapacitorCurrent_AFigure);

			fFigureCapacitorCurrent_BFigure = new WrappingLabel();
			fFigureCapacitorCurrent_BFigure.setText("<...>");

			this.add(fFigureCapacitorCurrent_BFigure);

			fFigureCapacitorCurrent_CFigure = new WrappingLabel();
			fFigureCapacitorCurrent_CFigure.setText("<...>");

			this.add(fFigureCapacitorCurrent_CFigure);

			fFigureCapacitorPower_AFigure = new WrappingLabel();
			fFigureCapacitorPower_AFigure.setText("<...>");

			this.add(fFigureCapacitorPower_AFigure);

			fFigureCapacitorPower_BFigure = new WrappingLabel();
			fFigureCapacitorPower_BFigure.setText("<...>");

			this.add(fFigureCapacitorPower_BFigure);

			fFigureCapacitorPower_CFigure = new WrappingLabel();
			fFigureCapacitorPower_CFigure.setText("<...>");

			this.add(fFigureCapacitorPower_CFigure);

			fFigureCapacitorShunt_AFigure = new WrappingLabel();
			fFigureCapacitorShunt_AFigure.setText("<...>");

			this.add(fFigureCapacitorShunt_AFigure);

			fFigureCapacitorShunt_BFigure = new WrappingLabel();
			fFigureCapacitorShunt_BFigure.setText("<...>");

			this.add(fFigureCapacitorShunt_BFigure);

			fFigureCapacitorShunt_CFigure = new WrappingLabel();
			fFigureCapacitorShunt_CFigure.setText("<...>");

			this.add(fFigureCapacitorShunt_CFigure);

			fFigureCapacitorPhasesFigure = new WrappingLabel();
			fFigureCapacitorPhasesFigure.setText("<...>");

			this.add(fFigureCapacitorPhasesFigure);

			fFigureCapacitorNominal_voltageFigure = new WrappingLabel();
			fFigureCapacitorNominal_voltageFigure.setText("<...>");

			this.add(fFigureCapacitorNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorNameFigure() {
			return fFigureCapacitorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorPt_phaseFigure() {
			return fFigureCapacitorPt_phaseFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorPhases_connectedFigure() {
			return fFigureCapacitorPhases_connectedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorSwitchAFigure() {
			return fFigureCapacitorSwitchAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorSwitchBFigure() {
			return fFigureCapacitorSwitchBFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorSwitchCFigure() {
			return fFigureCapacitorSwitchCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorControlFigure() {
			return fFigureCapacitorControlFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_set_highFigure() {
			return fFigureCapacitorVoltage_set_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_set_lowFigure() {
			return fFigureCapacitorVoltage_set_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVAr_set_highFigure() {
			return fFigureCapacitorVAr_set_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVAr_set_lowFigure() {
			return fFigureCapacitorVAr_set_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCurrent_set_lowFigure() {
			return fFigureCapacitorCurrent_set_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCurrent_set_highFigure() {
			return fFigureCapacitorCurrent_set_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCapacitor_AFigure() {
			return fFigureCapacitorCapacitor_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCapacitor_BFigure() {
			return fFigureCapacitorCapacitor_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCapacitor_CFigure() {
			return fFigureCapacitorCapacitor_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCap_nominal_voltageFigure() {
			return fFigureCapacitorCap_nominal_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorTime_delayFigure() {
			return fFigureCapacitorTime_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorDwell_timeFigure() {
			return fFigureCapacitorDwell_timeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorLockout_timeFigure() {
			return fFigureCapacitorLockout_timeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorRemote_senseFigure() {
			return fFigureCapacitorRemote_senseFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorRemote_sense_BFigure() {
			return fFigureCapacitorRemote_sense_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorControl_levelFigure() {
			return fFigureCapacitorControl_levelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorBustypeFigure() {
			return fFigureCapacitorBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorBusflagsFigure() {
			return fFigureCapacitorBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorReference_busFigure() {
			return fFigureCapacitorReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorMaximum_voltage_errorFigure() {
			return fFigureCapacitorMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_AFigure() {
			return fFigureCapacitorVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_BFigure() {
			return fFigureCapacitorVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_CFigure() {
			return fFigureCapacitorVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_ABFigure() {
			return fFigureCapacitorVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_BCFigure() {
			return fFigureCapacitorVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorVoltage_CAFigure() {
			return fFigureCapacitorVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCurrent_AFigure() {
			return fFigureCapacitorCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCurrent_BFigure() {
			return fFigureCapacitorCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorCurrent_CFigure() {
			return fFigureCapacitorCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorPower_AFigure() {
			return fFigureCapacitorPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorPower_BFigure() {
			return fFigureCapacitorPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorPower_CFigure() {
			return fFigureCapacitorPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorShunt_AFigure() {
			return fFigureCapacitorShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorShunt_BFigure() {
			return fFigureCapacitorShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorShunt_CFigure() {
			return fFigureCapacitorShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorPhasesFigure() {
			return fFigureCapacitorPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCapacitorNominal_voltageFigure() {
			return fFigureCapacitorNominal_voltageFigure;
		}

	}

}
