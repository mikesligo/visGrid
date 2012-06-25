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
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleGrid.Grid#getClimate <em>Climate</em>}</li>
 *   <li>{@link simpleGrid.Grid#getNode <em>Node</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTransformer_configuration <em>Transformer configuration</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTriplex_nodes <em>Triplex nodes</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTriplex_line_configuration <em>Triplex line configuration</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTriplex_line <em>Triplex line</em>}</li>
 *   <li>{@link simpleGrid.Grid#getTriplex_meter <em>Triplex meter</em>}</li>
 *   <li>{@link simpleGrid.Grid#getHouse <em>House</em>}</li>
 *   <li>{@link simpleGrid.Grid#getWaterheater <em>Waterheater</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleGrid.SimpleGridPackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Climate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Climate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Climate</em>' containment reference.
	 * @see #setClimate(Climate)
	 * @see simpleGrid.SimpleGridPackage#getGrid_Climate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Climate getClimate();

	/**
	 * Sets the value of the '{@link simpleGrid.Grid#getClimate <em>Climate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Climate</em>' containment reference.
	 * @see #getClimate()
	 * @generated
	 */
	void setClimate(Climate value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Transformer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Transformer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformer> getTransformer();

	/**
	 * Returns the value of the '<em><b>Transformer configuration</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Transformer_configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer configuration</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Transformer_configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformer_configuration> getTransformer_configuration();

	/**
	 * Returns the value of the '<em><b>Triplex nodes</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Triplex_node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex nodes</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Triplex_nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_node> getTriplex_nodes();

	/**
	 * Returns the value of the '<em><b>Triplex line configuration</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Triplex_Line_configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line configuration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line configuration</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Triplex_line_configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_Line_configuration> getTriplex_line_configuration();

	/**
	 * Returns the value of the '<em><b>Triplex line conductor</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Triplex_line_conductor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line conductor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line conductor</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Triplex_line_conductor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_line_conductor> getTriplex_line_conductor();

	/**
	 * Returns the value of the '<em><b>Triplex line</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Triplex_line}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex line</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex line</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Triplex_line()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_line> getTriplex_line();

	/**
	 * Returns the value of the '<em><b>Triplex meter</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Triplex_meter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplex meter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triplex meter</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Triplex_meter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Triplex_meter> getTriplex_meter();

	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.House}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_House()
	 * @model containment="true"
	 * @generated
	 */
	EList<House> getHouse();

	/**
	 * Returns the value of the '<em><b>Waterheater</b></em>' containment reference list.
	 * The list contents are of type {@link simpleGrid.Waterheater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waterheater</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waterheater</em>' containment reference list.
	 * @see simpleGrid.SimpleGridPackage#getGrid_Waterheater()
	 * @model containment="true"
	 * @generated
	 */
	EList<Waterheater> getWaterheater();

} // Grid
