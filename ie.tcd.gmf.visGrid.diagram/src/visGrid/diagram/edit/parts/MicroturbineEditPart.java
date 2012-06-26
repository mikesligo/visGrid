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
public class MicroturbineEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2043;

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
	public MicroturbineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.MicroturbineItemSemanticEditPolicy());
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
		return primaryShape = new MicroturbineFigure();
	}

	/**
	 * @generated
	 */
	public MicroturbineFigure getPrimaryShape() {
		return (MicroturbineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MicroturbineNameEditPart) {
			((visGrid.diagram.edit.parts.MicroturbineNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMicroturbineNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MicroturbineNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID));
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
	public class MicroturbineFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineRinternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineRloadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineV_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineI_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineFrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMax_FrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMin_FrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineFuel_UsedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineHeat_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineKVFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_AngleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMax_PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMin_PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseA_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseB_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseC_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseA_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseB_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseC_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_A_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_B_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_C_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePf_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineE_A_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineE_B_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineE_C_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineEfficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhasesFigure;

		/**
		 * @generated
		 */
		public MicroturbineFigure() {

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

			fFigureMicroturbineNameFigure = new WrappingLabel();
			fFigureMicroturbineNameFigure.setText("<...>");

			this.add(fFigureMicroturbineNameFigure);

			fFigureMicroturbineGenerator_modeFigure = new WrappingLabel();
			fFigureMicroturbineGenerator_modeFigure.setText("<...>");

			this.add(fFigureMicroturbineGenerator_modeFigure);

			fFigureMicroturbineGenerator_statusFigure = new WrappingLabel();
			fFigureMicroturbineGenerator_statusFigure.setText("<...>");

			this.add(fFigureMicroturbineGenerator_statusFigure);

			fFigureMicroturbinePower_typeFigure = new WrappingLabel();
			fFigureMicroturbinePower_typeFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_typeFigure);

			fFigureMicroturbineRinternalFigure = new WrappingLabel();
			fFigureMicroturbineRinternalFigure.setText("<...>");

			this.add(fFigureMicroturbineRinternalFigure);

			fFigureMicroturbineRloadFigure = new WrappingLabel();
			fFigureMicroturbineRloadFigure.setText("<...>");

			this.add(fFigureMicroturbineRloadFigure);

			fFigureMicroturbineV_MaxFigure = new WrappingLabel();
			fFigureMicroturbineV_MaxFigure.setText("<...>");

			this.add(fFigureMicroturbineV_MaxFigure);

			fFigureMicroturbineI_MaxFigure = new WrappingLabel();
			fFigureMicroturbineI_MaxFigure.setText("<...>");

			this.add(fFigureMicroturbineI_MaxFigure);

			fFigureMicroturbineFrequencyFigure = new WrappingLabel();
			fFigureMicroturbineFrequencyFigure.setText("<...>");

			this.add(fFigureMicroturbineFrequencyFigure);

			fFigureMicroturbineMax_FrequencyFigure = new WrappingLabel();
			fFigureMicroturbineMax_FrequencyFigure.setText("<...>");

			this.add(fFigureMicroturbineMax_FrequencyFigure);

			fFigureMicroturbineMin_FrequencyFigure = new WrappingLabel();
			fFigureMicroturbineMin_FrequencyFigure.setText("<...>");

			this.add(fFigureMicroturbineMin_FrequencyFigure);

			fFigureMicroturbineFuel_UsedFigure = new WrappingLabel();
			fFigureMicroturbineFuel_UsedFigure.setText("<...>");

			this.add(fFigureMicroturbineFuel_UsedFigure);

			fFigureMicroturbineHeat_OutFigure = new WrappingLabel();
			fFigureMicroturbineHeat_OutFigure.setText("<...>");

			this.add(fFigureMicroturbineHeat_OutFigure);

			fFigureMicroturbineKVFigure = new WrappingLabel();
			fFigureMicroturbineKVFigure.setText("<...>");

			this.add(fFigureMicroturbineKVFigure);

			fFigureMicroturbinePower_AngleFigure = new WrappingLabel();
			fFigureMicroturbinePower_AngleFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_AngleFigure);

			fFigureMicroturbineMax_PFigure = new WrappingLabel();
			fFigureMicroturbineMax_PFigure.setText("<...>");

			this.add(fFigureMicroturbineMax_PFigure);

			fFigureMicroturbineMin_PFigure = new WrappingLabel();
			fFigureMicroturbineMin_PFigure.setText("<...>");

			this.add(fFigureMicroturbineMin_PFigure);

			fFigureMicroturbinePhaseA_V_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseA_V_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseA_V_OutFigure);

			fFigureMicroturbinePhaseB_V_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseB_V_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseB_V_OutFigure);

			fFigureMicroturbinePhaseC_V_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseC_V_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseC_V_OutFigure);

			fFigureMicroturbinePhaseA_I_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseA_I_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseA_I_OutFigure);

			fFigureMicroturbinePhaseB_I_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseB_I_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseB_I_OutFigure);

			fFigureMicroturbinePhaseC_I_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseC_I_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseC_I_OutFigure);

			fFigureMicroturbinePower_A_OutFigure = new WrappingLabel();
			fFigureMicroturbinePower_A_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_A_OutFigure);

			fFigureMicroturbinePower_B_OutFigure = new WrappingLabel();
			fFigureMicroturbinePower_B_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_B_OutFigure);

			fFigureMicroturbinePower_C_OutFigure = new WrappingLabel();
			fFigureMicroturbinePower_C_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_C_OutFigure);

			fFigureMicroturbineVA_OutFigure = new WrappingLabel();
			fFigureMicroturbineVA_OutFigure.setText("<...>");

			this.add(fFigureMicroturbineVA_OutFigure);

			fFigureMicroturbinePf_OutFigure = new WrappingLabel();
			fFigureMicroturbinePf_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePf_OutFigure);

			fFigureMicroturbineE_A_InternalFigure = new WrappingLabel();
			fFigureMicroturbineE_A_InternalFigure.setText("<...>");

			this.add(fFigureMicroturbineE_A_InternalFigure);

			fFigureMicroturbineE_B_InternalFigure = new WrappingLabel();
			fFigureMicroturbineE_B_InternalFigure.setText("<...>");

			this.add(fFigureMicroturbineE_B_InternalFigure);

			fFigureMicroturbineE_C_InternalFigure = new WrappingLabel();
			fFigureMicroturbineE_C_InternalFigure.setText("<...>");

			this.add(fFigureMicroturbineE_C_InternalFigure);

			fFigureMicroturbineEfficiencyFigure = new WrappingLabel();
			fFigureMicroturbineEfficiencyFigure.setText("<...>");

			this.add(fFigureMicroturbineEfficiencyFigure);

			fFigureMicroturbineRated_kVAFigure = new WrappingLabel();
			fFigureMicroturbineRated_kVAFigure.setText("<...>");

			this.add(fFigureMicroturbineRated_kVAFigure);

			fFigureMicroturbinePhasesFigure = new WrappingLabel();
			fFigureMicroturbinePhasesFigure.setText("<...>");

			this.add(fFigureMicroturbinePhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineNameFigure() {
			return fFigureMicroturbineNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineGenerator_modeFigure() {
			return fFigureMicroturbineGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineGenerator_statusFigure() {
			return fFigureMicroturbineGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_typeFigure() {
			return fFigureMicroturbinePower_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineRinternalFigure() {
			return fFigureMicroturbineRinternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineRloadFigure() {
			return fFigureMicroturbineRloadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineV_MaxFigure() {
			return fFigureMicroturbineV_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineI_MaxFigure() {
			return fFigureMicroturbineI_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineFrequencyFigure() {
			return fFigureMicroturbineFrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMax_FrequencyFigure() {
			return fFigureMicroturbineMax_FrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMin_FrequencyFigure() {
			return fFigureMicroturbineMin_FrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineFuel_UsedFigure() {
			return fFigureMicroturbineFuel_UsedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineHeat_OutFigure() {
			return fFigureMicroturbineHeat_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineKVFigure() {
			return fFigureMicroturbineKVFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_AngleFigure() {
			return fFigureMicroturbinePower_AngleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMax_PFigure() {
			return fFigureMicroturbineMax_PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMin_PFigure() {
			return fFigureMicroturbineMin_PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseA_V_OutFigure() {
			return fFigureMicroturbinePhaseA_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseB_V_OutFigure() {
			return fFigureMicroturbinePhaseB_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseC_V_OutFigure() {
			return fFigureMicroturbinePhaseC_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseA_I_OutFigure() {
			return fFigureMicroturbinePhaseA_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseB_I_OutFigure() {
			return fFigureMicroturbinePhaseB_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseC_I_OutFigure() {
			return fFigureMicroturbinePhaseC_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_A_OutFigure() {
			return fFigureMicroturbinePower_A_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_B_OutFigure() {
			return fFigureMicroturbinePower_B_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_C_OutFigure() {
			return fFigureMicroturbinePower_C_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineVA_OutFigure() {
			return fFigureMicroturbineVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePf_OutFigure() {
			return fFigureMicroturbinePf_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineE_A_InternalFigure() {
			return fFigureMicroturbineE_A_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineE_B_InternalFigure() {
			return fFigureMicroturbineE_B_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineE_C_InternalFigure() {
			return fFigureMicroturbineE_C_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineEfficiencyFigure() {
			return fFigureMicroturbineEfficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineRated_kVAFigure() {
			return fFigureMicroturbineRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhasesFigure() {
			return fFigureMicroturbinePhasesFigure;
		}

	}

}
