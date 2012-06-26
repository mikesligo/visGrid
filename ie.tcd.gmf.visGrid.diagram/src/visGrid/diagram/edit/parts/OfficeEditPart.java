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
public class OfficeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public OfficeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.OfficeItemSemanticEditPolicy());
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
		return primaryShape = new OfficeFigure();
	}

	/**
	 * @generated
	 */
	public OfficeFigure getPrimaryShape() {
		return (OfficeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.OfficeNameEditPart) {
			((visGrid.diagram.edit.parts.OfficeNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureOfficeNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.OfficeNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.OfficeNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
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
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2078);
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
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class OfficeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeFloor_areaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeFloor_heightFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeExterior_uaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeInterior_uaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeInterior_massFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazingFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__northFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__northeastFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__eastFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__southeastFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__southFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__southwestFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__westFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__northwestFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__horizontalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeGlazing__coefficientFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeOccupancyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeOccupantsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeScheduleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeAir_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeMass_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeTemperature_changeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeOutdoor_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeQhFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeQsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeQiFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeQzFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__cooling__balance_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__cooling__capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__cooling__capacity_perFFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__cooling__design_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__cooling__efficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__cooling__copFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__heating__balance_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__heating__capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__heating__capacity_perFFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__heating__design_temperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__heating__efficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__heating__copFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeTotal_loadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeCurrentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeAdmittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__loadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHvac__power_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__loadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__power_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__heatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeLights__heatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__loadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__power_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__heatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficePlugs__heatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeCooling_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeHeating_setpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeThermostat_deadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeControl__ventilation_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeControl__lighting_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOfficeACHFigure;

		/**
		 * @generated
		 */
		public OfficeFigure() {

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

			fFigureOfficeNameFigure = new WrappingLabel();
			fFigureOfficeNameFigure.setText("<...>");

			this.add(fFigureOfficeNameFigure);

			fFigureOfficeFloor_areaFigure = new WrappingLabel();
			fFigureOfficeFloor_areaFigure.setText("<...>");

			this.add(fFigureOfficeFloor_areaFigure);

			fFigureOfficeFloor_heightFigure = new WrappingLabel();
			fFigureOfficeFloor_heightFigure.setText("<...>");

			this.add(fFigureOfficeFloor_heightFigure);

			fFigureOfficeExterior_uaFigure = new WrappingLabel();
			fFigureOfficeExterior_uaFigure.setText("<...>");

			this.add(fFigureOfficeExterior_uaFigure);

			fFigureOfficeInterior_uaFigure = new WrappingLabel();
			fFigureOfficeInterior_uaFigure.setText("<...>");

			this.add(fFigureOfficeInterior_uaFigure);

			fFigureOfficeInterior_massFigure = new WrappingLabel();
			fFigureOfficeInterior_massFigure.setText("<...>");

			this.add(fFigureOfficeInterior_massFigure);

			fFigureOfficeGlazingFigure = new WrappingLabel();
			fFigureOfficeGlazingFigure.setText("<...>");

			this.add(fFigureOfficeGlazingFigure);

			fFigureOfficeGlazing__northFigure = new WrappingLabel();
			fFigureOfficeGlazing__northFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__northFigure);

			fFigureOfficeGlazing__northeastFigure = new WrappingLabel();
			fFigureOfficeGlazing__northeastFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__northeastFigure);

			fFigureOfficeGlazing__eastFigure = new WrappingLabel();
			fFigureOfficeGlazing__eastFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__eastFigure);

			fFigureOfficeGlazing__southeastFigure = new WrappingLabel();
			fFigureOfficeGlazing__southeastFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__southeastFigure);

			fFigureOfficeGlazing__southFigure = new WrappingLabel();
			fFigureOfficeGlazing__southFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__southFigure);

			fFigureOfficeGlazing__southwestFigure = new WrappingLabel();
			fFigureOfficeGlazing__southwestFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__southwestFigure);

			fFigureOfficeGlazing__westFigure = new WrappingLabel();
			fFigureOfficeGlazing__westFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__westFigure);

			fFigureOfficeGlazing__northwestFigure = new WrappingLabel();
			fFigureOfficeGlazing__northwestFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__northwestFigure);

			fFigureOfficeGlazing__horizontalFigure = new WrappingLabel();
			fFigureOfficeGlazing__horizontalFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__horizontalFigure);

			fFigureOfficeGlazing__coefficientFigure = new WrappingLabel();
			fFigureOfficeGlazing__coefficientFigure.setText("<...>");

			this.add(fFigureOfficeGlazing__coefficientFigure);

			fFigureOfficeOccupancyFigure = new WrappingLabel();
			fFigureOfficeOccupancyFigure.setText("<...>");

			this.add(fFigureOfficeOccupancyFigure);

			fFigureOfficeOccupantsFigure = new WrappingLabel();
			fFigureOfficeOccupantsFigure.setText("<...>");

			this.add(fFigureOfficeOccupantsFigure);

			fFigureOfficeScheduleFigure = new WrappingLabel();
			fFigureOfficeScheduleFigure.setText("<...>");

			this.add(fFigureOfficeScheduleFigure);

			fFigureOfficeAir_temperatureFigure = new WrappingLabel();
			fFigureOfficeAir_temperatureFigure.setText("<...>");

			this.add(fFigureOfficeAir_temperatureFigure);

			fFigureOfficeMass_temperatureFigure = new WrappingLabel();
			fFigureOfficeMass_temperatureFigure.setText("<...>");

			this.add(fFigureOfficeMass_temperatureFigure);

			fFigureOfficeTemperature_changeFigure = new WrappingLabel();
			fFigureOfficeTemperature_changeFigure.setText("<...>");

			this.add(fFigureOfficeTemperature_changeFigure);

			fFigureOfficeOutdoor_temperatureFigure = new WrappingLabel();
			fFigureOfficeOutdoor_temperatureFigure.setText("<...>");

			this.add(fFigureOfficeOutdoor_temperatureFigure);

			fFigureOfficeQhFigure = new WrappingLabel();
			fFigureOfficeQhFigure.setText("<...>");

			this.add(fFigureOfficeQhFigure);

			fFigureOfficeQsFigure = new WrappingLabel();
			fFigureOfficeQsFigure.setText("<...>");

			this.add(fFigureOfficeQsFigure);

			fFigureOfficeQiFigure = new WrappingLabel();
			fFigureOfficeQiFigure.setText("<...>");

			this.add(fFigureOfficeQiFigure);

			fFigureOfficeQzFigure = new WrappingLabel();
			fFigureOfficeQzFigure.setText("<...>");

			this.add(fFigureOfficeQzFigure);

			fFigureOfficeHvac_modeFigure = new WrappingLabel();
			fFigureOfficeHvac_modeFigure.setText("<...>");

			this.add(fFigureOfficeHvac_modeFigure);

			fFigureOfficeHvac__cooling__balance_temperatureFigure = new WrappingLabel();
			fFigureOfficeHvac__cooling__balance_temperatureFigure
					.setText("<...>");

			this.add(fFigureOfficeHvac__cooling__balance_temperatureFigure);

			fFigureOfficeHvac__cooling__capacityFigure = new WrappingLabel();
			fFigureOfficeHvac__cooling__capacityFigure.setText("<...>");

			this.add(fFigureOfficeHvac__cooling__capacityFigure);

			fFigureOfficeHvac__cooling__capacity_perFFigure = new WrappingLabel();
			fFigureOfficeHvac__cooling__capacity_perFFigure.setText("<...>");

			this.add(fFigureOfficeHvac__cooling__capacity_perFFigure);

			fFigureOfficeHvac__cooling__design_temperatureFigure = new WrappingLabel();
			fFigureOfficeHvac__cooling__design_temperatureFigure
					.setText("<...>");

			this.add(fFigureOfficeHvac__cooling__design_temperatureFigure);

			fFigureOfficeHvac__cooling__efficiencyFigure = new WrappingLabel();
			fFigureOfficeHvac__cooling__efficiencyFigure.setText("<...>");

			this.add(fFigureOfficeHvac__cooling__efficiencyFigure);

			fFigureOfficeHvac__cooling__copFigure = new WrappingLabel();
			fFigureOfficeHvac__cooling__copFigure.setText("<...>");

			this.add(fFigureOfficeHvac__cooling__copFigure);

			fFigureOfficeHvac__heating__balance_temperatureFigure = new WrappingLabel();
			fFigureOfficeHvac__heating__balance_temperatureFigure
					.setText("<...>");

			this.add(fFigureOfficeHvac__heating__balance_temperatureFigure);

			fFigureOfficeHvac__heating__capacityFigure = new WrappingLabel();
			fFigureOfficeHvac__heating__capacityFigure.setText("<...>");

			this.add(fFigureOfficeHvac__heating__capacityFigure);

			fFigureOfficeHvac__heating__capacity_perFFigure = new WrappingLabel();
			fFigureOfficeHvac__heating__capacity_perFFigure.setText("<...>");

			this.add(fFigureOfficeHvac__heating__capacity_perFFigure);

			fFigureOfficeHvac__heating__design_temperatureFigure = new WrappingLabel();
			fFigureOfficeHvac__heating__design_temperatureFigure
					.setText("<...>");

			this.add(fFigureOfficeHvac__heating__design_temperatureFigure);

			fFigureOfficeHvac__heating__efficiencyFigure = new WrappingLabel();
			fFigureOfficeHvac__heating__efficiencyFigure.setText("<...>");

			this.add(fFigureOfficeHvac__heating__efficiencyFigure);

			fFigureOfficeHvac__heating__copFigure = new WrappingLabel();
			fFigureOfficeHvac__heating__copFigure.setText("<...>");

			this.add(fFigureOfficeHvac__heating__copFigure);

			fFigureOfficeLights__capacityFigure = new WrappingLabel();
			fFigureOfficeLights__capacityFigure.setText("<...>");

			this.add(fFigureOfficeLights__capacityFigure);

			fFigureOfficeLights__fractionFigure = new WrappingLabel();
			fFigureOfficeLights__fractionFigure.setText("<...>");

			this.add(fFigureOfficeLights__fractionFigure);

			fFigureOfficePlugs__capacityFigure = new WrappingLabel();
			fFigureOfficePlugs__capacityFigure.setText("<...>");

			this.add(fFigureOfficePlugs__capacityFigure);

			fFigureOfficePlugs__fractionFigure = new WrappingLabel();
			fFigureOfficePlugs__fractionFigure.setText("<...>");

			this.add(fFigureOfficePlugs__fractionFigure);

			fFigureOfficeDemandFigure = new WrappingLabel();
			fFigureOfficeDemandFigure.setText("<...>");

			this.add(fFigureOfficeDemandFigure);

			fFigureOfficeTotal_loadFigure = new WrappingLabel();
			fFigureOfficeTotal_loadFigure.setText("<...>");

			this.add(fFigureOfficeTotal_loadFigure);

			fFigureOfficeEnergyFigure = new WrappingLabel();
			fFigureOfficeEnergyFigure.setText("<...>");

			this.add(fFigureOfficeEnergyFigure);

			fFigureOfficePower_factorFigure = new WrappingLabel();
			fFigureOfficePower_factorFigure.setText("<...>");

			this.add(fFigureOfficePower_factorFigure);

			fFigureOfficePowerFigure = new WrappingLabel();
			fFigureOfficePowerFigure.setText("<...>");

			this.add(fFigureOfficePowerFigure);

			fFigureOfficeCurrentFigure = new WrappingLabel();
			fFigureOfficeCurrentFigure.setText("<...>");

			this.add(fFigureOfficeCurrentFigure);

			fFigureOfficeAdmittanceFigure = new WrappingLabel();
			fFigureOfficeAdmittanceFigure.setText("<...>");

			this.add(fFigureOfficeAdmittanceFigure);

			fFigureOfficeHvac__demandFigure = new WrappingLabel();
			fFigureOfficeHvac__demandFigure.setText("<...>");

			this.add(fFigureOfficeHvac__demandFigure);

			fFigureOfficeHvac__loadFigure = new WrappingLabel();
			fFigureOfficeHvac__loadFigure.setText("<...>");

			this.add(fFigureOfficeHvac__loadFigure);

			fFigureOfficeHvac__energyFigure = new WrappingLabel();
			fFigureOfficeHvac__energyFigure.setText("<...>");

			this.add(fFigureOfficeHvac__energyFigure);

			fFigureOfficeHvac__power_factorFigure = new WrappingLabel();
			fFigureOfficeHvac__power_factorFigure.setText("<...>");

			this.add(fFigureOfficeHvac__power_factorFigure);

			fFigureOfficeLights__demandFigure = new WrappingLabel();
			fFigureOfficeLights__demandFigure.setText("<...>");

			this.add(fFigureOfficeLights__demandFigure);

			fFigureOfficeLights__loadFigure = new WrappingLabel();
			fFigureOfficeLights__loadFigure.setText("<...>");

			this.add(fFigureOfficeLights__loadFigure);

			fFigureOfficeLights__energyFigure = new WrappingLabel();
			fFigureOfficeLights__energyFigure.setText("<...>");

			this.add(fFigureOfficeLights__energyFigure);

			fFigureOfficeLights__power_factorFigure = new WrappingLabel();
			fFigureOfficeLights__power_factorFigure.setText("<...>");

			this.add(fFigureOfficeLights__power_factorFigure);

			fFigureOfficeLights__heatgain_fractionFigure = new WrappingLabel();
			fFigureOfficeLights__heatgain_fractionFigure.setText("<...>");

			this.add(fFigureOfficeLights__heatgain_fractionFigure);

			fFigureOfficeLights__heatgainFigure = new WrappingLabel();
			fFigureOfficeLights__heatgainFigure.setText("<...>");

			this.add(fFigureOfficeLights__heatgainFigure);

			fFigureOfficePlugs__demandFigure = new WrappingLabel();
			fFigureOfficePlugs__demandFigure.setText("<...>");

			this.add(fFigureOfficePlugs__demandFigure);

			fFigureOfficePlugs__loadFigure = new WrappingLabel();
			fFigureOfficePlugs__loadFigure.setText("<...>");

			this.add(fFigureOfficePlugs__loadFigure);

			fFigureOfficePlugs__energyFigure = new WrappingLabel();
			fFigureOfficePlugs__energyFigure.setText("<...>");

			this.add(fFigureOfficePlugs__energyFigure);

			fFigureOfficePlugs__power_factorFigure = new WrappingLabel();
			fFigureOfficePlugs__power_factorFigure.setText("<...>");

			this.add(fFigureOfficePlugs__power_factorFigure);

			fFigureOfficePlugs__heatgain_fractionFigure = new WrappingLabel();
			fFigureOfficePlugs__heatgain_fractionFigure.setText("<...>");

			this.add(fFigureOfficePlugs__heatgain_fractionFigure);

			fFigureOfficePlugs__heatgainFigure = new WrappingLabel();
			fFigureOfficePlugs__heatgainFigure.setText("<...>");

			this.add(fFigureOfficePlugs__heatgainFigure);

			fFigureOfficeCooling_setpointFigure = new WrappingLabel();
			fFigureOfficeCooling_setpointFigure.setText("<...>");

			this.add(fFigureOfficeCooling_setpointFigure);

			fFigureOfficeHeating_setpointFigure = new WrappingLabel();
			fFigureOfficeHeating_setpointFigure.setText("<...>");

			this.add(fFigureOfficeHeating_setpointFigure);

			fFigureOfficeThermostat_deadbandFigure = new WrappingLabel();
			fFigureOfficeThermostat_deadbandFigure.setText("<...>");

			this.add(fFigureOfficeThermostat_deadbandFigure);

			fFigureOfficeControl__ventilation_fractionFigure = new WrappingLabel();
			fFigureOfficeControl__ventilation_fractionFigure.setText("<...>");

			this.add(fFigureOfficeControl__ventilation_fractionFigure);

			fFigureOfficeControl__lighting_fractionFigure = new WrappingLabel();
			fFigureOfficeControl__lighting_fractionFigure.setText("<...>");

			this.add(fFigureOfficeControl__lighting_fractionFigure);

			fFigureOfficeACHFigure = new WrappingLabel();
			fFigureOfficeACHFigure.setText("<...>");

			this.add(fFigureOfficeACHFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeNameFigure() {
			return fFigureOfficeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeFloor_areaFigure() {
			return fFigureOfficeFloor_areaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeFloor_heightFigure() {
			return fFigureOfficeFloor_heightFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeExterior_uaFigure() {
			return fFigureOfficeExterior_uaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeInterior_uaFigure() {
			return fFigureOfficeInterior_uaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeInterior_massFigure() {
			return fFigureOfficeInterior_massFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazingFigure() {
			return fFigureOfficeGlazingFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__northFigure() {
			return fFigureOfficeGlazing__northFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__northeastFigure() {
			return fFigureOfficeGlazing__northeastFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__eastFigure() {
			return fFigureOfficeGlazing__eastFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__southeastFigure() {
			return fFigureOfficeGlazing__southeastFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__southFigure() {
			return fFigureOfficeGlazing__southFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__southwestFigure() {
			return fFigureOfficeGlazing__southwestFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__westFigure() {
			return fFigureOfficeGlazing__westFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__northwestFigure() {
			return fFigureOfficeGlazing__northwestFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__horizontalFigure() {
			return fFigureOfficeGlazing__horizontalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeGlazing__coefficientFigure() {
			return fFigureOfficeGlazing__coefficientFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeOccupancyFigure() {
			return fFigureOfficeOccupancyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeOccupantsFigure() {
			return fFigureOfficeOccupantsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeScheduleFigure() {
			return fFigureOfficeScheduleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeAir_temperatureFigure() {
			return fFigureOfficeAir_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeMass_temperatureFigure() {
			return fFigureOfficeMass_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeTemperature_changeFigure() {
			return fFigureOfficeTemperature_changeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeOutdoor_temperatureFigure() {
			return fFigureOfficeOutdoor_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeQhFigure() {
			return fFigureOfficeQhFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeQsFigure() {
			return fFigureOfficeQsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeQiFigure() {
			return fFigureOfficeQiFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeQzFigure() {
			return fFigureOfficeQzFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac_modeFigure() {
			return fFigureOfficeHvac_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__cooling__balance_temperatureFigure() {
			return fFigureOfficeHvac__cooling__balance_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__cooling__capacityFigure() {
			return fFigureOfficeHvac__cooling__capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__cooling__capacity_perFFigure() {
			return fFigureOfficeHvac__cooling__capacity_perFFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__cooling__design_temperatureFigure() {
			return fFigureOfficeHvac__cooling__design_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__cooling__efficiencyFigure() {
			return fFigureOfficeHvac__cooling__efficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__cooling__copFigure() {
			return fFigureOfficeHvac__cooling__copFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__heating__balance_temperatureFigure() {
			return fFigureOfficeHvac__heating__balance_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__heating__capacityFigure() {
			return fFigureOfficeHvac__heating__capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__heating__capacity_perFFigure() {
			return fFigureOfficeHvac__heating__capacity_perFFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__heating__design_temperatureFigure() {
			return fFigureOfficeHvac__heating__design_temperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__heating__efficiencyFigure() {
			return fFigureOfficeHvac__heating__efficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__heating__copFigure() {
			return fFigureOfficeHvac__heating__copFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__capacityFigure() {
			return fFigureOfficeLights__capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__fractionFigure() {
			return fFigureOfficeLights__fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__capacityFigure() {
			return fFigureOfficePlugs__capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__fractionFigure() {
			return fFigureOfficePlugs__fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeDemandFigure() {
			return fFigureOfficeDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeTotal_loadFigure() {
			return fFigureOfficeTotal_loadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeEnergyFigure() {
			return fFigureOfficeEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePower_factorFigure() {
			return fFigureOfficePower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePowerFigure() {
			return fFigureOfficePowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeCurrentFigure() {
			return fFigureOfficeCurrentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeAdmittanceFigure() {
			return fFigureOfficeAdmittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__demandFigure() {
			return fFigureOfficeHvac__demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__loadFigure() {
			return fFigureOfficeHvac__loadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__energyFigure() {
			return fFigureOfficeHvac__energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHvac__power_factorFigure() {
			return fFigureOfficeHvac__power_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__demandFigure() {
			return fFigureOfficeLights__demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__loadFigure() {
			return fFigureOfficeLights__loadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__energyFigure() {
			return fFigureOfficeLights__energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__power_factorFigure() {
			return fFigureOfficeLights__power_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__heatgain_fractionFigure() {
			return fFigureOfficeLights__heatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeLights__heatgainFigure() {
			return fFigureOfficeLights__heatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__demandFigure() {
			return fFigureOfficePlugs__demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__loadFigure() {
			return fFigureOfficePlugs__loadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__energyFigure() {
			return fFigureOfficePlugs__energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__power_factorFigure() {
			return fFigureOfficePlugs__power_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__heatgain_fractionFigure() {
			return fFigureOfficePlugs__heatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficePlugs__heatgainFigure() {
			return fFigureOfficePlugs__heatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeCooling_setpointFigure() {
			return fFigureOfficeCooling_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeHeating_setpointFigure() {
			return fFigureOfficeHeating_setpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeThermostat_deadbandFigure() {
			return fFigureOfficeThermostat_deadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeControl__ventilation_fractionFigure() {
			return fFigureOfficeControl__ventilation_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeControl__lighting_fractionFigure() {
			return fFigureOfficeControl__lighting_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOfficeACHFigure() {
			return fFigureOfficeACHFigure;
		}

	}

}
