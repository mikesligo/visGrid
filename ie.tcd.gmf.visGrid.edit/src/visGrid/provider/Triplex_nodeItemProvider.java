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

import visGrid.Triplex_node;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Triplex_node} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Triplex_nodeItemProvider
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
	public Triplex_nodeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Triplex_node_bustype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_bustype_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Bustype(),
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
				 getString("_UI_Triplex_node_busflags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_busflags_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Busflags(),
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
				 getString("_UI_Triplex_node_reference_bus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_reference_bus_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Reference_bus(),
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
				 getString("_UI_Triplex_node_maximum_voltage_error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_maximum_voltage_error_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Maximum_voltage_error(),
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
				 getString("_UI_Triplex_node_voltage_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_voltage_1_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Voltage_1(),
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
				 getString("_UI_Triplex_node_voltage_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_voltage_2_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Voltage_2(),
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
				 getString("_UI_Triplex_node_voltage_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_voltage_N_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Voltage_N(),
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
				 getString("_UI_Triplex_node_voltage_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_voltage_12_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Voltage_12(),
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
				 getString("_UI_Triplex_node_voltage_1N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_voltage_1N_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Voltage_1N(),
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
				 getString("_UI_Triplex_node_voltage_2N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_voltage_2N_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Voltage_2N(),
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
				 getString("_UI_Triplex_node_current_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_1_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_1(),
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
				 getString("_UI_Triplex_node_current_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_2_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_2(),
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
				 getString("_UI_Triplex_node_current_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_N_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_N(),
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
				 getString("_UI_Triplex_node_current_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_1_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_1_real(),
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
				 getString("_UI_Triplex_node_current_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_2_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_2_real(),
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
				 getString("_UI_Triplex_node_current_N_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_N_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_N_real(),
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
				 getString("_UI_Triplex_node_current_1_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_1_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_1_reac(),
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
				 getString("_UI_Triplex_node_current_2_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_2_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_2_reac(),
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
				 getString("_UI_Triplex_node_current_N_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_N_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_N_reac(),
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
				 getString("_UI_Triplex_node_current_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_12_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_12(),
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
				 getString("_UI_Triplex_node_current_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_12_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_12_real(),
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
				 getString("_UI_Triplex_node_current_12_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_current_12_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Current_12_reac(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_1_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_1(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_2_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_2(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_12_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_12(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_1_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_1_real(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_1_imag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_1_imag_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_1_imag(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_2_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_2_real(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_2_imag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_2_imag_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_2_imag(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_12_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_12_real(),
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
				 getString("_UI_Triplex_node_residential_nominal_current_12_imag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_residential_nominal_current_12_imag_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Residential_nominal_current_12_imag(),
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
				 getString("_UI_Triplex_node_power_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_1_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_1(),
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
				 getString("_UI_Triplex_node_power_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_2_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_2(),
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
				 getString("_UI_Triplex_node_power_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_12_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_12(),
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
				 getString("_UI_Triplex_node_power_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_1_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_1_real(),
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
				 getString("_UI_Triplex_node_power_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_2_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_2_real(),
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
				 getString("_UI_Triplex_node_power_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_12_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_12_real(),
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
				 getString("_UI_Triplex_node_power_1_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_1_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_1_reac(),
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
				 getString("_UI_Triplex_node_power_2_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_2_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_2_reac(),
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
				 getString("_UI_Triplex_node_power_12_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_power_12_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Power_12_reac(),
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
				 getString("_UI_Triplex_node_shunt_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_shunt_1_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Shunt_1(),
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
				 getString("_UI_Triplex_node_shunt_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_shunt_2_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Shunt_2(),
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
				 getString("_UI_Triplex_node_shunt_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_shunt_12_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Shunt_12(),
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
				 getString("_UI_Triplex_node_impedance_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_1_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_1(),
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
				 getString("_UI_Triplex_node_impedance_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_2_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_2(),
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
				 getString("_UI_Triplex_node_impedance_12_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_12_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_12(),
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
				 getString("_UI_Triplex_node_impedance_1_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_1_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_1_real(),
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
				 getString("_UI_Triplex_node_impedance_2_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_2_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_2_real(),
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
				 getString("_UI_Triplex_node_impedance_12_real_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_12_real_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_12_real(),
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
				 getString("_UI_Triplex_node_impedance_1_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_1_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_1_reac(),
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
				 getString("_UI_Triplex_node_impedance_2_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_2_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_2_reac(),
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
				 getString("_UI_Triplex_node_impedance_12_reac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_impedance_12_reac_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Impedance_12_reac(),
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
				 getString("_UI_Triplex_node_house_present_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_house_present_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_House_present(),
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
				 getString("_UI_Triplex_node_NR_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_NR_mode_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_NR_mode(),
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
				 getString("_UI_Triplex_node_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_phases_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Phases(),
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
				 getString("_UI_Triplex_node_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_node_nominal_voltage_feature", "_UI_Triplex_node_type"),
				 VisGridPackage.eINSTANCE.getTriplex_node_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Triplex_node.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Triplex_node"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Triplex_node)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Triplex_node_type") :
			getString("_UI_Triplex_node_type") + " " + label;
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

		switch (notification.getFeatureID(Triplex_node.class)) {
			case VisGridPackage.TRIPLEX_NODE__BUSTYPE:
			case VisGridPackage.TRIPLEX_NODE__BUSFLAGS:
			case VisGridPackage.TRIPLEX_NODE__REFERENCE_BUS:
			case VisGridPackage.TRIPLEX_NODE__MAXIMUM_VOLTAGE_ERROR:
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1:
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2:
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_N:
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_12:
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_1N:
			case VisGridPackage.TRIPLEX_NODE__VOLTAGE_2N:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_N:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAL:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAL:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAL:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_1REAC:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_2REAC:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_NREAC:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAL:
			case VisGridPackage.TRIPLEX_NODE__CURRENT_12_REAC:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1REAL:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_1IMAG:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2REAL:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_2IMAG:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_REAL:
			case VisGridPackage.TRIPLEX_NODE__RESIDENTIAL_NOMINAL_CURRENT_12_IMAG:
			case VisGridPackage.TRIPLEX_NODE__POWER_1:
			case VisGridPackage.TRIPLEX_NODE__POWER_2:
			case VisGridPackage.TRIPLEX_NODE__POWER_12:
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAL:
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAL:
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAL:
			case VisGridPackage.TRIPLEX_NODE__POWER_1REAC:
			case VisGridPackage.TRIPLEX_NODE__POWER_2REAC:
			case VisGridPackage.TRIPLEX_NODE__POWER_12_REAC:
			case VisGridPackage.TRIPLEX_NODE__SHUNT_1:
			case VisGridPackage.TRIPLEX_NODE__SHUNT_2:
			case VisGridPackage.TRIPLEX_NODE__SHUNT_12:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAL:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAL:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAL:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_1REAC:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_2REAC:
			case VisGridPackage.TRIPLEX_NODE__IMPEDANCE_12_REAC:
			case VisGridPackage.TRIPLEX_NODE__HOUSE_PRESENT:
			case VisGridPackage.TRIPLEX_NODE__NR_MODE:
			case VisGridPackage.TRIPLEX_NODE__PHASES:
			case VisGridPackage.TRIPLEX_NODE__NOMINAL_VOLTAGE:
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
