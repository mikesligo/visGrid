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
public class LoadEditPart extends ShapeNodeEditPart {

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
	public LoadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.LoadItemSemanticEditPolicy());
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
		return primaryShape = new LoadFigure();
	}

	/**
	 * @generated
	 */
	public LoadFigure getPrimaryShape() {
		return (LoadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LoadNameEditPart) {
			((visGrid.diagram.edit.parts.LoadNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLoadNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LoadNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.LoadNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LoadConnection_4117) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLoad_4140) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class LoadFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadLoad_classFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_power_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_current_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_A_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_B_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_C_realFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_A_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_B_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadConstant_impedance_C_reacFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMeasured_voltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLoadNominal_voltageFigure;

		/**
		 * @generated
		 */
		public LoadFigure() {

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

			fFigureLoadNameFigure = new WrappingLabel();
			fFigureLoadNameFigure.setText("<...>");

			this.add(fFigureLoadNameFigure);

			fFigureLoadLoad_classFigure = new WrappingLabel();
			fFigureLoadLoad_classFigure.setText("<...>");

			this.add(fFigureLoadLoad_classFigure);

			fFigureLoadConstant_power_AFigure = new WrappingLabel();
			fFigureLoadConstant_power_AFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_AFigure);

			fFigureLoadConstant_power_BFigure = new WrappingLabel();
			fFigureLoadConstant_power_BFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_BFigure);

			fFigureLoadConstant_power_CFigure = new WrappingLabel();
			fFigureLoadConstant_power_CFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_CFigure);

			fFigureLoadConstant_power_A_realFigure = new WrappingLabel();
			fFigureLoadConstant_power_A_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_A_realFigure);

			fFigureLoadConstant_power_B_realFigure = new WrappingLabel();
			fFigureLoadConstant_power_B_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_B_realFigure);

			fFigureLoadConstant_power_C_realFigure = new WrappingLabel();
			fFigureLoadConstant_power_C_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_C_realFigure);

			fFigureLoadConstant_power_A_reacFigure = new WrappingLabel();
			fFigureLoadConstant_power_A_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_A_reacFigure);

			fFigureLoadConstant_power_B_reacFigure = new WrappingLabel();
			fFigureLoadConstant_power_B_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_B_reacFigure);

			fFigureLoadConstant_power_C_reacFigure = new WrappingLabel();
			fFigureLoadConstant_power_C_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_power_C_reacFigure);

			fFigureLoadConstant_current_AFigure = new WrappingLabel();
			fFigureLoadConstant_current_AFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_AFigure);

			fFigureLoadConstant_current_BFigure = new WrappingLabel();
			fFigureLoadConstant_current_BFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_BFigure);

			fFigureLoadConstant_current_CFigure = new WrappingLabel();
			fFigureLoadConstant_current_CFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_CFigure);

			fFigureLoadConstant_current_A_realFigure = new WrappingLabel();
			fFigureLoadConstant_current_A_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_A_realFigure);

			fFigureLoadConstant_current_B_realFigure = new WrappingLabel();
			fFigureLoadConstant_current_B_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_B_realFigure);

			fFigureLoadConstant_current_C_realFigure = new WrappingLabel();
			fFigureLoadConstant_current_C_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_C_realFigure);

			fFigureLoadConstant_current_A_reacFigure = new WrappingLabel();
			fFigureLoadConstant_current_A_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_A_reacFigure);

			fFigureLoadConstant_current_B_reacFigure = new WrappingLabel();
			fFigureLoadConstant_current_B_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_B_reacFigure);

			fFigureLoadConstant_current_C_reacFigure = new WrappingLabel();
			fFigureLoadConstant_current_C_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_current_C_reacFigure);

			fFigureLoadConstant_impedance_AFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_AFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_AFigure);

			fFigureLoadConstant_impedance_BFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_BFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_BFigure);

			fFigureLoadConstant_impedance_CFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_CFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_CFigure);

			fFigureLoadConstant_impedance_A_realFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_A_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_A_realFigure);

			fFigureLoadConstant_impedance_B_realFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_B_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_B_realFigure);

			fFigureLoadConstant_impedance_C_realFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_C_realFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_C_realFigure);

			fFigureLoadConstant_impedance_A_reacFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_A_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_A_reacFigure);

			fFigureLoadConstant_impedance_B_reacFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_B_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_B_reacFigure);

			fFigureLoadConstant_impedance_C_reacFigure = new WrappingLabel();
			fFigureLoadConstant_impedance_C_reacFigure.setText("<...>");

			this.add(fFigureLoadConstant_impedance_C_reacFigure);

			fFigureLoadMeasured_voltage_AFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_AFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_AFigure);

			fFigureLoadMeasured_voltage_BFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_BFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_BFigure);

			fFigureLoadMeasured_voltage_CFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_CFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_CFigure);

			fFigureLoadMeasured_voltage_ABFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_ABFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_ABFigure);

			fFigureLoadMeasured_voltage_BCFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_BCFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_BCFigure);

			fFigureLoadMeasured_voltage_CAFigure = new WrappingLabel();
			fFigureLoadMeasured_voltage_CAFigure.setText("<...>");

			this.add(fFigureLoadMeasured_voltage_CAFigure);

			fFigureLoadBustypeFigure = new WrappingLabel();
			fFigureLoadBustypeFigure.setText("<...>");

			this.add(fFigureLoadBustypeFigure);

			fFigureLoadBusflagsFigure = new WrappingLabel();
			fFigureLoadBusflagsFigure.setText("<...>");

			this.add(fFigureLoadBusflagsFigure);

			fFigureLoadReference_busFigure = new WrappingLabel();
			fFigureLoadReference_busFigure.setText("<...>");

			this.add(fFigureLoadReference_busFigure);

			fFigureLoadMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureLoadMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureLoadMaximum_voltage_errorFigure);

			fFigureLoadVoltage_AFigure = new WrappingLabel();
			fFigureLoadVoltage_AFigure.setText("<...>");

			this.add(fFigureLoadVoltage_AFigure);

			fFigureLoadVoltage_BFigure = new WrappingLabel();
			fFigureLoadVoltage_BFigure.setText("<...>");

			this.add(fFigureLoadVoltage_BFigure);

			fFigureLoadVoltage_CFigure = new WrappingLabel();
			fFigureLoadVoltage_CFigure.setText("<...>");

			this.add(fFigureLoadVoltage_CFigure);

			fFigureLoadVoltage_ABFigure = new WrappingLabel();
			fFigureLoadVoltage_ABFigure.setText("<...>");

			this.add(fFigureLoadVoltage_ABFigure);

			fFigureLoadVoltage_BCFigure = new WrappingLabel();
			fFigureLoadVoltage_BCFigure.setText("<...>");

			this.add(fFigureLoadVoltage_BCFigure);

			fFigureLoadVoltage_CAFigure = new WrappingLabel();
			fFigureLoadVoltage_CAFigure.setText("<...>");

			this.add(fFigureLoadVoltage_CAFigure);

			fFigureLoadCurrent_AFigure = new WrappingLabel();
			fFigureLoadCurrent_AFigure.setText("<...>");

			this.add(fFigureLoadCurrent_AFigure);

			fFigureLoadCurrent_BFigure = new WrappingLabel();
			fFigureLoadCurrent_BFigure.setText("<...>");

			this.add(fFigureLoadCurrent_BFigure);

			fFigureLoadCurrent_CFigure = new WrappingLabel();
			fFigureLoadCurrent_CFigure.setText("<...>");

			this.add(fFigureLoadCurrent_CFigure);

			fFigureLoadPower_AFigure = new WrappingLabel();
			fFigureLoadPower_AFigure.setText("<...>");

			this.add(fFigureLoadPower_AFigure);

			fFigureLoadPower_BFigure = new WrappingLabel();
			fFigureLoadPower_BFigure.setText("<...>");

			this.add(fFigureLoadPower_BFigure);

			fFigureLoadPower_CFigure = new WrappingLabel();
			fFigureLoadPower_CFigure.setText("<...>");

			this.add(fFigureLoadPower_CFigure);

			fFigureLoadShunt_AFigure = new WrappingLabel();
			fFigureLoadShunt_AFigure.setText("<...>");

			this.add(fFigureLoadShunt_AFigure);

			fFigureLoadShunt_BFigure = new WrappingLabel();
			fFigureLoadShunt_BFigure.setText("<...>");

			this.add(fFigureLoadShunt_BFigure);

			fFigureLoadShunt_CFigure = new WrappingLabel();
			fFigureLoadShunt_CFigure.setText("<...>");

			this.add(fFigureLoadShunt_CFigure);

			fFigureLoadPhasesFigure = new WrappingLabel();
			fFigureLoadPhasesFigure.setText("<...>");

			this.add(fFigureLoadPhasesFigure);

			fFigureLoadNominal_voltageFigure = new WrappingLabel();
			fFigureLoadNominal_voltageFigure.setText("<...>");

			this.add(fFigureLoadNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadNameFigure() {
			return fFigureLoadNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadLoad_classFigure() {
			return fFigureLoadLoad_classFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_AFigure() {
			return fFigureLoadConstant_power_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_BFigure() {
			return fFigureLoadConstant_power_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_CFigure() {
			return fFigureLoadConstant_power_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_A_realFigure() {
			return fFigureLoadConstant_power_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_B_realFigure() {
			return fFigureLoadConstant_power_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_C_realFigure() {
			return fFigureLoadConstant_power_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_A_reacFigure() {
			return fFigureLoadConstant_power_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_B_reacFigure() {
			return fFigureLoadConstant_power_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_power_C_reacFigure() {
			return fFigureLoadConstant_power_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_AFigure() {
			return fFigureLoadConstant_current_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_BFigure() {
			return fFigureLoadConstant_current_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_CFigure() {
			return fFigureLoadConstant_current_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_A_realFigure() {
			return fFigureLoadConstant_current_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_B_realFigure() {
			return fFigureLoadConstant_current_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_C_realFigure() {
			return fFigureLoadConstant_current_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_A_reacFigure() {
			return fFigureLoadConstant_current_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_B_reacFigure() {
			return fFigureLoadConstant_current_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_current_C_reacFigure() {
			return fFigureLoadConstant_current_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_AFigure() {
			return fFigureLoadConstant_impedance_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_BFigure() {
			return fFigureLoadConstant_impedance_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_CFigure() {
			return fFigureLoadConstant_impedance_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_A_realFigure() {
			return fFigureLoadConstant_impedance_A_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_B_realFigure() {
			return fFigureLoadConstant_impedance_B_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_C_realFigure() {
			return fFigureLoadConstant_impedance_C_realFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_A_reacFigure() {
			return fFigureLoadConstant_impedance_A_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_B_reacFigure() {
			return fFigureLoadConstant_impedance_B_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadConstant_impedance_C_reacFigure() {
			return fFigureLoadConstant_impedance_C_reacFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_AFigure() {
			return fFigureLoadMeasured_voltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_BFigure() {
			return fFigureLoadMeasured_voltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_CFigure() {
			return fFigureLoadMeasured_voltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_ABFigure() {
			return fFigureLoadMeasured_voltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_BCFigure() {
			return fFigureLoadMeasured_voltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMeasured_voltage_CAFigure() {
			return fFigureLoadMeasured_voltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadBustypeFigure() {
			return fFigureLoadBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadBusflagsFigure() {
			return fFigureLoadBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadReference_busFigure() {
			return fFigureLoadReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadMaximum_voltage_errorFigure() {
			return fFigureLoadMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_AFigure() {
			return fFigureLoadVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_BFigure() {
			return fFigureLoadVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_CFigure() {
			return fFigureLoadVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_ABFigure() {
			return fFigureLoadVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_BCFigure() {
			return fFigureLoadVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadVoltage_CAFigure() {
			return fFigureLoadVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadCurrent_AFigure() {
			return fFigureLoadCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadCurrent_BFigure() {
			return fFigureLoadCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadCurrent_CFigure() {
			return fFigureLoadCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPower_AFigure() {
			return fFigureLoadPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPower_BFigure() {
			return fFigureLoadPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPower_CFigure() {
			return fFigureLoadPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadShunt_AFigure() {
			return fFigureLoadShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadShunt_BFigure() {
			return fFigureLoadShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadShunt_CFigure() {
			return fFigureLoadShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadPhasesFigure() {
			return fFigureLoadPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLoadNominal_voltageFigure() {
			return fFigureLoadNominal_voltageFigure;
		}

	}

}
