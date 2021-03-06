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

import visGrid.Series_reactor;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Series_reactor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Series_reactorItemProvider
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
	public Series_reactorItemProvider(AdapterFactory adapterFactory) {
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

			addPhase_A_impedancePropertyDescriptor(object);
			addPhase_A_resistancePropertyDescriptor(object);
			addPhase_A_reactancePropertyDescriptor(object);
			addPhase_B_impedancePropertyDescriptor(object);
			addPhase_B_resistancePropertyDescriptor(object);
			addPhase_B_reactancePropertyDescriptor(object);
			addPhase_C_impedancePropertyDescriptor(object);
			addPhase_C_resistancePropertyDescriptor(object);
			addPhase_C_reactancePropertyDescriptor(object);
			addRated_current_limitPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addFromPropertyDescriptor(object);
			addToPropertyDescriptor(object);
			addPower_inPropertyDescriptor(object);
			addPower_outPropertyDescriptor(object);
			addPower_lossesPropertyDescriptor(object);
			addPower_in_APropertyDescriptor(object);
			addPower_in_BPropertyDescriptor(object);
			addPower_in_CPropertyDescriptor(object);
			addPower_out_APropertyDescriptor(object);
			addPower_out_BPropertyDescriptor(object);
			addPower_out_CPropertyDescriptor(object);
			addPower_losses_APropertyDescriptor(object);
			addPower_losses_BPropertyDescriptor(object);
			addPower_losses_CPropertyDescriptor(object);
			addFlow_directionPropertyDescriptor(object);
			addPhasesPropertyDescriptor(object);
			addNominal_voltagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Phase Aimpedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_A_impedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_A_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_A_impedance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_A_impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Aresistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_A_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_A_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_A_resistance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_A_resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Areactance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_A_reactancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_A_reactance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_A_reactance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_A_reactance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Bimpedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_B_impedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_B_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_B_impedance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_B_impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Bresistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_B_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_B_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_B_resistance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_B_resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Breactance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_B_reactancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_B_reactance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_B_reactance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_B_reactance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Cimpedance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_C_impedancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_C_impedance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_C_impedance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_C_impedance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Cresistance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_C_resistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_C_resistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_C_resistance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_C_resistance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Phase Creactance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhase_C_reactancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_phase_C_reactance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phase_C_reactance_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phase_C_reactance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated current limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_current_limitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_rated_current_limit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_rated_current_limit_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Rated_current_limit(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_status_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_from_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_from_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_From(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_to_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_To(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_inPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_in_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_in_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_in(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_outPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_out_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_out_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_out(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_lossesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_losses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_losses_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_losses(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_in_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_in_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_in_A_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_in_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_in_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_in_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_in_B_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_in_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power in C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_in_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_in_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_in_C_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_in_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_out_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_out_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_out_A_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_out_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_out_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_out_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_out_B_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_out_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power out C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_out_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_out_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_out_C_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_out_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses A feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_losses_APropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_losses_A_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_losses_A_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_losses_A(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_losses_BPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_losses_B_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_losses_B_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_losses_B(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power losses C feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_losses_CPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_power_losses_C_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_power_losses_C_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Power_losses_C(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlow_directionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_flow_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_flow_direction_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Flow_direction(),
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
				 getString("_UI_Series_reactor_phases_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_phases_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Phases(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nominal voltage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominal_voltagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Series_reactor_nominal_voltage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Series_reactor_nominal_voltage_feature", "_UI_Series_reactor_type"),
				 VisGridPackage.eINSTANCE.getSeries_reactor_Nominal_voltage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Series_reactor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Series_reactor"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Series_reactor)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Series_reactor_type") :
			getString("_UI_Series_reactor_type") + " " + label;
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

		switch (notification.getFeatureID(Series_reactor.class)) {
			case VisGridPackage.SERIES_REACTOR__PHASE_AIMPEDANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_ARESISTANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_AREACTANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_BIMPEDANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_BRESISTANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_BREACTANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_CIMPEDANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_CRESISTANCE:
			case VisGridPackage.SERIES_REACTOR__PHASE_CREACTANCE:
			case VisGridPackage.SERIES_REACTOR__RATED_CURRENT_LIMIT:
			case VisGridPackage.SERIES_REACTOR__STATUS:
			case VisGridPackage.SERIES_REACTOR__FROM:
			case VisGridPackage.SERIES_REACTOR__TO:
			case VisGridPackage.SERIES_REACTOR__POWER_IN:
			case VisGridPackage.SERIES_REACTOR__POWER_OUT:
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES:
			case VisGridPackage.SERIES_REACTOR__POWER_IN_A:
			case VisGridPackage.SERIES_REACTOR__POWER_IN_B:
			case VisGridPackage.SERIES_REACTOR__POWER_IN_C:
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_A:
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_B:
			case VisGridPackage.SERIES_REACTOR__POWER_OUT_C:
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_A:
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_B:
			case VisGridPackage.SERIES_REACTOR__POWER_LOSSES_C:
			case VisGridPackage.SERIES_REACTOR__FLOW_DIRECTION:
			case VisGridPackage.SERIES_REACTOR__PHASES:
			case VisGridPackage.SERIES_REACTOR__NOMINAL_VOLTAGE:
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
