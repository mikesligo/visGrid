/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testLink;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testLink.TestLinkFactory
 * @model kind="package"
 * @generated
 */
public interface TestLinkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testLink";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.c";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testLink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestLinkPackage eINSTANCE = testLink.impl.TestLinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link testLink.impl.ATopImpl <em>ATop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testLink.impl.ATopImpl
	 * @see testLink.impl.TestLinkPackageImpl#getATop()
	 * @generated
	 */
	int ATOP = 0;

	/**
	 * The feature id for the '<em><b>EReference4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOP__EREFERENCE4 = 0;

	/**
	 * The feature id for the '<em><b>EReference5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOP__EREFERENCE5 = 1;

	/**
	 * The feature id for the '<em><b>EReference6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOP__EREFERENCE6 = 2;

	/**
	 * The number of structural features of the '<em>ATop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link testLink.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testLink.impl.LinkImpl
	 * @see testLink.impl.TestLinkPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 4;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EREFERENCE0 = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link testLink.impl.OneImpl <em>One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testLink.impl.OneImpl
	 * @see testLink.impl.TestLinkPackageImpl#getOne()
	 * @generated
	 */
	int ONE = 1;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE__EREFERENCE0 = LINK__EREFERENCE0;

	/**
	 * The number of structural features of the '<em>One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link testLink.impl.TwoImpl <em>Two</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testLink.impl.TwoImpl
	 * @see testLink.impl.TestLinkPackageImpl#getTwo()
	 * @generated
	 */
	int TWO = 2;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO__EREFERENCE0 = LINK__EREFERENCE0;

	/**
	 * The number of structural features of the '<em>Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link testLink.impl.ThreeImpl <em>Three</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testLink.impl.ThreeImpl
	 * @see testLink.impl.TestLinkPackageImpl#getThree()
	 * @generated
	 */
	int THREE = 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE__EREFERENCE0 = LINK__EREFERENCE0;

	/**
	 * The number of structural features of the '<em>Three</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREE_FEATURE_COUNT = LINK_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link testLink.ATop <em>ATop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATop</em>'.
	 * @see testLink.ATop
	 * @generated
	 */
	EClass getATop();

	/**
	 * Returns the meta object for the containment reference list '{@link testLink.ATop#getEReference4 <em>EReference4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference4</em>'.
	 * @see testLink.ATop#getEReference4()
	 * @see #getATop()
	 * @generated
	 */
	EReference getATop_EReference4();

	/**
	 * Returns the meta object for the containment reference list '{@link testLink.ATop#getEReference5 <em>EReference5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference5</em>'.
	 * @see testLink.ATop#getEReference5()
	 * @see #getATop()
	 * @generated
	 */
	EReference getATop_EReference5();

	/**
	 * Returns the meta object for the containment reference list '{@link testLink.ATop#getEReference6 <em>EReference6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference6</em>'.
	 * @see testLink.ATop#getEReference6()
	 * @see #getATop()
	 * @generated
	 */
	EReference getATop_EReference6();

	/**
	 * Returns the meta object for class '{@link testLink.One <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One</em>'.
	 * @see testLink.One
	 * @generated
	 */
	EClass getOne();

	/**
	 * Returns the meta object for class '{@link testLink.Two <em>Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two</em>'.
	 * @see testLink.Two
	 * @generated
	 */
	EClass getTwo();

	/**
	 * Returns the meta object for class '{@link testLink.Three <em>Three</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Three</em>'.
	 * @see testLink.Three
	 * @generated
	 */
	EClass getThree();

	/**
	 * Returns the meta object for class '{@link testLink.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see testLink.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link testLink.Link#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference0</em>'.
	 * @see testLink.Link#getEReference0()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_EReference0();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestLinkFactory getTestLinkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testLink.impl.ATopImpl <em>ATop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testLink.impl.ATopImpl
		 * @see testLink.impl.TestLinkPackageImpl#getATop()
		 * @generated
		 */
		EClass ATOP = eINSTANCE.getATop();

		/**
		 * The meta object literal for the '<em><b>EReference4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOP__EREFERENCE4 = eINSTANCE.getATop_EReference4();

		/**
		 * The meta object literal for the '<em><b>EReference5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOP__EREFERENCE5 = eINSTANCE.getATop_EReference5();

		/**
		 * The meta object literal for the '<em><b>EReference6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOP__EREFERENCE6 = eINSTANCE.getATop_EReference6();

		/**
		 * The meta object literal for the '{@link testLink.impl.OneImpl <em>One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testLink.impl.OneImpl
		 * @see testLink.impl.TestLinkPackageImpl#getOne()
		 * @generated
		 */
		EClass ONE = eINSTANCE.getOne();

		/**
		 * The meta object literal for the '{@link testLink.impl.TwoImpl <em>Two</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testLink.impl.TwoImpl
		 * @see testLink.impl.TestLinkPackageImpl#getTwo()
		 * @generated
		 */
		EClass TWO = eINSTANCE.getTwo();

		/**
		 * The meta object literal for the '{@link testLink.impl.ThreeImpl <em>Three</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testLink.impl.ThreeImpl
		 * @see testLink.impl.TestLinkPackageImpl#getThree()
		 * @generated
		 */
		EClass THREE = eINSTANCE.getThree();

		/**
		 * The meta object literal for the '{@link testLink.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testLink.impl.LinkImpl
		 * @see testLink.impl.TestLinkPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__EREFERENCE0 = eINSTANCE.getLink_EReference0();

	}

} //TestLinkPackage
