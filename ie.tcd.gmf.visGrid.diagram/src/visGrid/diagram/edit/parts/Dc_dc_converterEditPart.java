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
public class Dc_dc_converterEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2019;

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
	public Dc_dc_converterEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Dc_dc_converterItemSemanticEditPolicy());
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
		return primaryShape = new Dc_dc_converterFigure();
	}

	/**
	 * @generated
	 */
	public Dc_dc_converterFigure getPrimaryShape() {
		return (Dc_dc_converterFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart) {
			((visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDc_dc_converterNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Dc_dc_converterNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Dc_dc_converterConnection_4074) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsDc_dc_converter_4006) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Dc_dc_converterFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterDc_dc_converter_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterV_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterI_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterVdcFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterP_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterQ_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterService_ratioFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterV_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterI_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterVA_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDc_dc_converterPhasesFigure;

		/**
		 * @generated
		 */
		public Dc_dc_converterFigure() {

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

			fFigureDc_dc_converterNameFigure = new WrappingLabel();
			fFigureDc_dc_converterNameFigure.setText("<...>");

			this.add(fFigureDc_dc_converterNameFigure);

			fFigureDc_dc_converterDc_dc_converter_typeFigure = new WrappingLabel();
			fFigureDc_dc_converterDc_dc_converter_typeFigure.setText("<...>");

			this.add(fFigureDc_dc_converterDc_dc_converter_typeFigure);

			fFigureDc_dc_converterGenerator_modeFigure = new WrappingLabel();
			fFigureDc_dc_converterGenerator_modeFigure.setText("<...>");

			this.add(fFigureDc_dc_converterGenerator_modeFigure);

			fFigureDc_dc_converterV_OutFigure = new WrappingLabel();
			fFigureDc_dc_converterV_OutFigure.setText("<...>");

			this.add(fFigureDc_dc_converterV_OutFigure);

			fFigureDc_dc_converterI_OutFigure = new WrappingLabel();
			fFigureDc_dc_converterI_OutFigure.setText("<...>");

			this.add(fFigureDc_dc_converterI_OutFigure);

			fFigureDc_dc_converterVdcFigure = new WrappingLabel();
			fFigureDc_dc_converterVdcFigure.setText("<...>");

			this.add(fFigureDc_dc_converterVdcFigure);

			fFigureDc_dc_converterVA_OutFigure = new WrappingLabel();
			fFigureDc_dc_converterVA_OutFigure.setText("<...>");

			this.add(fFigureDc_dc_converterVA_OutFigure);

			fFigureDc_dc_converterP_OutFigure = new WrappingLabel();
			fFigureDc_dc_converterP_OutFigure.setText("<...>");

			this.add(fFigureDc_dc_converterP_OutFigure);

			fFigureDc_dc_converterQ_OutFigure = new WrappingLabel();
			fFigureDc_dc_converterQ_OutFigure.setText("<...>");

			this.add(fFigureDc_dc_converterQ_OutFigure);

			fFigureDc_dc_converterService_ratioFigure = new WrappingLabel();
			fFigureDc_dc_converterService_ratioFigure.setText("<...>");

			this.add(fFigureDc_dc_converterService_ratioFigure);

			fFigureDc_dc_converterV_InFigure = new WrappingLabel();
			fFigureDc_dc_converterV_InFigure.setText("<...>");

			this.add(fFigureDc_dc_converterV_InFigure);

			fFigureDc_dc_converterI_InFigure = new WrappingLabel();
			fFigureDc_dc_converterI_InFigure.setText("<...>");

			this.add(fFigureDc_dc_converterI_InFigure);

			fFigureDc_dc_converterVA_InFigure = new WrappingLabel();
			fFigureDc_dc_converterVA_InFigure.setText("<...>");

			this.add(fFigureDc_dc_converterVA_InFigure);

			fFigureDc_dc_converterPhasesFigure = new WrappingLabel();
			fFigureDc_dc_converterPhasesFigure.setText("<...>");

			this.add(fFigureDc_dc_converterPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterNameFigure() {
			return fFigureDc_dc_converterNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterDc_dc_converter_typeFigure() {
			return fFigureDc_dc_converterDc_dc_converter_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterGenerator_modeFigure() {
			return fFigureDc_dc_converterGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterV_OutFigure() {
			return fFigureDc_dc_converterV_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterI_OutFigure() {
			return fFigureDc_dc_converterI_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterVdcFigure() {
			return fFigureDc_dc_converterVdcFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterVA_OutFigure() {
			return fFigureDc_dc_converterVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterP_OutFigure() {
			return fFigureDc_dc_converterP_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterQ_OutFigure() {
			return fFigureDc_dc_converterQ_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterService_ratioFigure() {
			return fFigureDc_dc_converterService_ratioFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterV_InFigure() {
			return fFigureDc_dc_converterV_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterI_InFigure() {
			return fFigureDc_dc_converterI_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterVA_InFigure() {
			return fFigureDc_dc_converterVA_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDc_dc_converterPhasesFigure() {
			return fFigureDc_dc_converterPhasesFigure;
		}

	}

}
