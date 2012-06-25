/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import simpleGrid.Climate;
import simpleGrid.SimpleGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Climate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClimateTest extends TestCase {

	/**
	 * The fixture for this Climate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Climate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClimateTest.class);
	}

	/**
	 * Constructs a new Climate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClimateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Climate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Climate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Climate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Climate getFixture() {
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
		setFixture(SimpleGridFactory.eINSTANCE.createClimate());
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

} //ClimateTest
