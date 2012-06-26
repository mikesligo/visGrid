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
public class ClimateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ClimateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new visGrid.diagram.edit.policies.ClimateItemSemanticEditPolicy());
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
		return primaryShape = new ClimateFigure();
	}

	/**
	 * @generated
	 */
	public ClimateFigure getPrimaryShape() {
		return (ClimateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ClimateNameEditPart) {
			((visGrid.diagram.edit.parts.ClimateNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureClimateNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof visGrid.diagram.edit.parts.ClimateNameEditPart) {
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
				.getType(visGrid.diagram.edit.parts.ClimateNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof visGrid.diagram.edit.parts.ConnectionsEditPart) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ClimateConnection_4015) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == visGrid.diagram.providers.VisGridElementTypes.ConnectionsClimate_4010) {
			types.add(visGrid.diagram.providers.VisGridElementTypes.Connections_2077);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ClimateFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateCityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateTmyfileFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateTemperatureFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateHumidityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_fluxFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_directFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateWind_speedFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateWind_dirFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateWind_gustFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateRecord__lowFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateRecord__low_dayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateRecord__highFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateRecord__high_dayFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateRecord__solarFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateRainfallFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSnowdepthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateInterpolateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_horizFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_northFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_northeastFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_eastFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_southeastFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_southFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_southwestFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_westFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_northwestFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateSolar_rawFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureClimateReaderFigure;

		/**
		 * @generated
		 */
		public ClimateFigure() {

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

			fFigureClimateNameFigure = new WrappingLabel();
			fFigureClimateNameFigure.setText("<...>");

			this.add(fFigureClimateNameFigure);

			fFigureClimateCityFigure = new WrappingLabel();
			fFigureClimateCityFigure.setText("<...>");

			this.add(fFigureClimateCityFigure);

			fFigureClimateTmyfileFigure = new WrappingLabel();
			fFigureClimateTmyfileFigure.setText("<...>");

			this.add(fFigureClimateTmyfileFigure);

			fFigureClimateTemperatureFigure = new WrappingLabel();
			fFigureClimateTemperatureFigure.setText("<...>");

			this.add(fFigureClimateTemperatureFigure);

			fFigureClimateHumidityFigure = new WrappingLabel();
			fFigureClimateHumidityFigure.setText("<...>");

			this.add(fFigureClimateHumidityFigure);

			fFigureClimateSolar_fluxFigure = new WrappingLabel();
			fFigureClimateSolar_fluxFigure.setText("<...>");

			this.add(fFigureClimateSolar_fluxFigure);

			fFigureClimateSolar_directFigure = new WrappingLabel();
			fFigureClimateSolar_directFigure.setText("<...>");

			this.add(fFigureClimateSolar_directFigure);

			fFigureClimateWind_speedFigure = new WrappingLabel();
			fFigureClimateWind_speedFigure.setText("<...>");

			this.add(fFigureClimateWind_speedFigure);

			fFigureClimateWind_dirFigure = new WrappingLabel();
			fFigureClimateWind_dirFigure.setText("<...>");

			this.add(fFigureClimateWind_dirFigure);

			fFigureClimateWind_gustFigure = new WrappingLabel();
			fFigureClimateWind_gustFigure.setText("<...>");

			this.add(fFigureClimateWind_gustFigure);

			fFigureClimateRecord__lowFigure = new WrappingLabel();
			fFigureClimateRecord__lowFigure.setText("<...>");

			this.add(fFigureClimateRecord__lowFigure);

			fFigureClimateRecord__low_dayFigure = new WrappingLabel();
			fFigureClimateRecord__low_dayFigure.setText("<...>");

			this.add(fFigureClimateRecord__low_dayFigure);

			fFigureClimateRecord__highFigure = new WrappingLabel();
			fFigureClimateRecord__highFigure.setText("<...>");

			this.add(fFigureClimateRecord__highFigure);

			fFigureClimateRecord__high_dayFigure = new WrappingLabel();
			fFigureClimateRecord__high_dayFigure.setText("<...>");

			this.add(fFigureClimateRecord__high_dayFigure);

			fFigureClimateRecord__solarFigure = new WrappingLabel();
			fFigureClimateRecord__solarFigure.setText("<...>");

			this.add(fFigureClimateRecord__solarFigure);

			fFigureClimateRainfallFigure = new WrappingLabel();
			fFigureClimateRainfallFigure.setText("<...>");

			this.add(fFigureClimateRainfallFigure);

			fFigureClimateSnowdepthFigure = new WrappingLabel();
			fFigureClimateSnowdepthFigure.setText("<...>");

			this.add(fFigureClimateSnowdepthFigure);

			fFigureClimateInterpolateFigure = new WrappingLabel();
			fFigureClimateInterpolateFigure.setText("<...>");

			this.add(fFigureClimateInterpolateFigure);

			fFigureClimateSolar_horizFigure = new WrappingLabel();
			fFigureClimateSolar_horizFigure.setText("<...>");

			this.add(fFigureClimateSolar_horizFigure);

			fFigureClimateSolar_northFigure = new WrappingLabel();
			fFigureClimateSolar_northFigure.setText("<...>");

			this.add(fFigureClimateSolar_northFigure);

			fFigureClimateSolar_northeastFigure = new WrappingLabel();
			fFigureClimateSolar_northeastFigure.setText("<...>");

			this.add(fFigureClimateSolar_northeastFigure);

			fFigureClimateSolar_eastFigure = new WrappingLabel();
			fFigureClimateSolar_eastFigure.setText("<...>");

			this.add(fFigureClimateSolar_eastFigure);

			fFigureClimateSolar_southeastFigure = new WrappingLabel();
			fFigureClimateSolar_southeastFigure.setText("<...>");

			this.add(fFigureClimateSolar_southeastFigure);

			fFigureClimateSolar_southFigure = new WrappingLabel();
			fFigureClimateSolar_southFigure.setText("<...>");

			this.add(fFigureClimateSolar_southFigure);

			fFigureClimateSolar_southwestFigure = new WrappingLabel();
			fFigureClimateSolar_southwestFigure.setText("<...>");

			this.add(fFigureClimateSolar_southwestFigure);

			fFigureClimateSolar_westFigure = new WrappingLabel();
			fFigureClimateSolar_westFigure.setText("<...>");

			this.add(fFigureClimateSolar_westFigure);

			fFigureClimateSolar_northwestFigure = new WrappingLabel();
			fFigureClimateSolar_northwestFigure.setText("<...>");

			this.add(fFigureClimateSolar_northwestFigure);

			fFigureClimateSolar_rawFigure = new WrappingLabel();
			fFigureClimateSolar_rawFigure.setText("<...>");

			this.add(fFigureClimateSolar_rawFigure);

			fFigureClimateReaderFigure = new WrappingLabel();
			fFigureClimateReaderFigure.setText("<...>");

			this.add(fFigureClimateReaderFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateNameFigure() {
			return fFigureClimateNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateCityFigure() {
			return fFigureClimateCityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateTmyfileFigure() {
			return fFigureClimateTmyfileFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateTemperatureFigure() {
			return fFigureClimateTemperatureFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateHumidityFigure() {
			return fFigureClimateHumidityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_fluxFigure() {
			return fFigureClimateSolar_fluxFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_directFigure() {
			return fFigureClimateSolar_directFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateWind_speedFigure() {
			return fFigureClimateWind_speedFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateWind_dirFigure() {
			return fFigureClimateWind_dirFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateWind_gustFigure() {
			return fFigureClimateWind_gustFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateRecord__lowFigure() {
			return fFigureClimateRecord__lowFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateRecord__low_dayFigure() {
			return fFigureClimateRecord__low_dayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateRecord__highFigure() {
			return fFigureClimateRecord__highFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateRecord__high_dayFigure() {
			return fFigureClimateRecord__high_dayFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateRecord__solarFigure() {
			return fFigureClimateRecord__solarFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateRainfallFigure() {
			return fFigureClimateRainfallFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSnowdepthFigure() {
			return fFigureClimateSnowdepthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateInterpolateFigure() {
			return fFigureClimateInterpolateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_horizFigure() {
			return fFigureClimateSolar_horizFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_northFigure() {
			return fFigureClimateSolar_northFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_northeastFigure() {
			return fFigureClimateSolar_northeastFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_eastFigure() {
			return fFigureClimateSolar_eastFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_southeastFigure() {
			return fFigureClimateSolar_southeastFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_southFigure() {
			return fFigureClimateSolar_southFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_southwestFigure() {
			return fFigureClimateSolar_southwestFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_westFigure() {
			return fFigureClimateSolar_westFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_northwestFigure() {
			return fFigureClimateSolar_northwestFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateSolar_rawFigure() {
			return fFigureClimateSolar_rawFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureClimateReaderFigure() {
			return fFigureClimateReaderFigure;
		}

	}

}
