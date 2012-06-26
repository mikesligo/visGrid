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
public class Diesel_dgEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2079;

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
	public Diesel_dgEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Diesel_dgItemSemanticEditPolicy());
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
		return primaryShape = new Diesel_dgFigure();
	}

	/**
	 * @generated
	 */
	public Diesel_dgFigure getPrimaryShape() {
		return (Diesel_dgFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgNameEditPart) {
			((visGrid.diagram.edit.parts.Diesel_dgNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDiesel_dgNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Diesel_dgNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Diesel_dgNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Diesel_dgConnection_4115) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDiesel_dg_4136) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Diesel_dgFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgGen_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgGen_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRated_kVFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgXsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgRgFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgXgFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgVoltage_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgVoltage_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgVoltage_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgCurrent_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgCurrent_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgCurrent_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfBFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_AFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_BFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_CFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_A_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_B_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPower_C_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfA_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfB_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgEfC_schFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgSlackBusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDiesel_dgPhasesFigure;

		/**
		 * @generated
		 */
		public Diesel_dgFigure() {

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

			fFigureDiesel_dgNameFigure = new WrappingLabel();
			fFigureDiesel_dgNameFigure.setText("<...>");

			this.add(fFigureDiesel_dgNameFigure);

			fFigureDiesel_dgGen_modeFigure = new WrappingLabel();
			fFigureDiesel_dgGen_modeFigure.setText("<...>");

			this.add(fFigureDiesel_dgGen_modeFigure);

			fFigureDiesel_dgGen_statusFigure = new WrappingLabel();
			fFigureDiesel_dgGen_statusFigure.setText("<...>");

			this.add(fFigureDiesel_dgGen_statusFigure);

			fFigureDiesel_dgRated_kVAFigure = new WrappingLabel();
			fFigureDiesel_dgRated_kVAFigure.setText("<...>");

			this.add(fFigureDiesel_dgRated_kVAFigure);

			fFigureDiesel_dgRated_kVFigure = new WrappingLabel();
			fFigureDiesel_dgRated_kVFigure.setText("<...>");

			this.add(fFigureDiesel_dgRated_kVFigure);

			fFigureDiesel_dgRsFigure = new WrappingLabel();
			fFigureDiesel_dgRsFigure.setText("<...>");

			this.add(fFigureDiesel_dgRsFigure);

			fFigureDiesel_dgXsFigure = new WrappingLabel();
			fFigureDiesel_dgXsFigure.setText("<...>");

			this.add(fFigureDiesel_dgXsFigure);

			fFigureDiesel_dgRgFigure = new WrappingLabel();
			fFigureDiesel_dgRgFigure.setText("<...>");

			this.add(fFigureDiesel_dgRgFigure);

			fFigureDiesel_dgXgFigure = new WrappingLabel();
			fFigureDiesel_dgXgFigure.setText("<...>");

			this.add(fFigureDiesel_dgXgFigure);

			fFigureDiesel_dgVoltage_AFigure = new WrappingLabel();
			fFigureDiesel_dgVoltage_AFigure.setText("<...>");

			this.add(fFigureDiesel_dgVoltage_AFigure);

			fFigureDiesel_dgVoltage_BFigure = new WrappingLabel();
			fFigureDiesel_dgVoltage_BFigure.setText("<...>");

			this.add(fFigureDiesel_dgVoltage_BFigure);

			fFigureDiesel_dgVoltage_CFigure = new WrappingLabel();
			fFigureDiesel_dgVoltage_CFigure.setText("<...>");

			this.add(fFigureDiesel_dgVoltage_CFigure);

			fFigureDiesel_dgCurrent_AFigure = new WrappingLabel();
			fFigureDiesel_dgCurrent_AFigure.setText("<...>");

			this.add(fFigureDiesel_dgCurrent_AFigure);

			fFigureDiesel_dgCurrent_BFigure = new WrappingLabel();
			fFigureDiesel_dgCurrent_BFigure.setText("<...>");

			this.add(fFigureDiesel_dgCurrent_BFigure);

			fFigureDiesel_dgCurrent_CFigure = new WrappingLabel();
			fFigureDiesel_dgCurrent_CFigure.setText("<...>");

			this.add(fFigureDiesel_dgCurrent_CFigure);

			fFigureDiesel_dgEfAFigure = new WrappingLabel();
			fFigureDiesel_dgEfAFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfAFigure);

			fFigureDiesel_dgEfBFigure = new WrappingLabel();
			fFigureDiesel_dgEfBFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfBFigure);

			fFigureDiesel_dgEfCFigure = new WrappingLabel();
			fFigureDiesel_dgEfCFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfCFigure);

			fFigureDiesel_dgPower_AFigure = new WrappingLabel();
			fFigureDiesel_dgPower_AFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_AFigure);

			fFigureDiesel_dgPower_BFigure = new WrappingLabel();
			fFigureDiesel_dgPower_BFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_BFigure);

			fFigureDiesel_dgPower_CFigure = new WrappingLabel();
			fFigureDiesel_dgPower_CFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_CFigure);

			fFigureDiesel_dgPower_A_schFigure = new WrappingLabel();
			fFigureDiesel_dgPower_A_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_A_schFigure);

			fFigureDiesel_dgPower_B_schFigure = new WrappingLabel();
			fFigureDiesel_dgPower_B_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_B_schFigure);

			fFigureDiesel_dgPower_C_schFigure = new WrappingLabel();
			fFigureDiesel_dgPower_C_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgPower_C_schFigure);

			fFigureDiesel_dgEfA_schFigure = new WrappingLabel();
			fFigureDiesel_dgEfA_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfA_schFigure);

			fFigureDiesel_dgEfB_schFigure = new WrappingLabel();
			fFigureDiesel_dgEfB_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfB_schFigure);

			fFigureDiesel_dgEfC_schFigure = new WrappingLabel();
			fFigureDiesel_dgEfC_schFigure.setText("<...>");

			this.add(fFigureDiesel_dgEfC_schFigure);

			fFigureDiesel_dgSlackBusFigure = new WrappingLabel();
			fFigureDiesel_dgSlackBusFigure.setText("<...>");

			this.add(fFigureDiesel_dgSlackBusFigure);

			fFigureDiesel_dgPhasesFigure = new WrappingLabel();
			fFigureDiesel_dgPhasesFigure.setText("<...>");

			this.add(fFigureDiesel_dgPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgNameFigure() {
			return fFigureDiesel_dgNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgGen_modeFigure() {
			return fFigureDiesel_dgGen_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgGen_statusFigure() {
			return fFigureDiesel_dgGen_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRated_kVAFigure() {
			return fFigureDiesel_dgRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRated_kVFigure() {
			return fFigureDiesel_dgRated_kVFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRsFigure() {
			return fFigureDiesel_dgRsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgXsFigure() {
			return fFigureDiesel_dgXsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgRgFigure() {
			return fFigureDiesel_dgRgFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgXgFigure() {
			return fFigureDiesel_dgXgFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgVoltage_AFigure() {
			return fFigureDiesel_dgVoltage_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgVoltage_BFigure() {
			return fFigureDiesel_dgVoltage_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgVoltage_CFigure() {
			return fFigureDiesel_dgVoltage_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgCurrent_AFigure() {
			return fFigureDiesel_dgCurrent_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgCurrent_BFigure() {
			return fFigureDiesel_dgCurrent_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgCurrent_CFigure() {
			return fFigureDiesel_dgCurrent_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfAFigure() {
			return fFigureDiesel_dgEfAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfBFigure() {
			return fFigureDiesel_dgEfBFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfCFigure() {
			return fFigureDiesel_dgEfCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_AFigure() {
			return fFigureDiesel_dgPower_AFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_BFigure() {
			return fFigureDiesel_dgPower_BFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_CFigure() {
			return fFigureDiesel_dgPower_CFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_A_schFigure() {
			return fFigureDiesel_dgPower_A_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_B_schFigure() {
			return fFigureDiesel_dgPower_B_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPower_C_schFigure() {
			return fFigureDiesel_dgPower_C_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfA_schFigure() {
			return fFigureDiesel_dgEfA_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfB_schFigure() {
			return fFigureDiesel_dgEfB_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgEfC_schFigure() {
			return fFigureDiesel_dgEfC_schFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgSlackBusFigure() {
			return fFigureDiesel_dgSlackBusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDiesel_dgPhasesFigure() {
			return fFigureDiesel_dgPhasesFigure;
		}

	}

}
