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

import visGrid.Triplex_line_conductor;
import visGrid.VisGridPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triplex line conductor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visGrid.impl.Triplex_line_conductorImpl#getResistance <em>Resistance</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_line_conductorImpl#getGeometric_mean_radius <em>Geometric mean radius</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_line_conductorImpl#getRating__summer__continuous <em>Rating summer continuous</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_line_conductorImpl#getRating__summer__emergency <em>Rating summer emergency</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_line_conductorImpl#getRating__winter__continuous <em>Rating winter continuous</em>}</li>
 *   <li>{@link visGrid.impl.Triplex_line_conductorImpl#getRating__winter__emergency <em>Rating winter emergency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Triplex_line_conductorImpl extends ConnectionImpl implements Triplex_line_conductor {
		boolean lock = false;
	/**
	 * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected static final String RESISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResistance()
	 * @generated
	 * @ordered
	 */
	protected String resistance = RESISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeometric_mean_radius() <em>Geometric mean radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometric_mean_radius()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRIC_MEAN_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometric_mean_radius() <em>Geometric mean radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometric_mean_radius()
	 * @generated
	 * @ordered
	 */
	protected String geometric_mean_radius = GEOMETRIC_MEAN_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__summer__continuous() <em>Rating summer continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__continuous()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_SUMMER_CONTINUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__summer__continuous() <em>Rating summer continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__continuous()
	 * @generated
	 * @ordered
	 */
	protected String rating__summer__continuous = RATING_SUMMER_CONTINUOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__summer__emergency() <em>Rating summer emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__emergency()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_SUMMER_EMERGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__summer__emergency() <em>Rating summer emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__summer__emergency()
	 * @generated
	 * @ordered
	 */
	protected String rating__summer__emergency = RATING_SUMMER_EMERGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__winter__continuous() <em>Rating winter continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__continuous()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_WINTER_CONTINUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__winter__continuous() <em>Rating winter continuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__continuous()
	 * @generated
	 * @ordered
	 */
	protected String rating__winter__continuous = RATING_WINTER_CONTINUOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating__winter__emergency() <em>Rating winter emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__emergency()
	 * @generated
	 * @ordered
	 */
	protected static final String RATING_WINTER_EMERGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRating__winter__emergency() <em>Rating winter emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating__winter__emergency()
	 * @generated
	 * @ordered
	 */
	protected String rating__winter__emergency = RATING_WINTER_EMERGENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Triplex_line_conductorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisGridPackage.eINSTANCE.getTriplex_line_conductor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResistance() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"resistance");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Resistance");
				resistance= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResistance(String newResistance) {
		String oldResistance = resistance;
		resistance = newResistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE, oldResistance, resistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometric_mean_radius() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"geometric_mean_radius");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"Geometric_mean_radius");
				geometric_mean_radius= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return geometric_mean_radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometric_mean_radius(String newGeometric_mean_radius) {
		String oldGeometric_mean_radius = geometric_mean_radius;
		geometric_mean_radius = newGeometric_mean_radius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS, oldGeometric_mean_radius, geometric_mean_radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__summer__continuous() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20summer%20continuous");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20SUMMER%20CONTINUOUS");
				rating__summer__continuous= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__summer__continuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__summer__continuous(String newRating__summer__continuous) {
		String oldRating__summer__continuous = rating__summer__continuous;
		rating__summer__continuous = newRating__summer__continuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS, oldRating__summer__continuous, rating__summer__continuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__summer__emergency() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20summer%20emergency");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20SUMMER%20EMERGENCY");
				rating__summer__emergency= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__summer__emergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__summer__emergency(String newRating__summer__emergency) {
		String oldRating__summer__emergency = rating__summer__emergency;
		rating__summer__emergency = newRating__summer__emergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY, oldRating__summer__emergency, rating__summer__emergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__winter__continuous() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20winter%20continuous");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20WINTER%20CONTINUOUS");
				rating__winter__continuous= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__winter__continuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__winter__continuous(String newRating__winter__continuous) {
		String oldRating__winter__continuous = rating__winter__continuous;
		rating__winter__continuous = newRating__winter__continuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS, oldRating__winter__continuous, rating__winter__continuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRating__winter__emergency() {
		// Generated by python script located in this directory
		if (!lock){
			try {
				String val = http.Property.getValueOfProperty(this.getName(),"rating%20winter%20emergency");
				if (val == null) val = http.Property.getValueOfProperty(this.getName(),"RATING%20WINTER%20EMERGENCY");
				rating__winter__emergency= val;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rating__winter__emergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRating__winter__emergency(String newRating__winter__emergency) {
		String oldRating__winter__emergency = rating__winter__emergency;
		rating__winter__emergency = newRating__winter__emergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY, oldRating__winter__emergency, rating__winter__emergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				return getResistance();
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				return getGeometric_mean_radius();
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				return getRating__summer__continuous();
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				return getRating__summer__emergency();
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				return getRating__winter__continuous();
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				return getRating__winter__emergency();
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
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				setResistance((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				setGeometric_mean_radius((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				setRating__summer__continuous((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				setRating__summer__emergency((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				setRating__winter__continuous((String)newValue);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				setRating__winter__emergency((String)newValue);
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
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				setResistance(RESISTANCE_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				setGeometric_mean_radius(GEOMETRIC_MEAN_RADIUS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				setRating__summer__continuous(RATING_SUMMER_CONTINUOUS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				setRating__summer__emergency(RATING_SUMMER_EMERGENCY_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				setRating__winter__continuous(RATING_WINTER_CONTINUOUS_EDEFAULT);
				return;
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				setRating__winter__emergency(RATING_WINTER_EMERGENCY_EDEFAULT);
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
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RESISTANCE:
				return RESISTANCE_EDEFAULT == null ? resistance != null : !RESISTANCE_EDEFAULT.equals(resistance);
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
				return GEOMETRIC_MEAN_RADIUS_EDEFAULT == null ? geometric_mean_radius != null : !GEOMETRIC_MEAN_RADIUS_EDEFAULT.equals(geometric_mean_radius);
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
				return RATING_SUMMER_CONTINUOUS_EDEFAULT == null ? rating__summer__continuous != null : !RATING_SUMMER_CONTINUOUS_EDEFAULT.equals(rating__summer__continuous);
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
				return RATING_SUMMER_EMERGENCY_EDEFAULT == null ? rating__summer__emergency != null : !RATING_SUMMER_EMERGENCY_EDEFAULT.equals(rating__summer__emergency);
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
				return RATING_WINTER_CONTINUOUS_EDEFAULT == null ? rating__winter__continuous != null : !RATING_WINTER_CONTINUOUS_EDEFAULT.equals(rating__winter__continuous);
			case VisGridPackage.TRIPLEX_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
				return RATING_WINTER_EMERGENCY_EDEFAULT == null ? rating__winter__emergency != null : !RATING_WINTER_EMERGENCY_EDEFAULT.equals(rating__winter__emergency);
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
		result.append(" (resistance: ");
		result.append(resistance);
		result.append(", geometric_mean_radius: ");
		result.append(geometric_mean_radius);
		result.append(", rating__summer__continuous: ");
		result.append(rating__summer__continuous);
		result.append(", rating__summer__emergency: ");
		result.append(rating__summer__emergency);
		result.append(", rating__winter__continuous: ");
		result.append(rating__winter__continuous);
		result.append(", rating__winter__emergency: ");
		result.append(rating__winter__emergency);
		result.append(')');
		return result.toString();
	}

} //Triplex_line_conductorImpl
