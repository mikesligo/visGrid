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

import visGrid.Triplex_line_configuration;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Triplex_line_configuration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Triplex_line_configurationItemProvider
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
	public Triplex_line_configurationItemProvider(AdapterFactory adapterFactory) {
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
			addConductor_1PropertyDescriptor(object);
			addConductor_2PropertyDescriptor(object);
			addConductor_NPropertyDescriptor(object);
			addInsulation_thicknessPropertyDescriptor(object);
			addDiameterPropertyDescriptor(object);
			addSpacingPropertyDescriptor(object);
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
				 getString("_UI_Triplex_line_configuration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_name_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conductor 1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConductor_1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_line_configuration_conductor_1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_conductor_1_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Conductor_1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conductor 2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConductor_2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_line_configuration_conductor_2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_conductor_2_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Conductor_2(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conductor N feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConductor_NPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_line_configuration_conductor_N_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_conductor_N_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Conductor_N(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Insulation thickness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInsulation_thicknessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_line_configuration_insulation_thickness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_insulation_thickness_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Insulation_thickness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_line_configuration_diameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_diameter_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Diameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Triplex_line_configuration_spacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Triplex_line_configuration_spacing_feature", "_UI_Triplex_line_configuration_type"),
				 VisGridPackage.eINSTANCE.getTriplex_line_configuration_Spacing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Triplex_line_configuration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Triplex_line_configuration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Triplex_line_configuration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Triplex_line_configuration_type") :
			getString("_UI_Triplex_line_configuration_type") + " " + label;
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

		switch (notification.getFeatureID(Triplex_line_configuration.class)) {
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__NAME:
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__CONDUCTOR_1:
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__CONDUCTOR_2:
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__CONDUCTOR_N:
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__INSULATION_THICKNESS:
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__DIAMETER:
			case VisGridPackage.TRIPLEX_LINE_CONFIGURATION__SPACING:
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
