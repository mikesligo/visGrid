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
public class ZIPloadEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2062;

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
	public ZIPloadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.ZIPloadItemSemanticEditPolicy());
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
		return primaryShape = new ZIPloadFigure();
	}

	/**
	 * @generated
	 */
	public ZIPloadFigure getPrimaryShape() {
		return (ZIPloadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ZIPloadNameEditPart) {
			((visGrid.diagram.edit.parts.ZIPloadNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureZIPloadNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ZIPloadNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.ZIPloadNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ZIPloadConnection_4009) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsZIPload_4107) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ZIPloadFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadHeat_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadBase_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadPower_pfFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadCurrent_pfFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadImpedance_pfFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadIs_240Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadBreaker_valFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureZIPloadOverrideFigure;

		/**
		 * @generated
		 */
		public ZIPloadFigure() {

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

			fFigureZIPloadNameFigure = new WrappingLabel();
			fFigureZIPloadNameFigure.setText("<...>");

			this.add(fFigureZIPloadNameFigure);

			fFigureZIPloadHeat_fractionFigure = new WrappingLabel();
			fFigureZIPloadHeat_fractionFigure.setText("<...>");

			this.add(fFigureZIPloadHeat_fractionFigure);

			fFigureZIPloadBase_powerFigure = new WrappingLabel();
			fFigureZIPloadBase_powerFigure.setText("<...>");

			this.add(fFigureZIPloadBase_powerFigure);

			fFigureZIPloadPower_pfFigure = new WrappingLabel();
			fFigureZIPloadPower_pfFigure.setText("<...>");

			this.add(fFigureZIPloadPower_pfFigure);

			fFigureZIPloadCurrent_pfFigure = new WrappingLabel();
			fFigureZIPloadCurrent_pfFigure.setText("<...>");

			this.add(fFigureZIPloadCurrent_pfFigure);

			fFigureZIPloadImpedance_pfFigure = new WrappingLabel();
			fFigureZIPloadImpedance_pfFigure.setText("<...>");

			this.add(fFigureZIPloadImpedance_pfFigure);

			fFigureZIPloadIs_240Figure = new WrappingLabel();
			fFigureZIPloadIs_240Figure.setText("<...>");

			this.add(fFigureZIPloadIs_240Figure);

			fFigureZIPloadBreaker_valFigure = new WrappingLabel();
			fFigureZIPloadBreaker_valFigure.setText("<...>");

			this.add(fFigureZIPloadBreaker_valFigure);

			fFigureZIPloadShapeFigure = new WrappingLabel();
			fFigureZIPloadShapeFigure.setText("<...>");

			this.add(fFigureZIPloadShapeFigure);

			fFigureZIPloadLoadFigure = new WrappingLabel();
			fFigureZIPloadLoadFigure.setText("<...>");

			this.add(fFigureZIPloadLoadFigure);

			fFigureZIPloadEnergyFigure = new WrappingLabel();
			fFigureZIPloadEnergyFigure.setText("<...>");

			this.add(fFigureZIPloadEnergyFigure);

			fFigureZIPloadPowerFigure = new WrappingLabel();
			fFigureZIPloadPowerFigure.setText("<...>");

			this.add(fFigureZIPloadPowerFigure);

			fFigureZIPloadPeak_demandFigure = new WrappingLabel();
			fFigureZIPloadPeak_demandFigure.setText("<...>");

			this.add(fFigureZIPloadPeak_demandFigure);

			fFigureZIPloadHeatgainFigure = new WrappingLabel();
			fFigureZIPloadHeatgainFigure.setText("<...>");

			this.add(fFigureZIPloadHeatgainFigure);

			fFigureZIPloadHeatgain_fractionFigure = new WrappingLabel();
			fFigureZIPloadHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureZIPloadHeatgain_fractionFigure);

			fFigureZIPloadCurrent_fractionFigure = new WrappingLabel();
			fFigureZIPloadCurrent_fractionFigure.setText("<...>");

			this.add(fFigureZIPloadCurrent_fractionFigure);

			fFigureZIPloadImpedance_fractionFigure = new WrappingLabel();
			fFigureZIPloadImpedance_fractionFigure.setText("<...>");

			this.add(fFigureZIPloadImpedance_fractionFigure);

			fFigureZIPloadPower_fractionFigure = new WrappingLabel();
			fFigureZIPloadPower_fractionFigure.setText("<...>");

			this.add(fFigureZIPloadPower_fractionFigure);

			fFigureZIPloadPower_factorFigure = new WrappingLabel();
			fFigureZIPloadPower_factorFigure.setText("<...>");

			this.add(fFigureZIPloadPower_factorFigure);

			fFigureZIPloadConstant_powerFigure = new WrappingLabel();
			fFigureZIPloadConstant_powerFigure.setText("<...>");

			this.add(fFigureZIPloadConstant_powerFigure);

			fFigureZIPloadConstant_currentFigure = new WrappingLabel();
			fFigureZIPloadConstant_currentFigure.setText("<...>");

			this.add(fFigureZIPloadConstant_currentFigure);

			fFigureZIPloadConstant_admittanceFigure = new WrappingLabel();
			fFigureZIPloadConstant_admittanceFigure.setText("<...>");

			this.add(fFigureZIPloadConstant_admittanceFigure);

			fFigureZIPloadVoltage_factorFigure = new WrappingLabel();
			fFigureZIPloadVoltage_factorFigure.setText("<...>");

			this.add(fFigureZIPloadVoltage_factorFigure);

			fFigureZIPloadConfigurationFigure = new WrappingLabel();
			fFigureZIPloadConfigurationFigure.setText("<...>");

			this.add(fFigureZIPloadConfigurationFigure);

			fFigureZIPloadOverrideFigure = new WrappingLabel();
			fFigureZIPloadOverrideFigure.setText("<...>");

			this.add(fFigureZIPloadOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadNameFigure() {
			return fFigureZIPloadNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadHeat_fractionFigure() {
			return fFigureZIPloadHeat_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadBase_powerFigure() {
			return fFigureZIPloadBase_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadPower_pfFigure() {
			return fFigureZIPloadPower_pfFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadCurrent_pfFigure() {
			return fFigureZIPloadCurrent_pfFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadImpedance_pfFigure() {
			return fFigureZIPloadImpedance_pfFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadIs_240Figure() {
			return fFigureZIPloadIs_240Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadBreaker_valFigure() {
			return fFigureZIPloadBreaker_valFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadShapeFigure() {
			return fFigureZIPloadShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadLoadFigure() {
			return fFigureZIPloadLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadEnergyFigure() {
			return fFigureZIPloadEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadPowerFigure() {
			return fFigureZIPloadPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadPeak_demandFigure() {
			return fFigureZIPloadPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadHeatgainFigure() {
			return fFigureZIPloadHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadHeatgain_fractionFigure() {
			return fFigureZIPloadHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadCurrent_fractionFigure() {
			return fFigureZIPloadCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadImpedance_fractionFigure() {
			return fFigureZIPloadImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadPower_fractionFigure() {
			return fFigureZIPloadPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadPower_factorFigure() {
			return fFigureZIPloadPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadConstant_powerFigure() {
			return fFigureZIPloadConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadConstant_currentFigure() {
			return fFigureZIPloadConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadConstant_admittanceFigure() {
			return fFigureZIPloadConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadVoltage_factorFigure() {
			return fFigureZIPloadVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadConfigurationFigure() {
			return fFigureZIPloadConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureZIPloadOverrideFigure() {
			return fFigureZIPloadOverrideFigure;
		}

	}

}