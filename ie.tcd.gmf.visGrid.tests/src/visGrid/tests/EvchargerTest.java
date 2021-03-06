/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.tests;

import junit.textui.TestRunner;

import visGrid.Evcharger;
import visGrid.VisGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evcharger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvchargerTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvchargerTest.class);
	}

	/**
	 * Constructs a new Evcharger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvchargerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Evcharger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Evcharger getFixture() {
		return (Evcharger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisGridFactory.eINSTANCE.createEvcharger());
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

} //EvchargerTest
