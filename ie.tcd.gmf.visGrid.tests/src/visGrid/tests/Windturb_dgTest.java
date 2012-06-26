/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.tests;

import junit.textui.TestRunner;

import visGrid.VisGridFactory;
import visGrid.Windturb_dg;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Windturb dg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Windturb_dgTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Windturb_dgTest.class);
	}

	/**
	 * Constructs a new Windturb dg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Windturb_dgTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Windturb dg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Windturb_dg getFixture() {
		return (Windturb_dg)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisGridFactory.eINSTANCE.createWindturb_dg());
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

} //Windturb_dgTest
