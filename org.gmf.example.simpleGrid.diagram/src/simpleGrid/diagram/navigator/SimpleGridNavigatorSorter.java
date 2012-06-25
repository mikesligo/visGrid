package simpleGrid.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SimpleGridNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4019;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof simpleGrid.diagram.navigator.SimpleGridNavigatorItem) {
			simpleGrid.diagram.navigator.SimpleGridNavigatorItem item = (simpleGrid.diagram.navigator.SimpleGridNavigatorItem) element;
			return simpleGrid.diagram.part.SimpleGridVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
