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

import visGrid.Triplex_meter;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Triplex_meter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Triplex_meterItemProvider
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
	public Triplex_meterItemProvider(AdapterFactory adapterFactory) {
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
			addMeasured_real_energyPropertyDescriptor(object);
			addMeasured_reactive_energyPropertyDescriptor(object);
			addMeasured_powerPropertyDescriptor(object);
			addIndiv_measured_power_1PropertyDescriptor(object);
			addIndiv_measured_power_2PropertyDescriptor(object);
			addIndiv_measured_power_NPropertyDescriptor(object);
			addMeasured_demandPropertyDescriptor(object);
			addMeasured_real_powerPropertyDescriptor(object);
			addMeasured_reactive_powerPropertyDescriptor(object);
			addMeasured_voltage_1PropertyDescriptor(object);
			addMeasured_voltage_2PropertyDescriptor(object);
			addMeasured_voltage_NPropertyDescriptor(object);
			addMeasured_current_1PropertyDescriptor(object);
			addMeasured_current_2PropertyDescriptor(object);
			addMeasured_current_NPropertyDescriptor(object);
			addMonthly_billPropertyDescriptor(object);
			addPrevious_monthly_billPropertyDescriptor(object);
			addPrevious_monthly_energyPropertyDescriptor(object);
			addMonthly_feePropertyDescriptor(object);
			addMonthly_energyPropertyDescriptor(object);
			addBill_modePropertyDescriptor(object);
			addPower_marketPropertyDescriptor(object);
			addBill_dayPropertyDescriptor(object);
			addPricePropertyDescriptor(object);
			addFirst_tier_pricePropertyDescriptor(object);
			addFirst_tier_energyPropertyDescriptor(object);
			addSecond_tier_pricePropertyDescriptor(object);
			addSecond_tier_energyPropertyDescriptor(object);
			addThird_tier_pricePropertyDescriptor(object);
			addThird_tier_energyPropertyDescriptor(object);
			addBustypePropertyDescriptor(object);
			addBusflagsPropertyDescriptor(object);
			addReference_busPropertyDescriptor(object);
			addMaximum_voltage_errorPropertyDescriptor(object);
			addVoltage_1PropertyDescriptor(object);
			addVoltage_2PropertyDescriptor(object);
			addVoltage_NPropertyDescriptor(object);
			addVoltage_12PropertyDescriptor(object);
			addVoltage_1NPropertyDescriptor(object);
			addVoltage_2NPropertyDescriptor(object);
			addCurrent_1PropertyDescriptor(object);
			addCurrent_2PropertyDescriptor(object);
			addCurrent_NPropertyDescriptor(object);
			addCurrent_1_realPropertyDescriptor(object);
			addCurrent_2_realPropertyDescriptor(object);
			addCurrent_N_realPropertyDescriptor(object);
			addCurrent_1_reacPropertyDescriptor(object);
			addCurrent_2_reacPropertyDescriptor(object);
			addCurrent_N_reacPropertyDescriptor(object);
			addCurrent_12PropertyDescriptor(object);
			addCurrent_12_realPropertyDescriptor(object);
			addCurrent_12_reacPropertyDescriptor(object);
			addResidential_nominal_current_1PropertyDescriptor(object);
			addResidential_nominal_current_2PropertyDescriptor(object);
			addResidential_nominal_current_12PropertyDescriptor(object);
			addResidential_nominal_current_1_realPropertyDescriptor(object);
			addResidential_nominal_current_1_imagPropertyDescriptor(object);
			addResidential_nominal_current_2_realPropertyDescriptor(object);
			addResidential_nominal_current_2_imagPropertyDescriptor(object);
			addResidential_nominal_current_12_realPropertyDescriptor(object);
			addResidential_nominal_current_12_imagPropertyDescriptor(object);
			addPower_1PropertyDescriptor(object);
			addPower_2PropertyDescriptor(object);
			addPower_12PropertyDescriptor(object);
			addPower_1_realPropertyDescriptor(object);
			addPower_2_realPropertyDescriptor(object);
			addPower_12_realPropertyDescriptor(object);
			addPower_1_reacPropertyDescriptor(object);
			addPower_2_reacPropertyDescriptor(object);
			addPower_12_reacPropertyDescriptor(object);
			addShunt_1PropertyDescriptor(object);
			addShunt_2PropertyDescriptor(object);
			addShunt_12PropertyDescriptor(object);
			addImpedance_1PropertyDescriptor(object);
			addImpedance_2PropertyDescriptor(object);
			addImpedance_12PropertyDescriptor(object);
			addImpedance_1_realPropertyDescriptor(object);
			addImpedance_2_realPropertyDescriptor(object);
			addImpedance_12_realPropertyDescriptor(object);
			addImpedance_1_reacPropertyDescriptor(object);
			addImpedance_2_reacPropertyDescriptor(object);
			addImpedance_12_reacPropertyDescriptor(object);
			addHouse_presentPropertyDescriptor(object);
			addNR_modePropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
			addNominal_voltagePropertyDescriptor(object);
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
				 getString("_UI_Triplex_meter_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_Connection_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Connection(),
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
				 getString("_UI_Triplex_meter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_name_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured real energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_real_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_real_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_real_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_real_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured reactive energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_reactive_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_reactive_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_reactive_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_reactive_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_power_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indiv measured power 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndiv_measured_power_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_indiv_measured_power_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_indiv_measured_power_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Indiv_measured_power_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indiv measured power 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndiv_measured_power_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_indiv_measured_power_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_indiv_measured_power_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Indiv_measured_power_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indiv measured power N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndiv_measured_power_NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_indiv_measured_power_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_indiv_measured_power_N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Indiv_measured_power_N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_demand_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured real power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_real_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_real_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_real_power_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_real_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured reactive power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_reactive_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_reactive_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_reactive_power_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_reactive_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_voltage_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_voltage_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_voltage_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_voltage_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_voltage_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_voltage_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured voltage N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_voltage_NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_voltage_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_voltage_N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_voltage_N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured current 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_current_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_current_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_current_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_current_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured current 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_current_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_current_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_current_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_current_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Measured current N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeasured_current_NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_measured_current_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_measured_current_N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Measured_current_N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monthly bill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonthly_billPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_monthly_bill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_monthly_bill_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Monthly_bill(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous monthly bill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrevious_monthly_billPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_previous_monthly_bill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_previous_monthly_bill_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Previous_monthly_bill(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous monthly energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrevious_monthly_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_previous_monthly_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_previous_monthly_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Previous_monthly_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monthly fee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonthly_feePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_monthly_fee_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_monthly_fee_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Monthly_fee(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monthly energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonthly_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_monthly_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_monthly_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Monthly_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bill mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBill_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_bill_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_bill_mode_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Bill_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power market feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_marketPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_market_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_market_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_market(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bill day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBill_dayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_bill_day_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_bill_day_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Bill_day(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_price_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Price(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First tier price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirst_tier_pricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_first_tier_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_first_tier_price_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_First_tier_price(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First tier energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirst_tier_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_first_tier_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_first_tier_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_First_tier_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second tier price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecond_tier_pricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_second_tier_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_second_tier_price_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Second_tier_price(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second tier energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecond_tier_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_second_tier_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_second_tier_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Second_tier_energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Third tier price feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThird_tier_pricePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_third_tier_price_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_third_tier_price_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Third_tier_price(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Third tier energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThird_tier_energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_third_tier_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_third_tier_energy_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Third_tier_energy(),
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
				 getString("_UI_Triplex_meter_bustype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_bustype_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Bustype(),
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
				 getString("_UI_Triplex_meter_busflags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_busflags_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Busflags(),
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
				 getString("_UI_Triplex_meter_reference_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_reference_bus_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Reference_bus(),
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
				 getString("_UI_Triplex_meter_maximum_voltage_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_maximum_voltage_error_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Maximum_voltage_error(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_voltage_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_voltage_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Voltage_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_voltage_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_voltage_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Voltage_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_voltage_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_voltage_N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Voltage_N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage 12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_voltage_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_voltage_12_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Voltage_12(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage 1N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_1NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_voltage_1N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_voltage_1N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Voltage_1N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltage 2N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltage_2NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_voltage_2N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_voltage_2N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Voltage_2N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_N_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 1real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_1_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_1_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_1_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 2real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_2_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_2_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_2_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Nreal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_N_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_N_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_N_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_N_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 1reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_1_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_1_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_1_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_1_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 2reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_2_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_2_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_2_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_2_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Nreac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_N_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_N_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_N_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_N_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_12_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_12(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 12 real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_12_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_12_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_12_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current 12 reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrent_12_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_current_12_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_current_12_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Current_12_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_12_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_12(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 1real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_1_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_1_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_1_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 1imag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_1_imagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_1_imag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_1_imag_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_1_imag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 2real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_2_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_2_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_2_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 2imag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_2_imagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_2_imag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_2_imag_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_2_imag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 12 real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_12_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_12_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_12_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential nominal current 12 imag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_nominal_current_12_imagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_residential_nominal_current_12_imag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_residential_nominal_current_12_imag_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Residential_nominal_current_12_imag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_12_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_12(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 1real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_1_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_1_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_1_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 2real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_2_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_2_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_2_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 12 real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_12_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_12_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_12_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 1reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_1_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_1_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_1_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_1_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 2reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_2_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_2_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_2_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_2_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power 12 reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_12_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_power_12_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_power_12_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Power_12_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_shunt_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_shunt_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Shunt_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_shunt_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_shunt_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Shunt_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shunt 12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShunt_12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_shunt_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_shunt_12_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Shunt_12(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_1_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_2_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 12 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_12PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_12_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_12(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 1real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_1_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_1_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_1_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 2real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_2_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_2_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_2_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 12 real feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_12_realPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_12_real_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_12_real(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 1reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_1_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_1_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_1_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_1_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 2reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_2_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_2_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_2_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_2_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Impedance 12 reac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImpedance_12_reacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_impedance_12_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_impedance_12_reac_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Impedance_12_reac(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the House present feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouse_presentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_house_present_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_house_present_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_House_present(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NR mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNR_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_meter_NR_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_NR_mode_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_NR_mode(),
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
				 getString("_UI_Triplex_meter_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_phases_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Phases(),
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
				 getString("_UI_Triplex_meter_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_meter_nominal_voltage_feature", "_UI_Triplex_meter_type"),
				 VisGridPackage.eINSTANCE.getTriplex_meter_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Triplex_meter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Triplex_meter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Triplex_meter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Triplex_meter_type") :
			getString("_UI_Triplex_meter_type") + " " + label;
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

		switch (notification.getFeatureID(Triplex_meter.class)) {
			case VisGridPackage.TRIPLEX_METER__NAME:
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_ENERGY:
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_ENERGY:
			case VisGridPackage.TRIPLEX_METER__MEASURED_POWER:
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_1:
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_2:
			case VisGridPackage.TRIPLEX_METER__INDIV_MEASURED_POWER_N:
			case VisGridPackage.TRIPLEX_METER__MEASURED_DEMAND:
			case VisGridPackage.TRIPLEX_METER__MEASURED_REAL_POWER:
			case VisGridPackage.TRIPLEX_METER__MEASURED_REACTIVE_POWER:
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_1:
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_2:
			case VisGridPackage.TRIPLEX_METER__MEASURED_VOLTAGE_N:
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_1:
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_2:
			case VisGridPackage.TRIPLEX_METER__MEASURED_CURRENT_N:
			case VisGridPackage.TRIPLEX_METER__MONTHLY_BILL:
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_BILL:
			case VisGridPackage.TRIPLEX_METER__PREVIOUS_MONTHLY_ENERGY:
			case VisGridPackage.TRIPLEX_METER__MONTHLY_FEE:
			case VisGridPackage.TRIPLEX_METER__MONTHLY_ENERGY:
			case VisGridPackage.TRIPLEX_METER__BILL_MODE:
			case VisGridPackage.TRIPLEX_METER__POWER_MARKET:
			case VisGridPackage.TRIPLEX_METER__BILL_DAY:
			case VisGridPackage.TRIPLEX_METER__PRICE:
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_PRICE:
			case VisGridPackage.TRIPLEX_METER__FIRST_TIER_ENERGY:
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_PRICE:
			case VisGridPackage.TRIPLEX_METER__SECOND_TIER_ENERGY:
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_PRICE:
			case VisGridPackage.TRIPLEX_METER__THIRD_TIER_ENERGY:
			case VisGridPackage.TRIPLEX_METER__BUSTYPE:
			case VisGridPackage.TRIPLEX_METER__BUSFLAGS:
			case VisGridPackage.TRIPLEX_METER__REFERENCE_BUS:
			case VisGridPackage.TRIPLEX_METER__MAXIMUM_VOLTAGE_ERROR:
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1:
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2:
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_N:
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_12:
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_1N:
			case VisGridPackage.TRIPLEX_METER__VOLTAGE_2N:
			case VisGridPackage.TRIPLEX_METER__CURRENT_1:
			case VisGridPackage.TRIPLEX_METER__CURRENT_2:
			case VisGridPackage.TRIPLEX_METER__CURRENT_N:
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAL:
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAL:
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAL:
			case VisGridPackage.TRIPLEX_METER__CURRENT_1REAC:
			case VisGridPackage.TRIPLEX_METER__CURRENT_2REAC:
			case VisGridPackage.TRIPLEX_METER__CURRENT_NREAC:
			case VisGridPackage.TRIPLEX_METER__CURRENT_12:
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAL:
			case VisGridPackage.TRIPLEX_METER__CURRENT_12_REAC:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
			case VisGridPackage.TRIPLEX_METER__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
			case VisGridPackage.TRIPLEX_METER__POWER_1:
			case VisGridPackage.TRIPLEX_METER__POWER_2:
			case VisGridPackage.TRIPLEX_METER__POWER_12:
			case VisGridPackage.TRIPLEX_METER__POWER_1REAL:
			case VisGridPackage.TRIPLEX_METER__POWER_2REAL:
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAL:
			case VisGridPackage.TRIPLEX_METER__POWER_1REAC:
			case VisGridPackage.TRIPLEX_METER__POWER_2REAC:
			case VisGridPackage.TRIPLEX_METER__POWER_12_REAC:
			case VisGridPackage.TRIPLEX_METER__SHUNT_1:
			case VisGridPackage.TRIPLEX_METER__SHUNT_2:
			case VisGridPackage.TRIPLEX_METER__SHUNT_12:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAL:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAL:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAL:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_1REAC:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_2REAC:
			case VisGridPackage.TRIPLEX_METER__IMPEDANCE_12_REAC:
			case VisGridPackage.TRIPLEX_METER__HOUSE_PRESENT:
			case VisGridPackage.TRIPLEX_METER__NR_MODE:
			case VisGridPackage.TRIPLEX_METER__PHASES:
			case VisGridPackage.TRIPLEX_METER__NOMINAL_VOLTAGE:
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
