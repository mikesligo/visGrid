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
import visGrid.Histogram;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.HistogramImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.HistogramImpl#getName <em>Name</em>}</li>
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
public class HistogramImpl extends EObjectImpl implements Histogram {
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
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.HISTOGRAM__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.HISTOGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
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
			case VisGridPackage.HISTOGRAM__CONNECTION:
				return getConnection();
			case VisGridPackage.HISTOGRAM__NAME:
				return getName();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisGridPackage.HISTOGRAM__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.HISTOGRAM__NAME:
				setName((String)newValue);
				return;
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
			case VisGridPackage.HISTOGRAM__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.HISTOGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
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
			case VisGridPackage.HISTOGRAM__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.HISTOGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", filename: ");
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