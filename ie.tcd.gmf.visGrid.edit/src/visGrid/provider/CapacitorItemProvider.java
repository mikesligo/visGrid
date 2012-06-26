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

import visGrid.Capacitor;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Capacitor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CapacitorItemProvider
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
	public CapacitorItemProvider(AdapterFactory adapterFactory) {
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
			addPt_phasePropertyDescriptor(object);
			addPhases_connectedPropertyDescriptor(object);
			addSwitchAPropertyDescriptor(object);
			addSwitchBPropertyDescriptor(object);
			addSwitchCPropertyDescriptor(object);
			addControlPropertyDescriptor(object);
			addVoltage_set_highPropertyDescriptor(object);
			addVoltage_set_lowPropertyDescriptor(object);
			addVAr_set_highPropertyDescriptor(object);
			addVAr_set_lowPropertyDescriptor(object);
			addCurrent_set_lowPropertyDescriptor(object);
			addCurrent_set_highPropertyDescriptor(object);
			addCapacitor_APropertyDescriptor(object);
			addCapacitor_BPropertyDescriptor(object);
			addCapacitor_CPropertyDescriptor(object);
			addCap_nominal_voltagePropertyDescriptor(object);
			addTime_delayPropertyDescriptor(object);
			addDwell_timePropertyDescriptor(object);
			addLockout_timePropertyDescriptor(object);
			addRemote_sensePropertyDescriptor(object);
			addRemote_sense_BPropertyDescriptor(object);
			addControl_levelPropertyDescriptor(object);
			addBustypePropertyDescriptor(object);
			addBusflagsPropertyDescriptor(object);
			addReference_busPropertyDescriptor(object);
			addMaximum_voltage_errorPropertyDescriptor(object);
			addVoltage_APropertyDescriptor(object);
			addVoltage_BPropertyDescriptor(object);
			addVoltage_CPropertyDescriptor(object);
			addVoltage_ABPropertyDescriptor(object);
			addVoltage_BCPropertyDescriptor(object);
			addVoltage_CAPropertyDescriptor(object);
			addCurrent_APropertyDescriptor(object);
			addCurrent_BPropertyDescriptor(object);
			addCurrent_CPropertyDescriptor(object);
			addPower_APropertyDescriptor(object);
			addPower_BPropertyDescriptor(object);
			addPower_CPropertyDescriptor(object);
			addShunt_APropertyDescriptor(object);
			addShunt_BPropertyDescriptor(object);
			addShunt_CPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
			addNominal_voltagePropertyDescriptor(object);
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
				 getString("_UI_Capacitor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_name_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pt phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPt_phasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_pt_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_pt_phase_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Pt_phase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phases connected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhases_connectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_phases_connected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_phases_connected_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Phases_connected(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Switch A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwitchAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_switchA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_switchA_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_SwitchA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Switch B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwitchBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_switchB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_switchB_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_SwitchB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Switch C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwitchCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_switchC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_switchC_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_SwitchC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_control_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_control_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Control(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage set high feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_set_highPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_set_high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_set_high_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_set_high(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage set low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_set_lowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_set_low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_set_low_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_set_low(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VAr set high feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVAr_set_highPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_VAr_set_high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_VAr_set_high_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_VAr_set_high(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VAr set low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVAr_set_lowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_VAr_set_low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_VAr_set_low_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_VAr_set_low(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current set low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_set_lowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_current_set_low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_current_set_low_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Current_set_low(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current set high feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_set_highPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_current_set_high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_current_set_high_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Current_set_high(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacitor A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitor_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_capacitor_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_capacitor_A_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Capacitor_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacitor B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitor_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_capacitor_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_capacitor_B_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Capacitor_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacitor C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitor_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_capacitor_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_capacitor_C_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Capacitor_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cap nominal voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCap_nominal_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_cap_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_cap_nominal_voltage_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Cap_nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTime_delayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_time_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_time_delay_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Time_delay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dwell time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDwell_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_dwell_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_dwell_time_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Dwell_time(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lockout time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockout_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_lockout_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_lockout_time_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Lockout_time(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote sense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemote_sensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_remote_sense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_remote_sense_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Remote_sense(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote sense B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemote_sense_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_remote_sense_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_remote_sense_B_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Remote_sense_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControl_levelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_control_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_control_level_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Control_level(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bustype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBustypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_bustype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_bustype_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Bustype(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Busflags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusflagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_busflags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_busflags_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Busflags(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference bus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReference_busPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_reference_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_reference_bus_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Reference_bus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum voltage error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximum_voltage_errorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_maximum_voltage_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_maximum_voltage_error_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Maximum_voltage_error(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_A_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_B_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_C_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage AB feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_ABPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_AB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_AB_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_AB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage BC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_BCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_BC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_BC_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_BC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage CA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_CAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_voltage_CA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_voltage_CA_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Voltage_CA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_current_A_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Current_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_current_B_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Current_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_current_C_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_power_A_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Power_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_power_B_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Power_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_power_C_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Power_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_shunt_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_shunt_A_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Shunt_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_shunt_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_shunt_B_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Shunt_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_shunt_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_shunt_C_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Shunt_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phases feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhasesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_phases_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominal_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Capacitor_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Capacitor_nominal_voltage_feature", "_UI_Capacitor_type"),
				 VisGridPackage.eINSTANCE.getCapacitor_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Capacitor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Capacitor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Capacitor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Capacitor_type") :
			getString("_UI_Capacitor_type") + " " + label;
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

		switch (notification.getFeatureID(Capacitor.class)) {
			case VisGridPackage.CAPACITOR__NAME:
			case VisGridPackage.CAPACITOR__PT_PHASE:
			case VisGridPackage.CAPACITOR__PHASES_CONNECTED:
			case VisGridPackage.CAPACITOR__SWITCH_A:
			case VisGridPackage.CAPACITOR__SWITCH_B:
			case VisGridPackage.CAPACITOR__SWITCH_C:
			case VisGridPackage.CAPACITOR__CONTROL:
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_HIGH:
			case VisGridPackage.CAPACITOR__VOLTAGE_SET_LOW:
			case VisGridPackage.CAPACITOR__VAR_SET_HIGH:
			case VisGridPackage.CAPACITOR__VAR_SET_LOW:
			case VisGridPackage.CAPACITOR__CURRENT_SET_LOW:
			case VisGridPackage.CAPACITOR__CURRENT_SET_HIGH:
			case VisGridPackage.CAPACITOR__CAPACITOR_A:
			case VisGridPackage.CAPACITOR__CAPACITOR_B:
			case VisGridPackage.CAPACITOR__CAPACITOR_C:
			case VisGridPackage.CAPACITOR__CAP_NOMINAL_VOLTAGE:
			case VisGridPackage.CAPACITOR__TIME_DELAY:
			case VisGridPackage.CAPACITOR__DWELL_TIME:
			case VisGridPackage.CAPACITOR__LOCKOUT_TIME:
			case VisGridPackage.CAPACITOR__REMOTE_SENSE:
			case VisGridPackage.CAPACITOR__REMOTE_SENSE_B:
			case VisGridPackage.CAPACITOR__CONTROL_LEVEL:
			case VisGridPackage.CAPACITOR__BUSTYPE:
			case VisGridPackage.CAPACITOR__BUSFLAGS:
			case VisGridPackage.CAPACITOR__REFERENCE_BUS:
			case VisGridPackage.CAPACITOR__MAXIMUM_VOLTAGE_ERROR:
			case VisGridPackage.CAPACITOR__VOLTAGE_A:
			case VisGridPackage.CAPACITOR__VOLTAGE_B:
			case VisGridPackage.CAPACITOR__VOLTAGE_C:
			case VisGridPackage.CAPACITOR__VOLTAGE_AB:
			case VisGridPackage.CAPACITOR__VOLTAGE_BC:
			case VisGridPackage.CAPACITOR__VOLTAGE_CA:
			case VisGridPackage.CAPACITOR__CURRENT_A:
			case VisGridPackage.CAPACITOR__CURRENT_B:
			case VisGridPackage.CAPACITOR__CURRENT_C:
			case VisGridPackage.CAPACITOR__POWER_A:
			case VisGridPackage.CAPACITOR__POWER_B:
			case VisGridPackage.CAPACITOR__POWER_C:
			case VisGridPackage.CAPACITOR__SHUNT_A:
			case VisGridPackage.CAPACITOR__SHUNT_B:
			case VisGridPackage.CAPACITOR__SHUNT_C:
			case VisGridPackage.CAPACITOR__PHASES:
			case VisGridPackage.CAPACITOR__NOMINAL_VOLTAGE:
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
