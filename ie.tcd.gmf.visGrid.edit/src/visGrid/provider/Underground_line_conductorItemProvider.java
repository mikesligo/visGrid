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

import visGrid.Underground_line_conductor;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Underground_line_conductor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Underground_line_conductorItemProvider
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
	public Underground_line_conductorItemProvider(AdapterFactory adapterFactory) {
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

			addOuter_diameterPropertyDescriptor(object);
			addConductor_gmrPropertyDescriptor(object);
			addConductor_diameterPropertyDescriptor(object);
			addConductor_resistancePropertyDescriptor(object);
			addNeutral_gmrPropertyDescriptor(object);
			addNeutral_diameterPropertyDescriptor(object);
			addNeutral_resistancePropertyDescriptor(object);
			addNeutral_strandsPropertyDescriptor(object);
			addShield_gmrPropertyDescriptor(object);
			addShield_resistancePropertyDescriptor(object);
			addRating__summer__continuousPropertyDescriptor(object);
			addRating__summer__emergencyPropertyDescriptor(object);
			addRating__winter__continuousPropertyDescriptor(object);
			addRating__winter__emergencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Outer diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOuter_diameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_outer_diameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_outer_diameter_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Outer_diameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conductor gmr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConductor_gmrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_conductor_gmr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_conductor_gmr_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Conductor_gmr(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conductor diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConductor_diameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_conductor_diameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_conductor_diameter_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Conductor_diameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conductor resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConductor_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_conductor_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_conductor_resistance_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Conductor_resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Neutral gmr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeutral_gmrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_neutral_gmr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_neutral_gmr_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Neutral_gmr(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Neutral diameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeutral_diameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_neutral_diameter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_neutral_diameter_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Neutral_diameter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Neutral resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeutral_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_neutral_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_neutral_resistance_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Neutral_resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Neutral strands feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeutral_strandsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_neutral_strands_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_neutral_strands_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Neutral_strands(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shield gmr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShield_gmrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_shield_gmr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_shield_gmr_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Shield_gmr(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shield resistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShield_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Underground_line_conductor_shield_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_shield_resistance_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Shield_resistance(),
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
				 getString("_UI_Underground_line_conductor_rating__summer__continuous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_rating__summer__continuous_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Rating__summer__continuous(),
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
				 getString("_UI_Underground_line_conductor_rating__summer__emergency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_rating__summer__emergency_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Rating__summer__emergency(),
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
				 getString("_UI_Underground_line_conductor_rating__winter__continuous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_rating__winter__continuous_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Rating__winter__continuous(),
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
				 getString("_UI_Underground_line_conductor_rating__winter__emergency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Underground_line_conductor_rating__winter__emergency_feature", "_UI_Underground_line_conductor_type"),
				 VisGridPackage.eINSTANCE.getUnderground_line_conductor_Rating__winter__emergency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Underground_line_conductor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Underground_line_conductor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Underground_line_conductor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Underground_line_conductor_type") :
			getString("_UI_Underground_line_conductor_type") + " " + label;
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

		switch (notification.getFeatureID(Underground_line_conductor.class)) {
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__OUTER_DIAMETER:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_GMR:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_DIAMETER:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__CONDUCTOR_RESISTANCE:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_GMR:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_DIAMETER:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_RESISTANCE:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__NEUTRAL_STRANDS:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_GMR:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__SHIELD_RESISTANCE:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_CONTINUOUS:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_SUMMER_EMERGENCY:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_CONTINUOUS:
			case VisGridPackage.UNDERGROUND_LINE_CONDUCTOR__RATING_WINTER_EMERGENCY:
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
