/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleGrid.Grid;
import simpleGrid.SimpleGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GridTest extends TestCase {

	/**
	 * The fixture for this Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grid fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GridTest.class);
	}

	/**
	 * Constructs a new Grid test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Grid fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Grid getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimpleGridFactory.eINSTANCE.createGrid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GridTest
