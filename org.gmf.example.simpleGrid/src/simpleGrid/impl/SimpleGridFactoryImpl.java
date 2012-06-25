/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simpleGrid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleGridFactoryImpl extends EFactoryImpl implements SimpleGridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleGridFactory init() {
		try {
			SimpleGridFactory theSimpleGridFactory = (SimpleGridFactory)EPackage.Registry.INSTANCE.getEFactory("http://tcd.ie"); 
			if (theSimpleGridFactory != null) {
				return theSimpleGridFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleGridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGridFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimpleGridPackage.CLIMATE: return createClimate();
			case SimpleGridPackage.TRIPLEX_LINE_CONFIGURATION: return createTriplex_Line_configuration();
			case SimpleGridPackage.TRANSFORMER_CONFIGURATION: return createTransformer_configuration();
			case SimpleGridPackage.NODE: return createNode();
			case SimpleGridPackage.TRANSFORMER: return createTransformer();
			case SimpleGridPackage.TRIPLEX_NODE: return createTriplex_node();
			case SimpleGridPackage.TRIPLEX_METER: return createTriplex_meter();
			case SimpleGridPackage.HOUSE: return createHouse();
			case SimpleGridPackage.WATERHEATER: return createWaterheater();
			case SimpleGridPackage.GRID: return createGrid();
			case SimpleGridPackage.TRIPLEX_LINE: return createTriplex_line();
			case SimpleGridPackage.TRIPLEX_LINE_CONDUCTOR: return createTriplex_line_conductor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Climate createClimate() {
		ClimateImpl climate = new ClimateImpl();
		return climate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_Line_configuration createTriplex_Line_configuration() {
		Triplex_Line_configurationImpl triplex_Line_configuration = new Triplex_Line_configurationImpl();
		return triplex_Line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer_configuration createTransformer_configuration() {
		Transformer_configurationImpl transformer_configuration = new Transformer_configurationImpl();
		return transformer_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformer createTransformer() {
		TransformerImpl transformer = new TransformerImpl();
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_node createTriplex_node() {
		Triplex_nodeImpl triplex_node = new Triplex_nodeImpl();
		return triplex_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_meter createTriplex_meter() {
		Triplex_meterImpl triplex_meter = new Triplex_meterImpl();
		return triplex_meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Waterheater createWaterheater() {
		WaterheaterImpl waterheater = new WaterheaterImpl();
		return waterheater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid createGrid() {
		GridImpl grid = new GridImpl();
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_line createTriplex_line() {
		Triplex_lineImpl triplex_line = new Triplex_lineImpl();
		return triplex_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triplex_line_conductor createTriplex_line_conductor() {
		Triplex_line_conductorImpl triplex_line_conductor = new Triplex_line_conductorImpl();
		return triplex_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGridPackage getSimpleGridPackage() {
		return (SimpleGridPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleGridPackage getPackage() {
		return SimpleGridPackage.eINSTANCE;
	}

} //SimpleGridFactoryImpl
