/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleGrid.House;
import simpleGrid.SimpleGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HouseTest extends TestCase {

	/**
	 * The fixture for this House test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected House fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HouseTest.class);
	}

	/**
	 * Constructs a new House test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HouseTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this House test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(House fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this House test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected House getFixture() {
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
		setFixture(SimpleGridFactory.eINSTANCE.createHouse());
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

} //HouseTest
