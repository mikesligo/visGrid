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
public class SolarEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2026;

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
	public SolarEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.SolarItemSemanticEditPolicy());
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
		return primaryShape = new SolarFigure();
	}

	/**
	 * @generated
	 */
	public SolarFigure getPrimaryShape() {
		return (SolarFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.SolarNameEditPart) {
			((visGrid.diagram.edit.parts.SolarNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSolarNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.SolarNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.SolarNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.SolarConnection_4025) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsSolar_4068) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class SolarFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarPanel_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarPower_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarNoctFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarTcellFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarTambientFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarInsolationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarRinternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarRated_InsolationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarV_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarVoc_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarVocFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarEfficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarAreaFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarV_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarI_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSolarPhasesFigure;

		/**
		 * @generated
		 */
		public SolarFigure() {

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

			fFigureSolarNameFigure = new WrappingLabel();
			fFigureSolarNameFigure.setText("<...>");

			this.add(fFigureSolarNameFigure);

			fFigureSolarGenerator_modeFigure = new WrappingLabel();
			fFigureSolarGenerator_modeFigure.setText("<...>");

			this.add(fFigureSolarGenerator_modeFigure);

			fFigureSolarGenerator_statusFigure = new WrappingLabel();
			fFigureSolarGenerator_statusFigure.setText("<...>");

			this.add(fFigureSolarGenerator_statusFigure);

			fFigureSolarPanel_typeFigure = new WrappingLabel();
			fFigureSolarPanel_typeFigure.setText("<...>");

			this.add(fFigureSolarPanel_typeFigure);

			fFigureSolarPower_typeFigure = new WrappingLabel();
			fFigureSolarPower_typeFigure.setText("<...>");

			this.add(fFigureSolarPower_typeFigure);

			fFigureSolarNoctFigure = new WrappingLabel();
			fFigureSolarNoctFigure.setText("<...>");

			this.add(fFigureSolarNoctFigure);

			fFigureSolarTcellFigure = new WrappingLabel();
			fFigureSolarTcellFigure.setText("<...>");

			this.add(fFigureSolarTcellFigure);

			fFigureSolarTambientFigure = new WrappingLabel();
			fFigureSolarTambientFigure.setText("<...>");

			this.add(fFigureSolarTambientFigure);

			fFigureSolarInsolationFigure = new WrappingLabel();
			fFigureSolarInsolationFigure.setText("<...>");

			this.add(fFigureSolarInsolationFigure);

			fFigureSolarRinternalFigure = new WrappingLabel();
			fFigureSolarRinternalFigure.setText("<...>");

			this.add(fFigureSolarRinternalFigure);

			fFigureSolarRated_InsolationFigure = new WrappingLabel();
			fFigureSolarRated_InsolationFigure.setText("<...>");

			this.add(fFigureSolarRated_InsolationFigure);

			fFigureSolarV_MaxFigure = new WrappingLabel();
			fFigureSolarV_MaxFigure.setText("<...>");

			this.add(fFigureSolarV_MaxFigure);

			fFigureSolarVoc_MaxFigure = new WrappingLabel();
			fFigureSolarVoc_MaxFigure.setText("<...>");

			this.add(fFigureSolarVoc_MaxFigure);

			fFigureSolarVocFigure = new WrappingLabel();
			fFigureSolarVocFigure.setText("<...>");

			this.add(fFigureSolarVocFigure);

			fFigureSolarEfficiencyFigure = new WrappingLabel();
			fFigureSolarEfficiencyFigure.setText("<...>");

			this.add(fFigureSolarEfficiencyFigure);

			fFigureSolarAreaFigure = new WrappingLabel();
			fFigureSolarAreaFigure.setText("<...>");

			this.add(fFigureSolarAreaFigure);

			fFigureSolarRated_kVAFigure = new WrappingLabel();
			fFigureSolarRated_kVAFigure.setText("<...>");

			this.add(fFigureSolarRated_kVAFigure);

			fFigureSolarV_OutFigure = new WrappingLabel();
			fFigureSolarV_OutFigure.setText("<...>");

			this.add(fFigureSolarV_OutFigure);

			fFigureSolarI_OutFigure = new WrappingLabel();
			fFigureSolarI_OutFigure.setText("<...>");

			this.add(fFigureSolarI_OutFigure);

			fFigureSolarVA_OutFigure = new WrappingLabel();
			fFigureSolarVA_OutFigure.setText("<...>");

			this.add(fFigureSolarVA_OutFigure);

			fFigureSolarPhasesFigure = new WrappingLabel();
			fFigureSolarPhasesFigure.setText("<...>");

			this.add(fFigureSolarPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarNameFigure() {
			return fFigureSolarNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarGenerator_modeFigure() {
			return fFigureSolarGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarGenerator_statusFigure() {
			return fFigureSolarGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarPanel_typeFigure() {
			return fFigureSolarPanel_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarPower_typeFigure() {
			return fFigureSolarPower_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarNoctFigure() {
			return fFigureSolarNoctFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarTcellFigure() {
			return fFigureSolarTcellFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarTambientFigure() {
			return fFigureSolarTambientFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarInsolationFigure() {
			return fFigureSolarInsolationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarRinternalFigure() {
			return fFigureSolarRinternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarRated_InsolationFigure() {
			return fFigureSolarRated_InsolationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarV_MaxFigure() {
			return fFigureSolarV_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarVoc_MaxFigure() {
			return fFigureSolarVoc_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarVocFigure() {
			return fFigureSolarVocFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarEfficiencyFigure() {
			return fFigureSolarEfficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarAreaFigure() {
			return fFigureSolarAreaFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarRated_kVAFigure() {
			return fFigureSolarRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarV_OutFigure() {
			return fFigureSolarV_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarI_OutFigure() {
			return fFigureSolarI_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarVA_OutFigure() {
			return fFigureSolarVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSolarPhasesFigure() {
			return fFigureSolarPhasesFigure;
		}

	}

}
