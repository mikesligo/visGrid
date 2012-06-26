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
public class Frequency_genEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2050;

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
	public Frequency_genEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Frequency_genItemSemanticEditPolicy());
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
		return primaryShape = new Frequency_genFigure();
	}

	/**
	 * @generated
	 */
	public Frequency_genFigure getPrimaryShape() {
		return (Frequency_genFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Frequency_genNameEditPart) {
			((visGrid.diagram.edit.parts.Frequency_genNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureFrequency_genNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Frequency_genNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Frequency_genNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Frequency_genConnection_4082) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsFrequency_gen_4141) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Frequency_genFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genFrequency_ModeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genFrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genFreqChangeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genDeadbandFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genToleranceFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genMFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genDFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genRated_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genGen_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genLoad_powerFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genGov_delayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genRamp_rateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genLow_Freq_OIFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genHigh_Freq_OIFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genAvg24Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genStd24Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genAvg168Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genStd168Figure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureFrequency_genNum_Resp_EqsFigure;

		/**
		 * @generated
		 */
		public Frequency_genFigure() {

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

			fFigureFrequency_genNameFigure = new WrappingLabel();
			fFigureFrequency_genNameFigure.setText("<...>");

			this.add(fFigureFrequency_genNameFigure);

			fFigureFrequency_genFrequency_ModeFigure = new WrappingLabel();
			fFigureFrequency_genFrequency_ModeFigure.setText("<...>");

			this.add(fFigureFrequency_genFrequency_ModeFigure);

			fFigureFrequency_genFrequencyFigure = new WrappingLabel();
			fFigureFrequency_genFrequencyFigure.setText("<...>");

			this.add(fFigureFrequency_genFrequencyFigure);

			fFigureFrequency_genFreqChangeFigure = new WrappingLabel();
			fFigureFrequency_genFreqChangeFigure.setText("<...>");

			this.add(fFigureFrequency_genFreqChangeFigure);

			fFigureFrequency_genDeadbandFigure = new WrappingLabel();
			fFigureFrequency_genDeadbandFigure.setText("<...>");

			this.add(fFigureFrequency_genDeadbandFigure);

			fFigureFrequency_genToleranceFigure = new WrappingLabel();
			fFigureFrequency_genToleranceFigure.setText("<...>");

			this.add(fFigureFrequency_genToleranceFigure);

			fFigureFrequency_genMFigure = new WrappingLabel();
			fFigureFrequency_genMFigure.setText("<...>");

			this.add(fFigureFrequency_genMFigure);

			fFigureFrequency_genDFigure = new WrappingLabel();
			fFigureFrequency_genDFigure.setText("<...>");

			this.add(fFigureFrequency_genDFigure);

			fFigureFrequency_genRated_powerFigure = new WrappingLabel();
			fFigureFrequency_genRated_powerFigure.setText("<...>");

			this.add(fFigureFrequency_genRated_powerFigure);

			fFigureFrequency_genGen_powerFigure = new WrappingLabel();
			fFigureFrequency_genGen_powerFigure.setText("<...>");

			this.add(fFigureFrequency_genGen_powerFigure);

			fFigureFrequency_genLoad_powerFigure = new WrappingLabel();
			fFigureFrequency_genLoad_powerFigure.setText("<...>");

			this.add(fFigureFrequency_genLoad_powerFigure);

			fFigureFrequency_genGov_delayFigure = new WrappingLabel();
			fFigureFrequency_genGov_delayFigure.setText("<...>");

			this.add(fFigureFrequency_genGov_delayFigure);

			fFigureFrequency_genRamp_rateFigure = new WrappingLabel();
			fFigureFrequency_genRamp_rateFigure.setText("<...>");

			this.add(fFigureFrequency_genRamp_rateFigure);

			fFigureFrequency_genLow_Freq_OIFigure = new WrappingLabel();
			fFigureFrequency_genLow_Freq_OIFigure.setText("<...>");

			this.add(fFigureFrequency_genLow_Freq_OIFigure);

			fFigureFrequency_genHigh_Freq_OIFigure = new WrappingLabel();
			fFigureFrequency_genHigh_Freq_OIFigure.setText("<...>");

			this.add(fFigureFrequency_genHigh_Freq_OIFigure);

			fFigureFrequency_genAvg24Figure = new WrappingLabel();
			fFigureFrequency_genAvg24Figure.setText("<...>");

			this.add(fFigureFrequency_genAvg24Figure);

			fFigureFrequency_genStd24Figure = new WrappingLabel();
			fFigureFrequency_genStd24Figure.setText("<...>");

			this.add(fFigureFrequency_genStd24Figure);

			fFigureFrequency_genAvg168Figure = new WrappingLabel();
			fFigureFrequency_genAvg168Figure.setText("<...>");

			this.add(fFigureFrequency_genAvg168Figure);

			fFigureFrequency_genStd168Figure = new WrappingLabel();
			fFigureFrequency_genStd168Figure.setText("<...>");

			this.add(fFigureFrequency_genStd168Figure);

			fFigureFrequency_genNum_Resp_EqsFigure = new WrappingLabel();
			fFigureFrequency_genNum_Resp_EqsFigure.setText("<...>");

			this.add(fFigureFrequency_genNum_Resp_EqsFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genNameFigure() {
			return fFigureFrequency_genNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genFrequency_ModeFigure() {
			return fFigureFrequency_genFrequency_ModeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genFrequencyFigure() {
			return fFigureFrequency_genFrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genFreqChangeFigure() {
			return fFigureFrequency_genFreqChangeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genDeadbandFigure() {
			return fFigureFrequency_genDeadbandFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genToleranceFigure() {
			return fFigureFrequency_genToleranceFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genMFigure() {
			return fFigureFrequency_genMFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genDFigure() {
			return fFigureFrequency_genDFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genRated_powerFigure() {
			return fFigureFrequency_genRated_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genGen_powerFigure() {
			return fFigureFrequency_genGen_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genLoad_powerFigure() {
			return fFigureFrequency_genLoad_powerFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genGov_delayFigure() {
			return fFigureFrequency_genGov_delayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genRamp_rateFigure() {
			return fFigureFrequency_genRamp_rateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genLow_Freq_OIFigure() {
			return fFigureFrequency_genLow_Freq_OIFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genHigh_Freq_OIFigure() {
			return fFigureFrequency_genHigh_Freq_OIFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genAvg24Figure() {
			return fFigureFrequency_genAvg24Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genStd24Figure() {
			return fFigureFrequency_genStd24Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genAvg168Figure() {
			return fFigureFrequency_genAvg168Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genStd168Figure() {
			return fFigureFrequency_genStd168Figure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFrequency_genNum_Resp_EqsFigure() {
			return fFigureFrequency_genNum_Resp_EqsFigure;
		}

	}

}
