/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.tests;

import junit.textui.TestRunner;

import visGrid.VisGridFactory;
import visGrid.Volt_var_control;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Volt var control</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Volt_var_controlTest extends ConnectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Volt_var_controlTest.class);
	}

	/**
	 * Constructs a new Volt var control test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volt_var_controlTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Volt var control test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Volt_var_control getFixture() {
		return (Volt_var_control)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VisGridFactory.eINSTANCE.createVolt_var_control());
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

} //Volt_var_controlTest
