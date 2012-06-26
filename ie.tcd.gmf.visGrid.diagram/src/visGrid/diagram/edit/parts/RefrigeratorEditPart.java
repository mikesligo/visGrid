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
public class RefrigeratorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2029;

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
	public RefrigeratorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.RefrigeratorItemSemanticEditPolicy());
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
		return primaryShape = new RefrigeratorFigure();
	}

	/**
	 * @generated
	 */
	public RefrigeratorFigure getPrimaryShape() {
		return (RefrigeratorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorNameEditPart) {
			((visGrid.diagram.edit.parts.RefrigeratorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRefrigeratorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RefrigeratorNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.RefrigeratorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RefrigeratorConnection_4072) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRefrigerator_4030) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class RefrigeratorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorSizeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorRated_capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorSetpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorDeadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorNext_timeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorOutputFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorEvent_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorUAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorStateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRefrigeratorOverrideFigure;

		/**
		 * @generated
		 */
		public RefrigeratorFigure() {

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

			fFigureRefrigeratorNameFigure = new WrappingLabel();
			fFigureRefrigeratorNameFigure.setText("<...>");

			this.add(fFigureRefrigeratorNameFigure);

			fFigureRefrigeratorSizeFigure = new WrappingLabel();
			fFigureRefrigeratorSizeFigure.setText("<...>");

			this.add(fFigureRefrigeratorSizeFigure);

			fFigureRefrigeratorRated_capacityFigure = new WrappingLabel();
			fFigureRefrigeratorRated_capacityFigure.setText("<...>");

			this.add(fFigureRefrigeratorRated_capacityFigure);

			fFigureRefrigeratorTemperatureFigure = new WrappingLabel();
			fFigureRefrigeratorTemperatureFigure.setText("<...>");

			this.add(fFigureRefrigeratorTemperatureFigure);

			fFigureRefrigeratorSetpointFigure = new WrappingLabel();
			fFigureRefrigeratorSetpointFigure.setText("<...>");

			this.add(fFigureRefrigeratorSetpointFigure);

			fFigureRefrigeratorDeadbandFigure = new WrappingLabel();
			fFigureRefrigeratorDeadbandFigure.setText("<...>");

			this.add(fFigureRefrigeratorDeadbandFigure);

			fFigureRefrigeratorNext_timeFigure = new WrappingLabel();
			fFigureRefrigeratorNext_timeFigure.setText("<...>");

			this.add(fFigureRefrigeratorNext_timeFigure);

			fFigureRefrigeratorOutputFigure = new WrappingLabel();
			fFigureRefrigeratorOutputFigure.setText("<...>");

			this.add(fFigureRefrigeratorOutputFigure);

			fFigureRefrigeratorEvent_tempFigure = new WrappingLabel();
			fFigureRefrigeratorEvent_tempFigure.setText("<...>");

			this.add(fFigureRefrigeratorEvent_tempFigure);

			fFigureRefrigeratorUAFigure = new WrappingLabel();
			fFigureRefrigeratorUAFigure.setText("<...>");

			this.add(fFigureRefrigeratorUAFigure);

			fFigureRefrigeratorStateFigure = new WrappingLabel();
			fFigureRefrigeratorStateFigure.setText("<...>");

			this.add(fFigureRefrigeratorStateFigure);

			fFigureRefrigeratorShapeFigure = new WrappingLabel();
			fFigureRefrigeratorShapeFigure.setText("<...>");

			this.add(fFigureRefrigeratorShapeFigure);

			fFigureRefrigeratorLoadFigure = new WrappingLabel();
			fFigureRefrigeratorLoadFigure.setText("<...>");

			this.add(fFigureRefrigeratorLoadFigure);

			fFigureRefrigeratorEnergyFigure = new WrappingLabel();
			fFigureRefrigeratorEnergyFigure.setText("<...>");

			this.add(fFigureRefrigeratorEnergyFigure);

			fFigureRefrigeratorPowerFigure = new WrappingLabel();
			fFigureRefrigeratorPowerFigure.setText("<...>");

			this.add(fFigureRefrigeratorPowerFigure);

			fFigureRefrigeratorPeak_demandFigure = new WrappingLabel();
			fFigureRefrigeratorPeak_demandFigure.setText("<...>");

			this.add(fFigureRefrigeratorPeak_demandFigure);

			fFigureRefrigeratorHeatgainFigure = new WrappingLabel();
			fFigureRefrigeratorHeatgainFigure.setText("<...>");

			this.add(fFigureRefrigeratorHeatgainFigure);

			fFigureRefrigeratorHeatgain_fractionFigure = new WrappingLabel();
			fFigureRefrigeratorHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureRefrigeratorHeatgain_fractionFigure);

			fFigureRefrigeratorCurrent_fractionFigure = new WrappingLabel();
			fFigureRefrigeratorCurrent_fractionFigure.setText("<...>");

			this.add(fFigureRefrigeratorCurrent_fractionFigure);

			fFigureRefrigeratorImpedance_fractionFigure = new WrappingLabel();
			fFigureRefrigeratorImpedance_fractionFigure.setText("<...>");

			this.add(fFigureRefrigeratorImpedance_fractionFigure);

			fFigureRefrigeratorPower_fractionFigure = new WrappingLabel();
			fFigureRefrigeratorPower_fractionFigure.setText("<...>");

			this.add(fFigureRefrigeratorPower_fractionFigure);

			fFigureRefrigeratorPower_factorFigure = new WrappingLabel();
			fFigureRefrigeratorPower_factorFigure.setText("<...>");

			this.add(fFigureRefrigeratorPower_factorFigure);

			fFigureRefrigeratorConstant_powerFigure = new WrappingLabel();
			fFigureRefrigeratorConstant_powerFigure.setText("<...>");

			this.add(fFigureRefrigeratorConstant_powerFigure);

			fFigureRefrigeratorConstant_currentFigure = new WrappingLabel();
			fFigureRefrigeratorConstant_currentFigure.setText("<...>");

			this.add(fFigureRefrigeratorConstant_currentFigure);

			fFigureRefrigeratorConstant_admittanceFigure = new WrappingLabel();
			fFigureRefrigeratorConstant_admittanceFigure.setText("<...>");

			this.add(fFigureRefrigeratorConstant_admittanceFigure);

			fFigureRefrigeratorVoltage_factorFigure = new WrappingLabel();
			fFigureRefrigeratorVoltage_factorFigure.setText("<...>");

			this.add(fFigureRefrigeratorVoltage_factorFigure);

			fFigureRefrigeratorConfigurationFigure = new WrappingLabel();
			fFigureRefrigeratorConfigurationFigure.setText("<...>");

			this.add(fFigureRefrigeratorConfigurationFigure);

			fFigureRefrigeratorOverrideFigure = new WrappingLabel();
			fFigureRefrigeratorOverrideFigure.setText("<...>");

			this.add(fFigureRefrigeratorOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorNameFigure() {
			return fFigureRefrigeratorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorSizeFigure() {
			return fFigureRefrigeratorSizeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorRated_capacityFigure() {
			return fFigureRefrigeratorRated_capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorTemperatureFigure() {
			return fFigureRefrigeratorTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorSetpointFigure() {
			return fFigureRefrigeratorSetpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorDeadbandFigure() {
			return fFigureRefrigeratorDeadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorNext_timeFigure() {
			return fFigureRefrigeratorNext_timeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorOutputFigure() {
			return fFigureRefrigeratorOutputFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorEvent_tempFigure() {
			return fFigureRefrigeratorEvent_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorUAFigure() {
			return fFigureRefrigeratorUAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorStateFigure() {
			return fFigureRefrigeratorStateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorShapeFigure() {
			return fFigureRefrigeratorShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorLoadFigure() {
			return fFigureRefrigeratorLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorEnergyFigure() {
			return fFigureRefrigeratorEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorPowerFigure() {
			return fFigureRefrigeratorPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorPeak_demandFigure() {
			return fFigureRefrigeratorPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorHeatgainFigure() {
			return fFigureRefrigeratorHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorHeatgain_fractionFigure() {
			return fFigureRefrigeratorHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorCurrent_fractionFigure() {
			return fFigureRefrigeratorCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorImpedance_fractionFigure() {
			return fFigureRefrigeratorImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorPower_fractionFigure() {
			return fFigureRefrigeratorPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorPower_factorFigure() {
			return fFigureRefrigeratorPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorConstant_powerFigure() {
			return fFigureRefrigeratorConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorConstant_currentFigure() {
			return fFigureRefrigeratorConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorConstant_admittanceFigure() {
			return fFigureRefrigeratorConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorVoltage_factorFigure() {
			return fFigureRefrigeratorVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorConfigurationFigure() {
			return fFigureRefrigeratorConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRefrigeratorOverrideFigure() {
			return fFigureRefrigeratorOverrideFigure;
		}

	}

}
