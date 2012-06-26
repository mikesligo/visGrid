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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Regulator_configuration;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Regulator_configuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Regulator_configurationItemProvider
	extends ItemProviderAdapter
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
	public Regulator_configurationItemProvider(AdapterFactory adapterFactory) {
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

			addConnectionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addConnect_typePropertyDescriptor(object);
			addBand_centerPropertyDescriptor(object);
			addBand_widthPropertyDescriptor(object);
			addTime_delayPropertyDescriptor(object);
			addDwell_timePropertyDescriptor(object);
			addRaise_tapsPropertyDescriptor(object);
			addLower_tapsPropertyDescriptor(object);
			addCurrent_transducer_ratioPropertyDescriptor(object);
			addPower_transducer_ratioPropertyDescriptor(object);
			addCompensator_r_setting_APropertyDescriptor(object);
			addCompensator_r_setting_BPropertyDescriptor(object);
			addCompensator_r_setting_CPropertyDescriptor(object);
			addCompensator_x_setting_APropertyDescriptor(object);
			addCompensator_x_setting_BPropertyDescriptor(object);
			addCompensator_x_setting_CPropertyDescriptor(object);
			addCT_phasePropertyDescriptor(object);
			addPT_phasePropertyDescriptor(object);
			addRegulationPropertyDescriptor(object);
			addControl_levelPropertyDescriptor(object);
			addControlPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addTap_pos_APropertyDescriptor(object);
			addTap_pos_BPropertyDescriptor(object);
			addTap_pos_CPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_Connection_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Connection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_Regulator_configuration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_name_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connect type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnect_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_connect_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_connect_type_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Connect_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Band center feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBand_centerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_band_center_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_band_center_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Band_center(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Band width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBand_widthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_band_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_band_width_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Band_width(),
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
				 getString("_UI_Regulator_configuration_time_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_time_delay_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Time_delay(),
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
				 getString("_UI_Regulator_configuration_dwell_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_dwell_time_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Dwell_time(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Raise taps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRaise_tapsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_raise_taps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_raise_taps_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Raise_taps(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lower taps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLower_tapsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_lower_taps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_lower_taps_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Lower_taps(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current transducer ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_transducer_ratioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_current_transducer_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_current_transducer_ratio_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Current_transducer_ratio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power transducer ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_transducer_ratioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_power_transducer_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_power_transducer_ratio_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Power_transducer_ratio(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensator rsetting A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensator_r_setting_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_compensator_r_setting_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_compensator_r_setting_A_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Compensator_r_setting_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensator rsetting B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensator_r_setting_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_compensator_r_setting_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_compensator_r_setting_B_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Compensator_r_setting_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensator rsetting C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensator_r_setting_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_compensator_r_setting_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_compensator_r_setting_C_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Compensator_r_setting_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensator xsetting A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensator_x_setting_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_compensator_x_setting_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_compensator_x_setting_A_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Compensator_x_setting_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensator xsetting B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensator_x_setting_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_compensator_x_setting_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_compensator_x_setting_B_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Compensator_x_setting_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compensator xsetting C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompensator_x_setting_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_compensator_x_setting_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_compensator_x_setting_C_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Compensator_x_setting_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CT phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCT_phasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_CT_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_CT_phase_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_CT_phase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PT phase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPT_phasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_PT_phase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_PT_phase_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_PT_phase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_regulation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_regulation_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Regulation(),
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
				 getString("_UI_Regulator_configuration_control_level_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_control_level_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Control_level(),
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
				 getString("_UI_Regulator_configuration_Control_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_Control_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Control(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_Type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_Type_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tap pos A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTap_pos_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_tap_pos_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_tap_pos_A_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Tap_pos_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tap pos B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTap_pos_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_tap_pos_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_tap_pos_B_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Tap_pos_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tap pos C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTap_pos_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Regulator_configuration_tap_pos_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Regulator_configuration_tap_pos_C_feature", "_UI_Regulator_configuration_type"),
				 VisGridPackage.eINSTANCE.getRegulator_configuration_Tap_pos_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Regulator_configuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Regulator_configuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Regulator_configuration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Regulator_configuration_type") :
			getString("_UI_Regulator_configuration_type") + " " + label;
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

		switch (notification.getFeatureID(Regulator_configuration.class)) {
			case VisGridPackage.REGULATOR_CONFIGURATION__NAME:
			case VisGridPackage.REGULATOR_CONFIGURATION__CONNECT_TYPE:
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_CENTER:
			case VisGridPackage.REGULATOR_CONFIGURATION__BAND_WIDTH:
			case VisGridPackage.REGULATOR_CONFIGURATION__TIME_DELAY:
			case VisGridPackage.REGULATOR_CONFIGURATION__DWELL_TIME:
			case VisGridPackage.REGULATOR_CONFIGURATION__RAISE_TAPS:
			case VisGridPackage.REGULATOR_CONFIGURATION__LOWER_TAPS:
			case VisGridPackage.REGULATOR_CONFIGURATION__CURRENT_TRANSDUCER_RATIO:
			case VisGridPackage.REGULATOR_CONFIGURATION__POWER_TRANSDUCER_RATIO:
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_A:
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_B:
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_RSETTING_C:
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_A:
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_B:
			case VisGridPackage.REGULATOR_CONFIGURATION__COMPENSATOR_XSETTING_C:
			case VisGridPackage.REGULATOR_CONFIGURATION__CT_PHASE:
			case VisGridPackage.REGULATOR_CONFIGURATION__PT_PHASE:
			case VisGridPackage.REGULATOR_CONFIGURATION__REGULATION:
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL_LEVEL:
			case VisGridPackage.REGULATOR_CONFIGURATION__CONTROL:
			case VisGridPackage.REGULATOR_CONFIGURATION__TYPE:
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_A:
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_B:
			case VisGridPackage.REGULATOR_CONFIGURATION__TAP_POS_C:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VisGridEditPlugin.INSTANCE;
	}

}
