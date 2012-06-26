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
import visGrid.Csv_reader;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Csv reader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getName <em>Name</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getCity_name <em>City name</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getState_name <em>State name</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getLat_deg <em>Lat deg</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getLat_min <em>Lat min</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getLong_deg <em>Long deg</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getLong_min <em>Long min</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getLow_temp <em>Low temp</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getHigh_temp <em>High temp</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getPeak_solar <em>Peak solar</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getTimefmt <em>Timefmt</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link visGrid.impl.Csv_readerImpl#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Csv_readerImpl extends EObjectImpl implements Csv_reader {
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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity_name() <em>City name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity_name()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity_name() <em>City name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity_name()
	 * @generated
	 * @ordered
	 */
	protected String city_name = CITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getState_name() <em>State name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_name()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState_name() <em>State name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_name()
	 * @generated
	 * @ordered
	 */
	protected String state_name = STATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat_deg() <em>Lat deg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat_deg()
	 * @generated
	 * @ordered
	 */
	protected static final String LAT_DEG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat_deg() <em>Lat deg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat_deg()
	 * @generated
	 * @ordered
	 */
	protected String lat_deg = LAT_DEG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat_min() <em>Lat min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat_min()
	 * @generated
	 * @ordered
	 */
	protected static final String LAT_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLat_min() <em>Lat min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat_min()
	 * @generated
	 * @ordered
	 */
	protected String lat_min = LAT_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong_deg() <em>Long deg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_deg()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DEG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLong_deg() <em>Long deg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_deg()
	 * @generated
	 * @ordered
	 */
	protected String long_deg = LONG_DEG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong_min() <em>Long min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_min()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLong_min() <em>Long min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_min()
	 * @generated
	 * @ordered
	 */
	protected String long_min = LONG_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLow_temp() <em>Low temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String LOW_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLow_temp() <em>Low temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow_temp()
	 * @generated
	 * @ordered
	 */
	protected String low_temp = LOW_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHigh_temp() <em>High temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh_temp()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGH_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHigh_temp() <em>High temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh_temp()
	 * @generated
	 * @ordered
	 */
	protected String high_temp = HIGH_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeak_solar() <em>Peak solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeak_solar()
	 * @generated
	 * @ordered
	 */
	protected static final String PEAK_SOLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeak_solar() <em>Peak solar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeak_solar()
	 * @generated
	 * @ordered
	 */
	protected String peak_solar = PEAK_SOLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimefmt() <em>Timefmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimefmt()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEFMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimefmt() <em>Timefmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimefmt()
	 * @generated
	 * @ordered
	 */
	protected String timefmt = TIMEFMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected String timezone = TIMEZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected String columns = COLUMNS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Csv_readerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getCsv_reader();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getConnection() {
		if (connection == null) {
			connection = new EObjectResolvingEList<Connections>(Connections.class, this, VisGridPackage.CSV_READER__CONNECTION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity_name() {
		return city_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity_name(String newCity_name) {
		String oldCity_name = city_name;
		city_name = newCity_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__CITY_NAME, oldCity_name, city_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState_name() {
		return state_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_name(String newState_name) {
		String oldState_name = state_name;
		state_name = newState_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__STATE_NAME, oldState_name, state_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLat_deg() {
		return lat_deg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat_deg(String newLat_deg) {
		String oldLat_deg = lat_deg;
		lat_deg = newLat_deg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__LAT_DEG, oldLat_deg, lat_deg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLat_min() {
		return lat_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat_min(String newLat_min) {
		String oldLat_min = lat_min;
		lat_min = newLat_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__LAT_MIN, oldLat_min, lat_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLong_deg() {
		return long_deg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong_deg(String newLong_deg) {
		String oldLong_deg = long_deg;
		long_deg = newLong_deg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__LONG_DEG, oldLong_deg, long_deg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLong_min() {
		return long_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong_min(String newLong_min) {
		String oldLong_min = long_min;
		long_min = newLong_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__LONG_MIN, oldLong_min, long_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLow_temp() {
		return low_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLow_temp(String newLow_temp) {
		String oldLow_temp = low_temp;
		low_temp = newLow_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__LOW_TEMP, oldLow_temp, low_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHigh_temp() {
		return high_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigh_temp(String newHigh_temp) {
		String oldHigh_temp = high_temp;
		high_temp = newHigh_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__HIGH_TEMP, oldHigh_temp, high_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeak_solar() {
		return peak_solar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeak_solar(String newPeak_solar) {
		String oldPeak_solar = peak_solar;
		peak_solar = newPeak_solar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__PEAK_SOLAR, oldPeak_solar, peak_solar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimefmt() {
		return timefmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimefmt(String newTimefmt) {
		String oldTimefmt = timefmt;
		timefmt = newTimefmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__TIMEFMT, oldTimefmt, timefmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezone(String newTimezone) {
		String oldTimezone = timezone;
		timezone = newTimezone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__TIMEZONE, oldTimezone, timezone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(String newColumns) {
		String oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__COLUMNS, oldColumns, columns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.CSV_READER__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.CSV_READER__CONNECTION:
				return getConnection();
			case VisGridPackage.CSV_READER__NAME:
				return getName();
			case VisGridPackage.CSV_READER__INDEX:
				return getIndex();
			case VisGridPackage.CSV_READER__CITY_NAME:
				return getCity_name();
			case VisGridPackage.CSV_READER__STATE_NAME:
				return getState_name();
			case VisGridPackage.CSV_READER__LAT_DEG:
				return getLat_deg();
			case VisGridPackage.CSV_READER__LAT_MIN:
				return getLat_min();
			case VisGridPackage.CSV_READER__LONG_DEG:
				return getLong_deg();
			case VisGridPackage.CSV_READER__LONG_MIN:
				return getLong_min();
			case VisGridPackage.CSV_READER__LOW_TEMP:
				return getLow_temp();
			case VisGridPackage.CSV_READER__HIGH_TEMP:
				return getHigh_temp();
			case VisGridPackage.CSV_READER__PEAK_SOLAR:
				return getPeak_solar();
			case VisGridPackage.CSV_READER__STATUS:
				return getStatus();
			case VisGridPackage.CSV_READER__TIMEFMT:
				return getTimefmt();
			case VisGridPackage.CSV_READER__TIMEZONE:
				return getTimezone();
			case VisGridPackage.CSV_READER__COLUMNS:
				return getColumns();
			case VisGridPackage.CSV_READER__FILENAME:
				return getFilename();
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
			case VisGridPackage.CSV_READER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connections>)newValue);
				return;
			case VisGridPackage.CSV_READER__NAME:
				setName((String)newValue);
				return;
			case VisGridPackage.CSV_READER__INDEX:
				setIndex((String)newValue);
				return;
			case VisGridPackage.CSV_READER__CITY_NAME:
				setCity_name((String)newValue);
				return;
			case VisGridPackage.CSV_READER__STATE_NAME:
				setState_name((String)newValue);
				return;
			case VisGridPackage.CSV_READER__LAT_DEG:
				setLat_deg((String)newValue);
				return;
			case VisGridPackage.CSV_READER__LAT_MIN:
				setLat_min((String)newValue);
				return;
			case VisGridPackage.CSV_READER__LONG_DEG:
				setLong_deg((String)newValue);
				return;
			case VisGridPackage.CSV_READER__LONG_MIN:
				setLong_min((String)newValue);
				return;
			case VisGridPackage.CSV_READER__LOW_TEMP:
				setLow_temp((String)newValue);
				return;
			case VisGridPackage.CSV_READER__HIGH_TEMP:
				setHigh_temp((String)newValue);
				return;
			case VisGridPackage.CSV_READER__PEAK_SOLAR:
				setPeak_solar((String)newValue);
				return;
			case VisGridPackage.CSV_READER__STATUS:
				setStatus((String)newValue);
				return;
			case VisGridPackage.CSV_READER__TIMEFMT:
				setTimefmt((String)newValue);
				return;
			case VisGridPackage.CSV_READER__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case VisGridPackage.CSV_READER__COLUMNS:
				setColumns((String)newValue);
				return;
			case VisGridPackage.CSV_READER__FILENAME:
				setFilename((String)newValue);
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
			case VisGridPackage.CSV_READER__CONNECTION:
				getConnection().clear();
				return;
			case VisGridPackage.CSV_READER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__CITY_NAME:
				setCity_name(CITY_NAME_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__STATE_NAME:
				setState_name(STATE_NAME_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__LAT_DEG:
				setLat_deg(LAT_DEG_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__LAT_MIN:
				setLat_min(LAT_MIN_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__LONG_DEG:
				setLong_deg(LONG_DEG_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__LONG_MIN:
				setLong_min(LONG_MIN_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__LOW_TEMP:
				setLow_temp(LOW_TEMP_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__HIGH_TEMP:
				setHigh_temp(HIGH_TEMP_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__PEAK_SOLAR:
				setPeak_solar(PEAK_SOLAR_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__TIMEFMT:
				setTimefmt(TIMEFMT_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case VisGridPackage.CSV_READER__FILENAME:
				setFilename(FILENAME_EDEFAULT);
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
			case VisGridPackage.CSV_READER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case VisGridPackage.CSV_READER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisGridPackage.CSV_READER__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
			case VisGridPackage.CSV_READER__CITY_NAME:
				return CITY_NAME_EDEFAULT == null ? city_name != null : !CITY_NAME_EDEFAULT.equals(city_name);
			case VisGridPackage.CSV_READER__STATE_NAME:
				return STATE_NAME_EDEFAULT == null ? state_name != null : !STATE_NAME_EDEFAULT.equals(state_name);
			case VisGridPackage.CSV_READER__LAT_DEG:
				return LAT_DEG_EDEFAULT == null ? lat_deg != null : !LAT_DEG_EDEFAULT.equals(lat_deg);
			case VisGridPackage.CSV_READER__LAT_MIN:
				return LAT_MIN_EDEFAULT == null ? lat_min != null : !LAT_MIN_EDEFAULT.equals(lat_min);
			case VisGridPackage.CSV_READER__LONG_DEG:
				return LONG_DEG_EDEFAULT == null ? long_deg != null : !LONG_DEG_EDEFAULT.equals(long_deg);
			case VisGridPackage.CSV_READER__LONG_MIN:
				return LONG_MIN_EDEFAULT == null ? long_min != null : !LONG_MIN_EDEFAULT.equals(long_min);
			case VisGridPackage.CSV_READER__LOW_TEMP:
				return LOW_TEMP_EDEFAULT == null ? low_temp != null : !LOW_TEMP_EDEFAULT.equals(low_temp);
			case VisGridPackage.CSV_READER__HIGH_TEMP:
				return HIGH_TEMP_EDEFAULT == null ? high_temp != null : !HIGH_TEMP_EDEFAULT.equals(high_temp);
			case VisGridPackage.CSV_READER__PEAK_SOLAR:
				return PEAK_SOLAR_EDEFAULT == null ? peak_solar != null : !PEAK_SOLAR_EDEFAULT.equals(peak_solar);
			case VisGridPackage.CSV_READER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case VisGridPackage.CSV_READER__TIMEFMT:
				return TIMEFMT_EDEFAULT == null ? timefmt != null : !TIMEFMT_EDEFAULT.equals(timefmt);
			case VisGridPackage.CSV_READER__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
			case VisGridPackage.CSV_READER__COLUMNS:
				return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
			case VisGridPackage.CSV_READER__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
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
		result.append(", index: ");
		result.append(index);
		result.append(", city_name: ");
		result.append(city_name);
		result.append(", state_name: ");
		result.append(state_name);
		result.append(", lat_deg: ");
		result.append(lat_deg);
		result.append(", lat_min: ");
		result.append(lat_min);
		result.append(", long_deg: ");
		result.append(long_deg);
		result.append(", long_min: ");
		result.append(long_min);
		result.append(", low_temp: ");
		result.append(low_temp);
		result.append(", high_temp: ");
		result.append(high_temp);
		result.append(", peak_solar: ");
		result.append(peak_solar);
		result.append(", status: ");
		result.append(status);
		result.append(", timefmt: ");
		result.append(timefmt);
		result.append(", timezone: ");
		result.append(timezone);
		result.append(", columns: ");
		result.append(columns);
		result.append(", filename: ");
		result.append(filename);
		result.append(')');
		return result.toString();
	}

} //Csv_readerImpl