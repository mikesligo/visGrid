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
public class OccupantloadEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2065;

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
	public OccupantloadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.OccupantloadItemSemanticEditPolicy());
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
		return primaryShape = new OccupantloadFigure();
	}

	/**
	 * @generated
	 */
	public OccupantloadFigure getPrimaryShape() {
		return (OccupantloadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.OccupantloadNameEditPart) {
			((visGrid.diagram.edit.parts.OccupantloadNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureOccupantloadNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.OccupantloadNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.OccupantloadNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.OccupantloadConnection_4018) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsOccupantload_4071) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class OccupantloadFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadNumber_of_occupantsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadOccupancy_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadHeatgain_per_personFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadShapeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadLoadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadPowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadPeak_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadHeatgainFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadHeatgain_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadCurrent_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadImpedance_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadPower_fractionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadPower_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadConstant_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadConstant_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadConstant_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadVoltage_factorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadConfigurationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureOccupantloadOverrideFigure;

		/**
		 * @generated
		 */
		public OccupantloadFigure() {

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

			fFigureOccupantloadNameFigure = new WrappingLabel();
			fFigureOccupantloadNameFigure.setText("<...>");

			this.add(fFigureOccupantloadNameFigure);

			fFigureOccupantloadNumber_of_occupantsFigure = new WrappingLabel();
			fFigureOccupantloadNumber_of_occupantsFigure.setText("<...>");

			this.add(fFigureOccupantloadNumber_of_occupantsFigure);

			fFigureOccupantloadOccupancy_fractionFigure = new WrappingLabel();
			fFigureOccupantloadOccupancy_fractionFigure.setText("<...>");

			this.add(fFigureOccupantloadOccupancy_fractionFigure);

			fFigureOccupantloadHeatgain_per_personFigure = new WrappingLabel();
			fFigureOccupantloadHeatgain_per_personFigure.setText("<...>");

			this.add(fFigureOccupantloadHeatgain_per_personFigure);

			fFigureOccupantloadShapeFigure = new WrappingLabel();
			fFigureOccupantloadShapeFigure.setText("<...>");

			this.add(fFigureOccupantloadShapeFigure);

			fFigureOccupantloadLoadFigure = new WrappingLabel();
			fFigureOccupantloadLoadFigure.setText("<...>");

			this.add(fFigureOccupantloadLoadFigure);

			fFigureOccupantloadEnergyFigure = new WrappingLabel();
			fFigureOccupantloadEnergyFigure.setText("<...>");

			this.add(fFigureOccupantloadEnergyFigure);

			fFigureOccupantloadPowerFigure = new WrappingLabel();
			fFigureOccupantloadPowerFigure.setText("<...>");

			this.add(fFigureOccupantloadPowerFigure);

			fFigureOccupantloadPeak_demandFigure = new WrappingLabel();
			fFigureOccupantloadPeak_demandFigure.setText("<...>");

			this.add(fFigureOccupantloadPeak_demandFigure);

			fFigureOccupantloadHeatgainFigure = new WrappingLabel();
			fFigureOccupantloadHeatgainFigure.setText("<...>");

			this.add(fFigureOccupantloadHeatgainFigure);

			fFigureOccupantloadHeatgain_fractionFigure = new WrappingLabel();
			fFigureOccupantloadHeatgain_fractionFigure.setText("<...>");

			this.add(fFigureOccupantloadHeatgain_fractionFigure);

			fFigureOccupantloadCurrent_fractionFigure = new WrappingLabel();
			fFigureOccupantloadCurrent_fractionFigure.setText("<...>");

			this.add(fFigureOccupantloadCurrent_fractionFigure);

			fFigureOccupantloadImpedance_fractionFigure = new WrappingLabel();
			fFigureOccupantloadImpedance_fractionFigure.setText("<...>");

			this.add(fFigureOccupantloadImpedance_fractionFigure);

			fFigureOccupantloadPower_fractionFigure = new WrappingLabel();
			fFigureOccupantloadPower_fractionFigure.setText("<...>");

			this.add(fFigureOccupantloadPower_fractionFigure);

			fFigureOccupantloadPower_factorFigure = new WrappingLabel();
			fFigureOccupantloadPower_factorFigure.setText("<...>");

			this.add(fFigureOccupantloadPower_factorFigure);

			fFigureOccupantloadConstant_powerFigure = new WrappingLabel();
			fFigureOccupantloadConstant_powerFigure.setText("<...>");

			this.add(fFigureOccupantloadConstant_powerFigure);

			fFigureOccupantloadConstant_currentFigure = new WrappingLabel();
			fFigureOccupantloadConstant_currentFigure.setText("<...>");

			this.add(fFigureOccupantloadConstant_currentFigure);

			fFigureOccupantloadConstant_admittanceFigure = new WrappingLabel();
			fFigureOccupantloadConstant_admittanceFigure.setText("<...>");

			this.add(fFigureOccupantloadConstant_admittanceFigure);

			fFigureOccupantloadVoltage_factorFigure = new WrappingLabel();
			fFigureOccupantloadVoltage_factorFigure.setText("<...>");

			this.add(fFigureOccupantloadVoltage_factorFigure);

			fFigureOccupantloadConfigurationFigure = new WrappingLabel();
			fFigureOccupantloadConfigurationFigure.setText("<...>");

			this.add(fFigureOccupantloadConfigurationFigure);

			fFigureOccupantloadOverrideFigure = new WrappingLabel();
			fFigureOccupantloadOverrideFigure.setText("<...>");

			this.add(fFigureOccupantloadOverrideFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadNameFigure() {
			return fFigureOccupantloadNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadNumber_of_occupantsFigure() {
			return fFigureOccupantloadNumber_of_occupantsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadOccupancy_fractionFigure() {
			return fFigureOccupantloadOccupancy_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadHeatgain_per_personFigure() {
			return fFigureOccupantloadHeatgain_per_personFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadShapeFigure() {
			return fFigureOccupantloadShapeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadLoadFigure() {
			return fFigureOccupantloadLoadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadEnergyFigure() {
			return fFigureOccupantloadEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadPowerFigure() {
			return fFigureOccupantloadPowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadPeak_demandFigure() {
			return fFigureOccupantloadPeak_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadHeatgainFigure() {
			return fFigureOccupantloadHeatgainFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadHeatgain_fractionFigure() {
			return fFigureOccupantloadHeatgain_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadCurrent_fractionFigure() {
			return fFigureOccupantloadCurrent_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadImpedance_fractionFigure() {
			return fFigureOccupantloadImpedance_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadPower_fractionFigure() {
			return fFigureOccupantloadPower_fractionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadPower_factorFigure() {
			return fFigureOccupantloadPower_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadConstant_powerFigure() {
			return fFigureOccupantloadConstant_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadConstant_currentFigure() {
			return fFigureOccupantloadConstant_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadConstant_admittanceFigure() {
			return fFigureOccupantloadConstant_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadVoltage_factorFigure() {
			return fFigureOccupantloadVoltage_factorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadConfigurationFigure() {
			return fFigureOccupantloadConfigurationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureOccupantloadOverrideFigure() {
			return fFigureOccupantloadOverrideFigure;
		}

	}

}
