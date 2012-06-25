/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simpleGrid.Climate;
import simpleGrid.Grid;
import simpleGrid.House;
import simpleGrid.Node;
import simpleGrid.SimpleGridFactory;
import simpleGrid.SimpleGridPackage;
import simpleGrid.Transformer;
import simpleGrid.Transformer_configuration;
import simpleGrid.Triplex_Line_configuration;
import simpleGrid.Triplex_line;
import simpleGrid.Triplex_line_conductor;
import simpleGrid.Triplex_meter;
import simpleGrid.Triplex_node;
import simpleGrid.Waterheater;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleGridPackageImpl extends EPackageImpl implements SimpleGridPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass climateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triplex_Line_configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformer_configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triplex_nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triplex_meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterheaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triplex_lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triplex_line_conductorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simpleGrid.SimpleGridPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimpleGridPackageImpl() {
		super(eNS_URI, SimpleGridFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimpleGridPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimpleGridPackage init() {
		if (isInited) return (SimpleGridPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleGridPackage.eNS_URI);

		// Obtain or create and register package
		SimpleGridPackageImpl theSimpleGridPackage = (SimpleGridPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleGridPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleGridPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimpleGridPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleGridPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleGridPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimpleGridPackage.eNS_URI, theSimpleGridPackage);
		return theSimpleGridPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClimate() {
		return climateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClimate_Name() {
		return (EAttribute)climateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClimate_Tmyfile() {
		return (EAttribute)climateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClimate_Interpolate() {
		return (EAttribute)climateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriplex_Line_configuration() {
		return triplex_Line_configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_Line_configuration_Name() {
		return (EAttribute)triplex_Line_configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_Line_configuration_Insulation_thickness() {
		return (EAttribute)triplex_Line_configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_Line_configuration_Diameter() {
		return (EAttribute)triplex_Line_configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriplex_Line_configuration_Triplex_line_conductor() {
		return (EReference)triplex_Line_configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformer_configuration() {
		return transformer_configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Name() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Connect_type() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Install_type() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Power_rating() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Impedence() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Impedence1() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Impedence2() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Shunt_impedence() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Primary_voltage() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_configuration_Secondary_voltage() {
		return (EAttribute)transformer_configurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Phases() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Bustype() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Transformer() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Voltage_C() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Voltage_B() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Voltage_A() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformer() {
		return transformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_Name() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_Phases() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformer_Transformer_configuration() {
		return (EReference)transformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_Groupid() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformer_Triplex_node() {
		return (EReference)transformerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_From() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformer_To() {
		return (EAttribute)transformerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriplex_node() {
		return triplex_nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_node_Length() {
		return (EAttribute)triplex_nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_node_Name() {
		return (EAttribute)triplex_nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_node_Phases() {
		return (EAttribute)triplex_nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriplex_node_Triplex_line() {
		return (EReference)triplex_nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_node_From() {
		return (EAttribute)triplex_nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_node_To() {
		return (EAttribute)triplex_nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriplex_meter() {
		return triplex_meterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_meter_Name() {
		return (EAttribute)triplex_meterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_meter_Phases() {
		return (EAttribute)triplex_meterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_meter_Normal_voltages() {
		return (EAttribute)triplex_meterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriplex_meter_House() {
		return (EReference)triplex_meterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Name() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Schedule_skew() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Air_temperature() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Floor_area() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Cooling_setpoint() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Heating_setpoint() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Thermal_integrity_level() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Motor_model() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Motor_efficiency() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Mass_temperature() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Heating_system_type() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Heating_COP() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Auxiliary_strategy() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Auxiliary_system_type() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Cooling_COP() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Waterheater() {
		return (EReference)houseEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Parent() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Aux_heat_temperature_lockout() {
		return (EAttribute)houseEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterheater() {
		return waterheaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Name() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Tank_volume() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Tank_setpoint() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Temperature() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Thermostat_deadband() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Location() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Tank_UA() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Schedule_skew() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Demand_skew() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWaterheater_Heating_element_capacity() {
		return (EAttribute)waterheaterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrid() {
		return gridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Climate() {
		return (EReference)gridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Node() {
		return (EReference)gridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Transformer() {
		return (EReference)gridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Transformer_configuration() {
		return (EReference)gridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Triplex_nodes() {
		return (EReference)gridEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Triplex_line_configuration() {
		return (EReference)gridEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Triplex_line_conductor() {
		return (EReference)gridEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Triplex_line() {
		return (EReference)gridEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Triplex_meter() {
		return (EReference)gridEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_House() {
		return (EReference)gridEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrid_Waterheater() {
		return (EReference)gridEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriplex_line() {
		return triplex_lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_Name() {
		return (EAttribute)triplex_lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_Length() {
		return (EAttribute)triplex_lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_Phases() {
		return (EAttribute)triplex_lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriplex_line_Triplex_line_configuration() {
		return (EReference)triplex_lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriplex_line_Triplex_meter() {
		return (EReference)triplex_lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_From() {
		return (EAttribute)triplex_lineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_To() {
		return (EAttribute)triplex_lineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriplex_line_conductor() {
		return triplex_line_conductorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_conductor_Resistance() {
		return (EAttribute)triplex_line_conductorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplex_line_conductor_Geometric_mean_radius() {
		return (EAttribute)triplex_line_conductorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleGridFactory getSimpleGridFactory() {
		return (SimpleGridFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		climateEClass = createEClass(CLIMATE);
		createEAttribute(climateEClass, CLIMATE__NAME);
		createEAttribute(climateEClass, CLIMATE__TMYFILE);
		createEAttribute(climateEClass, CLIMATE__INTERPOLATE);

		triplex_Line_configurationEClass = createEClass(TRIPLEX_LINE_CONFIGURATION);
		createEAttribute(triplex_Line_configurationEClass, TRIPLEX_LINE_CONFIGURATION__NAME);
		createEAttribute(triplex_Line_configurationEClass, TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS);
		createEAttribute(triplex_Line_configurationEClass, TRIPLEX_LINE_CONFIGURATION__DIAMETER);
		createEReference(triplex_Line_configurationEClass, TRIPLEX_LINE_CONFIGURATION__TRIPLEX_LINE_CONDUCTOR);

		transformer_configurationEClass = createEClass(TRANSFORMER_CONFIGURATION);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__NAME);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__CONNECT_TYPE);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__INSTALL_TYPE);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__POWER_RATING);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__IMPEDENCE);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__IMPEDENCE1);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__IMPEDENCE2);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__SHUNT_IMPEDENCE);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE);
		createEAttribute(transformer_configurationEClass, TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEAttribute(nodeEClass, NODE__PHASES);
		createEAttribute(nodeEClass, NODE__BUSTYPE);
		createEReference(nodeEClass, NODE__TRANSFORMER);
		createEAttribute(nodeEClass, NODE__VOLTAGE_C);
		createEAttribute(nodeEClass, NODE__VOLTAGE_B);
		createEAttribute(nodeEClass, NODE__VOLTAGE_A);

		transformerEClass = createEClass(TRANSFORMER);
		createEAttribute(transformerEClass, TRANSFORMER__NAME);
		createEAttribute(transformerEClass, TRANSFORMER__PHASES);
		createEReference(transformerEClass, TRANSFORMER__TRANSFORMER_CONFIGURATION);
		createEAttribute(transformerEClass, TRANSFORMER__GROUPID);
		createEReference(transformerEClass, TRANSFORMER__TRIPLEX_NODE);
		createEAttribute(transformerEClass, TRANSFORMER__FROM);
		createEAttribute(transformerEClass, TRANSFORMER__TO);

		triplex_nodeEClass = createEClass(TRIPLEX_NODE);
		createEAttribute(triplex_nodeEClass, TRIPLEX_NODE__LENGTH);
		createEAttribute(triplex_nodeEClass, TRIPLEX_NODE__NAME);
		createEAttribute(triplex_nodeEClass, TRIPLEX_NODE__PHASES);
		createEReference(triplex_nodeEClass, TRIPLEX_NODE__TRIPLEX_LINE);
		createEAttribute(triplex_nodeEClass, TRIPLEX_NODE__FROM);
		createEAttribute(triplex_nodeEClass, TRIPLEX_NODE__TO);

		triplex_meterEClass = createEClass(TRIPLEX_METER);
		createEAttribute(triplex_meterEClass, TRIPLEX_METER__NAME);
		createEAttribute(triplex_meterEClass, TRIPLEX_METER__PHASES);
		createEAttribute(triplex_meterEClass, TRIPLEX_METER__NORMAL_VOLTAGES);
		createEReference(triplex_meterEClass, TRIPLEX_METER__HOUSE);

		houseEClass = createEClass(HOUSE);
		createEAttribute(houseEClass, HOUSE__NAME);
		createEAttribute(houseEClass, HOUSE__SCHEDULE_SKEW);
		createEAttribute(houseEClass, HOUSE__AIR_TEMPERATURE);
		createEAttribute(houseEClass, HOUSE__FLOOR_AREA);
		createEAttribute(houseEClass, HOUSE__COOLING_SETPOINT);
		createEAttribute(houseEClass, HOUSE__HEATING_SETPOINT);
		createEAttribute(houseEClass, HOUSE__THERMAL_INTEGRITY_LEVEL);
		createEAttribute(houseEClass, HOUSE__MOTOR_MODEL);
		createEAttribute(houseEClass, HOUSE__MOTOR_EFFICIENCY);
		createEAttribute(houseEClass, HOUSE__MASS_TEMPERATURE);
		createEAttribute(houseEClass, HOUSE__HEATING_SYSTEM_TYPE);
		createEAttribute(houseEClass, HOUSE__HEATING_COP);
		createEAttribute(houseEClass, HOUSE__AUXILIARY_STRATEGY);
		createEAttribute(houseEClass, HOUSE__AUXILIARY_SYSTEM_TYPE);
		createEAttribute(houseEClass, HOUSE__COOLING_COP);
		createEReference(houseEClass, HOUSE__WATERHEATER);
		createEAttribute(houseEClass, HOUSE__PARENT);
		createEAttribute(houseEClass, HOUSE__AUX_HEAT_TEMPERATURE_LOCKOUT);

		waterheaterEClass = createEClass(WATERHEATER);
		createEAttribute(waterheaterEClass, WATERHEATER__NAME);
		createEAttribute(waterheaterEClass, WATERHEATER__TANK_VOLUME);
		createEAttribute(waterheaterEClass, WATERHEATER__TANK_SETPOINT);
		createEAttribute(waterheaterEClass, WATERHEATER__TEMPERATURE);
		createEAttribute(waterheaterEClass, WATERHEATER__THERMOSTAT_DEADBAND);
		createEAttribute(waterheaterEClass, WATERHEATER__LOCATION);
		createEAttribute(waterheaterEClass, WATERHEATER__TANK_UA);
		createEAttribute(waterheaterEClass, WATERHEATER__SCHEDULE_SKEW);
		createEAttribute(waterheaterEClass, WATERHEATER__DEMAND_SKEW);
		createEAttribute(waterheaterEClass, WATERHEATER__HEATING_ELEMENT_CAPACITY);

		gridEClass = createEClass(GRID);
		createEReference(gridEClass, GRID__CLIMATE);
		createEReference(gridEClass, GRID__NODE);
		createEReference(gridEClass, GRID__TRANSFORMER);
		createEReference(gridEClass, GRID__TRANSFORMER_CONFIGURATION);
		createEReference(gridEClass, GRID__TRIPLEX_NODES);
		createEReference(gridEClass, GRID__TRIPLEX_LINE_CONFIGURATION);
		createEReference(gridEClass, GRID__TRIPLEX_LINE_CONDUCTOR);
		createEReference(gridEClass, GRID__TRIPLEX_LINE);
		createEReference(gridEClass, GRID__TRIPLEX_METER);
		createEReference(gridEClass, GRID__HOUSE);
		createEReference(gridEClass, GRID__WATERHEATER);

		triplex_lineEClass = createEClass(TRIPLEX_LINE);
		createEAttribute(triplex_lineEClass, TRIPLEX_LINE__NAME);
		createEAttribute(triplex_lineEClass, TRIPLEX_LINE__LENGTH);
		createEAttribute(triplex_lineEClass, TRIPLEX_LINE__PHASES);
		createEReference(triplex_lineEClass, TRIPLEX_LINE__TRIPLEX_LINE_CONFIGURATION);
		createEReference(triplex_lineEClass, TRIPLEX_LINE__TRIPLEX_METER);
		createEAttribute(triplex_lineEClass, TRIPLEX_LINE__FROM);
		createEAttribute(triplex_lineEClass, TRIPLEX_LINE__TO);

		triplex_line_conductorEClass = createEClass(TRIPLEX_LINE_CONDUCTOR);
		createEAttribute(triplex_line_conductorEClass, TRIPLEX_LINE_CONDUCTOR__RESISTANCE);
		createEAttribute(triplex_line_conductorEClass, TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(climateEClass, Climate.class, "Climate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClimate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Climate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClimate_Tmyfile(), ecorePackage.getEString(), "tmyfile", null, 0, 1, Climate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClimate_Interpolate(), ecorePackage.getEString(), "interpolate", null, 0, 1, Climate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triplex_Line_configurationEClass, Triplex_Line_configuration.class, "Triplex_Line_configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriplex_Line_configuration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Triplex_Line_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_Line_configuration_Insulation_thickness(), ecorePackage.getEString(), "insulation_thickness", null, 0, 1, Triplex_Line_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_Line_configuration_Diameter(), ecorePackage.getEString(), "diameter", null, 0, 1, Triplex_Line_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriplex_Line_configuration_Triplex_line_conductor(), this.getTriplex_line_conductor(), null, "triplex_line_conductor", null, 0, -1, Triplex_Line_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformer_configurationEClass, Transformer_configuration.class, "Transformer_configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformer_configuration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Connect_type(), ecorePackage.getEString(), "connect_type", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Install_type(), ecorePackage.getEString(), "install_type", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Power_rating(), ecorePackage.getEString(), "power_rating", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Impedence(), ecorePackage.getEString(), "impedence", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Impedence1(), ecorePackage.getEString(), "impedence1", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Impedence2(), ecorePackage.getEString(), "impedence2", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Shunt_impedence(), ecorePackage.getEString(), "shunt_impedence", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Primary_voltage(), ecorePackage.getEString(), "primary_voltage", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_configuration_Secondary_voltage(), ecorePackage.getEString(), "secondary_voltage", null, 0, 1, Transformer_configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Phases(), ecorePackage.getEString(), "phases", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Bustype(), ecorePackage.getEString(), "bustype", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Transformer(), this.getTransformer(), null, "transformer", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Voltage_C(), ecorePackage.getEString(), "voltage_C", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Voltage_B(), ecorePackage.getEString(), "voltage_B", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Voltage_A(), ecorePackage.getEString(), "voltage_A", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformerEClass, Transformer.class, "Transformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_Phases(), ecorePackage.getEString(), "phases", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformer_Transformer_configuration(), this.getTransformer_configuration(), null, "transformer_configuration", null, 0, -1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_Groupid(), ecorePackage.getEString(), "groupid", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformer_Triplex_node(), this.getTriplex_node(), null, "triplex_node", null, 0, -1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_From(), ecorePackage.getEString(), "from", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformer_To(), ecorePackage.getEString(), "to", null, 0, 1, Transformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triplex_nodeEClass, Triplex_node.class, "Triplex_node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriplex_node_Length(), ecorePackage.getEString(), "length", null, 0, 1, Triplex_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_node_Name(), ecorePackage.getEString(), "name", null, 0, 1, Triplex_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_node_Phases(), ecorePackage.getEString(), "phases", null, 0, 1, Triplex_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriplex_node_Triplex_line(), this.getTriplex_line(), null, "triplex_line", null, 0, -1, Triplex_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_node_From(), ecorePackage.getEString(), "from", null, 0, 1, Triplex_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_node_To(), ecorePackage.getEString(), "to", null, 0, 1, Triplex_node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triplex_meterEClass, Triplex_meter.class, "Triplex_meter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriplex_meter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Triplex_meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_meter_Phases(), ecorePackage.getEString(), "phases", null, 0, 1, Triplex_meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_meter_Normal_voltages(), ecorePackage.getEString(), "normal_voltages", null, 0, 1, Triplex_meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriplex_meter_House(), this.getHouse(), null, "house", null, 0, -1, Triplex_meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouse_Name(), ecorePackage.getEString(), "name", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Schedule_skew(), ecorePackage.getEString(), "schedule_skew", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Air_temperature(), ecorePackage.getEString(), "air_temperature", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Floor_area(), ecorePackage.getEString(), "floor_area", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Cooling_setpoint(), ecorePackage.getEString(), "cooling_setpoint", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Heating_setpoint(), ecorePackage.getEString(), "heating_setpoint", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Thermal_integrity_level(), ecorePackage.getEString(), "thermal_integrity_level", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Motor_model(), ecorePackage.getEString(), "motor_model", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Motor_efficiency(), ecorePackage.getEString(), "motor_efficiency", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Mass_temperature(), ecorePackage.getEString(), "mass_temperature", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Heating_system_type(), ecorePackage.getEString(), "heating_system_type", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Heating_COP(), ecorePackage.getEString(), "heating_COP", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Auxiliary_strategy(), ecorePackage.getEString(), "auxiliary_strategy", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Auxiliary_system_type(), ecorePackage.getEString(), "auxiliary_system_type", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Cooling_COP(), ecorePackage.getEString(), "cooling_COP", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Waterheater(), this.getWaterheater(), null, "waterheater", null, 0, -1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Parent(), ecorePackage.getEString(), "parent", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHouse_Aux_heat_temperature_lockout(), ecorePackage.getEString(), "aux_heat_temperature_lockout", null, 0, 1, House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waterheaterEClass, Waterheater.class, "Waterheater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaterheater_Name(), ecorePackage.getEString(), "name", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Tank_volume(), ecorePackage.getEString(), "tank_volume", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Tank_setpoint(), ecorePackage.getEString(), "tank_setpoint", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Temperature(), ecorePackage.getEString(), "temperature", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Thermostat_deadband(), ecorePackage.getEString(), "thermostat_deadband", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Location(), ecorePackage.getEString(), "location", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Tank_UA(), ecorePackage.getEString(), "tank_UA", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Schedule_skew(), ecorePackage.getEString(), "schedule_skew", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Demand_skew(), ecorePackage.getEString(), "demand_skew", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaterheater_Heating_element_capacity(), ecorePackage.getEString(), "heating_element_capacity", null, 0, 1, Waterheater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridEClass, Grid.class, "Grid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrid_Climate(), this.getClimate(), null, "climate", null, 1, 1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Node(), this.getNode(), null, "node", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Transformer(), this.getTransformer(), null, "transformer", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Transformer_configuration(), this.getTransformer_configuration(), null, "transformer_configuration", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Triplex_nodes(), this.getTriplex_node(), null, "triplex_nodes", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Triplex_line_configuration(), this.getTriplex_Line_configuration(), null, "triplex_line_configuration", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Triplex_line_conductor(), this.getTriplex_line_conductor(), null, "triplex_line_conductor", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Triplex_line(), this.getTriplex_line(), null, "triplex_line", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Triplex_meter(), this.getTriplex_meter(), null, "triplex_meter", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_House(), this.getHouse(), null, "house", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrid_Waterheater(), this.getWaterheater(), null, "waterheater", null, 0, -1, Grid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triplex_lineEClass, Triplex_line.class, "Triplex_line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriplex_line_Name(), ecorePackage.getEString(), "name", null, 0, 1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_line_Length(), ecorePackage.getEString(), "length", null, 0, 1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_line_Phases(), ecorePackage.getEString(), "phases", null, 0, 1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriplex_line_Triplex_line_configuration(), this.getTriplex_Line_configuration(), null, "triplex_line_configuration", null, 0, -1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriplex_line_Triplex_meter(), this.getTriplex_meter(), null, "triplex_meter", null, 0, -1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_line_From(), ecorePackage.getEString(), "from", null, 0, 1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_line_To(), ecorePackage.getEString(), "to", null, 0, 1, Triplex_line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triplex_line_conductorEClass, Triplex_line_conductor.class, "Triplex_line_conductor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriplex_line_conductor_Resistance(), ecorePackage.getEString(), "resistance", null, 0, 1, Triplex_line_conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplex_line_conductor_Geometric_mean_radius(), ecorePackage.getEString(), "geometric_mean_radius", null, 0, 1, Triplex_line_conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimpleGridPackageImpl
