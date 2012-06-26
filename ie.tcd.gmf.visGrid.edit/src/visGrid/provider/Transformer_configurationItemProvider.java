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

import visGrid.Transformer_configuration;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Transformer_configuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Transformer_configurationItemProvider
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
	public Transformer_configurationItemProvider(AdapterFactory adapterFactory) {
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
			addConnect_typePropertyDescriptor(object);
			addInstall_typePropertyDescriptor(object);
			addPrimary_voltagePropertyDescriptor(object);
			addSecondary_voltagePropertyDescriptor(object);
			addPower_ratingPropertyDescriptor(object);
			addPowerA_ratingPropertyDescriptor(object);
			addPowerB_ratingPropertyDescriptor(object);
			addPowerC_ratingPropertyDescriptor(object);
			addResistancePropertyDescriptor(object);
			addReactancePropertyDescriptor(object);
			addImpedancePropertyDescriptor(object);
			addResistance1PropertyDescriptor(object);
			addReactance1PropertyDescriptor(object);
			addImpedance1PropertyDescriptor(object);
			addResistance2PropertyDescriptor(object);
			addReactance2PropertyDescriptor(object);
			addImpedance2PropertyDescriptor(object);
			addShunt_resistancePropertyDescriptor(object);
			addShunt_reactancePropertyDescriptor(object);
			addShunt_impedancePropertyDescriptor(object);
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
				 getString("_UI_Transformer_configuration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_name_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Name(),
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
				 getString("_UI_Transformer_configuration_connect_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_connect_type_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Connect_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Install type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstall_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_install_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_install_type_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Install_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimary_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_primary_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_primary_voltage_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Primary_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secondary voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondary_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_secondary_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_secondary_voltage_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Secondary_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power rating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_ratingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_power_rating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_power_rating_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Power_rating(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Arating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerA_ratingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_powerA_rating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_powerA_rating_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_PowerA_rating(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Brating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerB_ratingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_powerB_rating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_powerB_rating_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_PowerB_rating(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Crating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerC_ratingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_powerC_rating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_powerC_rating_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_PowerC_rating(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_resistance_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reactance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReactancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_reactance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_reactance_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Reactance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_impedance_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resistance1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistance1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_resistance1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_resistance1_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Resistance1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reactance1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReactance1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_reactance1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_reactance1_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Reactance1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_impedance1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_impedance1_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Impedance1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resistance2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResistance2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_resistance2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_resistance2_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Resistance2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reactance2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReactance2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_reactance2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_reactance2_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Reactance2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_impedance2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_impedance2_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Impedance2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_shunt_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_shunt_resistance_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Shunt_resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt reactance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_reactancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_shunt_reactance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_shunt_reactance_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Shunt_reactance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt impedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_impedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transformer_configuration_shunt_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transformer_configuration_shunt_impedance_feature", "_UI_Transformer_configuration_type"),
				 VisGridPackage.eINSTANCE.getTransformer_configuration_Shunt_impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Transformer_configuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transformer_configuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transformer_configuration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Transformer_configuration_type") :
			getString("_UI_Transformer_configuration_type") + " " + label;
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

		switch (notification.getFeatureID(Transformer_configuration.class)) {
			case VisGridPackage.TRANSFORMER_CONFIGURATION__NAME:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__CONNECT_TYPE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__INSTALL_TYPE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__PRIMARY_VOLTAGE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SECONDARY_VOLTAGE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_RATING:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_ARATING:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_BRATING:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__POWER_CRATING:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE1:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE1:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE1:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__RESISTANCE2:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__REACTANCE2:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__IMPEDANCE2:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_RESISTANCE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_REACTANCE:
			case VisGridPackage.TRANSFORMER_CONFIGURATION__SHUNT_IMPEDANCE:
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
