package simpleGrid.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		simpleGrid.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		simpleGrid.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		simpleGrid.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		simpleGrid.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		simpleGrid.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
