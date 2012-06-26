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

import visGrid.Overhead_line_conductor;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Overhead_line_conductor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Overhead_line_conductorItemProvider
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
	public Overhead_line_conductorItemProvider(AdapterFactory adapterFactory) {
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
			addGeometric_mean_radiusPropertyDescriptor(object);
			addResistancePropertyDescriptor(object);
			addRating__summer__continuousPropertyDescriptor(object);
			addRating__summer__emergencyPropertyDescriptor(object);
			addRating__winter__continuousPropertyDescriptor(object);
			addRating__winter__emergencyPropertyDescriptor(object);
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
				 getString("_UI_Overhead_line_conductor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_name_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Geometric mean radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeometric_mean_radiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_conductor_geometric_mean_radius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_geometric_mean_radius_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Geometric_mean_radius(),
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
				 getString("_UI_Overhead_line_conductor_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_resistance_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rating summer continuous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRating__summer__continuousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_conductor_rating__summer__continuous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_rating__summer__continuous_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Rating__summer__continuous(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rating summer emergency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRating__summer__emergencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_conductor_rating__summer__emergency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_rating__summer__emergency_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Rating__summer__emergency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rating winter continuous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRating__winter__continuousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_conductor_rating__winter__continuous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_rating__winter__continuous_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Rating__winter__continuous(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rating winter emergency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRating__winter__emergencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Overhead_line_conductor_rating__winter__emergency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Overhead_line_conductor_rating__winter__emergency_feature", "_UI_Overhead_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getOverhead_line_conductor_Rating__winter__emergency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Overhead_line_conductor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Overhead_line_conductor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Overhead_line_conductor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Overhead_line_conductor_type") :
			getString("_UI_Overhead_line_conductor_type") + " " + label;
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

		switch (notification.getFeatureID(Overhead_line_conductor.class)) {
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__NAME:
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__GEOMETRIC_MEAN_RADIUS:
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__RESISTANCE:
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
			case VisGridPackage.OVERHEAD_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
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
