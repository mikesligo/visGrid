/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>SimpleGrid</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleGridAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SimpleGridAllTests("SimpleGrid Tests");
		suite.addTest(SimpleGridTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGridAllTests(String name) {
		super(name);
	}

} //SimpleGridAllTests
