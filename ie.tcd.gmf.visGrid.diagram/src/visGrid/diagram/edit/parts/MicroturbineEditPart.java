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
public class MicroturbineEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2024;

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
	public MicroturbineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.MicroturbineItemSemanticEditPolicy());
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
		return primaryShape = new MicroturbineFigure();
	}

	/**
	 * @generated
	 */
	public MicroturbineFigure getPrimaryShape() {
		return (MicroturbineFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MicroturbineNameEditPart) {
			((visGrid.diagram.edit.parts.MicroturbineNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMicroturbineNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.MicroturbineNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.MicroturbineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.MicroturbineConnection_4034) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsMicroturbine_4043) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class MicroturbineFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineGenerator_modeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineGenerator_statusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_typeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineRinternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineRloadFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineV_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineI_MaxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineFrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMax_FrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMin_FrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineFuel_UsedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineHeat_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineKVFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_AngleFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMax_PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineMin_PFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseA_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseB_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseC_V_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseA_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseB_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhaseC_I_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_A_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_B_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePower_C_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineVA_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePf_OutFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineE_A_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineE_B_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineE_C_InternalFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineEfficiencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbineRated_kVAFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMicroturbinePhasesFigure;

		/**
		 * @generated
		 */
		public MicroturbineFigure() {

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

			fFigureMicroturbineNameFigure = new WrappingLabel();
			fFigureMicroturbineNameFigure.setText("<...>");

			this.add(fFigureMicroturbineNameFigure);

			fFigureMicroturbineGenerator_modeFigure = new WrappingLabel();
			fFigureMicroturbineGenerator_modeFigure.setText("<...>");

			this.add(fFigureMicroturbineGenerator_modeFigure);

			fFigureMicroturbineGenerator_statusFigure = new WrappingLabel();
			fFigureMicroturbineGenerator_statusFigure.setText("<...>");

			this.add(fFigureMicroturbineGenerator_statusFigure);

			fFigureMicroturbinePower_typeFigure = new WrappingLabel();
			fFigureMicroturbinePower_typeFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_typeFigure);

			fFigureMicroturbineRinternalFigure = new WrappingLabel();
			fFigureMicroturbineRinternalFigure.setText("<...>");

			this.add(fFigureMicroturbineRinternalFigure);

			fFigureMicroturbineRloadFigure = new WrappingLabel();
			fFigureMicroturbineRloadFigure.setText("<...>");

			this.add(fFigureMicroturbineRloadFigure);

			fFigureMicroturbineV_MaxFigure = new WrappingLabel();
			fFigureMicroturbineV_MaxFigure.setText("<...>");

			this.add(fFigureMicroturbineV_MaxFigure);

			fFigureMicroturbineI_MaxFigure = new WrappingLabel();
			fFigureMicroturbineI_MaxFigure.setText("<...>");

			this.add(fFigureMicroturbineI_MaxFigure);

			fFigureMicroturbineFrequencyFigure = new WrappingLabel();
			fFigureMicroturbineFrequencyFigure.setText("<...>");

			this.add(fFigureMicroturbineFrequencyFigure);

			fFigureMicroturbineMax_FrequencyFigure = new WrappingLabel();
			fFigureMicroturbineMax_FrequencyFigure.setText("<...>");

			this.add(fFigureMicroturbineMax_FrequencyFigure);

			fFigureMicroturbineMin_FrequencyFigure = new WrappingLabel();
			fFigureMicroturbineMin_FrequencyFigure.setText("<...>");

			this.add(fFigureMicroturbineMin_FrequencyFigure);

			fFigureMicroturbineFuel_UsedFigure = new WrappingLabel();
			fFigureMicroturbineFuel_UsedFigure.setText("<...>");

			this.add(fFigureMicroturbineFuel_UsedFigure);

			fFigureMicroturbineHeat_OutFigure = new WrappingLabel();
			fFigureMicroturbineHeat_OutFigure.setText("<...>");

			this.add(fFigureMicroturbineHeat_OutFigure);

			fFigureMicroturbineKVFigure = new WrappingLabel();
			fFigureMicroturbineKVFigure.setText("<...>");

			this.add(fFigureMicroturbineKVFigure);

			fFigureMicroturbinePower_AngleFigure = new WrappingLabel();
			fFigureMicroturbinePower_AngleFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_AngleFigure);

			fFigureMicroturbineMax_PFigure = new WrappingLabel();
			fFigureMicroturbineMax_PFigure.setText("<...>");

			this.add(fFigureMicroturbineMax_PFigure);

			fFigureMicroturbineMin_PFigure = new WrappingLabel();
			fFigureMicroturbineMin_PFigure.setText("<...>");

			this.add(fFigureMicroturbineMin_PFigure);

			fFigureMicroturbinePhaseA_V_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseA_V_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseA_V_OutFigure);

			fFigureMicroturbinePhaseB_V_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseB_V_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseB_V_OutFigure);

			fFigureMicroturbinePhaseC_V_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseC_V_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseC_V_OutFigure);

			fFigureMicroturbinePhaseA_I_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseA_I_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseA_I_OutFigure);

			fFigureMicroturbinePhaseB_I_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseB_I_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseB_I_OutFigure);

			fFigureMicroturbinePhaseC_I_OutFigure = new WrappingLabel();
			fFigureMicroturbinePhaseC_I_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePhaseC_I_OutFigure);

			fFigureMicroturbinePower_A_OutFigure = new WrappingLabel();
			fFigureMicroturbinePower_A_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_A_OutFigure);

			fFigureMicroturbinePower_B_OutFigure = new WrappingLabel();
			fFigureMicroturbinePower_B_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_B_OutFigure);

			fFigureMicroturbinePower_C_OutFigure = new WrappingLabel();
			fFigureMicroturbinePower_C_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePower_C_OutFigure);

			fFigureMicroturbineVA_OutFigure = new WrappingLabel();
			fFigureMicroturbineVA_OutFigure.setText("<...>");

			this.add(fFigureMicroturbineVA_OutFigure);

			fFigureMicroturbinePf_OutFigure = new WrappingLabel();
			fFigureMicroturbinePf_OutFigure.setText("<...>");

			this.add(fFigureMicroturbinePf_OutFigure);

			fFigureMicroturbineE_A_InternalFigure = new WrappingLabel();
			fFigureMicroturbineE_A_InternalFigure.setText("<...>");

			this.add(fFigureMicroturbineE_A_InternalFigure);

			fFigureMicroturbineE_B_InternalFigure = new WrappingLabel();
			fFigureMicroturbineE_B_InternalFigure.setText("<...>");

			this.add(fFigureMicroturbineE_B_InternalFigure);

			fFigureMicroturbineE_C_InternalFigure = new WrappingLabel();
			fFigureMicroturbineE_C_InternalFigure.setText("<...>");

			this.add(fFigureMicroturbineE_C_InternalFigure);

			fFigureMicroturbineEfficiencyFigure = new WrappingLabel();
			fFigureMicroturbineEfficiencyFigure.setText("<...>");

			this.add(fFigureMicroturbineEfficiencyFigure);

			fFigureMicroturbineRated_kVAFigure = new WrappingLabel();
			fFigureMicroturbineRated_kVAFigure.setText("<...>");

			this.add(fFigureMicroturbineRated_kVAFigure);

			fFigureMicroturbinePhasesFigure = new WrappingLabel();
			fFigureMicroturbinePhasesFigure.setText("<...>");

			this.add(fFigureMicroturbinePhasesFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineNameFigure() {
			return fFigureMicroturbineNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineGenerator_modeFigure() {
			return fFigureMicroturbineGenerator_modeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineGenerator_statusFigure() {
			return fFigureMicroturbineGenerator_statusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_typeFigure() {
			return fFigureMicroturbinePower_typeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineRinternalFigure() {
			return fFigureMicroturbineRinternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineRloadFigure() {
			return fFigureMicroturbineRloadFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineV_MaxFigure() {
			return fFigureMicroturbineV_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineI_MaxFigure() {
			return fFigureMicroturbineI_MaxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineFrequencyFigure() {
			return fFigureMicroturbineFrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMax_FrequencyFigure() {
			return fFigureMicroturbineMax_FrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMin_FrequencyFigure() {
			return fFigureMicroturbineMin_FrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineFuel_UsedFigure() {
			return fFigureMicroturbineFuel_UsedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineHeat_OutFigure() {
			return fFigureMicroturbineHeat_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineKVFigure() {
			return fFigureMicroturbineKVFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_AngleFigure() {
			return fFigureMicroturbinePower_AngleFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMax_PFigure() {
			return fFigureMicroturbineMax_PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineMin_PFigure() {
			return fFigureMicroturbineMin_PFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseA_V_OutFigure() {
			return fFigureMicroturbinePhaseA_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseB_V_OutFigure() {
			return fFigureMicroturbinePhaseB_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseC_V_OutFigure() {
			return fFigureMicroturbinePhaseC_V_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseA_I_OutFigure() {
			return fFigureMicroturbinePhaseA_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseB_I_OutFigure() {
			return fFigureMicroturbinePhaseB_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhaseC_I_OutFigure() {
			return fFigureMicroturbinePhaseC_I_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_A_OutFigure() {
			return fFigureMicroturbinePower_A_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_B_OutFigure() {
			return fFigureMicroturbinePower_B_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePower_C_OutFigure() {
			return fFigureMicroturbinePower_C_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineVA_OutFigure() {
			return fFigureMicroturbineVA_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePf_OutFigure() {
			return fFigureMicroturbinePf_OutFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineE_A_InternalFigure() {
			return fFigureMicroturbineE_A_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineE_B_InternalFigure() {
			return fFigureMicroturbineE_B_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineE_C_InternalFigure() {
			return fFigureMicroturbineE_C_InternalFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineEfficiencyFigure() {
			return fFigureMicroturbineEfficiencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbineRated_kVAFigure() {
			return fFigureMicroturbineRated_kVAFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMicroturbinePhasesFigure() {
			return fFigureMicroturbinePhasesFigure;
		}

	}

}
