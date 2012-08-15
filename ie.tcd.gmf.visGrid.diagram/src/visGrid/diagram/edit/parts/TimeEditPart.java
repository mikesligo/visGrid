package visGrid.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class TimeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2082;

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
	public TimeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.TimeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new TimeFigure();
	}

	/**
	 * @generated
	 */
	public TimeFigure getPrimaryShape() {
		return (TimeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart) {
			((visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSimulatorTime());
			return true;
		}
		if (childEditPart instanceof visGrid.diagram.edit.parts.TimeRealtimeEditPart) {
			((visGrid.diagram.edit.parts.TimeRealtimeEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureRealtime());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart) {
			return true;
		}
		if (childEditPart instanceof visGrid.diagram.edit.parts.TimeRealtimeEditPart) {
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
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
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
				.getType(visGrid.diagram.edit.parts.TimeSimulatorTimeEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class TimeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureOuterRect;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSimulatorTime;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRealtime;

		/**
		 * @generated
		 */
		public TimeFigure() {
			this.setLayoutManager(new XYLayout());
			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure innerSVG0 = new RectangleFigure();
			innerSVG0.setOutline(false);

			this.add(innerSVG0, new Rectangle(getMapMode().DPtoLP(45),
					getMapMode().DPtoLP(0), getMapMode().DPtoLP(60),
					getMapMode().DPtoLP(60)));
			innerSVG0.setLayoutManager(new XYLayout());

			SVGFigure timeFigureSVG1 = new SVGFigure();
			timeFigureSVG1
					.setURI("file:///home/mike/src/visGrid/ie.tcd.gmf.visGrid/images/time.svg");

			innerSVG0.add(timeFigureSVG1, new Rectangle(0, 0, getMapMode()
					.DPtoLP(60), getMapMode().DPtoLP(60)));

			RectangleFigure inner0 = new RectangleFigure();
			inner0.setFill(false);
			inner0.setOutline(false);
			inner0.setLineWidth(0);

			this.add(
					inner0,
					new Rectangle(getMapMode().DPtoLP(0), getMapMode().DPtoLP(
							60), getMapMode().DPtoLP(150), getMapMode().DPtoLP(
							40)));

			FlowLayout layoutInner0 = new FlowLayout();
			layoutInner0.setStretchMinorAxis(false);
			layoutInner0.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutInner0.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutInner0.setMajorSpacing(5);
			layoutInner0.setMinorSpacing(5);
			layoutInner0.setHorizontal(true);

			inner0.setLayoutManager(layoutInner0);

			fFigureSimulatorTime = new WrappingLabel();
			fFigureSimulatorTime.setText("<...>");

			inner0.add(fFigureSimulatorTime);

			FlowLayout layoutFFigureSimulatorTime = new FlowLayout();
			layoutFFigureSimulatorTime.setStretchMinorAxis(false);
			layoutFFigureSimulatorTime
					.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureSimulatorTime
					.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureSimulatorTime.setMajorSpacing(5);
			layoutFFigureSimulatorTime.setMinorSpacing(5);
			layoutFFigureSimulatorTime.setHorizontal(true);

			fFigureSimulatorTime.setLayoutManager(layoutFFigureSimulatorTime);

			fFigureRealtime = new WrappingLabel();
			fFigureRealtime.setText("<...>");

			inner0.add(fFigureRealtime);

			FlowLayout layoutFFigureRealtime = new FlowLayout();
			layoutFFigureRealtime.setStretchMinorAxis(false);
			layoutFFigureRealtime.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutFFigureRealtime.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutFFigureRealtime.setMajorSpacing(5);
			layoutFFigureRealtime.setMinorSpacing(5);
			layoutFFigureRealtime.setHorizontal(true);

			fFigureRealtime.setLayoutManager(layoutFFigureRealtime);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureOuterRect() {
			return fFigureOuterRect;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSimulatorTime() {
			return fFigureSimulatorTime;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRealtime() {
			return fFigureRealtime;
		}

	}

}
