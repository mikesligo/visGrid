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

import visGrid.Diesel_dg;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Diesel_dg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Diesel_dgItemProvider
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
	public Diesel_dgItemProvider(AdapterFactory adapterFactory) {
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
			addGen_modePropertyDescriptor(object);
			addGen_statusPropertyDescriptor(object);
			addRated_kVAPropertyDescriptor(object);
			addRated_kVPropertyDescriptor(object);
			addRsPropertyDescriptor(object);
			addXsPropertyDescriptor(object);
			addRgPropertyDescriptor(object);
			addXgPropertyDescriptor(object);
			addVoltage_APropertyDescriptor(object);
			addVoltage_BPropertyDescriptor(object);
			addVoltage_CPropertyDescriptor(object);
			addCurrent_APropertyDescriptor(object);
			addCurrent_BPropertyDescriptor(object);
			addCurrent_CPropertyDescriptor(object);
			addEfAPropertyDescriptor(object);
			addEfBPropertyDescriptor(object);
			addEfCPropertyDescriptor(object);
			addPower_APropertyDescriptor(object);
			addPower_BPropertyDescriptor(object);
			addPower_CPropertyDescriptor(object);
			addPower_A_schPropertyDescriptor(object);
			addPower_B_schPropertyDescriptor(object);
			addPower_C_schPropertyDescriptor(object);
			addEfA_schPropertyDescriptor(object);
			addEfB_schPropertyDescriptor(object);
			addEfC_schPropertyDescriptor(object);
			addSlackBusPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
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
				 getString("_UI_Diesel_dg_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Connection_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Connection(),
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
				 getString("_UI_Diesel_dg_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_name_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGen_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Gen_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Gen_mode_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Gen_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGen_statusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Gen_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Gen_status_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Gen_status(),
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
				 getString("_UI_Diesel_dg_Rated_kVA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Rated_kVA_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Rated_kVA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated kV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_kVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Rated_kV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Rated_kV_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Rated_kV(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Rs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Rs_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Rs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Xs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Xs_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Xs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Rg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Rg_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Rg(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_Xg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_Xg_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Xg(),
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
				 getString("_UI_Diesel_dg_voltage_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_voltage_A_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Voltage_A(),
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
				 getString("_UI_Diesel_dg_voltage_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_voltage_B_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Voltage_B(),
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
				 getString("_UI_Diesel_dg_voltage_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_voltage_C_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Voltage_C(),
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
				 getString("_UI_Diesel_dg_current_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_current_A_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Current_A(),
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
				 getString("_UI_Diesel_dg_current_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_current_B_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Current_B(),
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
				 getString("_UI_Diesel_dg_current_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_current_C_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Current_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_EfA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_EfA_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_EfA(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_EfB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_EfB_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_EfB(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_EfC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_EfC_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_EfC(),
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
				 getString("_UI_Diesel_dg_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_power_A_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Power_A(),
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
				 getString("_UI_Diesel_dg_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_power_B_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Power_B(),
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
				 getString("_UI_Diesel_dg_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_power_C_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Power_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Asch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_A_schPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_power_A_sch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_power_A_sch_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Power_A_sch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Bsch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_B_schPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_power_B_sch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_power_B_sch_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Power_B_sch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Csch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_C_schPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_power_C_sch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_power_C_sch_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Power_C_sch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef Asch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfA_schPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_EfA_sch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_EfA_sch_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_EfA_sch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef Bsch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfB_schPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_EfB_sch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_EfB_sch_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_EfB_sch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ef Csch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEfC_schPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_EfC_sch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_EfC_sch_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_EfC_sch(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slack Bus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlackBusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diesel_dg_SlackBus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_SlackBus_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_SlackBus(),
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
				 getString("_UI_Diesel_dg_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diesel_dg_phases_feature", "_UI_Diesel_dg_type"),
				 VisGridPackage.eINSTANCE.getDiesel_dg_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Diesel_dg.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Diesel_dg"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Diesel_dg)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Diesel_dg_type") :
			getString("_UI_Diesel_dg_type") + " " + label;
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

		switch (notification.getFeatureID(Diesel_dg.class)) {
			case VisGridPackage.DIESEL_DG__NAME:
			case VisGridPackage.DIESEL_DG__GEN_MODE:
			case VisGridPackage.DIESEL_DG__GEN_STATUS:
			case VisGridPackage.DIESEL_DG__RATED_KVA:
			case VisGridPackage.DIESEL_DG__RATED_KV:
			case VisGridPackage.DIESEL_DG__RS:
			case VisGridPackage.DIESEL_DG__XS:
			case VisGridPackage.DIESEL_DG__RG:
			case VisGridPackage.DIESEL_DG__XG:
			case VisGridPackage.DIESEL_DG__VOLTAGE_A:
			case VisGridPackage.DIESEL_DG__VOLTAGE_B:
			case VisGridPackage.DIESEL_DG__VOLTAGE_C:
			case VisGridPackage.DIESEL_DG__CURRENT_A:
			case VisGridPackage.DIESEL_DG__CURRENT_B:
			case VisGridPackage.DIESEL_DG__CURRENT_C:
			case VisGridPackage.DIESEL_DG__EF_A:
			case VisGridPackage.DIESEL_DG__EF_B:
			case VisGridPackage.DIESEL_DG__EF_C:
			case VisGridPackage.DIESEL_DG__POWER_A:
			case VisGridPackage.DIESEL_DG__POWER_B:
			case VisGridPackage.DIESEL_DG__POWER_C:
			case VisGridPackage.DIESEL_DG__POWER_ASCH:
			case VisGridPackage.DIESEL_DG__POWER_BSCH:
			case VisGridPackage.DIESEL_DG__POWER_CSCH:
			case VisGridPackage.DIESEL_DG__EF_ASCH:
			case VisGridPackage.DIESEL_DG__EF_BSCH:
			case VisGridPackage.DIESEL_DG__EF_CSCH:
			case VisGridPackage.DIESEL_DG__SLACK_BUS:
			case VisGridPackage.DIESEL_DG__PHASES:
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
