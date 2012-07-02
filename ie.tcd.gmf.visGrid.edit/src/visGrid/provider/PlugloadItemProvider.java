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

import visGrid.Plugload;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Plugload} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlugloadItemProvider
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
	public PlugloadItemProvider(AdapterFactory adapterFactory) {
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

			addCircuit_splitPropertyDescriptor(object);
			addDemandPropertyDescriptor(object);
			addInstalled_powerPropertyDescriptor(object);
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
				 getString("_UI_Plugload_circuit_split_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_circuit_split_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Circuit_split(),
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
				 getString("_UI_Plugload_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_demand_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Installed power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstalled_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plugload_installed_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_installed_power_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Installed_power(),
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
				 getString("_UI_Plugload_shape_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_shape_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Shape(),
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
				 getString("_UI_Plugload_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_load_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Load(),
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
				 getString("_UI_Plugload_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_energy_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Energy(),
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
				 getString("_UI_Plugload_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_power_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Power(),
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
				 getString("_UI_Plugload_peak_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_peak_demand_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Peak_demand(),
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
				 getString("_UI_Plugload_heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_heatgain_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Heatgain(),
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
				 getString("_UI_Plugload_heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_heatgain_fraction_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Heatgain_fraction(),
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
				 getString("_UI_Plugload_current_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_current_fraction_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Current_fraction(),
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
				 getString("_UI_Plugload_impedance_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_impedance_fraction_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Impedance_fraction(),
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
				 getString("_UI_Plugload_power_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_power_fraction_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Power_fraction(),
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
				 getString("_UI_Plugload_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_power_factor_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Power_factor(),
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
				 getString("_UI_Plugload_constant_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_constant_power_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Constant_power(),
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
				 getString("_UI_Plugload_constant_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_constant_current_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Constant_current(),
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
				 getString("_UI_Plugload_constant_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_constant_admittance_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Constant_admittance(),
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
				 getString("_UI_Plugload_voltage_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_voltage_factor_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Voltage_factor(),
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
				 getString("_UI_Plugload_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_configuration_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Configuration(),
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
				 getString("_UI_Plugload_override_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plugload_override_feature", "_UI_Plugload_type"),
				 VisGridPackage.eINSTANCE.getPlugload_Override(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Plugload.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plugload"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Plugload)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Plugload_type") :
			getString("_UI_Plugload_type") + " " + label;
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

		switch (notification.getFeatureID(Plugload.class)) {
			case VisGridPackage.PLUGLOAD__CIRCUIT_SPLIT:
			case VisGridPackage.PLUGLOAD__DEMAND:
			case VisGridPackage.PLUGLOAD__INSTALLED_POWER:
			case VisGridPackage.PLUGLOAD__SHAPE:
			case VisGridPackage.PLUGLOAD__LOAD:
			case VisGridPackage.PLUGLOAD__ENERGY:
			case VisGridPackage.PLUGLOAD__POWER:
			case VisGridPackage.PLUGLOAD__PEAK_DEMAND:
			case VisGridPackage.PLUGLOAD__HEATGAIN:
			case VisGridPackage.PLUGLOAD__HEATGAIN_FRACTION:
			case VisGridPackage.PLUGLOAD__CURRENT_FRACTION:
			case VisGridPackage.PLUGLOAD__IMPEDANCE_FRACTION:
			case VisGridPackage.PLUGLOAD__POWER_FRACTION:
			case VisGridPackage.PLUGLOAD__POWER_FACTOR:
			case VisGridPackage.PLUGLOAD__CONSTANT_POWER:
			case VisGridPackage.PLUGLOAD__CONSTANT_CURRENT:
			case VisGridPackage.PLUGLOAD__CONSTANT_ADMITTANCE:
			case VisGridPackage.PLUGLOAD__VOLTAGE_FACTOR:
			case VisGridPackage.PLUGLOAD__CONFIGURATION:
			case VisGridPackage.PLUGLOAD__OVERRIDE:
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
