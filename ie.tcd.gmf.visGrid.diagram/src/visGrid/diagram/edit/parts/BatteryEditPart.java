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
public class BatteryEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2069;

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
	public BatteryEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.BatteryItemSemanticEditPolicy());
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
		return primaryShape = new BatteryFigure();
	}

	/**
	 * @generated
	 */
	public BatteryFigure getPrimaryShape() {
		return (BatteryFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.BatteryNameEditPart) {
			((visGrid.diagram.edit.parts.BatteryNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureBatteryNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.BatteryNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.BatteryNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.BatteryConnection_4078) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsBattery_4148) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class BatteryFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryRfb_sizeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryPower_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryPower_set_highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryPower_set_lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryRinternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryV_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryI_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryE_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryEfficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryBase_efficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryV_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryI_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryV_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryI_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryV_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryI_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryI_PrevFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureBatteryPhasesFigure;

		/**
		 * @generated
		 */
		public BatteryFigure() {

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

			fFigureBatteryNameFigure = new WrappingLabel();
			fFigureBatteryNameFigure.setText("<...>");

			this.add(fFigureBatteryNameFigure);

			fFigureBatteryGenerator_modeFigure = new WrappingLabel();
			fFigureBatteryGenerator_modeFigure.setText("<...>");

			this.add(fFigureBatteryGenerator_modeFigure);

			fFigureBatteryGenerator_statusFigure = new WrappingLabel();
			fFigureBatteryGenerator_statusFigure.setText("<...>");

			this.add(fFigureBatteryGenerator_statusFigure);

			fFigureBatteryRfb_sizeFigure = new WrappingLabel();
			fFigureBatteryRfb_sizeFigure.setText("<...>");

			this.add(fFigureBatteryRfb_sizeFigure);

			fFigureBatteryPower_typeFigure = new WrappingLabel();
			fFigureBatteryPower_typeFigure.setText("<...>");

			this.add(fFigureBatteryPower_typeFigure);

			fFigureBatteryPower_set_highFigure = new WrappingLabel();
			fFigureBatteryPower_set_highFigure.setText("<...>");

			this.add(fFigureBatteryPower_set_highFigure);

			fFigureBatteryPower_set_lowFigure = new WrappingLabel();
			fFigureBatteryPower_set_lowFigure.setText("<...>");

			this.add(fFigureBatteryPower_set_lowFigure);

			fFigureBatteryRinternalFigure = new WrappingLabel();
			fFigureBatteryRinternalFigure.setText("<...>");

			this.add(fFigureBatteryRinternalFigure);

			fFigureBatteryV_MaxFigure = new WrappingLabel();
			fFigureBatteryV_MaxFigure.setText("<...>");

			this.add(fFigureBatteryV_MaxFigure);

			fFigureBatteryI_MaxFigure = new WrappingLabel();
			fFigureBatteryI_MaxFigure.setText("<...>");

			this.add(fFigureBatteryI_MaxFigure);

			fFigureBatteryE_MaxFigure = new WrappingLabel();
			fFigureBatteryE_MaxFigure.setText("<...>");

			this.add(fFigureBatteryE_MaxFigure);

			fFigureBatteryEnergyFigure = new WrappingLabel();
			fFigureBatteryEnergyFigure.setText("<...>");

			this.add(fFigureBatteryEnergyFigure);

			fFigureBatteryEfficiencyFigure = new WrappingLabel();
			fFigureBatteryEfficiencyFigure.setText("<...>");

			this.add(fFigureBatteryEfficiencyFigure);

			fFigureBatteryBase_efficiencyFigure = new WrappingLabel();
			fFigureBatteryBase_efficiencyFigure.setText("<...>");

			this.add(fFigureBatteryBase_efficiencyFigure);

			fFigureBatteryRated_kVAFigure = new WrappingLabel();
			fFigureBatteryRated_kVAFigure.setText("<...>");

			this.add(fFigureBatteryRated_kVAFigure);

			fFigureBatteryV_OutFigure = new WrappingLabel();
			fFigureBatteryV_OutFigure.setText("<...>");

			this.add(fFigureBatteryV_OutFigure);

			fFigureBatteryI_OutFigure = new WrappingLabel();
			fFigureBatteryI_OutFigure.setText("<...>");

			this.add(fFigureBatteryI_OutFigure);

			fFigureBatteryVA_OutFigure = new WrappingLabel();
			fFigureBatteryVA_OutFigure.setText("<...>");

			this.add(fFigureBatteryVA_OutFigure);

			fFigureBatteryV_InFigure = new WrappingLabel();
			fFigureBatteryV_InFigure.setText("<...>");

			this.add(fFigureBatteryV_InFigure);

			fFigureBatteryI_InFigure = new WrappingLabel();
			fFigureBatteryI_InFigure.setText("<...>");

			this.add(fFigureBatteryI_InFigure);

			fFigureBatteryV_InternalFigure = new WrappingLabel();
			fFigureBatteryV_InternalFigure.setText("<...>");

			this.add(fFigureBatteryV_InternalFigure);

			fFigureBatteryI_InternalFigure = new WrappingLabel();
			fFigureBatteryI_InternalFigure.setText("<...>");

			this.add(fFigureBatteryI_InternalFigure);

			fFigureBatteryI_PrevFigure = new WrappingLabel();
			fFigureBatteryI_PrevFigure.setText("<...>");

			this.add(fFigureBatteryI_PrevFigure);

			fFigureBatteryPhasesFigure = new WrappingLabel();
			fFigureBatteryPhasesFigure.setText("<...>");

			this.add(fFigureBatteryPhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryNameFigure() {
			return fFigureBatteryNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryGenerator_modeFigure() {
			return fFigureBatteryGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryGenerator_statusFigure() {
			return fFigureBatteryGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryRfb_sizeFigure() {
			return fFigureBatteryRfb_sizeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryPower_typeFigure() {
			return fFigureBatteryPower_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryPower_set_highFigure() {
			return fFigureBatteryPower_set_highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryPower_set_lowFigure() {
			return fFigureBatteryPower_set_lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryRinternalFigure() {
			return fFigureBatteryRinternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryV_MaxFigure() {
			return fFigureBatteryV_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryI_MaxFigure() {
			return fFigureBatteryI_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryE_MaxFigure() {
			return fFigureBatteryE_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryEnergyFigure() {
			return fFigureBatteryEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryEfficiencyFigure() {
			return fFigureBatteryEfficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryBase_efficiencyFigure() {
			return fFigureBatteryBase_efficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryRated_kVAFigure() {
			return fFigureBatteryRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryV_OutFigure() {
			return fFigureBatteryV_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryI_OutFigure() {
			return fFigureBatteryI_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryVA_OutFigure() {
			return fFigureBatteryVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryV_InFigure() {
			return fFigureBatteryV_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryI_InFigure() {
			return fFigureBatteryI_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryV_InternalFigure() {
			return fFigureBatteryV_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryI_InternalFigure() {
			return fFigureBatteryI_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryI_PrevFigure() {
			return fFigureBatteryI_PrevFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureBatteryPhasesFigure() {
			return fFigureBatteryPhasesFigure;
		}

	}

}
