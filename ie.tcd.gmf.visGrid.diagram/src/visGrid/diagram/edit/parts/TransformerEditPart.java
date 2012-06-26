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
public class TransformerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2035;

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
	public TransformerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.TransformerItemSemanticEditPolicy());
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
		return primaryShape = new Transformer_configurationFigure();
	}

	/**
	 * @generated
	 */
	public Transformer_configurationFigure getPrimaryShape() {
		return (Transformer_configurationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.TransformerNameEditPart) {
			((visGrid.diagram.edit.parts.TransformerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureTransformer_configurationNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.TransformerNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.TransformerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.TransformerConnection_4040) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsTransformer_4118) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Transformer_configurationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationConnect_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationInstall_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPrimary_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationSecondary_voltageFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPower_ratingFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPowerA_ratingFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPowerB_ratingFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationPowerC_ratingFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationResistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationReactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationImpedanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationResistance1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationReactance1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationImpedance1Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationResistance2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationReactance2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationImpedance2Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationShunt_resistanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationShunt_reactanceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTransformer_configurationShunt_impedanceFigure;

		/**
		 * @generated
		 */
		public Transformer_configurationFigure() {

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

			fFigureTransformer_configurationNameFigure = new WrappingLabel();
			fFigureTransformer_configurationNameFigure.setText("<...>");

			this.add(fFigureTransformer_configurationNameFigure);

			fFigureTransformer_configurationConnect_typeFigure = new WrappingLabel();
			fFigureTransformer_configurationConnect_typeFigure.setText("<...>");

			this.add(fFigureTransformer_configurationConnect_typeFigure);

			fFigureTransformer_configurationInstall_typeFigure = new WrappingLabel();
			fFigureTransformer_configurationInstall_typeFigure.setText("<...>");

			this.add(fFigureTransformer_configurationInstall_typeFigure);

			fFigureTransformer_configurationPrimary_voltageFigure = new WrappingLabel();
			fFigureTransformer_configurationPrimary_voltageFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationPrimary_voltageFigure);

			fFigureTransformer_configurationSecondary_voltageFigure = new WrappingLabel();
			fFigureTransformer_configurationSecondary_voltageFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationSecondary_voltageFigure);

			fFigureTransformer_configurationPower_ratingFigure = new WrappingLabel();
			fFigureTransformer_configurationPower_ratingFigure.setText("<...>");

			this.add(fFigureTransformer_configurationPower_ratingFigure);

			fFigureTransformer_configurationPowerA_ratingFigure = new WrappingLabel();
			fFigureTransformer_configurationPowerA_ratingFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationPowerA_ratingFigure);

			fFigureTransformer_configurationPowerB_ratingFigure = new WrappingLabel();
			fFigureTransformer_configurationPowerB_ratingFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationPowerB_ratingFigure);

			fFigureTransformer_configurationPowerC_ratingFigure = new WrappingLabel();
			fFigureTransformer_configurationPowerC_ratingFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationPowerC_ratingFigure);

			fFigureTransformer_configurationResistanceFigure = new WrappingLabel();
			fFigureTransformer_configurationResistanceFigure.setText("<...>");

			this.add(fFigureTransformer_configurationResistanceFigure);

			fFigureTransformer_configurationReactanceFigure = new WrappingLabel();
			fFigureTransformer_configurationReactanceFigure.setText("<...>");

			this.add(fFigureTransformer_configurationReactanceFigure);

			fFigureTransformer_configurationImpedanceFigure = new WrappingLabel();
			fFigureTransformer_configurationImpedanceFigure.setText("<...>");

			this.add(fFigureTransformer_configurationImpedanceFigure);

			fFigureTransformer_configurationResistance1Figure = new WrappingLabel();
			fFigureTransformer_configurationResistance1Figure.setText("<...>");

			this.add(fFigureTransformer_configurationResistance1Figure);

			fFigureTransformer_configurationReactance1Figure = new WrappingLabel();
			fFigureTransformer_configurationReactance1Figure.setText("<...>");

			this.add(fFigureTransformer_configurationReactance1Figure);

			fFigureTransformer_configurationImpedance1Figure = new WrappingLabel();
			fFigureTransformer_configurationImpedance1Figure.setText("<...>");

			this.add(fFigureTransformer_configurationImpedance1Figure);

			fFigureTransformer_configurationResistance2Figure = new WrappingLabel();
			fFigureTransformer_configurationResistance2Figure.setText("<...>");

			this.add(fFigureTransformer_configurationResistance2Figure);

			fFigureTransformer_configurationReactance2Figure = new WrappingLabel();
			fFigureTransformer_configurationReactance2Figure.setText("<...>");

			this.add(fFigureTransformer_configurationReactance2Figure);

			fFigureTransformer_configurationImpedance2Figure = new WrappingLabel();
			fFigureTransformer_configurationImpedance2Figure.setText("<...>");

			this.add(fFigureTransformer_configurationImpedance2Figure);

			fFigureTransformer_configurationShunt_resistanceFigure = new WrappingLabel();
			fFigureTransformer_configurationShunt_resistanceFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationShunt_resistanceFigure);

			fFigureTransformer_configurationShunt_reactanceFigure = new WrappingLabel();
			fFigureTransformer_configurationShunt_reactanceFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationShunt_reactanceFigure);

			fFigureTransformer_configurationShunt_impedanceFigure = new WrappingLabel();
			fFigureTransformer_configurationShunt_impedanceFigure
					.setText("<...>");

			this.add(fFigureTransformer_configurationShunt_impedanceFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationNameFigure() {
			return fFigureTransformer_configurationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationConnect_typeFigure() {
			return fFigureTransformer_configurationConnect_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationInstall_typeFigure() {
			return fFigureTransformer_configurationInstall_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPrimary_voltageFigure() {
			return fFigureTransformer_configurationPrimary_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationSecondary_voltageFigure() {
			return fFigureTransformer_configurationSecondary_voltageFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPower_ratingFigure() {
			return fFigureTransformer_configurationPower_ratingFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPowerA_ratingFigure() {
			return fFigureTransformer_configurationPowerA_ratingFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPowerB_ratingFigure() {
			return fFigureTransformer_configurationPowerB_ratingFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationPowerC_ratingFigure() {
			return fFigureTransformer_configurationPowerC_ratingFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationResistanceFigure() {
			return fFigureTransformer_configurationResistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationReactanceFigure() {
			return fFigureTransformer_configurationReactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationImpedanceFigure() {
			return fFigureTransformer_configurationImpedanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationResistance1Figure() {
			return fFigureTransformer_configurationResistance1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationReactance1Figure() {
			return fFigureTransformer_configurationReactance1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationImpedance1Figure() {
			return fFigureTransformer_configurationImpedance1Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationResistance2Figure() {
			return fFigureTransformer_configurationResistance2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationReactance2Figure() {
			return fFigureTransformer_configurationReactance2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationImpedance2Figure() {
			return fFigureTransformer_configurationImpedance2Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationShunt_resistanceFigure() {
			return fFigureTransformer_configurationShunt_resistanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationShunt_reactanceFigure() {
			return fFigureTransformer_configurationShunt_reactanceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTransformer_configurationShunt_impedanceFigure() {
			return fFigureTransformer_configurationShunt_impedanceFigure;
		}

	}

}
