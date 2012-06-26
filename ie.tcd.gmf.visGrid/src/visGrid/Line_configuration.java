/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Line_configuration#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Line_configuration#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Line_configuration#getConductor_A <em>Conductor A</em>}</li>
 *   <li>{@link visGrid.Line_configuration#getConductor_B <em>Conductor B</em>}</li>
 *   <li>{@link visGrid.Line_configuration#getConductor_C <em>Conductor C</em>}</li>
 *   <li>{@link visGrid.Line_configuration#getConductor_N <em>Conductor N</em>}</li>
 *   <li>{@link visGrid.Line_configuration#getSpacing <em>Spacing</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getLine_configuration()
 * @model
 * @generated
 */
public interface Line_configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link visGrid.Connections}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see visGrid.VisGridPackage#getLine_configuration_Connection()
	 * @model
	 * @generated
	 */
	EList<Connections> getConnection();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see visGrid.VisGridPackage#getLine_configuration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Line_configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conductor A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor A</em>' attribute.
	 * @see #setConductor_A(String)
	 * @see visGrid.VisGridPackage#getLine_configuration_Conductor_A()
	 * @model
	 * @generated
	 */
	String getConductor_A();

	/**
	 * Sets the value of the '{@link visGrid.Line_configuration#getConductor_A <em>Conductor A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor A</em>' attribute.
	 * @see #getConductor_A()
	 * @generated
	 */
	void setConductor_A(String value);

	/**
	 * Returns the value of the '<em><b>Conductor B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor B</em>' attribute.
	 * @see #setConductor_B(String)
	 * @see visGrid.VisGridPackage#getLine_configuration_Conductor_B()
	 * @model
	 * @generated
	 */
	String getConductor_B();

	/**
	 * Sets the value of the '{@link visGrid.Line_configuration#getConductor_B <em>Conductor B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor B</em>' attribute.
	 * @see #getConductor_B()
	 * @generated
	 */
	void setConductor_B(String value);

	/**
	 * Returns the value of the '<em><b>Conductor C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor C</em>' attribute.
	 * @see #setConductor_C(String)
	 * @see visGrid.VisGridPackage#getLine_configuration_Conductor_C()
	 * @model
	 * @generated
	 */
	String getConductor_C();

	/**
	 * Sets the value of the '{@link visGrid.Line_configuration#getConductor_C <em>Conductor C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor C</em>' attribute.
	 * @see #getConductor_C()
	 * @generated
	 */
	void setConductor_C(String value);

	/**
	 * Returns the value of the '<em><b>Conductor N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor N</em>' attribute.
	 * @see #setConductor_N(String)
	 * @see visGrid.VisGridPackage#getLine_configuration_Conductor_N()
	 * @model
	 * @generated
	 */
	String getConductor_N();

	/**
	 * Sets the value of the '{@link visGrid.Line_configuration#getConductor_N <em>Conductor N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conductor N</em>' attribute.
	 * @see #getConductor_N()
	 * @generated
	 */
	void setConductor_N(String value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(String)
	 * @see visGrid.VisGridPackage#getLine_configuration_Spacing()
	 * @model
	 * @generated
	 */
	String getSpacing();

	/**
	 * Sets the value of the '{@link visGrid.Line_configuration#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(String value);

} // Line_configuration