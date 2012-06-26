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
public class StubauctionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2020;

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
	public StubauctionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.StubauctionItemSemanticEditPolicy());
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
		return primaryShape = new StubauctionFigure();
	}

	/**
	 * @generated
	 */
	public StubauctionFigure getPrimaryShape() {
		return (StubauctionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.StubauctionNameEditPart) {
			((visGrid.diagram.edit.parts.StubauctionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureStubauctionNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.StubauctionNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.StubauctionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.StubauctionConnection_4098) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsStubauction_4017) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class StubauctionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionUnitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionPeriodFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionLast__PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionNext__PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionAvg24Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionStd24Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionAvg72Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionStd72Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionAvg168Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionStd168Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStubauctionVerboseFigure;

		/**
		 * @generated
		 */
		public StubauctionFigure() {

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

			fFigureStubauctionNameFigure = new WrappingLabel();
			fFigureStubauctionNameFigure.setText("<...>");

			this.add(fFigureStubauctionNameFigure);

			fFigureStubauctionUnitFigure = new WrappingLabel();
			fFigureStubauctionUnitFigure.setText("<...>");

			this.add(fFigureStubauctionUnitFigure);

			fFigureStubauctionPeriodFigure = new WrappingLabel();
			fFigureStubauctionPeriodFigure.setText("<...>");

			this.add(fFigureStubauctionPeriodFigure);

			fFigureStubauctionLast__PFigure = new WrappingLabel();
			fFigureStubauctionLast__PFigure.setText("<...>");

			this.add(fFigureStubauctionLast__PFigure);

			fFigureStubauctionNext__PFigure = new WrappingLabel();
			fFigureStubauctionNext__PFigure.setText("<...>");

			this.add(fFigureStubauctionNext__PFigure);

			fFigureStubauctionAvg24Figure = new WrappingLabel();
			fFigureStubauctionAvg24Figure.setText("<...>");

			this.add(fFigureStubauctionAvg24Figure);

			fFigureStubauctionStd24Figure = new WrappingLabel();
			fFigureStubauctionStd24Figure.setText("<...>");

			this.add(fFigureStubauctionStd24Figure);

			fFigureStubauctionAvg72Figure = new WrappingLabel();
			fFigureStubauctionAvg72Figure.setText("<...>");

			this.add(fFigureStubauctionAvg72Figure);

			fFigureStubauctionStd72Figure = new WrappingLabel();
			fFigureStubauctionStd72Figure.setText("<...>");

			this.add(fFigureStubauctionStd72Figure);

			fFigureStubauctionAvg168Figure = new WrappingLabel();
			fFigureStubauctionAvg168Figure.setText("<...>");

			this.add(fFigureStubauctionAvg168Figure);

			fFigureStubauctionStd168Figure = new WrappingLabel();
			fFigureStubauctionStd168Figure.setText("<...>");

			this.add(fFigureStubauctionStd168Figure);

			fFigureStubauctionVerboseFigure = new WrappingLabel();
			fFigureStubauctionVerboseFigure.setText("<...>");

			this.add(fFigureStubauctionVerboseFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionNameFigure() {
			return fFigureStubauctionNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionUnitFigure() {
			return fFigureStubauctionUnitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionPeriodFigure() {
			return fFigureStubauctionPeriodFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionLast__PFigure() {
			return fFigureStubauctionLast__PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionNext__PFigure() {
			return fFigureStubauctionNext__PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionAvg24Figure() {
			return fFigureStubauctionAvg24Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionStd24Figure() {
			return fFigureStubauctionStd24Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionAvg72Figure() {
			return fFigureStubauctionAvg72Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionStd72Figure() {
			return fFigureStubauctionStd72Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionAvg168Figure() {
			return fFigureStubauctionAvg168Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionStd168Figure() {
			return fFigureStubauctionStd168Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStubauctionVerboseFigure() {
			return fFigureStubauctionVerboseFigure;
		}

	}

}
