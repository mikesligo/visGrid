package testLink.diagram.preferences;

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
		testLink.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		testLink.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		testLink.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		testLink.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		testLink.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return testLink.diagram.part.TestLinkDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
