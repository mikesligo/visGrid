package visGrid.diagram.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public interface InfoLabelProvider {
	void installListenerFilter(String filterId, NotificationListener listener, EObject element,
			EStructuralFeature feature);

	void uninstallListenerFilter(String filterId);

	WrappingLabel getInfoLabel();

	EObject resolveSemanticElement();
}
