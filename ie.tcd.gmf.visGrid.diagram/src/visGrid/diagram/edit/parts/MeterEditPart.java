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
public class MeterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public MeterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.MeterItemSemanticEditPolicy());
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
		return primaryShape = new MeterFigure();
	}

	/**
	 * @generated
	 */
	public MeterFigure getPrimaryShape() {
		return (MeterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MeterNameEditPart) {
			((visGrid.diagram.edit.parts.MeterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureMeterNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MeterNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.MeterNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MeterConnection_4024) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMeter_4091) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class MeterFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterDemandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterMeterFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine1_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine2_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine3_currentFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine1_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine2_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine3_admittanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine1_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine2_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine3_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine1_voltsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine2_voltsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMeterLine3_voltsFigure;

		/**
		 * @generated
		 */
		public MeterFigure() {

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

			fFigureMeterNameFigure = new WrappingLabel();
			fFigureMeterNameFigure.setText("<...>");

			this.add(fFigureMeterNameFigure);

			fFigureMeterTypeFigure = new WrappingLabel();
			fFigureMeterTypeFigure.setText("<...>");

			this.add(fFigureMeterTypeFigure);

			fFigureMeterDemandFigure = new WrappingLabel();
			fFigureMeterDemandFigure.setText("<...>");

			this.add(fFigureMeterDemandFigure);

			fFigureMeterMeterFigure = new WrappingLabel();
			fFigureMeterMeterFigure.setText("<...>");

			this.add(fFigureMeterMeterFigure);

			fFigureMeterLine1_currentFigure = new WrappingLabel();
			fFigureMeterLine1_currentFigure.setText("<...>");

			this.add(fFigureMeterLine1_currentFigure);

			fFigureMeterLine2_currentFigure = new WrappingLabel();
			fFigureMeterLine2_currentFigure.setText("<...>");

			this.add(fFigureMeterLine2_currentFigure);

			fFigureMeterLine3_currentFigure = new WrappingLabel();
			fFigureMeterLine3_currentFigure.setText("<...>");

			this.add(fFigureMeterLine3_currentFigure);

			fFigureMeterLine1_admittanceFigure = new WrappingLabel();
			fFigureMeterLine1_admittanceFigure.setText("<...>");

			this.add(fFigureMeterLine1_admittanceFigure);

			fFigureMeterLine2_admittanceFigure = new WrappingLabel();
			fFigureMeterLine2_admittanceFigure.setText("<...>");

			this.add(fFigureMeterLine2_admittanceFigure);

			fFigureMeterLine3_admittanceFigure = new WrappingLabel();
			fFigureMeterLine3_admittanceFigure.setText("<...>");

			this.add(fFigureMeterLine3_admittanceFigure);

			fFigureMeterLine1_powerFigure = new WrappingLabel();
			fFigureMeterLine1_powerFigure.setText("<...>");

			this.add(fFigureMeterLine1_powerFigure);

			fFigureMeterLine2_powerFigure = new WrappingLabel();
			fFigureMeterLine2_powerFigure.setText("<...>");

			this.add(fFigureMeterLine2_powerFigure);

			fFigureMeterLine3_powerFigure = new WrappingLabel();
			fFigureMeterLine3_powerFigure.setText("<...>");

			this.add(fFigureMeterLine3_powerFigure);

			fFigureMeterLine1_voltsFigure = new WrappingLabel();
			fFigureMeterLine1_voltsFigure.setText("<...>");

			this.add(fFigureMeterLine1_voltsFigure);

			fFigureMeterLine2_voltsFigure = new WrappingLabel();
			fFigureMeterLine2_voltsFigure.setText("<...>");

			this.add(fFigureMeterLine2_voltsFigure);

			fFigureMeterLine3_voltsFigure = new WrappingLabel();
			fFigureMeterLine3_voltsFigure.setText("<...>");

			this.add(fFigureMeterLine3_voltsFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterNameFigure() {
			return fFigureMeterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterTypeFigure() {
			return fFigureMeterTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterDemandFigure() {
			return fFigureMeterDemandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterMeterFigure() {
			return fFigureMeterMeterFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine1_currentFigure() {
			return fFigureMeterLine1_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine2_currentFigure() {
			return fFigureMeterLine2_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine3_currentFigure() {
			return fFigureMeterLine3_currentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine1_admittanceFigure() {
			return fFigureMeterLine1_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine2_admittanceFigure() {
			return fFigureMeterLine2_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine3_admittanceFigure() {
			return fFigureMeterLine3_admittanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine1_powerFigure() {
			return fFigureMeterLine1_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine2_powerFigure() {
			return fFigureMeterLine2_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine3_powerFigure() {
			return fFigureMeterLine3_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine1_voltsFigure() {
			return fFigureMeterLine1_voltsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine2_voltsFigure() {
			return fFigureMeterLine2_voltsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMeterLine3_voltsFigure() {
			return fFigureMeterLine3_voltsFigure;
		}

	}

}
