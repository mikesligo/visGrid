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

import visGrid.Microturbine;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Microturbine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroturbineItemProvider
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
	public MicroturbineItemProvider(AdapterFactory adapterFactory) {
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
			addGenerator_modePropertyDescriptor(object);
			addGenerator_statusPropertyDescriptor(object);
			addPower_typePropertyDescriptor(object);
			addRinternalPropertyDescriptor(object);
			addRloadPropertyDescriptor(object);
			addV_MaxPropertyDescriptor(object);
			addI_MaxPropertyDescriptor(object);
			addFrequencyPropertyDescriptor(object);
			addMax_FrequencyPropertyDescriptor(object);
			addMin_FrequencyPropertyDescriptor(object);
			addFuel_UsedPropertyDescriptor(object);
			addHeat_OutPropertyDescriptor(object);
			addKVPropertyDescriptor(object);
			addPower_AnglePropertyDescriptor(object);
			addMax_PPropertyDescriptor(object);
			addMin_PPropertyDescriptor(object);
			addPhaseA_V_OutPropertyDescriptor(object);
			addPhaseB_V_OutPropertyDescriptor(object);
			addPhaseC_V_OutPropertyDescriptor(object);
			addPhaseA_I_OutPropertyDescriptor(object);
			addPhaseB_I_OutPropertyDescriptor(object);
			addPhaseC_I_OutPropertyDescriptor(object);
			addPower_A_OutPropertyDescriptor(object);
			addPower_B_OutPropertyDescriptor(object);
			addPower_C_OutPropertyDescriptor(object);
			addVA_OutPropertyDescriptor(object);
			addPf_OutPropertyDescriptor(object);
			addE_A_InternalPropertyDescriptor(object);
			addE_B_InternalPropertyDescriptor(object);
			addE_C_InternalPropertyDescriptor(object);
			addEfficiencyPropertyDescriptor(object);
			addRated_kVAPropertyDescriptor(object);
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
				 getString("_UI_Microturbine_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Connection_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Connection(),
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
				 getString("_UI_Microturbine_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_name_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Microturbine_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_generator_mode_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Generator_mode(),
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
				 getString("_UI_Microturbine_generator_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_generator_status_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Generator_status(),
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
				 getString("_UI_Microturbine_power_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_power_type_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Power_type(),
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
				 getString("_UI_Microturbine_Rinternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Rinternal_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Rinternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Rload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Rload_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Rload(),
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
				 getString("_UI_Microturbine_V_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_V_Max_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_V_Max(),
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
				 getString("_UI_Microturbine_I_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_I_Max_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_I_Max(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_frequency_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Frequency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_FrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Max_Frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Max_Frequency_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Max_Frequency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_FrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Min_Frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Min_Frequency_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Min_Frequency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fuel Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFuel_UsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Fuel_Used_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Fuel_Used_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Fuel_Used(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heat Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeat_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Heat_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Heat_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Heat_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the KV feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKVPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_KV_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_KV_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_KV(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_AnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Power_Angle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Power_Angle_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Power_Angle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max P feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_PPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Max_P_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Max_P_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Max_P(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min P feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMin_PPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_Min_P_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Min_P_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Min_P(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase AVOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseA_V_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_phaseA_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phaseA_V_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_PhaseA_V_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase BVOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseB_V_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_phaseB_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phaseB_V_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_PhaseB_V_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase CVOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseC_V_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_phaseC_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phaseC_V_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_PhaseC_V_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase AIOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseA_I_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_phaseA_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phaseA_I_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_PhaseA_I_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase BIOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseB_I_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_phaseB_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phaseB_I_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_PhaseB_I_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase CIOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhaseC_I_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_phaseC_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phaseC_I_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_PhaseC_I_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power AOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_A_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_power_A_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_power_A_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Power_A_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power BOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_B_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_power_B_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_power_B_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Power_B_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power COut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_C_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_power_C_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_power_C_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Power_C_Out(),
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
				 getString("_UI_Microturbine_VA_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_VA_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_VA_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pf Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPf_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_pf_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_pf_Out_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Pf_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EAInternal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE_A_InternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_E_A_Internal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_E_A_Internal_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_E_A_Internal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EBInternal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE_B_InternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_E_B_Internal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_E_B_Internal_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_E_B_Internal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ECInternal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addE_C_InternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Microturbine_E_C_Internal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_E_C_Internal_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_E_C_Internal(),
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
				 getString("_UI_Microturbine_efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_efficiency_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Efficiency(),
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
				 getString("_UI_Microturbine_Rated_kVA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_Rated_kVA_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Rated_kVA(),
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
				 getString("_UI_Microturbine_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Microturbine_phases_feature", "_UI_Microturbine_type"),
				 VisGridPackage.eINSTANCE.getMicroturbine_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Microturbine.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Microturbine"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Microturbine)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Microturbine_type") :
			getString("_UI_Microturbine_type") + " " + label;
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

		switch (notification.getFeatureID(Microturbine.class)) {
			case VisGridPackage.MICROTURBINE__NAME:
			case VisGridPackage.MICROTURBINE__GENERATOR_MODE:
			case VisGridPackage.MICROTURBINE__GENERATOR_STATUS:
			case VisGridPackage.MICROTURBINE__POWER_TYPE:
			case VisGridPackage.MICROTURBINE__RINTERNAL:
			case VisGridPackage.MICROTURBINE__RLOAD:
			case VisGridPackage.MICROTURBINE__VMAX:
			case VisGridPackage.MICROTURBINE__IMAX:
			case VisGridPackage.MICROTURBINE__FREQUENCY:
			case VisGridPackage.MICROTURBINE__MAX_FREQUENCY:
			case VisGridPackage.MICROTURBINE__MIN_FREQUENCY:
			case VisGridPackage.MICROTURBINE__FUEL_USED:
			case VisGridPackage.MICROTURBINE__HEAT_OUT:
			case VisGridPackage.MICROTURBINE__KV:
			case VisGridPackage.MICROTURBINE__POWER_ANGLE:
			case VisGridPackage.MICROTURBINE__MAX_P:
			case VisGridPackage.MICROTURBINE__MIN_P:
			case VisGridPackage.MICROTURBINE__PHASE_AVOUT:
			case VisGridPackage.MICROTURBINE__PHASE_BVOUT:
			case VisGridPackage.MICROTURBINE__PHASE_CVOUT:
			case VisGridPackage.MICROTURBINE__PHASE_AIOUT:
			case VisGridPackage.MICROTURBINE__PHASE_BIOUT:
			case VisGridPackage.MICROTURBINE__PHASE_CIOUT:
			case VisGridPackage.MICROTURBINE__POWER_AOUT:
			case VisGridPackage.MICROTURBINE__POWER_BOUT:
			case VisGridPackage.MICROTURBINE__POWER_COUT:
			case VisGridPackage.MICROTURBINE__VA_OUT:
			case VisGridPackage.MICROTURBINE__PF_OUT:
			case VisGridPackage.MICROTURBINE__EAINTERNAL:
			case VisGridPackage.MICROTURBINE__EBINTERNAL:
			case VisGridPackage.MICROTURBINE__ECINTERNAL:
			case VisGridPackage.MICROTURBINE__EFFICIENCY:
			case VisGridPackage.MICROTURBINE__RATED_KVA:
			case VisGridPackage.MICROTURBINE__PHASES:
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
