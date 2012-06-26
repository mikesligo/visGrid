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
	public static final int VISUAL_ID = 2009;

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
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2078);
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
