/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visGrid.Recorder;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recorder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.RecorderImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getFile <em>File</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getPlotcommands <em>Plotcommands</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getXdata <em>Xdata</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link visGrid.impl.RecorderImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecorderImpl extends ConnectionImpl implements Recorder {
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
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected String trigger = TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

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
	 * The default value of the '{@link #getPlotcommands() <em>Plotcommands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlotcommands()
	 * @generated
	 * @ordered
	 */
	protected static final String PLOTCOMMANDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlotcommands() <em>Plotcommands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlotcommands()
	 * @generated
	 * @ordered
	 */
	protected String plotcommands = PLOTCOMMANDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXdata() <em>Xdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdata()
	 * @generated
	 * @ordered
	 */
	protected static final String XDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXdata() <em>Xdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXdata()
	 * @generated
	 * @ordered
	 */
	protected String xdata = XDATA_EDEFAULT;

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
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecorderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getRecorder();
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__FILE, oldFile, file));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlotcommands() {
		return plotcommands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlotcommands(String newPlotcommands) {
		String oldPlotcommands = plotcommands;
		plotcommands = newPlotcommands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__PLOTCOMMANDS, oldPlotcommands, plotcommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXdata() {
		return xdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXdata(String newXdata) {
		String oldXdata = xdata;
		xdata = newXdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__XDATA, oldXdata, xdata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.RECORDER__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.RECORDER__PROPERTY:
				return getProperty();
			case VisGridPackage.RECORDER__TRIGGER:
				return getTrigger();
			case VisGridPackage.RECORDER__FILE:
				return getFile();
			case VisGridPackage.RECORDER__LIMIT:
				return getLimit();
			case VisGridPackage.RECORDER__PLOTCOMMANDS:
				return getPlotcommands();
			case VisGridPackage.RECORDER__XDATA:
				return getXdata();
			case VisGridPackage.RECORDER__COLUMNS:
				return getColumns();
			case VisGridPackage.RECORDER__INTERVAL:
				return getInterval();
			case VisGridPackage.RECORDER__OUTPUT:
				return getOutput();
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
			case VisGridPackage.RECORDER__PROPERTY:
				setProperty((String)newValue);
				return;
			case VisGridPackage.RECORDER__TRIGGER:
				setTrigger((String)newValue);
				return;
			case VisGridPackage.RECORDER__FILE:
				setFile((String)newValue);
				return;
			case VisGridPackage.RECORDER__LIMIT:
				setLimit((String)newValue);
				return;
			case VisGridPackage.RECORDER__PLOTCOMMANDS:
				setPlotcommands((String)newValue);
				return;
			case VisGridPackage.RECORDER__XDATA:
				setXdata((String)newValue);
				return;
			case VisGridPackage.RECORDER__COLUMNS:
				setColumns((String)newValue);
				return;
			case VisGridPackage.RECORDER__INTERVAL:
				setInterval((String)newValue);
				return;
			case VisGridPackage.RECORDER__OUTPUT:
				setOutput((String)newValue);
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
			case VisGridPackage.RECORDER__PROPERTY:
				setProperty(PROPERTY_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__PLOTCOMMANDS:
				setPlotcommands(PLOTCOMMANDS_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__XDATA:
				setXdata(XDATA_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case VisGridPackage.RECORDER__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
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
			case VisGridPackage.RECORDER__PROPERTY:
				return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
			case VisGridPackage.RECORDER__TRIGGER:
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case VisGridPackage.RECORDER__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case VisGridPackage.RECORDER__LIMIT:
				return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
			case VisGridPackage.RECORDER__PLOTCOMMANDS:
				return PLOTCOMMANDS_EDEFAULT == null ? plotcommands != null : !PLOTCOMMANDS_EDEFAULT.equals(plotcommands);
			case VisGridPackage.RECORDER__XDATA:
				return XDATA_EDEFAULT == null ? xdata != null : !XDATA_EDEFAULT.equals(xdata);
			case VisGridPackage.RECORDER__COLUMNS:
				return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
			case VisGridPackage.RECORDER__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case VisGridPackage.RECORDER__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
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
		result.append(" (property: ");
		result.append(property);
		result.append(", trigger: ");
		result.append(trigger);
		result.append(", file: ");
		result.append(file);
		result.append(", limit: ");
		result.append(limit);
		result.append(", plotcommands: ");
		result.append(plotcommands);
		result.append(", xdata: ");
		result.append(xdata);
		result.append(", columns: ");
		result.append(columns);
		result.append(", interval: ");
		result.append(interval);
		result.append(", output: ");
		result.append(output);
		result.append(')');
		return result.toString();
	}

} //RecorderImpl
