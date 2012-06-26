package testLink.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = testLink.diagram.part.TestLinkDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			testLink.diagram.part.TestLinkDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}