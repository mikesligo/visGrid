package simpleGrid.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SimpleGridPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSimpleGrid1Group());
	}

	/**
	 * Creates "simpleGrid" palette tool group
	 * @generated
	 */
	private PaletteContainer createSimpleGrid1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				simpleGrid.diagram.part.Messages.SimpleGrid1Group_title);
		paletteContainer.setId("createSimpleGrid1Group"); //$NON-NLS-1$
		paletteContainer.add(createClimate1CreationTool());
		paletteContainer.add(createTriplex_Line_configuration2CreationTool());
		paletteContainer.add(createTransformer_configuration3CreationTool());
		paletteContainer.add(createNode4CreationTool());
		paletteContainer.add(createTransformer5CreationTool());
		paletteContainer.add(createTriplex_node6CreationTool());
		paletteContainer.add(createTriplex_meter7CreationTool());
		paletteContainer.add(createHouse8CreationTool());
		paletteContainer.add(createWaterheater9CreationTool());
		paletteContainer.add(createTriplex_line10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClimate1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Climate1CreationTool_title,
				simpleGrid.diagram.part.Messages.Climate1CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009));
		entry.setId("createClimate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Climate_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_Line_configuration2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_Line_configuration2CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_Line_configuration2CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001));
		entry.setId("createTriplex_Line_configuration2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_Line_configuration_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer_configuration3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Transformer_configuration3CreationTool_title,
				simpleGrid.diagram.part.Messages.Transformer_configuration3CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004));
		entry.setId("createTransformer_configuration3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_configuration_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Node4CreationTool_title,
				simpleGrid.diagram.part.Messages.Node4CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007));
		entry.setId("createNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Node_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransformer5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Transformer5CreationTool_title,
				simpleGrid.diagram.part.Messages.Transformer5CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010));
		entry.setId("createTransformer5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Transformer_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_node6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_node6CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_node6CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002));
		entry.setId("createTriplex_node6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_node_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_meter7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_meter7CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_meter7CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005));
		entry.setId("createTriplex_meter7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_meter_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHouse8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.House8CreationTool_title,
				simpleGrid.diagram.part.Messages.House8CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011));
		entry.setId("createHouse8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.House_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWaterheater9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Waterheater9CreationTool_title,
				simpleGrid.diagram.part.Messages.Waterheater9CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003));
		entry.setId("createWaterheater9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Waterheater_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriplex_line10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				simpleGrid.diagram.part.Messages.Triplex_line10CreationTool_title,
				simpleGrid.diagram.part.Messages.Triplex_line10CreationTool_desc,
				Collections
						.singletonList(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006));
		entry.setId("createTriplex_line10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(simpleGrid.diagram.providers.SimpleGridElementTypes
				.getImageDescriptor(simpleGrid.diagram.providers.SimpleGridElementTypes.Triplex_line_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
