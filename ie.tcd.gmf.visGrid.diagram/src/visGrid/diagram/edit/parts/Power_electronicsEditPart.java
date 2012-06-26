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
public class Power_electronicsEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2033;

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
	public Power_electronicsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Power_electronicsItemSemanticEditPolicy());
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
		return primaryShape = new Power_electronicsFigure();
	}

	/**
	 * @generated
	 */
	public Power_electronicsFigure getPrimaryShape() {
		return (Power_electronicsFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsNameEditPart) {
			((visGrid.diagram.edit.parts.Power_electronicsNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigurePower_electronicsNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Power_electronicsNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Power_electronicsNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Power_electronicsConnection_4135) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsPower_electronics_4061) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Power_electronicsFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsConverter_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsSwitch_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsFilter_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsFilter_implementationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsFilter_frequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsPower_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsRated_kWFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsMax_PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsMin_PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsRated_kVFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePower_electronicsPhasesFigure;

		/**
		 * @generated
		 */
		public Power_electronicsFigure() {

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

			fFigurePower_electronicsNameFigure = new WrappingLabel();
			fFigurePower_electronicsNameFigure.setText("<...>");

			this.add(fFigurePower_electronicsNameFigure);

			fFigurePower_electronicsGenerator_modeFigure = new WrappingLabel();
			fFigurePower_electronicsGenerator_modeFigure.setText("<...>");

			this.add(fFigurePower_electronicsGenerator_modeFigure);

			fFigurePower_electronicsGenerator_statusFigure = new WrappingLabel();
			fFigurePower_electronicsGenerator_statusFigure.setText("<...>");

			this.add(fFigurePower_electronicsGenerator_statusFigure);

			fFigurePower_electronicsConverter_typeFigure = new WrappingLabel();
			fFigurePower_electronicsConverter_typeFigure.setText("<...>");

			this.add(fFigurePower_electronicsConverter_typeFigure);

			fFigurePower_electronicsSwitch_typeFigure = new WrappingLabel();
			fFigurePower_electronicsSwitch_typeFigure.setText("<...>");

			this.add(fFigurePower_electronicsSwitch_typeFigure);

			fFigurePower_electronicsFilter_typeFigure = new WrappingLabel();
			fFigurePower_electronicsFilter_typeFigure.setText("<...>");

			this.add(fFigurePower_electronicsFilter_typeFigure);

			fFigurePower_electronicsFilter_implementationFigure = new WrappingLabel();
			fFigurePower_electronicsFilter_implementationFigure
					.setText("<...>");

			this.add(fFigurePower_electronicsFilter_implementationFigure);

			fFigurePower_electronicsFilter_frequencyFigure = new WrappingLabel();
			fFigurePower_electronicsFilter_frequencyFigure.setText("<...>");

			this.add(fFigurePower_electronicsFilter_frequencyFigure);

			fFigurePower_electronicsPower_typeFigure = new WrappingLabel();
			fFigurePower_electronicsPower_typeFigure.setText("<...>");

			this.add(fFigurePower_electronicsPower_typeFigure);

			fFigurePower_electronicsRated_kWFigure = new WrappingLabel();
			fFigurePower_electronicsRated_kWFigure.setText("<...>");

			this.add(fFigurePower_electronicsRated_kWFigure);

			fFigurePower_electronicsMax_PFigure = new WrappingLabel();
			fFigurePower_electronicsMax_PFigure.setText("<...>");

			this.add(fFigurePower_electronicsMax_PFigure);

			fFigurePower_electronicsMin_PFigure = new WrappingLabel();
			fFigurePower_electronicsMin_PFigure.setText("<...>");

			this.add(fFigurePower_electronicsMin_PFigure);

			fFigurePower_electronicsRated_kVAFigure = new WrappingLabel();
			fFigurePower_electronicsRated_kVAFigure.setText("<...>");

			this.add(fFigurePower_electronicsRated_kVAFigure);

			fFigurePower_electronicsRated_kVFigure = new WrappingLabel();
			fFigurePower_electronicsRated_kVFigure.setText("<...>");

			this.add(fFigurePower_electronicsRated_kVFigure);

			fFigurePower_electronicsPhasesFigure = new WrappingLabel();
			fFigurePower_electronicsPhasesFigure.setText("<...>");

			this.add(fFigurePower_electronicsPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsNameFigure() {
			return fFigurePower_electronicsNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsGenerator_modeFigure() {
			return fFigurePower_electronicsGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsGenerator_statusFigure() {
			return fFigurePower_electronicsGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsConverter_typeFigure() {
			return fFigurePower_electronicsConverter_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsSwitch_typeFigure() {
			return fFigurePower_electronicsSwitch_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsFilter_typeFigure() {
			return fFigurePower_electronicsFilter_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsFilter_implementationFigure() {
			return fFigurePower_electronicsFilter_implementationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsFilter_frequencyFigure() {
			return fFigurePower_electronicsFilter_frequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsPower_typeFigure() {
			return fFigurePower_electronicsPower_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsRated_kWFigure() {
			return fFigurePower_electronicsRated_kWFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsMax_PFigure() {
			return fFigurePower_electronicsMax_PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsMin_PFigure() {
			return fFigurePower_electronicsMin_PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsRated_kVAFigure() {
			return fFigurePower_electronicsRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsRated_kVFigure() {
			return fFigurePower_electronicsRated_kVFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePower_electronicsPhasesFigure() {
			return fFigurePower_electronicsPhasesFigure;
		}

	}

}
