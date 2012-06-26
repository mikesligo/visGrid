/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testLink.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import testLink.ATop;
import testLink.TestLinkFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ATop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ATopTest extends TestCase {

	/**
	 * The fixture for this ATop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATop fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ATopTest.class);
	}

	/**
	 * Constructs a new ATop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATopTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ATop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ATop fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ATop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATop getFixture() {
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
		setFixture(TestLinkFactory.eINSTANCE.createATop());
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

} //ATopTest
