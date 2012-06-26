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

import visGrid.Clotheswasher;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Clotheswasher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClotheswasherItemProvider
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
	public ClotheswasherItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addMotor_powerPropertyDescriptor(object);
			addCircuit_splitPropertyDescriptor(object);
			addQueuePropertyDescriptor(object);
			addDemandPropertyDescriptor(object);
			addEnergy_meterPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clotheswasher_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_name_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Clotheswasher_motor_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_motor_power_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Motor_power(),
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
				 getString("_UI_Clotheswasher_circuit_split_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_circuit_split_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Circuit_split(),
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
				 getString("_UI_Clotheswasher_queue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_queue_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Queue(),
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
				 getString("_UI_Clotheswasher_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_demand_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Energy meter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergy_meterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Clotheswasher_energy_meter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_energy_meter_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Energy_meter(),
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
				 getString("_UI_Clotheswasher_stall_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_stall_voltage_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Stall_voltage(),
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
				 getString("_UI_Clotheswasher_start_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_start_voltage_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Start_voltage(),
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
				 getString("_UI_Clotheswasher_stall_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_stall_impedance_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Stall_impedance(),
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
				 getString("_UI_Clotheswasher_trip_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_trip_delay_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Trip_delay(),
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
				 getString("_UI_Clotheswasher_reset_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_reset_delay_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Reset_delay(),
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
				 getString("_UI_Clotheswasher_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_state_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_State(),
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
				 getString("_UI_Clotheswasher_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_shape_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Shape(),
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
				 getString("_UI_Clotheswasher_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_load_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Load(),
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
				 getString("_UI_Clotheswasher_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_energy_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Energy(),
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
				 getString("_UI_Clotheswasher_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_power_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Power(),
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
				 getString("_UI_Clotheswasher_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_peak_demand_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Peak_demand(),
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
				 getString("_UI_Clotheswasher_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_heatgain_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Heatgain(),
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
				 getString("_UI_Clotheswasher_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_heatgain_fraction_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Heatgain_fraction(),
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
				 getString("_UI_Clotheswasher_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_current_fraction_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Current_fraction(),
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
				 getString("_UI_Clotheswasher_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_impedance_fraction_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Impedance_fraction(),
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
				 getString("_UI_Clotheswasher_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_power_fraction_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Power_fraction(),
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
				 getString("_UI_Clotheswasher_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_power_factor_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Power_factor(),
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
				 getString("_UI_Clotheswasher_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_constant_power_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Constant_power(),
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
				 getString("_UI_Clotheswasher_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_constant_current_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Constant_current(),
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
				 getString("_UI_Clotheswasher_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_constant_admittance_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Constant_admittance(),
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
				 getString("_UI_Clotheswasher_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_voltage_factor_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Voltage_factor(),
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
				 getString("_UI_Clotheswasher_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_configuration_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Configuration(),
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
				 getString("_UI_Clotheswasher_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Clotheswasher_override_feature", "_UI_Clotheswasher_type"),
				 VisGridPackage.eINSTANCE.getClotheswasher_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Clotheswasher.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Clotheswasher"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Clotheswasher)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Clotheswasher_type") :
			getString("_UI_Clotheswasher_type") + " " + label;
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

		switch (notification.getFeatureID(Clotheswasher.class)) {
			case VisGridPackage.CLOTHESWASHER__NAME:
			case VisGridPackage.CLOTHESWASHER__MOTOR_POWER:
			case VisGridPackage.CLOTHESWASHER__CIRCUIT_SPLIT:
			case VisGridPackage.CLOTHESWASHER__QUEUE:
			case VisGridPackage.CLOTHESWASHER__DEMAND:
			case VisGridPackage.CLOTHESWASHER__ENERGY_METER:
			case VisGridPackage.CLOTHESWASHER__STALL_VOLTAGE:
			case VisGridPackage.CLOTHESWASHER__START_VOLTAGE:
			case VisGridPackage.CLOTHESWASHER__STALL_IMPEDANCE:
			case VisGridPackage.CLOTHESWASHER__TRIP_DELAY:
			case VisGridPackage.CLOTHESWASHER__RESET_DELAY:
			case VisGridPackage.CLOTHESWASHER__STATE:
			case VisGridPackage.CLOTHESWASHER__SHAPE:
			case VisGridPackage.CLOTHESWASHER__LOAD:
			case VisGridPackage.CLOTHESWASHER__ENERGY:
			case VisGridPackage.CLOTHESWASHER__POWER:
			case VisGridPackage.CLOTHESWASHER__PEAK_DEMAND:
			case VisGridPackage.CLOTHESWASHER__HEATGAIN:
			case VisGridPackage.CLOTHESWASHER__HEATGAIN_FRACTION:
			case VisGridPackage.CLOTHESWASHER__CURRENT_FRACTION:
			case VisGridPackage.CLOTHESWASHER__IMPEDANCE_FRACTION:
			case VisGridPackage.CLOTHESWASHER__POWER_FRACTION:
			case VisGridPackage.CLOTHESWASHER__POWER_FACTOR:
			case VisGridPackage.CLOTHESWASHER__CONSTANT_POWER:
			case VisGridPackage.CLOTHESWASHER__CONSTANT_CURRENT:
			case VisGridPackage.CLOTHESWASHER__CONSTANT_ADMITTANCE:
			case VisGridPackage.CLOTHESWASHER__VOLTAGE_FACTOR:
			case VisGridPackage.CLOTHESWASHER__CONFIGURATION:
			case VisGridPackage.CLOTHESWASHER__OVERRIDE:
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
