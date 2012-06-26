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
public class Csv_readerEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2070;

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
	public Csv_readerEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.Csv_readerItemSemanticEditPolicy());
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
		return primaryShape = new Csv_readerFigure();
	}

	/**
	 * @generated
	 */
	public Csv_readerFigure getPrimaryShape() {
		return (Csv_readerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Csv_readerNameEditPart) {
			((visGrid.diagram.edit.parts.Csv_readerNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureCsv_readerNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.Csv_readerNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.Csv_readerNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.Csv_readerConnection_4027) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsCsv_reader_4064) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class Csv_readerFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerIndexFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerCity_nameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerState_nameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerLat_degFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerLat_minFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerLong_degFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerLong_minFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerLow_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerHigh_tempFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerPeak_solarFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerStatusFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerTimefmtFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerTimezoneFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerColumnsFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCsv_readerFilenameFigure;

		/**
		 * @generated
		 */
		public Csv_readerFigure() {

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

			fFigureCsv_readerNameFigure = new WrappingLabel();
			fFigureCsv_readerNameFigure.setText("<...>");

			this.add(fFigureCsv_readerNameFigure);

			fFigureCsv_readerIndexFigure = new WrappingLabel();
			fFigureCsv_readerIndexFigure.setText("<...>");

			this.add(fFigureCsv_readerIndexFigure);

			fFigureCsv_readerCity_nameFigure = new WrappingLabel();
			fFigureCsv_readerCity_nameFigure.setText("<...>");

			this.add(fFigureCsv_readerCity_nameFigure);

			fFigureCsv_readerState_nameFigure = new WrappingLabel();
			fFigureCsv_readerState_nameFigure.setText("<...>");

			this.add(fFigureCsv_readerState_nameFigure);

			fFigureCsv_readerLat_degFigure = new WrappingLabel();
			fFigureCsv_readerLat_degFigure.setText("<...>");

			this.add(fFigureCsv_readerLat_degFigure);

			fFigureCsv_readerLat_minFigure = new WrappingLabel();
			fFigureCsv_readerLat_minFigure.setText("<...>");

			this.add(fFigureCsv_readerLat_minFigure);

			fFigureCsv_readerLong_degFigure = new WrappingLabel();
			fFigureCsv_readerLong_degFigure.setText("<...>");

			this.add(fFigureCsv_readerLong_degFigure);

			fFigureCsv_readerLong_minFigure = new WrappingLabel();
			fFigureCsv_readerLong_minFigure.setText("<...>");

			this.add(fFigureCsv_readerLong_minFigure);

			fFigureCsv_readerLow_tempFigure = new WrappingLabel();
			fFigureCsv_readerLow_tempFigure.setText("<...>");

			this.add(fFigureCsv_readerLow_tempFigure);

			fFigureCsv_readerHigh_tempFigure = new WrappingLabel();
			fFigureCsv_readerHigh_tempFigure.setText("<...>");

			this.add(fFigureCsv_readerHigh_tempFigure);

			fFigureCsv_readerPeak_solarFigure = new WrappingLabel();
			fFigureCsv_readerPeak_solarFigure.setText("<...>");

			this.add(fFigureCsv_readerPeak_solarFigure);

			fFigureCsv_readerStatusFigure = new WrappingLabel();
			fFigureCsv_readerStatusFigure.setText("<...>");

			this.add(fFigureCsv_readerStatusFigure);

			fFigureCsv_readerTimefmtFigure = new WrappingLabel();
			fFigureCsv_readerTimefmtFigure.setText("<...>");

			this.add(fFigureCsv_readerTimefmtFigure);

			fFigureCsv_readerTimezoneFigure = new WrappingLabel();
			fFigureCsv_readerTimezoneFigure.setText("<...>");

			this.add(fFigureCsv_readerTimezoneFigure);

			fFigureCsv_readerColumnsFigure = new WrappingLabel();
			fFigureCsv_readerColumnsFigure.setText("<...>");

			this.add(fFigureCsv_readerColumnsFigure);

			fFigureCsv_readerFilenameFigure = new WrappingLabel();
			fFigureCsv_readerFilenameFigure.setText("<...>");

			this.add(fFigureCsv_readerFilenameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerNameFigure() {
			return fFigureCsv_readerNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerIndexFigure() {
			return fFigureCsv_readerIndexFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerCity_nameFigure() {
			return fFigureCsv_readerCity_nameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerState_nameFigure() {
			return fFigureCsv_readerState_nameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerLat_degFigure() {
			return fFigureCsv_readerLat_degFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerLat_minFigure() {
			return fFigureCsv_readerLat_minFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerLong_degFigure() {
			return fFigureCsv_readerLong_degFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerLong_minFigure() {
			return fFigureCsv_readerLong_minFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerLow_tempFigure() {
			return fFigureCsv_readerLow_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerHigh_tempFigure() {
			return fFigureCsv_readerHigh_tempFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerPeak_solarFigure() {
			return fFigureCsv_readerPeak_solarFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerStatusFigure() {
			return fFigureCsv_readerStatusFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerTimefmtFigure() {
			return fFigureCsv_readerTimefmtFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerTimezoneFigure() {
			return fFigureCsv_readerTimezoneFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerColumnsFigure() {
			return fFigureCsv_readerColumnsFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCsv_readerFilenameFigure() {
			return fFigureCsv_readerFilenameFigure;
		}

	}

}
