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
public class DishwasherEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2072;

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
	public DishwasherEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.DishwasherItemSemanticEditPolicy());
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
		return primaryShape = new DishwasherFigure();
	}

	/**
	 * @generated
	 */
	public DishwasherFigure getPrimaryShape() {
		return (DishwasherFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.DishwasherNameEditPart) {
			((visGrid.diagram.edit.parts.DishwasherNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDishwasherNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.DishwasherNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.DishwasherNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.DishwasherConnection_4106) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDishwasher_4146) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class DishwasherFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherInstalled_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDishwasherOverrideFigure;

		/**
		 * @generated
		 */
		public DishwasherFigure() {

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

			fFigureDishwasherNameFigure = new WrappingLabel();
			fFigureDishwasherNameFigure.setText("<...>");

			this.add(fFigureDishwasherNameFigure);

			fFigureDishwasherInstalled_powerFigure = new WrappingLabel();
			fFigureDishwasherInstalled_powerFigure.setText("<...>");

			this.add(fFigureDishwasherInstalled_powerFigure);

			fFigureDishwasherDemandFigure = new WrappingLabel();
			fFigureDishwasherDemandFigure.setText("<...>");

			this.add(fFigureDishwasherDemandFigure);

			fFigureDishwasherShapeFigure = new WrappingLabel();
			fFigureDishwasherShapeFigure.setText("<...>");

			this.add(fFigureDishwasherShapeFigure);

			fFigureDishwasherLoadFigure = new WrappingLabel();
			fFigureDishwasherLoadFigure.setText("<...>");

			this.add(fFigureDishwasherLoadFigure);

			fFigureDishwasherEnergyFigure = new WrappingLabel();
			fFigureDishwasherEnergyFigure.setText("<...>");

			this.add(fFigureDishwasherEnergyFigure);

			fFigureDishwasherPowerFigure = new WrappingLabel();
			fFigureDishwasherPowerFigure.setText("<...>");

			this.add(fFigureDishwasherPowerFigure);

			fFigureDishwasherPeak_demandFigure = new WrappingLabel();
			fFigureDishwasherPeak_demandFigure.setText("<...>");

			this.add(fFigureDishwasherPeak_demandFigure);

			fFigureDishwasherHeatgainFigure = new WrappingLabel();
			fFigureDishwasherHeatgainFigure.setText("<...>");

			this.add(fFigureDishwasherHeatgainFigure);

			fFigureDishwasherHeatgain_fractionFigure = new WrappingLabel();
			fFigureDishwasherHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureDishwasherHeatgain_fractionFigure);

			fFigureDishwasherCurrent_fractionFigure = new WrappingLabel();
			fFigureDishwasherCurrent_fractionFigure.setText("<...>");

			this.add(fFigureDishwasherCurrent_fractionFigure);

			fFigureDishwasherImpedance_fractionFigure = new WrappingLabel();
			fFigureDishwasherImpedance_fractionFigure.setText("<...>");

			this.add(fFigureDishwasherImpedance_fractionFigure);

			fFigureDishwasherPower_fractionFigure = new WrappingLabel();
			fFigureDishwasherPower_fractionFigure.setText("<...>");

			this.add(fFigureDishwasherPower_fractionFigure);

			fFigureDishwasherPower_factorFigure = new WrappingLabel();
			fFigureDishwasherPower_factorFigure.setText("<...>");

			this.add(fFigureDishwasherPower_factorFigure);

			fFigureDishwasherConstant_powerFigure = new WrappingLabel();
			fFigureDishwasherConstant_powerFigure.setText("<...>");

			this.add(fFigureDishwasherConstant_powerFigure);

			fFigureDishwasherConstant_currentFigure = new WrappingLabel();
			fFigureDishwasherConstant_currentFigure.setText("<...>");

			this.add(fFigureDishwasherConstant_currentFigure);

			fFigureDishwasherConstant_admittanceFigure = new WrappingLabel();
			fFigureDishwasherConstant_admittanceFigure.setText("<...>");

			this.add(fFigureDishwasherConstant_admittanceFigure);

			fFigureDishwasherVoltage_factorFigure = new WrappingLabel();
			fFigureDishwasherVoltage_factorFigure.setText("<...>");

			this.add(fFigureDishwasherVoltage_factorFigure);

			fFigureDishwasherConfigurationFigure = new WrappingLabel();
			fFigureDishwasherConfigurationFigure.setText("<...>");

			this.add(fFigureDishwasherConfigurationFigure);

			fFigureDishwasherOverrideFigure = new WrappingLabel();
			fFigureDishwasherOverrideFigure.setText("<...>");

			this.add(fFigureDishwasherOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherNameFigure() {
			return fFigureDishwasherNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherInstalled_powerFigure() {
			return fFigureDishwasherInstalled_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherDemandFigure() {
			return fFigureDishwasherDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherShapeFigure() {
			return fFigureDishwasherShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherLoadFigure() {
			return fFigureDishwasherLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherEnergyFigure() {
			return fFigureDishwasherEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherPowerFigure() {
			return fFigureDishwasherPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherPeak_demandFigure() {
			return fFigureDishwasherPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherHeatgainFigure() {
			return fFigureDishwasherHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherHeatgain_fractionFigure() {
			return fFigureDishwasherHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherCurrent_fractionFigure() {
			return fFigureDishwasherCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherImpedance_fractionFigure() {
			return fFigureDishwasherImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherPower_fractionFigure() {
			return fFigureDishwasherPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherPower_factorFigure() {
			return fFigureDishwasherPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherConstant_powerFigure() {
			return fFigureDishwasherConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherConstant_currentFigure() {
			return fFigureDishwasherConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherConstant_admittanceFigure() {
			return fFigureDishwasherConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherVoltage_factorFigure() {
			return fFigureDishwasherVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherConfigurationFigure() {
			return fFigureDishwasherConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDishwasherOverrideFigure() {
			return fFigureDishwasherOverrideFigure;
		}

	}

}
