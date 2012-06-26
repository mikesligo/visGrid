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
public class Triplex_meterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2064;

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
	public Triplex_meterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Triplex_meterItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_meterFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_meterFigure getPrimaryShape() {
		return (Triplex_meterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterNameEditPart) {
			((visGrid.diagram.edit.parts.Triplex_meterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTriplex_meterNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Triplex_meterNameEditPart.VISUAL_ID));
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
	public class Triplex_meterFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_real_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_reactive_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterIndiv_measured_power_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterIndiv_measured_power_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterIndiv_measured_power_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_real_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_reactive_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_voltage_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_voltage_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_voltage_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_current_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_current_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMeasured_current_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMonthly_billFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPrevious_monthly_billFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPrevious_monthly_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMonthly_feeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMonthly_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterBill_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_marketFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterBill_dayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPriceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterFirst_tier_priceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterFirst_tier_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterSecond_tier_priceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterSecond_tier_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterThird_tier_priceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterThird_tier_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterVoltage_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterVoltage_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterVoltage_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterVoltage_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterVoltage_1NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterVoltage_2NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_N_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_N_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterCurrent_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_1_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_2_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterResidential_nominal_current_12_imagFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPower_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterShunt_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterShunt_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterShunt_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_12Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_1_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_2_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_12_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_1_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_2_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterImpedance_12_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterHouse_presentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterNR_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_meterNominal_voltageFigure;

		/**
		 * @generated
		 */
		public Triplex_meterFigure() {

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

			fFigureTriplex_meterNameFigure = new WrappingLabel();
			fFigureTriplex_meterNameFigure.setText("<...>");

			this.add(fFigureTriplex_meterNameFigure);

			fFigureTriplex_meterMeasured_real_energyFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_real_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_real_energyFigure);

			fFigureTriplex_meterMeasured_reactive_energyFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_reactive_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_reactive_energyFigure);

			fFigureTriplex_meterMeasured_powerFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_powerFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_powerFigure);

			fFigureTriplex_meterIndiv_measured_power_1Figure = new WrappingLabel();
			fFigureTriplex_meterIndiv_measured_power_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterIndiv_measured_power_1Figure);

			fFigureTriplex_meterIndiv_measured_power_2Figure = new WrappingLabel();
			fFigureTriplex_meterIndiv_measured_power_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterIndiv_measured_power_2Figure);

			fFigureTriplex_meterIndiv_measured_power_NFigure = new WrappingLabel();
			fFigureTriplex_meterIndiv_measured_power_NFigure.setText("<...>");

			this.add(fFigureTriplex_meterIndiv_measured_power_NFigure);

			fFigureTriplex_meterMeasured_demandFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_demandFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_demandFigure);

			fFigureTriplex_meterMeasured_real_powerFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_real_powerFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_real_powerFigure);

			fFigureTriplex_meterMeasured_reactive_powerFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_reactive_powerFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_reactive_powerFigure);

			fFigureTriplex_meterMeasured_voltage_1Figure = new WrappingLabel();
			fFigureTriplex_meterMeasured_voltage_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_voltage_1Figure);

			fFigureTriplex_meterMeasured_voltage_2Figure = new WrappingLabel();
			fFigureTriplex_meterMeasured_voltage_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_voltage_2Figure);

			fFigureTriplex_meterMeasured_voltage_NFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_voltage_NFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_voltage_NFigure);

			fFigureTriplex_meterMeasured_current_1Figure = new WrappingLabel();
			fFigureTriplex_meterMeasured_current_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_current_1Figure);

			fFigureTriplex_meterMeasured_current_2Figure = new WrappingLabel();
			fFigureTriplex_meterMeasured_current_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_current_2Figure);

			fFigureTriplex_meterMeasured_current_NFigure = new WrappingLabel();
			fFigureTriplex_meterMeasured_current_NFigure.setText("<...>");

			this.add(fFigureTriplex_meterMeasured_current_NFigure);

			fFigureTriplex_meterMonthly_billFigure = new WrappingLabel();
			fFigureTriplex_meterMonthly_billFigure.setText("<...>");

			this.add(fFigureTriplex_meterMonthly_billFigure);

			fFigureTriplex_meterPrevious_monthly_billFigure = new WrappingLabel();
			fFigureTriplex_meterPrevious_monthly_billFigure.setText("<...>");

			this.add(fFigureTriplex_meterPrevious_monthly_billFigure);

			fFigureTriplex_meterPrevious_monthly_energyFigure = new WrappingLabel();
			fFigureTriplex_meterPrevious_monthly_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterPrevious_monthly_energyFigure);

			fFigureTriplex_meterMonthly_feeFigure = new WrappingLabel();
			fFigureTriplex_meterMonthly_feeFigure.setText("<...>");

			this.add(fFigureTriplex_meterMonthly_feeFigure);

			fFigureTriplex_meterMonthly_energyFigure = new WrappingLabel();
			fFigureTriplex_meterMonthly_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterMonthly_energyFigure);

			fFigureTriplex_meterBill_modeFigure = new WrappingLabel();
			fFigureTriplex_meterBill_modeFigure.setText("<...>");

			this.add(fFigureTriplex_meterBill_modeFigure);

			fFigureTriplex_meterPower_marketFigure = new WrappingLabel();
			fFigureTriplex_meterPower_marketFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_marketFigure);

			fFigureTriplex_meterBill_dayFigure = new WrappingLabel();
			fFigureTriplex_meterBill_dayFigure.setText("<...>");

			this.add(fFigureTriplex_meterBill_dayFigure);

			fFigureTriplex_meterPriceFigure = new WrappingLabel();
			fFigureTriplex_meterPriceFigure.setText("<...>");

			this.add(fFigureTriplex_meterPriceFigure);

			fFigureTriplex_meterFirst_tier_priceFigure = new WrappingLabel();
			fFigureTriplex_meterFirst_tier_priceFigure.setText("<...>");

			this.add(fFigureTriplex_meterFirst_tier_priceFigure);

			fFigureTriplex_meterFirst_tier_energyFigure = new WrappingLabel();
			fFigureTriplex_meterFirst_tier_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterFirst_tier_energyFigure);

			fFigureTriplex_meterSecond_tier_priceFigure = new WrappingLabel();
			fFigureTriplex_meterSecond_tier_priceFigure.setText("<...>");

			this.add(fFigureTriplex_meterSecond_tier_priceFigure);

			fFigureTriplex_meterSecond_tier_energyFigure = new WrappingLabel();
			fFigureTriplex_meterSecond_tier_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterSecond_tier_energyFigure);

			fFigureTriplex_meterThird_tier_priceFigure = new WrappingLabel();
			fFigureTriplex_meterThird_tier_priceFigure.setText("<...>");

			this.add(fFigureTriplex_meterThird_tier_priceFigure);

			fFigureTriplex_meterThird_tier_energyFigure = new WrappingLabel();
			fFigureTriplex_meterThird_tier_energyFigure.setText("<...>");

			this.add(fFigureTriplex_meterThird_tier_energyFigure);

			fFigureTriplex_meterBustypeFigure = new WrappingLabel();
			fFigureTriplex_meterBustypeFigure.setText("<...>");

			this.add(fFigureTriplex_meterBustypeFigure);

			fFigureTriplex_meterBusflagsFigure = new WrappingLabel();
			fFigureTriplex_meterBusflagsFigure.setText("<...>");

			this.add(fFigureTriplex_meterBusflagsFigure);

			fFigureTriplex_meterReference_busFigure = new WrappingLabel();
			fFigureTriplex_meterReference_busFigure.setText("<...>");

			this.add(fFigureTriplex_meterReference_busFigure);

			fFigureTriplex_meterMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureTriplex_meterMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureTriplex_meterMaximum_voltage_errorFigure);

			fFigureTriplex_meterVoltage_1Figure = new WrappingLabel();
			fFigureTriplex_meterVoltage_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterVoltage_1Figure);

			fFigureTriplex_meterVoltage_2Figure = new WrappingLabel();
			fFigureTriplex_meterVoltage_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterVoltage_2Figure);

			fFigureTriplex_meterVoltage_NFigure = new WrappingLabel();
			fFigureTriplex_meterVoltage_NFigure.setText("<...>");

			this.add(fFigureTriplex_meterVoltage_NFigure);

			fFigureTriplex_meterVoltage_12Figure = new WrappingLabel();
			fFigureTriplex_meterVoltage_12Figure.setText("<...>");

			this.add(fFigureTriplex_meterVoltage_12Figure);

			fFigureTriplex_meterVoltage_1NFigure = new WrappingLabel();
			fFigureTriplex_meterVoltage_1NFigure.setText("<...>");

			this.add(fFigureTriplex_meterVoltage_1NFigure);

			fFigureTriplex_meterVoltage_2NFigure = new WrappingLabel();
			fFigureTriplex_meterVoltage_2NFigure.setText("<...>");

			this.add(fFigureTriplex_meterVoltage_2NFigure);

			fFigureTriplex_meterCurrent_1Figure = new WrappingLabel();
			fFigureTriplex_meterCurrent_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_1Figure);

			fFigureTriplex_meterCurrent_2Figure = new WrappingLabel();
			fFigureTriplex_meterCurrent_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_2Figure);

			fFigureTriplex_meterCurrent_NFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_NFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_NFigure);

			fFigureTriplex_meterCurrent_1_realFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_1_realFigure);

			fFigureTriplex_meterCurrent_2_realFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_2_realFigure);

			fFigureTriplex_meterCurrent_N_realFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_N_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_N_realFigure);

			fFigureTriplex_meterCurrent_1_reacFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_1_reacFigure);

			fFigureTriplex_meterCurrent_2_reacFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_2_reacFigure);

			fFigureTriplex_meterCurrent_N_reacFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_N_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_N_reacFigure);

			fFigureTriplex_meterCurrent_12Figure = new WrappingLabel();
			fFigureTriplex_meterCurrent_12Figure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_12Figure);

			fFigureTriplex_meterCurrent_12_realFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_12_realFigure);

			fFigureTriplex_meterCurrent_12_reacFigure = new WrappingLabel();
			fFigureTriplex_meterCurrent_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterCurrent_12_reacFigure);

			fFigureTriplex_meterResidential_nominal_current_1Figure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_1Figure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_1Figure);

			fFigureTriplex_meterResidential_nominal_current_2Figure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_2Figure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_2Figure);

			fFigureTriplex_meterResidential_nominal_current_12Figure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_12Figure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_12Figure);

			fFigureTriplex_meterResidential_nominal_current_1_realFigure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_1_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_1_realFigure);

			fFigureTriplex_meterResidential_nominal_current_1_imagFigure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_1_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_1_imagFigure);

			fFigureTriplex_meterResidential_nominal_current_2_realFigure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_2_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_2_realFigure);

			fFigureTriplex_meterResidential_nominal_current_2_imagFigure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_2_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_2_imagFigure);

			fFigureTriplex_meterResidential_nominal_current_12_realFigure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_12_realFigure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_12_realFigure);

			fFigureTriplex_meterResidential_nominal_current_12_imagFigure = new WrappingLabel();
			fFigureTriplex_meterResidential_nominal_current_12_imagFigure
					.setText("<...>");

			this.add(fFigureTriplex_meterResidential_nominal_current_12_imagFigure);

			fFigureTriplex_meterPower_1Figure = new WrappingLabel();
			fFigureTriplex_meterPower_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterPower_1Figure);

			fFigureTriplex_meterPower_2Figure = new WrappingLabel();
			fFigureTriplex_meterPower_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterPower_2Figure);

			fFigureTriplex_meterPower_12Figure = new WrappingLabel();
			fFigureTriplex_meterPower_12Figure.setText("<...>");

			this.add(fFigureTriplex_meterPower_12Figure);

			fFigureTriplex_meterPower_1_realFigure = new WrappingLabel();
			fFigureTriplex_meterPower_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_1_realFigure);

			fFigureTriplex_meterPower_2_realFigure = new WrappingLabel();
			fFigureTriplex_meterPower_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_2_realFigure);

			fFigureTriplex_meterPower_12_realFigure = new WrappingLabel();
			fFigureTriplex_meterPower_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_12_realFigure);

			fFigureTriplex_meterPower_1_reacFigure = new WrappingLabel();
			fFigureTriplex_meterPower_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_1_reacFigure);

			fFigureTriplex_meterPower_2_reacFigure = new WrappingLabel();
			fFigureTriplex_meterPower_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_2_reacFigure);

			fFigureTriplex_meterPower_12_reacFigure = new WrappingLabel();
			fFigureTriplex_meterPower_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterPower_12_reacFigure);

			fFigureTriplex_meterShunt_1Figure = new WrappingLabel();
			fFigureTriplex_meterShunt_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterShunt_1Figure);

			fFigureTriplex_meterShunt_2Figure = new WrappingLabel();
			fFigureTriplex_meterShunt_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterShunt_2Figure);

			fFigureTriplex_meterShunt_12Figure = new WrappingLabel();
			fFigureTriplex_meterShunt_12Figure.setText("<...>");

			this.add(fFigureTriplex_meterShunt_12Figure);

			fFigureTriplex_meterImpedance_1Figure = new WrappingLabel();
			fFigureTriplex_meterImpedance_1Figure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_1Figure);

			fFigureTriplex_meterImpedance_2Figure = new WrappingLabel();
			fFigureTriplex_meterImpedance_2Figure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_2Figure);

			fFigureTriplex_meterImpedance_12Figure = new WrappingLabel();
			fFigureTriplex_meterImpedance_12Figure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_12Figure);

			fFigureTriplex_meterImpedance_1_realFigure = new WrappingLabel();
			fFigureTriplex_meterImpedance_1_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_1_realFigure);

			fFigureTriplex_meterImpedance_2_realFigure = new WrappingLabel();
			fFigureTriplex_meterImpedance_2_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_2_realFigure);

			fFigureTriplex_meterImpedance_12_realFigure = new WrappingLabel();
			fFigureTriplex_meterImpedance_12_realFigure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_12_realFigure);

			fFigureTriplex_meterImpedance_1_reacFigure = new WrappingLabel();
			fFigureTriplex_meterImpedance_1_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_1_reacFigure);

			fFigureTriplex_meterImpedance_2_reacFigure = new WrappingLabel();
			fFigureTriplex_meterImpedance_2_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_2_reacFigure);

			fFigureTriplex_meterImpedance_12_reacFigure = new WrappingLabel();
			fFigureTriplex_meterImpedance_12_reacFigure.setText("<...>");

			this.add(fFigureTriplex_meterImpedance_12_reacFigure);

			fFigureTriplex_meterHouse_presentFigure = new WrappingLabel();
			fFigureTriplex_meterHouse_presentFigure.setText("<...>");

			this.add(fFigureTriplex_meterHouse_presentFigure);

			fFigureTriplex_meterNR_modeFigure = new WrappingLabel();
			fFigureTriplex_meterNR_modeFigure.setText("<...>");

			this.add(fFigureTriplex_meterNR_modeFigure);

			fFigureTriplex_meterPhasesFigure = new WrappingLabel();
			fFigureTriplex_meterPhasesFigure.setText("<...>");

			this.add(fFigureTriplex_meterPhasesFigure);

			fFigureTriplex_meterNominal_voltageFigure = new WrappingLabel();
			fFigureTriplex_meterNominal_voltageFigure.setText("<...>");

			this.add(fFigureTriplex_meterNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterNameFigure() {
			return fFigureTriplex_meterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_real_energyFigure() {
			return fFigureTriplex_meterMeasured_real_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_reactive_energyFigure() {
			return fFigureTriplex_meterMeasured_reactive_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_powerFigure() {
			return fFigureTriplex_meterMeasured_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterIndiv_measured_power_1Figure() {
			return fFigureTriplex_meterIndiv_measured_power_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterIndiv_measured_power_2Figure() {
			return fFigureTriplex_meterIndiv_measured_power_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterIndiv_measured_power_NFigure() {
			return fFigureTriplex_meterIndiv_measured_power_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_demandFigure() {
			return fFigureTriplex_meterMeasured_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_real_powerFigure() {
			return fFigureTriplex_meterMeasured_real_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_reactive_powerFigure() {
			return fFigureTriplex_meterMeasured_reactive_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_voltage_1Figure() {
			return fFigureTriplex_meterMeasured_voltage_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_voltage_2Figure() {
			return fFigureTriplex_meterMeasured_voltage_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_voltage_NFigure() {
			return fFigureTriplex_meterMeasured_voltage_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_current_1Figure() {
			return fFigureTriplex_meterMeasured_current_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_current_2Figure() {
			return fFigureTriplex_meterMeasured_current_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMeasured_current_NFigure() {
			return fFigureTriplex_meterMeasured_current_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMonthly_billFigure() {
			return fFigureTriplex_meterMonthly_billFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPrevious_monthly_billFigure() {
			return fFigureTriplex_meterPrevious_monthly_billFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPrevious_monthly_energyFigure() {
			return fFigureTriplex_meterPrevious_monthly_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMonthly_feeFigure() {
			return fFigureTriplex_meterMonthly_feeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMonthly_energyFigure() {
			return fFigureTriplex_meterMonthly_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterBill_modeFigure() {
			return fFigureTriplex_meterBill_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_marketFigure() {
			return fFigureTriplex_meterPower_marketFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterBill_dayFigure() {
			return fFigureTriplex_meterBill_dayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPriceFigure() {
			return fFigureTriplex_meterPriceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterFirst_tier_priceFigure() {
			return fFigureTriplex_meterFirst_tier_priceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterFirst_tier_energyFigure() {
			return fFigureTriplex_meterFirst_tier_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterSecond_tier_priceFigure() {
			return fFigureTriplex_meterSecond_tier_priceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterSecond_tier_energyFigure() {
			return fFigureTriplex_meterSecond_tier_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterThird_tier_priceFigure() {
			return fFigureTriplex_meterThird_tier_priceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterThird_tier_energyFigure() {
			return fFigureTriplex_meterThird_tier_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterBustypeFigure() {
			return fFigureTriplex_meterBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterBusflagsFigure() {
			return fFigureTriplex_meterBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterReference_busFigure() {
			return fFigureTriplex_meterReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterMaximum_voltage_errorFigure() {
			return fFigureTriplex_meterMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterVoltage_1Figure() {
			return fFigureTriplex_meterVoltage_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterVoltage_2Figure() {
			return fFigureTriplex_meterVoltage_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterVoltage_NFigure() {
			return fFigureTriplex_meterVoltage_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterVoltage_12Figure() {
			return fFigureTriplex_meterVoltage_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterVoltage_1NFigure() {
			return fFigureTriplex_meterVoltage_1NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterVoltage_2NFigure() {
			return fFigureTriplex_meterVoltage_2NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_1Figure() {
			return fFigureTriplex_meterCurrent_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_2Figure() {
			return fFigureTriplex_meterCurrent_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_NFigure() {
			return fFigureTriplex_meterCurrent_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_1_realFigure() {
			return fFigureTriplex_meterCurrent_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_2_realFigure() {
			return fFigureTriplex_meterCurrent_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_N_realFigure() {
			return fFigureTriplex_meterCurrent_N_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_1_reacFigure() {
			return fFigureTriplex_meterCurrent_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_2_reacFigure() {
			return fFigureTriplex_meterCurrent_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_N_reacFigure() {
			return fFigureTriplex_meterCurrent_N_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_12Figure() {
			return fFigureTriplex_meterCurrent_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_12_realFigure() {
			return fFigureTriplex_meterCurrent_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterCurrent_12_reacFigure() {
			return fFigureTriplex_meterCurrent_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_1Figure() {
			return fFigureTriplex_meterResidential_nominal_current_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_2Figure() {
			return fFigureTriplex_meterResidential_nominal_current_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_12Figure() {
			return fFigureTriplex_meterResidential_nominal_current_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_1_realFigure() {
			return fFigureTriplex_meterResidential_nominal_current_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_1_imagFigure() {
			return fFigureTriplex_meterResidential_nominal_current_1_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_2_realFigure() {
			return fFigureTriplex_meterResidential_nominal_current_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_2_imagFigure() {
			return fFigureTriplex_meterResidential_nominal_current_2_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_12_realFigure() {
			return fFigureTriplex_meterResidential_nominal_current_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterResidential_nominal_current_12_imagFigure() {
			return fFigureTriplex_meterResidential_nominal_current_12_imagFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_1Figure() {
			return fFigureTriplex_meterPower_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_2Figure() {
			return fFigureTriplex_meterPower_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_12Figure() {
			return fFigureTriplex_meterPower_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_1_realFigure() {
			return fFigureTriplex_meterPower_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_2_realFigure() {
			return fFigureTriplex_meterPower_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_12_realFigure() {
			return fFigureTriplex_meterPower_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_1_reacFigure() {
			return fFigureTriplex_meterPower_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_2_reacFigure() {
			return fFigureTriplex_meterPower_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPower_12_reacFigure() {
			return fFigureTriplex_meterPower_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterShunt_1Figure() {
			return fFigureTriplex_meterShunt_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterShunt_2Figure() {
			return fFigureTriplex_meterShunt_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterShunt_12Figure() {
			return fFigureTriplex_meterShunt_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_1Figure() {
			return fFigureTriplex_meterImpedance_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_2Figure() {
			return fFigureTriplex_meterImpedance_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_12Figure() {
			return fFigureTriplex_meterImpedance_12Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_1_realFigure() {
			return fFigureTriplex_meterImpedance_1_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_2_realFigure() {
			return fFigureTriplex_meterImpedance_2_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_12_realFigure() {
			return fFigureTriplex_meterImpedance_12_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_1_reacFigure() {
			return fFigureTriplex_meterImpedance_1_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_2_reacFigure() {
			return fFigureTriplex_meterImpedance_2_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterImpedance_12_reacFigure() {
			return fFigureTriplex_meterImpedance_12_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterHouse_presentFigure() {
			return fFigureTriplex_meterHouse_presentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterNR_modeFigure() {
			return fFigureTriplex_meterNR_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterPhasesFigure() {
			return fFigureTriplex_meterPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_meterNominal_voltageFigure() {
			return fFigureTriplex_meterNominal_voltageFigure;
		}

	}

}
