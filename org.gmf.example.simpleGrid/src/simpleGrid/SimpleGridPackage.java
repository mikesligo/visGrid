/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simpleGrid.SimpleGridFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleGridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleGrid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tcd.ie";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gmf.example";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleGridPackage eINSTANCE = simpleGrid.impl.SimpleGridPackageImpl.init();

	/**
	 * The meta object id for the '{@link simpleGrid.impl.ClimateImpl <em>Climate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.ClimateImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getClimate()
	 * @generated
	 */
	int CLIMATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tmyfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE__TMYFILE = 1;

	/**
	 * The feature id for the '<em><b>Interpolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE__INTERPOLATE = 2;

	/**
	 * The number of structural features of the '<em>Climate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.Triplex_Line_configurationImpl <em>Triplex Line configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.Triplex_Line_configurationImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_Line_configuration()
	 * @generated
	 */
	int TRIPLEX_LINE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Insulation thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS = 1;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONFIGURATION__DIAMETER = 2;

	/**
	 * The feature id for the '<em><b>Triplex line conductor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR = 3;

	/**
	 * The number of structural features of the '<em>Triplex Line configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.Transformer_configurationImpl <em>Transformer configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.Transformer_configurationImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTransformer_configuration()
	 * @generated
	 */
	int TRANSFORMER_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connect type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__CONNECT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Install type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__INSTALL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Power rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__POWER_RATING = 3;

	/**
	 * The feature id for the '<em><b>Impedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__IMPEDENCE = 4;

	/**
	 * The feature id for the '<em><b>Impedence1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__IMPEDENCE1 = 5;

	/**
	 * The feature id for the '<em><b>Impedence2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__IMPEDENCE2 = 6;

	/**
	 * The feature id for the '<em><b>Shunt impedence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE = 7;

	/**
	 * The feature id for the '<em><b>Primary voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE = 8;

	/**
	 * The feature id for the '<em><b>Secondary voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE = 9;

	/**
	 * The number of structural features of the '<em>Transformer configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_CONFIGURATION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.NodeImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PHASES = 1;

	/**
	 * The feature id for the '<em><b>Bustype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BUSTYPE = 2;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TRANSFORMER = 3;

	/**
	 * The feature id for the '<em><b>Voltage C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VOLTAGE_C = 4;

	/**
	 * The feature id for the '<em><b>Voltage B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VOLTAGE_B = 5;

	/**
	 * The feature id for the '<em><b>Voltage A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VOLTAGE_A = 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.TransformerImpl <em>Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.TransformerImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTransformer()
	 * @generated
	 */
	int TRANSFORMER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__PHASES = 1;

	/**
	 * The feature id for the '<em><b>Transformer configuration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__TRANSFORMER_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Groupid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__GROUPID = 3;

	/**
	 * The feature id for the '<em><b>Triplex node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__TRIPLEX_NODE = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__FROM = 5;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__TO = 6;

	/**
	 * The number of structural features of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.Triplex_nodeImpl <em>Triplex node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.Triplex_nodeImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_node()
	 * @generated
	 */
	int TRIPLEX_NODE = 5;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE__PHASES = 2;

	/**
	 * The feature id for the '<em><b>Triplex line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE__TRIPLEX_LINE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE__FROM = 4;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE__TO = 5;

	/**
	 * The number of structural features of the '<em>Triplex node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_NODE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.Triplex_meterImpl <em>Triplex meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.Triplex_meterImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_meter()
	 * @generated
	 */
	int TRIPLEX_METER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_METER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_METER__PHASES = 1;

	/**
	 * The feature id for the '<em><b>Normal voltages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_METER__NORMAL_VOLTAGES = 2;

	/**
	 * The feature id for the '<em><b>House</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_METER__HOUSE = 3;

	/**
	 * The number of structural features of the '<em>Triplex meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_METER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.HouseImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schedule skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__SCHEDULE_SKEW = 1;

	/**
	 * The feature id for the '<em><b>Air temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__AIR_TEMPERATURE = 2;

	/**
	 * The feature id for the '<em><b>Floor area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__FLOOR_AREA = 3;

	/**
	 * The feature id for the '<em><b>Cooling setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__COOLING_SETPOINT = 4;

	/**
	 * The feature id for the '<em><b>Heating setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__HEATING_SETPOINT = 5;

	/**
	 * The feature id for the '<em><b>Thermal integrity level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__THERMAL_INTEGRITY_LEVEL = 6;

	/**
	 * The feature id for the '<em><b>Motor model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__MOTOR_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Motor efficiency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__MOTOR_EFFICIENCY = 8;

	/**
	 * The feature id for the '<em><b>Mass temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__MASS_TEMPERATURE = 9;

	/**
	 * The feature id for the '<em><b>Heating system type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__HEATING_SYSTEM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Heating COP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__HEATING_COP = 11;

	/**
	 * The feature id for the '<em><b>Auxiliary strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__AUXILIARY_STRATEGY = 12;

	/**
	 * The feature id for the '<em><b>Auxiliary system type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__AUXILIARY_SYSTEM_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Cooling COP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__COOLING_COP = 14;

	/**
	 * The feature id for the '<em><b>Waterheater</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__WATERHEATER = 15;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__PARENT = 16;

	/**
	 * The feature id for the '<em><b>Aux heat temperature lockout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT = 17;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.WaterheaterImpl <em>Waterheater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.WaterheaterImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getWaterheater()
	 * @generated
	 */
	int WATERHEATER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tank volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__TANK_VOLUME = 1;

	/**
	 * The feature id for the '<em><b>Tank setpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__TANK_SETPOINT = 2;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__TEMPERATURE = 3;

	/**
	 * The feature id for the '<em><b>Thermostat deadband</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__THERMOSTAT_DEADBAND = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Tank UA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__TANK_UA = 6;

	/**
	 * The feature id for the '<em><b>Schedule skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__SCHEDULE_SKEW = 7;

	/**
	 * The feature id for the '<em><b>Demand skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__DEMAND_SKEW = 8;

	/**
	 * The feature id for the '<em><b>Heating element capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER__HEATING_ELEMENT_CAPACITY = 9;

	/**
	 * The number of structural features of the '<em>Waterheater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATERHEATER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.GridImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 9;

	/**
	 * The feature id for the '<em><b>Climate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__CLIMATE = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__NODE = 1;

	/**
	 * The feature id for the '<em><b>Transformer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRANSFORMER = 2;

	/**
	 * The feature id for the '<em><b>Transformer configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRANSFORMER_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Triplex nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRIPLEX_NODES = 4;

	/**
	 * The feature id for the '<em><b>Triplex line configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRIPLEX_LINE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Triplex line conductor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRIPLEX_LINE_CONDUCTOR = 6;

	/**
	 * The feature id for the '<em><b>Triplex line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRIPLEX_LINE = 7;

	/**
	 * The feature id for the '<em><b>Triplex meter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__TRIPLEX_METER = 8;

	/**
	 * The feature id for the '<em><b>House</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__HOUSE = 9;

	/**
	 * The feature id for the '<em><b>Waterheater</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__WATERHEATER = 10;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.Triplex_lineImpl <em>Triplex line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.Triplex_lineImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_line()
	 * @generated
	 */
	int TRIPLEX_LINE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__PHASES = 2;

	/**
	 * The feature id for the '<em><b>Triplex line configuration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Triplex meter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__TRIPLEX_METER = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__FROM = 5;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE__TO = 6;

	/**
	 * The number of structural features of the '<em>Triplex line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link simpleGrid.impl.Triplex_line_conductorImpl <em>Triplex line conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simpleGrid.impl.Triplex_line_conductorImpl
	 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_line_conductor()
	 * @generated
	 */
	int TRIPLEX_LINE_CONDUCTOR = 11;

	/**
	 * The feature id for the '<em><b>Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONDUCTOR__RESISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Geometric mean radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS = 1;

	/**
	 * The number of structural features of the '<em>Triplex line conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLEX_LINE_CONDUCTOR_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link simpleGrid.Climate <em>Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Climate</em>'.
	 * @see simpleGrid.Climate
	 * @generated
	 */
	EClass getClimate();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Climate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Climate#getName()
	 * @see #getClimate()
	 * @generated
	 */
	EAttribute getClimate_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Climate#getTmyfile <em>Tmyfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tmyfile</em>'.
	 * @see simpleGrid.Climate#getTmyfile()
	 * @see #getClimate()
	 * @generated
	 */
	EAttribute getClimate_Tmyfile();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Climate#getInterpolate <em>Interpolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolate</em>'.
	 * @see simpleGrid.Climate#getInterpolate()
	 * @see #getClimate()
	 * @generated
	 */
	EAttribute getClimate_Interpolate();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Triplex_Line_configuration <em>Triplex Line configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triplex Line configuration</em>'.
	 * @see simpleGrid.Triplex_Line_configuration
	 * @generated
	 */
	EClass getTriplex_Line_configuration();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_Line_configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Triplex_Line_configuration#getName()
	 * @see #getTriplex_Line_configuration()
	 * @generated
	 */
	EAttribute getTriplex_Line_configuration_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_Line_configuration#getInsulation_thickness <em>Insulation thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insulation thickness</em>'.
	 * @see simpleGrid.Triplex_Line_configuration#getInsulation_thickness()
	 * @see #getTriplex_Line_configuration()
	 * @generated
	 */
	EAttribute getTriplex_Line_configuration_Insulation_thickness();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_Line_configuration#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see simpleGrid.Triplex_Line_configuration#getDiameter()
	 * @see #getTriplex_Line_configuration()
	 * @generated
	 */
	EAttribute getTriplex_Line_configuration_Diameter();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Triplex_Line_configuration#getTriplex_line_conductor <em>Triplex line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triplex line conductor</em>'.
	 * @see simpleGrid.Triplex_Line_configuration#getTriplex_line_conductor()
	 * @see #getTriplex_Line_configuration()
	 * @generated
	 */
	EReference getTriplex_Line_configuration_Triplex_line_conductor();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Transformer_configuration <em>Transformer configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer configuration</em>'.
	 * @see simpleGrid.Transformer_configuration
	 * @generated
	 */
	EClass getTransformer_configuration();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Transformer_configuration#getName()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getConnect_type <em>Connect type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect type</em>'.
	 * @see simpleGrid.Transformer_configuration#getConnect_type()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Connect_type();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getInstall_type <em>Install type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install type</em>'.
	 * @see simpleGrid.Transformer_configuration#getInstall_type()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Install_type();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getPower_rating <em>Power rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power rating</em>'.
	 * @see simpleGrid.Transformer_configuration#getPower_rating()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Power_rating();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getImpedence <em>Impedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impedence</em>'.
	 * @see simpleGrid.Transformer_configuration#getImpedence()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Impedence();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getImpedence1 <em>Impedence1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impedence1</em>'.
	 * @see simpleGrid.Transformer_configuration#getImpedence1()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Impedence1();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getImpedence2 <em>Impedence2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impedence2</em>'.
	 * @see simpleGrid.Transformer_configuration#getImpedence2()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Impedence2();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getShunt_impedence <em>Shunt impedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shunt impedence</em>'.
	 * @see simpleGrid.Transformer_configuration#getShunt_impedence()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Shunt_impedence();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getPrimary_voltage <em>Primary voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary voltage</em>'.
	 * @see simpleGrid.Transformer_configuration#getPrimary_voltage()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Primary_voltage();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer_configuration#getSecondary_voltage <em>Secondary voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secondary voltage</em>'.
	 * @see simpleGrid.Transformer_configuration#getSecondary_voltage()
	 * @see #getTransformer_configuration()
	 * @generated
	 */
	EAttribute getTransformer_configuration_Secondary_voltage();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see simpleGrid.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Node#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see simpleGrid.Node#getPhases()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Phases();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Node#getBustype <em>Bustype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bustype</em>'.
	 * @see simpleGrid.Node#getBustype()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Bustype();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Node#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer</em>'.
	 * @see simpleGrid.Node#getTransformer()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Transformer();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Node#getVoltage_C <em>Voltage C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage C</em>'.
	 * @see simpleGrid.Node#getVoltage_C()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Voltage_C();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Node#getVoltage_B <em>Voltage B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage B</em>'.
	 * @see simpleGrid.Node#getVoltage_B()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Voltage_B();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Node#getVoltage_A <em>Voltage A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage A</em>'.
	 * @see simpleGrid.Node#getVoltage_A()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Voltage_A();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer</em>'.
	 * @see simpleGrid.Transformer
	 * @generated
	 */
	EClass getTransformer();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Transformer#getName()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see simpleGrid.Transformer#getPhases()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_Phases();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Transformer#getTransformer_configuration <em>Transformer configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformer configuration</em>'.
	 * @see simpleGrid.Transformer#getTransformer_configuration()
	 * @see #getTransformer()
	 * @generated
	 */
	EReference getTransformer_Transformer_configuration();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer#getGroupid <em>Groupid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Groupid</em>'.
	 * @see simpleGrid.Transformer#getGroupid()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_Groupid();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Transformer#getTriplex_node <em>Triplex node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triplex node</em>'.
	 * @see simpleGrid.Transformer#getTriplex_node()
	 * @see #getTransformer()
	 * @generated
	 */
	EReference getTransformer_Triplex_node();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see simpleGrid.Transformer#getFrom()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_From();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Transformer#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see simpleGrid.Transformer#getTo()
	 * @see #getTransformer()
	 * @generated
	 */
	EAttribute getTransformer_To();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Triplex_node <em>Triplex node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triplex node</em>'.
	 * @see simpleGrid.Triplex_node
	 * @generated
	 */
	EClass getTriplex_node();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_node#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see simpleGrid.Triplex_node#getLength()
	 * @see #getTriplex_node()
	 * @generated
	 */
	EAttribute getTriplex_node_Length();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Triplex_node#getName()
	 * @see #getTriplex_node()
	 * @generated
	 */
	EAttribute getTriplex_node_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_node#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see simpleGrid.Triplex_node#getPhases()
	 * @see #getTriplex_node()
	 * @generated
	 */
	EAttribute getTriplex_node_Phases();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Triplex_node#getTriplex_line <em>Triplex line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triplex line</em>'.
	 * @see simpleGrid.Triplex_node#getTriplex_line()
	 * @see #getTriplex_node()
	 * @generated
	 */
	EReference getTriplex_node_Triplex_line();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_node#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see simpleGrid.Triplex_node#getFrom()
	 * @see #getTriplex_node()
	 * @generated
	 */
	EAttribute getTriplex_node_From();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_node#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see simpleGrid.Triplex_node#getTo()
	 * @see #getTriplex_node()
	 * @generated
	 */
	EAttribute getTriplex_node_To();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Triplex_meter <em>Triplex meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triplex meter</em>'.
	 * @see simpleGrid.Triplex_meter
	 * @generated
	 */
	EClass getTriplex_meter();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_meter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Triplex_meter#getName()
	 * @see #getTriplex_meter()
	 * @generated
	 */
	EAttribute getTriplex_meter_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_meter#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see simpleGrid.Triplex_meter#getPhases()
	 * @see #getTriplex_meter()
	 * @generated
	 */
	EAttribute getTriplex_meter_Phases();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_meter#getNormal_voltages <em>Normal voltages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normal voltages</em>'.
	 * @see simpleGrid.Triplex_meter#getNormal_voltages()
	 * @see #getTriplex_meter()
	 * @generated
	 */
	EAttribute getTriplex_meter_Normal_voltages();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Triplex_meter#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>House</em>'.
	 * @see simpleGrid.Triplex_meter#getHouse()
	 * @see #getTriplex_meter()
	 * @generated
	 */
	EReference getTriplex_meter_House();

	/**
	 * Returns the meta object for class '{@link simpleGrid.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see simpleGrid.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.House#getName()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getSchedule_skew <em>Schedule skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule skew</em>'.
	 * @see simpleGrid.House#getSchedule_skew()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Schedule_skew();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getAir_temperature <em>Air temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Air temperature</em>'.
	 * @see simpleGrid.House#getAir_temperature()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Air_temperature();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getFloor_area <em>Floor area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor area</em>'.
	 * @see simpleGrid.House#getFloor_area()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Floor_area();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getCooling_setpoint <em>Cooling setpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooling setpoint</em>'.
	 * @see simpleGrid.House#getCooling_setpoint()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Cooling_setpoint();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getHeating_setpoint <em>Heating setpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heating setpoint</em>'.
	 * @see simpleGrid.House#getHeating_setpoint()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Heating_setpoint();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getThermal_integrity_level <em>Thermal integrity level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermal integrity level</em>'.
	 * @see simpleGrid.House#getThermal_integrity_level()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Thermal_integrity_level();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getMotor_model <em>Motor model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor model</em>'.
	 * @see simpleGrid.House#getMotor_model()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Motor_model();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getMotor_efficiency <em>Motor efficiency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motor efficiency</em>'.
	 * @see simpleGrid.House#getMotor_efficiency()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Motor_efficiency();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getMass_temperature <em>Mass temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass temperature</em>'.
	 * @see simpleGrid.House#getMass_temperature()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Mass_temperature();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getHeating_system_type <em>Heating system type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heating system type</em>'.
	 * @see simpleGrid.House#getHeating_system_type()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Heating_system_type();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getHeating_COP <em>Heating COP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heating COP</em>'.
	 * @see simpleGrid.House#getHeating_COP()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Heating_COP();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getAuxiliary_strategy <em>Auxiliary strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary strategy</em>'.
	 * @see simpleGrid.House#getAuxiliary_strategy()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Auxiliary_strategy();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getAuxiliary_system_type <em>Auxiliary system type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary system type</em>'.
	 * @see simpleGrid.House#getAuxiliary_system_type()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Auxiliary_system_type();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getCooling_COP <em>Cooling COP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooling COP</em>'.
	 * @see simpleGrid.House#getCooling_COP()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Cooling_COP();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.House#getWaterheater <em>Waterheater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waterheater</em>'.
	 * @see simpleGrid.House#getWaterheater()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Waterheater();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see simpleGrid.House#getParent()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Parent();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.House#getAux_heat_temperature_lockout <em>Aux heat temperature lockout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux heat temperature lockout</em>'.
	 * @see simpleGrid.House#getAux_heat_temperature_lockout()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Aux_heat_temperature_lockout();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Waterheater <em>Waterheater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waterheater</em>'.
	 * @see simpleGrid.Waterheater
	 * @generated
	 */
	EClass getWaterheater();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Waterheater#getName()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getTank_volume <em>Tank volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tank volume</em>'.
	 * @see simpleGrid.Waterheater#getTank_volume()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Tank_volume();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getTank_setpoint <em>Tank setpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tank setpoint</em>'.
	 * @see simpleGrid.Waterheater#getTank_setpoint()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Tank_setpoint();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see simpleGrid.Waterheater#getTemperature()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getThermostat_deadband <em>Thermostat deadband</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermostat deadband</em>'.
	 * @see simpleGrid.Waterheater#getThermostat_deadband()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Thermostat_deadband();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see simpleGrid.Waterheater#getLocation()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Location();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getTank_UA <em>Tank UA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tank UA</em>'.
	 * @see simpleGrid.Waterheater#getTank_UA()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Tank_UA();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getSchedule_skew <em>Schedule skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule skew</em>'.
	 * @see simpleGrid.Waterheater#getSchedule_skew()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Schedule_skew();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getDemand_skew <em>Demand skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demand skew</em>'.
	 * @see simpleGrid.Waterheater#getDemand_skew()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Demand_skew();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Waterheater#getHeating_element_capacity <em>Heating element capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heating element capacity</em>'.
	 * @see simpleGrid.Waterheater#getHeating_element_capacity()
	 * @see #getWaterheater()
	 * @generated
	 */
	EAttribute getWaterheater_Heating_element_capacity();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see simpleGrid.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the containment reference '{@link simpleGrid.Grid#getClimate <em>Climate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Climate</em>'.
	 * @see simpleGrid.Grid#getClimate()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Climate();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see simpleGrid.Grid#getNode()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTransformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformer</em>'.
	 * @see simpleGrid.Grid#getTransformer()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Transformer();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTransformer_configuration <em>Transformer configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformer configuration</em>'.
	 * @see simpleGrid.Grid#getTransformer_configuration()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Transformer_configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTriplex_nodes <em>Triplex nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triplex nodes</em>'.
	 * @see simpleGrid.Grid#getTriplex_nodes()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Triplex_nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTriplex_line_configuration <em>Triplex line configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triplex line configuration</em>'.
	 * @see simpleGrid.Grid#getTriplex_line_configuration()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Triplex_line_configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTriplex_line_conductor <em>Triplex line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triplex line conductor</em>'.
	 * @see simpleGrid.Grid#getTriplex_line_conductor()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Triplex_line_conductor();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTriplex_line <em>Triplex line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triplex line</em>'.
	 * @see simpleGrid.Grid#getTriplex_line()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Triplex_line();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getTriplex_meter <em>Triplex meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triplex meter</em>'.
	 * @see simpleGrid.Grid#getTriplex_meter()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Triplex_meter();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>House</em>'.
	 * @see simpleGrid.Grid#getHouse()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_House();

	/**
	 * Returns the meta object for the containment reference list '{@link simpleGrid.Grid#getWaterheater <em>Waterheater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waterheater</em>'.
	 * @see simpleGrid.Grid#getWaterheater()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Waterheater();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Triplex_line <em>Triplex line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triplex line</em>'.
	 * @see simpleGrid.Triplex_line
	 * @generated
	 */
	EClass getTriplex_line();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simpleGrid.Triplex_line#getName()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EAttribute getTriplex_line_Name();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see simpleGrid.Triplex_line#getLength()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EAttribute getTriplex_line_Length();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phases</em>'.
	 * @see simpleGrid.Triplex_line#getPhases()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EAttribute getTriplex_line_Phases();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Triplex_line#getTriplex_line_configuration <em>Triplex line configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triplex line configuration</em>'.
	 * @see simpleGrid.Triplex_line#getTriplex_line_configuration()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EReference getTriplex_line_Triplex_line_configuration();

	/**
	 * Returns the meta object for the reference list '{@link simpleGrid.Triplex_line#getTriplex_meter <em>Triplex meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triplex meter</em>'.
	 * @see simpleGrid.Triplex_line#getTriplex_meter()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EReference getTriplex_line_Triplex_meter();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see simpleGrid.Triplex_line#getFrom()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EAttribute getTriplex_line_From();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see simpleGrid.Triplex_line#getTo()
	 * @see #getTriplex_line()
	 * @generated
	 */
	EAttribute getTriplex_line_To();

	/**
	 * Returns the meta object for class '{@link simpleGrid.Triplex_line_conductor <em>Triplex line conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triplex line conductor</em>'.
	 * @see simpleGrid.Triplex_line_conductor
	 * @generated
	 */
	EClass getTriplex_line_conductor();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line_conductor#getResistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resistance</em>'.
	 * @see simpleGrid.Triplex_line_conductor#getResistance()
	 * @see #getTriplex_line_conductor()
	 * @generated
	 */
	EAttribute getTriplex_line_conductor_Resistance();

	/**
	 * Returns the meta object for the attribute '{@link simpleGrid.Triplex_line_conductor#getGeometric_mean_radius <em>Geometric mean radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometric mean radius</em>'.
	 * @see simpleGrid.Triplex_line_conductor#getGeometric_mean_radius()
	 * @see #getTriplex_line_conductor()
	 * @generated
	 */
	EAttribute getTriplex_line_conductor_Geometric_mean_radius();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleGridFactory getSimpleGridFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simpleGrid.impl.ClimateImpl <em>Climate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.ClimateImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getClimate()
		 * @generated
		 */
		EClass CLIMATE = eINSTANCE.getClimate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIMATE__NAME = eINSTANCE.getClimate_Name();

		/**
		 * The meta object literal for the '<em><b>Tmyfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIMATE__TMYFILE = eINSTANCE.getClimate_Tmyfile();

		/**
		 * The meta object literal for the '<em><b>Interpolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIMATE__INTERPOLATE = eINSTANCE.getClimate_Interpolate();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.Triplex_Line_configurationImpl <em>Triplex Line configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.Triplex_Line_configurationImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_Line_configuration()
		 * @generated
		 */
		EClass TRIPLEX_LINE_CONFIGURATION = eINSTANCE.getTriplex_Line_configuration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE_CONFIGURATION__NAME = eINSTANCE.getTriplex_Line_configuration_Name();

		/**
		 * The meta object literal for the '<em><b>Insulation thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS = eINSTANCE.getTriplex_Line_configuration_Insulation_thickness();

		/**
		 * The meta object literal for the '<em><b>Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE_CONFIGURATION__DIAMETER = eINSTANCE.getTriplex_Line_configuration_Diameter();

		/**
		 * The meta object literal for the '<em><b>Triplex line conductor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR = eINSTANCE.getTriplex_Line_configuration_Triplex_line_conductor();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.Transformer_configurationImpl <em>Transformer configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.Transformer_configurationImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTransformer_configuration()
		 * @generated
		 */
		EClass TRANSFORMER_CONFIGURATION = eINSTANCE.getTransformer_configuration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__NAME = eINSTANCE.getTransformer_configuration_Name();

		/**
		 * The meta object literal for the '<em><b>Connect type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__CONNECT_TYPE = eINSTANCE.getTransformer_configuration_Connect_type();

		/**
		 * The meta object literal for the '<em><b>Install type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__INSTALL_TYPE = eINSTANCE.getTransformer_configuration_Install_type();

		/**
		 * The meta object literal for the '<em><b>Power rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__POWER_RATING = eINSTANCE.getTransformer_configuration_Power_rating();

		/**
		 * The meta object literal for the '<em><b>Impedence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__IMPEDENCE = eINSTANCE.getTransformer_configuration_Impedence();

		/**
		 * The meta object literal for the '<em><b>Impedence1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__IMPEDENCE1 = eINSTANCE.getTransformer_configuration_Impedence1();

		/**
		 * The meta object literal for the '<em><b>Impedence2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__IMPEDENCE2 = eINSTANCE.getTransformer_configuration_Impedence2();

		/**
		 * The meta object literal for the '<em><b>Shunt impedence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE = eINSTANCE.getTransformer_configuration_Shunt_impedence();

		/**
		 * The meta object literal for the '<em><b>Primary voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE = eINSTANCE.getTransformer_configuration_Primary_voltage();

		/**
		 * The meta object literal for the '<em><b>Secondary voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE = eINSTANCE.getTransformer_configuration_Secondary_voltage();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.NodeImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PHASES = eINSTANCE.getNode_Phases();

		/**
		 * The meta object literal for the '<em><b>Bustype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BUSTYPE = eINSTANCE.getNode_Bustype();

		/**
		 * The meta object literal for the '<em><b>Transformer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TRANSFORMER = eINSTANCE.getNode_Transformer();

		/**
		 * The meta object literal for the '<em><b>Voltage C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VOLTAGE_C = eINSTANCE.getNode_Voltage_C();

		/**
		 * The meta object literal for the '<em><b>Voltage B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VOLTAGE_B = eINSTANCE.getNode_Voltage_B();

		/**
		 * The meta object literal for the '<em><b>Voltage A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VOLTAGE_A = eINSTANCE.getNode_Voltage_A();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.TransformerImpl <em>Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.TransformerImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTransformer()
		 * @generated
		 */
		EClass TRANSFORMER = eINSTANCE.getTransformer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__NAME = eINSTANCE.getTransformer_Name();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__PHASES = eINSTANCE.getTransformer_Phases();

		/**
		 * The meta object literal for the '<em><b>Transformer configuration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER__TRANSFORMER_CONFIGURATION = eINSTANCE.getTransformer_Transformer_configuration();

		/**
		 * The meta object literal for the '<em><b>Groupid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__GROUPID = eINSTANCE.getTransformer_Groupid();

		/**
		 * The meta object literal for the '<em><b>Triplex node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER__TRIPLEX_NODE = eINSTANCE.getTransformer_Triplex_node();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__FROM = eINSTANCE.getTransformer_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMER__TO = eINSTANCE.getTransformer_To();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.Triplex_nodeImpl <em>Triplex node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.Triplex_nodeImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_node()
		 * @generated
		 */
		EClass TRIPLEX_NODE = eINSTANCE.getTriplex_node();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_NODE__LENGTH = eINSTANCE.getTriplex_node_Length();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_NODE__NAME = eINSTANCE.getTriplex_node_Name();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_NODE__PHASES = eINSTANCE.getTriplex_node_Phases();

		/**
		 * The meta object literal for the '<em><b>Triplex line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLEX_NODE__TRIPLEX_LINE = eINSTANCE.getTriplex_node_Triplex_line();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_NODE__FROM = eINSTANCE.getTriplex_node_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_NODE__TO = eINSTANCE.getTriplex_node_To();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.Triplex_meterImpl <em>Triplex meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.Triplex_meterImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_meter()
		 * @generated
		 */
		EClass TRIPLEX_METER = eINSTANCE.getTriplex_meter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_METER__NAME = eINSTANCE.getTriplex_meter_Name();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_METER__PHASES = eINSTANCE.getTriplex_meter_Phases();

		/**
		 * The meta object literal for the '<em><b>Normal voltages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_METER__NORMAL_VOLTAGES = eINSTANCE.getTriplex_meter_Normal_voltages();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLEX_METER__HOUSE = eINSTANCE.getTriplex_meter_House();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.HouseImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__NAME = eINSTANCE.getHouse_Name();

		/**
		 * The meta object literal for the '<em><b>Schedule skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__SCHEDULE_SKEW = eINSTANCE.getHouse_Schedule_skew();

		/**
		 * The meta object literal for the '<em><b>Air temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__AIR_TEMPERATURE = eINSTANCE.getHouse_Air_temperature();

		/**
		 * The meta object literal for the '<em><b>Floor area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__FLOOR_AREA = eINSTANCE.getHouse_Floor_area();

		/**
		 * The meta object literal for the '<em><b>Cooling setpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__COOLING_SETPOINT = eINSTANCE.getHouse_Cooling_setpoint();

		/**
		 * The meta object literal for the '<em><b>Heating setpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__HEATING_SETPOINT = eINSTANCE.getHouse_Heating_setpoint();

		/**
		 * The meta object literal for the '<em><b>Thermal integrity level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__THERMAL_INTEGRITY_LEVEL = eINSTANCE.getHouse_Thermal_integrity_level();

		/**
		 * The meta object literal for the '<em><b>Motor model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__MOTOR_MODEL = eINSTANCE.getHouse_Motor_model();

		/**
		 * The meta object literal for the '<em><b>Motor efficiency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__MOTOR_EFFICIENCY = eINSTANCE.getHouse_Motor_efficiency();

		/**
		 * The meta object literal for the '<em><b>Mass temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__MASS_TEMPERATURE = eINSTANCE.getHouse_Mass_temperature();

		/**
		 * The meta object literal for the '<em><b>Heating system type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__HEATING_SYSTEM_TYPE = eINSTANCE.getHouse_Heating_system_type();

		/**
		 * The meta object literal for the '<em><b>Heating COP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__HEATING_COP = eINSTANCE.getHouse_Heating_COP();

		/**
		 * The meta object literal for the '<em><b>Auxiliary strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__AUXILIARY_STRATEGY = eINSTANCE.getHouse_Auxiliary_strategy();

		/**
		 * The meta object literal for the '<em><b>Auxiliary system type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__AUXILIARY_SYSTEM_TYPE = eINSTANCE.getHouse_Auxiliary_system_type();

		/**
		 * The meta object literal for the '<em><b>Cooling COP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__COOLING_COP = eINSTANCE.getHouse_Cooling_COP();

		/**
		 * The meta object literal for the '<em><b>Waterheater</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__WATERHEATER = eINSTANCE.getHouse_Waterheater();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__PARENT = eINSTANCE.getHouse_Parent();

		/**
		 * The meta object literal for the '<em><b>Aux heat temperature lockout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT = eINSTANCE.getHouse_Aux_heat_temperature_lockout();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.WaterheaterImpl <em>Waterheater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.WaterheaterImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getWaterheater()
		 * @generated
		 */
		EClass WATERHEATER = eINSTANCE.getWaterheater();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__NAME = eINSTANCE.getWaterheater_Name();

		/**
		 * The meta object literal for the '<em><b>Tank volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__TANK_VOLUME = eINSTANCE.getWaterheater_Tank_volume();

		/**
		 * The meta object literal for the '<em><b>Tank setpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__TANK_SETPOINT = eINSTANCE.getWaterheater_Tank_setpoint();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__TEMPERATURE = eINSTANCE.getWaterheater_Temperature();

		/**
		 * The meta object literal for the '<em><b>Thermostat deadband</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__THERMOSTAT_DEADBAND = eINSTANCE.getWaterheater_Thermostat_deadband();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__LOCATION = eINSTANCE.getWaterheater_Location();

		/**
		 * The meta object literal for the '<em><b>Tank UA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__TANK_UA = eINSTANCE.getWaterheater_Tank_UA();

		/**
		 * The meta object literal for the '<em><b>Schedule skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__SCHEDULE_SKEW = eINSTANCE.getWaterheater_Schedule_skew();

		/**
		 * The meta object literal for the '<em><b>Demand skew</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__DEMAND_SKEW = eINSTANCE.getWaterheater_Demand_skew();

		/**
		 * The meta object literal for the '<em><b>Heating element capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATERHEATER__HEATING_ELEMENT_CAPACITY = eINSTANCE.getWaterheater_Heating_element_capacity();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.GridImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Climate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__CLIMATE = eINSTANCE.getGrid_Climate();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__NODE = eINSTANCE.getGrid_Node();

		/**
		 * The meta object literal for the '<em><b>Transformer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRANSFORMER = eINSTANCE.getGrid_Transformer();

		/**
		 * The meta object literal for the '<em><b>Transformer configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRANSFORMER_CONFIGURATION = eINSTANCE.getGrid_Transformer_configuration();

		/**
		 * The meta object literal for the '<em><b>Triplex nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRIPLEX_NODES = eINSTANCE.getGrid_Triplex_nodes();

		/**
		 * The meta object literal for the '<em><b>Triplex line configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRIPLEX_LINE_CONFIGURATION = eINSTANCE.getGrid_Triplex_line_configuration();

		/**
		 * The meta object literal for the '<em><b>Triplex line conductor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRIPLEX_LINE_CONDUCTOR = eINSTANCE.getGrid_Triplex_line_conductor();

		/**
		 * The meta object literal for the '<em><b>Triplex line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRIPLEX_LINE = eINSTANCE.getGrid_Triplex_line();

		/**
		 * The meta object literal for the '<em><b>Triplex meter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__TRIPLEX_METER = eINSTANCE.getGrid_Triplex_meter();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__HOUSE = eINSTANCE.getGrid_House();

		/**
		 * The meta object literal for the '<em><b>Waterheater</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__WATERHEATER = eINSTANCE.getGrid_Waterheater();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.Triplex_lineImpl <em>Triplex line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.Triplex_lineImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_line()
		 * @generated
		 */
		EClass TRIPLEX_LINE = eINSTANCE.getTriplex_line();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE__NAME = eINSTANCE.getTriplex_line_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE__LENGTH = eINSTANCE.getTriplex_line_Length();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE__PHASES = eINSTANCE.getTriplex_line_Phases();

		/**
		 * The meta object literal for the '<em><b>Triplex line configuration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION = eINSTANCE.getTriplex_line_Triplex_line_configuration();

		/**
		 * The meta object literal for the '<em><b>Triplex meter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLEX_LINE__TRIPLEX_METER = eINSTANCE.getTriplex_line_Triplex_meter();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE__FROM = eINSTANCE.getTriplex_line_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE__TO = eINSTANCE.getTriplex_line_To();

		/**
		 * The meta object literal for the '{@link simpleGrid.impl.Triplex_line_conductorImpl <em>Triplex line conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simpleGrid.impl.Triplex_line_conductorImpl
		 * @see simpleGrid.impl.SimpleGridPackageImpl#getTriplex_line_conductor()
		 * @generated
		 */
		EClass TRIPLEX_LINE_CONDUCTOR = eINSTANCE.getTriplex_line_conductor();

		/**
		 * The meta object literal for the '<em><b>Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE_CONDUCTOR__RESISTANCE = eINSTANCE.getTriplex_line_conductor_Resistance();

		/**
		 * The meta object literal for the '<em><b>Geometric mean radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS = eINSTANCE.getTriplex_line_conductor_Geometric_mean_radius();

	}

} //SimpleGridPackage
