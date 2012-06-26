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
 * A representation of the model object '<em><b>Line spacing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link visGrid.Line_spacing#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getDistance_AB <em>Distance AB</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getDistance_BC <em>Distance BC</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getDistance_AC <em>Distance AC</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getDistance_AN <em>Distance AN</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getDistance_BN <em>Distance BN</em>}</li>
 *   <li>{@link visGrid.Line_spacing#getDistance_CN <em>Distance CN</em>}</li>
 * </ul>
 * </p>
 *
 * @see visGrid.VisGridPackage#getLine_spacing()
 * @model
 * @generated
 */
public interface Line_spacing extends EObject {
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
	 * @see visGrid.VisGridPackage#getLine_spacing_Connection()
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
	 * @see visGrid.VisGridPackage#getLine_spacing_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Distance AB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance AB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance AB</em>' attribute.
	 * @see #setDistance_AB(String)
	 * @see visGrid.VisGridPackage#getLine_spacing_Distance_AB()
	 * @model
	 * @generated
	 */
	String getDistance_AB();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getDistance_AB <em>Distance AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance AB</em>' attribute.
	 * @see #getDistance_AB()
	 * @generated
	 */
	void setDistance_AB(String value);

	/**
	 * Returns the value of the '<em><b>Distance BC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance BC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance BC</em>' attribute.
	 * @see #setDistance_BC(String)
	 * @see visGrid.VisGridPackage#getLine_spacing_Distance_BC()
	 * @model
	 * @generated
	 */
	String getDistance_BC();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getDistance_BC <em>Distance BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance BC</em>' attribute.
	 * @see #getDistance_BC()
	 * @generated
	 */
	void setDistance_BC(String value);

	/**
	 * Returns the value of the '<em><b>Distance AC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance AC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance AC</em>' attribute.
	 * @see #setDistance_AC(String)
	 * @see visGrid.VisGridPackage#getLine_spacing_Distance_AC()
	 * @model
	 * @generated
	 */
	String getDistance_AC();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getDistance_AC <em>Distance AC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance AC</em>' attribute.
	 * @see #getDistance_AC()
	 * @generated
	 */
	void setDistance_AC(String value);

	/**
	 * Returns the value of the '<em><b>Distance AN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance AN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance AN</em>' attribute.
	 * @see #setDistance_AN(String)
	 * @see visGrid.VisGridPackage#getLine_spacing_Distance_AN()
	 * @model
	 * @generated
	 */
	String getDistance_AN();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getDistance_AN <em>Distance AN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance AN</em>' attribute.
	 * @see #getDistance_AN()
	 * @generated
	 */
	void setDistance_AN(String value);

	/**
	 * Returns the value of the '<em><b>Distance BN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance BN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance BN</em>' attribute.
	 * @see #setDistance_BN(String)
	 * @see visGrid.VisGridPackage#getLine_spacing_Distance_BN()
	 * @model
	 * @generated
	 */
	String getDistance_BN();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getDistance_BN <em>Distance BN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance BN</em>' attribute.
	 * @see #getDistance_BN()
	 * @generated
	 */
	void setDistance_BN(String value);

	/**
	 * Returns the value of the '<em><b>Distance CN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance CN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance CN</em>' attribute.
	 * @see #setDistance_CN(String)
	 * @see visGrid.VisGridPackage#getLine_spacing_Distance_CN()
	 * @model
	 * @generated
	 */
	String getDistance_CN();

	/**
	 * Sets the value of the '{@link visGrid.Line_spacing#getDistance_CN <em>Distance CN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance CN</em>' attribute.
	 * @see #getDistance_CN()
	 * @generated
	 */
	void setDistance_CN(String value);

} // Line_spacing