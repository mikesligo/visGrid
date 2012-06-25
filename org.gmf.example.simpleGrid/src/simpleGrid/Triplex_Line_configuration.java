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
 * A representation of the model object '<em><b>Triplex Line configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Triplex_Line_configuration#getName <em>Name</em>}</li>
 *   <li>{@link simpleGrid.Triplex_Line_configuration#getInsulation_thickness <em>Insulation thickness</em>}</li>
 *   <li>{@link simpleGrid.Triplex_Line_configuration#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link simpleGrid.Triplex_Line_configuration#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getTriplex_Line_configuration()
 * @model
 * @generated
 */
public interface Triplex_Line_configuration extends EObject {
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
	 * @see simpleGrid.SimpleGridPackage#getTriplex_Line_configuration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_Line_configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Insulation thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insulation thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insulation thickness</em>' attribute.
	 * @see #setInsulation_thickness(String)
	 * @see simpleGrid.SimpleGridPackage#getTriplex_Line_configuration_Insulation_thickness()
	 * @model
	 * @generated
	 */
	String getInsulation_thickness();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_Line_configuration#getInsulation_thickness <em>Insulation thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insulation thickness</em>' attribute.
	 * @see #getInsulation_thickness()
	 * @generated
	 */
	void setInsulation_thickness(String value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #setDiameter(String)
	 * @see simpleGrid.SimpleGridPackage#getTriplex_Line_configuration_Diameter()
	 * @model
	 * @generated
	 */
	String getDiameter();

	/**
	 * Sets the value of the '{@link simpleGrid.Triplex_Line_configuration#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(String value);

	/**
	 * Returns the value of the '<em><b>Triplex line conductor</b></em>' reference list.
	 * The list contents are of type {@link simpleGrid.Triplex_line_conductor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line conductor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line conductor</em>' reference list.
	 * @see simpleGrid.SimpleGridPackage#getTriplex_Line_configuration_Triplex_line_conductor()
	 * @model
	 * @generated
	 */
	EList<Triplex_line_conductor> getTriplex_line_conductor();

} // Triplex_Line_configuration
