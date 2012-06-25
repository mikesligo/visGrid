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
 * A representation of the model object '<em><b>Triplex line conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Triplex_line_conductor#getResistance <em>Resistance</em>}</li>
 *   <li>{@link simpleGrid.Triplex_line_conductor#getGeometric_mean_radius <em>Geometric mean radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getTriplex_line_conductor()
 * @model
 * @generated
 */
public interface Triplex_line_conductor extends EObject {
	/**
	 * Returns the value of the '<em><b>Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resistance</em>' attribute.
	 * @see #setResistance(String)
	 * @see simpleGrid.SimpleGridPackage#getTriplex_line_conductor_Resistance()
	 * @model
	 * @generated
	 */
	String getResistance();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_line_conductor#getResistance <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resistance</em>' attribute.
	 * @see #getResistance()
	 * @generated
	 */
	void setResistance(String value);

	/**
	 * Returns the value of the '<em><b>Geometric mean radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometric mean radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric mean radius</em>' attribute.
	 * @see #setGeometric_mean_radius(String)
	 * @see simpleGrid.SimpleGridPackage#getTriplex_line_conductor_Geometric_mean_radius()
	 * @model
	 * @generated
	 */
	String getGeometric_mean_radius();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_line_conductor#getGeometric_mean_radius <em>Geometric mean radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric mean radius</em>' attribute.
	 * @see #getGeometric_mean_radius()
	 * @generated
	 */
	void setGeometric_mean_radius(String value);

} // Triplex_line_conductor
