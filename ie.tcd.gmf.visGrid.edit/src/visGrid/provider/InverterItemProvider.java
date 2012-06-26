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

import visGrid.Inverter;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Inverter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InverterItemProvider
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
	public InverterItemProvider(AdapterFactory adapterFactory) {
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
			addInverter_typePropertyDescriptor(object);
			addGenerator_statusPropertyDescriptor(object);
			addGenerator_modePropertyDescriptor(object);
			addV_InPropertyDescriptor(object);
			addI_InPropertyDescriptor(object);
			addVA_InPropertyDescriptor(object);
			addVdcPropertyDescriptor(object);
			addPhaseA_V_OutPropertyDescriptor(object);
			addPhaseB_V_OutPropertyDescriptor(object);
			addPhaseC_V_OutPropertyDescriptor(object);
			addPhaseA_I_OutPropertyDescriptor(object);
			addPhaseB_I_OutPropertyDescriptor(object);
			addPhaseC_I_OutPropertyDescriptor(object);
			addPower_APropertyDescriptor(object);
			addPower_BPropertyDescriptor(object);
			addPower_CPropertyDescriptor(object);
			addP_OutPropertyDescriptor(object);
			addQ_OutPropertyDescriptor(object);
			addPower_factorPropertyDescriptor(object);
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
				 getString("_UI_Inverter_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_Connection_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Connection(),
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
				 getString("_UI_Inverter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_name_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverter type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverter_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Inverter_inverter_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_inverter_type_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Inverter_type(),
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
				 getString("_UI_Inverter_generator_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_generator_status_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Generator_status(),
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
				 getString("_UI_Inverter_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_generator_mode_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Generator_mode(),
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
				 getString("_UI_Inverter_V_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_V_In_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_V_In(),
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
				 getString("_UI_Inverter_I_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_I_In_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_I_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the VA In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVA_InPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Inverter_VA_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_VA_In_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_VA_In(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vdc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVdcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Inverter_Vdc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_Vdc_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Vdc(),
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
				 getString("_UI_Inverter_phaseA_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phaseA_V_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_PhaseA_V_Out(),
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
				 getString("_UI_Inverter_phaseB_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phaseB_V_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_PhaseB_V_Out(),
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
				 getString("_UI_Inverter_phaseC_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phaseC_V_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_PhaseC_V_Out(),
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
				 getString("_UI_Inverter_phaseA_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phaseA_I_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_PhaseA_I_Out(),
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
				 getString("_UI_Inverter_phaseB_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phaseB_I_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_PhaseB_I_Out(),
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
				 getString("_UI_Inverter_phaseC_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phaseC_I_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_PhaseC_I_Out(),
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
				 getString("_UI_Inverter_power_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_power_A_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Power_A(),
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
				 getString("_UI_Inverter_power_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_power_B_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Power_B(),
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
				 getString("_UI_Inverter_power_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_power_C_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Power_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the POut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addP_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Inverter_P_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_P_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_P_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the QOut feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQ_OutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Inverter_Q_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_Q_Out_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Q_Out(),
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
				 getString("_UI_Inverter_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_power_factor_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Power_factor(),
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
				 getString("_UI_Inverter_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Inverter_phases_feature", "_UI_Inverter_type"),
				 VisGridPackage.eINSTANCE.getInverter_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Inverter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Inverter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Inverter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Inverter_type") :
			getString("_UI_Inverter_type") + " " + label;
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

		switch (notification.getFeatureID(Inverter.class)) {
			case VisGridPackage.INVERTER__NAME:
			case VisGridPackage.INVERTER__INVERTER_TYPE:
			case VisGridPackage.INVERTER__GENERATOR_STATUS:
			case VisGridPackage.INVERTER__GENERATOR_MODE:
			case VisGridPackage.INVERTER__VIN:
			case VisGridPackage.INVERTER__IIN:
			case VisGridPackage.INVERTER__VA_IN:
			case VisGridPackage.INVERTER__VDC:
			case VisGridPackage.INVERTER__PHASE_AVOUT:
			case VisGridPackage.INVERTER__PHASE_BVOUT:
			case VisGridPackage.INVERTER__PHASE_CVOUT:
			case VisGridPackage.INVERTER__PHASE_AIOUT:
			case VisGridPackage.INVERTER__PHASE_BIOUT:
			case VisGridPackage.INVERTER__PHASE_CIOUT:
			case VisGridPackage.INVERTER__POWER_A:
			case VisGridPackage.INVERTER__POWER_B:
			case VisGridPackage.INVERTER__POWER_C:
			case VisGridPackage.INVERTER__POUT:
			case VisGridPackage.INVERTER__QOUT:
			case VisGridPackage.INVERTER__POWER_FACTOR:
			case VisGridPackage.INVERTER__PHASES:
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
