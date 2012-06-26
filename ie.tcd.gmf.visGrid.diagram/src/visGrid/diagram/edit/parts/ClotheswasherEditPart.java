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
public class ClotheswasherEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2049;

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
	public ClotheswasherEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.ClotheswasherItemSemanticEditPolicy());
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
		return primaryShape = new ClotheswasherFigure();
	}

	/**
	 * @generated
	 */
	public ClotheswasherFigure getPrimaryShape() {
		return (ClotheswasherFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherNameEditPart) {
			((visGrid.diagram.edit.parts.ClotheswasherNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureClotheswasherNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.ClotheswasherNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ClotheswasherConnection_4031) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsClotheswasher_4050) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ClotheswasherFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherMotor_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherCircuit_splitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherQueueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherEnergy_meterFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherStall_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherStart_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherStall_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherTrip_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherReset_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherStateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClotheswasherOverrideFigure;

		/**
		 * @generated
		 */
		public ClotheswasherFigure() {

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

			fFigureClotheswasherNameFigure = new WrappingLabel();
			fFigureClotheswasherNameFigure.setText("<...>");

			this.add(fFigureClotheswasherNameFigure);

			fFigureClotheswasherMotor_powerFigure = new WrappingLabel();
			fFigureClotheswasherMotor_powerFigure.setText("<...>");

			this.add(fFigureClotheswasherMotor_powerFigure);

			fFigureClotheswasherCircuit_splitFigure = new WrappingLabel();
			fFigureClotheswasherCircuit_splitFigure.setText("<...>");

			this.add(fFigureClotheswasherCircuit_splitFigure);

			fFigureClotheswasherQueueFigure = new WrappingLabel();
			fFigureClotheswasherQueueFigure.setText("<...>");

			this.add(fFigureClotheswasherQueueFigure);

			fFigureClotheswasherDemandFigure = new WrappingLabel();
			fFigureClotheswasherDemandFigure.setText("<...>");

			this.add(fFigureClotheswasherDemandFigure);

			fFigureClotheswasherEnergy_meterFigure = new WrappingLabel();
			fFigureClotheswasherEnergy_meterFigure.setText("<...>");

			this.add(fFigureClotheswasherEnergy_meterFigure);

			fFigureClotheswasherStall_voltageFigure = new WrappingLabel();
			fFigureClotheswasherStall_voltageFigure.setText("<...>");

			this.add(fFigureClotheswasherStall_voltageFigure);

			fFigureClotheswasherStart_voltageFigure = new WrappingLabel();
			fFigureClotheswasherStart_voltageFigure.setText("<...>");

			this.add(fFigureClotheswasherStart_voltageFigure);

			fFigureClotheswasherStall_impedanceFigure = new WrappingLabel();
			fFigureClotheswasherStall_impedanceFigure.setText("<...>");

			this.add(fFigureClotheswasherStall_impedanceFigure);

			fFigureClotheswasherTrip_delayFigure = new WrappingLabel();
			fFigureClotheswasherTrip_delayFigure.setText("<...>");

			this.add(fFigureClotheswasherTrip_delayFigure);

			fFigureClotheswasherReset_delayFigure = new WrappingLabel();
			fFigureClotheswasherReset_delayFigure.setText("<...>");

			this.add(fFigureClotheswasherReset_delayFigure);

			fFigureClotheswasherStateFigure = new WrappingLabel();
			fFigureClotheswasherStateFigure.setText("<...>");

			this.add(fFigureClotheswasherStateFigure);

			fFigureClotheswasherShapeFigure = new WrappingLabel();
			fFigureClotheswasherShapeFigure.setText("<...>");

			this.add(fFigureClotheswasherShapeFigure);

			fFigureClotheswasherLoadFigure = new WrappingLabel();
			fFigureClotheswasherLoadFigure.setText("<...>");

			this.add(fFigureClotheswasherLoadFigure);

			fFigureClotheswasherEnergyFigure = new WrappingLabel();
			fFigureClotheswasherEnergyFigure.setText("<...>");

			this.add(fFigureClotheswasherEnergyFigure);

			fFigureClotheswasherPowerFigure = new WrappingLabel();
			fFigureClotheswasherPowerFigure.setText("<...>");

			this.add(fFigureClotheswasherPowerFigure);

			fFigureClotheswasherPeak_demandFigure = new WrappingLabel();
			fFigureClotheswasherPeak_demandFigure.setText("<...>");

			this.add(fFigureClotheswasherPeak_demandFigure);

			fFigureClotheswasherHeatgainFigure = new WrappingLabel();
			fFigureClotheswasherHeatgainFigure.setText("<...>");

			this.add(fFigureClotheswasherHeatgainFigure);

			fFigureClotheswasherHeatgain_fractionFigure = new WrappingLabel();
			fFigureClotheswasherHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureClotheswasherHeatgain_fractionFigure);

			fFigureClotheswasherCurrent_fractionFigure = new WrappingLabel();
			fFigureClotheswasherCurrent_fractionFigure.setText("<...>");

			this.add(fFigureClotheswasherCurrent_fractionFigure);

			fFigureClotheswasherImpedance_fractionFigure = new WrappingLabel();
			fFigureClotheswasherImpedance_fractionFigure.setText("<...>");

			this.add(fFigureClotheswasherImpedance_fractionFigure);

			fFigureClotheswasherPower_fractionFigure = new WrappingLabel();
			fFigureClotheswasherPower_fractionFigure.setText("<...>");

			this.add(fFigureClotheswasherPower_fractionFigure);

			fFigureClotheswasherPower_factorFigure = new WrappingLabel();
			fFigureClotheswasherPower_factorFigure.setText("<...>");

			this.add(fFigureClotheswasherPower_factorFigure);

			fFigureClotheswasherConstant_powerFigure = new WrappingLabel();
			fFigureClotheswasherConstant_powerFigure.setText("<...>");

			this.add(fFigureClotheswasherConstant_powerFigure);

			fFigureClotheswasherConstant_currentFigure = new WrappingLabel();
			fFigureClotheswasherConstant_currentFigure.setText("<...>");

			this.add(fFigureClotheswasherConstant_currentFigure);

			fFigureClotheswasherConstant_admittanceFigure = new WrappingLabel();
			fFigureClotheswasherConstant_admittanceFigure.setText("<...>");

			this.add(fFigureClotheswasherConstant_admittanceFigure);

			fFigureClotheswasherVoltage_factorFigure = new WrappingLabel();
			fFigureClotheswasherVoltage_factorFigure.setText("<...>");

			this.add(fFigureClotheswasherVoltage_factorFigure);

			fFigureClotheswasherConfigurationFigure = new WrappingLabel();
			fFigureClotheswasherConfigurationFigure.setText("<...>");

			this.add(fFigureClotheswasherConfigurationFigure);

			fFigureClotheswasherOverrideFigure = new WrappingLabel();
			fFigureClotheswasherOverrideFigure.setText("<...>");

			this.add(fFigureClotheswasherOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherNameFigure() {
			return fFigureClotheswasherNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherMotor_powerFigure() {
			return fFigureClotheswasherMotor_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherCircuit_splitFigure() {
			return fFigureClotheswasherCircuit_splitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherQueueFigure() {
			return fFigureClotheswasherQueueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherDemandFigure() {
			return fFigureClotheswasherDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherEnergy_meterFigure() {
			return fFigureClotheswasherEnergy_meterFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherStall_voltageFigure() {
			return fFigureClotheswasherStall_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherStart_voltageFigure() {
			return fFigureClotheswasherStart_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherStall_impedanceFigure() {
			return fFigureClotheswasherStall_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherTrip_delayFigure() {
			return fFigureClotheswasherTrip_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherReset_delayFigure() {
			return fFigureClotheswasherReset_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherStateFigure() {
			return fFigureClotheswasherStateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherShapeFigure() {
			return fFigureClotheswasherShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherLoadFigure() {
			return fFigureClotheswasherLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherEnergyFigure() {
			return fFigureClotheswasherEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherPowerFigure() {
			return fFigureClotheswasherPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherPeak_demandFigure() {
			return fFigureClotheswasherPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherHeatgainFigure() {
			return fFigureClotheswasherHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherHeatgain_fractionFigure() {
			return fFigureClotheswasherHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherCurrent_fractionFigure() {
			return fFigureClotheswasherCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherImpedance_fractionFigure() {
			return fFigureClotheswasherImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherPower_fractionFigure() {
			return fFigureClotheswasherPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherPower_factorFigure() {
			return fFigureClotheswasherPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherConstant_powerFigure() {
			return fFigureClotheswasherConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherConstant_currentFigure() {
			return fFigureClotheswasherConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherConstant_admittanceFigure() {
			return fFigureClotheswasherConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherVoltage_factorFigure() {
			return fFigureClotheswasherVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherConfigurationFigure() {
			return fFigureClotheswasherConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClotheswasherOverrideFigure() {
			return fFigureClotheswasherOverrideFigure;
		}

	}

}
