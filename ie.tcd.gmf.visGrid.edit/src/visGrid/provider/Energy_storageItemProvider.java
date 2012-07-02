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

import visGrid.Energy_storage;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Energy_storage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Energy_storageItemProvider
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
	public Energy_storageItemProvider(AdapterFactory adapterFactory) {
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

			addGenerator_modePropertyDescriptor(object);
			addGenerator_statusPropertyDescriptor(object);
			addPower_typePropertyDescriptor(object);
			addRinternalPropertyDescriptor(object);
			addV_MaxPropertyDescriptor(object);
			addI_MaxPropertyDescriptor(object);
			addE_MaxPropertyDescriptor(object);
			addEnergyPropertyDescriptor(object);
			addEfficiencyPropertyDescriptor(object);
			addRated_kVAPropertyDescriptor(object);
			addV_OutPropertyDescriptor(object);
			addI_OutPropertyDescriptor(object);
			addVA_OutPropertyDescriptor(object);
			addV_InPropertyDescriptor(object);
			addI_InPropertyDescriptor(object);
			addV_InternalPropertyDescriptor(object);
			addI_InternalPropertyDescriptor(object);
			addI_PrevPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Generator mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerator_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_generator_mode_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Generator_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerator_statusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_generator_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_generator_status_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Generator_status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_power_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_power_type_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Power_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rinternal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRinternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_Rinternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_Rinternal_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Rinternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VMax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_V_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_V_Max_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_V_Max(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IMax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_I_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_I_Max_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_I_Max(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EMax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_E_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_E_Max_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_E_Max(),
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
				 getString("_UI_Energy_storage_Energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_Energy_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Efficiency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfficiencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_efficiency_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Efficiency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated kVA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_kVAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_Rated_kVA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_Rated_kVA_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Rated_kVA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_V_Out_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_V_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_I_Out_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_I_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VA Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVA_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_VA_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_VA_Out_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_VA_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_V_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_V_In_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_V_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IIn feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_I_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_I_In_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_I_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VInternal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addV_InternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_V_Internal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_V_Internal_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_V_Internal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IInternal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI_InternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_I_Internal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_I_Internal_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_I_Internal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IPrev feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addI_PrevPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Energy_storage_I_Prev_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_I_Prev_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_I_Prev(),
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
				 getString("_UI_Energy_storage_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Energy_storage_phases_feature", "_UI_Energy_storage_type"),
				 VisGridPackage.eINSTANCE.getEnergy_storage_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Energy_storage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Energy_storage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Energy_storage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Energy_storage_type") :
			getString("_UI_Energy_storage_type") + " " + label;
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

		switch (notification.getFeatureID(Energy_storage.class)) {
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_MODE:
			case VisGridPackage.ENERGY_STORAGE__GENERATOR_STATUS:
			case VisGridPackage.ENERGY_STORAGE__POWER_TYPE:
			case VisGridPackage.ENERGY_STORAGE__RINTERNAL:
			case VisGridPackage.ENERGY_STORAGE__VMAX:
			case VisGridPackage.ENERGY_STORAGE__IMAX:
			case VisGridPackage.ENERGY_STORAGE__EMAX:
			case VisGridPackage.ENERGY_STORAGE__ENERGY:
			case VisGridPackage.ENERGY_STORAGE__EFFICIENCY:
			case VisGridPackage.ENERGY_STORAGE__RATED_KVA:
			case VisGridPackage.ENERGY_STORAGE__VOUT:
			case VisGridPackage.ENERGY_STORAGE__IOUT:
			case VisGridPackage.ENERGY_STORAGE__VA_OUT:
			case VisGridPackage.ENERGY_STORAGE__VIN:
			case VisGridPackage.ENERGY_STORAGE__IIN:
			case VisGridPackage.ENERGY_STORAGE__VINTERNAL:
			case VisGridPackage.ENERGY_STORAGE__IINTERNAL:
			case VisGridPackage.ENERGY_STORAGE__IPREV:
			case VisGridPackage.ENERGY_STORAGE__PHASES:
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
