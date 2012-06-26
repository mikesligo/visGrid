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
public class AuctionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2025;

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
	public AuctionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.AuctionItemSemanticEditPolicy());
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
		return primaryShape = new AuctionFigure();
	}

	/**
	 * @generated
	 */
	public AuctionFigure getPrimaryShape() {
		return (AuctionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.AuctionNameEditPart) {
			((visGrid.diagram.edit.parts.AuctionNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureAuctionNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.AuctionNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.AuctionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.AuctionConnection_4138) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsAuction_4028) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class AuctionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionUnitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionPeriodFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionLatencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionMarket_idFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionLast__QFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionLast__PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionNext__QFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionNext__PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionAvg24Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionStd24Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionAvg72Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionStd72Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionAvg168Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionStd168Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionNetworkFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureAuctionVerboseFigure;

		/**
		 * @generated
		 */
		public AuctionFigure() {

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

			fFigureAuctionNameFigure = new WrappingLabel();
			fFigureAuctionNameFigure.setText("<...>");

			this.add(fFigureAuctionNameFigure);

			fFigureAuctionTypeFigure = new WrappingLabel();
			fFigureAuctionTypeFigure.setText("<...>");

			this.add(fFigureAuctionTypeFigure);

			fFigureAuctionUnitFigure = new WrappingLabel();
			fFigureAuctionUnitFigure.setText("<...>");

			this.add(fFigureAuctionUnitFigure);

			fFigureAuctionPeriodFigure = new WrappingLabel();
			fFigureAuctionPeriodFigure.setText("<...>");

			this.add(fFigureAuctionPeriodFigure);

			fFigureAuctionLatencyFigure = new WrappingLabel();
			fFigureAuctionLatencyFigure.setText("<...>");

			this.add(fFigureAuctionLatencyFigure);

			fFigureAuctionMarket_idFigure = new WrappingLabel();
			fFigureAuctionMarket_idFigure.setText("<...>");

			this.add(fFigureAuctionMarket_idFigure);

			fFigureAuctionLast__QFigure = new WrappingLabel();
			fFigureAuctionLast__QFigure.setText("<...>");

			this.add(fFigureAuctionLast__QFigure);

			fFigureAuctionLast__PFigure = new WrappingLabel();
			fFigureAuctionLast__PFigure.setText("<...>");

			this.add(fFigureAuctionLast__PFigure);

			fFigureAuctionNext__QFigure = new WrappingLabel();
			fFigureAuctionNext__QFigure.setText("<...>");

			this.add(fFigureAuctionNext__QFigure);

			fFigureAuctionNext__PFigure = new WrappingLabel();
			fFigureAuctionNext__PFigure.setText("<...>");

			this.add(fFigureAuctionNext__PFigure);

			fFigureAuctionAvg24Figure = new WrappingLabel();
			fFigureAuctionAvg24Figure.setText("<...>");

			this.add(fFigureAuctionAvg24Figure);

			fFigureAuctionStd24Figure = new WrappingLabel();
			fFigureAuctionStd24Figure.setText("<...>");

			this.add(fFigureAuctionStd24Figure);

			fFigureAuctionAvg72Figure = new WrappingLabel();
			fFigureAuctionAvg72Figure.setText("<...>");

			this.add(fFigureAuctionAvg72Figure);

			fFigureAuctionStd72Figure = new WrappingLabel();
			fFigureAuctionStd72Figure.setText("<...>");

			this.add(fFigureAuctionStd72Figure);

			fFigureAuctionAvg168Figure = new WrappingLabel();
			fFigureAuctionAvg168Figure.setText("<...>");

			this.add(fFigureAuctionAvg168Figure);

			fFigureAuctionStd168Figure = new WrappingLabel();
			fFigureAuctionStd168Figure.setText("<...>");

			this.add(fFigureAuctionStd168Figure);

			fFigureAuctionNetworkFigure = new WrappingLabel();
			fFigureAuctionNetworkFigure.setText("<...>");

			this.add(fFigureAuctionNetworkFigure);

			fFigureAuctionVerboseFigure = new WrappingLabel();
			fFigureAuctionVerboseFigure.setText("<...>");

			this.add(fFigureAuctionVerboseFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionNameFigure() {
			return fFigureAuctionNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionTypeFigure() {
			return fFigureAuctionTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionUnitFigure() {
			return fFigureAuctionUnitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionPeriodFigure() {
			return fFigureAuctionPeriodFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionLatencyFigure() {
			return fFigureAuctionLatencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionMarket_idFigure() {
			return fFigureAuctionMarket_idFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionLast__QFigure() {
			return fFigureAuctionLast__QFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionLast__PFigure() {
			return fFigureAuctionLast__PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionNext__QFigure() {
			return fFigureAuctionNext__QFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionNext__PFigure() {
			return fFigureAuctionNext__PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionAvg24Figure() {
			return fFigureAuctionAvg24Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionStd24Figure() {
			return fFigureAuctionStd24Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionAvg72Figure() {
			return fFigureAuctionAvg72Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionStd72Figure() {
			return fFigureAuctionStd72Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionAvg168Figure() {
			return fFigureAuctionAvg168Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionStd168Figure() {
			return fFigureAuctionStd168Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionNetworkFigure() {
			return fFigureAuctionNetworkFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureAuctionVerboseFigure() {
			return fFigureAuctionVerboseFigure;
		}

	}

}
