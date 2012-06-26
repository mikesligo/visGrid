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

import visGrid.Office;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Office} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeItemProvider
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
	public OfficeItemProvider(AdapterFactory adapterFactory) {
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
			addFloor_areaPropertyDescriptor(object);
			addFloor_heightPropertyDescriptor(object);
			addExterior_uaPropertyDescriptor(object);
			addInterior_uaPropertyDescriptor(object);
			addInterior_massPropertyDescriptor(object);
			addGlazingPropertyDescriptor(object);
			addGlazing__northPropertyDescriptor(object);
			addGlazing__northeastPropertyDescriptor(object);
			addGlazing__eastPropertyDescriptor(object);
			addGlazing__southeastPropertyDescriptor(object);
			addGlazing__southPropertyDescriptor(object);
			addGlazing__southwestPropertyDescriptor(object);
			addGlazing__westPropertyDescriptor(object);
			addGlazing__northwestPropertyDescriptor(object);
			addGlazing__horizontalPropertyDescriptor(object);
			addGlazing__coefficientPropertyDescriptor(object);
			addOccupancyPropertyDescriptor(object);
			addOccupantsPropertyDescriptor(object);
			addSchedulePropertyDescriptor(object);
			addAir_temperaturePropertyDescriptor(object);
			addMass_temperaturePropertyDescriptor(object);
			addTemperature_changePropertyDescriptor(object);
			addOutdoor_temperaturePropertyDescriptor(object);
			addQhPropertyDescriptor(object);
			addQsPropertyDescriptor(object);
			addQiPropertyDescriptor(object);
			addQzPropertyDescriptor(object);
			addHvac_modePropertyDescriptor(object);
			addHvac__cooling__balance_temperaturePropertyDescriptor(object);
			addHvac__cooling__capacityPropertyDescriptor(object);
			addHvac__cooling__capacity_perFPropertyDescriptor(object);
			addHvac__cooling__design_temperaturePropertyDescriptor(object);
			addHvac__cooling__efficiencyPropertyDescriptor(object);
			addHvac__cooling__copPropertyDescriptor(object);
			addHvac__heating__balance_temperaturePropertyDescriptor(object);
			addHvac__heating__capacityPropertyDescriptor(object);
			addHvac__heating__capacity_perFPropertyDescriptor(object);
			addHvac__heating__design_temperaturePropertyDescriptor(object);
			addHvac__heating__efficiencyPropertyDescriptor(object);
			addHvac__heating__copPropertyDescriptor(object);
			addLights__capacityPropertyDescriptor(object);
			addLights__fractionPropertyDescriptor(object);
			addPlugs__capacityPropertyDescriptor(object);
			addPlugs__fractionPropertyDescriptor(object);
			addDemandPropertyDescriptor(object);
			addTotal_loadPropertyDescriptor(object);
			addEnergyPropertyDescriptor(object);
			addPower_factorPropertyDescriptor(object);
			addPowerPropertyDescriptor(object);
			addCurrentPropertyDescriptor(object);
			addAdmittancePropertyDescriptor(object);
			addHvac__demandPropertyDescriptor(object);
			addHvac__loadPropertyDescriptor(object);
			addHvac__energyPropertyDescriptor(object);
			addHvac__power_factorPropertyDescriptor(object);
			addLights__demandPropertyDescriptor(object);
			addLights__loadPropertyDescriptor(object);
			addLights__energyPropertyDescriptor(object);
			addLights__power_factorPropertyDescriptor(object);
			addLights__heatgain_fractionPropertyDescriptor(object);
			addLights__heatgainPropertyDescriptor(object);
			addPlugs__demandPropertyDescriptor(object);
			addPlugs__loadPropertyDescriptor(object);
			addPlugs__energyPropertyDescriptor(object);
			addPlugs__power_factorPropertyDescriptor(object);
			addPlugs__heatgain_fractionPropertyDescriptor(object);
			addPlugs__heatgainPropertyDescriptor(object);
			addCooling_setpointPropertyDescriptor(object);
			addHeating_setpointPropertyDescriptor(object);
			addThermostat_deadbandPropertyDescriptor(object);
			addControl__ventilation_fractionPropertyDescriptor(object);
			addControl__lighting_fractionPropertyDescriptor(object);
			addACHPropertyDescriptor(object);
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
				 getString("_UI_Office_Connection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_Connection_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Connection(),
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
				 getString("_UI_Office_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_name_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floor area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloor_areaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_floor_area_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_floor_area_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Floor_area(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Floor height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFloor_heightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_floor_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_floor_height_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Floor_height(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exterior ua feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExterior_uaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_exterior_ua_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_exterior_ua_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Exterior_ua(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interior ua feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterior_uaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_interior_ua_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_interior_ua_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Interior_ua(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interior mass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterior_massPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_interior_mass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_interior_mass_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Interior_mass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing north feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__northPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__north_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__north_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__north(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing northeast feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__northeastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__northeast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__northeast_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__northeast(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing east feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__eastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__east_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__east_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__east(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing southeast feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__southeastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__southeast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__southeast_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__southeast(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing south feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__southPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__south_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__south_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__south(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing southwest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__southwestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__southwest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__southwest_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__southwest(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing west feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__westPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__west_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__west_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__west(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing northwest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__northwestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__northwest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__northwest_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__northwest(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing horizontal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__horizontalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__horizontal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__horizontal_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__horizontal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Glazing coefficient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlazing__coefficientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_glazing__coefficient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_glazing__coefficient_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Glazing__coefficient(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occupancy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOccupancyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_occupancy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_occupancy_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Occupancy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occupants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOccupantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_occupants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_occupants_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Occupants(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_schedule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_schedule_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Schedule(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Air temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAir_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_air_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_air_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Air_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMass_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_mass_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_mass_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Mass_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperature_changePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_temperature_change_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_temperature_change_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Temperature_change(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outdoor temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutdoor_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_outdoor_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_outdoor_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Outdoor_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQhPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_Qh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_Qh_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Qh(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_Qs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_Qs_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Qs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_Qi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_Qi_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Qi(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qz feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQzPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_Qz_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_Qz_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Qz(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac_mode_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac cooling balance temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__cooling__balance_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__cooling__balance_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__cooling__balance_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__cooling__balance_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac cooling capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__cooling__capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__cooling__capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__cooling__capacity_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__cooling__capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac cooling capacity per F feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__cooling__capacity_perFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__cooling__capacity_perF_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__cooling__capacity_perF_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__cooling__capacity_perF(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac cooling design temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__cooling__design_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__cooling__design_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__cooling__design_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__cooling__design_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac cooling efficiency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__cooling__efficiencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__cooling__efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__cooling__efficiency_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__cooling__efficiency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac cooling cop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__cooling__copPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__cooling__cop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__cooling__cop_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__cooling__cop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac heating balance temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__heating__balance_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__heating__balance_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__heating__balance_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__heating__balance_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac heating capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__heating__capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__heating__capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__heating__capacity_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__heating__capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac heating capacity per F feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__heating__capacity_perFPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__heating__capacity_perF_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__heating__capacity_perF_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__heating__capacity_perF(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac heating design temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__heating__design_temperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__heating__design_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__heating__design_temperature_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__heating__design_temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac heating efficiency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__heating__efficiencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__heating__efficiency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__heating__efficiency_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__heating__efficiency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac heating cop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__heating__copPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__heating__cop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__heating__cop_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__heating__cop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__capacity_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__fraction_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__capacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__capacity_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__capacity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__fraction_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDemandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_demand_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotal_loadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_total_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_total_load_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Total_load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_energy_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Energy(),
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
				 getString("_UI_Office_power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_power_factor_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_power_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_current_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_current_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Current(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Admittance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdmittancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_admittance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_admittance_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Admittance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__demand_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__loadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__load_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__energy_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hvac power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHvac__power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_hvac__power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_hvac__power_factor_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Hvac__power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__demand_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__loadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__load_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__energy_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__power_factor_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__heatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__heatgain_fraction_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLights__heatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_lights__heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_lights__heatgain_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Lights__heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs demand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__demandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__demand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__demand_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__demand(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__loadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__load_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__load(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs energy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__energyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__energy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__energy_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__energy(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs power factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__power_factorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__power_factor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__power_factor_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__power_factor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs heatgain fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__heatgain_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__heatgain_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__heatgain_fraction_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__heatgain_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugs heatgain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugs__heatgainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_plugs__heatgain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_plugs__heatgain_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Plugs__heatgain(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cooling setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCooling_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_cooling_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_cooling_setpoint_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Cooling_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heating setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeating_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_heating_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_heating_setpoint_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Heating_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thermostat deadband feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThermostat_deadbandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_thermostat_deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_thermostat_deadband_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Thermostat_deadband(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control ventilation fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControl__ventilation_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_control__ventilation_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_control__ventilation_fraction_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Control__ventilation_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control lighting fraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControl__lighting_fractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_control__lighting_fraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_control__lighting_fraction_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_Control__lighting_fraction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ACH feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addACHPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_ACH_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_ACH_feature", "_UI_Office_type"),
				 VisGridPackage.eINSTANCE.getOffice_ACH(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Office.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Office"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Office)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Office_type") :
			getString("_UI_Office_type") + " " + label;
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

		switch (notification.getFeatureID(Office.class)) {
			case VisGridPackage.OFFICE__NAME:
			case VisGridPackage.OFFICE__FLOOR_AREA:
			case VisGridPackage.OFFICE__FLOOR_HEIGHT:
			case VisGridPackage.OFFICE__EXTERIOR_UA:
			case VisGridPackage.OFFICE__INTERIOR_UA:
			case VisGridPackage.OFFICE__INTERIOR_MASS:
			case VisGridPackage.OFFICE__GLAZING:
			case VisGridPackage.OFFICE__GLAZING_NORTH:
			case VisGridPackage.OFFICE__GLAZING_NORTHEAST:
			case VisGridPackage.OFFICE__GLAZING_EAST:
			case VisGridPackage.OFFICE__GLAZING_SOUTHEAST:
			case VisGridPackage.OFFICE__GLAZING_SOUTH:
			case VisGridPackage.OFFICE__GLAZING_SOUTHWEST:
			case VisGridPackage.OFFICE__GLAZING_WEST:
			case VisGridPackage.OFFICE__GLAZING_NORTHWEST:
			case VisGridPackage.OFFICE__GLAZING_HORIZONTAL:
			case VisGridPackage.OFFICE__GLAZING_COEFFICIENT:
			case VisGridPackage.OFFICE__OCCUPANCY:
			case VisGridPackage.OFFICE__OCCUPANTS:
			case VisGridPackage.OFFICE__SCHEDULE:
			case VisGridPackage.OFFICE__AIR_TEMPERATURE:
			case VisGridPackage.OFFICE__MASS_TEMPERATURE:
			case VisGridPackage.OFFICE__TEMPERATURE_CHANGE:
			case VisGridPackage.OFFICE__OUTDOOR_TEMPERATURE:
			case VisGridPackage.OFFICE__QH:
			case VisGridPackage.OFFICE__QS:
			case VisGridPackage.OFFICE__QI:
			case VisGridPackage.OFFICE__QZ:
			case VisGridPackage.OFFICE__HVAC_MODE:
			case VisGridPackage.OFFICE__HVAC_COOLING_BALANCE_TEMPERATURE:
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY:
			case VisGridPackage.OFFICE__HVAC_COOLING_CAPACITY_PER_F:
			case VisGridPackage.OFFICE__HVAC_COOLING_DESIGN_TEMPERATURE:
			case VisGridPackage.OFFICE__HVAC_COOLING_EFFICIENCY:
			case VisGridPackage.OFFICE__HVAC_COOLING_COP:
			case VisGridPackage.OFFICE__HVAC_HEATING_BALANCE_TEMPERATURE:
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY:
			case VisGridPackage.OFFICE__HVAC_HEATING_CAPACITY_PER_F:
			case VisGridPackage.OFFICE__HVAC_HEATING_DESIGN_TEMPERATURE:
			case VisGridPackage.OFFICE__HVAC_HEATING_EFFICIENCY:
			case VisGridPackage.OFFICE__HVAC_HEATING_COP:
			case VisGridPackage.OFFICE__LIGHTS_CAPACITY:
			case VisGridPackage.OFFICE__LIGHTS_FRACTION:
			case VisGridPackage.OFFICE__PLUGS_CAPACITY:
			case VisGridPackage.OFFICE__PLUGS_FRACTION:
			case VisGridPackage.OFFICE__DEMAND:
			case VisGridPackage.OFFICE__TOTAL_LOAD:
			case VisGridPackage.OFFICE__ENERGY:
			case VisGridPackage.OFFICE__POWER_FACTOR:
			case VisGridPackage.OFFICE__POWER:
			case VisGridPackage.OFFICE__CURRENT:
			case VisGridPackage.OFFICE__ADMITTANCE:
			case VisGridPackage.OFFICE__HVAC_DEMAND:
			case VisGridPackage.OFFICE__HVAC_LOAD:
			case VisGridPackage.OFFICE__HVAC_ENERGY:
			case VisGridPackage.OFFICE__HVAC_POWER_FACTOR:
			case VisGridPackage.OFFICE__LIGHTS_DEMAND:
			case VisGridPackage.OFFICE__LIGHTS_LOAD:
			case VisGridPackage.OFFICE__LIGHTS_ENERGY:
			case VisGridPackage.OFFICE__LIGHTS_POWER_FACTOR:
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN_FRACTION:
			case VisGridPackage.OFFICE__LIGHTS_HEATGAIN:
			case VisGridPackage.OFFICE__PLUGS_DEMAND:
			case VisGridPackage.OFFICE__PLUGS_LOAD:
			case VisGridPackage.OFFICE__PLUGS_ENERGY:
			case VisGridPackage.OFFICE__PLUGS_POWER_FACTOR:
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN_FRACTION:
			case VisGridPackage.OFFICE__PLUGS_HEATGAIN:
			case VisGridPackage.OFFICE__COOLING_SETPOINT:
			case VisGridPackage.OFFICE__HEATING_SETPOINT:
			case VisGridPackage.OFFICE__THERMOSTAT_DEADBAND:
			case VisGridPackage.OFFICE__CONTROL_VENTILATION_FRACTION:
			case VisGridPackage.OFFICE__CONTROL_LIGHTING_FRACTION:
			case VisGridPackage.OFFICE__ACH:
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
