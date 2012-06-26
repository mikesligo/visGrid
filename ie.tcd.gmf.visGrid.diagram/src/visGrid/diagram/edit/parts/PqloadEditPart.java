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
public class PqloadEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2015;

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
	public PqloadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.PqloadItemSemanticEditPolicy());
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
		return primaryShape = new PqloadFigure();
	}

	/**
	 * @generated
	 */
	public PqloadFigure getPrimaryShape() {
		return (PqloadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.PqloadNameEditPart) {
			((visGrid.diagram.edit.parts.PqloadNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePqloadNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.PqloadNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.PqloadNameEditPart.VISUAL_ID));
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
	public class PqloadFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadWeatherFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadT_nominalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZp_TFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZp_HFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZp_SFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZp_WFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZp_RFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZpFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZq_TFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZq_HFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZq_SFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZq_WFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZq_RFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadZqFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIm_TFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIm_HFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIm_SFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIm_WFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIm_RFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadImFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIa_TFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIa_HFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIa_SFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIa_WFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIa_RFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadIaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPp_TFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPp_HFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPp_SFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPp_WFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPp_RFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPpFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPq_TFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPq_HFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPq_SFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPq_WFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPq_RFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPqFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadInput_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadInput_humidFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadInput_solarFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadInput_windFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadInput_rainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_imped_pFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_imped_qFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_current_mFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_current_aFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_power_pFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_power_qFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_impedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadOutput_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadLoad_classFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_power_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_current_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadConstant_impedance_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMeasured_voltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMeasured_voltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMeasured_voltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMeasured_voltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMeasured_voltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMeasured_voltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePqloadNominal_voltageFigure;

		/**
		 * @generated
		 */
		public PqloadFigure() {

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

			fFigurePqloadNameFigure = new WrappingLabel();
			fFigurePqloadNameFigure.setText("<...>");

			this.add(fFigurePqloadNameFigure);

			fFigurePqloadWeatherFigure = new WrappingLabel();
			fFigurePqloadWeatherFigure.setText("<...>");

			this.add(fFigurePqloadWeatherFigure);

			fFigurePqloadT_nominalFigure = new WrappingLabel();
			fFigurePqloadT_nominalFigure.setText("<...>");

			this.add(fFigurePqloadT_nominalFigure);

			fFigurePqloadZp_TFigure = new WrappingLabel();
			fFigurePqloadZp_TFigure.setText("<...>");

			this.add(fFigurePqloadZp_TFigure);

			fFigurePqloadZp_HFigure = new WrappingLabel();
			fFigurePqloadZp_HFigure.setText("<...>");

			this.add(fFigurePqloadZp_HFigure);

			fFigurePqloadZp_SFigure = new WrappingLabel();
			fFigurePqloadZp_SFigure.setText("<...>");

			this.add(fFigurePqloadZp_SFigure);

			fFigurePqloadZp_WFigure = new WrappingLabel();
			fFigurePqloadZp_WFigure.setText("<...>");

			this.add(fFigurePqloadZp_WFigure);

			fFigurePqloadZp_RFigure = new WrappingLabel();
			fFigurePqloadZp_RFigure.setText("<...>");

			this.add(fFigurePqloadZp_RFigure);

			fFigurePqloadZpFigure = new WrappingLabel();
			fFigurePqloadZpFigure.setText("<...>");

			this.add(fFigurePqloadZpFigure);

			fFigurePqloadZq_TFigure = new WrappingLabel();
			fFigurePqloadZq_TFigure.setText("<...>");

			this.add(fFigurePqloadZq_TFigure);

			fFigurePqloadZq_HFigure = new WrappingLabel();
			fFigurePqloadZq_HFigure.setText("<...>");

			this.add(fFigurePqloadZq_HFigure);

			fFigurePqloadZq_SFigure = new WrappingLabel();
			fFigurePqloadZq_SFigure.setText("<...>");

			this.add(fFigurePqloadZq_SFigure);

			fFigurePqloadZq_WFigure = new WrappingLabel();
			fFigurePqloadZq_WFigure.setText("<...>");

			this.add(fFigurePqloadZq_WFigure);

			fFigurePqloadZq_RFigure = new WrappingLabel();
			fFigurePqloadZq_RFigure.setText("<...>");

			this.add(fFigurePqloadZq_RFigure);

			fFigurePqloadZqFigure = new WrappingLabel();
			fFigurePqloadZqFigure.setText("<...>");

			this.add(fFigurePqloadZqFigure);

			fFigurePqloadIm_TFigure = new WrappingLabel();
			fFigurePqloadIm_TFigure.setText("<...>");

			this.add(fFigurePqloadIm_TFigure);

			fFigurePqloadIm_HFigure = new WrappingLabel();
			fFigurePqloadIm_HFigure.setText("<...>");

			this.add(fFigurePqloadIm_HFigure);

			fFigurePqloadIm_SFigure = new WrappingLabel();
			fFigurePqloadIm_SFigure.setText("<...>");

			this.add(fFigurePqloadIm_SFigure);

			fFigurePqloadIm_WFigure = new WrappingLabel();
			fFigurePqloadIm_WFigure.setText("<...>");

			this.add(fFigurePqloadIm_WFigure);

			fFigurePqloadIm_RFigure = new WrappingLabel();
			fFigurePqloadIm_RFigure.setText("<...>");

			this.add(fFigurePqloadIm_RFigure);

			fFigurePqloadImFigure = new WrappingLabel();
			fFigurePqloadImFigure.setText("<...>");

			this.add(fFigurePqloadImFigure);

			fFigurePqloadIa_TFigure = new WrappingLabel();
			fFigurePqloadIa_TFigure.setText("<...>");

			this.add(fFigurePqloadIa_TFigure);

			fFigurePqloadIa_HFigure = new WrappingLabel();
			fFigurePqloadIa_HFigure.setText("<...>");

			this.add(fFigurePqloadIa_HFigure);

			fFigurePqloadIa_SFigure = new WrappingLabel();
			fFigurePqloadIa_SFigure.setText("<...>");

			this.add(fFigurePqloadIa_SFigure);

			fFigurePqloadIa_WFigure = new WrappingLabel();
			fFigurePqloadIa_WFigure.setText("<...>");

			this.add(fFigurePqloadIa_WFigure);

			fFigurePqloadIa_RFigure = new WrappingLabel();
			fFigurePqloadIa_RFigure.setText("<...>");

			this.add(fFigurePqloadIa_RFigure);

			fFigurePqloadIaFigure = new WrappingLabel();
			fFigurePqloadIaFigure.setText("<...>");

			this.add(fFigurePqloadIaFigure);

			fFigurePqloadPp_TFigure = new WrappingLabel();
			fFigurePqloadPp_TFigure.setText("<...>");

			this.add(fFigurePqloadPp_TFigure);

			fFigurePqloadPp_HFigure = new WrappingLabel();
			fFigurePqloadPp_HFigure.setText("<...>");

			this.add(fFigurePqloadPp_HFigure);

			fFigurePqloadPp_SFigure = new WrappingLabel();
			fFigurePqloadPp_SFigure.setText("<...>");

			this.add(fFigurePqloadPp_SFigure);

			fFigurePqloadPp_WFigure = new WrappingLabel();
			fFigurePqloadPp_WFigure.setText("<...>");

			this.add(fFigurePqloadPp_WFigure);

			fFigurePqloadPp_RFigure = new WrappingLabel();
			fFigurePqloadPp_RFigure.setText("<...>");

			this.add(fFigurePqloadPp_RFigure);

			fFigurePqloadPpFigure = new WrappingLabel();
			fFigurePqloadPpFigure.setText("<...>");

			this.add(fFigurePqloadPpFigure);

			fFigurePqloadPq_TFigure = new WrappingLabel();
			fFigurePqloadPq_TFigure.setText("<...>");

			this.add(fFigurePqloadPq_TFigure);

			fFigurePqloadPq_HFigure = new WrappingLabel();
			fFigurePqloadPq_HFigure.setText("<...>");

			this.add(fFigurePqloadPq_HFigure);

			fFigurePqloadPq_SFigure = new WrappingLabel();
			fFigurePqloadPq_SFigure.setText("<...>");

			this.add(fFigurePqloadPq_SFigure);

			fFigurePqloadPq_WFigure = new WrappingLabel();
			fFigurePqloadPq_WFigure.setText("<...>");

			this.add(fFigurePqloadPq_WFigure);

			fFigurePqloadPq_RFigure = new WrappingLabel();
			fFigurePqloadPq_RFigure.setText("<...>");

			this.add(fFigurePqloadPq_RFigure);

			fFigurePqloadPqFigure = new WrappingLabel();
			fFigurePqloadPqFigure.setText("<...>");

			this.add(fFigurePqloadPqFigure);

			fFigurePqloadInput_tempFigure = new WrappingLabel();
			fFigurePqloadInput_tempFigure.setText("<...>");

			this.add(fFigurePqloadInput_tempFigure);

			fFigurePqloadInput_humidFigure = new WrappingLabel();
			fFigurePqloadInput_humidFigure.setText("<...>");

			this.add(fFigurePqloadInput_humidFigure);

			fFigurePqloadInput_solarFigure = new WrappingLabel();
			fFigurePqloadInput_solarFigure.setText("<...>");

			this.add(fFigurePqloadInput_solarFigure);

			fFigurePqloadInput_windFigure = new WrappingLabel();
			fFigurePqloadInput_windFigure.setText("<...>");

			this.add(fFigurePqloadInput_windFigure);

			fFigurePqloadInput_rainFigure = new WrappingLabel();
			fFigurePqloadInput_rainFigure.setText("<...>");

			this.add(fFigurePqloadInput_rainFigure);

			fFigurePqloadOutput_imped_pFigure = new WrappingLabel();
			fFigurePqloadOutput_imped_pFigure.setText("<...>");

			this.add(fFigurePqloadOutput_imped_pFigure);

			fFigurePqloadOutput_imped_qFigure = new WrappingLabel();
			fFigurePqloadOutput_imped_qFigure.setText("<...>");

			this.add(fFigurePqloadOutput_imped_qFigure);

			fFigurePqloadOutput_current_mFigure = new WrappingLabel();
			fFigurePqloadOutput_current_mFigure.setText("<...>");

			this.add(fFigurePqloadOutput_current_mFigure);

			fFigurePqloadOutput_current_aFigure = new WrappingLabel();
			fFigurePqloadOutput_current_aFigure.setText("<...>");

			this.add(fFigurePqloadOutput_current_aFigure);

			fFigurePqloadOutput_power_pFigure = new WrappingLabel();
			fFigurePqloadOutput_power_pFigure.setText("<...>");

			this.add(fFigurePqloadOutput_power_pFigure);

			fFigurePqloadOutput_power_qFigure = new WrappingLabel();
			fFigurePqloadOutput_power_qFigure.setText("<...>");

			this.add(fFigurePqloadOutput_power_qFigure);

			fFigurePqloadOutput_impedanceFigure = new WrappingLabel();
			fFigurePqloadOutput_impedanceFigure.setText("<...>");

			this.add(fFigurePqloadOutput_impedanceFigure);

			fFigurePqloadOutput_currentFigure = new WrappingLabel();
			fFigurePqloadOutput_currentFigure.setText("<...>");

			this.add(fFigurePqloadOutput_currentFigure);

			fFigurePqloadOutput_powerFigure = new WrappingLabel();
			fFigurePqloadOutput_powerFigure.setText("<...>");

			this.add(fFigurePqloadOutput_powerFigure);

			fFigurePqloadLoad_classFigure = new WrappingLabel();
			fFigurePqloadLoad_classFigure.setText("<...>");

			this.add(fFigurePqloadLoad_classFigure);

			fFigurePqloadConstant_power_AFigure = new WrappingLabel();
			fFigurePqloadConstant_power_AFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_AFigure);

			fFigurePqloadConstant_power_BFigure = new WrappingLabel();
			fFigurePqloadConstant_power_BFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_BFigure);

			fFigurePqloadConstant_power_CFigure = new WrappingLabel();
			fFigurePqloadConstant_power_CFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_CFigure);

			fFigurePqloadConstant_power_A_realFigure = new WrappingLabel();
			fFigurePqloadConstant_power_A_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_A_realFigure);

			fFigurePqloadConstant_power_B_realFigure = new WrappingLabel();
			fFigurePqloadConstant_power_B_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_B_realFigure);

			fFigurePqloadConstant_power_C_realFigure = new WrappingLabel();
			fFigurePqloadConstant_power_C_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_C_realFigure);

			fFigurePqloadConstant_power_A_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_power_A_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_A_reacFigure);

			fFigurePqloadConstant_power_B_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_power_B_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_B_reacFigure);

			fFigurePqloadConstant_power_C_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_power_C_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_power_C_reacFigure);

			fFigurePqloadConstant_current_AFigure = new WrappingLabel();
			fFigurePqloadConstant_current_AFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_AFigure);

			fFigurePqloadConstant_current_BFigure = new WrappingLabel();
			fFigurePqloadConstant_current_BFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_BFigure);

			fFigurePqloadConstant_current_CFigure = new WrappingLabel();
			fFigurePqloadConstant_current_CFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_CFigure);

			fFigurePqloadConstant_current_A_realFigure = new WrappingLabel();
			fFigurePqloadConstant_current_A_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_A_realFigure);

			fFigurePqloadConstant_current_B_realFigure = new WrappingLabel();
			fFigurePqloadConstant_current_B_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_B_realFigure);

			fFigurePqloadConstant_current_C_realFigure = new WrappingLabel();
			fFigurePqloadConstant_current_C_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_C_realFigure);

			fFigurePqloadConstant_current_A_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_current_A_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_A_reacFigure);

			fFigurePqloadConstant_current_B_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_current_B_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_B_reacFigure);

			fFigurePqloadConstant_current_C_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_current_C_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_current_C_reacFigure);

			fFigurePqloadConstant_impedance_AFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_AFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_AFigure);

			fFigurePqloadConstant_impedance_BFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_BFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_BFigure);

			fFigurePqloadConstant_impedance_CFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_CFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_CFigure);

			fFigurePqloadConstant_impedance_A_realFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_A_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_A_realFigure);

			fFigurePqloadConstant_impedance_B_realFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_B_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_B_realFigure);

			fFigurePqloadConstant_impedance_C_realFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_C_realFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_C_realFigure);

			fFigurePqloadConstant_impedance_A_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_A_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_A_reacFigure);

			fFigurePqloadConstant_impedance_B_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_B_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_B_reacFigure);

			fFigurePqloadConstant_impedance_C_reacFigure = new WrappingLabel();
			fFigurePqloadConstant_impedance_C_reacFigure.setText("<...>");

			this.add(fFigurePqloadConstant_impedance_C_reacFigure);

			fFigurePqloadMeasured_voltage_AFigure = new WrappingLabel();
			fFigurePqloadMeasured_voltage_AFigure.setText("<...>");

			this.add(fFigurePqloadMeasured_voltage_AFigure);

			fFigurePqloadMeasured_voltage_BFigure = new WrappingLabel();
			fFigurePqloadMeasured_voltage_BFigure.setText("<...>");

			this.add(fFigurePqloadMeasured_voltage_BFigure);

			fFigurePqloadMeasured_voltage_CFigure = new WrappingLabel();
			fFigurePqloadMeasured_voltage_CFigure.setText("<...>");

			this.add(fFigurePqloadMeasured_voltage_CFigure);

			fFigurePqloadMeasured_voltage_ABFigure = new WrappingLabel();
			fFigurePqloadMeasured_voltage_ABFigure.setText("<...>");

			this.add(fFigurePqloadMeasured_voltage_ABFigure);

			fFigurePqloadMeasured_voltage_BCFigure = new WrappingLabel();
			fFigurePqloadMeasured_voltage_BCFigure.setText("<...>");

			this.add(fFigurePqloadMeasured_voltage_BCFigure);

			fFigurePqloadMeasured_voltage_CAFigure = new WrappingLabel();
			fFigurePqloadMeasured_voltage_CAFigure.setText("<...>");

			this.add(fFigurePqloadMeasured_voltage_CAFigure);

			fFigurePqloadBustypeFigure = new WrappingLabel();
			fFigurePqloadBustypeFigure.setText("<...>");

			this.add(fFigurePqloadBustypeFigure);

			fFigurePqloadBusflagsFigure = new WrappingLabel();
			fFigurePqloadBusflagsFigure.setText("<...>");

			this.add(fFigurePqloadBusflagsFigure);

			fFigurePqloadReference_busFigure = new WrappingLabel();
			fFigurePqloadReference_busFigure.setText("<...>");

			this.add(fFigurePqloadReference_busFigure);

			fFigurePqloadMaximum_voltage_errorFigure = new WrappingLabel();
			fFigurePqloadMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigurePqloadMaximum_voltage_errorFigure);

			fFigurePqloadVoltage_AFigure = new WrappingLabel();
			fFigurePqloadVoltage_AFigure.setText("<...>");

			this.add(fFigurePqloadVoltage_AFigure);

			fFigurePqloadVoltage_BFigure = new WrappingLabel();
			fFigurePqloadVoltage_BFigure.setText("<...>");

			this.add(fFigurePqloadVoltage_BFigure);

			fFigurePqloadVoltage_CFigure = new WrappingLabel();
			fFigurePqloadVoltage_CFigure.setText("<...>");

			this.add(fFigurePqloadVoltage_CFigure);

			fFigurePqloadVoltage_ABFigure = new WrappingLabel();
			fFigurePqloadVoltage_ABFigure.setText("<...>");

			this.add(fFigurePqloadVoltage_ABFigure);

			fFigurePqloadVoltage_BCFigure = new WrappingLabel();
			fFigurePqloadVoltage_BCFigure.setText("<...>");

			this.add(fFigurePqloadVoltage_BCFigure);

			fFigurePqloadVoltage_CAFigure = new WrappingLabel();
			fFigurePqloadVoltage_CAFigure.setText("<...>");

			this.add(fFigurePqloadVoltage_CAFigure);

			fFigurePqloadCurrent_AFigure = new WrappingLabel();
			fFigurePqloadCurrent_AFigure.setText("<...>");

			this.add(fFigurePqloadCurrent_AFigure);

			fFigurePqloadCurrent_BFigure = new WrappingLabel();
			fFigurePqloadCurrent_BFigure.setText("<...>");

			this.add(fFigurePqloadCurrent_BFigure);

			fFigurePqloadCurrent_CFigure = new WrappingLabel();
			fFigurePqloadCurrent_CFigure.setText("<...>");

			this.add(fFigurePqloadCurrent_CFigure);

			fFigurePqloadPower_AFigure = new WrappingLabel();
			fFigurePqloadPower_AFigure.setText("<...>");

			this.add(fFigurePqloadPower_AFigure);

			fFigurePqloadPower_BFigure = new WrappingLabel();
			fFigurePqloadPower_BFigure.setText("<...>");

			this.add(fFigurePqloadPower_BFigure);

			fFigurePqloadPower_CFigure = new WrappingLabel();
			fFigurePqloadPower_CFigure.setText("<...>");

			this.add(fFigurePqloadPower_CFigure);

			fFigurePqloadShunt_AFigure = new WrappingLabel();
			fFigurePqloadShunt_AFigure.setText("<...>");

			this.add(fFigurePqloadShunt_AFigure);

			fFigurePqloadShunt_BFigure = new WrappingLabel();
			fFigurePqloadShunt_BFigure.setText("<...>");

			this.add(fFigurePqloadShunt_BFigure);

			fFigurePqloadShunt_CFigure = new WrappingLabel();
			fFigurePqloadShunt_CFigure.setText("<...>");

			this.add(fFigurePqloadShunt_CFigure);

			fFigurePqloadPhasesFigure = new WrappingLabel();
			fFigurePqloadPhasesFigure.setText("<...>");

			this.add(fFigurePqloadPhasesFigure);

			fFigurePqloadNominal_voltageFigure = new WrappingLabel();
			fFigurePqloadNominal_voltageFigure.setText("<...>");

			this.add(fFigurePqloadNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadNameFigure() {
			return fFigurePqloadNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadWeatherFigure() {
			return fFigurePqloadWeatherFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadT_nominalFigure() {
			return fFigurePqloadT_nominalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZp_TFigure() {
			return fFigurePqloadZp_TFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZp_HFigure() {
			return fFigurePqloadZp_HFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZp_SFigure() {
			return fFigurePqloadZp_SFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZp_WFigure() {
			return fFigurePqloadZp_WFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZp_RFigure() {
			return fFigurePqloadZp_RFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZpFigure() {
			return fFigurePqloadZpFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZq_TFigure() {
			return fFigurePqloadZq_TFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZq_HFigure() {
			return fFigurePqloadZq_HFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZq_SFigure() {
			return fFigurePqloadZq_SFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZq_WFigure() {
			return fFigurePqloadZq_WFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZq_RFigure() {
			return fFigurePqloadZq_RFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadZqFigure() {
			return fFigurePqloadZqFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIm_TFigure() {
			return fFigurePqloadIm_TFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIm_HFigure() {
			return fFigurePqloadIm_HFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIm_SFigure() {
			return fFigurePqloadIm_SFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIm_WFigure() {
			return fFigurePqloadIm_WFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIm_RFigure() {
			return fFigurePqloadIm_RFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadImFigure() {
			return fFigurePqloadImFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIa_TFigure() {
			return fFigurePqloadIa_TFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIa_HFigure() {
			return fFigurePqloadIa_HFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIa_SFigure() {
			return fFigurePqloadIa_SFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIa_WFigure() {
			return fFigurePqloadIa_WFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIa_RFigure() {
			return fFigurePqloadIa_RFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadIaFigure() {
			return fFigurePqloadIaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPp_TFigure() {
			return fFigurePqloadPp_TFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPp_HFigure() {
			return fFigurePqloadPp_HFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPp_SFigure() {
			return fFigurePqloadPp_SFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPp_WFigure() {
			return fFigurePqloadPp_WFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPp_RFigure() {
			return fFigurePqloadPp_RFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPpFigure() {
			return fFigurePqloadPpFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPq_TFigure() {
			return fFigurePqloadPq_TFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPq_HFigure() {
			return fFigurePqloadPq_HFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPq_SFigure() {
			return fFigurePqloadPq_SFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPq_WFigure() {
			return fFigurePqloadPq_WFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPq_RFigure() {
			return fFigurePqloadPq_RFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPqFigure() {
			return fFigurePqloadPqFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadInput_tempFigure() {
			return fFigurePqloadInput_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadInput_humidFigure() {
			return fFigurePqloadInput_humidFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadInput_solarFigure() {
			return fFigurePqloadInput_solarFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadInput_windFigure() {
			return fFigurePqloadInput_windFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadInput_rainFigure() {
			return fFigurePqloadInput_rainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_imped_pFigure() {
			return fFigurePqloadOutput_imped_pFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_imped_qFigure() {
			return fFigurePqloadOutput_imped_qFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_current_mFigure() {
			return fFigurePqloadOutput_current_mFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_current_aFigure() {
			return fFigurePqloadOutput_current_aFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_power_pFigure() {
			return fFigurePqloadOutput_power_pFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_power_qFigure() {
			return fFigurePqloadOutput_power_qFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_impedanceFigure() {
			return fFigurePqloadOutput_impedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_currentFigure() {
			return fFigurePqloadOutput_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadOutput_powerFigure() {
			return fFigurePqloadOutput_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadLoad_classFigure() {
			return fFigurePqloadLoad_classFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_AFigure() {
			return fFigurePqloadConstant_power_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_BFigure() {
			return fFigurePqloadConstant_power_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_CFigure() {
			return fFigurePqloadConstant_power_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_A_realFigure() {
			return fFigurePqloadConstant_power_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_B_realFigure() {
			return fFigurePqloadConstant_power_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_C_realFigure() {
			return fFigurePqloadConstant_power_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_A_reacFigure() {
			return fFigurePqloadConstant_power_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_B_reacFigure() {
			return fFigurePqloadConstant_power_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_power_C_reacFigure() {
			return fFigurePqloadConstant_power_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_AFigure() {
			return fFigurePqloadConstant_current_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_BFigure() {
			return fFigurePqloadConstant_current_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_CFigure() {
			return fFigurePqloadConstant_current_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_A_realFigure() {
			return fFigurePqloadConstant_current_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_B_realFigure() {
			return fFigurePqloadConstant_current_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_C_realFigure() {
			return fFigurePqloadConstant_current_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_A_reacFigure() {
			return fFigurePqloadConstant_current_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_B_reacFigure() {
			return fFigurePqloadConstant_current_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_current_C_reacFigure() {
			return fFigurePqloadConstant_current_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_AFigure() {
			return fFigurePqloadConstant_impedance_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_BFigure() {
			return fFigurePqloadConstant_impedance_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_CFigure() {
			return fFigurePqloadConstant_impedance_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_A_realFigure() {
			return fFigurePqloadConstant_impedance_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_B_realFigure() {
			return fFigurePqloadConstant_impedance_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_C_realFigure() {
			return fFigurePqloadConstant_impedance_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_A_reacFigure() {
			return fFigurePqloadConstant_impedance_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_B_reacFigure() {
			return fFigurePqloadConstant_impedance_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadConstant_impedance_C_reacFigure() {
			return fFigurePqloadConstant_impedance_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMeasured_voltage_AFigure() {
			return fFigurePqloadMeasured_voltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMeasured_voltage_BFigure() {
			return fFigurePqloadMeasured_voltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMeasured_voltage_CFigure() {
			return fFigurePqloadMeasured_voltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMeasured_voltage_ABFigure() {
			return fFigurePqloadMeasured_voltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMeasured_voltage_BCFigure() {
			return fFigurePqloadMeasured_voltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMeasured_voltage_CAFigure() {
			return fFigurePqloadMeasured_voltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadBustypeFigure() {
			return fFigurePqloadBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadBusflagsFigure() {
			return fFigurePqloadBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadReference_busFigure() {
			return fFigurePqloadReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadMaximum_voltage_errorFigure() {
			return fFigurePqloadMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadVoltage_AFigure() {
			return fFigurePqloadVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadVoltage_BFigure() {
			return fFigurePqloadVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadVoltage_CFigure() {
			return fFigurePqloadVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadVoltage_ABFigure() {
			return fFigurePqloadVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadVoltage_BCFigure() {
			return fFigurePqloadVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadVoltage_CAFigure() {
			return fFigurePqloadVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadCurrent_AFigure() {
			return fFigurePqloadCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadCurrent_BFigure() {
			return fFigurePqloadCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadCurrent_CFigure() {
			return fFigurePqloadCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPower_AFigure() {
			return fFigurePqloadPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPower_BFigure() {
			return fFigurePqloadPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPower_CFigure() {
			return fFigurePqloadPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadShunt_AFigure() {
			return fFigurePqloadShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadShunt_BFigure() {
			return fFigurePqloadShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadShunt_CFigure() {
			return fFigurePqloadShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadPhasesFigure() {
			return fFigurePqloadPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePqloadNominal_voltageFigure() {
			return fFigurePqloadNominal_voltageFigure;
		}

	}

}
