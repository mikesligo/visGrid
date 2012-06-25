/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triplex meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Triplex_meter#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.Triplex_meter#getPhases <em>Phases</em>}</li>
 *   <li>{@link simpleGrid.Triplex_meter#getNormal_voltages <em>Normal voltages</em>}</li>
 *   <li>{@link simpleGrid.Triplex_meter#getHouse <em>House</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getTriplex_meter()
 * @model
 * @generated
 */
public interface Triplex_meter extends EObject {
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
	 * @see simpleGrid.SimpleGridPackage#getTriplex_meter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_meter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phases</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phases</em>' attribute.
	 * @see #setPhases(String)
	 * @see simpleGrid.SimpleGridPackage#getTriplex_meter_Phases()
	 * @model
	 * @generated
	 */
	String getPhases();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_meter#getPhases <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phases</em>' attribute.
	 * @see #getPhases()
	 * @generated
	 */
	void setPhases(String value);

	/**
	 * Returns the value of the '<em><b>Normal voltages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal voltages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal voltages</em>' attribute.
	 * @see #setNormal_voltages(String)
	 * @see simpleGrid.SimpleGridPackage#getTriplex_meter_Normal_voltages()
	 * @model
	 * @generated
	 */
	String getNormal_voltages();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_meter#getNormal_voltages <em>Normal voltages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal voltages</em>' attribute.
	 * @see #getNormal_voltages()
	 * @generated
	 */
	void setNormal_voltages(String value);

	/**
	 * Returns the value of the '<em><b>House</b></em>' reference list.
	 * The list contents are of type {@link simpleGrid.House}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' reference list.
	 * @see simpleGrid.SimpleGridPackage#getTriplex_meter_House()
	 * @model
	 * @generated
	 */
	EList<House> getHouse();

} // Triplex_meter
