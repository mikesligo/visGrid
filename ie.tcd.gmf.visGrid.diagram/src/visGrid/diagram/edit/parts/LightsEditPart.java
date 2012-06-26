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
public class LightsEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2039;

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
	public LightsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.LightsItemSemanticEditPolicy());
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
		return primaryShape = new LightsFigure();
	}

	/**
	 * @generated
	 */
	public LightsFigure getPrimaryShape() {
		return (LightsFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LightsNameEditPart) {
			((visGrid.diagram.edit.parts.LightsNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureLightsNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.LightsNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.LightsNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.LightsConnection_4029) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLights_4055) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class LightsFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsPlacementFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsInstalled_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsPower_densityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsCurtailmentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLightsOverrideFigure;

		/**
		 * @generated
		 */
		public LightsFigure() {

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

			fFigureLightsNameFigure = new WrappingLabel();
			fFigureLightsNameFigure.setText("<...>");

			this.add(fFigureLightsNameFigure);

			fFigureLightsTypeFigure = new WrappingLabel();
			fFigureLightsTypeFigure.setText("<...>");

			this.add(fFigureLightsTypeFigure);

			fFigureLightsPlacementFigure = new WrappingLabel();
			fFigureLightsPlacementFigure.setText("<...>");

			this.add(fFigureLightsPlacementFigure);

			fFigureLightsInstalled_powerFigure = new WrappingLabel();
			fFigureLightsInstalled_powerFigure.setText("<...>");

			this.add(fFigureLightsInstalled_powerFigure);

			fFigureLightsPower_densityFigure = new WrappingLabel();
			fFigureLightsPower_densityFigure.setText("<...>");

			this.add(fFigureLightsPower_densityFigure);

			fFigureLightsCurtailmentFigure = new WrappingLabel();
			fFigureLightsCurtailmentFigure.setText("<...>");

			this.add(fFigureLightsCurtailmentFigure);

			fFigureLightsDemandFigure = new WrappingLabel();
			fFigureLightsDemandFigure.setText("<...>");

			this.add(fFigureLightsDemandFigure);

			fFigureLightsShapeFigure = new WrappingLabel();
			fFigureLightsShapeFigure.setText("<...>");

			this.add(fFigureLightsShapeFigure);

			fFigureLightsLoadFigure = new WrappingLabel();
			fFigureLightsLoadFigure.setText("<...>");

			this.add(fFigureLightsLoadFigure);

			fFigureLightsEnergyFigure = new WrappingLabel();
			fFigureLightsEnergyFigure.setText("<...>");

			this.add(fFigureLightsEnergyFigure);

			fFigureLightsPowerFigure = new WrappingLabel();
			fFigureLightsPowerFigure.setText("<...>");

			this.add(fFigureLightsPowerFigure);

			fFigureLightsPeak_demandFigure = new WrappingLabel();
			fFigureLightsPeak_demandFigure.setText("<...>");

			this.add(fFigureLightsPeak_demandFigure);

			fFigureLightsHeatgainFigure = new WrappingLabel();
			fFigureLightsHeatgainFigure.setText("<...>");

			this.add(fFigureLightsHeatgainFigure);

			fFigureLightsHeatgain_fractionFigure = new WrappingLabel();
			fFigureLightsHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureLightsHeatgain_fractionFigure);

			fFigureLightsCurrent_fractionFigure = new WrappingLabel();
			fFigureLightsCurrent_fractionFigure.setText("<...>");

			this.add(fFigureLightsCurrent_fractionFigure);

			fFigureLightsImpedance_fractionFigure = new WrappingLabel();
			fFigureLightsImpedance_fractionFigure.setText("<...>");

			this.add(fFigureLightsImpedance_fractionFigure);

			fFigureLightsPower_fractionFigure = new WrappingLabel();
			fFigureLightsPower_fractionFigure.setText("<...>");

			this.add(fFigureLightsPower_fractionFigure);

			fFigureLightsPower_factorFigure = new WrappingLabel();
			fFigureLightsPower_factorFigure.setText("<...>");

			this.add(fFigureLightsPower_factorFigure);

			fFigureLightsConstant_powerFigure = new WrappingLabel();
			fFigureLightsConstant_powerFigure.setText("<...>");

			this.add(fFigureLightsConstant_powerFigure);

			fFigureLightsConstant_currentFigure = new WrappingLabel();
			fFigureLightsConstant_currentFigure.setText("<...>");

			this.add(fFigureLightsConstant_currentFigure);

			fFigureLightsConstant_admittanceFigure = new WrappingLabel();
			fFigureLightsConstant_admittanceFigure.setText("<...>");

			this.add(fFigureLightsConstant_admittanceFigure);

			fFigureLightsVoltage_factorFigure = new WrappingLabel();
			fFigureLightsVoltage_factorFigure.setText("<...>");

			this.add(fFigureLightsVoltage_factorFigure);

			fFigureLightsConfigurationFigure = new WrappingLabel();
			fFigureLightsConfigurationFigure.setText("<...>");

			this.add(fFigureLightsConfigurationFigure);

			fFigureLightsOverrideFigure = new WrappingLabel();
			fFigureLightsOverrideFigure.setText("<...>");

			this.add(fFigureLightsOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsNameFigure() {
			return fFigureLightsNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsTypeFigure() {
			return fFigureLightsTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsPlacementFigure() {
			return fFigureLightsPlacementFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsInstalled_powerFigure() {
			return fFigureLightsInstalled_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsPower_densityFigure() {
			return fFigureLightsPower_densityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsCurtailmentFigure() {
			return fFigureLightsCurtailmentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsDemandFigure() {
			return fFigureLightsDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsShapeFigure() {
			return fFigureLightsShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsLoadFigure() {
			return fFigureLightsLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsEnergyFigure() {
			return fFigureLightsEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsPowerFigure() {
			return fFigureLightsPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsPeak_demandFigure() {
			return fFigureLightsPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsHeatgainFigure() {
			return fFigureLightsHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsHeatgain_fractionFigure() {
			return fFigureLightsHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsCurrent_fractionFigure() {
			return fFigureLightsCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsImpedance_fractionFigure() {
			return fFigureLightsImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsPower_fractionFigure() {
			return fFigureLightsPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsPower_factorFigure() {
			return fFigureLightsPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsConstant_powerFigure() {
			return fFigureLightsConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsConstant_currentFigure() {
			return fFigureLightsConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsConstant_admittanceFigure() {
			return fFigureLightsConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsVoltage_factorFigure() {
			return fFigureLightsVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsConfigurationFigure() {
			return fFigureLightsConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLightsOverrideFigure() {
			return fFigureLightsOverrideFigure;
		}

	}

}
