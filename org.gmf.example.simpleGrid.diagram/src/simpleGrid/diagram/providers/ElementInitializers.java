package simpleGrid.diagram.providers;

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
		ElementInitializers cached = simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
