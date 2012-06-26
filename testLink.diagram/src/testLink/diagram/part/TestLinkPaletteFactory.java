package testLink.diagram.part;

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
public class TestLinkPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createTestLink1Group());
	}

	/**
	 * Creates "testLink" palette tool group
	 * @generated
	 */
	private PaletteContainer createTestLink1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				testLink.diagram.part.Messages.TestLink1Group_title);
		paletteContainer.setId("createTestLink1Group"); //$NON-NLS-1$
		paletteContainer.add(createOne1CreationTool());
		paletteContainer.add(createLinkEReference02CreationTool());
		paletteContainer.add(createTwo3CreationTool());
		paletteContainer.add(createLinkEReference024CreationTool());
		paletteContainer.add(createThree5CreationTool());
		paletteContainer.add(createLinkEReference036CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOne1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				testLink.diagram.part.Messages.One1CreationTool_title,
				testLink.diagram.part.Messages.One1CreationTool_desc,
				Collections
						.singletonList(testLink.diagram.providers.TestLinkElementTypes.One_2001));
		entry.setId("createOne1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(testLink.diagram.providers.TestLinkElementTypes
				.getImageDescriptor(testLink.diagram.providers.TestLinkElementTypes.One_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkEReference02CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				testLink.diagram.part.Messages.LinkEReference02CreationTool_title,
				testLink.diagram.part.Messages.LinkEReference02CreationTool_desc,
				Collections
						.singletonList(testLink.diagram.providers.TestLinkElementTypes.Three_2002));
		entry.setId("createLinkEReference02CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(testLink.diagram.providers.TestLinkElementTypes
				.getImageDescriptor(testLink.diagram.providers.TestLinkElementTypes.Three_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTwo3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				testLink.diagram.part.Messages.Two3CreationTool_title,
				testLink.diagram.part.Messages.Two3CreationTool_desc,
				Collections
						.singletonList(testLink.diagram.providers.TestLinkElementTypes.Two_2003));
		entry.setId("createTwo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(testLink.diagram.providers.TestLinkElementTypes
				.getImageDescriptor(testLink.diagram.providers.TestLinkElementTypes.Two_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkEReference024CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				testLink.diagram.part.Messages.LinkEReference024CreationTool_title,
				testLink.diagram.part.Messages.LinkEReference024CreationTool_desc,
				Collections
						.singletonList(testLink.diagram.providers.TestLinkElementTypes.LinkEReference0_4001));
		entry.setId("createLinkEReference024CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(testLink.diagram.providers.TestLinkElementTypes
				.getImageDescriptor(testLink.diagram.providers.TestLinkElementTypes.LinkEReference0_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThree5CreationTool() {
		ToolEntry entry = new ToolEntry(
				testLink.diagram.part.Messages.Three5CreationTool_title,
				testLink.diagram.part.Messages.Three5CreationTool_desc, null,
				null) {
		};
		entry.setId("createThree5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkEReference036CreationTool() {
		ToolEntry entry = new ToolEntry(
				testLink.diagram.part.Messages.LinkEReference036CreationTool_title,
				testLink.diagram.part.Messages.LinkEReference036CreationTool_desc,
				null, null) {
		};
		entry.setId("createLinkEReference036CreationTool"); //$NON-NLS-1$
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
