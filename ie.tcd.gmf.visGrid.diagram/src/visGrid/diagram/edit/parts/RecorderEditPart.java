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
public class RecorderEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2064;

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
	public RecorderEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.RecorderItemSemanticEditPolicy());
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
		return primaryShape = new RecorderFigure();
	}

	/**
	 * @generated
	 */
	public RecorderFigure getPrimaryShape() {
		return (RecorderFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RecorderNameEditPart) {
			((visGrid.diagram.edit.parts.RecorderNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRecorderNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.RecorderNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.RecorderNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.RecorderConnection_4103) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsRecorder_4081) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class RecorderFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderPropertyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderTriggerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderFileFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderLimitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderPlotcommandsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderXdataFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderColumnsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderIntervalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRecorderOutputFigure;

		/**
		 * @generated
		 */
		public RecorderFigure() {

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

			fFigureRecorderNameFigure = new WrappingLabel();
			fFigureRecorderNameFigure.setText("<...>");

			this.add(fFigureRecorderNameFigure);

			fFigureRecorderPropertyFigure = new WrappingLabel();
			fFigureRecorderPropertyFigure.setText("<...>");

			this.add(fFigureRecorderPropertyFigure);

			fFigureRecorderTriggerFigure = new WrappingLabel();
			fFigureRecorderTriggerFigure.setText("<...>");

			this.add(fFigureRecorderTriggerFigure);

			fFigureRecorderFileFigure = new WrappingLabel();
			fFigureRecorderFileFigure.setText("<...>");

			this.add(fFigureRecorderFileFigure);

			fFigureRecorderLimitFigure = new WrappingLabel();
			fFigureRecorderLimitFigure.setText("<...>");

			this.add(fFigureRecorderLimitFigure);

			fFigureRecorderPlotcommandsFigure = new WrappingLabel();
			fFigureRecorderPlotcommandsFigure.setText("<...>");

			this.add(fFigureRecorderPlotcommandsFigure);

			fFigureRecorderXdataFigure = new WrappingLabel();
			fFigureRecorderXdataFigure.setText("<...>");

			this.add(fFigureRecorderXdataFigure);

			fFigureRecorderColumnsFigure = new WrappingLabel();
			fFigureRecorderColumnsFigure.setText("<...>");

			this.add(fFigureRecorderColumnsFigure);

			fFigureRecorderIntervalFigure = new WrappingLabel();
			fFigureRecorderIntervalFigure.setText("<...>");

			this.add(fFigureRecorderIntervalFigure);

			fFigureRecorderOutputFigure = new WrappingLabel();
			fFigureRecorderOutputFigure.setText("<...>");

			this.add(fFigureRecorderOutputFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderNameFigure() {
			return fFigureRecorderNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderPropertyFigure() {
			return fFigureRecorderPropertyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderTriggerFigure() {
			return fFigureRecorderTriggerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderFileFigure() {
			return fFigureRecorderFileFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderLimitFigure() {
			return fFigureRecorderLimitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderPlotcommandsFigure() {
			return fFigureRecorderPlotcommandsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderXdataFigure() {
			return fFigureRecorderXdataFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderColumnsFigure() {
			return fFigureRecorderColumnsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderIntervalFigure() {
			return fFigureRecorderIntervalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRecorderOutputFigure() {
			return fFigureRecorderOutputFigure;
		}

	}

}
