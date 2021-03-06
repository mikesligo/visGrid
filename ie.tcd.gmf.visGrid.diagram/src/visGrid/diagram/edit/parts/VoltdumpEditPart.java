package visGrid.diagram.edit.parts;
    import java.io.File;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class VoltdumpEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2023;

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
	public VoltdumpEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.VoltdumpItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new VoltdumpFigure();
	}

	/**
	 * @generated
	 */
	public VoltdumpFigure getPrimaryShape() {
		return (VoltdumpFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.VoltdumpNameEditPart) {
			((visGrid.diagram.edit.parts.VoltdumpNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureVoltdumpNameFigure());
			return true;
		}
		if (childEditPart instanceof visGrid.diagram.edit.parts.VoltdumpFilenameEditPart) {
			((visGrid.diagram.edit.parts.VoltdumpFilenameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureVoltdumpFilenameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.VoltdumpNameEditPart) {
			return true;
		}
		if (childEditPart instanceof visGrid.diagram.edit.parts.VoltdumpFilenameEditPart) {
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
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
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
				.getType(visGrid.diagram.edit.parts.VoltdumpNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_meterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClimateEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DryerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapbankEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HistogramEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RelayEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BatteryEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.NodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.HouseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Transformer_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Volt_var_controlEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Regulator_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Energy_storageEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Csv_readerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LoadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MultizoneEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Series_reactorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.AuctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LinkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.InverterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PqloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlayerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SubstationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicroturbineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_nodeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.TransformerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlugloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Controller2EditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ClotheswasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.StubauctionEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RectifierEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_spacingEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MotorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.House_aEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ControllerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Underground_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OccupantloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.EvchargerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Overhead_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.OfficeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WaterheaterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_lineEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.DishwasherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RecorderEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SwitchEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CommEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.SolarEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.VoltdumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FreezerEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MeterEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ShaperEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_conductorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.MicrowaveEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.PlcEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Fault_checkEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.FuseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.BilldumpEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Frequency_genEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.LightsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CollectorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RestorationEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ZIPloadEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RegulatorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.WeatherEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.RangeEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.GeneratorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.CapacitorEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		if (targetEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionParent_4001) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078);
		} else if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionConnections_4002) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_meter_2050);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Climate_2059);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dryer_2052);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_conductor_2026);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capbank_2024);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Histogram_2069);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Relay_2017);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Battery_2002);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Node_2054);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_conductor_2039);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_2016);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_configuration_2007);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Volt_var_control_2022);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_configuration_2009);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storage_2076);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_reader_2033);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Load_2005);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Multizone_2066);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Refrigerator_2020);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Series_reactor_2032);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Auction_2047);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Link_2004);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Inverter_2058);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Pqload_2006);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Player_2015);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Substation_2067);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microturbine_2038);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_node_2042);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Transformer_2001);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plugload_2019);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller2_2029);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Clotheswasher_2063);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Stubauction_2048);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Rectifier_2075);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronics_2061);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacing_2025);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Motor_2065);
			types.add(visGrid.diagram.providers.VisGridElementTypes.House_a_2008);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Controller_2040);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Underground_line_2041);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_configuration_2053);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Occupantload_2037);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Evcharger_2012);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Overhead_line_2036);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_2034);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Office_2060);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Waterheater_2062);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converter_2068);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_2027);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dishwasher_2010);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Recorder_2046);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Switch_2071);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Comm_2074);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Solar_2051);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Voltdump_2023);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Freezer_2014);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dg_2077);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Meter_2049);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Shaper_2003);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_conductor_2064);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Microwave_2018);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Plc_2073);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fault_check_2028);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configuration_2030);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Fuse_2057);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Billdump_2070);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_gen_2035);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Lights_2056);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduse_2011);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Collector_2021);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Restoration_2013);
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPload_2055);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Regulator_2031);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Weather_2044);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Range_2043);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Generator_2072);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Capacitor_2045);
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dg_2078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class VoltdumpFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureOuterRect;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureVoltdumpNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureVoltdumpFilenameFigure;

		/**
		 * @generated
		 */
		public VoltdumpFigure() {
			this.setLayoutManager(new XYLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure innerSVG0 = new RectangleFigure();
			innerSVG0.setOutline(false);

			this.add(innerSVG0, new Rectangle(getMapMode().DPtoLP(45),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(60),
					getMapMode().DPtoLP(60)));
			innerSVG0.setLayoutManager(new XYLayout());

			SVGFigure voltdumpFigureSVG1 = new SVGFigure();
         File tempFile = new File("visGridImages/voltdump.svg");
		voltdumpFigureSVG1.setURI(tempFile.toURI().toString());

			innerSVG0.add(voltdumpFigureSVG1, new Rectangle(0, 0, getMapMode()
					.DPtoLP(60), getMapMode().DPtoLP(60)));

			RectangleFigure inner0 = new RectangleFigure();
			inner0.setFill(false);
			inner0.setOutline(false);
			inner0.setLineWidth(0);

			this.add(
					inner0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							60), getMapMode().DPtoLP(150), getMapMode().DPtoLP(
							40)));

			FlowLayout layoutInner0 = new FlowLayout();
			layoutInner0.setStretchMinorAxis(false);
			layoutInner0.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutInner0.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutInner0.setMajorSpacing(5);
			layoutInner0.setMinorSpacing(5);
			layoutInner0.setHorizontal(true);

			inner0.setLayoutManager(layoutInner0);

			fFigureVoltdumpNameFigure = new WrappingLabel();
			fFigureVoltdumpNameFigure.setText("<...>");

			inner0.add(fFigureVoltdumpNameFigure);

			FlowLayout layoutFFigureVoltdumpNameFigure = new FlowLayout();
			layoutFFigureVoltdumpNameFigure.setStretchMinorAxis(false);
			layoutFFigureVoltdumpNameFigure
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureVoltdumpNameFigure
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureVoltdumpNameFigure.setMajorSpacing(5);
			layoutFFigureVoltdumpNameFigure.setMinorSpacing(5);
			layoutFFigureVoltdumpNameFigure.setHorizontal(true);

			fFigureVoltdumpNameFigure
					.setLayoutManager(layoutFFigureVoltdumpNameFigure);

			fFigureVoltdumpFilenameFigure = new WrappingLabel();
			fFigureVoltdumpFilenameFigure.setText("<...>");

			inner0.add(fFigureVoltdumpFilenameFigure);

			FlowLayout layoutFFigureVoltdumpFilenameFigure = new FlowLayout();
			layoutFFigureVoltdumpFilenameFigure.setStretchMinorAxis(false);
			layoutFFigureVoltdumpFilenameFigure
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureVoltdumpFilenameFigure
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureVoltdumpFilenameFigure.setMajorSpacing(5);
			layoutFFigureVoltdumpFilenameFigure.setMinorSpacing(5);
			layoutFFigureVoltdumpFilenameFigure.setHorizontal(true);

			fFigureVoltdumpFilenameFigure
					.setLayoutManager(layoutFFigureVoltdumpFilenameFigure);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureOuterRect() {
			return fFigureOuterRect;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureVoltdumpNameFigure() {
			return fFigureVoltdumpNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureVoltdumpFilenameFigure() {
			return fFigureVoltdumpFilenameFigure;
		}

	}

}
