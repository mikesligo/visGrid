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
public class Windturb_dgEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2051;

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
	public Windturb_dgEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Windturb_dgItemSemanticEditPolicy());
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
		return primaryShape = new Windturb_dgFigure();
	}

	/**
	 * @generated
	 */
	public Windturb_dgFigure getPrimaryShape() {
		return (Windturb_dgFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgNameEditPart) {
			((visGrid.diagram.edit.parts.Windturb_dgNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWindturb_dgNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Windturb_dgNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Windturb_dgNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Windturb_dgConnection_4093) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsWindturb_dg_4102) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Windturb_dgFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgGen_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgGen_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgGen_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgTurbine_ModelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgRated_VAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgRated_VFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgPconvFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgWSadjFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgWind_SpeedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgPfFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgGenElecEffFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgTotalRealPowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgTotalReacPowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgEfAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgEfBFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgEfCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgVrotor_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgVrotor_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgVrotor_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgIrotor_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgIrotor_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgIrotor_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWindturb_dgPhasesFigure;

		/**
		 * @generated
		 */
		public Windturb_dgFigure() {

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

			fFigureWindturb_dgNameFigure = new WrappingLabel();
			fFigureWindturb_dgNameFigure.setText("<...>");

			this.add(fFigureWindturb_dgNameFigure);

			fFigureWindturb_dgGen_statusFigure = new WrappingLabel();
			fFigureWindturb_dgGen_statusFigure.setText("<...>");

			this.add(fFigureWindturb_dgGen_statusFigure);

			fFigureWindturb_dgGen_typeFigure = new WrappingLabel();
			fFigureWindturb_dgGen_typeFigure.setText("<...>");

			this.add(fFigureWindturb_dgGen_typeFigure);

			fFigureWindturb_dgGen_modeFigure = new WrappingLabel();
			fFigureWindturb_dgGen_modeFigure.setText("<...>");

			this.add(fFigureWindturb_dgGen_modeFigure);

			fFigureWindturb_dgTurbine_ModelFigure = new WrappingLabel();
			fFigureWindturb_dgTurbine_ModelFigure.setText("<...>");

			this.add(fFigureWindturb_dgTurbine_ModelFigure);

			fFigureWindturb_dgRated_VAFigure = new WrappingLabel();
			fFigureWindturb_dgRated_VAFigure.setText("<...>");

			this.add(fFigureWindturb_dgRated_VAFigure);

			fFigureWindturb_dgRated_VFigure = new WrappingLabel();
			fFigureWindturb_dgRated_VFigure.setText("<...>");

			this.add(fFigureWindturb_dgRated_VFigure);

			fFigureWindturb_dgPconvFigure = new WrappingLabel();
			fFigureWindturb_dgPconvFigure.setText("<...>");

			this.add(fFigureWindturb_dgPconvFigure);

			fFigureWindturb_dgWSadjFigure = new WrappingLabel();
			fFigureWindturb_dgWSadjFigure.setText("<...>");

			this.add(fFigureWindturb_dgWSadjFigure);

			fFigureWindturb_dgWind_SpeedFigure = new WrappingLabel();
			fFigureWindturb_dgWind_SpeedFigure.setText("<...>");

			this.add(fFigureWindturb_dgWind_SpeedFigure);

			fFigureWindturb_dgPfFigure = new WrappingLabel();
			fFigureWindturb_dgPfFigure.setText("<...>");

			this.add(fFigureWindturb_dgPfFigure);

			fFigureWindturb_dgGenElecEffFigure = new WrappingLabel();
			fFigureWindturb_dgGenElecEffFigure.setText("<...>");

			this.add(fFigureWindturb_dgGenElecEffFigure);

			fFigureWindturb_dgTotalRealPowFigure = new WrappingLabel();
			fFigureWindturb_dgTotalRealPowFigure.setText("<...>");

			this.add(fFigureWindturb_dgTotalRealPowFigure);

			fFigureWindturb_dgTotalReacPowFigure = new WrappingLabel();
			fFigureWindturb_dgTotalReacPowFigure.setText("<...>");

			this.add(fFigureWindturb_dgTotalReacPowFigure);

			fFigureWindturb_dgVoltage_AFigure = new WrappingLabel();
			fFigureWindturb_dgVoltage_AFigure.setText("<...>");

			this.add(fFigureWindturb_dgVoltage_AFigure);

			fFigureWindturb_dgVoltage_BFigure = new WrappingLabel();
			fFigureWindturb_dgVoltage_BFigure.setText("<...>");

			this.add(fFigureWindturb_dgVoltage_BFigure);

			fFigureWindturb_dgVoltage_CFigure = new WrappingLabel();
			fFigureWindturb_dgVoltage_CFigure.setText("<...>");

			this.add(fFigureWindturb_dgVoltage_CFigure);

			fFigureWindturb_dgCurrent_AFigure = new WrappingLabel();
			fFigureWindturb_dgCurrent_AFigure.setText("<...>");

			this.add(fFigureWindturb_dgCurrent_AFigure);

			fFigureWindturb_dgCurrent_BFigure = new WrappingLabel();
			fFigureWindturb_dgCurrent_BFigure.setText("<...>");

			this.add(fFigureWindturb_dgCurrent_BFigure);

			fFigureWindturb_dgCurrent_CFigure = new WrappingLabel();
			fFigureWindturb_dgCurrent_CFigure.setText("<...>");

			this.add(fFigureWindturb_dgCurrent_CFigure);

			fFigureWindturb_dgEfAFigure = new WrappingLabel();
			fFigureWindturb_dgEfAFigure.setText("<...>");

			this.add(fFigureWindturb_dgEfAFigure);

			fFigureWindturb_dgEfBFigure = new WrappingLabel();
			fFigureWindturb_dgEfBFigure.setText("<...>");

			this.add(fFigureWindturb_dgEfBFigure);

			fFigureWindturb_dgEfCFigure = new WrappingLabel();
			fFigureWindturb_dgEfCFigure.setText("<...>");

			this.add(fFigureWindturb_dgEfCFigure);

			fFigureWindturb_dgVrotor_AFigure = new WrappingLabel();
			fFigureWindturb_dgVrotor_AFigure.setText("<...>");

			this.add(fFigureWindturb_dgVrotor_AFigure);

			fFigureWindturb_dgVrotor_BFigure = new WrappingLabel();
			fFigureWindturb_dgVrotor_BFigure.setText("<...>");

			this.add(fFigureWindturb_dgVrotor_BFigure);

			fFigureWindturb_dgVrotor_CFigure = new WrappingLabel();
			fFigureWindturb_dgVrotor_CFigure.setText("<...>");

			this.add(fFigureWindturb_dgVrotor_CFigure);

			fFigureWindturb_dgIrotor_AFigure = new WrappingLabel();
			fFigureWindturb_dgIrotor_AFigure.setText("<...>");

			this.add(fFigureWindturb_dgIrotor_AFigure);

			fFigureWindturb_dgIrotor_BFigure = new WrappingLabel();
			fFigureWindturb_dgIrotor_BFigure.setText("<...>");

			this.add(fFigureWindturb_dgIrotor_BFigure);

			fFigureWindturb_dgIrotor_CFigure = new WrappingLabel();
			fFigureWindturb_dgIrotor_CFigure.setText("<...>");

			this.add(fFigureWindturb_dgIrotor_CFigure);

			fFigureWindturb_dgPhasesFigure = new WrappingLabel();
			fFigureWindturb_dgPhasesFigure.setText("<...>");

			this.add(fFigureWindturb_dgPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgNameFigure() {
			return fFigureWindturb_dgNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgGen_statusFigure() {
			return fFigureWindturb_dgGen_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgGen_typeFigure() {
			return fFigureWindturb_dgGen_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgGen_modeFigure() {
			return fFigureWindturb_dgGen_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgTurbine_ModelFigure() {
			return fFigureWindturb_dgTurbine_ModelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgRated_VAFigure() {
			return fFigureWindturb_dgRated_VAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgRated_VFigure() {
			return fFigureWindturb_dgRated_VFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgPconvFigure() {
			return fFigureWindturb_dgPconvFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgWSadjFigure() {
			return fFigureWindturb_dgWSadjFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgWind_SpeedFigure() {
			return fFigureWindturb_dgWind_SpeedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgPfFigure() {
			return fFigureWindturb_dgPfFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgGenElecEffFigure() {
			return fFigureWindturb_dgGenElecEffFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgTotalRealPowFigure() {
			return fFigureWindturb_dgTotalRealPowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgTotalReacPowFigure() {
			return fFigureWindturb_dgTotalReacPowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgVoltage_AFigure() {
			return fFigureWindturb_dgVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgVoltage_BFigure() {
			return fFigureWindturb_dgVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgVoltage_CFigure() {
			return fFigureWindturb_dgVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgCurrent_AFigure() {
			return fFigureWindturb_dgCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgCurrent_BFigure() {
			return fFigureWindturb_dgCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgCurrent_CFigure() {
			return fFigureWindturb_dgCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgEfAFigure() {
			return fFigureWindturb_dgEfAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgEfBFigure() {
			return fFigureWindturb_dgEfBFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgEfCFigure() {
			return fFigureWindturb_dgEfCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgVrotor_AFigure() {
			return fFigureWindturb_dgVrotor_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgVrotor_BFigure() {
			return fFigureWindturb_dgVrotor_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgVrotor_CFigure() {
			return fFigureWindturb_dgVrotor_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgIrotor_AFigure() {
			return fFigureWindturb_dgIrotor_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgIrotor_BFigure() {
			return fFigureWindturb_dgIrotor_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgIrotor_CFigure() {
			return fFigureWindturb_dgIrotor_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWindturb_dgPhasesFigure() {
			return fFigureWindturb_dgPhasesFigure;
		}

	}

}
