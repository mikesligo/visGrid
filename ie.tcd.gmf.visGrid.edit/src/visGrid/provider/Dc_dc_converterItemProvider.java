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

import visGrid.Dc_dc_converter;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Dc_dc_converter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Dc_dc_converterItemProvider
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
	public Dc_dc_converterItemProvider(AdapterFactory adapterFactory) {
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
			addDc_dc_converter_typePropertyDescriptor(object);
			addGenerator_modePropertyDescriptor(object);
			addV_OutPropertyDescriptor(object);
			addI_OutPropertyDescriptor(object);
			addVdcPropertyDescriptor(object);
			addVA_OutPropertyDescriptor(object);
			addP_OutPropertyDescriptor(object);
			addQ_OutPropertyDescriptor(object);
			addService_ratioPropertyDescriptor(object);
			addV_InPropertyDescriptor(object);
			addI_InPropertyDescriptor(object);
			addVA_InPropertyDescriptor(object);
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
				 getString("_UI_Dc_dc_converter_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_Connection_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Connection(),
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
				 getString("_UI_Dc_dc_converter_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_name_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dc dc converter type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDc_dc_converter_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dc_dc_converter_dc_dc_converter_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_dc_dc_converter_type_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Dc_dc_converter_type(),
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
				 getString("_UI_Dc_dc_converter_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_generator_mode_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Generator_mode(),
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
				 getString("_UI_Dc_dc_converter_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_V_Out_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_V_Out(),
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
				 getString("_UI_Dc_dc_converter_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_I_Out_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_I_Out(),
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
				 getString("_UI_Dc_dc_converter_Vdc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_Vdc_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Vdc(),
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
				 getString("_UI_Dc_dc_converter_VA_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_VA_Out_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_VA_Out(),
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
				 getString("_UI_Dc_dc_converter_P_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_P_Out_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_P_Out(),
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
				 getString("_UI_Dc_dc_converter_Q_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_Q_Out_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Q_Out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service ratio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addService_ratioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Dc_dc_converter_service_ratio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_service_ratio_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Service_ratio(),
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
				 getString("_UI_Dc_dc_converter_V_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_V_In_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_V_In(),
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
				 getString("_UI_Dc_dc_converter_I_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_I_In_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_I_In(),
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
				 getString("_UI_Dc_dc_converter_VA_In_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_VA_In_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_VA_In(),
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
				 getString("_UI_Dc_dc_converter_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Dc_dc_converter_phases_feature", "_UI_Dc_dc_converter_type"),
				 VisGridPackage.eINSTANCE.getDc_dc_converter_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Dc_dc_converter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Dc_dc_converter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Dc_dc_converter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Dc_dc_converter_type") :
			getString("_UI_Dc_dc_converter_type") + " " + label;
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

		switch (notification.getFeatureID(Dc_dc_converter.class)) {
			case VisGridPackage.DC_DC_CONVERTER__NAME:
			case VisGridPackage.DC_DC_CONVERTER__DC_DC_CONVERTER_TYPE:
			case VisGridPackage.DC_DC_CONVERTER__GENERATOR_MODE:
			case VisGridPackage.DC_DC_CONVERTER__VOUT:
			case VisGridPackage.DC_DC_CONVERTER__IOUT:
			case VisGridPackage.DC_DC_CONVERTER__VDC:
			case VisGridPackage.DC_DC_CONVERTER__VA_OUT:
			case VisGridPackage.DC_DC_CONVERTER__POUT:
			case VisGridPackage.DC_DC_CONVERTER__QOUT:
			case VisGridPackage.DC_DC_CONVERTER__SERVICE_RATIO:
			case VisGridPackage.DC_DC_CONVERTER__VIN:
			case VisGridPackage.DC_DC_CONVERTER__IIN:
			case VisGridPackage.DC_DC_CONVERTER__VA_IN:
			case VisGridPackage.DC_DC_CONVERTER__PHASES:
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
