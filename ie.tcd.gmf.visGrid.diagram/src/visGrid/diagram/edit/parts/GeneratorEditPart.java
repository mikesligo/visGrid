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
public class GeneratorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2075;

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
	public GeneratorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.GeneratorItemSemanticEditPolicy());
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
		return primaryShape = new GeneratorFigure();
	}

	/**
	 * @generated
	 */
	public GeneratorFigure getPrimaryShape() {
		return (GeneratorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.GeneratorNameEditPart) {
			((visGrid.diagram.edit.parts.GeneratorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureGeneratorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.GeneratorNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.GeneratorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.GeneratorConnection_4099) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsGenerator_4076) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class GeneratorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorPdesired_MWFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQdesired_MVARFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQcontrolledFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorPmax_MWFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQmin_MVARFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQmax_MVARFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQVaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQVbFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorQVcFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureGeneratorStateFigure;

		/**
		 * @generated
		 */
		public GeneratorFigure() {

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

			fFigureGeneratorNameFigure = new WrappingLabel();
			fFigureGeneratorNameFigure.setText("<...>");

			this.add(fFigureGeneratorNameFigure);

			fFigureGeneratorPdesired_MWFigure = new WrappingLabel();
			fFigureGeneratorPdesired_MWFigure.setText("<...>");

			this.add(fFigureGeneratorPdesired_MWFigure);

			fFigureGeneratorQdesired_MVARFigure = new WrappingLabel();
			fFigureGeneratorQdesired_MVARFigure.setText("<...>");

			this.add(fFigureGeneratorQdesired_MVARFigure);

			fFigureGeneratorQcontrolledFigure = new WrappingLabel();
			fFigureGeneratorQcontrolledFigure.setText("<...>");

			this.add(fFigureGeneratorQcontrolledFigure);

			fFigureGeneratorPmax_MWFigure = new WrappingLabel();
			fFigureGeneratorPmax_MWFigure.setText("<...>");

			this.add(fFigureGeneratorPmax_MWFigure);

			fFigureGeneratorQmin_MVARFigure = new WrappingLabel();
			fFigureGeneratorQmin_MVARFigure.setText("<...>");

			this.add(fFigureGeneratorQmin_MVARFigure);

			fFigureGeneratorQmax_MVARFigure = new WrappingLabel();
			fFigureGeneratorQmax_MVARFigure.setText("<...>");

			this.add(fFigureGeneratorQmax_MVARFigure);

			fFigureGeneratorQVaFigure = new WrappingLabel();
			fFigureGeneratorQVaFigure.setText("<...>");

			this.add(fFigureGeneratorQVaFigure);

			fFigureGeneratorQVbFigure = new WrappingLabel();
			fFigureGeneratorQVbFigure.setText("<...>");

			this.add(fFigureGeneratorQVbFigure);

			fFigureGeneratorQVcFigure = new WrappingLabel();
			fFigureGeneratorQVcFigure.setText("<...>");

			this.add(fFigureGeneratorQVcFigure);

			fFigureGeneratorStateFigure = new WrappingLabel();
			fFigureGeneratorStateFigure.setText("<...>");

			this.add(fFigureGeneratorStateFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorNameFigure() {
			return fFigureGeneratorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorPdesired_MWFigure() {
			return fFigureGeneratorPdesired_MWFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQdesired_MVARFigure() {
			return fFigureGeneratorQdesired_MVARFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQcontrolledFigure() {
			return fFigureGeneratorQcontrolledFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorPmax_MWFigure() {
			return fFigureGeneratorPmax_MWFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQmin_MVARFigure() {
			return fFigureGeneratorQmin_MVARFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQmax_MVARFigure() {
			return fFigureGeneratorQmax_MVARFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQVaFigure() {
			return fFigureGeneratorQVaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQVbFigure() {
			return fFigureGeneratorQVbFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorQVcFigure() {
			return fFigureGeneratorQVcFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureGeneratorStateFigure() {
			return fFigureGeneratorStateFigure;
		}

	}

}
