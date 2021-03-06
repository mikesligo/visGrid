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

import visGrid.Solar;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Solar} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolarItemProvider
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
	public SolarItemProvider(AdapterFactory adapterFactory) {
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
			addPanel_typePropertyDescriptor(object);
			addPower_typePropertyDescriptor(object);
			addNoctPropertyDescriptor(object);
			addTcellPropertyDescriptor(object);
			addTambientPropertyDescriptor(object);
			addInsolationPropertyDescriptor(object);
			addRinternalPropertyDescriptor(object);
			addRated_InsolationPropertyDescriptor(object);
			addV_MaxPropertyDescriptor(object);
			addVoc_MaxPropertyDescriptor(object);
			addVocPropertyDescriptor(object);
			addEfficiencyPropertyDescriptor(object);
			addAreaPropertyDescriptor(object);
			addRated_kVAPropertyDescriptor(object);
			addV_OutPropertyDescriptor(object);
			addI_OutPropertyDescriptor(object);
			addVA_OutPropertyDescriptor(object);
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
				 getString("_UI_Solar_generator_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_generator_mode_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Generator_mode(),
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
				 getString("_UI_Solar_generator_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_generator_status_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Generator_status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Panel type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanel_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_panel_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_panel_type_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Panel_type(),
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
				 getString("_UI_Solar_power_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_power_type_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Power_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Noct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoctPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_noct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_noct_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Noct(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tcell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTcellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_Tcell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Tcell_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Tcell(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tambient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTambientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_Tambient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Tambient_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Tambient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insolation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsolationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_Insolation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Insolation_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Insolation(),
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
				 getString("_UI_Solar_Rinternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Rinternal_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Rinternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated Insolation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_InsolationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_Rated_Insolation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Rated_Insolation_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Rated_Insolation(),
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
				 getString("_UI_Solar_V_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_V_Max_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_V_Max(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voc Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoc_MaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_Voc_Max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Voc_Max_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Voc_Max(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVocPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_Voc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Voc_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Voc(),
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
				 getString("_UI_Solar_efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_efficiency_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Efficiency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Solar_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_area_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Area(),
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
				 getString("_UI_Solar_Rated_kVA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_Rated_kVA_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Rated_kVA(),
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
				 getString("_UI_Solar_V_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_V_Out_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_V_Out(),
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
				 getString("_UI_Solar_I_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_I_Out_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_I_Out(),
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
				 getString("_UI_Solar_VA_Out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_VA_Out_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_VA_Out(),
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
				 getString("_UI_Solar_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Solar_phases_feature", "_UI_Solar_type"),
				 VisGridPackage.eINSTANCE.getSolar_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Solar.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Solar"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Solar)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Solar_type") :
			getString("_UI_Solar_type") + " " + label;
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

		switch (notification.getFeatureID(Solar.class)) {
			case VisGridPackage.SOLAR__GENERATOR_MODE:
			case VisGridPackage.SOLAR__GENERATOR_STATUS:
			case VisGridPackage.SOLAR__PANEL_TYPE:
			case VisGridPackage.SOLAR__POWER_TYPE:
			case VisGridPackage.SOLAR__NOCT:
			case VisGridPackage.SOLAR__TCELL:
			case VisGridPackage.SOLAR__TAMBIENT:
			case VisGridPackage.SOLAR__INSOLATION:
			case VisGridPackage.SOLAR__RINTERNAL:
			case VisGridPackage.SOLAR__RATED_INSOLATION:
			case VisGridPackage.SOLAR__VMAX:
			case VisGridPackage.SOLAR__VOC_MAX:
			case VisGridPackage.SOLAR__VOC:
			case VisGridPackage.SOLAR__EFFICIENCY:
			case VisGridPackage.SOLAR__AREA:
			case VisGridPackage.SOLAR__RATED_KVA:
			case VisGridPackage.SOLAR__VOUT:
			case VisGridPackage.SOLAR__IOUT:
			case VisGridPackage.SOLAR__VA_OUT:
			case VisGridPackage.SOLAR__PHASES:
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
