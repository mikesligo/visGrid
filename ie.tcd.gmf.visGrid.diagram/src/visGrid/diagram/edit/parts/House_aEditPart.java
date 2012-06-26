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
public class House_aEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2038;

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
	public House_aEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.House_aItemSemanticEditPolicy());
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
		return primaryShape = new House_aFigure();
	}

	/**
	 * @generated
	 */
	public House_aFigure getPrimaryShape() {
		return (House_aFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.House_aNameEditPart) {
			((visGrid.diagram.edit.parts.House_aNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureHouse_aNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.House_aNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.House_aNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.House_aConnection_4044) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsHouse_a_4003) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class House_aFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aFloor_areaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aGross_wall_areaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aCeiling_heightFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aAspect_ratioFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aEnvelope_UAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aWindow_wall_ratioFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aGlazing_shgcFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aAirchange_per_hourFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aSolar_gainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHeat_cool_gainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aThermostat_deadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHeating_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aCooling_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aDesign_heating_capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aDesign_cooling_capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHeating_COPFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aCooling_COPFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aCOP_coeffFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aAir_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aOutside_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aMass_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aMass_heat_coeffFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aOutdoor_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouse_thermal_massFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHeat_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHc_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseloadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__peak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__heatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__heatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__current_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__impedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__power_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__power_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__constant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__constant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__constant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__voltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHouseload__configurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHouse_aOverrideFigure;

		/**
		 * @generated
		 */
		public House_aFigure() {

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

			fFigureHouse_aNameFigure = new WrappingLabel();
			fFigureHouse_aNameFigure.setText("<...>");

			this.add(fFigureHouse_aNameFigure);

			fFigureHouse_aFloor_areaFigure = new WrappingLabel();
			fFigureHouse_aFloor_areaFigure.setText("<...>");

			this.add(fFigureHouse_aFloor_areaFigure);

			fFigureHouse_aGross_wall_areaFigure = new WrappingLabel();
			fFigureHouse_aGross_wall_areaFigure.setText("<...>");

			this.add(fFigureHouse_aGross_wall_areaFigure);

			fFigureHouse_aCeiling_heightFigure = new WrappingLabel();
			fFigureHouse_aCeiling_heightFigure.setText("<...>");

			this.add(fFigureHouse_aCeiling_heightFigure);

			fFigureHouse_aAspect_ratioFigure = new WrappingLabel();
			fFigureHouse_aAspect_ratioFigure.setText("<...>");

			this.add(fFigureHouse_aAspect_ratioFigure);

			fFigureHouse_aEnvelope_UAFigure = new WrappingLabel();
			fFigureHouse_aEnvelope_UAFigure.setText("<...>");

			this.add(fFigureHouse_aEnvelope_UAFigure);

			fFigureHouse_aWindow_wall_ratioFigure = new WrappingLabel();
			fFigureHouse_aWindow_wall_ratioFigure.setText("<...>");

			this.add(fFigureHouse_aWindow_wall_ratioFigure);

			fFigureHouse_aGlazing_shgcFigure = new WrappingLabel();
			fFigureHouse_aGlazing_shgcFigure.setText("<...>");

			this.add(fFigureHouse_aGlazing_shgcFigure);

			fFigureHouse_aAirchange_per_hourFigure = new WrappingLabel();
			fFigureHouse_aAirchange_per_hourFigure.setText("<...>");

			this.add(fFigureHouse_aAirchange_per_hourFigure);

			fFigureHouse_aSolar_gainFigure = new WrappingLabel();
			fFigureHouse_aSolar_gainFigure.setText("<...>");

			this.add(fFigureHouse_aSolar_gainFigure);

			fFigureHouse_aHeat_cool_gainFigure = new WrappingLabel();
			fFigureHouse_aHeat_cool_gainFigure.setText("<...>");

			this.add(fFigureHouse_aHeat_cool_gainFigure);

			fFigureHouse_aThermostat_deadbandFigure = new WrappingLabel();
			fFigureHouse_aThermostat_deadbandFigure.setText("<...>");

			this.add(fFigureHouse_aThermostat_deadbandFigure);

			fFigureHouse_aHeating_setpointFigure = new WrappingLabel();
			fFigureHouse_aHeating_setpointFigure.setText("<...>");

			this.add(fFigureHouse_aHeating_setpointFigure);

			fFigureHouse_aCooling_setpointFigure = new WrappingLabel();
			fFigureHouse_aCooling_setpointFigure.setText("<...>");

			this.add(fFigureHouse_aCooling_setpointFigure);

			fFigureHouse_aDesign_heating_capacityFigure = new WrappingLabel();
			fFigureHouse_aDesign_heating_capacityFigure.setText("<...>");

			this.add(fFigureHouse_aDesign_heating_capacityFigure);

			fFigureHouse_aDesign_cooling_capacityFigure = new WrappingLabel();
			fFigureHouse_aDesign_cooling_capacityFigure.setText("<...>");

			this.add(fFigureHouse_aDesign_cooling_capacityFigure);

			fFigureHouse_aHeating_COPFigure = new WrappingLabel();
			fFigureHouse_aHeating_COPFigure.setText("<...>");

			this.add(fFigureHouse_aHeating_COPFigure);

			fFigureHouse_aCooling_COPFigure = new WrappingLabel();
			fFigureHouse_aCooling_COPFigure.setText("<...>");

			this.add(fFigureHouse_aCooling_COPFigure);

			fFigureHouse_aCOP_coeffFigure = new WrappingLabel();
			fFigureHouse_aCOP_coeffFigure.setText("<...>");

			this.add(fFigureHouse_aCOP_coeffFigure);

			fFigureHouse_aAir_temperatureFigure = new WrappingLabel();
			fFigureHouse_aAir_temperatureFigure.setText("<...>");

			this.add(fFigureHouse_aAir_temperatureFigure);

			fFigureHouse_aOutside_tempFigure = new WrappingLabel();
			fFigureHouse_aOutside_tempFigure.setText("<...>");

			this.add(fFigureHouse_aOutside_tempFigure);

			fFigureHouse_aMass_temperatureFigure = new WrappingLabel();
			fFigureHouse_aMass_temperatureFigure.setText("<...>");

			this.add(fFigureHouse_aMass_temperatureFigure);

			fFigureHouse_aMass_heat_coeffFigure = new WrappingLabel();
			fFigureHouse_aMass_heat_coeffFigure.setText("<...>");

			this.add(fFigureHouse_aMass_heat_coeffFigure);

			fFigureHouse_aOutdoor_temperatureFigure = new WrappingLabel();
			fFigureHouse_aOutdoor_temperatureFigure.setText("<...>");

			this.add(fFigureHouse_aOutdoor_temperatureFigure);

			fFigureHouse_aHouse_thermal_massFigure = new WrappingLabel();
			fFigureHouse_aHouse_thermal_massFigure.setText("<...>");

			this.add(fFigureHouse_aHouse_thermal_massFigure);

			fFigureHouse_aHeat_modeFigure = new WrappingLabel();
			fFigureHouse_aHeat_modeFigure.setText("<...>");

			this.add(fFigureHouse_aHeat_modeFigure);

			fFigureHouse_aHc_modeFigure = new WrappingLabel();
			fFigureHouse_aHc_modeFigure.setText("<...>");

			this.add(fFigureHouse_aHc_modeFigure);

			fFigureHouse_aHouseloadFigure = new WrappingLabel();
			fFigureHouse_aHouseloadFigure.setText("<...>");

			this.add(fFigureHouse_aHouseloadFigure);

			fFigureHouse_aHouseload__energyFigure = new WrappingLabel();
			fFigureHouse_aHouseload__energyFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__energyFigure);

			fFigureHouse_aHouseload__powerFigure = new WrappingLabel();
			fFigureHouse_aHouseload__powerFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__powerFigure);

			fFigureHouse_aHouseload__peak_demandFigure = new WrappingLabel();
			fFigureHouse_aHouseload__peak_demandFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__peak_demandFigure);

			fFigureHouse_aHouseload__heatgainFigure = new WrappingLabel();
			fFigureHouse_aHouseload__heatgainFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__heatgainFigure);

			fFigureHouse_aHouseload__heatgain_fractionFigure = new WrappingLabel();
			fFigureHouse_aHouseload__heatgain_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__heatgain_fractionFigure);

			fFigureHouse_aHouseload__current_fractionFigure = new WrappingLabel();
			fFigureHouse_aHouseload__current_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__current_fractionFigure);

			fFigureHouse_aHouseload__impedance_fractionFigure = new WrappingLabel();
			fFigureHouse_aHouseload__impedance_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__impedance_fractionFigure);

			fFigureHouse_aHouseload__power_fractionFigure = new WrappingLabel();
			fFigureHouse_aHouseload__power_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__power_fractionFigure);

			fFigureHouse_aHouseload__power_factorFigure = new WrappingLabel();
			fFigureHouse_aHouseload__power_factorFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__power_factorFigure);

			fFigureHouse_aHouseload__constant_powerFigure = new WrappingLabel();
			fFigureHouse_aHouseload__constant_powerFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__constant_powerFigure);

			fFigureHouse_aHouseload__constant_currentFigure = new WrappingLabel();
			fFigureHouse_aHouseload__constant_currentFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__constant_currentFigure);

			fFigureHouse_aHouseload__constant_admittanceFigure = new WrappingLabel();
			fFigureHouse_aHouseload__constant_admittanceFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__constant_admittanceFigure);

			fFigureHouse_aHouseload__voltage_factorFigure = new WrappingLabel();
			fFigureHouse_aHouseload__voltage_factorFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__voltage_factorFigure);

			fFigureHouse_aHouseload__configurationFigure = new WrappingLabel();
			fFigureHouse_aHouseload__configurationFigure.setText("<...>");

			this.add(fFigureHouse_aHouseload__configurationFigure);

			fFigureHouse_aShapeFigure = new WrappingLabel();
			fFigureHouse_aShapeFigure.setText("<...>");

			this.add(fFigureHouse_aShapeFigure);

			fFigureHouse_aLoadFigure = new WrappingLabel();
			fFigureHouse_aLoadFigure.setText("<...>");

			this.add(fFigureHouse_aLoadFigure);

			fFigureHouse_aEnergyFigure = new WrappingLabel();
			fFigureHouse_aEnergyFigure.setText("<...>");

			this.add(fFigureHouse_aEnergyFigure);

			fFigureHouse_aPowerFigure = new WrappingLabel();
			fFigureHouse_aPowerFigure.setText("<...>");

			this.add(fFigureHouse_aPowerFigure);

			fFigureHouse_aPeak_demandFigure = new WrappingLabel();
			fFigureHouse_aPeak_demandFigure.setText("<...>");

			this.add(fFigureHouse_aPeak_demandFigure);

			fFigureHouse_aHeatgainFigure = new WrappingLabel();
			fFigureHouse_aHeatgainFigure.setText("<...>");

			this.add(fFigureHouse_aHeatgainFigure);

			fFigureHouse_aHeatgain_fractionFigure = new WrappingLabel();
			fFigureHouse_aHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aHeatgain_fractionFigure);

			fFigureHouse_aCurrent_fractionFigure = new WrappingLabel();
			fFigureHouse_aCurrent_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aCurrent_fractionFigure);

			fFigureHouse_aImpedance_fractionFigure = new WrappingLabel();
			fFigureHouse_aImpedance_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aImpedance_fractionFigure);

			fFigureHouse_aPower_fractionFigure = new WrappingLabel();
			fFigureHouse_aPower_fractionFigure.setText("<...>");

			this.add(fFigureHouse_aPower_fractionFigure);

			fFigureHouse_aPower_factorFigure = new WrappingLabel();
			fFigureHouse_aPower_factorFigure.setText("<...>");

			this.add(fFigureHouse_aPower_factorFigure);

			fFigureHouse_aConstant_powerFigure = new WrappingLabel();
			fFigureHouse_aConstant_powerFigure.setText("<...>");

			this.add(fFigureHouse_aConstant_powerFigure);

			fFigureHouse_aConstant_currentFigure = new WrappingLabel();
			fFigureHouse_aConstant_currentFigure.setText("<...>");

			this.add(fFigureHouse_aConstant_currentFigure);

			fFigureHouse_aConstant_admittanceFigure = new WrappingLabel();
			fFigureHouse_aConstant_admittanceFigure.setText("<...>");

			this.add(fFigureHouse_aConstant_admittanceFigure);

			fFigureHouse_aVoltage_factorFigure = new WrappingLabel();
			fFigureHouse_aVoltage_factorFigure.setText("<...>");

			this.add(fFigureHouse_aVoltage_factorFigure);

			fFigureHouse_aConfigurationFigure = new WrappingLabel();
			fFigureHouse_aConfigurationFigure.setText("<...>");

			this.add(fFigureHouse_aConfigurationFigure);

			fFigureHouse_aOverrideFigure = new WrappingLabel();
			fFigureHouse_aOverrideFigure.setText("<...>");

			this.add(fFigureHouse_aOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aNameFigure() {
			return fFigureHouse_aNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aFloor_areaFigure() {
			return fFigureHouse_aFloor_areaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aGross_wall_areaFigure() {
			return fFigureHouse_aGross_wall_areaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aCeiling_heightFigure() {
			return fFigureHouse_aCeiling_heightFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aAspect_ratioFigure() {
			return fFigureHouse_aAspect_ratioFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aEnvelope_UAFigure() {
			return fFigureHouse_aEnvelope_UAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aWindow_wall_ratioFigure() {
			return fFigureHouse_aWindow_wall_ratioFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aGlazing_shgcFigure() {
			return fFigureHouse_aGlazing_shgcFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aAirchange_per_hourFigure() {
			return fFigureHouse_aAirchange_per_hourFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aSolar_gainFigure() {
			return fFigureHouse_aSolar_gainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHeat_cool_gainFigure() {
			return fFigureHouse_aHeat_cool_gainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aThermostat_deadbandFigure() {
			return fFigureHouse_aThermostat_deadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHeating_setpointFigure() {
			return fFigureHouse_aHeating_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aCooling_setpointFigure() {
			return fFigureHouse_aCooling_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aDesign_heating_capacityFigure() {
			return fFigureHouse_aDesign_heating_capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aDesign_cooling_capacityFigure() {
			return fFigureHouse_aDesign_cooling_capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHeating_COPFigure() {
			return fFigureHouse_aHeating_COPFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aCooling_COPFigure() {
			return fFigureHouse_aCooling_COPFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aCOP_coeffFigure() {
			return fFigureHouse_aCOP_coeffFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aAir_temperatureFigure() {
			return fFigureHouse_aAir_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aOutside_tempFigure() {
			return fFigureHouse_aOutside_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aMass_temperatureFigure() {
			return fFigureHouse_aMass_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aMass_heat_coeffFigure() {
			return fFigureHouse_aMass_heat_coeffFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aOutdoor_temperatureFigure() {
			return fFigureHouse_aOutdoor_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouse_thermal_massFigure() {
			return fFigureHouse_aHouse_thermal_massFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHeat_modeFigure() {
			return fFigureHouse_aHeat_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHc_modeFigure() {
			return fFigureHouse_aHc_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseloadFigure() {
			return fFigureHouse_aHouseloadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__energyFigure() {
			return fFigureHouse_aHouseload__energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__powerFigure() {
			return fFigureHouse_aHouseload__powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__peak_demandFigure() {
			return fFigureHouse_aHouseload__peak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__heatgainFigure() {
			return fFigureHouse_aHouseload__heatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__heatgain_fractionFigure() {
			return fFigureHouse_aHouseload__heatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__current_fractionFigure() {
			return fFigureHouse_aHouseload__current_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__impedance_fractionFigure() {
			return fFigureHouse_aHouseload__impedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__power_fractionFigure() {
			return fFigureHouse_aHouseload__power_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__power_factorFigure() {
			return fFigureHouse_aHouseload__power_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__constant_powerFigure() {
			return fFigureHouse_aHouseload__constant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__constant_currentFigure() {
			return fFigureHouse_aHouseload__constant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__constant_admittanceFigure() {
			return fFigureHouse_aHouseload__constant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__voltage_factorFigure() {
			return fFigureHouse_aHouseload__voltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHouseload__configurationFigure() {
			return fFigureHouse_aHouseload__configurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aShapeFigure() {
			return fFigureHouse_aShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aLoadFigure() {
			return fFigureHouse_aLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aEnergyFigure() {
			return fFigureHouse_aEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aPowerFigure() {
			return fFigureHouse_aPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aPeak_demandFigure() {
			return fFigureHouse_aPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHeatgainFigure() {
			return fFigureHouse_aHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aHeatgain_fractionFigure() {
			return fFigureHouse_aHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aCurrent_fractionFigure() {
			return fFigureHouse_aCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aImpedance_fractionFigure() {
			return fFigureHouse_aImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aPower_fractionFigure() {
			return fFigureHouse_aPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aPower_factorFigure() {
			return fFigureHouse_aPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aConstant_powerFigure() {
			return fFigureHouse_aConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aConstant_currentFigure() {
			return fFigureHouse_aConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aConstant_admittanceFigure() {
			return fFigureHouse_aConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aVoltage_factorFigure() {
			return fFigureHouse_aVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aConfigurationFigure() {
			return fFigureHouse_aConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHouse_aOverrideFigure() {
			return fFigureHouse_aOverrideFigure;
		}

	}

}