/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import visGrid.Connections;
import visGrid.Substation;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.SubstationImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_energy <em>Distribution energy</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_power <em>Distribution power</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_demand <em>Distribution demand</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_voltage_A <em>Distribution voltage A</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_voltage_B <em>Distribution voltage B</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_voltage_C <em>Distribution voltage C</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_current_A <em>Distribution current A</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_current_B <em>Distribution current B</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getDistribution_current_C <em>Distribution current C</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getNetwork_Node_Base_Power <em>Network Node Base Power</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getNetwork_Node_Base_Voltage <em>Network Node Base Voltage</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.SubstationImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstationImpl extends EObjectImpl implements Substation {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> connection;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_energy() <em>Distribution energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_energy()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_ENERGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_energy() <em>Distribution energy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_energy()
	 * @generated
	 * @ordered
	 */
	protected String distribution_energy = DISTRIBUTION_ENERGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_power() <em>Distribution power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_power()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_power() <em>Distribution power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_power()
	 * @generated
	 * @ordered
	 */
	protected String distribution_power = DISTRIBUTION_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_demand() <em>Distribution demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_demand()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_demand() <em>Distribution demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_demand()
	 * @generated
	 * @ordered
	 */
	protected String distribution_demand = DISTRIBUTION_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_voltage_A() <em>Distribution voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_voltage_A()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_VOLTAGE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_voltage_A() <em>Distribution voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_voltage_A()
	 * @generated
	 * @ordered
	 */
	protected String distribution_voltage_A = DISTRIBUTION_VOLTAGE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_voltage_B() <em>Distribution voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_voltage_B()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_VOLTAGE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_voltage_B() <em>Distribution voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_voltage_B()
	 * @generated
	 * @ordered
	 */
	protected String distribution_voltage_B = DISTRIBUTION_VOLTAGE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_voltage_C() <em>Distribution voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_voltage_C()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_VOLTAGE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_voltage_C() <em>Distribution voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_voltage_C()
	 * @generated
	 * @ordered
	 */
	protected String distribution_voltage_C = DISTRIBUTION_VOLTAGE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_current_A() <em>Distribution current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_current_A()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_CURRENT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_current_A() <em>Distribution current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_current_A()
	 * @generated
	 * @ordered
	 */
	protected String distribution_current_A = DISTRIBUTION_CURRENT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_current_B() <em>Distribution current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_current_B()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_CURRENT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_current_B() <em>Distribution current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_current_B()
	 * @generated
	 * @ordered
	 */
	protected String distribution_current_B = DISTRIBUTION_CURRENT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution_current_C() <em>Distribution current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_current_C()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_CURRENT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution_current_C() <em>Distribution current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution_current_C()
	 * @generated
	 * @ordered
	 */
	protected String distribution_current_C = DISTRIBUTION_CURRENT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetwork_Node_Base_Power() <em>Network Node Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_Node_Base_Power()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NODE_BASE_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_Node_Base_Power() <em>Network Node Base Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_Node_Base_Power()
	 * @generated
	 * @ordered
	 */
	protected String network_Node_Base_Power = NETWORK_NODE_BASE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetwork_Node_Base_Voltage() <em>Network Node Base Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_Node_Base_Voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_NODE_BASE_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork_Node_Base_Voltage() <em>Network Node Base Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork_Node_Base_Voltage()
	 * @generated
	 * @ordered
	 */
	protected String network_Node_Base_Voltage = NETWORK_NODE_BASE_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBustype() <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBustype()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBustype() <em>Bustype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBustype()
	 * @generated
	 * @ordered
	 */
	protected String bustype = BUSTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusflags() <em>Busflags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusflags()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSFLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusflags() <em>Busflags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusflags()
	 * @generated
	 * @ordered
	 */
	protected String busflags = BUSFLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference_bus() <em>Reference bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_bus()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_BUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference_bus() <em>Reference bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference_bus()
	 * @generated
	 * @ordered
	 */
	protected String reference_bus = REFERENCE_BUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_voltage_error() <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_voltage_error()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VOLTAGE_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum_voltage_error() <em>Maximum voltage error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_voltage_error()
	 * @generated
	 * @ordered
	 */
	protected String maximum_voltage_error = MAXIMUM_VOLTAGE_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_A() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_A() <em>Voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_A()
	 * @generated
	 * @ordered
	 */
	protected String voltage_A = VOLTAGE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_B() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_B() <em>Voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_B()
	 * @generated
	 * @ordered
	 */
	protected String voltage_B = VOLTAGE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_C() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_C() <em>Voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_C()
	 * @generated
	 * @ordered
	 */
	protected String voltage_C = VOLTAGE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_AB() <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_AB()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_AB() <em>Voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_AB()
	 * @generated
	 * @ordered
	 */
	protected String voltage_AB = VOLTAGE_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_BC() <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_BC()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_BC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_BC() <em>Voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_BC()
	 * @generated
	 * @ordered
	 */
	protected String voltage_BC = VOLTAGE_BC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage_CA() <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_CA()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLTAGE_CA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage_CA() <em>Voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage_CA()
	 * @generated
	 * @ordered
	 */
	protected String voltage_CA = VOLTAGE_CA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_A() <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_A() <em>Current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_A()
	 * @generated
	 * @ordered
	 */
	protected String current_A = CURRENT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_B() <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_B() <em>Current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_B()
	 * @generated
	 * @ordered
	 */
	protected String current_B = CURRENT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent_C() <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrent_C() <em>Current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_C()
	 * @generated
	 * @ordered
	 */
	protected String current_C = CURRENT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_A() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_A() <em>Power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A()
	 * @generated
	 * @ordered
	 */
	protected String power_A = POWER_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_B() <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_B() <em>Power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B()
	 * @generated
	 * @ordered
	 */
	protected String power_B = POWER_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_C() <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_C() <em>Power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C()
	 * @generated
	 * @ordered
	 */
	protected String power_C = POWER_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_A() <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_A()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_A() <em>Shunt A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_A()
	 * @generated
	 * @ordered
	 */
	protected String shunt_A = SHUNT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_B() <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_B()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_B() <em>Shunt B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_B()
	 * @generated
	 * @ordered
	 */
	protected String shunt_B = SHUNT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getShunt_C() <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_C()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUNT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShunt_C() <em>Shunt C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShunt_C()
	 * @generated
	 * @ordered
	 */
	protected String shunt_C = SHUNT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhases()
	 * @generated
	 * @ordered
	 */
	protected String phases = PHASES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominal_voltage() <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominal_voltage() <em>Nominal voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal_voltage()
	 * @generated
	 * @ordered
	 */
	protected String nominal_voltage = NOMINAL_VOLTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getSubstation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.SUBSTATION__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_energy() {
		return distribution_energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_energy(String newDistribution_energy) {
		String oldDistribution_energy = distribution_energy;
		distribution_energy = newDistribution_energy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_ENERGY, oldDistribution_energy, distribution_energy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_power() {
		return distribution_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_power(String newDistribution_power) {
		String oldDistribution_power = distribution_power;
		distribution_power = newDistribution_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_POWER, oldDistribution_power, distribution_power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_demand() {
		return distribution_demand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_demand(String newDistribution_demand) {
		String oldDistribution_demand = distribution_demand;
		distribution_demand = newDistribution_demand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_DEMAND, oldDistribution_demand, distribution_demand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_voltage_A() {
		return distribution_voltage_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_voltage_A(String newDistribution_voltage_A) {
		String oldDistribution_voltage_A = distribution_voltage_A;
		distribution_voltage_A = newDistribution_voltage_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_A, oldDistribution_voltage_A, distribution_voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_voltage_B() {
		return distribution_voltage_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_voltage_B(String newDistribution_voltage_B) {
		String oldDistribution_voltage_B = distribution_voltage_B;
		distribution_voltage_B = newDistribution_voltage_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_B, oldDistribution_voltage_B, distribution_voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_voltage_C() {
		return distribution_voltage_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_voltage_C(String newDistribution_voltage_C) {
		String oldDistribution_voltage_C = distribution_voltage_C;
		distribution_voltage_C = newDistribution_voltage_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_C, oldDistribution_voltage_C, distribution_voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_current_A() {
		return distribution_current_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_current_A(String newDistribution_current_A) {
		String oldDistribution_current_A = distribution_current_A;
		distribution_current_A = newDistribution_current_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_A, oldDistribution_current_A, distribution_current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_current_B() {
		return distribution_current_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_current_B(String newDistribution_current_B) {
		String oldDistribution_current_B = distribution_current_B;
		distribution_current_B = newDistribution_current_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_B, oldDistribution_current_B, distribution_current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution_current_C() {
		return distribution_current_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution_current_C(String newDistribution_current_C) {
		String oldDistribution_current_C = distribution_current_C;
		distribution_current_C = newDistribution_current_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_C, oldDistribution_current_C, distribution_current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork_Node_Base_Power() {
		return network_Node_Base_Power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_Node_Base_Power(String newNetwork_Node_Base_Power) {
		String oldNetwork_Node_Base_Power = network_Node_Base_Power;
		network_Node_Base_Power = newNetwork_Node_Base_Power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_POWER, oldNetwork_Node_Base_Power, network_Node_Base_Power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetwork_Node_Base_Voltage() {
		return network_Node_Base_Voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork_Node_Base_Voltage(String newNetwork_Node_Base_Voltage) {
		String oldNetwork_Node_Base_Voltage = network_Node_Base_Voltage;
		network_Node_Base_Voltage = newNetwork_Node_Base_Voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_VOLTAGE, oldNetwork_Node_Base_Voltage, network_Node_Base_Voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBustype() {
		return bustype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBustype(String newBustype) {
		String oldBustype = bustype;
		bustype = newBustype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__BUSTYPE, oldBustype, bustype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusflags() {
		return busflags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusflags(String newBusflags) {
		String oldBusflags = busflags;
		busflags = newBusflags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__BUSFLAGS, oldBusflags, busflags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference_bus() {
		return reference_bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference_bus(String newReference_bus) {
		String oldReference_bus = reference_bus;
		reference_bus = newReference_bus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__REFERENCE_BUS, oldReference_bus, reference_bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum_voltage_error() {
		return maximum_voltage_error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum_voltage_error(String newMaximum_voltage_error) {
		String oldMaximum_voltage_error = maximum_voltage_error;
		maximum_voltage_error = newMaximum_voltage_error;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_A() {
		return voltage_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_A(String newVoltage_A) {
		String oldVoltage_A = voltage_A;
		voltage_A = newVoltage_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__VOLTAGE_A, oldVoltage_A, voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_B() {
		return voltage_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_B(String newVoltage_B) {
		String oldVoltage_B = voltage_B;
		voltage_B = newVoltage_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__VOLTAGE_B, oldVoltage_B, voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_C() {
		return voltage_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_C(String newVoltage_C) {
		String oldVoltage_C = voltage_C;
		voltage_C = newVoltage_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__VOLTAGE_C, oldVoltage_C, voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_AB() {
		return voltage_AB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_AB(String newVoltage_AB) {
		String oldVoltage_AB = voltage_AB;
		voltage_AB = newVoltage_AB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__VOLTAGE_AB, oldVoltage_AB, voltage_AB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_BC() {
		return voltage_BC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_BC(String newVoltage_BC) {
		String oldVoltage_BC = voltage_BC;
		voltage_BC = newVoltage_BC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__VOLTAGE_BC, oldVoltage_BC, voltage_BC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_CA() {
		return voltage_CA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage_CA(String newVoltage_CA) {
		String oldVoltage_CA = voltage_CA;
		voltage_CA = newVoltage_CA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__VOLTAGE_CA, oldVoltage_CA, voltage_CA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_A() {
		return current_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_A(String newCurrent_A) {
		String oldCurrent_A = current_A;
		current_A = newCurrent_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__CURRENT_A, oldCurrent_A, current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_B() {
		return current_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_B(String newCurrent_B) {
		String oldCurrent_B = current_B;
		current_B = newCurrent_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__CURRENT_B, oldCurrent_B, current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_C() {
		return current_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent_C(String newCurrent_C) {
		String oldCurrent_C = current_C;
		current_C = newCurrent_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__CURRENT_C, oldCurrent_C, current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A() {
		return power_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_A(String newPower_A) {
		String oldPower_A = power_A;
		power_A = newPower_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__POWER_A, oldPower_A, power_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B() {
		return power_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_B(String newPower_B) {
		String oldPower_B = power_B;
		power_B = newPower_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__POWER_B, oldPower_B, power_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C() {
		return power_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_C(String newPower_C) {
		String oldPower_C = power_C;
		power_C = newPower_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__POWER_C, oldPower_C, power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_A() {
		return shunt_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_A(String newShunt_A) {
		String oldShunt_A = shunt_A;
		shunt_A = newShunt_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__SHUNT_A, oldShunt_A, shunt_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_B() {
		return shunt_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_B(String newShunt_B) {
		String oldShunt_B = shunt_B;
		shunt_B = newShunt_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__SHUNT_B, oldShunt_B, shunt_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_C() {
		return shunt_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShunt_C(String newShunt_C) {
		String oldShunt_C = shunt_C;
		shunt_C = newShunt_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__SHUNT_C, oldShunt_C, shunt_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
		return phases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhases(String newPhases) {
		String oldPhases = phases;
		phases = newPhases;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominal_voltage() {
		return nominal_voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominal_voltage(String newNominal_voltage) {
		String oldNominal_voltage = nominal_voltage;
		nominal_voltage = newNominal_voltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.SUBSTATION__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.SUBSTATION__CONNECTION:
				return getConnection();
			case VisGridPackage.SUBSTATION__NAME:
				return getName();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_ENERGY:
				return getDistribution_energy();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_POWER:
				return getDistribution_power();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_DEMAND:
				return getDistribution_demand();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_A:
				return getDistribution_voltage_A();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_B:
				return getDistribution_voltage_B();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_C:
				return getDistribution_voltage_C();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_A:
				return getDistribution_current_A();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_B:
				return getDistribution_current_B();
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_C:
				return getDistribution_current_C();
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_POWER:
				return getNetwork_Node_Base_Power();
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_VOLTAGE:
				return getNetwork_Node_Base_Voltage();
			case VisGridPackage.SUBSTATION__BUSTYPE:
				return getBustype();
			case VisGridPackage.SUBSTATION__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.SUBSTATION__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.SUBSTATION__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.SUBSTATION__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.SUBSTATION__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.SUBSTATION__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.SUBSTATION__VOLTAGE_AB:
				return getVoltage_AB();
			case VisGridPackage.SUBSTATION__VOLTAGE_BC:
				return getVoltage_BC();
			case VisGridPackage.SUBSTATION__VOLTAGE_CA:
				return getVoltage_CA();
			case VisGridPackage.SUBSTATION__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.SUBSTATION__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.SUBSTATION__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.SUBSTATION__POWER_A:
				return getPower_A();
			case VisGridPackage.SUBSTATION__POWER_B:
				return getPower_B();
			case VisGridPackage.SUBSTATION__POWER_C:
				return getPower_C();
			case VisGridPackage.SUBSTATION__SHUNT_A:
				return getShunt_A();
			case VisGridPackage.SUBSTATION__SHUNT_B:
				return getShunt_B();
			case VisGridPackage.SUBSTATION__SHUNT_C:
				return getShunt_C();
			case VisGridPackage.SUBSTATION__PHASES:
				return getPhases();
			case VisGridPackage.SUBSTATION__NOMINAL_VOLTAGE:
				return getNominal_voltage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.SUBSTATION__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.SUBSTATION__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_ENERGY:
				setDistribution_energy((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_POWER:
				setDistribution_power((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_DEMAND:
				setDistribution_demand((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_A:
				setDistribution_voltage_A((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_B:
				setDistribution_voltage_B((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_C:
				setDistribution_voltage_C((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_A:
				setDistribution_current_A((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_B:
				setDistribution_current_B((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_C:
				setDistribution_current_C((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_POWER:
				setNetwork_Node_Base_Power((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_VOLTAGE:
				setNetwork_Node_Base_Voltage((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_AB:
				setVoltage_AB((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_BC:
				setVoltage_BC((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_CA:
				setVoltage_CA((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__SHUNT_A:
				setShunt_A((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__SHUNT_B:
				setShunt_B((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__SHUNT_C:
				setShunt_C((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.SUBSTATION__NOMINAL_VOLTAGE:
				setNominal_voltage((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisGridPackage.SUBSTATION__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.SUBSTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_ENERGY:
				setDistribution_energy(DISTRIBUTION_ENERGY_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_POWER:
				setDistribution_power(DISTRIBUTION_POWER_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_DEMAND:
				setDistribution_demand(DISTRIBUTION_DEMAND_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_A:
				setDistribution_voltage_A(DISTRIBUTION_VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_B:
				setDistribution_voltage_B(DISTRIBUTION_VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_C:
				setDistribution_voltage_C(DISTRIBUTION_VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_A:
				setDistribution_current_A(DISTRIBUTION_CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_B:
				setDistribution_current_B(DISTRIBUTION_CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_C:
				setDistribution_current_C(DISTRIBUTION_CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_POWER:
				setNetwork_Node_Base_Power(NETWORK_NODE_BASE_POWER_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_VOLTAGE:
				setNetwork_Node_Base_Voltage(NETWORK_NODE_BASE_VOLTAGE_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_AB:
				setVoltage_AB(VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_BC:
				setVoltage_BC(VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__VOLTAGE_CA:
				setVoltage_CA(VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__SHUNT_A:
				setShunt_A(SHUNT_A_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__SHUNT_B:
				setShunt_B(SHUNT_B_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__SHUNT_C:
				setShunt_C(SHUNT_C_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.SUBSTATION__NOMINAL_VOLTAGE:
				setNominal_voltage(NOMINAL_VOLTAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisGridPackage.SUBSTATION__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.SUBSTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_ENERGY:
				return DISTRIBUTION_ENERGY_EDEFAULT == null ? distribution_energy != null : !DISTRIBUTION_ENERGY_EDEFAULT.equals(distribution_energy);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_POWER:
				return DISTRIBUTION_POWER_EDEFAULT == null ? distribution_power != null : !DISTRIBUTION_POWER_EDEFAULT.equals(distribution_power);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_DEMAND:
				return DISTRIBUTION_DEMAND_EDEFAULT == null ? distribution_demand != null : !DISTRIBUTION_DEMAND_EDEFAULT.equals(distribution_demand);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_A:
				return DISTRIBUTION_VOLTAGE_A_EDEFAULT == null ? distribution_voltage_A != null : !DISTRIBUTION_VOLTAGE_A_EDEFAULT.equals(distribution_voltage_A);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_B:
				return DISTRIBUTION_VOLTAGE_B_EDEFAULT == null ? distribution_voltage_B != null : !DISTRIBUTION_VOLTAGE_B_EDEFAULT.equals(distribution_voltage_B);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_VOLTAGE_C:
				return DISTRIBUTION_VOLTAGE_C_EDEFAULT == null ? distribution_voltage_C != null : !DISTRIBUTION_VOLTAGE_C_EDEFAULT.equals(distribution_voltage_C);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_A:
				return DISTRIBUTION_CURRENT_A_EDEFAULT == null ? distribution_current_A != null : !DISTRIBUTION_CURRENT_A_EDEFAULT.equals(distribution_current_A);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_B:
				return DISTRIBUTION_CURRENT_B_EDEFAULT == null ? distribution_current_B != null : !DISTRIBUTION_CURRENT_B_EDEFAULT.equals(distribution_current_B);
			case VisGridPackage.SUBSTATION__DISTRIBUTION_CURRENT_C:
				return DISTRIBUTION_CURRENT_C_EDEFAULT == null ? distribution_current_C != null : !DISTRIBUTION_CURRENT_C_EDEFAULT.equals(distribution_current_C);
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_POWER:
				return NETWORK_NODE_BASE_POWER_EDEFAULT == null ? network_Node_Base_Power != null : !NETWORK_NODE_BASE_POWER_EDEFAULT.equals(network_Node_Base_Power);
			case VisGridPackage.SUBSTATION__NETWORK_NODE_BASE_VOLTAGE:
				return NETWORK_NODE_BASE_VOLTAGE_EDEFAULT == null ? network_Node_Base_Voltage != null : !NETWORK_NODE_BASE_VOLTAGE_EDEFAULT.equals(network_Node_Base_Voltage);
			case VisGridPackage.SUBSTATION__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.SUBSTATION__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.SUBSTATION__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.SUBSTATION__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.SUBSTATION__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.SUBSTATION__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.SUBSTATION__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.SUBSTATION__VOLTAGE_AB:
				return VOLTAGE_AB_EDEFAULT == null ? voltage_AB != null : !VOLTAGE_AB_EDEFAULT.equals(voltage_AB);
			case VisGridPackage.SUBSTATION__VOLTAGE_BC:
				return VOLTAGE_BC_EDEFAULT == null ? voltage_BC != null : !VOLTAGE_BC_EDEFAULT.equals(voltage_BC);
			case VisGridPackage.SUBSTATION__VOLTAGE_CA:
				return VOLTAGE_CA_EDEFAULT == null ? voltage_CA != null : !VOLTAGE_CA_EDEFAULT.equals(voltage_CA);
			case VisGridPackage.SUBSTATION__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.SUBSTATION__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.SUBSTATION__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.SUBSTATION__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.SUBSTATION__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.SUBSTATION__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.SUBSTATION__SHUNT_A:
				return SHUNT_A_EDEFAULT == null ? shunt_A != null : !SHUNT_A_EDEFAULT.equals(shunt_A);
			case VisGridPackage.SUBSTATION__SHUNT_B:
				return SHUNT_B_EDEFAULT == null ? shunt_B != null : !SHUNT_B_EDEFAULT.equals(shunt_B);
			case VisGridPackage.SUBSTATION__SHUNT_C:
				return SHUNT_C_EDEFAULT == null ? shunt_C != null : !SHUNT_C_EDEFAULT.equals(shunt_C);
			case VisGridPackage.SUBSTATION__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.SUBSTATION__NOMINAL_VOLTAGE:
				return NOMINAL_VOLTAGE_EDEFAULT == null ? nominal_voltage != null : !NOMINAL_VOLTAGE_EDEFAULT.equals(nominal_voltage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", distribution_energy: ");
		result.append(distribution_energy);
		result.append(", distribution_power: ");
		result.append(distribution_power);
		result.append(", distribution_demand: ");
		result.append(distribution_demand);
		result.append(", distribution_voltage_A: ");
		result.append(distribution_voltage_A);
		result.append(", distribution_voltage_B: ");
		result.append(distribution_voltage_B);
		result.append(", distribution_voltage_C: ");
		result.append(distribution_voltage_C);
		result.append(", distribution_current_A: ");
		result.append(distribution_current_A);
		result.append(", distribution_current_B: ");
		result.append(distribution_current_B);
		result.append(", distribution_current_C: ");
		result.append(distribution_current_C);
		result.append(", Network_Node_Base_Power: ");
		result.append(network_Node_Base_Power);
		result.append(", Network_Node_Base_Voltage: ");
		result.append(network_Node_Base_Voltage);
		result.append(", bustype: ");
		result.append(bustype);
		result.append(", busflags: ");
		result.append(busflags);
		result.append(", reference_bus: ");
		result.append(reference_bus);
		result.append(", maximum_voltage_error: ");
		result.append(maximum_voltage_error);
		result.append(", voltage_A: ");
		result.append(voltage_A);
		result.append(", voltage_B: ");
		result.append(voltage_B);
		result.append(", voltage_C: ");
		result.append(voltage_C);
		result.append(", voltage_AB: ");
		result.append(voltage_AB);
		result.append(", voltage_BC: ");
		result.append(voltage_BC);
		result.append(", voltage_CA: ");
		result.append(voltage_CA);
		result.append(", current_A: ");
		result.append(current_A);
		result.append(", current_B: ");
		result.append(current_B);
		result.append(", current_C: ");
		result.append(current_C);
		result.append(", power_A: ");
		result.append(power_A);
		result.append(", power_B: ");
		result.append(power_B);
		result.append(", power_C: ");
		result.append(power_C);
		result.append(", shunt_A: ");
		result.append(shunt_A);
		result.append(", shunt_B: ");
		result.append(shunt_B);
		result.append(", shunt_C: ");
		result.append(shunt_C);
		result.append(", phases: ");
		result.append(phases);
		result.append(", nominal_voltage: ");
		result.append(nominal_voltage);
		result.append(')');
		return result.toString();
	}

} //SubstationImpl
