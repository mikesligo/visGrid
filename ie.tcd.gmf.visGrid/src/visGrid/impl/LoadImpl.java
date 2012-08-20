/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;
import java.util.HashMap;
        import java.util.Map;
        import java.util.Timer;
        import java.util.TimerTask;
        import java.io.File;
        import java.net.URI;
        import java.net.URISyntaxException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Load;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.LoadImpl#getLoad_class <em>Load class</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_A <em>Constant power A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_B <em>Constant power B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_C <em>Constant power C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_A_real <em>Constant power Areal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_B_real <em>Constant power Breal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_C_real <em>Constant power Creal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_A_reac <em>Constant power Areac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_B_reac <em>Constant power Breac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_power_C_reac <em>Constant power Creac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_A <em>Constant current A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_B <em>Constant current B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_C <em>Constant current C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_A_real <em>Constant current Areal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_B_real <em>Constant current Breal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_C_real <em>Constant current Creal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_A_reac <em>Constant current Areac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_B_reac <em>Constant current Breac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_current_C_reac <em>Constant current Creac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_A <em>Constant impedance A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_B <em>Constant impedance B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_C <em>Constant impedance C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_A_real <em>Constant impedance Areal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_B_real <em>Constant impedance Breal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_C_real <em>Constant impedance Creal</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_A_reac <em>Constant impedance Areac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_B_reac <em>Constant impedance Breac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getConstant_impedance_C_reac <em>Constant impedance Creac</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMeasured_voltage_A <em>Measured voltage A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMeasured_voltage_B <em>Measured voltage B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMeasured_voltage_C <em>Measured voltage C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMeasured_voltage_AB <em>Measured voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMeasured_voltage_BC <em>Measured voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMeasured_voltage_CA <em>Measured voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.LoadImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadImpl extends ConnectionImpl implements Load {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();

   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (threadLock) return;
            if (entry.getValue() == false) return;
        }
        resetLock();
    }

    private void resetLock() {
        Timer timer = new Timer();
        class Task extends TimerTask{
            public void run() {
                threadLock = true;
                for (Map.Entry<String, Boolean> entry : lock.entrySet()){
                    entry.setValue(false);
                }
                threadLock = false;
            }   
        }
        timer.schedule(new Task(), lock.size()*30);
    }
    // END PYTHON GENERATED CODE
	/**
	 * The default value of the '{@link #getLoad_class() <em>Load class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_class()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad_class() <em>Load class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_class()
	 * @generated
	 * @ordered
	 */
	protected String load_class = LOAD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_A() <em>Constant power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_A() <em>Constant power A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_A()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_A = CONSTANT_POWER_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_B() <em>Constant power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_B() <em>Constant power B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_B()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_B = CONSTANT_POWER_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_C() <em>Constant power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_C() <em>Constant power C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_C()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_C = CONSTANT_POWER_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_A_real() <em>Constant power Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_A_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_AREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_A_real() <em>Constant power Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_A_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_A_real = CONSTANT_POWER_AREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_B_real() <em>Constant power Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_B_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_BREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_B_real() <em>Constant power Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_B_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_B_real = CONSTANT_POWER_BREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_C_real() <em>Constant power Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_C_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_CREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_C_real() <em>Constant power Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_C_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_C_real = CONSTANT_POWER_CREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_A_reac() <em>Constant power Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_A_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_AREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_A_reac() <em>Constant power Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_A_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_A_reac = CONSTANT_POWER_AREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_B_reac() <em>Constant power Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_B_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_BREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_B_reac() <em>Constant power Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_B_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_B_reac = CONSTANT_POWER_BREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_power_C_reac() <em>Constant power Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_C_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_POWER_CREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_power_C_reac() <em>Constant power Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_power_C_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_power_C_reac = CONSTANT_POWER_CREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_A() <em>Constant current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_A() <em>Constant current A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_A()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_A = CONSTANT_CURRENT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_B() <em>Constant current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_B() <em>Constant current B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_B()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_B = CONSTANT_CURRENT_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_C() <em>Constant current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_C() <em>Constant current C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_C()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_C = CONSTANT_CURRENT_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_A_real() <em>Constant current Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_A_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_AREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_A_real() <em>Constant current Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_A_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_A_real = CONSTANT_CURRENT_AREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_B_real() <em>Constant current Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_B_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_BREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_B_real() <em>Constant current Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_B_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_B_real = CONSTANT_CURRENT_BREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_C_real() <em>Constant current Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_C_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_CREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_C_real() <em>Constant current Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_C_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_C_real = CONSTANT_CURRENT_CREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_A_reac() <em>Constant current Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_A_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_AREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_A_reac() <em>Constant current Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_A_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_A_reac = CONSTANT_CURRENT_AREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_B_reac() <em>Constant current Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_B_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_BREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_B_reac() <em>Constant current Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_B_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_B_reac = CONSTANT_CURRENT_BREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_current_C_reac() <em>Constant current Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_C_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_CURRENT_CREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_current_C_reac() <em>Constant current Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_current_C_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_current_C_reac = CONSTANT_CURRENT_CREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_A() <em>Constant impedance A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_A()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_A() <em>Constant impedance A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_A()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_A = CONSTANT_IMPEDANCE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_B() <em>Constant impedance B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_B()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_B() <em>Constant impedance B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_B()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_B = CONSTANT_IMPEDANCE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_C() <em>Constant impedance C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_C()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_C() <em>Constant impedance C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_C()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_C = CONSTANT_IMPEDANCE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_A_real() <em>Constant impedance Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_A_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_AREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_A_real() <em>Constant impedance Areal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_A_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_A_real = CONSTANT_IMPEDANCE_AREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_B_real() <em>Constant impedance Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_B_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_BREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_B_real() <em>Constant impedance Breal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_B_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_B_real = CONSTANT_IMPEDANCE_BREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_C_real() <em>Constant impedance Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_C_real()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_CREAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_C_real() <em>Constant impedance Creal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_C_real()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_C_real = CONSTANT_IMPEDANCE_CREAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_A_reac() <em>Constant impedance Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_A_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_AREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_A_reac() <em>Constant impedance Areac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_A_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_A_reac = CONSTANT_IMPEDANCE_AREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_B_reac() <em>Constant impedance Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_B_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_BREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_B_reac() <em>Constant impedance Breac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_B_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_B_reac = CONSTANT_IMPEDANCE_BREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstant_impedance_C_reac() <em>Constant impedance Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_C_reac()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTANT_IMPEDANCE_CREAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstant_impedance_C_reac() <em>Constant impedance Creac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant_impedance_C_reac()
	 * @generated
	 * @ordered
	 */
	protected String constant_impedance_C_reac = CONSTANT_IMPEDANCE_CREAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_A() <em>Measured voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_A()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_A() <em>Measured voltage A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_A()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_A = MEASURED_VOLTAGE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_B() <em>Measured voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_B()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_B() <em>Measured voltage B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_B()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_B = MEASURED_VOLTAGE_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_C() <em>Measured voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_C()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_C() <em>Measured voltage C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_C()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_C = MEASURED_VOLTAGE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_AB() <em>Measured voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_AB()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_AB() <em>Measured voltage AB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_AB()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_AB = MEASURED_VOLTAGE_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_BC() <em>Measured voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_BC()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_BC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_BC() <em>Measured voltage BC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_BC()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_BC = MEASURED_VOLTAGE_BC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasured_voltage_CA() <em>Measured voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_CA()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURED_VOLTAGE_CA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasured_voltage_CA() <em>Measured voltage CA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasured_voltage_CA()
	 * @generated
	 * @ordered
	 */
	protected String measured_voltage_CA = MEASURED_VOLTAGE_CA_EDEFAULT;

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
	protected LoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getLoad();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoad_class() {
		// Generated by python script located in this directory
			if (!lock.containsKey("load_class")) lock.put("load_class", new Boolean(false));
			if (!(Boolean)lock.get("load_class")){
				lock.put("load_class", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"load_class");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Load_class");
					load_class= val;
			}
		return load_class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad_class(String newLoad_class) {
		String oldLoad_class = load_class;
		load_class = newLoad_class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__LOAD_CLASS, oldLoad_class, load_class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_A")) lock.put("constant_power_A", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_A")){
				lock.put("constant_power_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_A");
					constant_power_A= val;
			}
		return constant_power_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_A(String newConstant_power_A) {
		String oldConstant_power_A = constant_power_A;
		constant_power_A = newConstant_power_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_A, oldConstant_power_A, constant_power_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_B")) lock.put("constant_power_B", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_B")){
				lock.put("constant_power_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_B");
					constant_power_B= val;
			}
		return constant_power_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_B(String newConstant_power_B) {
		String oldConstant_power_B = constant_power_B;
		constant_power_B = newConstant_power_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_B, oldConstant_power_B, constant_power_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_C")) lock.put("constant_power_C", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_C")){
				lock.put("constant_power_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_C");
					constant_power_C= val;
			}
		return constant_power_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_C(String newConstant_power_C) {
		String oldConstant_power_C = constant_power_C;
		constant_power_C = newConstant_power_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_C, oldConstant_power_C, constant_power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_A_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_A_real")) lock.put("constant_power_A_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_A_real")){
				lock.put("constant_power_A_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_A_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_A_real");
					constant_power_A_real= val;
			}
		return constant_power_A_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_A_real(String newConstant_power_A_real) {
		String oldConstant_power_A_real = constant_power_A_real;
		constant_power_A_real = newConstant_power_A_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_AREAL, oldConstant_power_A_real, constant_power_A_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_B_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_B_real")) lock.put("constant_power_B_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_B_real")){
				lock.put("constant_power_B_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_B_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_B_real");
					constant_power_B_real= val;
			}
		return constant_power_B_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_B_real(String newConstant_power_B_real) {
		String oldConstant_power_B_real = constant_power_B_real;
		constant_power_B_real = newConstant_power_B_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_BREAL, oldConstant_power_B_real, constant_power_B_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_C_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_C_real")) lock.put("constant_power_C_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_C_real")){
				lock.put("constant_power_C_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_C_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_C_real");
					constant_power_C_real= val;
			}
		return constant_power_C_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_C_real(String newConstant_power_C_real) {
		String oldConstant_power_C_real = constant_power_C_real;
		constant_power_C_real = newConstant_power_C_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_CREAL, oldConstant_power_C_real, constant_power_C_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_A_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_A_reac")) lock.put("constant_power_A_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_A_reac")){
				lock.put("constant_power_A_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_A_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_A_reac");
					constant_power_A_reac= val;
			}
		return constant_power_A_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_A_reac(String newConstant_power_A_reac) {
		String oldConstant_power_A_reac = constant_power_A_reac;
		constant_power_A_reac = newConstant_power_A_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_AREAC, oldConstant_power_A_reac, constant_power_A_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_B_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_B_reac")) lock.put("constant_power_B_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_B_reac")){
				lock.put("constant_power_B_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_B_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_B_reac");
					constant_power_B_reac= val;
			}
		return constant_power_B_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_B_reac(String newConstant_power_B_reac) {
		String oldConstant_power_B_reac = constant_power_B_reac;
		constant_power_B_reac = newConstant_power_B_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_BREAC, oldConstant_power_B_reac, constant_power_B_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_power_C_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_power_C_reac")) lock.put("constant_power_C_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_power_C_reac")){
				lock.put("constant_power_C_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_power_C_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_power_C_reac");
					constant_power_C_reac= val;
			}
		return constant_power_C_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_power_C_reac(String newConstant_power_C_reac) {
		String oldConstant_power_C_reac = constant_power_C_reac;
		constant_power_C_reac = newConstant_power_C_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_POWER_CREAC, oldConstant_power_C_reac, constant_power_C_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_A")) lock.put("constant_current_A", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_A")){
				lock.put("constant_current_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_A");
					constant_current_A= val;
			}
		return constant_current_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_A(String newConstant_current_A) {
		String oldConstant_current_A = constant_current_A;
		constant_current_A = newConstant_current_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_A, oldConstant_current_A, constant_current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_B")) lock.put("constant_current_B", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_B")){
				lock.put("constant_current_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_B");
					constant_current_B= val;
			}
		return constant_current_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_B(String newConstant_current_B) {
		String oldConstant_current_B = constant_current_B;
		constant_current_B = newConstant_current_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_B, oldConstant_current_B, constant_current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_C")) lock.put("constant_current_C", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_C")){
				lock.put("constant_current_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_C");
					constant_current_C= val;
			}
		return constant_current_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_C(String newConstant_current_C) {
		String oldConstant_current_C = constant_current_C;
		constant_current_C = newConstant_current_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_C, oldConstant_current_C, constant_current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_A_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_A_real")) lock.put("constant_current_A_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_A_real")){
				lock.put("constant_current_A_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_A_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_A_real");
					constant_current_A_real= val;
			}
		return constant_current_A_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_A_real(String newConstant_current_A_real) {
		String oldConstant_current_A_real = constant_current_A_real;
		constant_current_A_real = newConstant_current_A_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_AREAL, oldConstant_current_A_real, constant_current_A_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_B_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_B_real")) lock.put("constant_current_B_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_B_real")){
				lock.put("constant_current_B_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_B_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_B_real");
					constant_current_B_real= val;
			}
		return constant_current_B_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_B_real(String newConstant_current_B_real) {
		String oldConstant_current_B_real = constant_current_B_real;
		constant_current_B_real = newConstant_current_B_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_BREAL, oldConstant_current_B_real, constant_current_B_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_C_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_C_real")) lock.put("constant_current_C_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_C_real")){
				lock.put("constant_current_C_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_C_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_C_real");
					constant_current_C_real= val;
			}
		return constant_current_C_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_C_real(String newConstant_current_C_real) {
		String oldConstant_current_C_real = constant_current_C_real;
		constant_current_C_real = newConstant_current_C_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_CREAL, oldConstant_current_C_real, constant_current_C_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_A_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_A_reac")) lock.put("constant_current_A_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_A_reac")){
				lock.put("constant_current_A_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_A_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_A_reac");
					constant_current_A_reac= val;
			}
		return constant_current_A_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_A_reac(String newConstant_current_A_reac) {
		String oldConstant_current_A_reac = constant_current_A_reac;
		constant_current_A_reac = newConstant_current_A_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_AREAC, oldConstant_current_A_reac, constant_current_A_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_B_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_B_reac")) lock.put("constant_current_B_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_B_reac")){
				lock.put("constant_current_B_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_B_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_B_reac");
					constant_current_B_reac= val;
			}
		return constant_current_B_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_B_reac(String newConstant_current_B_reac) {
		String oldConstant_current_B_reac = constant_current_B_reac;
		constant_current_B_reac = newConstant_current_B_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_BREAC, oldConstant_current_B_reac, constant_current_B_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_current_C_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_current_C_reac")) lock.put("constant_current_C_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_current_C_reac")){
				lock.put("constant_current_C_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_current_C_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_current_C_reac");
					constant_current_C_reac= val;
			}
		return constant_current_C_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_current_C_reac(String newConstant_current_C_reac) {
		String oldConstant_current_C_reac = constant_current_C_reac;
		constant_current_C_reac = newConstant_current_C_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_CURRENT_CREAC, oldConstant_current_C_reac, constant_current_C_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_A")) lock.put("constant_impedance_A", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_A")){
				lock.put("constant_impedance_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_A");
					constant_impedance_A= val;
			}
		return constant_impedance_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_A(String newConstant_impedance_A) {
		String oldConstant_impedance_A = constant_impedance_A;
		constant_impedance_A = newConstant_impedance_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_A, oldConstant_impedance_A, constant_impedance_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_B")) lock.put("constant_impedance_B", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_B")){
				lock.put("constant_impedance_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_B");
					constant_impedance_B= val;
			}
		return constant_impedance_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_B(String newConstant_impedance_B) {
		String oldConstant_impedance_B = constant_impedance_B;
		constant_impedance_B = newConstant_impedance_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_B, oldConstant_impedance_B, constant_impedance_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_C")) lock.put("constant_impedance_C", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_C")){
				lock.put("constant_impedance_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_C");
					constant_impedance_C= val;
			}
		return constant_impedance_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_C(String newConstant_impedance_C) {
		String oldConstant_impedance_C = constant_impedance_C;
		constant_impedance_C = newConstant_impedance_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_C, oldConstant_impedance_C, constant_impedance_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_A_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_A_real")) lock.put("constant_impedance_A_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_A_real")){
				lock.put("constant_impedance_A_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_A_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_A_real");
					constant_impedance_A_real= val;
			}
		return constant_impedance_A_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_A_real(String newConstant_impedance_A_real) {
		String oldConstant_impedance_A_real = constant_impedance_A_real;
		constant_impedance_A_real = newConstant_impedance_A_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAL, oldConstant_impedance_A_real, constant_impedance_A_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_B_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_B_real")) lock.put("constant_impedance_B_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_B_real")){
				lock.put("constant_impedance_B_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_B_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_B_real");
					constant_impedance_B_real= val;
			}
		return constant_impedance_B_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_B_real(String newConstant_impedance_B_real) {
		String oldConstant_impedance_B_real = constant_impedance_B_real;
		constant_impedance_B_real = newConstant_impedance_B_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAL, oldConstant_impedance_B_real, constant_impedance_B_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_C_real() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_C_real")) lock.put("constant_impedance_C_real", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_C_real")){
				lock.put("constant_impedance_C_real", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_C_real");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_C_real");
					constant_impedance_C_real= val;
			}
		return constant_impedance_C_real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_C_real(String newConstant_impedance_C_real) {
		String oldConstant_impedance_C_real = constant_impedance_C_real;
		constant_impedance_C_real = newConstant_impedance_C_real;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAL, oldConstant_impedance_C_real, constant_impedance_C_real));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_A_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_A_reac")) lock.put("constant_impedance_A_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_A_reac")){
				lock.put("constant_impedance_A_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_A_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_A_reac");
					constant_impedance_A_reac= val;
			}
		return constant_impedance_A_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_A_reac(String newConstant_impedance_A_reac) {
		String oldConstant_impedance_A_reac = constant_impedance_A_reac;
		constant_impedance_A_reac = newConstant_impedance_A_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAC, oldConstant_impedance_A_reac, constant_impedance_A_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_B_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_B_reac")) lock.put("constant_impedance_B_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_B_reac")){
				lock.put("constant_impedance_B_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_B_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_B_reac");
					constant_impedance_B_reac= val;
			}
		return constant_impedance_B_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_B_reac(String newConstant_impedance_B_reac) {
		String oldConstant_impedance_B_reac = constant_impedance_B_reac;
		constant_impedance_B_reac = newConstant_impedance_B_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAC, oldConstant_impedance_B_reac, constant_impedance_B_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstant_impedance_C_reac() {
		// Generated by python script located in this directory
			if (!lock.containsKey("constant_impedance_C_reac")) lock.put("constant_impedance_C_reac", new Boolean(false));
			if (!(Boolean)lock.get("constant_impedance_C_reac")){
				lock.put("constant_impedance_C_reac", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"constant_impedance_C_reac");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Constant_impedance_C_reac");
					constant_impedance_C_reac= val;
			}
		return constant_impedance_C_reac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant_impedance_C_reac(String newConstant_impedance_C_reac) {
		String oldConstant_impedance_C_reac = constant_impedance_C_reac;
		constant_impedance_C_reac = newConstant_impedance_C_reac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAC, oldConstant_impedance_C_reac, constant_impedance_C_reac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_A")) lock.put("measured_voltage_A", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_A")){
				lock.put("measured_voltage_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_A");
					measured_voltage_A= val;
			}
		return measured_voltage_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_A(String newMeasured_voltage_A) {
		String oldMeasured_voltage_A = measured_voltage_A;
		measured_voltage_A = newMeasured_voltage_A;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MEASURED_VOLTAGE_A, oldMeasured_voltage_A, measured_voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_B")) lock.put("measured_voltage_B", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_B")){
				lock.put("measured_voltage_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_B");
					measured_voltage_B= val;
			}
		return measured_voltage_B;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_B(String newMeasured_voltage_B) {
		String oldMeasured_voltage_B = measured_voltage_B;
		measured_voltage_B = newMeasured_voltage_B;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MEASURED_VOLTAGE_B, oldMeasured_voltage_B, measured_voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_C")) lock.put("measured_voltage_C", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_C")){
				lock.put("measured_voltage_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_C");
					measured_voltage_C= val;
			}
		return measured_voltage_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_C(String newMeasured_voltage_C) {
		String oldMeasured_voltage_C = measured_voltage_C;
		measured_voltage_C = newMeasured_voltage_C;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MEASURED_VOLTAGE_C, oldMeasured_voltage_C, measured_voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_AB() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_AB")) lock.put("measured_voltage_AB", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_AB")){
				lock.put("measured_voltage_AB", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_AB");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_AB");
					measured_voltage_AB= val;
			}
		return measured_voltage_AB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_AB(String newMeasured_voltage_AB) {
		String oldMeasured_voltage_AB = measured_voltage_AB;
		measured_voltage_AB = newMeasured_voltage_AB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MEASURED_VOLTAGE_AB, oldMeasured_voltage_AB, measured_voltage_AB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_BC() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_BC")) lock.put("measured_voltage_BC", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_BC")){
				lock.put("measured_voltage_BC", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_BC");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_BC");
					measured_voltage_BC= val;
			}
		return measured_voltage_BC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_BC(String newMeasured_voltage_BC) {
		String oldMeasured_voltage_BC = measured_voltage_BC;
		measured_voltage_BC = newMeasured_voltage_BC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MEASURED_VOLTAGE_BC, oldMeasured_voltage_BC, measured_voltage_BC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasured_voltage_CA() {
		// Generated by python script located in this directory
			if (!lock.containsKey("measured_voltage_CA")) lock.put("measured_voltage_CA", new Boolean(false));
			if (!(Boolean)lock.get("measured_voltage_CA")){
				lock.put("measured_voltage_CA", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"measured_voltage_CA");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Measured_voltage_CA");
					measured_voltage_CA= val;
			}
		return measured_voltage_CA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasured_voltage_CA(String newMeasured_voltage_CA) {
		String oldMeasured_voltage_CA = measured_voltage_CA;
		measured_voltage_CA = newMeasured_voltage_CA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MEASURED_VOLTAGE_CA, oldMeasured_voltage_CA, measured_voltage_CA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBustype() {
		// Generated by python script located in this directory
			if (!lock.containsKey("bustype")) lock.put("bustype", new Boolean(false));
			if (!(Boolean)lock.get("bustype")){
				lock.put("bustype", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"bustype");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Bustype");
					bustype= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__BUSTYPE, oldBustype, bustype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusflags() {
		// Generated by python script located in this directory
			if (!lock.containsKey("busflags")) lock.put("busflags", new Boolean(false));
			if (!(Boolean)lock.get("busflags")){
				lock.put("busflags", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"busflags");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Busflags");
					busflags= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__BUSFLAGS, oldBusflags, busflags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference_bus() {
		// Generated by python script located in this directory
			if (!lock.containsKey("reference_bus")) lock.put("reference_bus", new Boolean(false));
			if (!(Boolean)lock.get("reference_bus")){
				lock.put("reference_bus", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"reference_bus");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Reference_bus");
					reference_bus= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__REFERENCE_BUS, oldReference_bus, reference_bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximum_voltage_error() {
		// Generated by python script located in this directory
			if (!lock.containsKey("maximum_voltage_error")) lock.put("maximum_voltage_error", new Boolean(false));
			if (!(Boolean)lock.get("maximum_voltage_error")){
				lock.put("maximum_voltage_error", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"maximum_voltage_error");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Maximum_voltage_error");
					maximum_voltage_error= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_A")) lock.put("voltage_A", new Boolean(false));
			if (!(Boolean)lock.get("voltage_A")){
				lock.put("voltage_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_A");
					voltage_A= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__VOLTAGE_A, oldVoltage_A, voltage_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_B")) lock.put("voltage_B", new Boolean(false));
			if (!(Boolean)lock.get("voltage_B")){
				lock.put("voltage_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_B");
					voltage_B= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__VOLTAGE_B, oldVoltage_B, voltage_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_C")) lock.put("voltage_C", new Boolean(false));
			if (!(Boolean)lock.get("voltage_C")){
				lock.put("voltage_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_C");
					voltage_C= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__VOLTAGE_C, oldVoltage_C, voltage_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_AB() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_AB")) lock.put("voltage_AB", new Boolean(false));
			if (!(Boolean)lock.get("voltage_AB")){
				lock.put("voltage_AB", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_AB");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_AB");
					voltage_AB= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__VOLTAGE_AB, oldVoltage_AB, voltage_AB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_BC() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_BC")) lock.put("voltage_BC", new Boolean(false));
			if (!(Boolean)lock.get("voltage_BC")){
				lock.put("voltage_BC", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_BC");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_BC");
					voltage_BC= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__VOLTAGE_BC, oldVoltage_BC, voltage_BC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVoltage_CA() {
		// Generated by python script located in this directory
			if (!lock.containsKey("voltage_CA")) lock.put("voltage_CA", new Boolean(false));
			if (!(Boolean)lock.get("voltage_CA")){
				lock.put("voltage_CA", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"voltage_CA");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Voltage_CA");
					voltage_CA= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__VOLTAGE_CA, oldVoltage_CA, voltage_CA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_A")) lock.put("current_A", new Boolean(false));
			if (!(Boolean)lock.get("current_A")){
				lock.put("current_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_A");
					current_A= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CURRENT_A, oldCurrent_A, current_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_B")) lock.put("current_B", new Boolean(false));
			if (!(Boolean)lock.get("current_B")){
				lock.put("current_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_B");
					current_B= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CURRENT_B, oldCurrent_B, current_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrent_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("current_C")) lock.put("current_C", new Boolean(false));
			if (!(Boolean)lock.get("current_C")){
				lock.put("current_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"current_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Current_C");
					current_C= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__CURRENT_C, oldCurrent_C, current_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_A")) lock.put("power_A", new Boolean(false));
			if (!(Boolean)lock.get("power_A")){
				lock.put("power_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_A");
					power_A= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__POWER_A, oldPower_A, power_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_B")) lock.put("power_B", new Boolean(false));
			if (!(Boolean)lock.get("power_B")){
				lock.put("power_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_B");
					power_B= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__POWER_B, oldPower_B, power_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_C")) lock.put("power_C", new Boolean(false));
			if (!(Boolean)lock.get("power_C")){
				lock.put("power_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_C");
					power_C= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__POWER_C, oldPower_C, power_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_A() {
		// Generated by python script located in this directory
			if (!lock.containsKey("shunt_A")) lock.put("shunt_A", new Boolean(false));
			if (!(Boolean)lock.get("shunt_A")){
				lock.put("shunt_A", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"shunt_A");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Shunt_A");
					shunt_A= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__SHUNT_A, oldShunt_A, shunt_A));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_B() {
		// Generated by python script located in this directory
			if (!lock.containsKey("shunt_B")) lock.put("shunt_B", new Boolean(false));
			if (!(Boolean)lock.get("shunt_B")){
				lock.put("shunt_B", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"shunt_B");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Shunt_B");
					shunt_B= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__SHUNT_B, oldShunt_B, shunt_B));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShunt_C() {
		// Generated by python script located in this directory
			if (!lock.containsKey("shunt_C")) lock.put("shunt_C", new Boolean(false));
			if (!(Boolean)lock.get("shunt_C")){
				lock.put("shunt_C", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"shunt_C");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Shunt_C");
					shunt_C= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__SHUNT_C, oldShunt_C, shunt_C));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhases() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phases")) lock.put("phases", new Boolean(false));
			if (!(Boolean)lock.get("phases")){
				lock.put("phases", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phases");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Phases");
					phases= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominal_voltage() {
		// Generated by python script located in this directory
			if (!lock.containsKey("nominal_voltage")) lock.put("nominal_voltage", new Boolean(false));
			if (!(Boolean)lock.get("nominal_voltage")){
				lock.put("nominal_voltage", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"nominal_voltage");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Nominal_voltage");
					nominal_voltage= val;
			}
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.LOAD__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.LOAD__LOAD_CLASS:
				return getLoad_class();
			case VisGridPackage.LOAD__CONSTANT_POWER_A:
				return getConstant_power_A();
			case VisGridPackage.LOAD__CONSTANT_POWER_B:
				return getConstant_power_B();
			case VisGridPackage.LOAD__CONSTANT_POWER_C:
				return getConstant_power_C();
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAL:
				return getConstant_power_A_real();
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAL:
				return getConstant_power_B_real();
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAL:
				return getConstant_power_C_real();
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAC:
				return getConstant_power_A_reac();
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAC:
				return getConstant_power_B_reac();
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAC:
				return getConstant_power_C_reac();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_A:
				return getConstant_current_A();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_B:
				return getConstant_current_B();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_C:
				return getConstant_current_C();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAL:
				return getConstant_current_A_real();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAL:
				return getConstant_current_B_real();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAL:
				return getConstant_current_C_real();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAC:
				return getConstant_current_A_reac();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAC:
				return getConstant_current_B_reac();
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAC:
				return getConstant_current_C_reac();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_A:
				return getConstant_impedance_A();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_B:
				return getConstant_impedance_B();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_C:
				return getConstant_impedance_C();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAL:
				return getConstant_impedance_A_real();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAL:
				return getConstant_impedance_B_real();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAL:
				return getConstant_impedance_C_real();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAC:
				return getConstant_impedance_A_reac();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAC:
				return getConstant_impedance_B_reac();
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAC:
				return getConstant_impedance_C_reac();
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_A:
				return getMeasured_voltage_A();
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_B:
				return getMeasured_voltage_B();
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_C:
				return getMeasured_voltage_C();
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_AB:
				return getMeasured_voltage_AB();
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_BC:
				return getMeasured_voltage_BC();
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_CA:
				return getMeasured_voltage_CA();
			case VisGridPackage.LOAD__BUSTYPE:
				return getBustype();
			case VisGridPackage.LOAD__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.LOAD__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.LOAD__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.LOAD__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.LOAD__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.LOAD__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.LOAD__VOLTAGE_AB:
				return getVoltage_AB();
			case VisGridPackage.LOAD__VOLTAGE_BC:
				return getVoltage_BC();
			case VisGridPackage.LOAD__VOLTAGE_CA:
				return getVoltage_CA();
			case VisGridPackage.LOAD__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.LOAD__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.LOAD__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.LOAD__POWER_A:
				return getPower_A();
			case VisGridPackage.LOAD__POWER_B:
				return getPower_B();
			case VisGridPackage.LOAD__POWER_C:
				return getPower_C();
			case VisGridPackage.LOAD__SHUNT_A:
				return getShunt_A();
			case VisGridPackage.LOAD__SHUNT_B:
				return getShunt_B();
			case VisGridPackage.LOAD__SHUNT_C:
				return getShunt_C();
			case VisGridPackage.LOAD__PHASES:
				return getPhases();
			case VisGridPackage.LOAD__NOMINAL_VOLTAGE:
				return getNominal_voltage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.LOAD__LOAD_CLASS:
				setLoad_class((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_A:
				setConstant_power_A((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_B:
				setConstant_power_B((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_C:
				setConstant_power_C((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAL:
				setConstant_power_A_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAL:
				setConstant_power_B_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAL:
				setConstant_power_C_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAC:
				setConstant_power_A_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAC:
				setConstant_power_B_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAC:
				setConstant_power_C_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_A:
				setConstant_current_A((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_B:
				setConstant_current_B((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_C:
				setConstant_current_C((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAL:
				setConstant_current_A_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAL:
				setConstant_current_B_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAL:
				setConstant_current_C_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAC:
				setConstant_current_A_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAC:
				setConstant_current_B_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAC:
				setConstant_current_C_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_A:
				setConstant_impedance_A((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_B:
				setConstant_impedance_B((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_C:
				setConstant_impedance_C((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAL:
				setConstant_impedance_A_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAL:
				setConstant_impedance_B_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAL:
				setConstant_impedance_C_real((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAC:
				setConstant_impedance_A_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAC:
				setConstant_impedance_B_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAC:
				setConstant_impedance_C_reac((String)newValue);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_A:
				setMeasured_voltage_A((String)newValue);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_B:
				setMeasured_voltage_B((String)newValue);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_C:
				setMeasured_voltage_C((String)newValue);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_AB:
				setMeasured_voltage_AB((String)newValue);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_BC:
				setMeasured_voltage_BC((String)newValue);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_CA:
				setMeasured_voltage_CA((String)newValue);
				return;
			case VisGridPackage.LOAD__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.LOAD__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.LOAD__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.LOAD__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.LOAD__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.LOAD__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.LOAD__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.LOAD__VOLTAGE_AB:
				setVoltage_AB((String)newValue);
				return;
			case VisGridPackage.LOAD__VOLTAGE_BC:
				setVoltage_BC((String)newValue);
				return;
			case VisGridPackage.LOAD__VOLTAGE_CA:
				setVoltage_CA((String)newValue);
				return;
			case VisGridPackage.LOAD__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.LOAD__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.LOAD__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.LOAD__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.LOAD__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.LOAD__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.LOAD__SHUNT_A:
				setShunt_A((String)newValue);
				return;
			case VisGridPackage.LOAD__SHUNT_B:
				setShunt_B((String)newValue);
				return;
			case VisGridPackage.LOAD__SHUNT_C:
				setShunt_C((String)newValue);
				return;
			case VisGridPackage.LOAD__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.LOAD__NOMINAL_VOLTAGE:
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
			case VisGridPackage.LOAD__LOAD_CLASS:
				setLoad_class(LOAD_CLASS_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_A:
				setConstant_power_A(CONSTANT_POWER_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_B:
				setConstant_power_B(CONSTANT_POWER_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_C:
				setConstant_power_C(CONSTANT_POWER_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAL:
				setConstant_power_A_real(CONSTANT_POWER_AREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAL:
				setConstant_power_B_real(CONSTANT_POWER_BREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAL:
				setConstant_power_C_real(CONSTANT_POWER_CREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAC:
				setConstant_power_A_reac(CONSTANT_POWER_AREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAC:
				setConstant_power_B_reac(CONSTANT_POWER_BREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAC:
				setConstant_power_C_reac(CONSTANT_POWER_CREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_A:
				setConstant_current_A(CONSTANT_CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_B:
				setConstant_current_B(CONSTANT_CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_C:
				setConstant_current_C(CONSTANT_CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAL:
				setConstant_current_A_real(CONSTANT_CURRENT_AREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAL:
				setConstant_current_B_real(CONSTANT_CURRENT_BREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAL:
				setConstant_current_C_real(CONSTANT_CURRENT_CREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAC:
				setConstant_current_A_reac(CONSTANT_CURRENT_AREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAC:
				setConstant_current_B_reac(CONSTANT_CURRENT_BREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAC:
				setConstant_current_C_reac(CONSTANT_CURRENT_CREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_A:
				setConstant_impedance_A(CONSTANT_IMPEDANCE_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_B:
				setConstant_impedance_B(CONSTANT_IMPEDANCE_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_C:
				setConstant_impedance_C(CONSTANT_IMPEDANCE_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAL:
				setConstant_impedance_A_real(CONSTANT_IMPEDANCE_AREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAL:
				setConstant_impedance_B_real(CONSTANT_IMPEDANCE_BREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAL:
				setConstant_impedance_C_real(CONSTANT_IMPEDANCE_CREAL_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAC:
				setConstant_impedance_A_reac(CONSTANT_IMPEDANCE_AREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAC:
				setConstant_impedance_B_reac(CONSTANT_IMPEDANCE_BREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAC:
				setConstant_impedance_C_reac(CONSTANT_IMPEDANCE_CREAC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_A:
				setMeasured_voltage_A(MEASURED_VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_B:
				setMeasured_voltage_B(MEASURED_VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_C:
				setMeasured_voltage_C(MEASURED_VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_AB:
				setMeasured_voltage_AB(MEASURED_VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_BC:
				setMeasured_voltage_BC(MEASURED_VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_CA:
				setMeasured_voltage_CA(MEASURED_VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.LOAD__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.LOAD__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.LOAD__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.LOAD__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.LOAD__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__VOLTAGE_AB:
				setVoltage_AB(VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.LOAD__VOLTAGE_BC:
				setVoltage_BC(VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.LOAD__VOLTAGE_CA:
				setVoltage_CA(VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__SHUNT_A:
				setShunt_A(SHUNT_A_EDEFAULT);
				return;
			case VisGridPackage.LOAD__SHUNT_B:
				setShunt_B(SHUNT_B_EDEFAULT);
				return;
			case VisGridPackage.LOAD__SHUNT_C:
				setShunt_C(SHUNT_C_EDEFAULT);
				return;
			case VisGridPackage.LOAD__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.LOAD__NOMINAL_VOLTAGE:
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
			case VisGridPackage.LOAD__LOAD_CLASS:
				return LOAD_CLASS_EDEFAULT == null ? load_class != null : !LOAD_CLASS_EDEFAULT.equals(load_class);
			case VisGridPackage.LOAD__CONSTANT_POWER_A:
				return CONSTANT_POWER_A_EDEFAULT == null ? constant_power_A != null : !CONSTANT_POWER_A_EDEFAULT.equals(constant_power_A);
			case VisGridPackage.LOAD__CONSTANT_POWER_B:
				return CONSTANT_POWER_B_EDEFAULT == null ? constant_power_B != null : !CONSTANT_POWER_B_EDEFAULT.equals(constant_power_B);
			case VisGridPackage.LOAD__CONSTANT_POWER_C:
				return CONSTANT_POWER_C_EDEFAULT == null ? constant_power_C != null : !CONSTANT_POWER_C_EDEFAULT.equals(constant_power_C);
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAL:
				return CONSTANT_POWER_AREAL_EDEFAULT == null ? constant_power_A_real != null : !CONSTANT_POWER_AREAL_EDEFAULT.equals(constant_power_A_real);
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAL:
				return CONSTANT_POWER_BREAL_EDEFAULT == null ? constant_power_B_real != null : !CONSTANT_POWER_BREAL_EDEFAULT.equals(constant_power_B_real);
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAL:
				return CONSTANT_POWER_CREAL_EDEFAULT == null ? constant_power_C_real != null : !CONSTANT_POWER_CREAL_EDEFAULT.equals(constant_power_C_real);
			case VisGridPackage.LOAD__CONSTANT_POWER_AREAC:
				return CONSTANT_POWER_AREAC_EDEFAULT == null ? constant_power_A_reac != null : !CONSTANT_POWER_AREAC_EDEFAULT.equals(constant_power_A_reac);
			case VisGridPackage.LOAD__CONSTANT_POWER_BREAC:
				return CONSTANT_POWER_BREAC_EDEFAULT == null ? constant_power_B_reac != null : !CONSTANT_POWER_BREAC_EDEFAULT.equals(constant_power_B_reac);
			case VisGridPackage.LOAD__CONSTANT_POWER_CREAC:
				return CONSTANT_POWER_CREAC_EDEFAULT == null ? constant_power_C_reac != null : !CONSTANT_POWER_CREAC_EDEFAULT.equals(constant_power_C_reac);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_A:
				return CONSTANT_CURRENT_A_EDEFAULT == null ? constant_current_A != null : !CONSTANT_CURRENT_A_EDEFAULT.equals(constant_current_A);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_B:
				return CONSTANT_CURRENT_B_EDEFAULT == null ? constant_current_B != null : !CONSTANT_CURRENT_B_EDEFAULT.equals(constant_current_B);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_C:
				return CONSTANT_CURRENT_C_EDEFAULT == null ? constant_current_C != null : !CONSTANT_CURRENT_C_EDEFAULT.equals(constant_current_C);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAL:
				return CONSTANT_CURRENT_AREAL_EDEFAULT == null ? constant_current_A_real != null : !CONSTANT_CURRENT_AREAL_EDEFAULT.equals(constant_current_A_real);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAL:
				return CONSTANT_CURRENT_BREAL_EDEFAULT == null ? constant_current_B_real != null : !CONSTANT_CURRENT_BREAL_EDEFAULT.equals(constant_current_B_real);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAL:
				return CONSTANT_CURRENT_CREAL_EDEFAULT == null ? constant_current_C_real != null : !CONSTANT_CURRENT_CREAL_EDEFAULT.equals(constant_current_C_real);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_AREAC:
				return CONSTANT_CURRENT_AREAC_EDEFAULT == null ? constant_current_A_reac != null : !CONSTANT_CURRENT_AREAC_EDEFAULT.equals(constant_current_A_reac);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_BREAC:
				return CONSTANT_CURRENT_BREAC_EDEFAULT == null ? constant_current_B_reac != null : !CONSTANT_CURRENT_BREAC_EDEFAULT.equals(constant_current_B_reac);
			case VisGridPackage.LOAD__CONSTANT_CURRENT_CREAC:
				return CONSTANT_CURRENT_CREAC_EDEFAULT == null ? constant_current_C_reac != null : !CONSTANT_CURRENT_CREAC_EDEFAULT.equals(constant_current_C_reac);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_A:
				return CONSTANT_IMPEDANCE_A_EDEFAULT == null ? constant_impedance_A != null : !CONSTANT_IMPEDANCE_A_EDEFAULT.equals(constant_impedance_A);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_B:
				return CONSTANT_IMPEDANCE_B_EDEFAULT == null ? constant_impedance_B != null : !CONSTANT_IMPEDANCE_B_EDEFAULT.equals(constant_impedance_B);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_C:
				return CONSTANT_IMPEDANCE_C_EDEFAULT == null ? constant_impedance_C != null : !CONSTANT_IMPEDANCE_C_EDEFAULT.equals(constant_impedance_C);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAL:
				return CONSTANT_IMPEDANCE_AREAL_EDEFAULT == null ? constant_impedance_A_real != null : !CONSTANT_IMPEDANCE_AREAL_EDEFAULT.equals(constant_impedance_A_real);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAL:
				return CONSTANT_IMPEDANCE_BREAL_EDEFAULT == null ? constant_impedance_B_real != null : !CONSTANT_IMPEDANCE_BREAL_EDEFAULT.equals(constant_impedance_B_real);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAL:
				return CONSTANT_IMPEDANCE_CREAL_EDEFAULT == null ? constant_impedance_C_real != null : !CONSTANT_IMPEDANCE_CREAL_EDEFAULT.equals(constant_impedance_C_real);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_AREAC:
				return CONSTANT_IMPEDANCE_AREAC_EDEFAULT == null ? constant_impedance_A_reac != null : !CONSTANT_IMPEDANCE_AREAC_EDEFAULT.equals(constant_impedance_A_reac);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_BREAC:
				return CONSTANT_IMPEDANCE_BREAC_EDEFAULT == null ? constant_impedance_B_reac != null : !CONSTANT_IMPEDANCE_BREAC_EDEFAULT.equals(constant_impedance_B_reac);
			case VisGridPackage.LOAD__CONSTANT_IMPEDANCE_CREAC:
				return CONSTANT_IMPEDANCE_CREAC_EDEFAULT == null ? constant_impedance_C_reac != null : !CONSTANT_IMPEDANCE_CREAC_EDEFAULT.equals(constant_impedance_C_reac);
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_A:
				return MEASURED_VOLTAGE_A_EDEFAULT == null ? measured_voltage_A != null : !MEASURED_VOLTAGE_A_EDEFAULT.equals(measured_voltage_A);
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_B:
				return MEASURED_VOLTAGE_B_EDEFAULT == null ? measured_voltage_B != null : !MEASURED_VOLTAGE_B_EDEFAULT.equals(measured_voltage_B);
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_C:
				return MEASURED_VOLTAGE_C_EDEFAULT == null ? measured_voltage_C != null : !MEASURED_VOLTAGE_C_EDEFAULT.equals(measured_voltage_C);
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_AB:
				return MEASURED_VOLTAGE_AB_EDEFAULT == null ? measured_voltage_AB != null : !MEASURED_VOLTAGE_AB_EDEFAULT.equals(measured_voltage_AB);
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_BC:
				return MEASURED_VOLTAGE_BC_EDEFAULT == null ? measured_voltage_BC != null : !MEASURED_VOLTAGE_BC_EDEFAULT.equals(measured_voltage_BC);
			case VisGridPackage.LOAD__MEASURED_VOLTAGE_CA:
				return MEASURED_VOLTAGE_CA_EDEFAULT == null ? measured_voltage_CA != null : !MEASURED_VOLTAGE_CA_EDEFAULT.equals(measured_voltage_CA);
			case VisGridPackage.LOAD__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.LOAD__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.LOAD__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.LOAD__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.LOAD__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.LOAD__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.LOAD__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.LOAD__VOLTAGE_AB:
				return VOLTAGE_AB_EDEFAULT == null ? voltage_AB != null : !VOLTAGE_AB_EDEFAULT.equals(voltage_AB);
			case VisGridPackage.LOAD__VOLTAGE_BC:
				return VOLTAGE_BC_EDEFAULT == null ? voltage_BC != null : !VOLTAGE_BC_EDEFAULT.equals(voltage_BC);
			case VisGridPackage.LOAD__VOLTAGE_CA:
				return VOLTAGE_CA_EDEFAULT == null ? voltage_CA != null : !VOLTAGE_CA_EDEFAULT.equals(voltage_CA);
			case VisGridPackage.LOAD__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.LOAD__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.LOAD__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.LOAD__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.LOAD__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.LOAD__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.LOAD__SHUNT_A:
				return SHUNT_A_EDEFAULT == null ? shunt_A != null : !SHUNT_A_EDEFAULT.equals(shunt_A);
			case VisGridPackage.LOAD__SHUNT_B:
				return SHUNT_B_EDEFAULT == null ? shunt_B != null : !SHUNT_B_EDEFAULT.equals(shunt_B);
			case VisGridPackage.LOAD__SHUNT_C:
				return SHUNT_C_EDEFAULT == null ? shunt_C != null : !SHUNT_C_EDEFAULT.equals(shunt_C);
			case VisGridPackage.LOAD__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.LOAD__NOMINAL_VOLTAGE:
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
		result.append(" (load_class: ");
		result.append(load_class);
		result.append(", constant_power_A: ");
		result.append(constant_power_A);
		result.append(", constant_power_B: ");
		result.append(constant_power_B);
		result.append(", constant_power_C: ");
		result.append(constant_power_C);
		result.append(", constant_power_A_real: ");
		result.append(constant_power_A_real);
		result.append(", constant_power_B_real: ");
		result.append(constant_power_B_real);
		result.append(", constant_power_C_real: ");
		result.append(constant_power_C_real);
		result.append(", constant_power_A_reac: ");
		result.append(constant_power_A_reac);
		result.append(", constant_power_B_reac: ");
		result.append(constant_power_B_reac);
		result.append(", constant_power_C_reac: ");
		result.append(constant_power_C_reac);
		result.append(", constant_current_A: ");
		result.append(constant_current_A);
		result.append(", constant_current_B: ");
		result.append(constant_current_B);
		result.append(", constant_current_C: ");
		result.append(constant_current_C);
		result.append(", constant_current_A_real: ");
		result.append(constant_current_A_real);
		result.append(", constant_current_B_real: ");
		result.append(constant_current_B_real);
		result.append(", constant_current_C_real: ");
		result.append(constant_current_C_real);
		result.append(", constant_current_A_reac: ");
		result.append(constant_current_A_reac);
		result.append(", constant_current_B_reac: ");
		result.append(constant_current_B_reac);
		result.append(", constant_current_C_reac: ");
		result.append(constant_current_C_reac);
		result.append(", constant_impedance_A: ");
		result.append(constant_impedance_A);
		result.append(", constant_impedance_B: ");
		result.append(constant_impedance_B);
		result.append(", constant_impedance_C: ");
		result.append(constant_impedance_C);
		result.append(", constant_impedance_A_real: ");
		result.append(constant_impedance_A_real);
		result.append(", constant_impedance_B_real: ");
		result.append(constant_impedance_B_real);
		result.append(", constant_impedance_C_real: ");
		result.append(constant_impedance_C_real);
		result.append(", constant_impedance_A_reac: ");
		result.append(constant_impedance_A_reac);
		result.append(", constant_impedance_B_reac: ");
		result.append(constant_impedance_B_reac);
		result.append(", constant_impedance_C_reac: ");
		result.append(constant_impedance_C_reac);
		result.append(", measured_voltage_A: ");
		result.append(measured_voltage_A);
		result.append(", measured_voltage_B: ");
		result.append(measured_voltage_B);
		result.append(", measured_voltage_C: ");
		result.append(measured_voltage_C);
		result.append(", measured_voltage_AB: ");
		result.append(measured_voltage_AB);
		result.append(", measured_voltage_BC: ");
		result.append(measured_voltage_BC);
		result.append(", measured_voltage_CA: ");
		result.append(measured_voltage_CA);
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

} //LoadImpl
