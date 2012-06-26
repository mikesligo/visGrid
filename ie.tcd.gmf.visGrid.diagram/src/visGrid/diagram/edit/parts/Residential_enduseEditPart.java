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
public class Residential_enduseEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2013;

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
	public Residential_enduseEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Residential_enduseItemSemanticEditPolicy());
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
		return primaryShape = new Residential_enduseFigure();
	}

	/**
	 * @generated
	 */
	public Residential_enduseFigure getPrimaryShape() {
		return (Residential_enduseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseNameEditPart) {
			((visGrid.diagram.edit.parts.Residential_enduseNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureResidential_enduseNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Residential_enduseNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Residential_enduseNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Residential_enduseConnection_4144) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsResidential_enduse_4037) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Residential_enduseFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_endusePowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_endusePeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_endusePower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_endusePower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResidential_enduseOverrideFigure;

		/**
		 * @generated
		 */
		public Residential_enduseFigure() {

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

			fFigureResidential_enduseNameFigure = new WrappingLabel();
			fFigureResidential_enduseNameFigure.setText("<...>");

			this.add(fFigureResidential_enduseNameFigure);

			fFigureResidential_enduseShapeFigure = new WrappingLabel();
			fFigureResidential_enduseShapeFigure.setText("<...>");

			this.add(fFigureResidential_enduseShapeFigure);

			fFigureResidential_enduseLoadFigure = new WrappingLabel();
			fFigureResidential_enduseLoadFigure.setText("<...>");

			this.add(fFigureResidential_enduseLoadFigure);

			fFigureResidential_enduseEnergyFigure = new WrappingLabel();
			fFigureResidential_enduseEnergyFigure.setText("<...>");

			this.add(fFigureResidential_enduseEnergyFigure);

			fFigureResidential_endusePowerFigure = new WrappingLabel();
			fFigureResidential_endusePowerFigure.setText("<...>");

			this.add(fFigureResidential_endusePowerFigure);

			fFigureResidential_endusePeak_demandFigure = new WrappingLabel();
			fFigureResidential_endusePeak_demandFigure.setText("<...>");

			this.add(fFigureResidential_endusePeak_demandFigure);

			fFigureResidential_enduseHeatgainFigure = new WrappingLabel();
			fFigureResidential_enduseHeatgainFigure.setText("<...>");

			this.add(fFigureResidential_enduseHeatgainFigure);

			fFigureResidential_enduseHeatgain_fractionFigure = new WrappingLabel();
			fFigureResidential_enduseHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureResidential_enduseHeatgain_fractionFigure);

			fFigureResidential_enduseCurrent_fractionFigure = new WrappingLabel();
			fFigureResidential_enduseCurrent_fractionFigure.setText("<...>");

			this.add(fFigureResidential_enduseCurrent_fractionFigure);

			fFigureResidential_enduseImpedance_fractionFigure = new WrappingLabel();
			fFigureResidential_enduseImpedance_fractionFigure.setText("<...>");

			this.add(fFigureResidential_enduseImpedance_fractionFigure);

			fFigureResidential_endusePower_fractionFigure = new WrappingLabel();
			fFigureResidential_endusePower_fractionFigure.setText("<...>");

			this.add(fFigureResidential_endusePower_fractionFigure);

			fFigureResidential_endusePower_factorFigure = new WrappingLabel();
			fFigureResidential_endusePower_factorFigure.setText("<...>");

			this.add(fFigureResidential_endusePower_factorFigure);

			fFigureResidential_enduseConstant_powerFigure = new WrappingLabel();
			fFigureResidential_enduseConstant_powerFigure.setText("<...>");

			this.add(fFigureResidential_enduseConstant_powerFigure);

			fFigureResidential_enduseConstant_currentFigure = new WrappingLabel();
			fFigureResidential_enduseConstant_currentFigure.setText("<...>");

			this.add(fFigureResidential_enduseConstant_currentFigure);

			fFigureResidential_enduseConstant_admittanceFigure = new WrappingLabel();
			fFigureResidential_enduseConstant_admittanceFigure.setText("<...>");

			this.add(fFigureResidential_enduseConstant_admittanceFigure);

			fFigureResidential_enduseVoltage_factorFigure = new WrappingLabel();
			fFigureResidential_enduseVoltage_factorFigure.setText("<...>");

			this.add(fFigureResidential_enduseVoltage_factorFigure);

			fFigureResidential_enduseConfigurationFigure = new WrappingLabel();
			fFigureResidential_enduseConfigurationFigure.setText("<...>");

			this.add(fFigureResidential_enduseConfigurationFigure);

			fFigureResidential_enduseOverrideFigure = new WrappingLabel();
			fFigureResidential_enduseOverrideFigure.setText("<...>");

			this.add(fFigureResidential_enduseOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseNameFigure() {
			return fFigureResidential_enduseNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseShapeFigure() {
			return fFigureResidential_enduseShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseLoadFigure() {
			return fFigureResidential_enduseLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseEnergyFigure() {
			return fFigureResidential_enduseEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_endusePowerFigure() {
			return fFigureResidential_endusePowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_endusePeak_demandFigure() {
			return fFigureResidential_endusePeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseHeatgainFigure() {
			return fFigureResidential_enduseHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseHeatgain_fractionFigure() {
			return fFigureResidential_enduseHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseCurrent_fractionFigure() {
			return fFigureResidential_enduseCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseImpedance_fractionFigure() {
			return fFigureResidential_enduseImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_endusePower_fractionFigure() {
			return fFigureResidential_endusePower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_endusePower_factorFigure() {
			return fFigureResidential_endusePower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseConstant_powerFigure() {
			return fFigureResidential_enduseConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseConstant_currentFigure() {
			return fFigureResidential_enduseConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseConstant_admittanceFigure() {
			return fFigureResidential_enduseConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseVoltage_factorFigure() {
			return fFigureResidential_enduseVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseConfigurationFigure() {
			return fFigureResidential_enduseConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResidential_enduseOverrideFigure() {
			return fFigureResidential_enduseOverrideFigure;
		}

	}

}
