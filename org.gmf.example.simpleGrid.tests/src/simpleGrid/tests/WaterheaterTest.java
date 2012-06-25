/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleGrid.SimpleGridFactory;
import simpleGrid.Waterheater;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Waterheater</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterheaterTest extends TestCase {

	/**
	 * The fixture for this Waterheater test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Waterheater fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaterheaterTest.class);
	}

	/**
	 * Constructs a new Waterheater test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterheaterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Waterheater test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Waterheater fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Waterheater test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Waterheater getFixture() {
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
		setFixture(SimpleGridFactory.eINSTANCE.createWaterheater());
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

} //WaterheaterTest
