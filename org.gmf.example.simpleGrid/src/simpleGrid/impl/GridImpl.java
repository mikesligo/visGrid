/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simpleGrid.Climate;
import simpleGrid.Grid;
import simpleGrid.House;
import simpleGrid.Node;
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
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simpleGrid.impl.GridImpl#getClimate <em>Climate</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getNode <em>Node</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTransformer_configuration <em>Transformer configuration</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTriplex_nodes <em>Triplex nodes</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTriplex_line_configuration <em>Triplex line configuration</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTriplex_line_conductor <em>Triplex line conductor</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTriplex_line <em>Triplex line</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getTriplex_meter <em>Triplex meter</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getHouse <em>House</em>}</li>
 *   <li>{@link simpleGrid.impl.GridImpl#getWaterheater <em>Waterheater</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridImpl extends EObjectImpl implements Grid {
	/**
	 * The cached value of the '{@link #getClimate() <em>Climate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClimate()
	 * @generated
	 * @ordered
	 */
	protected Climate climate;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getTransformer() <em>Transformer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer> transformer;

	/**
	 * The cached value of the '{@link #getTransformer_configuration() <em>Transformer configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformer_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformer_configuration> transformer_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_nodes() <em>Triplex nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_nodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_node> triplex_nodes;

	/**
	 * The cached value of the '{@link #getTriplex_line_configuration() <em>Triplex line configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_configuration()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_Line_configuration> triplex_line_configuration;

	/**
	 * The cached value of the '{@link #getTriplex_line_conductor() <em>Triplex line conductor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line_conductor()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line_conductor> triplex_line_conductor;

	/**
	 * The cached value of the '{@link #getTriplex_line() <em>Triplex line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_line()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_line> triplex_line;

	/**
	 * The cached value of the '{@link #getTriplex_meter() <em>Triplex meter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplex_meter()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplex_meter> triplex_meter;

	/**
	 * The cached value of the '{@link #getHouse() <em>House</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse()
	 * @generated
	 * @ordered
	 */
	protected EList<House> house;

	/**
	 * The cached value of the '{@link #getWaterheater() <em>Waterheater</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterheater()
	 * @generated
	 * @ordered
	 */
	protected EList<Waterheater> waterheater;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleGridPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Climate getClimate() {
		return climate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClimate(Climate newClimate, NotificationChain msgs) {
		Climate oldClimate = climate;
		climate = newClimate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleGridPackage.GRID__CLIMATE, oldClimate, newClimate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClimate(Climate newClimate) {
		if (newClimate != climate) {
			NotificationChain msgs = null;
			if (climate != null)
				msgs = ((InternalEObject)climate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.GRID__CLIMATE, null, msgs);
			if (newClimate != null)
				msgs = ((InternalEObject)newClimate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleGridPackage.GRID__CLIMATE, null, msgs);
			msgs = basicSetClimate(newClimate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleGridPackage.GRID__CLIMATE, newClimate, newClimate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, SimpleGridPackage.GRID__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer> getTransformer() {
		if (transformer == null) {
			transformer = new EObjectContainmentEList<Transformer>(Transformer.class, this, SimpleGridPackage.GRID__TRANSFORMER);
		}
		return transformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformer_configuration> getTransformer_configuration() {
		if (transformer_configuration == null) {
			transformer_configuration = new EObjectContainmentEList<Transformer_configuration>(Transformer_configuration.class, this, SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION);
		}
		return transformer_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_node> getTriplex_nodes() {
		if (triplex_nodes == null) {
			triplex_nodes = new EObjectContainmentEList<Triplex_node>(Triplex_node.class, this, SimpleGridPackage.GRID__TRIPLEX_NODES);
		}
		return triplex_nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_Line_configuration> getTriplex_line_configuration() {
		if (triplex_line_configuration == null) {
			triplex_line_configuration = new EObjectContainmentEList<Triplex_Line_configuration>(Triplex_Line_configuration.class, this, SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION);
		}
		return triplex_line_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line_conductor> getTriplex_line_conductor() {
		if (triplex_line_conductor == null) {
			triplex_line_conductor = new EObjectContainmentEList<Triplex_line_conductor>(Triplex_line_conductor.class, this, SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR);
		}
		return triplex_line_conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_line> getTriplex_line() {
		if (triplex_line == null) {
			triplex_line = new EObjectContainmentEList<Triplex_line>(Triplex_line.class, this, SimpleGridPackage.GRID__TRIPLEX_LINE);
		}
		return triplex_line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplex_meter> getTriplex_meter() {
		if (triplex_meter == null) {
			triplex_meter = new EObjectContainmentEList<Triplex_meter>(Triplex_meter.class, this, SimpleGridPackage.GRID__TRIPLEX_METER);
		}
		return triplex_meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getHouse() {
		if (house == null) {
			house = new EObjectContainmentEList<House>(House.class, this, SimpleGridPackage.GRID__HOUSE);
		}
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Waterheater> getWaterheater() {
		if (waterheater == null) {
			waterheater = new EObjectContainmentEList<Waterheater>(Waterheater.class, this, SimpleGridPackage.GRID__WATERHEATER);
		}
		return waterheater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimpleGridPackage.GRID__CLIMATE:
				return basicSetClimate(null, msgs);
			case SimpleGridPackage.GRID__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRANSFORMER:
				return ((InternalEList<?>)getTransformer()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				return ((InternalEList<?>)getTransformer_configuration()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRIPLEX_NODES:
				return ((InternalEList<?>)getTriplex_nodes()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				return ((InternalEList<?>)getTriplex_line_configuration()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				return ((InternalEList<?>)getTriplex_line_conductor()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRIPLEX_LINE:
				return ((InternalEList<?>)getTriplex_line()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__TRIPLEX_METER:
				return ((InternalEList<?>)getTriplex_meter()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__HOUSE:
				return ((InternalEList<?>)getHouse()).basicRemove(otherEnd, msgs);
			case SimpleGridPackage.GRID__WATERHEATER:
				return ((InternalEList<?>)getWaterheater()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleGridPackage.GRID__CLIMATE:
				return getClimate();
			case SimpleGridPackage.GRID__NODE:
				return getNode();
			case SimpleGridPackage.GRID__TRANSFORMER:
				return getTransformer();
			case SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				return getTransformer_configuration();
			case SimpleGridPackage.GRID__TRIPLEX_NODES:
				return getTriplex_nodes();
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				return getTriplex_line_configuration();
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				return getTriplex_line_conductor();
			case SimpleGridPackage.GRID__TRIPLEX_LINE:
				return getTriplex_line();
			case SimpleGridPackage.GRID__TRIPLEX_METER:
				return getTriplex_meter();
			case SimpleGridPackage.GRID__HOUSE:
				return getHouse();
			case SimpleGridPackage.GRID__WATERHEATER:
				return getWaterheater();
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
			case SimpleGridPackage.GRID__CLIMATE:
				setClimate((Climate)newValue);
				return;
			case SimpleGridPackage.GRID__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case SimpleGridPackage.GRID__TRANSFORMER:
				getTransformer().clear();
				getTransformer().addAll((Collection<? extends Transformer>)newValue);
				return;
			case SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				getTransformer_configuration().addAll((Collection<? extends Transformer_configuration>)newValue);
				return;
			case SimpleGridPackage.GRID__TRIPLEX_NODES:
				getTriplex_nodes().clear();
				getTriplex_nodes().addAll((Collection<? extends Triplex_node>)newValue);
				return;
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				getTriplex_line_configuration().addAll((Collection<? extends Triplex_Line_configuration>)newValue);
				return;
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				getTriplex_line_conductor().addAll((Collection<? extends Triplex_line_conductor>)newValue);
				return;
			case SimpleGridPackage.GRID__TRIPLEX_LINE:
				getTriplex_line().clear();
				getTriplex_line().addAll((Collection<? extends Triplex_line>)newValue);
				return;
			case SimpleGridPackage.GRID__TRIPLEX_METER:
				getTriplex_meter().clear();
				getTriplex_meter().addAll((Collection<? extends Triplex_meter>)newValue);
				return;
			case SimpleGridPackage.GRID__HOUSE:
				getHouse().clear();
				getHouse().addAll((Collection<? extends House>)newValue);
				return;
			case SimpleGridPackage.GRID__WATERHEATER:
				getWaterheater().clear();
				getWaterheater().addAll((Collection<? extends Waterheater>)newValue);
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
			case SimpleGridPackage.GRID__CLIMATE:
				setClimate((Climate)null);
				return;
			case SimpleGridPackage.GRID__NODE:
				getNode().clear();
				return;
			case SimpleGridPackage.GRID__TRANSFORMER:
				getTransformer().clear();
				return;
			case SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				getTransformer_configuration().clear();
				return;
			case SimpleGridPackage.GRID__TRIPLEX_NODES:
				getTriplex_nodes().clear();
				return;
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				getTriplex_line_configuration().clear();
				return;
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				getTriplex_line_conductor().clear();
				return;
			case SimpleGridPackage.GRID__TRIPLEX_LINE:
				getTriplex_line().clear();
				return;
			case SimpleGridPackage.GRID__TRIPLEX_METER:
				getTriplex_meter().clear();
				return;
			case SimpleGridPackage.GRID__HOUSE:
				getHouse().clear();
				return;
			case SimpleGridPackage.GRID__WATERHEATER:
				getWaterheater().clear();
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
			case SimpleGridPackage.GRID__CLIMATE:
				return climate != null;
			case SimpleGridPackage.GRID__NODE:
				return node != null && !node.isEmpty();
			case SimpleGridPackage.GRID__TRANSFORMER:
				return transformer != null && !transformer.isEmpty();
			case SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION:
				return transformer_configuration != null && !transformer_configuration.isEmpty();
			case SimpleGridPackage.GRID__TRIPLEX_NODES:
				return triplex_nodes != null && !triplex_nodes.isEmpty();
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
				return triplex_line_configuration != null && !triplex_line_configuration.isEmpty();
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
				return triplex_line_conductor != null && !triplex_line_conductor.isEmpty();
			case SimpleGridPackage.GRID__TRIPLEX_LINE:
				return triplex_line != null && !triplex_line.isEmpty();
			case SimpleGridPackage.GRID__TRIPLEX_METER:
				return triplex_meter != null && !triplex_meter.isEmpty();
			case SimpleGridPackage.GRID__HOUSE:
				return house != null && !house.isEmpty();
			case SimpleGridPackage.GRID__WATERHEATER:
				return waterheater != null && !waterheater.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GridImpl
