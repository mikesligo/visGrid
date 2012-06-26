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
public class MicrowaveEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2055;

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
	public MicrowaveEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.MicrowaveItemSemanticEditPolicy());
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
		return primaryShape = new MicrowaveFigure();
	}

	/**
	 * @generated
	 */
	public MicrowaveFigure getPrimaryShape() {
		return (MicrowaveFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MicrowaveNameEditPart) {
			((visGrid.diagram.edit.parts.MicrowaveNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMicrowaveNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MicrowaveNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.MicrowaveNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MicrowaveConnection_4139) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicrowave_4105) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class MicrowaveFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveInstalled_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveStandby_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveCircuit_splitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveStateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveCycle_lengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveRuntimeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveState_timeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowavePowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowavePeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowavePower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowavePower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicrowaveOverrideFigure;

		/**
		 * @generated
		 */
		public MicrowaveFigure() {

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

			fFigureMicrowaveNameFigure = new WrappingLabel();
			fFigureMicrowaveNameFigure.setText("<...>");

			this.add(fFigureMicrowaveNameFigure);

			fFigureMicrowaveInstalled_powerFigure = new WrappingLabel();
			fFigureMicrowaveInstalled_powerFigure.setText("<...>");

			this.add(fFigureMicrowaveInstalled_powerFigure);

			fFigureMicrowaveStandby_powerFigure = new WrappingLabel();
			fFigureMicrowaveStandby_powerFigure.setText("<...>");

			this.add(fFigureMicrowaveStandby_powerFigure);

			fFigureMicrowaveCircuit_splitFigure = new WrappingLabel();
			fFigureMicrowaveCircuit_splitFigure.setText("<...>");

			this.add(fFigureMicrowaveCircuit_splitFigure);

			fFigureMicrowaveStateFigure = new WrappingLabel();
			fFigureMicrowaveStateFigure.setText("<...>");

			this.add(fFigureMicrowaveStateFigure);

			fFigureMicrowaveCycle_lengthFigure = new WrappingLabel();
			fFigureMicrowaveCycle_lengthFigure.setText("<...>");

			this.add(fFigureMicrowaveCycle_lengthFigure);

			fFigureMicrowaveRuntimeFigure = new WrappingLabel();
			fFigureMicrowaveRuntimeFigure.setText("<...>");

			this.add(fFigureMicrowaveRuntimeFigure);

			fFigureMicrowaveState_timeFigure = new WrappingLabel();
			fFigureMicrowaveState_timeFigure.setText("<...>");

			this.add(fFigureMicrowaveState_timeFigure);

			fFigureMicrowaveShapeFigure = new WrappingLabel();
			fFigureMicrowaveShapeFigure.setText("<...>");

			this.add(fFigureMicrowaveShapeFigure);

			fFigureMicrowaveLoadFigure = new WrappingLabel();
			fFigureMicrowaveLoadFigure.setText("<...>");

			this.add(fFigureMicrowaveLoadFigure);

			fFigureMicrowaveEnergyFigure = new WrappingLabel();
			fFigureMicrowaveEnergyFigure.setText("<...>");

			this.add(fFigureMicrowaveEnergyFigure);

			fFigureMicrowavePowerFigure = new WrappingLabel();
			fFigureMicrowavePowerFigure.setText("<...>");

			this.add(fFigureMicrowavePowerFigure);

			fFigureMicrowavePeak_demandFigure = new WrappingLabel();
			fFigureMicrowavePeak_demandFigure.setText("<...>");

			this.add(fFigureMicrowavePeak_demandFigure);

			fFigureMicrowaveHeatgainFigure = new WrappingLabel();
			fFigureMicrowaveHeatgainFigure.setText("<...>");

			this.add(fFigureMicrowaveHeatgainFigure);

			fFigureMicrowaveHeatgain_fractionFigure = new WrappingLabel();
			fFigureMicrowaveHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureMicrowaveHeatgain_fractionFigure);

			fFigureMicrowaveCurrent_fractionFigure = new WrappingLabel();
			fFigureMicrowaveCurrent_fractionFigure.setText("<...>");

			this.add(fFigureMicrowaveCurrent_fractionFigure);

			fFigureMicrowaveImpedance_fractionFigure = new WrappingLabel();
			fFigureMicrowaveImpedance_fractionFigure.setText("<...>");

			this.add(fFigureMicrowaveImpedance_fractionFigure);

			fFigureMicrowavePower_fractionFigure = new WrappingLabel();
			fFigureMicrowavePower_fractionFigure.setText("<...>");

			this.add(fFigureMicrowavePower_fractionFigure);

			fFigureMicrowavePower_factorFigure = new WrappingLabel();
			fFigureMicrowavePower_factorFigure.setText("<...>");

			this.add(fFigureMicrowavePower_factorFigure);

			fFigureMicrowaveConstant_powerFigure = new WrappingLabel();
			fFigureMicrowaveConstant_powerFigure.setText("<...>");

			this.add(fFigureMicrowaveConstant_powerFigure);

			fFigureMicrowaveConstant_currentFigure = new WrappingLabel();
			fFigureMicrowaveConstant_currentFigure.setText("<...>");

			this.add(fFigureMicrowaveConstant_currentFigure);

			fFigureMicrowaveConstant_admittanceFigure = new WrappingLabel();
			fFigureMicrowaveConstant_admittanceFigure.setText("<...>");

			this.add(fFigureMicrowaveConstant_admittanceFigure);

			fFigureMicrowaveVoltage_factorFigure = new WrappingLabel();
			fFigureMicrowaveVoltage_factorFigure.setText("<...>");

			this.add(fFigureMicrowaveVoltage_factorFigure);

			fFigureMicrowaveConfigurationFigure = new WrappingLabel();
			fFigureMicrowaveConfigurationFigure.setText("<...>");

			this.add(fFigureMicrowaveConfigurationFigure);

			fFigureMicrowaveOverrideFigure = new WrappingLabel();
			fFigureMicrowaveOverrideFigure.setText("<...>");

			this.add(fFigureMicrowaveOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveNameFigure() {
			return fFigureMicrowaveNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveInstalled_powerFigure() {
			return fFigureMicrowaveInstalled_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveStandby_powerFigure() {
			return fFigureMicrowaveStandby_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveCircuit_splitFigure() {
			return fFigureMicrowaveCircuit_splitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveStateFigure() {
			return fFigureMicrowaveStateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveCycle_lengthFigure() {
			return fFigureMicrowaveCycle_lengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveRuntimeFigure() {
			return fFigureMicrowaveRuntimeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveState_timeFigure() {
			return fFigureMicrowaveState_timeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveShapeFigure() {
			return fFigureMicrowaveShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveLoadFigure() {
			return fFigureMicrowaveLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveEnergyFigure() {
			return fFigureMicrowaveEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowavePowerFigure() {
			return fFigureMicrowavePowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowavePeak_demandFigure() {
			return fFigureMicrowavePeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveHeatgainFigure() {
			return fFigureMicrowaveHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveHeatgain_fractionFigure() {
			return fFigureMicrowaveHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveCurrent_fractionFigure() {
			return fFigureMicrowaveCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveImpedance_fractionFigure() {
			return fFigureMicrowaveImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowavePower_fractionFigure() {
			return fFigureMicrowavePower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowavePower_factorFigure() {
			return fFigureMicrowavePower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveConstant_powerFigure() {
			return fFigureMicrowaveConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveConstant_currentFigure() {
			return fFigureMicrowaveConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveConstant_admittanceFigure() {
			return fFigureMicrowaveConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveVoltage_factorFigure() {
			return fFigureMicrowaveVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveConfigurationFigure() {
			return fFigureMicrowaveConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicrowaveOverrideFigure() {
			return fFigureMicrowaveOverrideFigure;
		}

	}

}
