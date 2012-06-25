/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package simpleGrid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import simpleGrid.Grid;
import simpleGrid.SimpleGridFactory;
import simpleGrid.SimpleGridPackage;

/**
 * This is the item provider adapter for a {@link simpleGrid.Grid} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GridItemProvider
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
	public GridItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__CLIMATE);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__NODE);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRANSFORMER);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRANSFORMER_CONFIGURATION);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRIPLEX_NODES);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRIPLEX_LINE_CONFIGURATION);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRIPLEX_LINE_CONDUCTOR);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRIPLEX_LINE);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__TRIPLEX_METER);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__HOUSE);
			childrenFeatures.add(SimpleGridPackage.Literals.GRID__WATERHEATER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Grid.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Grid"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Grid_type");
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

		switch (notification.getFeatureID(Grid.class)) {
			case SimpleGridPackage.GRID__CLIMATE:
			case SimpleGridPackage.GRID__NODE:
			case SimpleGridPackage.GRID__TRANSFORMER:
			case SimpleGridPackage.GRID__TRANSFORMER_CONFIGURATION:
			case SimpleGridPackage.GRID__TRIPLEX_NODES:
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONFIGURATION:
			case SimpleGridPackage.GRID__TRIPLEX_LINE_CONDUCTOR:
			case SimpleGridPackage.GRID__TRIPLEX_LINE:
			case SimpleGridPackage.GRID__TRIPLEX_METER:
			case SimpleGridPackage.GRID__HOUSE:
			case SimpleGridPackage.GRID__WATERHEATER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__CLIMATE,
				 SimpleGridFactory.eINSTANCE.createClimate()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__NODE,
				 SimpleGridFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRANSFORMER,
				 SimpleGridFactory.eINSTANCE.createTransformer()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRANSFORMER_CONFIGURATION,
				 SimpleGridFactory.eINSTANCE.createTransformer_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRIPLEX_NODES,
				 SimpleGridFactory.eINSTANCE.createTriplex_node()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRIPLEX_LINE_CONFIGURATION,
				 SimpleGridFactory.eINSTANCE.createTriplex_Line_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRIPLEX_LINE_CONDUCTOR,
				 SimpleGridFactory.eINSTANCE.createTriplex_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRIPLEX_LINE,
				 SimpleGridFactory.eINSTANCE.createTriplex_line()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__TRIPLEX_METER,
				 SimpleGridFactory.eINSTANCE.createTriplex_meter()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__HOUSE,
				 SimpleGridFactory.eINSTANCE.createHouse()));

		newChildDescriptors.add
			(createChildParameter
				(SimpleGridPackage.Literals.GRID__WATERHEATER,
				 SimpleGridFactory.eINSTANCE.createWaterheater()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimpleGridEditPlugin.INSTANCE;
	}

}
