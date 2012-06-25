/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Climate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Climate#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.Climate#getTmyfile <em>Tmyfile</em>}</li>
 *   <li>{@link simpleGrid.Climate#getInterpolate <em>Interpolate</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getClimate()
 * @model
 * @generated
 */
public interface Climate extends EObject {
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
	 * @see simpleGrid.SimpleGridPackage#getClimate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleGrid.Climate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tmyfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmyfile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmyfile</em>' attribute.
	 * @see #setTmyfile(String)
	 * @see simpleGrid.SimpleGridPackage#getClimate_Tmyfile()
	 * @model
	 * @generated
	 */
	String getTmyfile();

	/**
	 * Sets the value of the '{@link simpleGrid.Climate#getTmyfile <em>Tmyfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmyfile</em>' attribute.
	 * @see #getTmyfile()
	 * @generated
	 */
	void setTmyfile(String value);

	/**
	 * Returns the value of the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpolate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpolate</em>' attribute.
	 * @see #setInterpolate(String)
	 * @see simpleGrid.SimpleGridPackage#getClimate_Interpolate()
	 * @model
	 * @generated
	 */
	String getInterpolate();

	/**
	 * Sets the value of the '{@link simpleGrid.Climate#getInterpolate <em>Interpolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolate</em>' attribute.
	 * @see #getInterpolate()
	 * @generated
	 */
	void setInterpolate(String value);

} // Climate
