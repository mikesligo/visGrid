/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testLink.tests;

import junit.textui.TestRunner;

import testLink.One;
import testLink.TestLinkFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>One</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneTest extends LinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OneTest.class);
	}

	/**
	 * Constructs a new One test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this One test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected One getFixture() {
		return (One)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestLinkFactory.eINSTANCE.createOne());
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

} //OneTest
