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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Rectifier;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RectifierImpl#getRectifier_type <em>Rectifier type</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getGenerator_mode <em>Generator mode</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getV_Out <em>VOut</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getI_Out <em>IOut</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getVA_Out <em>VA Out</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getP_Out <em>POut</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getQ_Out <em>QOut</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getVdc <em>Vdc</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhaseA_V_In <em>Phase AVIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhaseB_V_In <em>Phase BVIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhaseC_V_In <em>Phase CVIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhaseA_I_In <em>Phase AIIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhaseB_I_In <em>Phase BIIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhaseC_I_In <em>Phase CIIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPower_A_In <em>Power AIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPower_B_In <em>Power BIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPower_C_In <em>Power CIn</em>}</li>
 *   <li>{@link visGrid.impl.RectifierImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectifierImpl extends ConnectionImpl implements Rectifier {
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
	 * The default value of the '{@link #getRectifier_type() <em>Rectifier type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifier_type()
	 * @generated
	 * @ordered
	 */
	protected static final String RECTIFIER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRectifier_type() <em>Rectifier type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectifier_type()
	 * @generated
	 * @ordered
	 */
	protected String rectifier_type = RECTIFIER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGenerator_mode() <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerator_mode() <em>Generator mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator_mode()
	 * @generated
	 * @ordered
	 */
	protected String generator_mode = GENERATOR_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getV_Out() <em>VOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String VOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV_Out() <em>VOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV_Out()
	 * @generated
	 * @ordered
	 */
	protected String v_Out = VOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getI_Out() <em>IOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String IOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI_Out() <em>IOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI_Out()
	 * @generated
	 * @ordered
	 */
	protected String i_Out = IOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVA_Out() <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String VA_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVA_Out() <em>VA Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVA_Out()
	 * @generated
	 * @ordered
	 */
	protected String vA_Out = VA_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getP_Out() <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String POUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP_Out() <em>POut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP_Out()
	 * @generated
	 * @ordered
	 */
	protected String p_Out = POUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ_Out() <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ_Out()
	 * @generated
	 * @ordered
	 */
	protected static final String QOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ_Out() <em>QOut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ_Out()
	 * @generated
	 * @ordered
	 */
	protected String q_Out = QOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVdc() <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdc()
	 * @generated
	 * @ordered
	 */
	protected static final String VDC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVdc() <em>Vdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdc()
	 * @generated
	 * @ordered
	 */
	protected String vdc = VDC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseA_V_In() <em>Phase AVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_V_In()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_AVIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseA_V_In() <em>Phase AVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_V_In()
	 * @generated
	 * @ordered
	 */
	protected String phaseA_V_In = PHASE_AVIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseB_V_In() <em>Phase BVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_V_In()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BVIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseB_V_In() <em>Phase BVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_V_In()
	 * @generated
	 * @ordered
	 */
	protected String phaseB_V_In = PHASE_BVIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseC_V_In() <em>Phase CVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_V_In()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CVIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseC_V_In() <em>Phase CVIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_V_In()
	 * @generated
	 * @ordered
	 */
	protected String phaseC_V_In = PHASE_CVIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseA_I_In() <em>Phase AIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_I_In()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_AIIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseA_I_In() <em>Phase AIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseA_I_In()
	 * @generated
	 * @ordered
	 */
	protected String phaseA_I_In = PHASE_AIIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseB_I_In() <em>Phase BIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_I_In()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_BIIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseB_I_In() <em>Phase BIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseB_I_In()
	 * @generated
	 * @ordered
	 */
	protected String phaseB_I_In = PHASE_BIIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhaseC_I_In() <em>Phase CIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_I_In()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_CIIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhaseC_I_In() <em>Phase CIIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseC_I_In()
	 * @generated
	 * @ordered
	 */
	protected String phaseC_I_In = PHASE_CIIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_A_In() <em>Power AIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A_In()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_AIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_A_In() <em>Power AIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_A_In()
	 * @generated
	 * @ordered
	 */
	protected String power_A_In = POWER_AIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_B_In() <em>Power BIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B_In()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_BIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_B_In() <em>Power BIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_B_In()
	 * @generated
	 * @ordered
	 */
	protected String power_B_In = POWER_BIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower_C_In() <em>Power CIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C_In()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_CIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower_C_In() <em>Power CIn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower_C_In()
	 * @generated
	 * @ordered
	 */
	protected String power_C_In = POWER_CIN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRectifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRectifier_type() {
		// Generated by python script located in this directory
			if (!lock.containsKey("rectifier_type")) lock.put("rectifier_type", new Boolean(false));
			if (!(Boolean)lock.get("rectifier_type")){
				lock.put("rectifier_type", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"rectifier_type");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Rectifier_type");
					rectifier_type= val;
			}
		return rectifier_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRectifier_type(String newRectifier_type) {
		String oldRectifier_type = rectifier_type;
		rectifier_type = newRectifier_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__RECTIFIER_TYPE, oldRectifier_type, rectifier_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerator_mode() {
		// Generated by python script located in this directory
			if (!lock.containsKey("generator_mode")) lock.put("generator_mode", new Boolean(false));
			if (!(Boolean)lock.get("generator_mode")){
				lock.put("generator_mode", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"generator_mode");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Generator_mode");
					generator_mode= val;
			}
		return generator_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator_mode(String newGenerator_mode) {
		String oldGenerator_mode = generator_mode;
		generator_mode = newGenerator_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__GENERATOR_MODE, oldGenerator_mode, generator_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV_Out() {
		// Generated by python script located in this directory
			if (!lock.containsKey("v_Out")) lock.put("v_Out", new Boolean(false));
			if (!(Boolean)lock.get("v_Out")){
				lock.put("v_Out", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"v_Out");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"V_Out");
					v_Out= val;
			}
		return v_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV_Out(String newV_Out) {
		String oldV_Out = v_Out;
		v_Out = newV_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__VOUT, oldV_Out, v_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI_Out() {
		// Generated by python script located in this directory
			if (!lock.containsKey("i_Out")) lock.put("i_Out", new Boolean(false));
			if (!(Boolean)lock.get("i_Out")){
				lock.put("i_Out", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"i_Out");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"I_Out");
					i_Out= val;
			}
		return i_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI_Out(String newI_Out) {
		String oldI_Out = i_Out;
		i_Out = newI_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__IOUT, oldI_Out, i_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVA_Out() {
		// Generated by python script located in this directory
			if (!lock.containsKey("vA_Out")) lock.put("vA_Out", new Boolean(false));
			if (!(Boolean)lock.get("vA_Out")){
				lock.put("vA_Out", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"vA_Out");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"VA_Out");
					vA_Out= val;
			}
		return vA_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVA_Out(String newVA_Out) {
		String oldVA_Out = vA_Out;
		vA_Out = newVA_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__VA_OUT, oldVA_Out, vA_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getP_Out() {
		// Generated by python script located in this directory
			if (!lock.containsKey("p_Out")) lock.put("p_Out", new Boolean(false));
			if (!(Boolean)lock.get("p_Out")){
				lock.put("p_Out", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"p_Out");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"P_Out");
					p_Out= val;
			}
		return p_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP_Out(String newP_Out) {
		String oldP_Out = p_Out;
		p_Out = newP_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__POUT, oldP_Out, p_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQ_Out() {
		// Generated by python script located in this directory
			if (!lock.containsKey("q_Out")) lock.put("q_Out", new Boolean(false));
			if (!(Boolean)lock.get("q_Out")){
				lock.put("q_Out", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"q_Out");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Q_Out");
					q_Out= val;
			}
		return q_Out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ_Out(String newQ_Out) {
		String oldQ_Out = q_Out;
		q_Out = newQ_Out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__QOUT, oldQ_Out, q_Out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVdc() {
		// Generated by python script located in this directory
			if (!lock.containsKey("vdc")) lock.put("vdc", new Boolean(false));
			if (!(Boolean)lock.get("vdc")){
				lock.put("vdc", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"vdc");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Vdc");
					vdc= val;
			}
		return vdc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdc(String newVdc) {
		String oldVdc = vdc;
		vdc = newVdc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__VDC, oldVdc, vdc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseA_V_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phaseA_V_In")) lock.put("phaseA_V_In", new Boolean(false));
			if (!(Boolean)lock.get("phaseA_V_In")){
				lock.put("phaseA_V_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phaseA_V_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PhaseA_V_In");
					phaseA_V_In= val;
			}
		return phaseA_V_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseA_V_In(String newPhaseA_V_In) {
		String oldPhaseA_V_In = phaseA_V_In;
		phaseA_V_In = newPhaseA_V_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASE_AVIN, oldPhaseA_V_In, phaseA_V_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseB_V_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phaseB_V_In")) lock.put("phaseB_V_In", new Boolean(false));
			if (!(Boolean)lock.get("phaseB_V_In")){
				lock.put("phaseB_V_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phaseB_V_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PhaseB_V_In");
					phaseB_V_In= val;
			}
		return phaseB_V_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseB_V_In(String newPhaseB_V_In) {
		String oldPhaseB_V_In = phaseB_V_In;
		phaseB_V_In = newPhaseB_V_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASE_BVIN, oldPhaseB_V_In, phaseB_V_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseC_V_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phaseC_V_In")) lock.put("phaseC_V_In", new Boolean(false));
			if (!(Boolean)lock.get("phaseC_V_In")){
				lock.put("phaseC_V_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phaseC_V_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PhaseC_V_In");
					phaseC_V_In= val;
			}
		return phaseC_V_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseC_V_In(String newPhaseC_V_In) {
		String oldPhaseC_V_In = phaseC_V_In;
		phaseC_V_In = newPhaseC_V_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASE_CVIN, oldPhaseC_V_In, phaseC_V_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseA_I_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phaseA_I_In")) lock.put("phaseA_I_In", new Boolean(false));
			if (!(Boolean)lock.get("phaseA_I_In")){
				lock.put("phaseA_I_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phaseA_I_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PhaseA_I_In");
					phaseA_I_In= val;
			}
		return phaseA_I_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseA_I_In(String newPhaseA_I_In) {
		String oldPhaseA_I_In = phaseA_I_In;
		phaseA_I_In = newPhaseA_I_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASE_AIIN, oldPhaseA_I_In, phaseA_I_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseB_I_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phaseB_I_In")) lock.put("phaseB_I_In", new Boolean(false));
			if (!(Boolean)lock.get("phaseB_I_In")){
				lock.put("phaseB_I_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phaseB_I_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PhaseB_I_In");
					phaseB_I_In= val;
			}
		return phaseB_I_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseB_I_In(String newPhaseB_I_In) {
		String oldPhaseB_I_In = phaseB_I_In;
		phaseB_I_In = newPhaseB_I_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASE_BIIN, oldPhaseB_I_In, phaseB_I_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhaseC_I_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("phaseC_I_In")) lock.put("phaseC_I_In", new Boolean(false));
			if (!(Boolean)lock.get("phaseC_I_In")){
				lock.put("phaseC_I_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"phaseC_I_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"PhaseC_I_In");
					phaseC_I_In= val;
			}
		return phaseC_I_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhaseC_I_In(String newPhaseC_I_In) {
		String oldPhaseC_I_In = phaseC_I_In;
		phaseC_I_In = newPhaseC_I_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASE_CIIN, oldPhaseC_I_In, phaseC_I_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_A_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_A_In")) lock.put("power_A_In", new Boolean(false));
			if (!(Boolean)lock.get("power_A_In")){
				lock.put("power_A_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_A_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_A_In");
					power_A_In= val;
			}
		return power_A_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_A_In(String newPower_A_In) {
		String oldPower_A_In = power_A_In;
		power_A_In = newPower_A_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__POWER_AIN, oldPower_A_In, power_A_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_B_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_B_In")) lock.put("power_B_In", new Boolean(false));
			if (!(Boolean)lock.get("power_B_In")){
				lock.put("power_B_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_B_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_B_In");
					power_B_In= val;
			}
		return power_B_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_B_In(String newPower_B_In) {
		String oldPower_B_In = power_B_In;
		power_B_In = newPower_B_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__POWER_BIN, oldPower_B_In, power_B_In));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPower_C_In() {
		// Generated by python script located in this directory
			if (!lock.containsKey("power_C_In")) lock.put("power_C_In", new Boolean(false));
			if (!(Boolean)lock.get("power_C_In")){
				lock.put("power_C_In", true);
				checkUnlock();
					String val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"power_C_In");
					if (val == null) val = http.Property.getValueOfProperty(this.getName().replace(" ", "%20"),"Power_C_In");
					power_C_In= val;
			}
		return power_C_In;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower_C_In(String newPower_C_In) {
		String oldPower_C_In = power_C_In;
		power_C_In = newPower_C_In;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__POWER_CIN, oldPower_C_In, power_C_In));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECTIFIER__PHASES, oldPhases, phases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.RECTIFIER__RECTIFIER_TYPE:
				return getRectifier_type();
			case VisGridPackage.RECTIFIER__GENERATOR_MODE:
				return getGenerator_mode();
			case VisGridPackage.RECTIFIER__VOUT:
				return getV_Out();
			case VisGridPackage.RECTIFIER__IOUT:
				return getI_Out();
			case VisGridPackage.RECTIFIER__VA_OUT:
				return getVA_Out();
			case VisGridPackage.RECTIFIER__POUT:
				return getP_Out();
			case VisGridPackage.RECTIFIER__QOUT:
				return getQ_Out();
			case VisGridPackage.RECTIFIER__VDC:
				return getVdc();
			case VisGridPackage.RECTIFIER__PHASE_AVIN:
				return getPhaseA_V_In();
			case VisGridPackage.RECTIFIER__PHASE_BVIN:
				return getPhaseB_V_In();
			case VisGridPackage.RECTIFIER__PHASE_CVIN:
				return getPhaseC_V_In();
			case VisGridPackage.RECTIFIER__PHASE_AIIN:
				return getPhaseA_I_In();
			case VisGridPackage.RECTIFIER__PHASE_BIIN:
				return getPhaseB_I_In();
			case VisGridPackage.RECTIFIER__PHASE_CIIN:
				return getPhaseC_I_In();
			case VisGridPackage.RECTIFIER__POWER_AIN:
				return getPower_A_In();
			case VisGridPackage.RECTIFIER__POWER_BIN:
				return getPower_B_In();
			case VisGridPackage.RECTIFIER__POWER_CIN:
				return getPower_C_In();
			case VisGridPackage.RECTIFIER__PHASES:
				return getPhases();
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
			case VisGridPackage.RECTIFIER__RECTIFIER_TYPE:
				setRectifier_type((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__GENERATOR_MODE:
				setGenerator_mode((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__VOUT:
				setV_Out((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__IOUT:
				setI_Out((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__VA_OUT:
				setVA_Out((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__POUT:
				setP_Out((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__QOUT:
				setQ_Out((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__VDC:
				setVdc((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASE_AVIN:
				setPhaseA_V_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASE_BVIN:
				setPhaseB_V_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASE_CVIN:
				setPhaseC_V_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASE_AIIN:
				setPhaseA_I_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASE_BIIN:
				setPhaseB_I_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASE_CIIN:
				setPhaseC_I_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__POWER_AIN:
				setPower_A_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__POWER_BIN:
				setPower_B_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__POWER_CIN:
				setPower_C_In((String)newValue);
				return;
			case VisGridPackage.RECTIFIER__PHASES:
				setPhases((String)newValue);
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
			case VisGridPackage.RECTIFIER__RECTIFIER_TYPE:
				setRectifier_type(RECTIFIER_TYPE_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__GENERATOR_MODE:
				setGenerator_mode(GENERATOR_MODE_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__VOUT:
				setV_Out(VOUT_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__IOUT:
				setI_Out(IOUT_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__VA_OUT:
				setVA_Out(VA_OUT_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__POUT:
				setP_Out(POUT_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__QOUT:
				setQ_Out(QOUT_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__VDC:
				setVdc(VDC_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASE_AVIN:
				setPhaseA_V_In(PHASE_AVIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASE_BVIN:
				setPhaseB_V_In(PHASE_BVIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASE_CVIN:
				setPhaseC_V_In(PHASE_CVIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASE_AIIN:
				setPhaseA_I_In(PHASE_AIIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASE_BIIN:
				setPhaseB_I_In(PHASE_BIIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASE_CIIN:
				setPhaseC_I_In(PHASE_CIIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__POWER_AIN:
				setPower_A_In(POWER_AIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__POWER_BIN:
				setPower_B_In(POWER_BIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__POWER_CIN:
				setPower_C_In(POWER_CIN_EDEFAULT);
				return;
			case VisGridPackage.RECTIFIER__PHASES:
				setPhases(PHASES_EDEFAULT);
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
			case VisGridPackage.RECTIFIER__RECTIFIER_TYPE:
				return RECTIFIER_TYPE_EDEFAULT == null ? rectifier_type != null : !RECTIFIER_TYPE_EDEFAULT.equals(rectifier_type);
			case VisGridPackage.RECTIFIER__GENERATOR_MODE:
				return GENERATOR_MODE_EDEFAULT == null ? generator_mode != null : !GENERATOR_MODE_EDEFAULT.equals(generator_mode);
			case VisGridPackage.RECTIFIER__VOUT:
				return VOUT_EDEFAULT == null ? v_Out != null : !VOUT_EDEFAULT.equals(v_Out);
			case VisGridPackage.RECTIFIER__IOUT:
				return IOUT_EDEFAULT == null ? i_Out != null : !IOUT_EDEFAULT.equals(i_Out);
			case VisGridPackage.RECTIFIER__VA_OUT:
				return VA_OUT_EDEFAULT == null ? vA_Out != null : !VA_OUT_EDEFAULT.equals(vA_Out);
			case VisGridPackage.RECTIFIER__POUT:
				return POUT_EDEFAULT == null ? p_Out != null : !POUT_EDEFAULT.equals(p_Out);
			case VisGridPackage.RECTIFIER__QOUT:
				return QOUT_EDEFAULT == null ? q_Out != null : !QOUT_EDEFAULT.equals(q_Out);
			case VisGridPackage.RECTIFIER__VDC:
				return VDC_EDEFAULT == null ? vdc != null : !VDC_EDEFAULT.equals(vdc);
			case VisGridPackage.RECTIFIER__PHASE_AVIN:
				return PHASE_AVIN_EDEFAULT == null ? phaseA_V_In != null : !PHASE_AVIN_EDEFAULT.equals(phaseA_V_In);
			case VisGridPackage.RECTIFIER__PHASE_BVIN:
				return PHASE_BVIN_EDEFAULT == null ? phaseB_V_In != null : !PHASE_BVIN_EDEFAULT.equals(phaseB_V_In);
			case VisGridPackage.RECTIFIER__PHASE_CVIN:
				return PHASE_CVIN_EDEFAULT == null ? phaseC_V_In != null : !PHASE_CVIN_EDEFAULT.equals(phaseC_V_In);
			case VisGridPackage.RECTIFIER__PHASE_AIIN:
				return PHASE_AIIN_EDEFAULT == null ? phaseA_I_In != null : !PHASE_AIIN_EDEFAULT.equals(phaseA_I_In);
			case VisGridPackage.RECTIFIER__PHASE_BIIN:
				return PHASE_BIIN_EDEFAULT == null ? phaseB_I_In != null : !PHASE_BIIN_EDEFAULT.equals(phaseB_I_In);
			case VisGridPackage.RECTIFIER__PHASE_CIIN:
				return PHASE_CIIN_EDEFAULT == null ? phaseC_I_In != null : !PHASE_CIIN_EDEFAULT.equals(phaseC_I_In);
			case VisGridPackage.RECTIFIER__POWER_AIN:
				return POWER_AIN_EDEFAULT == null ? power_A_In != null : !POWER_AIN_EDEFAULT.equals(power_A_In);
			case VisGridPackage.RECTIFIER__POWER_BIN:
				return POWER_BIN_EDEFAULT == null ? power_B_In != null : !POWER_BIN_EDEFAULT.equals(power_B_In);
			case VisGridPackage.RECTIFIER__POWER_CIN:
				return POWER_CIN_EDEFAULT == null ? power_C_In != null : !POWER_CIN_EDEFAULT.equals(power_C_In);
			case VisGridPackage.RECTIFIER__PHASES:
				return PHASES_EDEFAULT == null ? phases != null : !PHASES_EDEFAULT.equals(phases);
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
		result.append(" (rectifier_type: ");
		result.append(rectifier_type);
		result.append(", generator_mode: ");
		result.append(generator_mode);
		result.append(", V_Out: ");
		result.append(v_Out);
		result.append(", I_Out: ");
		result.append(i_Out);
		result.append(", VA_Out: ");
		result.append(vA_Out);
		result.append(", P_Out: ");
		result.append(p_Out);
		result.append(", Q_Out: ");
		result.append(q_Out);
		result.append(", Vdc: ");
		result.append(vdc);
		result.append(", phaseA_V_In: ");
		result.append(phaseA_V_In);
		result.append(", phaseB_V_In: ");
		result.append(phaseB_V_In);
		result.append(", phaseC_V_In: ");
		result.append(phaseC_V_In);
		result.append(", phaseA_I_In: ");
		result.append(phaseA_I_In);
		result.append(", phaseB_I_In: ");
		result.append(phaseB_I_In);
		result.append(", phaseC_I_In: ");
		result.append(phaseC_I_In);
		result.append(", power_A_In: ");
		result.append(power_A_In);
		result.append(", power_B_In: ");
		result.append(power_B_In);
		result.append(", power_C_In: ");
		result.append(power_C_In);
		result.append(", phases: ");
		result.append(phases);
		result.append(')');
		return result.toString();
	}

} //RectifierImpl
