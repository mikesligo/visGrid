package updatelabels.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import visGrid.diagram.edit.parts.HouseAir_temperatureEditPart;
import visGrid.diagram.edit.parts.VisGridEditPartFactory;
import visGrid.diagram.part.VisGridVisualIDRegistry;

public class VisGridEditPartFactoryOverride extends VisGridEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (VisGridVisualIDRegistry.getVisualID(view)) {
			case HouseAir_temperatureEditPart.VISUAL_ID:
				return new HouseEditPartOverride(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
