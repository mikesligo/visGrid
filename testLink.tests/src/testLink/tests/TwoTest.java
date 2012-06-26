/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testLink.tests;

import junit.textui.TestRunner;

import testLink.TestLinkFactory;
import testLink.Two;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Two</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwoTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TwoTest.class);
	}

	/**
	 * Constructs a new Two test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Two test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Two getFixture() {
		return (Two)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestLinkFactory.eINSTANCE.createTwo());
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

} //TwoTest
