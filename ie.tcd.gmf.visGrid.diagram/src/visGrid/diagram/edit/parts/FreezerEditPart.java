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
public class FreezerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2058;

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
	public FreezerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.FreezerItemSemanticEditPolicy());
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
		return primaryShape = new FreezerFigure();
	}

	/**
	 * @generated
	 */
	public FreezerFigure getPrimaryShape() {
		return (FreezerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.FreezerNameEditPart) {
			((visGrid.diagram.edit.parts.FreezerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFreezerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.FreezerNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.FreezerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.FreezerConnection_4089) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsFreezer_4079) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class FreezerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerSizeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerRated_capacityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerSetpointFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerDeadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerNext_timeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerOutputFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerEvent_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerUAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerStateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFreezerOverrideFigure;

		/**
		 * @generated
		 */
		public FreezerFigure() {

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

			fFigureFreezerNameFigure = new WrappingLabel();
			fFigureFreezerNameFigure.setText("<...>");

			this.add(fFigureFreezerNameFigure);

			fFigureFreezerSizeFigure = new WrappingLabel();
			fFigureFreezerSizeFigure.setText("<...>");

			this.add(fFigureFreezerSizeFigure);

			fFigureFreezerRated_capacityFigure = new WrappingLabel();
			fFigureFreezerRated_capacityFigure.setText("<...>");

			this.add(fFigureFreezerRated_capacityFigure);

			fFigureFreezerTemperatureFigure = new WrappingLabel();
			fFigureFreezerTemperatureFigure.setText("<...>");

			this.add(fFigureFreezerTemperatureFigure);

			fFigureFreezerSetpointFigure = new WrappingLabel();
			fFigureFreezerSetpointFigure.setText("<...>");

			this.add(fFigureFreezerSetpointFigure);

			fFigureFreezerDeadbandFigure = new WrappingLabel();
			fFigureFreezerDeadbandFigure.setText("<...>");

			this.add(fFigureFreezerDeadbandFigure);

			fFigureFreezerNext_timeFigure = new WrappingLabel();
			fFigureFreezerNext_timeFigure.setText("<...>");

			this.add(fFigureFreezerNext_timeFigure);

			fFigureFreezerOutputFigure = new WrappingLabel();
			fFigureFreezerOutputFigure.setText("<...>");

			this.add(fFigureFreezerOutputFigure);

			fFigureFreezerEvent_tempFigure = new WrappingLabel();
			fFigureFreezerEvent_tempFigure.setText("<...>");

			this.add(fFigureFreezerEvent_tempFigure);

			fFigureFreezerUAFigure = new WrappingLabel();
			fFigureFreezerUAFigure.setText("<...>");

			this.add(fFigureFreezerUAFigure);

			fFigureFreezerStateFigure = new WrappingLabel();
			fFigureFreezerStateFigure.setText("<...>");

			this.add(fFigureFreezerStateFigure);

			fFigureFreezerShapeFigure = new WrappingLabel();
			fFigureFreezerShapeFigure.setText("<...>");

			this.add(fFigureFreezerShapeFigure);

			fFigureFreezerLoadFigure = new WrappingLabel();
			fFigureFreezerLoadFigure.setText("<...>");

			this.add(fFigureFreezerLoadFigure);

			fFigureFreezerEnergyFigure = new WrappingLabel();
			fFigureFreezerEnergyFigure.setText("<...>");

			this.add(fFigureFreezerEnergyFigure);

			fFigureFreezerPowerFigure = new WrappingLabel();
			fFigureFreezerPowerFigure.setText("<...>");

			this.add(fFigureFreezerPowerFigure);

			fFigureFreezerPeak_demandFigure = new WrappingLabel();
			fFigureFreezerPeak_demandFigure.setText("<...>");

			this.add(fFigureFreezerPeak_demandFigure);

			fFigureFreezerHeatgainFigure = new WrappingLabel();
			fFigureFreezerHeatgainFigure.setText("<...>");

			this.add(fFigureFreezerHeatgainFigure);

			fFigureFreezerHeatgain_fractionFigure = new WrappingLabel();
			fFigureFreezerHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureFreezerHeatgain_fractionFigure);

			fFigureFreezerCurrent_fractionFigure = new WrappingLabel();
			fFigureFreezerCurrent_fractionFigure.setText("<...>");

			this.add(fFigureFreezerCurrent_fractionFigure);

			fFigureFreezerImpedance_fractionFigure = new WrappingLabel();
			fFigureFreezerImpedance_fractionFigure.setText("<...>");

			this.add(fFigureFreezerImpedance_fractionFigure);

			fFigureFreezerPower_fractionFigure = new WrappingLabel();
			fFigureFreezerPower_fractionFigure.setText("<...>");

			this.add(fFigureFreezerPower_fractionFigure);

			fFigureFreezerPower_factorFigure = new WrappingLabel();
			fFigureFreezerPower_factorFigure.setText("<...>");

			this.add(fFigureFreezerPower_factorFigure);

			fFigureFreezerConstant_powerFigure = new WrappingLabel();
			fFigureFreezerConstant_powerFigure.setText("<...>");

			this.add(fFigureFreezerConstant_powerFigure);

			fFigureFreezerConstant_currentFigure = new WrappingLabel();
			fFigureFreezerConstant_currentFigure.setText("<...>");

			this.add(fFigureFreezerConstant_currentFigure);

			fFigureFreezerConstant_admittanceFigure = new WrappingLabel();
			fFigureFreezerConstant_admittanceFigure.setText("<...>");

			this.add(fFigureFreezerConstant_admittanceFigure);

			fFigureFreezerVoltage_factorFigure = new WrappingLabel();
			fFigureFreezerVoltage_factorFigure.setText("<...>");

			this.add(fFigureFreezerVoltage_factorFigure);

			fFigureFreezerConfigurationFigure = new WrappingLabel();
			fFigureFreezerConfigurationFigure.setText("<...>");

			this.add(fFigureFreezerConfigurationFigure);

			fFigureFreezerOverrideFigure = new WrappingLabel();
			fFigureFreezerOverrideFigure.setText("<...>");

			this.add(fFigureFreezerOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerNameFigure() {
			return fFigureFreezerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerSizeFigure() {
			return fFigureFreezerSizeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerRated_capacityFigure() {
			return fFigureFreezerRated_capacityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerTemperatureFigure() {
			return fFigureFreezerTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerSetpointFigure() {
			return fFigureFreezerSetpointFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerDeadbandFigure() {
			return fFigureFreezerDeadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerNext_timeFigure() {
			return fFigureFreezerNext_timeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerOutputFigure() {
			return fFigureFreezerOutputFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerEvent_tempFigure() {
			return fFigureFreezerEvent_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerUAFigure() {
			return fFigureFreezerUAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerStateFigure() {
			return fFigureFreezerStateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerShapeFigure() {
			return fFigureFreezerShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerLoadFigure() {
			return fFigureFreezerLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerEnergyFigure() {
			return fFigureFreezerEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerPowerFigure() {
			return fFigureFreezerPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerPeak_demandFigure() {
			return fFigureFreezerPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerHeatgainFigure() {
			return fFigureFreezerHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerHeatgain_fractionFigure() {
			return fFigureFreezerHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerCurrent_fractionFigure() {
			return fFigureFreezerCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerImpedance_fractionFigure() {
			return fFigureFreezerImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerPower_fractionFigure() {
			return fFigureFreezerPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerPower_factorFigure() {
			return fFigureFreezerPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerConstant_powerFigure() {
			return fFigureFreezerConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerConstant_currentFigure() {
			return fFigureFreezerConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerConstant_admittanceFigure() {
			return fFigureFreezerConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerVoltage_factorFigure() {
			return fFigureFreezerVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerConfigurationFigure() {
			return fFigureFreezerConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFreezerOverrideFigure() {
			return fFigureFreezerOverrideFigure;
		}

	}

}
