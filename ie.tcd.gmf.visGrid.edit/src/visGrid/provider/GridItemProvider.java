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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visGrid.Grid;
import visGrid.VisGridFactory;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Grid} object.
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
			childrenFeatures.add(VisGridPackage.eINSTANCE.getGrid_Connections());
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
			case VisGridPackage.GRID__CONNECTIONS:
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
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createClimate()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createCsv_reader()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createDiesel_dg()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createEnergy_storage()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createInverter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createDc_dc_converter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createAuction()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createController2()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createCapbank()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createComm()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createCapacitor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createLine()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createLine_spacing()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createOverhead_line()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createUnderground_line()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createOverhead_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createUnderground_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createLine_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTransformer_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createLoad()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRegulator_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTriplex_node()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTriplex_meter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTriplex_line()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTriplex_line_configuration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTriplex_line_conductor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createSubstation()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createPqload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createVoltdump()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createSeries_reactor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRestoration()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createFrequency_gen()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createVolt_var_control()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createFault_check()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createMotor()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createBilldump()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createResidential_enduse()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createHouse_a()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createHouse()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createWaterheater()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createLights()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRefrigerator()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createClotheswasher()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createDishwasher()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createOccupantload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createPlugload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createMicrowave()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRange()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createFreezer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createDryer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createEvcharger()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createZIPload()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createPlayer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createShaper()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRecorder()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createCollector()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createHistogram()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createWeather()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createOffice()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createMultizone()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createWindturb_dg()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createPower_electronics()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRectifier()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createMicroturbine()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createBattery()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createSolar()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createStubauction()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createFuse()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRelay()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createRegulator()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createTransformer()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createMeter()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createPlc()));

		newChildDescriptors.add
			(createChildParameter
				(VisGridPackage.eINSTANCE.getGrid_Connections(),
				 VisGridFactory.eINSTANCE.createNode()));
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
