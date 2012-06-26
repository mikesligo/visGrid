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
public class MotorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2078;

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
	public MotorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.MotorItemSemanticEditPolicy());
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
		return primaryShape = new MotorFigure();
	}

	/**
	 * @generated
	 */
	public MotorFigure getPrimaryShape() {
		return (MotorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MotorNameEditPart) {
			((visGrid.diagram.edit.parts.MotorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMotorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MotorNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.MotorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MotorConnection_4063) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMotor_4143) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class MotorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorBustypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorBusflagsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorReference_busFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorMaximum_voltage_errorFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorVoltage_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorVoltage_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorVoltage_CAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorShunt_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorShunt_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorShunt_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorPhasesFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMotorNominal_voltageFigure;

		/**
		 * @generated
		 */
		public MotorFigure() {

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

			fFigureMotorNameFigure = new WrappingLabel();
			fFigureMotorNameFigure.setText("<...>");

			this.add(fFigureMotorNameFigure);

			fFigureMotorBustypeFigure = new WrappingLabel();
			fFigureMotorBustypeFigure.setText("<...>");

			this.add(fFigureMotorBustypeFigure);

			fFigureMotorBusflagsFigure = new WrappingLabel();
			fFigureMotorBusflagsFigure.setText("<...>");

			this.add(fFigureMotorBusflagsFigure);

			fFigureMotorReference_busFigure = new WrappingLabel();
			fFigureMotorReference_busFigure.setText("<...>");

			this.add(fFigureMotorReference_busFigure);

			fFigureMotorMaximum_voltage_errorFigure = new WrappingLabel();
			fFigureMotorMaximum_voltage_errorFigure.setText("<...>");

			this.add(fFigureMotorMaximum_voltage_errorFigure);

			fFigureMotorVoltage_AFigure = new WrappingLabel();
			fFigureMotorVoltage_AFigure.setText("<...>");

			this.add(fFigureMotorVoltage_AFigure);

			fFigureMotorVoltage_BFigure = new WrappingLabel();
			fFigureMotorVoltage_BFigure.setText("<...>");

			this.add(fFigureMotorVoltage_BFigure);

			fFigureMotorVoltage_CFigure = new WrappingLabel();
			fFigureMotorVoltage_CFigure.setText("<...>");

			this.add(fFigureMotorVoltage_CFigure);

			fFigureMotorVoltage_ABFigure = new WrappingLabel();
			fFigureMotorVoltage_ABFigure.setText("<...>");

			this.add(fFigureMotorVoltage_ABFigure);

			fFigureMotorVoltage_BCFigure = new WrappingLabel();
			fFigureMotorVoltage_BCFigure.setText("<...>");

			this.add(fFigureMotorVoltage_BCFigure);

			fFigureMotorVoltage_CAFigure = new WrappingLabel();
			fFigureMotorVoltage_CAFigure.setText("<...>");

			this.add(fFigureMotorVoltage_CAFigure);

			fFigureMotorCurrent_AFigure = new WrappingLabel();
			fFigureMotorCurrent_AFigure.setText("<...>");

			this.add(fFigureMotorCurrent_AFigure);

			fFigureMotorCurrent_BFigure = new WrappingLabel();
			fFigureMotorCurrent_BFigure.setText("<...>");

			this.add(fFigureMotorCurrent_BFigure);

			fFigureMotorCurrent_CFigure = new WrappingLabel();
			fFigureMotorCurrent_CFigure.setText("<...>");

			this.add(fFigureMotorCurrent_CFigure);

			fFigureMotorPower_AFigure = new WrappingLabel();
			fFigureMotorPower_AFigure.setText("<...>");

			this.add(fFigureMotorPower_AFigure);

			fFigureMotorPower_BFigure = new WrappingLabel();
			fFigureMotorPower_BFigure.setText("<...>");

			this.add(fFigureMotorPower_BFigure);

			fFigureMotorPower_CFigure = new WrappingLabel();
			fFigureMotorPower_CFigure.setText("<...>");

			this.add(fFigureMotorPower_CFigure);

			fFigureMotorShunt_AFigure = new WrappingLabel();
			fFigureMotorShunt_AFigure.setText("<...>");

			this.add(fFigureMotorShunt_AFigure);

			fFigureMotorShunt_BFigure = new WrappingLabel();
			fFigureMotorShunt_BFigure.setText("<...>");

			this.add(fFigureMotorShunt_BFigure);

			fFigureMotorShunt_CFigure = new WrappingLabel();
			fFigureMotorShunt_CFigure.setText("<...>");

			this.add(fFigureMotorShunt_CFigure);

			fFigureMotorPhasesFigure = new WrappingLabel();
			fFigureMotorPhasesFigure.setText("<...>");

			this.add(fFigureMotorPhasesFigure);

			fFigureMotorNominal_voltageFigure = new WrappingLabel();
			fFigureMotorNominal_voltageFigure.setText("<...>");

			this.add(fFigureMotorNominal_voltageFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorNameFigure() {
			return fFigureMotorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorBustypeFigure() {
			return fFigureMotorBustypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorBusflagsFigure() {
			return fFigureMotorBusflagsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorReference_busFigure() {
			return fFigureMotorReference_busFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorMaximum_voltage_errorFigure() {
			return fFigureMotorMaximum_voltage_errorFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorVoltage_AFigure() {
			return fFigureMotorVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorVoltage_BFigure() {
			return fFigureMotorVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorVoltage_CFigure() {
			return fFigureMotorVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorVoltage_ABFigure() {
			return fFigureMotorVoltage_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorVoltage_BCFigure() {
			return fFigureMotorVoltage_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorVoltage_CAFigure() {
			return fFigureMotorVoltage_CAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorCurrent_AFigure() {
			return fFigureMotorCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorCurrent_BFigure() {
			return fFigureMotorCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorCurrent_CFigure() {
			return fFigureMotorCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorPower_AFigure() {
			return fFigureMotorPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorPower_BFigure() {
			return fFigureMotorPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorPower_CFigure() {
			return fFigureMotorPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorShunt_AFigure() {
			return fFigureMotorShunt_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorShunt_BFigure() {
			return fFigureMotorShunt_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorShunt_CFigure() {
			return fFigureMotorShunt_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorPhasesFigure() {
			return fFigureMotorPhasesFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMotorNominal_voltageFigure() {
			return fFigureMotorNominal_voltageFigure;
		}

	}

}