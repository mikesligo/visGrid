package testLink.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TestLinkNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof testLink.diagram.navigator.TestLinkNavigatorItem) {
			testLink.diagram.navigator.TestLinkNavigatorItem item = (testLink.diagram.navigator.TestLinkNavigatorItem) element;
			return testLink.diagram.part.TestLinkVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
