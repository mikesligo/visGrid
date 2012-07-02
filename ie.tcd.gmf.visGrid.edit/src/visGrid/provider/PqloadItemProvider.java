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

import visGrid.Pqload;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Pqload} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PqloadItemProvider
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
	public PqloadItemProvider(AdapterFactory adapterFactory) {
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

			addWeatherPropertyDescriptor(object);
			addT_nominalPropertyDescriptor(object);
			addZp_TPropertyDescriptor(object);
			addZp_HPropertyDescriptor(object);
			addZp_SPropertyDescriptor(object);
			addZp_WPropertyDescriptor(object);
			addZp_RPropertyDescriptor(object);
			addZpPropertyDescriptor(object);
			addZq_TPropertyDescriptor(object);
			addZq_HPropertyDescriptor(object);
			addZq_SPropertyDescriptor(object);
			addZq_WPropertyDescriptor(object);
			addZq_RPropertyDescriptor(object);
			addZqPropertyDescriptor(object);
			addIm_TPropertyDescriptor(object);
			addIm_HPropertyDescriptor(object);
			addIm_SPropertyDescriptor(object);
			addIm_WPropertyDescriptor(object);
			addIm_RPropertyDescriptor(object);
			addImPropertyDescriptor(object);
			addIa_TPropertyDescriptor(object);
			addIa_HPropertyDescriptor(object);
			addIa_SPropertyDescriptor(object);
			addIa_WPropertyDescriptor(object);
			addIa_RPropertyDescriptor(object);
			addIaPropertyDescriptor(object);
			addPp_TPropertyDescriptor(object);
			addPp_HPropertyDescriptor(object);
			addPp_SPropertyDescriptor(object);
			addPp_WPropertyDescriptor(object);
			addPp_RPropertyDescriptor(object);
			addPpPropertyDescriptor(object);
			addPq_TPropertyDescriptor(object);
			addPq_HPropertyDescriptor(object);
			addPq_SPropertyDescriptor(object);
			addPq_WPropertyDescriptor(object);
			addPq_RPropertyDescriptor(object);
			addPqPropertyDescriptor(object);
			addInput_tempPropertyDescriptor(object);
			addInput_humidPropertyDescriptor(object);
			addInput_solarPropertyDescriptor(object);
			addInput_windPropertyDescriptor(object);
			addInput_rainPropertyDescriptor(object);
			addOutput_imped_pPropertyDescriptor(object);
			addOutput_imped_qPropertyDescriptor(object);
			addOutput_current_mPropertyDescriptor(object);
			addOutput_current_aPropertyDescriptor(object);
			addOutput_power_pPropertyDescriptor(object);
			addOutput_power_qPropertyDescriptor(object);
			addOutput_impedancePropertyDescriptor(object);
			addOutput_currentPropertyDescriptor(object);
			addOutput_powerPropertyDescriptor(object);
			addLoad_classPropertyDescriptor(object);
			addConstant_power_APropertyDescriptor(object);
			addConstant_power_BPropertyDescriptor(object);
			addConstant_power_CPropertyDescriptor(object);
			addConstant_power_A_realPropertyDescriptor(object);
			addConstant_power_B_realPropertyDescriptor(object);
			addConstant_power_C_realPropertyDescriptor(object);
			addConstant_power_A_reacPropertyDescriptor(object);
			addConstant_power_B_reacPropertyDescriptor(object);
			addConstant_power_C_reacPropertyDescriptor(object);
			addConstant_current_APropertyDescriptor(object);
			addConstant_current_BPropertyDescriptor(object);
			addConstant_current_CPropertyDescriptor(object);
			addConstant_current_A_realPropertyDescriptor(object);
			addConstant_current_B_realPropertyDescriptor(object);
			addConstant_current_C_realPropertyDescriptor(object);
			addConstant_current_A_reacPropertyDescriptor(object);
			addConstant_current_B_reacPropertyDescriptor(object);
			addConstant_current_C_reacPropertyDescriptor(object);
			addConstant_impedance_APropertyDescriptor(object);
			addConstant_impedance_BPropertyDescriptor(object);
			addConstant_impedance_CPropertyDescriptor(object);
			addConstant_impedance_A_realPropertyDescriptor(object);
			addConstant_impedance_B_realPropertyDescriptor(object);
			addConstant_impedance_C_realPropertyDescriptor(object);
			addConstant_impedance_A_reacPropertyDescriptor(object);
			addConstant_impedance_B_reacPropertyDescriptor(object);
			addConstant_impedance_C_reacPropertyDescriptor(object);
			addMeasured_voltage_APropertyDescriptor(object);
			addMeasured_voltage_BPropertyDescriptor(object);
			addMeasured_voltage_CPropertyDescriptor(object);
			addMeasured_voltage_ABPropertyDescriptor(object);
			addMeasured_voltage_BCPropertyDescriptor(object);
			addMeasured_voltage_CAPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Weather feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeatherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_weather_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_weather_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Weather(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tnominal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addT_nominalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_T_nominal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_T_nominal_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_T_nominal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zp T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZp_TPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zp_T_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zp_T_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zp_T(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zp H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZp_HPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zp_H_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zp_H_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zp_H(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zp S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZp_SPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zp_S_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zp_S_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zp_S(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zp W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZp_WPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zp_W_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zp_W_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zp_W(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zp R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZp_RPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zp_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zp_R_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zp_R(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zp_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zq T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZq_TPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zq_T_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zq_T_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zq_T(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zq H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZq_HPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zq_H_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zq_H_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zq_H(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zq S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZq_SPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zq_S_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zq_S_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zq_S(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zq W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZq_WPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zq_W_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zq_W_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zq_W(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zq R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZq_RPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zq_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zq_R_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zq_R(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Zq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Zq_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Zq(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Im T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIm_TPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Im_T_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Im_T_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Im_T(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Im H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIm_HPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Im_H_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Im_H_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Im_H(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Im S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIm_SPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Im_S_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Im_S_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Im_S(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Im W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIm_WPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Im_W_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Im_W_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Im_W(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Im R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIm_RPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Im_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Im_R_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Im_R(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Im feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Im_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Im_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Im(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ia T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIa_TPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Ia_T_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Ia_T_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Ia_T(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ia H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIa_HPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Ia_H_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Ia_H_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Ia_H(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ia S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIa_SPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Ia_S_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Ia_S_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Ia_S(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ia W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIa_WPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Ia_W_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Ia_W_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Ia_W(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ia R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIa_RPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Ia_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Ia_R_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Ia_R(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ia feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Ia_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Ia_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Ia(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pp T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPp_TPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pp_T_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pp_T_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pp_T(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pp H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPp_HPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pp_H_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pp_H_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pp_H(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pp S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPp_SPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pp_S_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pp_S_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pp_S(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pp W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPp_WPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pp_W_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pp_W_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pp_W(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pp R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPp_RPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pp_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pp_R_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pp_R(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pp_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pq T feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPq_TPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pq_T_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pq_T_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pq_T(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pq H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPq_HPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pq_H_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pq_H_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pq_H(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pq S feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPq_SPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pq_S_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pq_S_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pq_S(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pq W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPq_WPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pq_W_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pq_W_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pq_W(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pq R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPq_RPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pq_R_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pq_R_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pq_R(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_Pq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_Pq_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Pq(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_input_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_input_temp_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Input_temp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input humid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_humidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_input_humid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_input_humid_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Input_humid(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input solar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_solarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_input_solar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_input_solar_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Input_solar(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input wind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_windPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_input_wind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_input_wind_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Input_wind(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input rain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_rainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_input_rain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_input_rain_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Input_rain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output imped p feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_imped_pPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_imped_p_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_imped_p_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_imped_p(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output imped q feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_imped_qPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_imped_q_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_imped_q_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_imped_q(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output current m feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_current_mPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_current_m_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_current_m_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_current_m(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output current a feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_current_aPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_current_a_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_current_a_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_current_a(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output power p feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_power_pPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_power_p_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_power_p_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_power_p(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output power q feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_power_qPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_power_q_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_power_q_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_power_q(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output impedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_impedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_impedance_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_currentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_current_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_output_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_output_power_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Output_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoad_classPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_load_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_load_class_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Load_class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Areal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_A_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_A_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_A_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_A_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Breal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_B_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_B_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_B_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_B_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Creal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_C_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_C_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_C_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_C_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Areac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_A_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_A_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_A_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_A_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Breac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_B_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_B_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_B_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_B_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant power Creac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_power_C_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_power_C_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_power_C_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_power_C_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Areal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_A_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_A_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_A_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_A_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Breal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_B_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_B_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_B_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_B_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Creal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_C_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_C_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_C_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_C_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Areac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_A_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_A_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_A_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_A_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Breac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_B_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_B_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_B_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_B_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant current Creac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_current_C_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_current_C_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_current_C_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_current_C_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Areal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_A_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_A_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_A_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_A_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Breal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_B_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_B_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_B_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_B_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Creal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_C_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_C_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_C_real_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_C_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Areac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_A_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_A_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_A_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_A_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Breac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_B_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_B_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_B_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_B_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constant impedance Creac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstant_impedance_C_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_constant_impedance_C_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_constant_impedance_C_reac_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Constant_impedance_C_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_measured_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_measured_voltage_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Measured_voltage_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_measured_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_measured_voltage_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Measured_voltage_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_measured_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_measured_voltage_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Measured_voltage_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage AB feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_ABPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_measured_voltage_AB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_measured_voltage_AB_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Measured_voltage_AB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage BC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_BCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_measured_voltage_BC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_measured_voltage_BC_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Measured_voltage_BC(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage CA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_CAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Pqload_measured_voltage_CA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_measured_voltage_CA_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Measured_voltage_CA(),
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
				 getString("_UI_Pqload_bustype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_bustype_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Bustype(),
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
				 getString("_UI_Pqload_busflags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_busflags_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Busflags(),
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
				 getString("_UI_Pqload_reference_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_reference_bus_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Reference_bus(),
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
				 getString("_UI_Pqload_maximum_voltage_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_maximum_voltage_error_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Maximum_voltage_error(),
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
				 getString("_UI_Pqload_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_voltage_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Voltage_A(),
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
				 getString("_UI_Pqload_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_voltage_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Voltage_B(),
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
				 getString("_UI_Pqload_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_voltage_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Voltage_C(),
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
				 getString("_UI_Pqload_voltage_AB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_voltage_AB_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Voltage_AB(),
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
				 getString("_UI_Pqload_voltage_BC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_voltage_BC_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Voltage_BC(),
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
				 getString("_UI_Pqload_voltage_CA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_voltage_CA_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Voltage_CA(),
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
				 getString("_UI_Pqload_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_current_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Current_A(),
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
				 getString("_UI_Pqload_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_current_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Current_B(),
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
				 getString("_UI_Pqload_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_current_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Current_C(),
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
				 getString("_UI_Pqload_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_power_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Power_A(),
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
				 getString("_UI_Pqload_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_power_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Power_B(),
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
				 getString("_UI_Pqload_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_power_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Power_C(),
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
				 getString("_UI_Pqload_shunt_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_shunt_A_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Shunt_A(),
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
				 getString("_UI_Pqload_shunt_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_shunt_B_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Shunt_B(),
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
				 getString("_UI_Pqload_shunt_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_shunt_C_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Shunt_C(),
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
				 getString("_UI_Pqload_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_phases_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Phases(),
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
				 getString("_UI_Pqload_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Pqload_nominal_voltage_feature", "_UI_Pqload_type"),
				 VisGridPackage.eINSTANCE.getPqload_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Pqload.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Pqload"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pqload)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Pqload_type") :
			getString("_UI_Pqload_type") + " " + label;
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

		switch (notification.getFeatureID(Pqload.class)) {
			case VisGridPackage.PQLOAD__WEATHER:
			case VisGridPackage.PQLOAD__TNOMINAL:
			case VisGridPackage.PQLOAD__ZP_T:
			case VisGridPackage.PQLOAD__ZP_H:
			case VisGridPackage.PQLOAD__ZP_S:
			case VisGridPackage.PQLOAD__ZP_W:
			case VisGridPackage.PQLOAD__ZP_R:
			case VisGridPackage.PQLOAD__ZP:
			case VisGridPackage.PQLOAD__ZQ_T:
			case VisGridPackage.PQLOAD__ZQ_H:
			case VisGridPackage.PQLOAD__ZQ_S:
			case VisGridPackage.PQLOAD__ZQ_W:
			case VisGridPackage.PQLOAD__ZQ_R:
			case VisGridPackage.PQLOAD__ZQ:
			case VisGridPackage.PQLOAD__IM_T:
			case VisGridPackage.PQLOAD__IM_H:
			case VisGridPackage.PQLOAD__IM_S:
			case VisGridPackage.PQLOAD__IM_W:
			case VisGridPackage.PQLOAD__IM_R:
			case VisGridPackage.PQLOAD__IM:
			case VisGridPackage.PQLOAD__IA_T:
			case VisGridPackage.PQLOAD__IA_H:
			case VisGridPackage.PQLOAD__IA_S:
			case VisGridPackage.PQLOAD__IA_W:
			case VisGridPackage.PQLOAD__IA_R:
			case VisGridPackage.PQLOAD__IA:
			case VisGridPackage.PQLOAD__PP_T:
			case VisGridPackage.PQLOAD__PP_H:
			case VisGridPackage.PQLOAD__PP_S:
			case VisGridPackage.PQLOAD__PP_W:
			case VisGridPackage.PQLOAD__PP_R:
			case VisGridPackage.PQLOAD__PP:
			case VisGridPackage.PQLOAD__PQ_T:
			case VisGridPackage.PQLOAD__PQ_H:
			case VisGridPackage.PQLOAD__PQ_S:
			case VisGridPackage.PQLOAD__PQ_W:
			case VisGridPackage.PQLOAD__PQ_R:
			case VisGridPackage.PQLOAD__PQ:
			case VisGridPackage.PQLOAD__INPUT_TEMP:
			case VisGridPackage.PQLOAD__INPUT_HUMID:
			case VisGridPackage.PQLOAD__INPUT_SOLAR:
			case VisGridPackage.PQLOAD__INPUT_WIND:
			case VisGridPackage.PQLOAD__INPUT_RAIN:
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_P:
			case VisGridPackage.PQLOAD__OUTPUT_IMPED_Q:
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_M:
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT_A:
			case VisGridPackage.PQLOAD__OUTPUT_POWER_P:
			case VisGridPackage.PQLOAD__OUTPUT_POWER_Q:
			case VisGridPackage.PQLOAD__OUTPUT_IMPEDANCE:
			case VisGridPackage.PQLOAD__OUTPUT_CURRENT:
			case VisGridPackage.PQLOAD__OUTPUT_POWER:
			case VisGridPackage.PQLOAD__LOAD_CLASS:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_A:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_B:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_C:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAL:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAL:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAL:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_AREAC:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_BREAC:
			case VisGridPackage.PQLOAD__CONSTANT_POWER_CREAC:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_A:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_B:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_C:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAL:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAL:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAL:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_AREAC:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_BREAC:
			case VisGridPackage.PQLOAD__CONSTANT_CURRENT_CREAC:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_A:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_B:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_C:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAL:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAL:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAL:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_AREAC:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_BREAC:
			case VisGridPackage.PQLOAD__CONSTANT_IMPEDANCE_CREAC:
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_A:
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_B:
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_C:
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_AB:
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_BC:
			case VisGridPackage.PQLOAD__MEASURED_VOLTAGE_CA:
			case VisGridPackage.PQLOAD__BUSTYPE:
			case VisGridPackage.PQLOAD__BUSFLAGS:
			case VisGridPackage.PQLOAD__REFERENCE_BUS:
			case VisGridPackage.PQLOAD__MAXIMUM_VOLTAGE_ERROR:
			case VisGridPackage.PQLOAD__VOLTAGE_A:
			case VisGridPackage.PQLOAD__VOLTAGE_B:
			case VisGridPackage.PQLOAD__VOLTAGE_C:
			case VisGridPackage.PQLOAD__VOLTAGE_AB:
			case VisGridPackage.PQLOAD__VOLTAGE_BC:
			case VisGridPackage.PQLOAD__VOLTAGE_CA:
			case VisGridPackage.PQLOAD__CURRENT_A:
			case VisGridPackage.PQLOAD__CURRENT_B:
			case VisGridPackage.PQLOAD__CURRENT_C:
			case VisGridPackage.PQLOAD__POWER_A:
			case VisGridPackage.PQLOAD__POWER_B:
			case VisGridPackage.PQLOAD__POWER_C:
			case VisGridPackage.PQLOAD__SHUNT_A:
			case VisGridPackage.PQLOAD__SHUNT_B:
			case VisGridPackage.PQLOAD__SHUNT_C:
			case VisGridPackage.PQLOAD__PHASES:
			case VisGridPackage.PQLOAD__NOMINAL_VOLTAGE:
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
