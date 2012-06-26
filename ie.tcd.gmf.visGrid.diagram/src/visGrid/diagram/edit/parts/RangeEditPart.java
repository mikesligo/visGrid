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
public class RangeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2022;

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
	public RangeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.RangeItemSemanticEditPolicy());
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
		return primaryShape = new RangeFigure();
	}

	/**
	 * @generated
	 */
	public RangeFigure getPrimaryShape() {
		return (RangeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RangeNameEditPart) {
			((visGrid.diagram.edit.parts.RangeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRangeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RangeNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.RangeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RangeConnection_4151) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRange_4080) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class RangeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeInstalled_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeCircuit_splitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeEnergy_meterFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangePowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangePeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangePower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangePower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRangeOverrideFigure;

		/**
		 * @generated
		 */
		public RangeFigure() {

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

			fFigureRangeNameFigure = new WrappingLabel();
			fFigureRangeNameFigure.setText("<...>");

			this.add(fFigureRangeNameFigure);

			fFigureRangeInstalled_powerFigure = new WrappingLabel();
			fFigureRangeInstalled_powerFigure.setText("<...>");

			this.add(fFigureRangeInstalled_powerFigure);

			fFigureRangeCircuit_splitFigure = new WrappingLabel();
			fFigureRangeCircuit_splitFigure.setText("<...>");

			this.add(fFigureRangeCircuit_splitFigure);

			fFigureRangeDemandFigure = new WrappingLabel();
			fFigureRangeDemandFigure.setText("<...>");

			this.add(fFigureRangeDemandFigure);

			fFigureRangeEnergy_meterFigure = new WrappingLabel();
			fFigureRangeEnergy_meterFigure.setText("<...>");

			this.add(fFigureRangeEnergy_meterFigure);

			fFigureRangeShapeFigure = new WrappingLabel();
			fFigureRangeShapeFigure.setText("<...>");

			this.add(fFigureRangeShapeFigure);

			fFigureRangeLoadFigure = new WrappingLabel();
			fFigureRangeLoadFigure.setText("<...>");

			this.add(fFigureRangeLoadFigure);

			fFigureRangeEnergyFigure = new WrappingLabel();
			fFigureRangeEnergyFigure.setText("<...>");

			this.add(fFigureRangeEnergyFigure);

			fFigureRangePowerFigure = new WrappingLabel();
			fFigureRangePowerFigure.setText("<...>");

			this.add(fFigureRangePowerFigure);

			fFigureRangePeak_demandFigure = new WrappingLabel();
			fFigureRangePeak_demandFigure.setText("<...>");

			this.add(fFigureRangePeak_demandFigure);

			fFigureRangeHeatgainFigure = new WrappingLabel();
			fFigureRangeHeatgainFigure.setText("<...>");

			this.add(fFigureRangeHeatgainFigure);

			fFigureRangeHeatgain_fractionFigure = new WrappingLabel();
			fFigureRangeHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureRangeHeatgain_fractionFigure);

			fFigureRangeCurrent_fractionFigure = new WrappingLabel();
			fFigureRangeCurrent_fractionFigure.setText("<...>");

			this.add(fFigureRangeCurrent_fractionFigure);

			fFigureRangeImpedance_fractionFigure = new WrappingLabel();
			fFigureRangeImpedance_fractionFigure.setText("<...>");

			this.add(fFigureRangeImpedance_fractionFigure);

			fFigureRangePower_fractionFigure = new WrappingLabel();
			fFigureRangePower_fractionFigure.setText("<...>");

			this.add(fFigureRangePower_fractionFigure);

			fFigureRangePower_factorFigure = new WrappingLabel();
			fFigureRangePower_factorFigure.setText("<...>");

			this.add(fFigureRangePower_factorFigure);

			fFigureRangeConstant_powerFigure = new WrappingLabel();
			fFigureRangeConstant_powerFigure.setText("<...>");

			this.add(fFigureRangeConstant_powerFigure);

			fFigureRangeConstant_currentFigure = new WrappingLabel();
			fFigureRangeConstant_currentFigure.setText("<...>");

			this.add(fFigureRangeConstant_currentFigure);

			fFigureRangeConstant_admittanceFigure = new WrappingLabel();
			fFigureRangeConstant_admittanceFigure.setText("<...>");

			this.add(fFigureRangeConstant_admittanceFigure);

			fFigureRangeVoltage_factorFigure = new WrappingLabel();
			fFigureRangeVoltage_factorFigure.setText("<...>");

			this.add(fFigureRangeVoltage_factorFigure);

			fFigureRangeConfigurationFigure = new WrappingLabel();
			fFigureRangeConfigurationFigure.setText("<...>");

			this.add(fFigureRangeConfigurationFigure);

			fFigureRangeOverrideFigure = new WrappingLabel();
			fFigureRangeOverrideFigure.setText("<...>");

			this.add(fFigureRangeOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeNameFigure() {
			return fFigureRangeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeInstalled_powerFigure() {
			return fFigureRangeInstalled_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeCircuit_splitFigure() {
			return fFigureRangeCircuit_splitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeDemandFigure() {
			return fFigureRangeDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeEnergy_meterFigure() {
			return fFigureRangeEnergy_meterFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeShapeFigure() {
			return fFigureRangeShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeLoadFigure() {
			return fFigureRangeLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeEnergyFigure() {
			return fFigureRangeEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangePowerFigure() {
			return fFigureRangePowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangePeak_demandFigure() {
			return fFigureRangePeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeHeatgainFigure() {
			return fFigureRangeHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeHeatgain_fractionFigure() {
			return fFigureRangeHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeCurrent_fractionFigure() {
			return fFigureRangeCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeImpedance_fractionFigure() {
			return fFigureRangeImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangePower_fractionFigure() {
			return fFigureRangePower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangePower_factorFigure() {
			return fFigureRangePower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeConstant_powerFigure() {
			return fFigureRangeConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeConstant_currentFigure() {
			return fFigureRangeConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeConstant_admittanceFigure() {
			return fFigureRangeConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeVoltage_factorFigure() {
			return fFigureRangeVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeConfigurationFigure() {
			return fFigureRangeConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRangeOverrideFigure() {
			return fFigureRangeOverrideFigure;
		}

	}

}
