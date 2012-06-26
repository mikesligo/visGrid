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
public class Energy_storageEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2014;

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
	public Energy_storageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Energy_storageItemSemanticEditPolicy());
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
		return primaryShape = new Energy_storageFigure();
	}

	/**
	 * @generated
	 */
	public Energy_storageFigure getPrimaryShape() {
		return (Energy_storageFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Energy_storageNameEditPart) {
			((visGrid.diagram.edit.parts.Energy_storageNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureEnergy_storageNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Energy_storageNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Energy_storageNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Energy_storageConnection_4042) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsEnergy_storage_4005) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Energy_storageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storagePower_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageRinternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageV_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageI_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageE_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageEnergyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageEfficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageV_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageI_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageV_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageI_InFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageV_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageI_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storageI_PrevFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEnergy_storagePhasesFigure;

		/**
		 * @generated
		 */
		public Energy_storageFigure() {

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

			fFigureEnergy_storageNameFigure = new WrappingLabel();
			fFigureEnergy_storageNameFigure.setText("<...>");

			this.add(fFigureEnergy_storageNameFigure);

			fFigureEnergy_storageGenerator_modeFigure = new WrappingLabel();
			fFigureEnergy_storageGenerator_modeFigure.setText("<...>");

			this.add(fFigureEnergy_storageGenerator_modeFigure);

			fFigureEnergy_storageGenerator_statusFigure = new WrappingLabel();
			fFigureEnergy_storageGenerator_statusFigure.setText("<...>");

			this.add(fFigureEnergy_storageGenerator_statusFigure);

			fFigureEnergy_storagePower_typeFigure = new WrappingLabel();
			fFigureEnergy_storagePower_typeFigure.setText("<...>");

			this.add(fFigureEnergy_storagePower_typeFigure);

			fFigureEnergy_storageRinternalFigure = new WrappingLabel();
			fFigureEnergy_storageRinternalFigure.setText("<...>");

			this.add(fFigureEnergy_storageRinternalFigure);

			fFigureEnergy_storageV_MaxFigure = new WrappingLabel();
			fFigureEnergy_storageV_MaxFigure.setText("<...>");

			this.add(fFigureEnergy_storageV_MaxFigure);

			fFigureEnergy_storageI_MaxFigure = new WrappingLabel();
			fFigureEnergy_storageI_MaxFigure.setText("<...>");

			this.add(fFigureEnergy_storageI_MaxFigure);

			fFigureEnergy_storageE_MaxFigure = new WrappingLabel();
			fFigureEnergy_storageE_MaxFigure.setText("<...>");

			this.add(fFigureEnergy_storageE_MaxFigure);

			fFigureEnergy_storageEnergyFigure = new WrappingLabel();
			fFigureEnergy_storageEnergyFigure.setText("<...>");

			this.add(fFigureEnergy_storageEnergyFigure);

			fFigureEnergy_storageEfficiencyFigure = new WrappingLabel();
			fFigureEnergy_storageEfficiencyFigure.setText("<...>");

			this.add(fFigureEnergy_storageEfficiencyFigure);

			fFigureEnergy_storageRated_kVAFigure = new WrappingLabel();
			fFigureEnergy_storageRated_kVAFigure.setText("<...>");

			this.add(fFigureEnergy_storageRated_kVAFigure);

			fFigureEnergy_storageV_OutFigure = new WrappingLabel();
			fFigureEnergy_storageV_OutFigure.setText("<...>");

			this.add(fFigureEnergy_storageV_OutFigure);

			fFigureEnergy_storageI_OutFigure = new WrappingLabel();
			fFigureEnergy_storageI_OutFigure.setText("<...>");

			this.add(fFigureEnergy_storageI_OutFigure);

			fFigureEnergy_storageVA_OutFigure = new WrappingLabel();
			fFigureEnergy_storageVA_OutFigure.setText("<...>");

			this.add(fFigureEnergy_storageVA_OutFigure);

			fFigureEnergy_storageV_InFigure = new WrappingLabel();
			fFigureEnergy_storageV_InFigure.setText("<...>");

			this.add(fFigureEnergy_storageV_InFigure);

			fFigureEnergy_storageI_InFigure = new WrappingLabel();
			fFigureEnergy_storageI_InFigure.setText("<...>");

			this.add(fFigureEnergy_storageI_InFigure);

			fFigureEnergy_storageV_InternalFigure = new WrappingLabel();
			fFigureEnergy_storageV_InternalFigure.setText("<...>");

			this.add(fFigureEnergy_storageV_InternalFigure);

			fFigureEnergy_storageI_InternalFigure = new WrappingLabel();
			fFigureEnergy_storageI_InternalFigure.setText("<...>");

			this.add(fFigureEnergy_storageI_InternalFigure);

			fFigureEnergy_storageI_PrevFigure = new WrappingLabel();
			fFigureEnergy_storageI_PrevFigure.setText("<...>");

			this.add(fFigureEnergy_storageI_PrevFigure);

			fFigureEnergy_storagePhasesFigure = new WrappingLabel();
			fFigureEnergy_storagePhasesFigure.setText("<...>");

			this.add(fFigureEnergy_storagePhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageNameFigure() {
			return fFigureEnergy_storageNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageGenerator_modeFigure() {
			return fFigureEnergy_storageGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageGenerator_statusFigure() {
			return fFigureEnergy_storageGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storagePower_typeFigure() {
			return fFigureEnergy_storagePower_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageRinternalFigure() {
			return fFigureEnergy_storageRinternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageV_MaxFigure() {
			return fFigureEnergy_storageV_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageI_MaxFigure() {
			return fFigureEnergy_storageI_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageE_MaxFigure() {
			return fFigureEnergy_storageE_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageEnergyFigure() {
			return fFigureEnergy_storageEnergyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageEfficiencyFigure() {
			return fFigureEnergy_storageEfficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageRated_kVAFigure() {
			return fFigureEnergy_storageRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageV_OutFigure() {
			return fFigureEnergy_storageV_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageI_OutFigure() {
			return fFigureEnergy_storageI_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageVA_OutFigure() {
			return fFigureEnergy_storageVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageV_InFigure() {
			return fFigureEnergy_storageV_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageI_InFigure() {
			return fFigureEnergy_storageI_InFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageV_InternalFigure() {
			return fFigureEnergy_storageV_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageI_InternalFigure() {
			return fFigureEnergy_storageI_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storageI_PrevFigure() {
			return fFigureEnergy_storageI_PrevFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEnergy_storagePhasesFigure() {
			return fFigureEnergy_storagePhasesFigure;
		}

	}

}
