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
public class Triplex_line_configurationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2076;

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
	public Triplex_line_configurationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Triplex_line_configurationItemSemanticEditPolicy());
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
		return primaryShape = new Triplex_line_configurationFigure();
	}

	/**
	 * @generated
	 */
	public Triplex_line_configurationFigure getPrimaryShape() {
		return (Triplex_line_configurationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart) {
			((visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTriplex_line_configurationNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Triplex_line_configurationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Triplex_line_configurationConnection_4126) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTriplex_line_configuration_4147) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Triplex_line_configurationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationConductor_1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationConductor_2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationConductor_NFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationInsulation_thicknessFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationDiameterFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTriplex_line_configurationSpacingFigure;

		/**
		 * @generated
		 */
		public Triplex_line_configurationFigure() {

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

			fFigureTriplex_line_configurationNameFigure = new WrappingLabel();
			fFigureTriplex_line_configurationNameFigure.setText("<...>");

			this.add(fFigureTriplex_line_configurationNameFigure);

			fFigureTriplex_line_configurationConductor_1Figure = new WrappingLabel();
			fFigureTriplex_line_configurationConductor_1Figure.setText("<...>");

			this.add(fFigureTriplex_line_configurationConductor_1Figure);

			fFigureTriplex_line_configurationConductor_2Figure = new WrappingLabel();
			fFigureTriplex_line_configurationConductor_2Figure.setText("<...>");

			this.add(fFigureTriplex_line_configurationConductor_2Figure);

			fFigureTriplex_line_configurationConductor_NFigure = new WrappingLabel();
			fFigureTriplex_line_configurationConductor_NFigure.setText("<...>");

			this.add(fFigureTriplex_line_configurationConductor_NFigure);

			fFigureTriplex_line_configurationInsulation_thicknessFigure = new WrappingLabel();
			fFigureTriplex_line_configurationInsulation_thicknessFigure
					.setText("<...>");

			this.add(fFigureTriplex_line_configurationInsulation_thicknessFigure);

			fFigureTriplex_line_configurationDiameterFigure = new WrappingLabel();
			fFigureTriplex_line_configurationDiameterFigure.setText("<...>");

			this.add(fFigureTriplex_line_configurationDiameterFigure);

			fFigureTriplex_line_configurationSpacingFigure = new WrappingLabel();
			fFigureTriplex_line_configurationSpacingFigure.setText("<...>");

			this.add(fFigureTriplex_line_configurationSpacingFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationNameFigure() {
			return fFigureTriplex_line_configurationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationConductor_1Figure() {
			return fFigureTriplex_line_configurationConductor_1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationConductor_2Figure() {
			return fFigureTriplex_line_configurationConductor_2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationConductor_NFigure() {
			return fFigureTriplex_line_configurationConductor_NFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationInsulation_thicknessFigure() {
			return fFigureTriplex_line_configurationInsulation_thicknessFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationDiameterFigure() {
			return fFigureTriplex_line_configurationDiameterFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTriplex_line_configurationSpacingFigure() {
			return fFigureTriplex_line_configurationSpacingFigure;
		}

	}

}
