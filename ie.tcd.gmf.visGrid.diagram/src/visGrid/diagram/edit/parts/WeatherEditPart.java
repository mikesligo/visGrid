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
public class WeatherEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2044;

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
	public WeatherEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.WeatherItemSemanticEditPolicy());
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
		return primaryShape = new WeatherFigure();
	}

	/**
	 * @generated
	 */
	public WeatherFigure getPrimaryShape() {
		return (WeatherFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.WeatherNameEditPart) {
			((visGrid.diagram.edit.parts.WeatherNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureWeatherNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.WeatherNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.WeatherNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.WeatherConnection_4041) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsWeather_4145) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WeatherFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherHumidityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherSolar_dirFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherSolar_diffFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherWind_speedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherRainfallFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherSnowdepthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherMonthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherDayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherHourFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherMinuteFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeatherSecondFigure;

		/**
		 * @generated
		 */
		public WeatherFigure() {

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

			fFigureWeatherNameFigure = new WrappingLabel();
			fFigureWeatherNameFigure.setText("<...>");

			this.add(fFigureWeatherNameFigure);

			fFigureWeatherTemperatureFigure = new WrappingLabel();
			fFigureWeatherTemperatureFigure.setText("<...>");

			this.add(fFigureWeatherTemperatureFigure);

			fFigureWeatherHumidityFigure = new WrappingLabel();
			fFigureWeatherHumidityFigure.setText("<...>");

			this.add(fFigureWeatherHumidityFigure);

			fFigureWeatherSolar_dirFigure = new WrappingLabel();
			fFigureWeatherSolar_dirFigure.setText("<...>");

			this.add(fFigureWeatherSolar_dirFigure);

			fFigureWeatherSolar_diffFigure = new WrappingLabel();
			fFigureWeatherSolar_diffFigure.setText("<...>");

			this.add(fFigureWeatherSolar_diffFigure);

			fFigureWeatherWind_speedFigure = new WrappingLabel();
			fFigureWeatherWind_speedFigure.setText("<...>");

			this.add(fFigureWeatherWind_speedFigure);

			fFigureWeatherRainfallFigure = new WrappingLabel();
			fFigureWeatherRainfallFigure.setText("<...>");

			this.add(fFigureWeatherRainfallFigure);

			fFigureWeatherSnowdepthFigure = new WrappingLabel();
			fFigureWeatherSnowdepthFigure.setText("<...>");

			this.add(fFigureWeatherSnowdepthFigure);

			fFigureWeatherMonthFigure = new WrappingLabel();
			fFigureWeatherMonthFigure.setText("<...>");

			this.add(fFigureWeatherMonthFigure);

			fFigureWeatherDayFigure = new WrappingLabel();
			fFigureWeatherDayFigure.setText("<...>");

			this.add(fFigureWeatherDayFigure);

			fFigureWeatherHourFigure = new WrappingLabel();
			fFigureWeatherHourFigure.setText("<...>");

			this.add(fFigureWeatherHourFigure);

			fFigureWeatherMinuteFigure = new WrappingLabel();
			fFigureWeatherMinuteFigure.setText("<...>");

			this.add(fFigureWeatherMinuteFigure);

			fFigureWeatherSecondFigure = new WrappingLabel();
			fFigureWeatherSecondFigure.setText("<...>");

			this.add(fFigureWeatherSecondFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherNameFigure() {
			return fFigureWeatherNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherTemperatureFigure() {
			return fFigureWeatherTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherHumidityFigure() {
			return fFigureWeatherHumidityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherSolar_dirFigure() {
			return fFigureWeatherSolar_dirFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherSolar_diffFigure() {
			return fFigureWeatherSolar_diffFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherWind_speedFigure() {
			return fFigureWeatherWind_speedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherRainfallFigure() {
			return fFigureWeatherRainfallFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherSnowdepthFigure() {
			return fFigureWeatherSnowdepthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherMonthFigure() {
			return fFigureWeatherMonthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherDayFigure() {
			return fFigureWeatherDayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherHourFigure() {
			return fFigureWeatherHourFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherMinuteFigure() {
			return fFigureWeatherMinuteFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeatherSecondFigure() {
			return fFigureWeatherSecondFigure;
		}

	}

}
