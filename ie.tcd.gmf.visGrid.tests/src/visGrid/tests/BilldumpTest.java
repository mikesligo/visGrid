/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import visGrid.Billdump;
import visGrid.VisGridFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Billdump</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BilldumpTest extends TestCase {

	/**
	 * The fixture for this Billdump test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Billdump fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BilldumpTest.class);
	}

	/**
	 * Constructs a new Billdump test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BilldumpTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Billdump test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Billdump fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Billdump test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Billdump getFixture() {
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
		setFixture(VisGridFactory.eINSTANCE.createBilldump());
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

} //BilldumpTest