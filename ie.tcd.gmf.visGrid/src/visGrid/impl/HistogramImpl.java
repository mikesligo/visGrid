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

import visGrid.Histogram;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.HistogramImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getBins <em>Bins</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getMin <em>Min</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getMax <em>Max</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getSamplerate <em>Samplerate</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getCountrate <em>Countrate</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getBin_count <em>Bin count</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistogramImpl extends ConnectionImpl implements Histogram {
	// Generated by python script located in this directory
       boolean threadLock = false;
       HashMap<String,Boolean> lock = new HashMap<String,Boolean>();

   private void checkUnlock() {
        if (threadLock) return;
        for (Map.Entry<String, Boolean> entry : lock.entrySet()){
            if (entry.getValue().equals(false)) return;
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
        timer.schedule(new Task(), 1000);
    }
    // END PYTHON GENERATED CODE
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBins() <em>Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBins()
	 * @generated
	 * @ordered
	 */
	protected static final String BINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBins() <em>Bins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBins()
	 * @generated
	 * @ordered
	 */
	protected String bins = BINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected String property = PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected String min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected String max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplerate() <em>Samplerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerate()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLERATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSamplerate() <em>Samplerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplerate()
	 * @generated
	 * @ordered
	 */
	protected String samplerate = SAMPLERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountrate() <em>Countrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountrate()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountrate() <em>Countrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountrate()
	 * @generated
	 * @ordered
	 */
	protected String countrate = COUNTRATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBin_count() <em>Bin count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBin_count()
	 * @generated
	 * @ordered
	 */
	protected static final String BIN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBin_count() <em>Bin count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBin_count()
	 * @generated
	 * @ordered
	 */
	protected String bin_count = BIN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected String limit = LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getHistogram();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		// Generated by python script located in this directory
		if (!lock.containsKey("filename")) lock.put("filename", new Boolean(false));
			if (!(Boolean)lock.get("filename")){
				lock.put("filename", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"filename");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Filename");
					filename= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		// Generated by python script located in this directory
		if (!lock.containsKey("group")) lock.put("group", new Boolean(false));
			if (!(Boolean)lock.get("group")){
				lock.put("group", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"group");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Group");
					group= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBins() {
		// Generated by python script located in this directory
		if (!lock.containsKey("bins")) lock.put("bins", new Boolean(false));
			if (!(Boolean)lock.get("bins")){
				lock.put("bins", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"bins");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Bins");
					bins= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return bins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBins(String newBins) {
		String oldBins = bins;
		bins = newBins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__BINS, oldBins, bins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProperty() {
		// Generated by python script located in this directory
		if (!lock.containsKey("property")) lock.put("property", new Boolean(false));
			if (!(Boolean)lock.get("property")){
				lock.put("property", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"property");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Property");
					property= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(String newProperty) {
		String oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin() {
		// Generated by python script located in this directory
		if (!lock.containsKey("min")) lock.put("min", new Boolean(false));
			if (!(Boolean)lock.get("min")){
				lock.put("min", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"min");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Min");
					min= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(String newMin) {
		String oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax() {
		// Generated by python script located in this directory
		if (!lock.containsKey("max")) lock.put("max", new Boolean(false));
			if (!(Boolean)lock.get("max")){
				lock.put("max", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"max");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Max");
					max= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSamplerate() {
		// Generated by python script located in this directory
		if (!lock.containsKey("samplerate")) lock.put("samplerate", new Boolean(false));
			if (!(Boolean)lock.get("samplerate")){
				lock.put("samplerate", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"samplerate");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Samplerate");
					samplerate= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return samplerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplerate(String newSamplerate) {
		String oldSamplerate = samplerate;
		samplerate = newSamplerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__SAMPLERATE, oldSamplerate, samplerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountrate() {
		// Generated by python script located in this directory
		if (!lock.containsKey("countrate")) lock.put("countrate", new Boolean(false));
			if (!(Boolean)lock.get("countrate")){
				lock.put("countrate", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"countrate");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Countrate");
					countrate= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return countrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountrate(String newCountrate) {
		String oldCountrate = countrate;
		countrate = newCountrate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__COUNTRATE, oldCountrate, countrate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBin_count() {
		// Generated by python script located in this directory
		if (!lock.containsKey("bin_count")) lock.put("bin_count", new Boolean(false));
			if (!(Boolean)lock.get("bin_count")){
				lock.put("bin_count", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"bin_count");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Bin_count");
					bin_count= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return bin_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBin_count(String newBin_count) {
		String oldBin_count = bin_count;
		bin_count = newBin_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__BIN_COUNT, oldBin_count, bin_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimit() {
		// Generated by python script located in this directory
		if (!lock.containsKey("limit")) lock.put("limit", new Boolean(false));
			if (!(Boolean)lock.get("limit")){
				lock.put("limit", true);
				checkUnlock();
				try {
					String val = http.Property.getValueOfProperty(this.getName(),"limit");
					if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Limit");
					limit= val;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(String newLimit) {
		String oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.HISTOGRAM__FILENAME:
				return getFilename();
			case VisGridPackage.HISTOGRAM__GROUP:
				return getGroup();
			case VisGridPackage.HISTOGRAM__BINS:
				return getBins();
			case VisGridPackage.HISTOGRAM__PROPERTY:
				return getProperty();
			case VisGridPackage.HISTOGRAM__MIN:
				return getMin();
			case VisGridPackage.HISTOGRAM__MAX:
				return getMax();
			case VisGridPackage.HISTOGRAM__SAMPLERATE:
				return getSamplerate();
			case VisGridPackage.HISTOGRAM__COUNTRATE:
				return getCountrate();
			case VisGridPackage.HISTOGRAM__BIN_COUNT:
				return getBin_count();
			case VisGridPackage.HISTOGRAM__LIMIT:
				return getLimit();
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
			case VisGridPackage.HISTOGRAM__FILENAME:
				setFilename((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__GROUP:
				setGroup((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__BINS:
				setBins((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__PROPERTY:
				setProperty((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__MIN:
				setMin((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__MAX:
				setMax((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__SAMPLERATE:
				setSamplerate((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__COUNTRATE:
				setCountrate((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__BIN_COUNT:
				setBin_count((String)newValue);
				return;
			case VisGridPackage.HISTOGRAM__LIMIT:
				setLimit((String)newValue);
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
			case VisGridPackage.HISTOGRAM__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__BINS:
				setBins(BINS_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__SAMPLERATE:
				setSamplerate(SAMPLERATE_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__COUNTRATE:
				setCountrate(COUNTRATE_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__BIN_COUNT:
				setBin_count(BIN_COUNT_EDEFAULT);
				return;
			case VisGridPackage.HISTOGRAM__LIMIT:
				setLimit(LIMIT_EDEFAULT);
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
			case VisGridPackage.HISTOGRAM__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case VisGridPackage.HISTOGRAM__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case VisGridPackage.HISTOGRAM__BINS:
				return BINS_EDEFAULT == null ? bins != null : !BINS_EDEFAULT.equals(bins);
			case VisGridPackage.HISTOGRAM__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case VisGridPackage.HISTOGRAM__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case VisGridPackage.HISTOGRAM__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case VisGridPackage.HISTOGRAM__SAMPLERATE:
				return SAMPLERATE_EDEFAULT == null ? samplerate != null : !SAMPLERATE_EDEFAULT.equals(samplerate);
			case VisGridPackage.HISTOGRAM__COUNTRATE:
				return COUNTRATE_EDEFAULT == null ? countrate != null : !COUNTRATE_EDEFAULT.equals(countrate);
			case VisGridPackage.HISTOGRAM__BIN_COUNT:
				return BIN_COUNT_EDEFAULT == null ? bin_count != null : !BIN_COUNT_EDEFAULT.equals(bin_count);
			case VisGridPackage.HISTOGRAM__LIMIT:
				return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
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
		result.append(" (filename: ");
		result.append(filename);
		result.append(", group: ");
		result.append(group);
		result.append(", bins: ");
		result.append(bins);
		result.append(", property: ");
		result.append(property);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", samplerate: ");
		result.append(samplerate);
		result.append(", countrate: ");
		result.append(countrate);
		result.append(", bin_count: ");
		result.append(bin_count);
		result.append(", limit: ");
		result.append(limit);
		result.append(')');
		return result.toString();
	}

} //HistogramImpl
