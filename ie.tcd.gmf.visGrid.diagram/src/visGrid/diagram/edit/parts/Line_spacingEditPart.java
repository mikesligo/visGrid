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
public class Line_spacingEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public Line_spacingEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Line_spacingItemSemanticEditPolicy());
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
		return primaryShape = new Line_spacingFigure();
	}

	/**
	 * @generated
	 */
	public Line_spacingFigure getPrimaryShape() {
		return (Line_spacingFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Line_spacingNameEditPart) {
			((visGrid.diagram.edit.parts.Line_spacingNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLine_spacingNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Line_spacingNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Line_spacingNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Line_spacingConnection_4125) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsLine_spacing_4051) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Line_spacingFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingDistance_ABFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingDistance_BCFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingDistance_ACFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingDistance_ANFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingDistance_BNFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLine_spacingDistance_CNFigure;

		/**
		 * @generated
		 */
		public Line_spacingFigure() {

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

			fFigureLine_spacingNameFigure = new WrappingLabel();
			fFigureLine_spacingNameFigure.setText("<...>");

			this.add(fFigureLine_spacingNameFigure);

			fFigureLine_spacingDistance_ABFigure = new WrappingLabel();
			fFigureLine_spacingDistance_ABFigure.setText("<...>");

			this.add(fFigureLine_spacingDistance_ABFigure);

			fFigureLine_spacingDistance_BCFigure = new WrappingLabel();
			fFigureLine_spacingDistance_BCFigure.setText("<...>");

			this.add(fFigureLine_spacingDistance_BCFigure);

			fFigureLine_spacingDistance_ACFigure = new WrappingLabel();
			fFigureLine_spacingDistance_ACFigure.setText("<...>");

			this.add(fFigureLine_spacingDistance_ACFigure);

			fFigureLine_spacingDistance_ANFigure = new WrappingLabel();
			fFigureLine_spacingDistance_ANFigure.setText("<...>");

			this.add(fFigureLine_spacingDistance_ANFigure);

			fFigureLine_spacingDistance_BNFigure = new WrappingLabel();
			fFigureLine_spacingDistance_BNFigure.setText("<...>");

			this.add(fFigureLine_spacingDistance_BNFigure);

			fFigureLine_spacingDistance_CNFigure = new WrappingLabel();
			fFigureLine_spacingDistance_CNFigure.setText("<...>");

			this.add(fFigureLine_spacingDistance_CNFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingNameFigure() {
			return fFigureLine_spacingNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingDistance_ABFigure() {
			return fFigureLine_spacingDistance_ABFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingDistance_BCFigure() {
			return fFigureLine_spacingDistance_BCFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingDistance_ACFigure() {
			return fFigureLine_spacingDistance_ACFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingDistance_ANFigure() {
			return fFigureLine_spacingDistance_ANFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingDistance_BNFigure() {
			return fFigureLine_spacingDistance_BNFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLine_spacingDistance_CNFigure() {
			return fFigureLine_spacingDistance_CNFigure;
		}

	}

}
