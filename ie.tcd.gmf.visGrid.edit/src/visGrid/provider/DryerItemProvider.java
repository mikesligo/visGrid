/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package visGrid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Dryer;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Dryer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DryerItemProvider
	extends ConnectionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DryerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMotor_powerPropertyDescriptor(object);
			addCoil_powerPropertyDescriptor(object);
			addCircuit_splitPropertyDescriptor(object);
			addDemandPropertyDescriptor(object);
			addQueuePropertyDescriptor(object);
			addStall_voltagePropertyDescriptor(object);
			addStart_voltagePropertyDescriptor(object);
			addStall_impedancePropertyDescriptor(object);
			addTrip_delayPropertyDescriptor(object);
			addReset_delayPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addShapePropertyDescriptor(object);
			addLoadPropertyDescriptor(object);
			addEnergyPropertyDescriptor(object);
			addPowerPropertyDescriptor(object);
			addPeak_demandPropertyDescriptor(object);
			addHeatgainPropertyDescriptor(object);
			addHeatgain_fractionPropertyDescriptor(object);
			addCurrent_fractionPropertyDescriptor(object);
			addImpedance_fractionPropertyDescriptor(object);
			addPower_fractionPropertyDescriptor(object);
			addPower_factorPropertyDescriptor(object);
			addConstant_powerPropertyDescriptor(object);
			addConstant_currentPropertyDescriptor(object);
			addConstant_admittancePropertyDescriptor(object);
			addVoltage_factorPropertyDescriptor(object);
			addConfigurationPropertyDescriptor(object);
			addOverridePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Motor power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMotor_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_motor_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_motor_power_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Motor_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coil power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoil_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_coil_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_coil_power_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Coil_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Circuit split feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCircuit_splitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_circuit_split_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_circuit_split_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Circuit_split(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDemandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_demand_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Queue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_queue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_queue_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Queue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stall voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStall_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_stall_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_stall_voltage_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Stall_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStart_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_start_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_start_voltage_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Start_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stall impedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStall_impedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_stall_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_stall_impedance_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Stall_impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trip delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrip_delayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_trip_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_trip_delay_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Trip_delay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReset_delayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_reset_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_reset_delay_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Reset_delay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_state_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_State(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_shape_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Shape(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_load_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_energy_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_power_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeak_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_peak_demand_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Peak_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_heatgain_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_heatgain_fraction_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_current_fraction_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Current_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_impedance_fraction_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Impedance_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_power_fraction_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Power_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_power_factor_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_constant_power_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Constant_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_currentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_constant_current_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Constant_current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant admittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_admittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_constant_admittance_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Constant_admittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_voltage_factor_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Voltage_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_configuration_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Configuration(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dryer_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dryer_override_feature", "_UI_Dryer_type"),
				 VisGridPackage.eINSTANCE.getDryer_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Dryer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dryer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dryer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Dryer_type") :
			getString("_UI_Dryer_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Dryer.class)) {
			case VisGridPackage.DRYER__MOTOR_POWER:
			case VisGridPackage.DRYER__COIL_POWER:
			case VisGridPackage.DRYER__CIRCUIT_SPLIT:
			case VisGridPackage.DRYER__DEMAND:
			case VisGridPackage.DRYER__QUEUE:
			case VisGridPackage.DRYER__STALL_VOLTAGE:
			case VisGridPackage.DRYER__START_VOLTAGE:
			case VisGridPackage.DRYER__STALL_IMPEDANCE:
			case VisGridPackage.DRYER__TRIP_DELAY:
			case VisGridPackage.DRYER__RESET_DELAY:
			case VisGridPackage.DRYER__STATE:
			case VisGridPackage.DRYER__SHAPE:
			case VisGridPackage.DRYER__LOAD:
			case VisGridPackage.DRYER__ENERGY:
			case VisGridPackage.DRYER__POWER:
			case VisGridPackage.DRYER__PEAK_DEMAND:
			case VisGridPackage.DRYER__HEATGAIN:
			case VisGridPackage.DRYER__HEATGAIN_FRACTION:
			case VisGridPackage.DRYER__CURRENT_FRACTION:
			case VisGridPackage.DRYER__IMPEDANCE_FRACTION:
			case VisGridPackage.DRYER__POWER_FRACTION:
			case VisGridPackage.DRYER__POWER_FACTOR:
			case VisGridPackage.DRYER__CONSTANT_POWER:
			case VisGridPackage.DRYER__CONSTANT_CURRENT:
			case VisGridPackage.DRYER__CONSTANT_ADMITTANCE:
			case VisGridPackage.DRYER__VOLTAGE_FACTOR:
			case VisGridPackage.DRYER__CONFIGURATION:
			case VisGridPackage.DRYER__OVERRIDE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
