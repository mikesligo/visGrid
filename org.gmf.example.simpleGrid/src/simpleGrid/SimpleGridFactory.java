/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see simpleGrid.SimpleGridPackage
 * @generated
 */
public interface SimpleGridFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleGridFactory eINSTANCE = simpleGrid.impl.SimpleGridFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Climate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Climate</em>'.
	 * @generated
	 */
	Climate createClimate();

	/**
	 * Returns a new object of class '<em>Triplex Line configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triplex Line configuration</em>'.
	 * @generated
	 */
	Triplex_Line_configuration createTriplex_Line_configuration();

	/**
	 * Returns a new object of class '<em>Transformer configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer configuration</em>'.
	 * @generated
	 */
	Transformer_configuration createTransformer_configuration();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformer</em>'.
	 * @generated
	 */
	Transformer createTransformer();

	/**
	 * Returns a new object of class '<em>Triplex node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triplex node</em>'.
	 * @generated
	 */
	Triplex_node createTriplex_node();

	/**
	 * Returns a new object of class '<em>Triplex meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triplex meter</em>'.
	 * @generated
	 */
	Triplex_meter createTriplex_meter();

	/**
	 * Returns a new object of class '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House</em>'.
	 * @generated
	 */
	House createHouse();

	/**
	 * Returns a new object of class '<em>Waterheater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waterheater</em>'.
	 * @generated
	 */
	Waterheater createWaterheater();

	/**
	 * Returns a new object of class '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid</em>'.
	 * @generated
	 */
	Grid createGrid();

	/**
	 * Returns a new object of class '<em>Triplex line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triplex line</em>'.
	 * @generated
	 */
	Triplex_line createTriplex_line();

	/**
	 * Returns a new object of class '<em>Triplex line conductor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triplex line conductor</em>'.
	 * @generated
	 */
	Triplex_line_conductor createTriplex_line_conductor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimpleGridPackage getSimpleGridPackage();

} //SimpleGridFactory
