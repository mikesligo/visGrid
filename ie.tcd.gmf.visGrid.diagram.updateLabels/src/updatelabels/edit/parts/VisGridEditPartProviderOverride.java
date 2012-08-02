package updatelabels.edit.parts;

import visGrid.diagram.providers.VisGridEditPartProvider;

public class VisGridEditPartProviderOverride extends VisGridEditPartProvider {
	public VisGridEditPartProviderOverride() {
		super();
		setFactory(new VisGridEditPartFactoryOverride());
	}
}
