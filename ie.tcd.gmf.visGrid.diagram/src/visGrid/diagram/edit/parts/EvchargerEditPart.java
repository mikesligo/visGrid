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
public class EvchargerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2059;

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
	public EvchargerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.EvchargerItemSemanticEditPolicy());
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
		return primaryShape = new EvchargerFigure();
	}

	/**
	 * @generated
	 */
	public EvchargerFigure getPrimaryShape() {
		return (EvchargerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.EvchargerNameEditPart) {
			((visGrid.diagram.edit.parts.EvchargerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEvchargerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.EvchargerNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.EvchargerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.EvchargerConnection_4096) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsEvcharger_4054) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class EvchargerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerCharger_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerVehicle_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerStateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerP_go_homeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerP_go_workFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerWork_distFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerCapacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerChargeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerCharge_at_workFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerCharge_throttleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerDemand_profileFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEvchargerOverrideFigure;

		/**
		 * @generated
		 */
		public EvchargerFigure() {

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

			fFigureEvchargerNameFigure = new WrappingLabel();
			fFigureEvchargerNameFigure.setText("<...>");

			this.add(fFigureEvchargerNameFigure);

			fFigureEvchargerCharger_typeFigure = new WrappingLabel();
			fFigureEvchargerCharger_typeFigure.setText("<...>");

			this.add(fFigureEvchargerCharger_typeFigure);

			fFigureEvchargerVehicle_typeFigure = new WrappingLabel();
			fFigureEvchargerVehicle_typeFigure.setText("<...>");

			this.add(fFigureEvchargerVehicle_typeFigure);

			fFigureEvchargerStateFigure = new WrappingLabel();
			fFigureEvchargerStateFigure.setText("<...>");

			this.add(fFigureEvchargerStateFigure);

			fFigureEvchargerP_go_homeFigure = new WrappingLabel();
			fFigureEvchargerP_go_homeFigure.setText("<...>");

			this.add(fFigureEvchargerP_go_homeFigure);

			fFigureEvchargerP_go_workFigure = new WrappingLabel();
			fFigureEvchargerP_go_workFigure.setText("<...>");

			this.add(fFigureEvchargerP_go_workFigure);

			fFigureEvchargerWork_distFigure = new WrappingLabel();
			fFigureEvchargerWork_distFigure.setText("<...>");

			this.add(fFigureEvchargerWork_distFigure);

			fFigureEvchargerCapacityFigure = new WrappingLabel();
			fFigureEvchargerCapacityFigure.setText("<...>");

			this.add(fFigureEvchargerCapacityFigure);

			fFigureEvchargerChargeFigure = new WrappingLabel();
			fFigureEvchargerChargeFigure.setText("<...>");

			this.add(fFigureEvchargerChargeFigure);

			fFigureEvchargerCharge_at_workFigure = new WrappingLabel();
			fFigureEvchargerCharge_at_workFigure.setText("<...>");

			this.add(fFigureEvchargerCharge_at_workFigure);

			fFigureEvchargerCharge_throttleFigure = new WrappingLabel();
			fFigureEvchargerCharge_throttleFigure.setText("<...>");

			this.add(fFigureEvchargerCharge_throttleFigure);

			fFigureEvchargerDemand_profileFigure = new WrappingLabel();
			fFigureEvchargerDemand_profileFigure.setText("<...>");

			this.add(fFigureEvchargerDemand_profileFigure);

			fFigureEvchargerShapeFigure = new WrappingLabel();
			fFigureEvchargerShapeFigure.setText("<...>");

			this.add(fFigureEvchargerShapeFigure);

			fFigureEvchargerLoadFigure = new WrappingLabel();
			fFigureEvchargerLoadFigure.setText("<...>");

			this.add(fFigureEvchargerLoadFigure);

			fFigureEvchargerEnergyFigure = new WrappingLabel();
			fFigureEvchargerEnergyFigure.setText("<...>");

			this.add(fFigureEvchargerEnergyFigure);

			fFigureEvchargerPowerFigure = new WrappingLabel();
			fFigureEvchargerPowerFigure.setText("<...>");

			this.add(fFigureEvchargerPowerFigure);

			fFigureEvchargerPeak_demandFigure = new WrappingLabel();
			fFigureEvchargerPeak_demandFigure.setText("<...>");

			this.add(fFigureEvchargerPeak_demandFigure);

			fFigureEvchargerHeatgainFigure = new WrappingLabel();
			fFigureEvchargerHeatgainFigure.setText("<...>");

			this.add(fFigureEvchargerHeatgainFigure);

			fFigureEvchargerHeatgain_fractionFigure = new WrappingLabel();
			fFigureEvchargerHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureEvchargerHeatgain_fractionFigure);

			fFigureEvchargerCurrent_fractionFigure = new WrappingLabel();
			fFigureEvchargerCurrent_fractionFigure.setText("<...>");

			this.add(fFigureEvchargerCurrent_fractionFigure);

			fFigureEvchargerImpedance_fractionFigure = new WrappingLabel();
			fFigureEvchargerImpedance_fractionFigure.setText("<...>");

			this.add(fFigureEvchargerImpedance_fractionFigure);

			fFigureEvchargerPower_fractionFigure = new WrappingLabel();
			fFigureEvchargerPower_fractionFigure.setText("<...>");

			this.add(fFigureEvchargerPower_fractionFigure);

			fFigureEvchargerPower_factorFigure = new WrappingLabel();
			fFigureEvchargerPower_factorFigure.setText("<...>");

			this.add(fFigureEvchargerPower_factorFigure);

			fFigureEvchargerConstant_powerFigure = new WrappingLabel();
			fFigureEvchargerConstant_powerFigure.setText("<...>");

			this.add(fFigureEvchargerConstant_powerFigure);

			fFigureEvchargerConstant_currentFigure = new WrappingLabel();
			fFigureEvchargerConstant_currentFigure.setText("<...>");

			this.add(fFigureEvchargerConstant_currentFigure);

			fFigureEvchargerConstant_admittanceFigure = new WrappingLabel();
			fFigureEvchargerConstant_admittanceFigure.setText("<...>");

			this.add(fFigureEvchargerConstant_admittanceFigure);

			fFigureEvchargerVoltage_factorFigure = new WrappingLabel();
			fFigureEvchargerVoltage_factorFigure.setText("<...>");

			this.add(fFigureEvchargerVoltage_factorFigure);

			fFigureEvchargerConfigurationFigure = new WrappingLabel();
			fFigureEvchargerConfigurationFigure.setText("<...>");

			this.add(fFigureEvchargerConfigurationFigure);

			fFigureEvchargerOverrideFigure = new WrappingLabel();
			fFigureEvchargerOverrideFigure.setText("<...>");

			this.add(fFigureEvchargerOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerNameFigure() {
			return fFigureEvchargerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerCharger_typeFigure() {
			return fFigureEvchargerCharger_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerVehicle_typeFigure() {
			return fFigureEvchargerVehicle_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerStateFigure() {
			return fFigureEvchargerStateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerP_go_homeFigure() {
			return fFigureEvchargerP_go_homeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerP_go_workFigure() {
			return fFigureEvchargerP_go_workFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerWork_distFigure() {
			return fFigureEvchargerWork_distFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerCapacityFigure() {
			return fFigureEvchargerCapacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerChargeFigure() {
			return fFigureEvchargerChargeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerCharge_at_workFigure() {
			return fFigureEvchargerCharge_at_workFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerCharge_throttleFigure() {
			return fFigureEvchargerCharge_throttleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerDemand_profileFigure() {
			return fFigureEvchargerDemand_profileFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerShapeFigure() {
			return fFigureEvchargerShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerLoadFigure() {
			return fFigureEvchargerLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerEnergyFigure() {
			return fFigureEvchargerEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerPowerFigure() {
			return fFigureEvchargerPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerPeak_demandFigure() {
			return fFigureEvchargerPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerHeatgainFigure() {
			return fFigureEvchargerHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerHeatgain_fractionFigure() {
			return fFigureEvchargerHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerCurrent_fractionFigure() {
			return fFigureEvchargerCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerImpedance_fractionFigure() {
			return fFigureEvchargerImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerPower_fractionFigure() {
			return fFigureEvchargerPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerPower_factorFigure() {
			return fFigureEvchargerPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerConstant_powerFigure() {
			return fFigureEvchargerConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerConstant_currentFigure() {
			return fFigureEvchargerConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerConstant_admittanceFigure() {
			return fFigureEvchargerConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerVoltage_factorFigure() {
			return fFigureEvchargerVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerConfigurationFigure() {
			return fFigureEvchargerConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEvchargerOverrideFigure() {
			return fFigureEvchargerOverrideFigure;
		}

	}

}
