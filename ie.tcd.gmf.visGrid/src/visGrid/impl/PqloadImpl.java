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

import visGrid.Pqload;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pqload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.PqloadImpl#getWeather <em>Weather</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getT_nominal <em>Tnominal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZp_T <em>Zp T</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZp_H <em>Zp H</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZp_S <em>Zp S</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZp_W <em>Zp W</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZp_R <em>Zp R</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZp <em>Zp</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZq_T <em>Zq T</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZq_H <em>Zq H</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZq_S <em>Zq S</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZq_W <em>Zq W</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZq_R <em>Zq R</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getZq <em>Zq</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIm_T <em>Im T</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIm_H <em>Im H</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIm_S <em>Im S</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIm_W <em>Im W</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIm_R <em>Im R</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIm <em>Im</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIa_T <em>Ia T</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIa_H <em>Ia H</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIa_S <em>Ia S</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIa_W <em>Ia W</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIa_R <em>Ia R</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getIa <em>Ia</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPp_T <em>Pp T</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPp_H <em>Pp H</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPp_S <em>Pp S</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPp_W <em>Pp W</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPp_R <em>Pp R</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPp <em>Pp</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPq_T <em>Pq T</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPq_H <em>Pq H</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPq_S <em>Pq S</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPq_W <em>Pq W</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPq_R <em>Pq R</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPq <em>Pq</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getInput_temp <em>Input temp</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getInput_humid <em>Input humid</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getInput_solar <em>Input solar</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getInput_wind <em>Input wind</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getInput_rain <em>Input rain</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_imped_p <em>Output imped p</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_imped_q <em>Output imped q</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_current_m <em>Output current m</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_current_a <em>Output current a</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_power_p <em>Output power p</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_power_q <em>Output power q</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_impedance <em>Output impedance</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_current <em>Output current</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getOutput_power <em>Output power</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getLoad_class <em>Load class</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_A <em>Constant power A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_B <em>Constant power B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_C <em>Constant power C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_A_real <em>Constant power Areal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_B_real <em>Constant power Breal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_C_real <em>Constant power Creal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_A_reac <em>Constant power Areac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_B_reac <em>Constant power Breac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_power_C_reac <em>Constant power Creac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_A <em>Constant current A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_B <em>Constant current B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_C <em>Constant current C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_A_real <em>Constant current Areal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_B_real <em>Constant current Breal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_C_real <em>Constant current Creal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_A_reac <em>Constant current Areac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_B_reac <em>Constant current Breac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_current_C_reac <em>Constant current Creac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_A <em>Constant impedance A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_B <em>Constant impedance B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_C <em>Constant impedance C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_A_real <em>Constant impedance Areal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_B_real <em>Constant impedance Breal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_C_real <em>Constant impedance Creal</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_A_reac <em>Constant impedance Areac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_B_reac <em>Constant impedance Breac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getConstant_impedance_C_reac <em>Constant impedance Creac</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMeasured_voltage_A <em>Measured voltage A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMeasured_voltage_B <em>Measured voltage B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMeasured_voltage_C <em>Measured voltage C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMeasured_voltage_AB <em>Measured voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMeasured_voltage_BC <em>Measured voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMeasured_voltage_CA <em>Measured voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getBustype <em>Bustype</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getBusflags <em>Busflags</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getReference_bus <em>Reference bus</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getMaximum_voltage_error <em>Maximum voltage error</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getVoltage_A <em>Voltage A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getVoltage_B <em>Voltage B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getVoltage_C <em>Voltage C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getVoltage_AB <em>Voltage AB</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getVoltage_BC <em>Voltage BC</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getVoltage_CA <em>Voltage CA</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getCurrent_A <em>Current A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getCurrent_B <em>Current B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getCurrent_C <em>Current C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPower_A <em>Power A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPower_B <em>Power B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPower_C <em>Power C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getShunt_A <em>Shunt A</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getShunt_B <em>Shunt B</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getShunt_C <em>Shunt C</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link visGrid.impl.PqloadImpl#getNominal_voltage <em>Nominal voltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PqloadImpl extends ConnectionImpl implements Pqload {
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
	 * The default value of the '{@link #getWeather() <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected static final String WEATHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeather() <em>Weather</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeather()
	 * @generated
	 * @ordered
	 */
	protected String weather = WEATHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getT_nominal() <em>Tnominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_nominal()
	 * @generated
	 * @ordered
	 */
	protected static final String TNOMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getT_nominal() <em>Tnominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT_nominal()
	 * @generated
	 * @ordered
	 */
	protected String t_nominal = TNOMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getZp_T() <em>Zp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_T()
	 * @generated
	 * @ordered
	 */
	protected static final String ZP_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZp_T() <em>Zp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_T()
	 * @generated
	 * @ordered
	 */
	protected String zp_T = ZP_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getZp_H() <em>Zp H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_H()
	 * @generated
	 * @ordered
	 */
	protected static final String ZP_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZp_H() <em>Zp H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_H()
	 * @generated
	 * @ordered
	 */
	protected String zp_H = ZP_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getZp_S() <em>Zp S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_S()
	 * @generated
	 * @ordered
	 */
	protected static final String ZP_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZp_S() <em>Zp S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_S()
	 * @generated
	 * @ordered
	 */
	protected String zp_S = ZP_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getZp_W() <em>Zp W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_W()
	 * @generated
	 * @ordered
	 */
	protected static final String ZP_W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZp_W() <em>Zp W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_W()
	 * @generated
	 * @ordered
	 */
	protected String zp_W = ZP_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getZp_R() <em>Zp R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_R()
	 * @generated
	 * @ordered
	 */
	protected static final String ZP_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZp_R() <em>Zp R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp_R()
	 * @generated
	 * @ordered
	 */
	protected String zp_R = ZP_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getZp() <em>Zp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp()
	 * @generated
	 * @ordered
	 */
	protected static final String ZP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZp() <em>Zp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZp()
	 * @generated
	 * @ordered
	 */
	protected String zp = ZP_EDEFAULT;

	/**
	 * The default value of the '{@link #getZq_T() <em>Zq T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_T()
	 * @generated
	 * @ordered
	 */
	protected static final String ZQ_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZq_T() <em>Zq T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_T()
	 * @generated
	 * @ordered
	 */
	protected String zq_T = ZQ_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getZq_H() <em>Zq H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_H()
	 * @generated
	 * @ordered
	 */
	protected static final String ZQ_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZq_H() <em>Zq H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_H()
	 * @generated
	 * @ordered
	 */
	protected String zq_H = ZQ_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getZq_S() <em>Zq S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_S()
	 * @generated
	 * @ordered
	 */
	protected static final String ZQ_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZq_S() <em>Zq S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_S()
	 * @generated
	 * @ordered
	 */
	protected String zq_S = ZQ_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getZq_W() <em>Zq W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_W()
	 * @generated
	 * @ordered
	 */
	protected static final String ZQ_W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZq_W() <em>Zq W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_W()
	 * @generated
	 * @ordered
	 */
	protected String zq_W = ZQ_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getZq_R() <em>Zq R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_R()
	 * @generated
	 * @ordered
	 */
	protected static final String ZQ_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZq_R() <em>Zq R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq_R()
	 * @generated
	 * @ordered
	 */
	protected String zq_R = ZQ_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getZq() <em>Zq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq()
	 * @generated
	 * @ordered
	 */
	protected static final String ZQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZq() <em>Zq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZq()
	 * @generated
	 * @ordered
	 */
	protected String zq = ZQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getIm_T() <em>Im T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_T()
	 * @generated
	 * @ordered
	 */
	protected static final String IM_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIm_T() <em>Im T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_T()
	 * @generated
	 * @ordered
	 */
	protected String im_T = IM_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getIm_H() <em>Im H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_H()
	 * @generated
	 * @ordered
	 */
	protected static final String IM_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIm_H() <em>Im H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_H()
	 * @generated
	 * @ordered
	 */
	protected String im_H = IM_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getIm_S() <em>Im S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_S()
	 * @generated
	 * @ordered
	 */
	protected static final String IM_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIm_S() <em>Im S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_S()
	 * @generated
	 * @ordered
	 */
	protected String im_S = IM_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getIm_W() <em>Im W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_W()
	 * @generated
	 * @ordered
	 */
	protected static final String IM_W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIm_W() <em>Im W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_W()
	 * @generated
	 * @ordered
	 */
	protected String im_W = IM_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getIm_R() <em>Im R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_R()
	 * @generated
	 * @ordered
	 */
	protected static final String IM_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIm_R() <em>Im R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm_R()
	 * @generated
	 * @ordered
	 */
	protected String im_R = IM_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getIm() <em>Im</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm()
	 * @generated
	 * @ordered
	 */
	protected static final String IM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIm() <em>Im</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIm()
	 * @generated
	 * @ordered
	 */
	protected String im = IM_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa_T() <em>Ia T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_T()
	 * @generated
	 * @ordered
	 */
	protected static final String IA_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIa_T() <em>Ia T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_T()
	 * @generated
	 * @ordered
	 */
	protected String ia_T = IA_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa_H() <em>Ia H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_H()
	 * @generated
	 * @ordered
	 */
	protected static final String IA_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIa_H() <em>Ia H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_H()
	 * @generated
	 * @ordered
	 */
	protected String ia_H = IA_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa_S() <em>Ia S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_S()
	 * @generated
	 * @ordered
	 */
	protected static final String IA_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIa_S() <em>Ia S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_S()
	 * @generated
	 * @ordered
	 */
	protected String ia_S = IA_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa_W() <em>Ia W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_W()
	 * @generated
	 * @ordered
	 */
	protected static final String IA_W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIa_W() <em>Ia W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_W()
	 * @generated
	 * @ordered
	 */
	protected String ia_W = IA_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa_R() <em>Ia R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_R()
	 * @generated
	 * @ordered
	 */
	protected static final String IA_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIa_R() <em>Ia R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa_R()
	 * @generated
	 * @ordered
	 */
	protected String ia_R = IA_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getIa() <em>Ia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa()
	 * @generated
	 * @ordered
	 */
	protected static final String IA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIa() <em>Ia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIa()
	 * @generated
	 * @ordered
	 */
	protected String ia = IA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp_T() <em>Pp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_T()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp_T() <em>Pp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_T()
	 * @generated
	 * @ordered
	 */
	protected String pp_T = PP_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp_H() <em>Pp H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_H()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp_H() <em>Pp H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_H()
	 * @generated
	 * @ordered
	 */
	protected String pp_H = PP_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp_S() <em>Pp S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_S()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp_S() <em>Pp S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_S()
	 * @generated
	 * @ordered
	 */
	protected String pp_S = PP_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp_W() <em>Pp W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_W()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp_W() <em>Pp W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_W()
	 * @generated
	 * @ordered
	 */
	protected String pp_W = PP_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp_R() <em>Pp R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_R()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp_R() <em>Pp R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp_R()
	 * @generated
	 * @ordered
	 */
	protected String pp_R = PP_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp() <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected static final String PP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPp() <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected String pp = PP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPq_T() <em>Pq T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_T()
	 * @generated
	 * @ordered
	 */
	protected static final String PQ_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPq_T() <em>Pq T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_T()
	 * @generated
	 * @ordered
	 */
	protected String pq_T = PQ_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getPq_H() <em>Pq H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_H()
	 * @generated
	 * @ordered
	 */
	protected static final String PQ_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPq_H() <em>Pq H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_H()
	 * @generated
	 * @ordered
	 */
	protected String pq_H = PQ_H_EDEFAULT;

	/**
	 * The default value of the '{@link #getPq_S() <em>Pq S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_S()
	 * @generated
	 * @ordered
	 */
	protected static final String PQ_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPq_S() <em>Pq S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_S()
	 * @generated
	 * @ordered
	 */
	protected String pq_S = PQ_S_EDEFAULT;

	/**
	 * The default value of the '{@link #getPq_W() <em>Pq W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_W()
	 * @generated
	 * @ordered
	 */
	protected static final String PQ_W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPq_W() <em>Pq W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_W()
	 * @generated
	 * @ordered
	 */
	protected String pq_W = PQ_W_EDEFAULT;

	/**
	 * The default value of the '{@link #getPq_R() <em>Pq R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_R()
	 * @generated
	 * @ordered
	 */
	protected static final String PQ_R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPq_R() <em>Pq R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq_R()
	 * @generated
	 * @ordered
	 */
	protected String pq_R = PQ_R_EDEFAULT;

	/**
	 * The default value of the '{@link #getPq() <em>Pq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq()
	 * @generated
	 * @ordered
	 */
	protected static final String PQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPq() <em>Pq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPq()
	 * @generated
	 * @ordered
	 */
	protected String pq = PQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_temp() <em>Input temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_temp() <em>Input temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_temp()
	 * @generated
	 * @ordered
	 */
	protected String input_temp = INPUT_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_humid() <em>Input humid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_humid()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_HUMID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_humid() <em>Input humid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_humid()
	 * @generated
	 * @ordered
	 */
	protected String input_humid = INPUT_HUMID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_solar() <em>Input solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_solar()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_SOLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_solar() <em>Input solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_solar()
	 * @generated
	 * @ordered
	 */
	protected String input_solar = INPUT_SOLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_wind() <em>Input wind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_wind()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_WIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_wind() <em>Input wind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_wind()
	 * @generated
	 * @ordered
	 */
	protected String input_wind = INPUT_WIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput_rain() <em>Input rain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_rain()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_RAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput_rain() <em>Input rain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_rain()
	 * @generated
	 * @ordered
	 */
	protected String input_rain = INPUT_RAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_imped_p() <em>Output imped p</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_imped_p()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_IMPED_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_imped_p() <em>Output imped p</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_imped_p()
	 * @generated
	 * @ordered
	 */
	protected String output_imped_p = OUTPUT_IMPED_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_imped_q() <em>Output imped q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_imped_q()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_IMPED_Q_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_imped_q() <em>Output imped q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_imped_q()
	 * @generated
	 * @ordered
	 */
	protected String output_imped_q = OUTPUT_IMPED_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_current_m() <em>Output current m</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_current_m()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_CURRENT_M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_current_m() <em>Output current m</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_current_m()
	 * @generated
	 * @ordered
	 */
	protected String output_current_m = OUTPUT_CURRENT_M_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_current_a() <em>Output current a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_current_a()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_CURRENT_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_current_a() <em>Output current a</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_current_a()
	 * @generated
	 * @ordered
	 */
	protected String output_current_a = OUTPUT_CURRENT_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_power_p() <em>Output power p</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_power_p()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_POWER_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_power_p() <em>Output power p</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_power_p()
	 * @generated
	 * @ordered
	 */
	protected String output_power_p = OUTPUT_POWER_P_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_power_q() <em>Output power q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_power_q()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_POWER_Q_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_power_q() <em>Output power q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_power_q()
	 * @generated
	 * @ordered
	 */
	protected String output_power_q = OUTPUT_POWER_Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_impedance() <em>Output impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_impedance()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_IMPEDANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_impedance() <em>Output impedance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_impedance()
	 * @generated
	 * @ordered
	 */
	protected String output_impedance = OUTPUT_IMPEDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_current() <em>Output current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_current()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_CURRENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_current() <em>Output current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_current()
	 * @generated
	 * @ordered
	 */
	protected String output_current = OUTPUT_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput_power() <em>Output power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_power()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput_power() <em>Output power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_power()
	 * @generated
	 * @ordered
	 */
	protected String output_power = OUTPUT_POWER_EDEFAULT;

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
	protected PqloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getPqload();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeather() {
		// Generated by python script located in this directory
			if (!lock.containsKey("weather")) lock.put("weather", new Boolean(false));
			if (!(Boolean)lock.get("weather")){
				lock.put("weather", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"weather");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Weather");
					weather= val;
			}
		return weather;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeather(String newWeather) {
		String oldWeather = weather;
		weather = newWeather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__WEATHER, oldWeather, weather));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getT_nominal() {
		// Generated by python script located in this directory
			if (!lock.containsKey("t_nominal")) lock.put("t_nominal", new Boolean(false));
			if (!(Boolean)lock.get("t_nominal")){
				lock.put("t_nominal", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"t_nominal");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"T_nominal");
					t_nominal= val;
			}
		return t_nominal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT_nominal(String newT_nominal) {
		String oldT_nominal = t_nominal;
		t_nominal = newT_nominal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__TNOMINAL, oldT_nominal, t_nominal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZp_T() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zp_T")) lock.put("zp_T", new Boolean(false));
			if (!(Boolean)lock.get("zp_T")){
				lock.put("zp_T", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zp_T");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zp_T");
					zp_T= val;
			}
		return zp_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZp_T(String newZp_T) {
		String oldZp_T = zp_T;
		zp_T = newZp_T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZP_T, oldZp_T, zp_T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZp_H() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zp_H")) lock.put("zp_H", new Boolean(false));
			if (!(Boolean)lock.get("zp_H")){
				lock.put("zp_H", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zp_H");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zp_H");
					zp_H= val;
			}
		return zp_H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZp_H(String newZp_H) {
		String oldZp_H = zp_H;
		zp_H = newZp_H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZP_H, oldZp_H, zp_H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZp_S() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zp_S")) lock.put("zp_S", new Boolean(false));
			if (!(Boolean)lock.get("zp_S")){
				lock.put("zp_S", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zp_S");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zp_S");
					zp_S= val;
			}
		return zp_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZp_S(String newZp_S) {
		String oldZp_S = zp_S;
		zp_S = newZp_S;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZP_S, oldZp_S, zp_S));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZp_W() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zp_W")) lock.put("zp_W", new Boolean(false));
			if (!(Boolean)lock.get("zp_W")){
				lock.put("zp_W", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zp_W");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zp_W");
					zp_W= val;
			}
		return zp_W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZp_W(String newZp_W) {
		String oldZp_W = zp_W;
		zp_W = newZp_W;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZP_W, oldZp_W, zp_W));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZp_R() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zp_R")) lock.put("zp_R", new Boolean(false));
			if (!(Boolean)lock.get("zp_R")){
				lock.put("zp_R", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zp_R");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zp_R");
					zp_R= val;
			}
		return zp_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZp_R(String newZp_R) {
		String oldZp_R = zp_R;
		zp_R = newZp_R;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZP_R, oldZp_R, zp_R));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZp() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zp")) lock.put("zp", new Boolean(false));
			if (!(Boolean)lock.get("zp")){
				lock.put("zp", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zp");
					zp= val;
			}
		return zp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZp(String newZp) {
		String oldZp = zp;
		zp = newZp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZP, oldZp, zp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZq_T() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zq_T")) lock.put("zq_T", new Boolean(false));
			if (!(Boolean)lock.get("zq_T")){
				lock.put("zq_T", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zq_T");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zq_T");
					zq_T= val;
			}
		return zq_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZq_T(String newZq_T) {
		String oldZq_T = zq_T;
		zq_T = newZq_T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZQ_T, oldZq_T, zq_T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZq_H() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zq_H")) lock.put("zq_H", new Boolean(false));
			if (!(Boolean)lock.get("zq_H")){
				lock.put("zq_H", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zq_H");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zq_H");
					zq_H= val;
			}
		return zq_H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZq_H(String newZq_H) {
		String oldZq_H = zq_H;
		zq_H = newZq_H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZQ_H, oldZq_H, zq_H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZq_S() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zq_S")) lock.put("zq_S", new Boolean(false));
			if (!(Boolean)lock.get("zq_S")){
				lock.put("zq_S", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zq_S");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zq_S");
					zq_S= val;
			}
		return zq_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZq_S(String newZq_S) {
		String oldZq_S = zq_S;
		zq_S = newZq_S;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZQ_S, oldZq_S, zq_S));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZq_W() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zq_W")) lock.put("zq_W", new Boolean(false));
			if (!(Boolean)lock.get("zq_W")){
				lock.put("zq_W", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zq_W");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zq_W");
					zq_W= val;
			}
		return zq_W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZq_W(String newZq_W) {
		String oldZq_W = zq_W;
		zq_W = newZq_W;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZQ_W, oldZq_W, zq_W));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZq_R() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zq_R")) lock.put("zq_R", new Boolean(false));
			if (!(Boolean)lock.get("zq_R")){
				lock.put("zq_R", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zq_R");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zq_R");
					zq_R= val;
			}
		return zq_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZq_R(String newZq_R) {
		String oldZq_R = zq_R;
		zq_R = newZq_R;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZQ_R, oldZq_R, zq_R));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZq() {
		// Generated by python script located in this directory
			if (!lock.containsKey("zq")) lock.put("zq", new Boolean(false));
			if (!(Boolean)lock.get("zq")){
				lock.put("zq", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"zq");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Zq");
					zq= val;
			}
		return zq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZq(String newZq) {
		String oldZq = zq;
		zq = newZq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__ZQ, oldZq, zq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIm_T() {
		// Generated by python script located in this directory
			if (!lock.containsKey("im_T")) lock.put("im_T", new Boolean(false));
			if (!(Boolean)lock.get("im_T")){
				lock.put("im_T", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"im_T");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Im_T");
					im_T= val;
			}
		return im_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm_T(String newIm_T) {
		String oldIm_T = im_T;
		im_T = newIm_T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IM_T, oldIm_T, im_T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIm_H() {
		// Generated by python script located in this directory
			if (!lock.containsKey("im_H")) lock.put("im_H", new Boolean(false));
			if (!(Boolean)lock.get("im_H")){
				lock.put("im_H", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"im_H");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Im_H");
					im_H= val;
			}
		return im_H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm_H(String newIm_H) {
		String oldIm_H = im_H;
		im_H = newIm_H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IM_H, oldIm_H, im_H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIm_S() {
		// Generated by python script located in this directory
			if (!lock.containsKey("im_S")) lock.put("im_S", new Boolean(false));
			if (!(Boolean)lock.get("im_S")){
				lock.put("im_S", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"im_S");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Im_S");
					im_S= val;
			}
		return im_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm_S(String newIm_S) {
		String oldIm_S = im_S;
		im_S = newIm_S;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IM_S, oldIm_S, im_S));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIm_W() {
		// Generated by python script located in this directory
			if (!lock.containsKey("im_W")) lock.put("im_W", new Boolean(false));
			if (!(Boolean)lock.get("im_W")){
				lock.put("im_W", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"im_W");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Im_W");
					im_W= val;
			}
		return im_W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm_W(String newIm_W) {
		String oldIm_W = im_W;
		im_W = newIm_W;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IM_W, oldIm_W, im_W));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIm_R() {
		// Generated by python script located in this directory
			if (!lock.containsKey("im_R")) lock.put("im_R", new Boolean(false));
			if (!(Boolean)lock.get("im_R")){
				lock.put("im_R", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"im_R");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Im_R");
					im_R= val;
			}
		return im_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm_R(String newIm_R) {
		String oldIm_R = im_R;
		im_R = newIm_R;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IM_R, oldIm_R, im_R));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIm() {
		// Generated by python script located in this directory
			if (!lock.containsKey("im")) lock.put("im", new Boolean(false));
			if (!(Boolean)lock.get("im")){
				lock.put("im", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"im");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Im");
					im= val;
			}
		return im;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIm(String newIm) {
		String oldIm = im;
		im = newIm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IM, oldIm, im));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIa_T() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ia_T")) lock.put("ia_T", new Boolean(false));
			if (!(Boolean)lock.get("ia_T")){
				lock.put("ia_T", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ia_T");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ia_T");
					ia_T= val;
			}
		return ia_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa_T(String newIa_T) {
		String oldIa_T = ia_T;
		ia_T = newIa_T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IA_T, oldIa_T, ia_T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIa_H() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ia_H")) lock.put("ia_H", new Boolean(false));
			if (!(Boolean)lock.get("ia_H")){
				lock.put("ia_H", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ia_H");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ia_H");
					ia_H= val;
			}
		return ia_H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa_H(String newIa_H) {
		String oldIa_H = ia_H;
		ia_H = newIa_H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IA_H, oldIa_H, ia_H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIa_S() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ia_S")) lock.put("ia_S", new Boolean(false));
			if (!(Boolean)lock.get("ia_S")){
				lock.put("ia_S", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ia_S");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ia_S");
					ia_S= val;
			}
		return ia_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa_S(String newIa_S) {
		String oldIa_S = ia_S;
		ia_S = newIa_S;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IA_S, oldIa_S, ia_S));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIa_W() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ia_W")) lock.put("ia_W", new Boolean(false));
			if (!(Boolean)lock.get("ia_W")){
				lock.put("ia_W", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ia_W");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ia_W");
					ia_W= val;
			}
		return ia_W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa_W(String newIa_W) {
		String oldIa_W = ia_W;
		ia_W = newIa_W;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IA_W, oldIa_W, ia_W));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIa_R() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ia_R")) lock.put("ia_R", new Boolean(false));
			if (!(Boolean)lock.get("ia_R")){
				lock.put("ia_R", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ia_R");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ia_R");
					ia_R= val;
			}
		return ia_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa_R(String newIa_R) {
		String oldIa_R = ia_R;
		ia_R = newIa_R;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IA_R, oldIa_R, ia_R));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIa() {
		// Generated by python script located in this directory
			if (!lock.containsKey("ia")) lock.put("ia", new Boolean(false));
			if (!(Boolean)lock.get("ia")){
				lock.put("ia", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"ia");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Ia");
					ia= val;
			}
		return ia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIa(String newIa) {
		String oldIa = ia;
		ia = newIa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__IA, oldIa, ia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp_T() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pp_T")) lock.put("pp_T", new Boolean(false));
			if (!(Boolean)lock.get("pp_T")){
				lock.put("pp_T", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pp_T");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pp_T");
					pp_T= val;
			}
		return pp_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp_T(String newPp_T) {
		String oldPp_T = pp_T;
		pp_T = newPp_T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PP_T, oldPp_T, pp_T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp_H() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pp_H")) lock.put("pp_H", new Boolean(false));
			if (!(Boolean)lock.get("pp_H")){
				lock.put("pp_H", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pp_H");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pp_H");
					pp_H= val;
			}
		return pp_H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp_H(String newPp_H) {
		String oldPp_H = pp_H;
		pp_H = newPp_H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PP_H, oldPp_H, pp_H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp_S() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pp_S")) lock.put("pp_S", new Boolean(false));
			if (!(Boolean)lock.get("pp_S")){
				lock.put("pp_S", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pp_S");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pp_S");
					pp_S= val;
			}
		return pp_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp_S(String newPp_S) {
		String oldPp_S = pp_S;
		pp_S = newPp_S;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PP_S, oldPp_S, pp_S));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp_W() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pp_W")) lock.put("pp_W", new Boolean(false));
			if (!(Boolean)lock.get("pp_W")){
				lock.put("pp_W", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pp_W");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pp_W");
					pp_W= val;
			}
		return pp_W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp_W(String newPp_W) {
		String oldPp_W = pp_W;
		pp_W = newPp_W;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PP_W, oldPp_W, pp_W));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp_R() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pp_R")) lock.put("pp_R", new Boolean(false));
			if (!(Boolean)lock.get("pp_R")){
				lock.put("pp_R", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pp_R");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pp_R");
					pp_R= val;
			}
		return pp_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp_R(String newPp_R) {
		String oldPp_R = pp_R;
		pp_R = newPp_R;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PP_R, oldPp_R, pp_R));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPp() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pp")) lock.put("pp", new Boolean(false));
			if (!(Boolean)lock.get("pp")){
				lock.put("pp", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pp");
					pp= val;
			}
		return pp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp(String newPp) {
		String oldPp = pp;
		pp = newPp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PP, oldPp, pp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPq_T() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pq_T")) lock.put("pq_T", new Boolean(false));
			if (!(Boolean)lock.get("pq_T")){
				lock.put("pq_T", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pq_T");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pq_T");
					pq_T= val;
			}
		return pq_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPq_T(String newPq_T) {
		String oldPq_T = pq_T;
		pq_T = newPq_T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PQ_T, oldPq_T, pq_T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPq_H() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pq_H")) lock.put("pq_H", new Boolean(false));
			if (!(Boolean)lock.get("pq_H")){
				lock.put("pq_H", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pq_H");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pq_H");
					pq_H= val;
			}
		return pq_H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPq_H(String newPq_H) {
		String oldPq_H = pq_H;
		pq_H = newPq_H;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PQ_H, oldPq_H, pq_H));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPq_S() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pq_S")) lock.put("pq_S", new Boolean(false));
			if (!(Boolean)lock.get("pq_S")){
				lock.put("pq_S", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pq_S");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pq_S");
					pq_S= val;
			}
		return pq_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPq_S(String newPq_S) {
		String oldPq_S = pq_S;
		pq_S = newPq_S;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PQ_S, oldPq_S, pq_S));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPq_W() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pq_W")) lock.put("pq_W", new Boolean(false));
			if (!(Boolean)lock.get("pq_W")){
				lock.put("pq_W", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pq_W");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pq_W");
					pq_W= val;
			}
		return pq_W;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPq_W(String newPq_W) {
		String oldPq_W = pq_W;
		pq_W = newPq_W;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PQ_W, oldPq_W, pq_W));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPq_R() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pq_R")) lock.put("pq_R", new Boolean(false));
			if (!(Boolean)lock.get("pq_R")){
				lock.put("pq_R", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pq_R");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pq_R");
					pq_R= val;
			}
		return pq_R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPq_R(String newPq_R) {
		String oldPq_R = pq_R;
		pq_R = newPq_R;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PQ_R, oldPq_R, pq_R));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPq() {
		// Generated by python script located in this directory
			if (!lock.containsKey("pq")) lock.put("pq", new Boolean(false));
			if (!(Boolean)lock.get("pq")){
				lock.put("pq", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"pq");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Pq");
					pq= val;
			}
		return pq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPq(String newPq) {
		String oldPq = pq;
		pq = newPq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PQ, oldPq, pq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_temp() {
		// Generated by python script located in this directory
			if (!lock.containsKey("input_temp")) lock.put("input_temp", new Boolean(false));
			if (!(Boolean)lock.get("input_temp")){
				lock.put("input_temp", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"input_temp");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Input_temp");
					input_temp= val;
			}
		return input_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_temp(String newInput_temp) {
		String oldInput_temp = input_temp;
		input_temp = newInput_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__INPUT_TEMP, oldInput_temp, input_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_humid() {
		// Generated by python script located in this directory
			if (!lock.containsKey("input_humid")) lock.put("input_humid", new Boolean(false));
			if (!(Boolean)lock.get("input_humid")){
				lock.put("input_humid", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"input_humid");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Input_humid");
					input_humid= val;
			}
		return input_humid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_humid(String newInput_humid) {
		String oldInput_humid = input_humid;
		input_humid = newInput_humid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__INPUT_HUMID, oldInput_humid, input_humid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_solar() {
		// Generated by python script located in this directory
			if (!lock.containsKey("input_solar")) lock.put("input_solar", new Boolean(false));
			if (!(Boolean)lock.get("input_solar")){
				lock.put("input_solar", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"input_solar");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Input_solar");
					input_solar= val;
			}
		return input_solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_solar(String newInput_solar) {
		String oldInput_solar = input_solar;
		input_solar = newInput_solar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__INPUT_SOLAR, oldInput_solar, input_solar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_wind() {
		// Generated by python script located in this directory
			if (!lock.containsKey("input_wind")) lock.put("input_wind", new Boolean(false));
			if (!(Boolean)lock.get("input_wind")){
				lock.put("input_wind", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"input_wind");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Input_wind");
					input_wind= val;
			}
		return input_wind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_wind(String newInput_wind) {
		String oldInput_wind = input_wind;
		input_wind = newInput_wind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__INPUT_WIND, oldInput_wind, input_wind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput_rain() {
		// Generated by python script located in this directory
			if (!lock.containsKey("input_rain")) lock.put("input_rain", new Boolean(false));
			if (!(Boolean)lock.get("input_rain")){
				lock.put("input_rain", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"input_rain");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Input_rain");
					input_rain= val;
			}
		return input_rain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_rain(String newInput_rain) {
		String oldInput_rain = input_rain;
		input_rain = newInput_rain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__INPUT_RAIN, oldInput_rain, input_rain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_imped_p() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_imped_p")) lock.put("output_imped_p", new Boolean(false));
			if (!(Boolean)lock.get("output_imped_p")){
				lock.put("output_imped_p", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_imped_p");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_imped_p");
					output_imped_p= val;
			}
		return output_imped_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_imped_p(String newOutput_imped_p) {
		String oldOutput_imped_p = output_imped_p;
		output_imped_p = newOutput_imped_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_IMPED_P, oldOutput_imped_p, output_imped_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_imped_q() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_imped_q")) lock.put("output_imped_q", new Boolean(false));
			if (!(Boolean)lock.get("output_imped_q")){
				lock.put("output_imped_q", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_imped_q");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_imped_q");
					output_imped_q= val;
			}
		return output_imped_q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_imped_q(String newOutput_imped_q) {
		String oldOutput_imped_q = output_imped_q;
		output_imped_q = newOutput_imped_q;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_IMPED_Q, oldOutput_imped_q, output_imped_q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_current_m() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_current_m")) lock.put("output_current_m", new Boolean(false));
			if (!(Boolean)lock.get("output_current_m")){
				lock.put("output_current_m", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_current_m");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_current_m");
					output_current_m= val;
			}
		return output_current_m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_current_m(String newOutput_current_m) {
		String oldOutput_current_m = output_current_m;
		output_current_m = newOutput_current_m;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_CURRENT_M, oldOutput_current_m, output_current_m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_current_a() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_current_a")) lock.put("output_current_a", new Boolean(false));
			if (!(Boolean)lock.get("output_current_a")){
				lock.put("output_current_a", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_current_a");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_current_a");
					output_current_a= val;
			}
		return output_current_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_current_a(String newOutput_current_a) {
		String oldOutput_current_a = output_current_a;
		output_current_a = newOutput_current_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_CURRENT_A, oldOutput_current_a, output_current_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_power_p() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_power_p")) lock.put("output_power_p", new Boolean(false));
			if (!(Boolean)lock.get("output_power_p")){
				lock.put("output_power_p", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_power_p");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_power_p");
					output_power_p= val;
			}
		return output_power_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_power_p(String newOutput_power_p) {
		String oldOutput_power_p = output_power_p;
		output_power_p = newOutput_power_p;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_POWER_P, oldOutput_power_p, output_power_p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_power_q() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_power_q")) lock.put("output_power_q", new Boolean(false));
			if (!(Boolean)lock.get("output_power_q")){
				lock.put("output_power_q", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_power_q");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_power_q");
					output_power_q= val;
			}
		return output_power_q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_power_q(String newOutput_power_q) {
		String oldOutput_power_q = output_power_q;
		output_power_q = newOutput_power_q;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_POWER_Q, oldOutput_power_q, output_power_q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_impedance() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_impedance")) lock.put("output_impedance", new Boolean(false));
			if (!(Boolean)lock.get("output_impedance")){
				lock.put("output_impedance", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_impedance");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_impedance");
					output_impedance= val;
			}
		return output_impedance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_impedance(String newOutput_impedance) {
		String oldOutput_impedance = output_impedance;
		output_impedance = newOutput_impedance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_IMPEDANCE, oldOutput_impedance, output_impedance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_current() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_current")) lock.put("output_current", new Boolean(false));
			if (!(Boolean)lock.get("output_current")){
				lock.put("output_current", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_current");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_current");
					output_current= val;
			}
		return output_current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_current(String newOutput_current) {
		String oldOutput_current = output_current;
		output_current = newOutput_current;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_CURRENT, oldOutput_current, output_current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput_power() {
		// Generated by python script located in this directory
			if (!lock.containsKey("output_power")) lock.put("output_power", new Boolean(false));
			if (!(Boolean)lock.get("output_power")){
				lock.put("output_power", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"output_power");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Output_power");
					output_power= val;
			}
		return output_power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_power(String newOutput_power) {
		String oldOutput_power = output_power;
		output_power = newOutput_power;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__OUTPUT_POWER, oldOutput_power, output_power));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__LOAD_CLASS, oldLoad_class, load_class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_A, oldConstant_power_A, constant_power_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_B, oldConstant_power_B, constant_power_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_C, oldConstant_power_C, constant_power_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_AREAL, oldConstant_power_A_real, constant_power_A_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_BREAL, oldConstant_power_B_real, constant_power_B_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_CREAL, oldConstant_power_C_real, constant_power_C_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_AREAC, oldConstant_power_A_reac, constant_power_A_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_BREAC, oldConstant_power_B_reac, constant_power_B_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_POWER_CREAC, oldConstant_power_C_reac, constant_power_C_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_A, oldConstant_current_A, constant_current_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_B, oldConstant_current_B, constant_current_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_C, oldConstant_current_C, constant_current_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAL, oldConstant_current_A_real, constant_current_A_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAL, oldConstant_current_B_real, constant_current_B_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAL, oldConstant_current_C_real, constant_current_C_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAC, oldConstant_current_A_reac, constant_current_A_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAC, oldConstant_current_B_reac, constant_current_B_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAC, oldConstant_current_C_reac, constant_current_C_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_A, oldConstant_impedance_A, constant_impedance_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_B, oldConstant_impedance_B, constant_impedance_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_C, oldConstant_impedance_C, constant_impedance_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAL, oldConstant_impedance_A_real, constant_impedance_A_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAL, oldConstant_impedance_B_real, constant_impedance_B_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAL, oldConstant_impedance_C_real, constant_impedance_C_real));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAC, oldConstant_impedance_A_reac, constant_impedance_A_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAC, oldConstant_impedance_B_reac, constant_impedance_B_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAC, oldConstant_impedance_C_reac, constant_impedance_C_reac));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MEASURED_VOLTAGE_A, oldMeasured_voltage_A, measured_voltage_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MEASURED_VOLTAGE_B, oldMeasured_voltage_B, measured_voltage_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MEASURED_VOLTAGE_C, oldMeasured_voltage_C, measured_voltage_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MEASURED_VOLTAGE_AB, oldMeasured_voltage_AB, measured_voltage_AB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MEASURED_VOLTAGE_BC, oldMeasured_voltage_BC, measured_voltage_BC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MEASURED_VOLTAGE_CA, oldMeasured_voltage_CA, measured_voltage_CA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__BUSTYPE, oldBustype, bustype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__BUSFLAGS, oldBusflags, busflags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__REFERENCE_BUS, oldReference_bus, reference_bus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__MAXIMUM_VOLTAGE_ERROR, oldMaximum_voltage_error, maximum_voltage_error));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__VOLTAGE_A, oldVoltage_A, voltage_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__VOLTAGE_B, oldVoltage_B, voltage_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__VOLTAGE_C, oldVoltage_C, voltage_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__VOLTAGE_AB, oldVoltage_AB, voltage_AB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__VOLTAGE_BC, oldVoltage_BC, voltage_BC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__VOLTAGE_CA, oldVoltage_CA, voltage_CA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CURRENT_A, oldCurrent_A, current_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CURRENT_B, oldCurrent_B, current_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__CURRENT_C, oldCurrent_C, current_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__POWER_A, oldPower_A, power_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__POWER_B, oldPower_B, power_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__POWER_C, oldPower_C, power_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__SHUNT_A, oldShunt_A, shunt_A));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__SHUNT_B, oldShunt_B, shunt_B));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__SHUNT_C, oldShunt_C, shunt_C));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__PHASES, oldPhases, phases));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.PQLOAD__NOMINAL_VOLTAGE, oldNominal_voltage, nominal_voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.PQLOAD__WEATHER:
				return getWeather();
			case VisGridPackage.PQLOAD__TNOMINAL:
				return getT_nominal();
			case VisGridPackage.PQLOAD__ZP_T:
				return getZp_T();
			case VisGridPackage.PQLOAD__ZP_H:
				return getZp_H();
			case VisGridPackage.PQLOAD__ZP_S:
				return getZp_S();
			case VisGridPackage.PQLOAD__ZP_W:
				return getZp_W();
			case VisGridPackage.PQLOAD__ZP_R:
				return getZp_R();
			case VisGridPackage.PQLOAD__ZP:
				return getZp();
			case VisGridPackage.PQLOAD__ZQ_T:
				return getZq_T();
			case VisGridPackage.PQLOAD__ZQ_H:
				return getZq_H();
			case VisGridPackage.PQLOAD__ZQ_S:
				return getZq_S();
			case VisGridPackage.PQLOAD__ZQ_W:
				return getZq_W();
			case VisGridPackage.PQLOAD__ZQ_R:
				return getZq_R();
			case VisGridPackage.PQLOAD__ZQ:
				return getZq();
			case VisGridPackage.PQLOAD__IM_T:
				return getIm_T();
			case VisGridPackage.PQLOAD__IM_H:
				return getIm_H();
			case VisGridPackage.PQLOAD__IM_S:
				return getIm_S();
			case VisGridPackage.PQLOAD__IM_W:
				return getIm_W();
			case VisGridPackage.PQLOAD__IM_R:
				return getIm_R();
			case VisGridPackage.PQLOAD__IM:
				return getIm();
			case VisGridPackage.PQLOAD__IA_T:
				return getIa_T();
			case VisGridPackage.PQLOAD__IA_H:
				return getIa_H();
			case VisGridPackage.PQLOAD__IA_S:
				return getIa_S();
			case VisGridPackage.PQLOAD__IA_W:
				return getIa_W();
			case VisGridPackage.PQLOAD__IA_R:
				return getIa_R();
			case VisGridPackage.PQLOAD__IA:
				return getIa();
			case VisGridPackage.PQLOAD__PP_T:
				return getPp_T();
			case VisGridPackage.PQLOAD__PP_H:
				return getPp_H();
			case VisGridPackage.PQLOAD__PP_S:
				return getPp_S();
			case VisGridPackage.PQLOAD__PP_W:
				return getPp_W();
			case VisGridPackage.PQLOAD__PP_R:
				return getPp_R();
			case VisGridPackage.PQLOAD__PP:
				return getPp();
			case VisGridPackage.PQLOAD__PQ_T:
				return getPq_T();
			case VisGridPackage.PQLOAD__PQ_H:
				return getPq_H();
			case VisGridPackage.PQLOAD__PQ_S:
				return getPq_S();
			case VisGridPackage.PQLOAD__PQ_W:
				return getPq_W();
			case VisGridPackage.PQLOAD__PQ_R:
				return getPq_R();
			case VisGridPackage.PQLOAD__PQ:
				return getPq();
			case VisGridPackage.PQLOAD__INPUT_TEMP:
				return getInput_temp();
			case VisGridPackage.PQLOAD__INPUT_HUMID:
				return getInput_humid();
			case VisGridPackage.PQLOAD__INPUT_SOLAR:
				return getInput_solar();
			case VisGridPackage.PQLOAD__INPUT_WIND:
				return getInput_wind();
			case VisGridPackage.PQLOAD__INPUT_RAIN:
				return getInput_rain();
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_P:
				return getOutput_imped_p();
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_Q:
				return getOutput_imped_q();
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_M:
				return getOutput_current_m();
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_A:
				return getOutput_current_a();
			case VisGridPackage.PQLOAD__OUTPUT_POWER_P:
				return getOutput_power_p();
			case VisGridPackage.PQLOAD__OUTPUT_POWER_Q:
				return getOutput_power_q();
			case VisGridPackage.PQLOAD__OUTPUT_IMPEDANCE:
				return getOutput_impedance();
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT:
				return getOutput_current();
			case VisGridPackage.PQLOAD__OUTPUT_POWER:
				return getOutput_power();
			case VisGridPackage.PQLOAD__LOAD_CLASS:
				return getLoad_class();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_A:
				return getConstant_power_A();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_B:
				return getConstant_power_B();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_C:
				return getConstant_power_C();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAL:
				return getConstant_power_A_real();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAL:
				return getConstant_power_B_real();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAL:
				return getConstant_power_C_real();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAC:
				return getConstant_power_A_reac();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAC:
				return getConstant_power_B_reac();
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAC:
				return getConstant_power_C_reac();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_A:
				return getConstant_current_A();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_B:
				return getConstant_current_B();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_C:
				return getConstant_current_C();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAL:
				return getConstant_current_A_real();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAL:
				return getConstant_current_B_real();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAL:
				return getConstant_current_C_real();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAC:
				return getConstant_current_A_reac();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAC:
				return getConstant_current_B_reac();
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAC:
				return getConstant_current_C_reac();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_A:
				return getConstant_impedance_A();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_B:
				return getConstant_impedance_B();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_C:
				return getConstant_impedance_C();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAL:
				return getConstant_impedance_A_real();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAL:
				return getConstant_impedance_B_real();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAL:
				return getConstant_impedance_C_real();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAC:
				return getConstant_impedance_A_reac();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAC:
				return getConstant_impedance_B_reac();
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAC:
				return getConstant_impedance_C_reac();
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_A:
				return getMeasured_voltage_A();
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_B:
				return getMeasured_voltage_B();
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_C:
				return getMeasured_voltage_C();
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_AB:
				return getMeasured_voltage_AB();
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_BC:
				return getMeasured_voltage_BC();
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_CA:
				return getMeasured_voltage_CA();
			case VisGridPackage.PQLOAD__BUSTYPE:
				return getBustype();
			case VisGridPackage.PQLOAD__BUSFLAGS:
				return getBusflags();
			case VisGridPackage.PQLOAD__REFERENCE_BUS:
				return getReference_bus();
			case VisGridPackage.PQLOAD__MAXIMUM_VOLTAGE_ERROR:
				return getMaximum_voltage_error();
			case VisGridPackage.PQLOAD__VOLTAGE_A:
				return getVoltage_A();
			case VisGridPackage.PQLOAD__VOLTAGE_B:
				return getVoltage_B();
			case VisGridPackage.PQLOAD__VOLTAGE_C:
				return getVoltage_C();
			case VisGridPackage.PQLOAD__VOLTAGE_AB:
				return getVoltage_AB();
			case VisGridPackage.PQLOAD__VOLTAGE_BC:
				return getVoltage_BC();
			case VisGridPackage.PQLOAD__VOLTAGE_CA:
				return getVoltage_CA();
			case VisGridPackage.PQLOAD__CURRENT_A:
				return getCurrent_A();
			case VisGridPackage.PQLOAD__CURRENT_B:
				return getCurrent_B();
			case VisGridPackage.PQLOAD__CURRENT_C:
				return getCurrent_C();
			case VisGridPackage.PQLOAD__POWER_A:
				return getPower_A();
			case VisGridPackage.PQLOAD__POWER_B:
				return getPower_B();
			case VisGridPackage.PQLOAD__POWER_C:
				return getPower_C();
			case VisGridPackage.PQLOAD__SHUNT_A:
				return getShunt_A();
			case VisGridPackage.PQLOAD__SHUNT_B:
				return getShunt_B();
			case VisGridPackage.PQLOAD__SHUNT_C:
				return getShunt_C();
			case VisGridPackage.PQLOAD__PHASES:
				return getPhases();
			case VisGridPackage.PQLOAD__NOMINAL_VOLTAGE:
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
			case VisGridPackage.PQLOAD__WEATHER:
				setWeather((String)newValue);
				return;
			case VisGridPackage.PQLOAD__TNOMINAL:
				setT_nominal((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZP_T:
				setZp_T((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZP_H:
				setZp_H((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZP_S:
				setZp_S((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZP_W:
				setZp_W((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZP_R:
				setZp_R((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZP:
				setZp((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZQ_T:
				setZq_T((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZQ_H:
				setZq_H((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZQ_S:
				setZq_S((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZQ_W:
				setZq_W((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZQ_R:
				setZq_R((String)newValue);
				return;
			case VisGridPackage.PQLOAD__ZQ:
				setZq((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IM_T:
				setIm_T((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IM_H:
				setIm_H((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IM_S:
				setIm_S((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IM_W:
				setIm_W((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IM_R:
				setIm_R((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IM:
				setIm((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IA_T:
				setIa_T((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IA_H:
				setIa_H((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IA_S:
				setIa_S((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IA_W:
				setIa_W((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IA_R:
				setIa_R((String)newValue);
				return;
			case VisGridPackage.PQLOAD__IA:
				setIa((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PP_T:
				setPp_T((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PP_H:
				setPp_H((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PP_S:
				setPp_S((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PP_W:
				setPp_W((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PP_R:
				setPp_R((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PP:
				setPp((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PQ_T:
				setPq_T((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PQ_H:
				setPq_H((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PQ_S:
				setPq_S((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PQ_W:
				setPq_W((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PQ_R:
				setPq_R((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PQ:
				setPq((String)newValue);
				return;
			case VisGridPackage.PQLOAD__INPUT_TEMP:
				setInput_temp((String)newValue);
				return;
			case VisGridPackage.PQLOAD__INPUT_HUMID:
				setInput_humid((String)newValue);
				return;
			case VisGridPackage.PQLOAD__INPUT_SOLAR:
				setInput_solar((String)newValue);
				return;
			case VisGridPackage.PQLOAD__INPUT_WIND:
				setInput_wind((String)newValue);
				return;
			case VisGridPackage.PQLOAD__INPUT_RAIN:
				setInput_rain((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_P:
				setOutput_imped_p((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_Q:
				setOutput_imped_q((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_M:
				setOutput_current_m((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_A:
				setOutput_current_a((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_POWER_P:
				setOutput_power_p((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_POWER_Q:
				setOutput_power_q((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_IMPEDANCE:
				setOutput_impedance((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT:
				setOutput_current((String)newValue);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_POWER:
				setOutput_power((String)newValue);
				return;
			case VisGridPackage.PQLOAD__LOAD_CLASS:
				setLoad_class((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_A:
				setConstant_power_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_B:
				setConstant_power_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_C:
				setConstant_power_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAL:
				setConstant_power_A_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAL:
				setConstant_power_B_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAL:
				setConstant_power_C_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAC:
				setConstant_power_A_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAC:
				setConstant_power_B_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAC:
				setConstant_power_C_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_A:
				setConstant_current_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_B:
				setConstant_current_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_C:
				setConstant_current_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAL:
				setConstant_current_A_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAL:
				setConstant_current_B_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAL:
				setConstant_current_C_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAC:
				setConstant_current_A_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAC:
				setConstant_current_B_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAC:
				setConstant_current_C_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_A:
				setConstant_impedance_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_B:
				setConstant_impedance_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_C:
				setConstant_impedance_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAL:
				setConstant_impedance_A_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAL:
				setConstant_impedance_B_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAL:
				setConstant_impedance_C_real((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAC:
				setConstant_impedance_A_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAC:
				setConstant_impedance_B_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAC:
				setConstant_impedance_C_reac((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_A:
				setMeasured_voltage_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_B:
				setMeasured_voltage_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_C:
				setMeasured_voltage_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_AB:
				setMeasured_voltage_AB((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_BC:
				setMeasured_voltage_BC((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_CA:
				setMeasured_voltage_CA((String)newValue);
				return;
			case VisGridPackage.PQLOAD__BUSTYPE:
				setBustype((String)newValue);
				return;
			case VisGridPackage.PQLOAD__BUSFLAGS:
				setBusflags((String)newValue);
				return;
			case VisGridPackage.PQLOAD__REFERENCE_BUS:
				setReference_bus((String)newValue);
				return;
			case VisGridPackage.PQLOAD__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error((String)newValue);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_A:
				setVoltage_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_B:
				setVoltage_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_C:
				setVoltage_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_AB:
				setVoltage_AB((String)newValue);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_BC:
				setVoltage_BC((String)newValue);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_CA:
				setVoltage_CA((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CURRENT_A:
				setCurrent_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CURRENT_B:
				setCurrent_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__CURRENT_C:
				setCurrent_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__POWER_A:
				setPower_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__POWER_B:
				setPower_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__POWER_C:
				setPower_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__SHUNT_A:
				setShunt_A((String)newValue);
				return;
			case VisGridPackage.PQLOAD__SHUNT_B:
				setShunt_B((String)newValue);
				return;
			case VisGridPackage.PQLOAD__SHUNT_C:
				setShunt_C((String)newValue);
				return;
			case VisGridPackage.PQLOAD__PHASES:
				setPhases((String)newValue);
				return;
			case VisGridPackage.PQLOAD__NOMINAL_VOLTAGE:
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
			case VisGridPackage.PQLOAD__WEATHER:
				setWeather(WEATHER_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__TNOMINAL:
				setT_nominal(TNOMINAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZP_T:
				setZp_T(ZP_T_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZP_H:
				setZp_H(ZP_H_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZP_S:
				setZp_S(ZP_S_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZP_W:
				setZp_W(ZP_W_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZP_R:
				setZp_R(ZP_R_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZP:
				setZp(ZP_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZQ_T:
				setZq_T(ZQ_T_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZQ_H:
				setZq_H(ZQ_H_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZQ_S:
				setZq_S(ZQ_S_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZQ_W:
				setZq_W(ZQ_W_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZQ_R:
				setZq_R(ZQ_R_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__ZQ:
				setZq(ZQ_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IM_T:
				setIm_T(IM_T_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IM_H:
				setIm_H(IM_H_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IM_S:
				setIm_S(IM_S_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IM_W:
				setIm_W(IM_W_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IM_R:
				setIm_R(IM_R_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IM:
				setIm(IM_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IA_T:
				setIa_T(IA_T_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IA_H:
				setIa_H(IA_H_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IA_S:
				setIa_S(IA_S_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IA_W:
				setIa_W(IA_W_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IA_R:
				setIa_R(IA_R_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__IA:
				setIa(IA_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PP_T:
				setPp_T(PP_T_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PP_H:
				setPp_H(PP_H_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PP_S:
				setPp_S(PP_S_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PP_W:
				setPp_W(PP_W_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PP_R:
				setPp_R(PP_R_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PP:
				setPp(PP_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PQ_T:
				setPq_T(PQ_T_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PQ_H:
				setPq_H(PQ_H_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PQ_S:
				setPq_S(PQ_S_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PQ_W:
				setPq_W(PQ_W_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PQ_R:
				setPq_R(PQ_R_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PQ:
				setPq(PQ_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__INPUT_TEMP:
				setInput_temp(INPUT_TEMP_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__INPUT_HUMID:
				setInput_humid(INPUT_HUMID_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__INPUT_SOLAR:
				setInput_solar(INPUT_SOLAR_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__INPUT_WIND:
				setInput_wind(INPUT_WIND_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__INPUT_RAIN:
				setInput_rain(INPUT_RAIN_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_P:
				setOutput_imped_p(OUTPUT_IMPED_P_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_Q:
				setOutput_imped_q(OUTPUT_IMPED_Q_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_M:
				setOutput_current_m(OUTPUT_CURRENT_M_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_A:
				setOutput_current_a(OUTPUT_CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_POWER_P:
				setOutput_power_p(OUTPUT_POWER_P_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_POWER_Q:
				setOutput_power_q(OUTPUT_POWER_Q_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_IMPEDANCE:
				setOutput_impedance(OUTPUT_IMPEDANCE_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT:
				setOutput_current(OUTPUT_CURRENT_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__OUTPUT_POWER:
				setOutput_power(OUTPUT_POWER_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__LOAD_CLASS:
				setLoad_class(LOAD_CLASS_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_A:
				setConstant_power_A(CONSTANT_POWER_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_B:
				setConstant_power_B(CONSTANT_POWER_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_C:
				setConstant_power_C(CONSTANT_POWER_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAL:
				setConstant_power_A_real(CONSTANT_POWER_AREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAL:
				setConstant_power_B_real(CONSTANT_POWER_BREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAL:
				setConstant_power_C_real(CONSTANT_POWER_CREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAC:
				setConstant_power_A_reac(CONSTANT_POWER_AREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAC:
				setConstant_power_B_reac(CONSTANT_POWER_BREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAC:
				setConstant_power_C_reac(CONSTANT_POWER_CREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_A:
				setConstant_current_A(CONSTANT_CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_B:
				setConstant_current_B(CONSTANT_CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_C:
				setConstant_current_C(CONSTANT_CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAL:
				setConstant_current_A_real(CONSTANT_CURRENT_AREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAL:
				setConstant_current_B_real(CONSTANT_CURRENT_BREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAL:
				setConstant_current_C_real(CONSTANT_CURRENT_CREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAC:
				setConstant_current_A_reac(CONSTANT_CURRENT_AREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAC:
				setConstant_current_B_reac(CONSTANT_CURRENT_BREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAC:
				setConstant_current_C_reac(CONSTANT_CURRENT_CREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_A:
				setConstant_impedance_A(CONSTANT_IMPEDANCE_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_B:
				setConstant_impedance_B(CONSTANT_IMPEDANCE_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_C:
				setConstant_impedance_C(CONSTANT_IMPEDANCE_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAL:
				setConstant_impedance_A_real(CONSTANT_IMPEDANCE_AREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAL:
				setConstant_impedance_B_real(CONSTANT_IMPEDANCE_BREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAL:
				setConstant_impedance_C_real(CONSTANT_IMPEDANCE_CREAL_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAC:
				setConstant_impedance_A_reac(CONSTANT_IMPEDANCE_AREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAC:
				setConstant_impedance_B_reac(CONSTANT_IMPEDANCE_BREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAC:
				setConstant_impedance_C_reac(CONSTANT_IMPEDANCE_CREAC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_A:
				setMeasured_voltage_A(MEASURED_VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_B:
				setMeasured_voltage_B(MEASURED_VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_C:
				setMeasured_voltage_C(MEASURED_VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_AB:
				setMeasured_voltage_AB(MEASURED_VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_BC:
				setMeasured_voltage_BC(MEASURED_VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_CA:
				setMeasured_voltage_CA(MEASURED_VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__BUSTYPE:
				setBustype(BUSTYPE_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__BUSFLAGS:
				setBusflags(BUSFLAGS_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__REFERENCE_BUS:
				setReference_bus(REFERENCE_BUS_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__MAXIMUM_VOLTAGE_ERROR:
				setMaximum_voltage_error(MAXIMUM_VOLTAGE_ERROR_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_A:
				setVoltage_A(VOLTAGE_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_B:
				setVoltage_B(VOLTAGE_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_C:
				setVoltage_C(VOLTAGE_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_AB:
				setVoltage_AB(VOLTAGE_AB_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_BC:
				setVoltage_BC(VOLTAGE_BC_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__VOLTAGE_CA:
				setVoltage_CA(VOLTAGE_CA_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CURRENT_A:
				setCurrent_A(CURRENT_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CURRENT_B:
				setCurrent_B(CURRENT_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__CURRENT_C:
				setCurrent_C(CURRENT_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__POWER_A:
				setPower_A(POWER_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__POWER_B:
				setPower_B(POWER_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__POWER_C:
				setPower_C(POWER_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__SHUNT_A:
				setShunt_A(SHUNT_A_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__SHUNT_B:
				setShunt_B(SHUNT_B_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__SHUNT_C:
				setShunt_C(SHUNT_C_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__PHASES:
				setPhases(PHASES_EDEFAULT);
				return;
			case VisGridPackage.PQLOAD__NOMINAL_VOLTAGE:
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
			case VisGridPackage.PQLOAD__WEATHER:
				return WEATHER_EDEFAULT == null ? weather != null : !WEATHER_EDEFAULT.equals(weather);
			case VisGridPackage.PQLOAD__TNOMINAL:
				return TNOMINAL_EDEFAULT == null ? t_nominal != null : !TNOMINAL_EDEFAULT.equals(t_nominal);
			case VisGridPackage.PQLOAD__ZP_T:
				return ZP_T_EDEFAULT == null ? zp_T != null : !ZP_T_EDEFAULT.equals(zp_T);
			case VisGridPackage.PQLOAD__ZP_H:
				return ZP_H_EDEFAULT == null ? zp_H != null : !ZP_H_EDEFAULT.equals(zp_H);
			case VisGridPackage.PQLOAD__ZP_S:
				return ZP_S_EDEFAULT == null ? zp_S != null : !ZP_S_EDEFAULT.equals(zp_S);
			case VisGridPackage.PQLOAD__ZP_W:
				return ZP_W_EDEFAULT == null ? zp_W != null : !ZP_W_EDEFAULT.equals(zp_W);
			case VisGridPackage.PQLOAD__ZP_R:
				return ZP_R_EDEFAULT == null ? zp_R != null : !ZP_R_EDEFAULT.equals(zp_R);
			case VisGridPackage.PQLOAD__ZP:
				return ZP_EDEFAULT == null ? zp != null : !ZP_EDEFAULT.equals(zp);
			case VisGridPackage.PQLOAD__ZQ_T:
				return ZQ_T_EDEFAULT == null ? zq_T != null : !ZQ_T_EDEFAULT.equals(zq_T);
			case VisGridPackage.PQLOAD__ZQ_H:
				return ZQ_H_EDEFAULT == null ? zq_H != null : !ZQ_H_EDEFAULT.equals(zq_H);
			case VisGridPackage.PQLOAD__ZQ_S:
				return ZQ_S_EDEFAULT == null ? zq_S != null : !ZQ_S_EDEFAULT.equals(zq_S);
			case VisGridPackage.PQLOAD__ZQ_W:
				return ZQ_W_EDEFAULT == null ? zq_W != null : !ZQ_W_EDEFAULT.equals(zq_W);
			case VisGridPackage.PQLOAD__ZQ_R:
				return ZQ_R_EDEFAULT == null ? zq_R != null : !ZQ_R_EDEFAULT.equals(zq_R);
			case VisGridPackage.PQLOAD__ZQ:
				return ZQ_EDEFAULT == null ? zq != null : !ZQ_EDEFAULT.equals(zq);
			case VisGridPackage.PQLOAD__IM_T:
				return IM_T_EDEFAULT == null ? im_T != null : !IM_T_EDEFAULT.equals(im_T);
			case VisGridPackage.PQLOAD__IM_H:
				return IM_H_EDEFAULT == null ? im_H != null : !IM_H_EDEFAULT.equals(im_H);
			case VisGridPackage.PQLOAD__IM_S:
				return IM_S_EDEFAULT == null ? im_S != null : !IM_S_EDEFAULT.equals(im_S);
			case VisGridPackage.PQLOAD__IM_W:
				return IM_W_EDEFAULT == null ? im_W != null : !IM_W_EDEFAULT.equals(im_W);
			case VisGridPackage.PQLOAD__IM_R:
				return IM_R_EDEFAULT == null ? im_R != null : !IM_R_EDEFAULT.equals(im_R);
			case VisGridPackage.PQLOAD__IM:
				return IM_EDEFAULT == null ? im != null : !IM_EDEFAULT.equals(im);
			case VisGridPackage.PQLOAD__IA_T:
				return IA_T_EDEFAULT == null ? ia_T != null : !IA_T_EDEFAULT.equals(ia_T);
			case VisGridPackage.PQLOAD__IA_H:
				return IA_H_EDEFAULT == null ? ia_H != null : !IA_H_EDEFAULT.equals(ia_H);
			case VisGridPackage.PQLOAD__IA_S:
				return IA_S_EDEFAULT == null ? ia_S != null : !IA_S_EDEFAULT.equals(ia_S);
			case VisGridPackage.PQLOAD__IA_W:
				return IA_W_EDEFAULT == null ? ia_W != null : !IA_W_EDEFAULT.equals(ia_W);
			case VisGridPackage.PQLOAD__IA_R:
				return IA_R_EDEFAULT == null ? ia_R != null : !IA_R_EDEFAULT.equals(ia_R);
			case VisGridPackage.PQLOAD__IA:
				return IA_EDEFAULT == null ? ia != null : !IA_EDEFAULT.equals(ia);
			case VisGridPackage.PQLOAD__PP_T:
				return PP_T_EDEFAULT == null ? pp_T != null : !PP_T_EDEFAULT.equals(pp_T);
			case VisGridPackage.PQLOAD__PP_H:
				return PP_H_EDEFAULT == null ? pp_H != null : !PP_H_EDEFAULT.equals(pp_H);
			case VisGridPackage.PQLOAD__PP_S:
				return PP_S_EDEFAULT == null ? pp_S != null : !PP_S_EDEFAULT.equals(pp_S);
			case VisGridPackage.PQLOAD__PP_W:
				return PP_W_EDEFAULT == null ? pp_W != null : !PP_W_EDEFAULT.equals(pp_W);
			case VisGridPackage.PQLOAD__PP_R:
				return PP_R_EDEFAULT == null ? pp_R != null : !PP_R_EDEFAULT.equals(pp_R);
			case VisGridPackage.PQLOAD__PP:
				return PP_EDEFAULT == null ? pp != null : !PP_EDEFAULT.equals(pp);
			case VisGridPackage.PQLOAD__PQ_T:
				return PQ_T_EDEFAULT == null ? pq_T != null : !PQ_T_EDEFAULT.equals(pq_T);
			case VisGridPackage.PQLOAD__PQ_H:
				return PQ_H_EDEFAULT == null ? pq_H != null : !PQ_H_EDEFAULT.equals(pq_H);
			case VisGridPackage.PQLOAD__PQ_S:
				return PQ_S_EDEFAULT == null ? pq_S != null : !PQ_S_EDEFAULT.equals(pq_S);
			case VisGridPackage.PQLOAD__PQ_W:
				return PQ_W_EDEFAULT == null ? pq_W != null : !PQ_W_EDEFAULT.equals(pq_W);
			case VisGridPackage.PQLOAD__PQ_R:
				return PQ_R_EDEFAULT == null ? pq_R != null : !PQ_R_EDEFAULT.equals(pq_R);
			case VisGridPackage.PQLOAD__PQ:
				return PQ_EDEFAULT == null ? pq != null : !PQ_EDEFAULT.equals(pq);
			case VisGridPackage.PQLOAD__INPUT_TEMP:
				return INPUT_TEMP_EDEFAULT == null ? input_temp != null : !INPUT_TEMP_EDEFAULT.equals(input_temp);
			case VisGridPackage.PQLOAD__INPUT_HUMID:
				return INPUT_HUMID_EDEFAULT == null ? input_humid != null : !INPUT_HUMID_EDEFAULT.equals(input_humid);
			case VisGridPackage.PQLOAD__INPUT_SOLAR:
				return INPUT_SOLAR_EDEFAULT == null ? input_solar != null : !INPUT_SOLAR_EDEFAULT.equals(input_solar);
			case VisGridPackage.PQLOAD__INPUT_WIND:
				return INPUT_WIND_EDEFAULT == null ? input_wind != null : !INPUT_WIND_EDEFAULT.equals(input_wind);
			case VisGridPackage.PQLOAD__INPUT_RAIN:
				return INPUT_RAIN_EDEFAULT == null ? input_rain != null : !INPUT_RAIN_EDEFAULT.equals(input_rain);
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_P:
				return OUTPUT_IMPED_P_EDEFAULT == null ? output_imped_p != null : !OUTPUT_IMPED_P_EDEFAULT.equals(output_imped_p);
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_Q:
				return OUTPUT_IMPED_Q_EDEFAULT == null ? output_imped_q != null : !OUTPUT_IMPED_Q_EDEFAULT.equals(output_imped_q);
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_M:
				return OUTPUT_CURRENT_M_EDEFAULT == null ? output_current_m != null : !OUTPUT_CURRENT_M_EDEFAULT.equals(output_current_m);
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_A:
				return OUTPUT_CURRENT_A_EDEFAULT == null ? output_current_a != null : !OUTPUT_CURRENT_A_EDEFAULT.equals(output_current_a);
			case VisGridPackage.PQLOAD__OUTPUT_POWER_P:
				return OUTPUT_POWER_P_EDEFAULT == null ? output_power_p != null : !OUTPUT_POWER_P_EDEFAULT.equals(output_power_p);
			case VisGridPackage.PQLOAD__OUTPUT_POWER_Q:
				return OUTPUT_POWER_Q_EDEFAULT == null ? output_power_q != null : !OUTPUT_POWER_Q_EDEFAULT.equals(output_power_q);
			case VisGridPackage.PQLOAD__OUTPUT_IMPEDANCE:
				return OUTPUT_IMPEDANCE_EDEFAULT == null ? output_impedance != null : !OUTPUT_IMPEDANCE_EDEFAULT.equals(output_impedance);
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT:
				return OUTPUT_CURRENT_EDEFAULT == null ? output_current != null : !OUTPUT_CURRENT_EDEFAULT.equals(output_current);
			case VisGridPackage.PQLOAD__OUTPUT_POWER:
				return OUTPUT_POWER_EDEFAULT == null ? output_power != null : !OUTPUT_POWER_EDEFAULT.equals(output_power);
			case VisGridPackage.PQLOAD__LOAD_CLASS:
				return LOAD_CLASS_EDEFAULT == null ? load_class != null : !LOAD_CLASS_EDEFAULT.equals(load_class);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_A:
				return CONSTANT_POWER_A_EDEFAULT == null ? constant_power_A != null : !CONSTANT_POWER_A_EDEFAULT.equals(constant_power_A);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_B:
				return CONSTANT_POWER_B_EDEFAULT == null ? constant_power_B != null : !CONSTANT_POWER_B_EDEFAULT.equals(constant_power_B);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_C:
				return CONSTANT_POWER_C_EDEFAULT == null ? constant_power_C != null : !CONSTANT_POWER_C_EDEFAULT.equals(constant_power_C);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAL:
				return CONSTANT_POWER_AREAL_EDEFAULT == null ? constant_power_A_real != null : !CONSTANT_POWER_AREAL_EDEFAULT.equals(constant_power_A_real);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAL:
				return CONSTANT_POWER_BREAL_EDEFAULT == null ? constant_power_B_real != null : !CONSTANT_POWER_BREAL_EDEFAULT.equals(constant_power_B_real);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAL:
				return CONSTANT_POWER_CREAL_EDEFAULT == null ? constant_power_C_real != null : !CONSTANT_POWER_CREAL_EDEFAULT.equals(constant_power_C_real);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAC:
				return CONSTANT_POWER_AREAC_EDEFAULT == null ? constant_power_A_reac != null : !CONSTANT_POWER_AREAC_EDEFAULT.equals(constant_power_A_reac);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAC:
				return CONSTANT_POWER_BREAC_EDEFAULT == null ? constant_power_B_reac != null : !CONSTANT_POWER_BREAC_EDEFAULT.equals(constant_power_B_reac);
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAC:
				return CONSTANT_POWER_CREAC_EDEFAULT == null ? constant_power_C_reac != null : !CONSTANT_POWER_CREAC_EDEFAULT.equals(constant_power_C_reac);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_A:
				return CONSTANT_CURRENT_A_EDEFAULT == null ? constant_current_A != null : !CONSTANT_CURRENT_A_EDEFAULT.equals(constant_current_A);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_B:
				return CONSTANT_CURRENT_B_EDEFAULT == null ? constant_current_B != null : !CONSTANT_CURRENT_B_EDEFAULT.equals(constant_current_B);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_C:
				return CONSTANT_CURRENT_C_EDEFAULT == null ? constant_current_C != null : !CONSTANT_CURRENT_C_EDEFAULT.equals(constant_current_C);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAL:
				return CONSTANT_CURRENT_AREAL_EDEFAULT == null ? constant_current_A_real != null : !CONSTANT_CURRENT_AREAL_EDEFAULT.equals(constant_current_A_real);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAL:
				return CONSTANT_CURRENT_BREAL_EDEFAULT == null ? constant_current_B_real != null : !CONSTANT_CURRENT_BREAL_EDEFAULT.equals(constant_current_B_real);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAL:
				return CONSTANT_CURRENT_CREAL_EDEFAULT == null ? constant_current_C_real != null : !CONSTANT_CURRENT_CREAL_EDEFAULT.equals(constant_current_C_real);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAC:
				return CONSTANT_CURRENT_AREAC_EDEFAULT == null ? constant_current_A_reac != null : !CONSTANT_CURRENT_AREAC_EDEFAULT.equals(constant_current_A_reac);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAC:
				return CONSTANT_CURRENT_BREAC_EDEFAULT == null ? constant_current_B_reac != null : !CONSTANT_CURRENT_BREAC_EDEFAULT.equals(constant_current_B_reac);
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAC:
				return CONSTANT_CURRENT_CREAC_EDEFAULT == null ? constant_current_C_reac != null : !CONSTANT_CURRENT_CREAC_EDEFAULT.equals(constant_current_C_reac);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_A:
				return CONSTANT_IMPEDANCE_A_EDEFAULT == null ? constant_impedance_A != null : !CONSTANT_IMPEDANCE_A_EDEFAULT.equals(constant_impedance_A);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_B:
				return CONSTANT_IMPEDANCE_B_EDEFAULT == null ? constant_impedance_B != null : !CONSTANT_IMPEDANCE_B_EDEFAULT.equals(constant_impedance_B);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_C:
				return CONSTANT_IMPEDANCE_C_EDEFAULT == null ? constant_impedance_C != null : !CONSTANT_IMPEDANCE_C_EDEFAULT.equals(constant_impedance_C);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAL:
				return CONSTANT_IMPEDANCE_AREAL_EDEFAULT == null ? constant_impedance_A_real != null : !CONSTANT_IMPEDANCE_AREAL_EDEFAULT.equals(constant_impedance_A_real);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAL:
				return CONSTANT_IMPEDANCE_BREAL_EDEFAULT == null ? constant_impedance_B_real != null : !CONSTANT_IMPEDANCE_BREAL_EDEFAULT.equals(constant_impedance_B_real);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAL:
				return CONSTANT_IMPEDANCE_CREAL_EDEFAULT == null ? constant_impedance_C_real != null : !CONSTANT_IMPEDANCE_CREAL_EDEFAULT.equals(constant_impedance_C_real);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAC:
				return CONSTANT_IMPEDANCE_AREAC_EDEFAULT == null ? constant_impedance_A_reac != null : !CONSTANT_IMPEDANCE_AREAC_EDEFAULT.equals(constant_impedance_A_reac);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAC:
				return CONSTANT_IMPEDANCE_BREAC_EDEFAULT == null ? constant_impedance_B_reac != null : !CONSTANT_IMPEDANCE_BREAC_EDEFAULT.equals(constant_impedance_B_reac);
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAC:
				return CONSTANT_IMPEDANCE_CREAC_EDEFAULT == null ? constant_impedance_C_reac != null : !CONSTANT_IMPEDANCE_CREAC_EDEFAULT.equals(constant_impedance_C_reac);
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_A:
				return MEASURED_VOLTAGE_A_EDEFAULT == null ? measured_voltage_A != null : !MEASURED_VOLTAGE_A_EDEFAULT.equals(measured_voltage_A);
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_B:
				return MEASURED_VOLTAGE_B_EDEFAULT == null ? measured_voltage_B != null : !MEASURED_VOLTAGE_B_EDEFAULT.equals(measured_voltage_B);
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_C:
				return MEASURED_VOLTAGE_C_EDEFAULT == null ? measured_voltage_C != null : !MEASURED_VOLTAGE_C_EDEFAULT.equals(measured_voltage_C);
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_AB:
				return MEASURED_VOLTAGE_AB_EDEFAULT == null ? measured_voltage_AB != null : !MEASURED_VOLTAGE_AB_EDEFAULT.equals(measured_voltage_AB);
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_BC:
				return MEASURED_VOLTAGE_BC_EDEFAULT == null ? measured_voltage_BC != null : !MEASURED_VOLTAGE_BC_EDEFAULT.equals(measured_voltage_BC);
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_CA:
				return MEASURED_VOLTAGE_CA_EDEFAULT == null ? measured_voltage_CA != null : !MEASURED_VOLTAGE_CA_EDEFAULT.equals(measured_voltage_CA);
			case VisGridPackage.PQLOAD__BUSTYPE:
				return BUSTYPE_EDEFAULT == null ? bustype != null : !BUSTYPE_EDEFAULT.equals(bustype);
			case VisGridPackage.PQLOAD__BUSFLAGS:
				return BUSFLAGS_EDEFAULT == null ? busflags != null : !BUSFLAGS_EDEFAULT.equals(busflags);
			case VisGridPackage.PQLOAD__REFERENCE_BUS:
				return REFERENCE_BUS_EDEFAULT == null ? reference_bus != null : !REFERENCE_BUS_EDEFAULT.equals(reference_bus);
			case VisGridPackage.PQLOAD__MAXIMUM_VOLTAGE_ERROR:
				return MAXIMUM_VOLTAGE_ERROR_EDEFAULT == null ? maximum_voltage_error != null : !MAXIMUM_VOLTAGE_ERROR_EDEFAULT.equals(maximum_voltage_error);
			case VisGridPackage.PQLOAD__VOLTAGE_A:
				return VOLTAGE_A_EDEFAULT == null ? voltage_A != null : !VOLTAGE_A_EDEFAULT.equals(voltage_A);
			case VisGridPackage.PQLOAD__VOLTAGE_B:
				return VOLTAGE_B_EDEFAULT == null ? voltage_B != null : !VOLTAGE_B_EDEFAULT.equals(voltage_B);
			case VisGridPackage.PQLOAD__VOLTAGE_C:
				return VOLTAGE_C_EDEFAULT == null ? voltage_C != null : !VOLTAGE_C_EDEFAULT.equals(voltage_C);
			case VisGridPackage.PQLOAD__VOLTAGE_AB:
				return VOLTAGE_AB_EDEFAULT == null ? voltage_AB != null : !VOLTAGE_AB_EDEFAULT.equals(voltage_AB);
			case VisGridPackage.PQLOAD__VOLTAGE_BC:
				return VOLTAGE_BC_EDEFAULT == null ? voltage_BC != null : !VOLTAGE_BC_EDEFAULT.equals(voltage_BC);
			case VisGridPackage.PQLOAD__VOLTAGE_CA:
				return VOLTAGE_CA_EDEFAULT == null ? voltage_CA != null : !VOLTAGE_CA_EDEFAULT.equals(voltage_CA);
			case VisGridPackage.PQLOAD__CURRENT_A:
				return CURRENT_A_EDEFAULT == null ? current_A != null : !CURRENT_A_EDEFAULT.equals(current_A);
			case VisGridPackage.PQLOAD__CURRENT_B:
				return CURRENT_B_EDEFAULT == null ? current_B != null : !CURRENT_B_EDEFAULT.equals(current_B);
			case VisGridPackage.PQLOAD__CURRENT_C:
				return CURRENT_C_EDEFAULT == null ? current_C != null : !CURRENT_C_EDEFAULT.equals(current_C);
			case VisGridPackage.PQLOAD__POWER_A:
				return POWER_A_EDEFAULT == null ? power_A != null : !POWER_A_EDEFAULT.equals(power_A);
			case VisGridPackage.PQLOAD__POWER_B:
				return POWER_B_EDEFAULT == null ? power_B != null : !POWER_B_EDEFAULT.equals(power_B);
			case VisGridPackage.PQLOAD__POWER_C:
				return POWER_C_EDEFAULT == null ? power_C != null : !POWER_C_EDEFAULT.equals(power_C);
			case VisGridPackage.PQLOAD__SHUNT_A:
				return SHUNT_A_EDEFAULT == null ? shunt_A != null : !SHUNT_A_EDEFAULT.equals(shunt_A);
			case VisGridPackage.PQLOAD__SHUNT_B:
				return SHUNT_B_EDEFAULT == null ? shunt_B != null : !SHUNT_B_EDEFAULT.equals(shunt_B);
			case VisGridPackage.PQLOAD__SHUNT_C:
				return SHUNT_C_EDEFAULT == null ? shunt_C != null : !SHUNT_C_EDEFAULT.equals(shunt_C);
			case VisGridPackage.PQLOAD__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
			case VisGridPackage.PQLOAD__NOMINAL_VOLTAGE:
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
		result.append(" (weather: ");
		result.append(weather);
		result.append(", T_nominal: ");
		result.append(t_nominal);
		result.append(", Zp_T: ");
		result.append(zp_T);
		result.append(", Zp_H: ");
		result.append(zp_H);
		result.append(", Zp_S: ");
		result.append(zp_S);
		result.append(", Zp_W: ");
		result.append(zp_W);
		result.append(", Zp_R: ");
		result.append(zp_R);
		result.append(", Zp: ");
		result.append(zp);
		result.append(", Zq_T: ");
		result.append(zq_T);
		result.append(", Zq_H: ");
		result.append(zq_H);
		result.append(", Zq_S: ");
		result.append(zq_S);
		result.append(", Zq_W: ");
		result.append(zq_W);
		result.append(", Zq_R: ");
		result.append(zq_R);
		result.append(", Zq: ");
		result.append(zq);
		result.append(", Im_T: ");
		result.append(im_T);
		result.append(", Im_H: ");
		result.append(im_H);
		result.append(", Im_S: ");
		result.append(im_S);
		result.append(", Im_W: ");
		result.append(im_W);
		result.append(", Im_R: ");
		result.append(im_R);
		result.append(", Im: ");
		result.append(im);
		result.append(", Ia_T: ");
		result.append(ia_T);
		result.append(", Ia_H: ");
		result.append(ia_H);
		result.append(", Ia_S: ");
		result.append(ia_S);
		result.append(", Ia_W: ");
		result.append(ia_W);
		result.append(", Ia_R: ");
		result.append(ia_R);
		result.append(", Ia: ");
		result.append(ia);
		result.append(", Pp_T: ");
		result.append(pp_T);
		result.append(", Pp_H: ");
		result.append(pp_H);
		result.append(", Pp_S: ");
		result.append(pp_S);
		result.append(", Pp_W: ");
		result.append(pp_W);
		result.append(", Pp_R: ");
		result.append(pp_R);
		result.append(", Pp: ");
		result.append(pp);
		result.append(", Pq_T: ");
		result.append(pq_T);
		result.append(", Pq_H: ");
		result.append(pq_H);
		result.append(", Pq_S: ");
		result.append(pq_S);
		result.append(", Pq_W: ");
		result.append(pq_W);
		result.append(", Pq_R: ");
		result.append(pq_R);
		result.append(", Pq: ");
		result.append(pq);
		result.append(", input_temp: ");
		result.append(input_temp);
		result.append(", input_humid: ");
		result.append(input_humid);
		result.append(", input_solar: ");
		result.append(input_solar);
		result.append(", input_wind: ");
		result.append(input_wind);
		result.append(", input_rain: ");
		result.append(input_rain);
		result.append(", output_imped_p: ");
		result.append(output_imped_p);
		result.append(", output_imped_q: ");
		result.append(output_imped_q);
		result.append(", output_current_m: ");
		result.append(output_current_m);
		result.append(", output_current_a: ");
		result.append(output_current_a);
		result.append(", output_power_p: ");
		result.append(output_power_p);
		result.append(", output_power_q: ");
		result.append(output_power_q);
		result.append(", output_impedance: ");
		result.append(output_impedance);
		result.append(", output_current: ");
		result.append(output_current);
		result.append(", output_power: ");
		result.append(output_power);
		result.append(", load_class: ");
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

} //PqloadImpl
