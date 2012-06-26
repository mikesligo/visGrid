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
public class SubstationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2048;

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
	public SubstationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.SubstationItemSemanticEditPolicy());
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
		return primaryShape = new SubstationFigure();
	}

	/**
	 * @generated
	 */
	public SubstationFigure getPrimaryShape() {
		return (SubstationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.SubstationNameEditPart) {
			((visGrid.diagram.edit.parts.SubstationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSubstationNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.SubstationNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.SubstationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.SubstationConnection_4067) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSubstation_4038) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class SubstationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_energyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_demandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_voltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_voltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_voltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_current_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_current_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationDistribution_current_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationNetwork_Node_Base_PowerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationNetwork_Node_Base_VoltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSubstationNominal_voltageFigure;

		/**
		 * @generated
		 */
		public SubstationFigure() {

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

			fFigureSubstationNameFigure = new WrappingLabel();
			fFigureSubstationNameFigure.setText("<...>");

			this.add(fFigureSubstationNameFigure);

			fFigureSubstationDistribution_energyFigure = new WrappingLabel();
			fFigureSubstationDistribution_energyFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_energyFigure);

			fFigureSubstationDistribution_powerFigure = new WrappingLabel();
			fFigureSubstationDistribution_powerFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_powerFigure);

			fFigureSubstationDistribution_demandFigure = new WrappingLabel();
			fFigureSubstationDistribution_demandFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_demandFigure);

			fFigureSubstationDistribution_voltage_AFigure = new WrappingLabel();
			fFigureSubstationDistribution_voltage_AFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_voltage_AFigure);

			fFigureSubstationDistribution_voltage_BFigure = new WrappingLabel();
			fFigureSubstationDistribution_voltage_BFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_voltage_BFigure);

			fFigureSubstationDistribution_voltage_CFigure = new WrappingLabel();
			fFigureSubstationDistribution_voltage_CFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_voltage_CFigure);

			fFigureSubstationDistribution_current_AFigure = new WrappingLabel();
			fFigureSubstationDistribution_current_AFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_current_AFigure);

			fFigureSubstationDistribution_current_BFigure = new WrappingLabel();
			fFigureSubstationDistribution_current_BFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_current_BFigure);

			fFigureSubstationDistribution_current_CFigure = new WrappingLabel();
			fFigureSubstationDistribution_current_CFigure.setText("<...>");

			this.add(fFigureSubstationDistribution_current_CFigure);

			fFigureSubstationNetwork_Node_Base_PowerFigure = new WrappingLabel();
			fFigureSubstationNetwork_Node_Base_PowerFigure.setText("<...>");

			this.add(fFigureSubstationNetwork_Node_Base_PowerFigure);

			fFigureSubstationNetwork_Node_Base_VoltageFigure = new WrappingLabel();
			fFigureSubstationNetwork_Node_Base_VoltageFigure.setText("<...>");

			this.add(fFigureSubstationNetwork_Node_Base_VoltageFigure);

			fFigureSubstationBustypeFigure = new WrappingLabel();
			fFigureSubstationBustypeFigure.setText("<...>");

			this.add(fFigureSubstationBustypeFigure);

			fFigureSubstationBusflagsFigure = new WrappingLabel();
			fFigureSubstationBusflagsFigure.setText("<...>");

			this.add(fFigureSubstationBusflagsFigure);

			fFigureSubstationReference_busFigure = new WrappingLabel();
			fFigureSubstationReference_busFigure.setText("<...>");

			this.add(fFigureSubstationReference_busFigure);

			fFigureSubstationMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureSubstationMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureSubstationMaximum_voltage_errorFigure);

			fFigureSubstationVoltage_AFigure = new WrappingLabel();
			fFigureSubstationVoltage_AFigure.setText("<...>");

			this.add(fFigureSubstationVoltage_AFigure);

			fFigureSubstationVoltage_BFigure = new WrappingLabel();
			fFigureSubstationVoltage_BFigure.setText("<...>");

			this.add(fFigureSubstationVoltage_BFigure);

			fFigureSubstationVoltage_CFigure = new WrappingLabel();
			fFigureSubstationVoltage_CFigure.setText("<...>");

			this.add(fFigureSubstationVoltage_CFigure);

			fFigureSubstationVoltage_ABFigure = new WrappingLabel();
			fFigureSubstationVoltage_ABFigure.setText("<...>");

			this.add(fFigureSubstationVoltage_ABFigure);

			fFigureSubstationVoltage_BCFigure = new WrappingLabel();
			fFigureSubstationVoltage_BCFigure.setText("<...>");

			this.add(fFigureSubstationVoltage_BCFigure);

			fFigureSubstationVoltage_CAFigure = new WrappingLabel();
			fFigureSubstationVoltage_CAFigure.setText("<...>");

			this.add(fFigureSubstationVoltage_CAFigure);

			fFigureSubstationCurrent_AFigure = new WrappingLabel();
			fFigureSubstationCurrent_AFigure.setText("<...>");

			this.add(fFigureSubstationCurrent_AFigure);

			fFigureSubstationCurrent_BFigure = new WrappingLabel();
			fFigureSubstationCurrent_BFigure.setText("<...>");

			this.add(fFigureSubstationCurrent_BFigure);

			fFigureSubstationCurrent_CFigure = new WrappingLabel();
			fFigureSubstationCurrent_CFigure.setText("<...>");

			this.add(fFigureSubstationCurrent_CFigure);

			fFigureSubstationPower_AFigure = new WrappingLabel();
			fFigureSubstationPower_AFigure.setText("<...>");

			this.add(fFigureSubstationPower_AFigure);

			fFigureSubstationPower_BFigure = new WrappingLabel();
			fFigureSubstationPower_BFigure.setText("<...>");

			this.add(fFigureSubstationPower_BFigure);

			fFigureSubstationPower_CFigure = new WrappingLabel();
			fFigureSubstationPower_CFigure.setText("<...>");

			this.add(fFigureSubstationPower_CFigure);

			fFigureSubstationShunt_AFigure = new WrappingLabel();
			fFigureSubstationShunt_AFigure.setText("<...>");

			this.add(fFigureSubstationShunt_AFigure);

			fFigureSubstationShunt_BFigure = new WrappingLabel();
			fFigureSubstationShunt_BFigure.setText("<...>");

			this.add(fFigureSubstationShunt_BFigure);

			fFigureSubstationShunt_CFigure = new WrappingLabel();
			fFigureSubstationShunt_CFigure.setText("<...>");

			this.add(fFigureSubstationShunt_CFigure);

			fFigureSubstationPhasesFigure = new WrappingLabel();
			fFigureSubstationPhasesFigure.setText("<...>");

			this.add(fFigureSubstationPhasesFigure);

			fFigureSubstationNominal_voltageFigure = new WrappingLabel();
			fFigureSubstationNominal_voltageFigure.setText("<...>");

			this.add(fFigureSubstationNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationNameFigure() {
			return fFigureSubstationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_energyFigure() {
			return fFigureSubstationDistribution_energyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_powerFigure() {
			return fFigureSubstationDistribution_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_demandFigure() {
			return fFigureSubstationDistribution_demandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_voltage_AFigure() {
			return fFigureSubstationDistribution_voltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_voltage_BFigure() {
			return fFigureSubstationDistribution_voltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_voltage_CFigure() {
			return fFigureSubstationDistribution_voltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_current_AFigure() {
			return fFigureSubstationDistribution_current_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_current_BFigure() {
			return fFigureSubstationDistribution_current_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationDistribution_current_CFigure() {
			return fFigureSubstationDistribution_current_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationNetwork_Node_Base_PowerFigure() {
			return fFigureSubstationNetwork_Node_Base_PowerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationNetwork_Node_Base_VoltageFigure() {
			return fFigureSubstationNetwork_Node_Base_VoltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationBustypeFigure() {
			return fFigureSubstationBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationBusflagsFigure() {
			return fFigureSubstationBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationReference_busFigure() {
			return fFigureSubstationReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationMaximum_voltage_errorFigure() {
			return fFigureSubstationMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationVoltage_AFigure() {
			return fFigureSubstationVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationVoltage_BFigure() {
			return fFigureSubstationVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationVoltage_CFigure() {
			return fFigureSubstationVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationVoltage_ABFigure() {
			return fFigureSubstationVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationVoltage_BCFigure() {
			return fFigureSubstationVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationVoltage_CAFigure() {
			return fFigureSubstationVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationCurrent_AFigure() {
			return fFigureSubstationCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationCurrent_BFigure() {
			return fFigureSubstationCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationCurrent_CFigure() {
			return fFigureSubstationCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationPower_AFigure() {
			return fFigureSubstationPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationPower_BFigure() {
			return fFigureSubstationPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationPower_CFigure() {
			return fFigureSubstationPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationShunt_AFigure() {
			return fFigureSubstationShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationShunt_BFigure() {
			return fFigureSubstationShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationShunt_CFigure() {
			return fFigureSubstationShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationPhasesFigure() {
			return fFigureSubstationPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSubstationNominal_voltageFigure() {
			return fFigureSubstationNominal_voltageFigure;
		}

	}

}
