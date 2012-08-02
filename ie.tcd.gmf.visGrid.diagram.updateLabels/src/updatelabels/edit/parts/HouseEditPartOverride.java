package updatelabels.edit.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import visGrid.diagram.edit.parts.HouseEditPart;

import updatelabels.edit.policy.SuperEntityModelChangedEditPolicy;

public class HouseEditPartOverride extends HouseEditPart implements InfoLabelProvider {
	private boolean didInitialViewUpdate;

	public HouseEditPartOverride(View view) {
		super(view);
		didInitialViewUpdate = false;
	}

	private void initializeSuperEntityLabel() {
		if (!didInitialViewUpdate) {
			EditPolicy editPolicy = getEditPolicy(SuperEntityModelChangedEditPolicy.MODEL_CHANGED_ROLE);
			if (editPolicy instanceof SuperEntityModelChangedEditPolicy) {
				SuperEntityModelChangedEditPolicy policy = (SuperEntityModelChangedEditPolicy) editPolicy;
				didInitialViewUpdate = policy.updateSuperEntityLabel();
			}
		}
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		String role = SuperEntityModelChangedEditPolicy.MODEL_CHANGED_ROLE;
		EditPolicy originalPolicy = getEditPolicy(role);
		installEditPolicy(role, new SuperEntityModelChangedEditPolicy(role, originalPolicy));
		// try to update view if not already done
		initializeSuperEntityLabel();
	}

	@Override
	public WrappingLabel getInfoLabel() {
		HouseFigure entityFigure = getPrimaryShape();
		return entityFigure.getFigureHouseAir_temperatureFigure();
	}

	@Override
	public void installListenerFilter(String filterId, NotificationListener listener, EObject element,
			EStructuralFeature feature) {
		addListenerFilter(filterId, listener, element, feature);
	}

	@Override
	public void uninstallListenerFilter(String filterId) {
		removeListenerFilter(filterId);
	}

}
