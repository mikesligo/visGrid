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
public class PlugloadEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2031;

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
	public PlugloadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.PlugloadItemSemanticEditPolicy());
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
		return primaryShape = new PlugloadFigure();
	}

	/**
	 * @generated
	 */
	public PlugloadFigure getPrimaryShape() {
		return (PlugloadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.PlugloadNameEditPart) {
			((visGrid.diagram.edit.parts.PlugloadNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigurePlugloadNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.PlugloadNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.PlugloadNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.PlugloadConnection_4032) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPlugload_4104) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class PlugloadFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadCircuit_splitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadInstalled_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePlugloadOverrideFigure;

		/**
		 * @generated
		 */
		public PlugloadFigure() {

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

			fFigurePlugloadNameFigure = new WrappingLabel();
			fFigurePlugloadNameFigure.setText("<...>");

			this.add(fFigurePlugloadNameFigure);

			fFigurePlugloadCircuit_splitFigure = new WrappingLabel();
			fFigurePlugloadCircuit_splitFigure.setText("<...>");

			this.add(fFigurePlugloadCircuit_splitFigure);

			fFigurePlugloadDemandFigure = new WrappingLabel();
			fFigurePlugloadDemandFigure.setText("<...>");

			this.add(fFigurePlugloadDemandFigure);

			fFigurePlugloadInstalled_powerFigure = new WrappingLabel();
			fFigurePlugloadInstalled_powerFigure.setText("<...>");

			this.add(fFigurePlugloadInstalled_powerFigure);

			fFigurePlugloadShapeFigure = new WrappingLabel();
			fFigurePlugloadShapeFigure.setText("<...>");

			this.add(fFigurePlugloadShapeFigure);

			fFigurePlugloadLoadFigure = new WrappingLabel();
			fFigurePlugloadLoadFigure.setText("<...>");

			this.add(fFigurePlugloadLoadFigure);

			fFigurePlugloadEnergyFigure = new WrappingLabel();
			fFigurePlugloadEnergyFigure.setText("<...>");

			this.add(fFigurePlugloadEnergyFigure);

			fFigurePlugloadPowerFigure = new WrappingLabel();
			fFigurePlugloadPowerFigure.setText("<...>");

			this.add(fFigurePlugloadPowerFigure);

			fFigurePlugloadPeak_demandFigure = new WrappingLabel();
			fFigurePlugloadPeak_demandFigure.setText("<...>");

			this.add(fFigurePlugloadPeak_demandFigure);

			fFigurePlugloadHeatgainFigure = new WrappingLabel();
			fFigurePlugloadHeatgainFigure.setText("<...>");

			this.add(fFigurePlugloadHeatgainFigure);

			fFigurePlugloadHeatgain_fractionFigure = new WrappingLabel();
			fFigurePlugloadHeatgain_fractionFigure.setText("<...>");

			this.add(fFigurePlugloadHeatgain_fractionFigure);

			fFigurePlugloadCurrent_fractionFigure = new WrappingLabel();
			fFigurePlugloadCurrent_fractionFigure.setText("<...>");

			this.add(fFigurePlugloadCurrent_fractionFigure);

			fFigurePlugloadImpedance_fractionFigure = new WrappingLabel();
			fFigurePlugloadImpedance_fractionFigure.setText("<...>");

			this.add(fFigurePlugloadImpedance_fractionFigure);

			fFigurePlugloadPower_fractionFigure = new WrappingLabel();
			fFigurePlugloadPower_fractionFigure.setText("<...>");

			this.add(fFigurePlugloadPower_fractionFigure);

			fFigurePlugloadPower_factorFigure = new WrappingLabel();
			fFigurePlugloadPower_factorFigure.setText("<...>");

			this.add(fFigurePlugloadPower_factorFigure);

			fFigurePlugloadConstant_powerFigure = new WrappingLabel();
			fFigurePlugloadConstant_powerFigure.setText("<...>");

			this.add(fFigurePlugloadConstant_powerFigure);

			fFigurePlugloadConstant_currentFigure = new WrappingLabel();
			fFigurePlugloadConstant_currentFigure.setText("<...>");

			this.add(fFigurePlugloadConstant_currentFigure);

			fFigurePlugloadConstant_admittanceFigure = new WrappingLabel();
			fFigurePlugloadConstant_admittanceFigure.setText("<...>");

			this.add(fFigurePlugloadConstant_admittanceFigure);

			fFigurePlugloadVoltage_factorFigure = new WrappingLabel();
			fFigurePlugloadVoltage_factorFigure.setText("<...>");

			this.add(fFigurePlugloadVoltage_factorFigure);

			fFigurePlugloadConfigurationFigure = new WrappingLabel();
			fFigurePlugloadConfigurationFigure.setText("<...>");

			this.add(fFigurePlugloadConfigurationFigure);

			fFigurePlugloadOverrideFigure = new WrappingLabel();
			fFigurePlugloadOverrideFigure.setText("<...>");

			this.add(fFigurePlugloadOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadNameFigure() {
			return fFigurePlugloadNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadCircuit_splitFigure() {
			return fFigurePlugloadCircuit_splitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadDemandFigure() {
			return fFigurePlugloadDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadInstalled_powerFigure() {
			return fFigurePlugloadInstalled_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadShapeFigure() {
			return fFigurePlugloadShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadLoadFigure() {
			return fFigurePlugloadLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadEnergyFigure() {
			return fFigurePlugloadEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadPowerFigure() {
			return fFigurePlugloadPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadPeak_demandFigure() {
			return fFigurePlugloadPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadHeatgainFigure() {
			return fFigurePlugloadHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadHeatgain_fractionFigure() {
			return fFigurePlugloadHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadCurrent_fractionFigure() {
			return fFigurePlugloadCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadImpedance_fractionFigure() {
			return fFigurePlugloadImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadPower_fractionFigure() {
			return fFigurePlugloadPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadPower_factorFigure() {
			return fFigurePlugloadPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadConstant_powerFigure() {
			return fFigurePlugloadConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadConstant_currentFigure() {
			return fFigurePlugloadConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadConstant_admittanceFigure() {
			return fFigurePlugloadConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadVoltage_factorFigure() {
			return fFigurePlugloadVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadConfigurationFigure() {
			return fFigurePlugloadConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePlugloadOverrideFigure() {
			return fFigurePlugloadOverrideFigure;
		}

	}

}
