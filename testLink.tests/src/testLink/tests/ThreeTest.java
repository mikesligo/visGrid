/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testLink.tests;

import junit.textui.TestRunner;

import testLink.TestLinkFactory;
import testLink.Three;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Three</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreeTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThreeTest.class);
	}

	/**
	 * Constructs a new Three test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Three test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Three getFixture() {
		return (Three)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestLinkFactory.eINSTANCE.createThree());
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

} //ThreeTest
