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
public class WaterheaterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2068;

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
	public WaterheaterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.WaterheaterItemSemanticEditPolicy());
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
		return primaryShape = new WaterheaterFigure();
	}

	/**
	 * @generated
	 */
	public WaterheaterFigure getPrimaryShape() {
		return (WaterheaterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.WaterheaterNameEditPart) {
			((visGrid.diagram.edit.parts.WaterheaterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWaterheaterNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.WaterheaterNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.WaterheaterNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.WaterheaterConnection_4019) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsWaterheater_4114) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WaterheaterFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_volumeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_UAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_diameterFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterWater_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterHeating_element_capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterInlet_water_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterHeat_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterLocationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTank_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterThermostat_deadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterHeightFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterActual_loadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWaterheaterOverrideFigure;

		/**
		 * @generated
		 */
		public WaterheaterFigure() {

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

			fFigureWaterheaterNameFigure = new WrappingLabel();
			fFigureWaterheaterNameFigure.setText("<...>");

			this.add(fFigureWaterheaterNameFigure);

			fFigureWaterheaterTank_volumeFigure = new WrappingLabel();
			fFigureWaterheaterTank_volumeFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_volumeFigure);

			fFigureWaterheaterTank_UAFigure = new WrappingLabel();
			fFigureWaterheaterTank_UAFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_UAFigure);

			fFigureWaterheaterTank_diameterFigure = new WrappingLabel();
			fFigureWaterheaterTank_diameterFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_diameterFigure);

			fFigureWaterheaterWater_demandFigure = new WrappingLabel();
			fFigureWaterheaterWater_demandFigure.setText("<...>");

			this.add(fFigureWaterheaterWater_demandFigure);

			fFigureWaterheaterHeating_element_capacityFigure = new WrappingLabel();
			fFigureWaterheaterHeating_element_capacityFigure.setText("<...>");

			this.add(fFigureWaterheaterHeating_element_capacityFigure);

			fFigureWaterheaterInlet_water_temperatureFigure = new WrappingLabel();
			fFigureWaterheaterInlet_water_temperatureFigure.setText("<...>");

			this.add(fFigureWaterheaterInlet_water_temperatureFigure);

			fFigureWaterheaterHeat_modeFigure = new WrappingLabel();
			fFigureWaterheaterHeat_modeFigure.setText("<...>");

			this.add(fFigureWaterheaterHeat_modeFigure);

			fFigureWaterheaterLocationFigure = new WrappingLabel();
			fFigureWaterheaterLocationFigure.setText("<...>");

			this.add(fFigureWaterheaterLocationFigure);

			fFigureWaterheaterTank_setpointFigure = new WrappingLabel();
			fFigureWaterheaterTank_setpointFigure.setText("<...>");

			this.add(fFigureWaterheaterTank_setpointFigure);

			fFigureWaterheaterThermostat_deadbandFigure = new WrappingLabel();
			fFigureWaterheaterThermostat_deadbandFigure.setText("<...>");

			this.add(fFigureWaterheaterThermostat_deadbandFigure);

			fFigureWaterheaterTemperatureFigure = new WrappingLabel();
			fFigureWaterheaterTemperatureFigure.setText("<...>");

			this.add(fFigureWaterheaterTemperatureFigure);

			fFigureWaterheaterHeightFigure = new WrappingLabel();
			fFigureWaterheaterHeightFigure.setText("<...>");

			this.add(fFigureWaterheaterHeightFigure);

			fFigureWaterheaterDemandFigure = new WrappingLabel();
			fFigureWaterheaterDemandFigure.setText("<...>");

			this.add(fFigureWaterheaterDemandFigure);

			fFigureWaterheaterActual_loadFigure = new WrappingLabel();
			fFigureWaterheaterActual_loadFigure.setText("<...>");

			this.add(fFigureWaterheaterActual_loadFigure);

			fFigureWaterheaterShapeFigure = new WrappingLabel();
			fFigureWaterheaterShapeFigure.setText("<...>");

			this.add(fFigureWaterheaterShapeFigure);

			fFigureWaterheaterLoadFigure = new WrappingLabel();
			fFigureWaterheaterLoadFigure.setText("<...>");

			this.add(fFigureWaterheaterLoadFigure);

			fFigureWaterheaterEnergyFigure = new WrappingLabel();
			fFigureWaterheaterEnergyFigure.setText("<...>");

			this.add(fFigureWaterheaterEnergyFigure);

			fFigureWaterheaterPowerFigure = new WrappingLabel();
			fFigureWaterheaterPowerFigure.setText("<...>");

			this.add(fFigureWaterheaterPowerFigure);

			fFigureWaterheaterPeak_demandFigure = new WrappingLabel();
			fFigureWaterheaterPeak_demandFigure.setText("<...>");

			this.add(fFigureWaterheaterPeak_demandFigure);

			fFigureWaterheaterHeatgainFigure = new WrappingLabel();
			fFigureWaterheaterHeatgainFigure.setText("<...>");

			this.add(fFigureWaterheaterHeatgainFigure);

			fFigureWaterheaterHeatgain_fractionFigure = new WrappingLabel();
			fFigureWaterheaterHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureWaterheaterHeatgain_fractionFigure);

			fFigureWaterheaterCurrent_fractionFigure = new WrappingLabel();
			fFigureWaterheaterCurrent_fractionFigure.setText("<...>");

			this.add(fFigureWaterheaterCurrent_fractionFigure);

			fFigureWaterheaterImpedance_fractionFigure = new WrappingLabel();
			fFigureWaterheaterImpedance_fractionFigure.setText("<...>");

			this.add(fFigureWaterheaterImpedance_fractionFigure);

			fFigureWaterheaterPower_fractionFigure = new WrappingLabel();
			fFigureWaterheaterPower_fractionFigure.setText("<...>");

			this.add(fFigureWaterheaterPower_fractionFigure);

			fFigureWaterheaterPower_factorFigure = new WrappingLabel();
			fFigureWaterheaterPower_factorFigure.setText("<...>");

			this.add(fFigureWaterheaterPower_factorFigure);

			fFigureWaterheaterConstant_powerFigure = new WrappingLabel();
			fFigureWaterheaterConstant_powerFigure.setText("<...>");

			this.add(fFigureWaterheaterConstant_powerFigure);

			fFigureWaterheaterConstant_currentFigure = new WrappingLabel();
			fFigureWaterheaterConstant_currentFigure.setText("<...>");

			this.add(fFigureWaterheaterConstant_currentFigure);

			fFigureWaterheaterConstant_admittanceFigure = new WrappingLabel();
			fFigureWaterheaterConstant_admittanceFigure.setText("<...>");

			this.add(fFigureWaterheaterConstant_admittanceFigure);

			fFigureWaterheaterVoltage_factorFigure = new WrappingLabel();
			fFigureWaterheaterVoltage_factorFigure.setText("<...>");

			this.add(fFigureWaterheaterVoltage_factorFigure);

			fFigureWaterheaterConfigurationFigure = new WrappingLabel();
			fFigureWaterheaterConfigurationFigure.setText("<...>");

			this.add(fFigureWaterheaterConfigurationFigure);

			fFigureWaterheaterOverrideFigure = new WrappingLabel();
			fFigureWaterheaterOverrideFigure.setText("<...>");

			this.add(fFigureWaterheaterOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterNameFigure() {
			return fFigureWaterheaterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_volumeFigure() {
			return fFigureWaterheaterTank_volumeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_UAFigure() {
			return fFigureWaterheaterTank_UAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_diameterFigure() {
			return fFigureWaterheaterTank_diameterFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterWater_demandFigure() {
			return fFigureWaterheaterWater_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterHeating_element_capacityFigure() {
			return fFigureWaterheaterHeating_element_capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterInlet_water_temperatureFigure() {
			return fFigureWaterheaterInlet_water_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterHeat_modeFigure() {
			return fFigureWaterheaterHeat_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterLocationFigure() {
			return fFigureWaterheaterLocationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTank_setpointFigure() {
			return fFigureWaterheaterTank_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterThermostat_deadbandFigure() {
			return fFigureWaterheaterThermostat_deadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterTemperatureFigure() {
			return fFigureWaterheaterTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterHeightFigure() {
			return fFigureWaterheaterHeightFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterDemandFigure() {
			return fFigureWaterheaterDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterActual_loadFigure() {
			return fFigureWaterheaterActual_loadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterShapeFigure() {
			return fFigureWaterheaterShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterLoadFigure() {
			return fFigureWaterheaterLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterEnergyFigure() {
			return fFigureWaterheaterEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterPowerFigure() {
			return fFigureWaterheaterPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterPeak_demandFigure() {
			return fFigureWaterheaterPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterHeatgainFigure() {
			return fFigureWaterheaterHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterHeatgain_fractionFigure() {
			return fFigureWaterheaterHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterCurrent_fractionFigure() {
			return fFigureWaterheaterCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterImpedance_fractionFigure() {
			return fFigureWaterheaterImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterPower_fractionFigure() {
			return fFigureWaterheaterPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterPower_factorFigure() {
			return fFigureWaterheaterPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterConstant_powerFigure() {
			return fFigureWaterheaterConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterConstant_currentFigure() {
			return fFigureWaterheaterConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterConstant_admittanceFigure() {
			return fFigureWaterheaterConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterVoltage_factorFigure() {
			return fFigureWaterheaterVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterConfigurationFigure() {
			return fFigureWaterheaterConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWaterheaterOverrideFigure() {
			return fFigureWaterheaterOverrideFigure;
		}

	}

}
