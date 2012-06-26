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
public class Triplex_nodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2048;

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
	public Triplex_nodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Triplex_nodeItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_nodeFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_nodeFigure getPrimaryShape() {
		return (Triplex_nodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeNameEditPart) {
			((visGrid.diagram.edit.parts.Triplex_nodeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTriplex_nodeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Triplex_nodeNameEditPart.VISUAL_ID));
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
	public class Triplex_nodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_1NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeVoltage_2NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_N_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_N_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeCurrent_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_1_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_2_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeResidential_nominal_current_12_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePower_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeShunt_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeShunt_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeShunt_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeImpedance_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeHouse_presentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNR_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodePhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_nodeNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Triplex_nodeFigure() {

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

			fFigureTriplex_nodeNameFigure = new WrappingLabel();
			fFigureTriplex_nodeNameFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNameFigure);

			fFigureTriplex_nodeBustypeFigure = new WrappingLabel();
			fFigureTriplex_nodeBustypeFigure.setText("<...>");

			this.add(fFigureTriplex_nodeBustypeFigure);

			fFigureTriplex_nodeBusflagsFigure = new WrappingLabel();
			fFigureTriplex_nodeBusflagsFigure.setText("<...>");

			this.add(fFigureTriplex_nodeBusflagsFigure);

			fFigureTriplex_nodeReference_busFigure = new WrappingLabel();
			fFigureTriplex_nodeReference_busFigure.setText("<...>");

			this.add(fFigureTriplex_nodeReference_busFigure);

			fFigureTriplex_nodeMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureTriplex_nodeMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureTriplex_nodeMaximum_voltage_errorFigure);

			fFigureTriplex_nodeVoltage_1Figure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_1Figure);

			fFigureTriplex_nodeVoltage_2Figure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_2Figure);

			fFigureTriplex_nodeVoltage_NFigure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_NFigure);

			fFigureTriplex_nodeVoltage_12Figure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_12Figure);

			fFigureTriplex_nodeVoltage_1NFigure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_1NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_1NFigure);

			fFigureTriplex_nodeVoltage_2NFigure = new WrappingLabel();
			fFigureTriplex_nodeVoltage_2NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeVoltage_2NFigure);

			fFigureTriplex_nodeCurrent_1Figure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_1Figure);

			fFigureTriplex_nodeCurrent_2Figure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_2Figure);

			fFigureTriplex_nodeCurrent_NFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_NFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_NFigure);

			fFigureTriplex_nodeCurrent_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_1_realFigure);

			fFigureTriplex_nodeCurrent_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_2_realFigure);

			fFigureTriplex_nodeCurrent_N_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_N_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_N_realFigure);

			fFigureTriplex_nodeCurrent_1_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_1_reacFigure);

			fFigureTriplex_nodeCurrent_2_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_2_reacFigure);

			fFigureTriplex_nodeCurrent_N_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_N_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_N_reacFigure);

			fFigureTriplex_nodeCurrent_12Figure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_12Figure);

			fFigureTriplex_nodeCurrent_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_12_realFigure);

			fFigureTriplex_nodeCurrent_12_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeCurrent_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeCurrent_12_reacFigure);

			fFigureTriplex_nodeResidential_nominal_current_1Figure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_1Figure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_1Figure);

			fFigureTriplex_nodeResidential_nominal_current_2Figure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_2Figure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_2Figure);

			fFigureTriplex_nodeResidential_nominal_current_12Figure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_12Figure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_12Figure);

			fFigureTriplex_nodeResidential_nominal_current_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_1_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_1_realFigure);

			fFigureTriplex_nodeResidential_nominal_current_1_imagFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_1_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_1_imagFigure);

			fFigureTriplex_nodeResidential_nominal_current_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_2_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_2_realFigure);

			fFigureTriplex_nodeResidential_nominal_current_2_imagFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_2_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_2_imagFigure);

			fFigureTriplex_nodeResidential_nominal_current_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_12_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_12_realFigure);

			fFigureTriplex_nodeResidential_nominal_current_12_imagFigure = new WrappingLabel();
			fFigureTriplex_nodeResidential_nominal_current_12_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_nodeResidential_nominal_current_12_imagFigure);

			fFigureTriplex_nodePower_1Figure = new WrappingLabel();
			fFigureTriplex_nodePower_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodePower_1Figure);

			fFigureTriplex_nodePower_2Figure = new WrappingLabel();
			fFigureTriplex_nodePower_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodePower_2Figure);

			fFigureTriplex_nodePower_12Figure = new WrappingLabel();
			fFigureTriplex_nodePower_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodePower_12Figure);

			fFigureTriplex_nodePower_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodePower_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_1_realFigure);

			fFigureTriplex_nodePower_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodePower_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_2_realFigure);

			fFigureTriplex_nodePower_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodePower_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_12_realFigure);

			fFigureTriplex_nodePower_1_reacFigure = new WrappingLabel();
			fFigureTriplex_nodePower_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_1_reacFigure);

			fFigureTriplex_nodePower_2_reacFigure = new WrappingLabel();
			fFigureTriplex_nodePower_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_2_reacFigure);

			fFigureTriplex_nodePower_12_reacFigure = new WrappingLabel();
			fFigureTriplex_nodePower_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodePower_12_reacFigure);

			fFigureTriplex_nodeShunt_1Figure = new WrappingLabel();
			fFigureTriplex_nodeShunt_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeShunt_1Figure);

			fFigureTriplex_nodeShunt_2Figure = new WrappingLabel();
			fFigureTriplex_nodeShunt_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeShunt_2Figure);

			fFigureTriplex_nodeShunt_12Figure = new WrappingLabel();
			fFigureTriplex_nodeShunt_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeShunt_12Figure);

			fFigureTriplex_nodeImpedance_1Figure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_1Figure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_1Figure);

			fFigureTriplex_nodeImpedance_2Figure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_2Figure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_2Figure);

			fFigureTriplex_nodeImpedance_12Figure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_12Figure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_12Figure);

			fFigureTriplex_nodeImpedance_1_realFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_1_realFigure);

			fFigureTriplex_nodeImpedance_2_realFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_2_realFigure);

			fFigureTriplex_nodeImpedance_12_realFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_12_realFigure);

			fFigureTriplex_nodeImpedance_1_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_1_reacFigure);

			fFigureTriplex_nodeImpedance_2_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_2_reacFigure);

			fFigureTriplex_nodeImpedance_12_reacFigure = new WrappingLabel();
			fFigureTriplex_nodeImpedance_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_nodeImpedance_12_reacFigure);

			fFigureTriplex_nodeHouse_presentFigure = new WrappingLabel();
			fFigureTriplex_nodeHouse_presentFigure.setText("<...>");

			this.add(fFigureTriplex_nodeHouse_presentFigure);

			fFigureTriplex_nodeNR_modeFigure = new WrappingLabel();
			fFigureTriplex_nodeNR_modeFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNR_modeFigure);

			fFigureTriplex_nodePhasesFigure = new WrappingLabel();
			fFigureTriplex_nodePhasesFigure.setText("<...>");

			this.add(fFigureTriplex_nodePhasesFigure);

			fFigureTriplex_nodeNominal_voltageFigure = new WrappingLabel();
			fFigureTriplex_nodeNominal_voltageFigure.setText("<...>");

			this.add(fFigureTriplex_nodeNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNameFigure() {
			return fFigureTriplex_nodeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeBustypeFigure() {
			return fFigureTriplex_nodeBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeBusflagsFigure() {
			return fFigureTriplex_nodeBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeReference_busFigure() {
			return fFigureTriplex_nodeReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeMaximum_voltage_errorFigure() {
			return fFigureTriplex_nodeMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_1Figure() {
			return fFigureTriplex_nodeVoltage_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_2Figure() {
			return fFigureTriplex_nodeVoltage_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_NFigure() {
			return fFigureTriplex_nodeVoltage_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_12Figure() {
			return fFigureTriplex_nodeVoltage_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_1NFigure() {
			return fFigureTriplex_nodeVoltage_1NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeVoltage_2NFigure() {
			return fFigureTriplex_nodeVoltage_2NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_1Figure() {
			return fFigureTriplex_nodeCurrent_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_2Figure() {
			return fFigureTriplex_nodeCurrent_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_NFigure() {
			return fFigureTriplex_nodeCurrent_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_1_realFigure() {
			return fFigureTriplex_nodeCurrent_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_2_realFigure() {
			return fFigureTriplex_nodeCurrent_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_N_realFigure() {
			return fFigureTriplex_nodeCurrent_N_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_1_reacFigure() {
			return fFigureTriplex_nodeCurrent_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_2_reacFigure() {
			return fFigureTriplex_nodeCurrent_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_N_reacFigure() {
			return fFigureTriplex_nodeCurrent_N_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_12Figure() {
			return fFigureTriplex_nodeCurrent_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_12_realFigure() {
			return fFigureTriplex_nodeCurrent_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeCurrent_12_reacFigure() {
			return fFigureTriplex_nodeCurrent_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_1Figure() {
			return fFigureTriplex_nodeResidential_nominal_current_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_2Figure() {
			return fFigureTriplex_nodeResidential_nominal_current_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_12Figure() {
			return fFigureTriplex_nodeResidential_nominal_current_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_1_realFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_1_imagFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_1_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_2_realFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_2_imagFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_2_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_12_realFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeResidential_nominal_current_12_imagFigure() {
			return fFigureTriplex_nodeResidential_nominal_current_12_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_1Figure() {
			return fFigureTriplex_nodePower_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_2Figure() {
			return fFigureTriplex_nodePower_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_12Figure() {
			return fFigureTriplex_nodePower_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_1_realFigure() {
			return fFigureTriplex_nodePower_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_2_realFigure() {
			return fFigureTriplex_nodePower_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_12_realFigure() {
			return fFigureTriplex_nodePower_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_1_reacFigure() {
			return fFigureTriplex_nodePower_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_2_reacFigure() {
			return fFigureTriplex_nodePower_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePower_12_reacFigure() {
			return fFigureTriplex_nodePower_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeShunt_1Figure() {
			return fFigureTriplex_nodeShunt_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeShunt_2Figure() {
			return fFigureTriplex_nodeShunt_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeShunt_12Figure() {
			return fFigureTriplex_nodeShunt_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_1Figure() {
			return fFigureTriplex_nodeImpedance_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_2Figure() {
			return fFigureTriplex_nodeImpedance_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_12Figure() {
			return fFigureTriplex_nodeImpedance_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_1_realFigure() {
			return fFigureTriplex_nodeImpedance_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_2_realFigure() {
			return fFigureTriplex_nodeImpedance_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_12_realFigure() {
			return fFigureTriplex_nodeImpedance_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_1_reacFigure() {
			return fFigureTriplex_nodeImpedance_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_2_reacFigure() {
			return fFigureTriplex_nodeImpedance_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeImpedance_12_reacFigure() {
			return fFigureTriplex_nodeImpedance_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeHouse_presentFigure() {
			return fFigureTriplex_nodeHouse_presentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNR_modeFigure() {
			return fFigureTriplex_nodeNR_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodePhasesFigure() {
			return fFigureTriplex_nodePhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_nodeNominal_voltageFigure() {
			return fFigureTriplex_nodeNominal_voltageFigure;
		}

	}

}
