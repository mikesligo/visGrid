/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import simpleGrid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see simpleGrid.SimpleGridPackage
 * @generated
 */
public class SimpleGridAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimpleGridPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGridAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimpleGridPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleGridSwitch<Adapter> modelSwitch =
		new SimpleGridSwitch<Adapter>() {
			@Override
			public Adapter caseClimate(Climate object) {
				return createClimateAdapter();
			}
			@Override
			public Adapter caseTriplex_Line_configuration(Triplex_Line_configuration object) {
				return createTriplex_Line_configurationAdapter();
			}
			@Override
			public Adapter caseTransformer_configuration(Transformer_configuration object) {
				return createTransformer_configurationAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseTransformer(Transformer object) {
				return createTransformerAdapter();
			}
			@Override
			public Adapter caseTriplex_node(Triplex_node object) {
				return createTriplex_nodeAdapter();
			}
			@Override
			public Adapter caseTriplex_meter(Triplex_meter object) {
				return createTriplex_meterAdapter();
			}
			@Override
			public Adapter caseHouse(House object) {
				return createHouseAdapter();
			}
			@Override
			public Adapter caseWaterheater(Waterheater object) {
				return createWaterheaterAdapter();
			}
			@Override
			public Adapter caseGrid(Grid object) {
				return createGridAdapter();
			}
			@Override
			public Adapter caseTriplex_line(Triplex_line object) {
				return createTriplex_lineAdapter();
			}
			@Override
			public Adapter caseTriplex_line_conductor(Triplex_line_conductor object) {
				return createTriplex_line_conductorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Climate <em>Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Climate
	 * @generated
	 */
	public Adapter createClimateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Triplex_Line_configuration <em>Triplex Line configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Triplex_Line_configuration
	 * @generated
	 */
	public Adapter createTriplex_Line_configurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Transformer_configuration <em>Transformer configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Transformer_configuration
	 * @generated
	 */
	public Adapter createTransformer_configurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Transformer
	 * @generated
	 */
	public Adapter createTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Triplex_node <em>Triplex node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Triplex_node
	 * @generated
	 */
	public Adapter createTriplex_nodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Triplex_meter <em>Triplex meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Triplex_meter
	 * @generated
	 */
	public Adapter createTriplex_meterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.House
	 * @generated
	 */
	public Adapter createHouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Waterheater <em>Waterheater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Waterheater
	 * @generated
	 */
	public Adapter createWaterheaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Grid
	 * @generated
	 */
	public Adapter createGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Triplex_line <em>Triplex line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Triplex_line
	 * @generated
	 */
	public Adapter createTriplex_lineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link simpleGrid.Triplex_line_conductor <em>Triplex line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see simpleGrid.Triplex_line_conductor
	 * @generated
	 */
	public Adapter createTriplex_line_conductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimpleGridAdapterFactory
