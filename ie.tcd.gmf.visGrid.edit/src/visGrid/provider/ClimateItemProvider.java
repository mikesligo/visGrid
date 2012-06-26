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

import visGrid.Climate;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Climate} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClimateItemProvider
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
	public ClimateItemProvider(AdapterFactory adapterFactory) {
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
			addCityPropertyDescriptor(object);
			addTmyfilePropertyDescriptor(object);
			addTemperaturePropertyDescriptor(object);
			addHumidityPropertyDescriptor(object);
			addSolar_fluxPropertyDescriptor(object);
			addSolar_directPropertyDescriptor(object);
			addWind_speedPropertyDescriptor(object);
			addWind_dirPropertyDescriptor(object);
			addWind_gustPropertyDescriptor(object);
			addRecord__lowPropertyDescriptor(object);
			addRecord__low_dayPropertyDescriptor(object);
			addRecord__highPropertyDescriptor(object);
			addRecord__high_dayPropertyDescriptor(object);
			addRecord__solarPropertyDescriptor(object);
			addRainfallPropertyDescriptor(object);
			addSnowdepthPropertyDescriptor(object);
			addInterpolatePropertyDescriptor(object);
			addSolar_horizPropertyDescriptor(object);
			addSolar_northPropertyDescriptor(object);
			addSolar_northeastPropertyDescriptor(object);
			addSolar_eastPropertyDescriptor(object);
			addSolar_southeastPropertyDescriptor(object);
			addSolar_southPropertyDescriptor(object);
			addSolar_southwestPropertyDescriptor(object);
			addSolar_westPropertyDescriptor(object);
			addSolar_northwestPropertyDescriptor(object);
			addSolar_rawPropertyDescriptor(object);
			addReaderPropertyDescriptor(object);
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
				 getString("_UI_Climate_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_name_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the City feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_city_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_city_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_City(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tmyfile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTmyfilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_tmyfile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_tmyfile_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Tmyfile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Temperature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTemperaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_temperature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_temperature_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Temperature(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Humidity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHumidityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_humidity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_humidity_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Humidity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar flux feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_fluxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_flux_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_flux_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_flux(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar direct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_directPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_direct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_direct_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_direct(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wind speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWind_speedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_wind_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_wind_speed_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Wind_speed(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wind dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWind_dirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_wind_dir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_wind_dir_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Wind_dir(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wind gust feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWind_gustPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_wind_gust_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_wind_gust_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Wind_gust(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecord__lowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_record__low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_record__low_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Record__low(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record low day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecord__low_dayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_record__low_day_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_record__low_day_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Record__low_day(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record high feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecord__highPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_record__high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_record__high_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Record__high(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record high day feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecord__high_dayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_record__high_day_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_record__high_day_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Record__high_day(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Record solar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecord__solarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_record__solar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_record__solar_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Record__solar(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rainfall feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRainfallPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_rainfall_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_rainfall_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Rainfall(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Snowdepth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSnowdepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_snowdepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_snowdepth_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Snowdepth(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interpolate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpolatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_interpolate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_interpolate_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Interpolate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar horiz feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_horizPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_horiz_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_horiz_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_horiz(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar north feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_northPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_north_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_north_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_north(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar northeast feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_northeastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_northeast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_northeast_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_northeast(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar east feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_eastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_east_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_east_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_east(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar southeast feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_southeastPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_southeast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_southeast_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_southeast(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar south feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_southPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_south_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_south_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_south(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar southwest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_southwestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_southwest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_southwest_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_southwest(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar west feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_westPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_west_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_west_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_west(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar northwest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_northwestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_northwest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_northwest_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_northwest(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar raw feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolar_rawPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_solar_raw_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_solar_raw_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Solar_raw(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reader feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Climate_reader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Climate_reader_feature", "_UI_Climate_type"),
				 VisGridPackage.eINSTANCE.getClimate_Reader(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Climate.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Climate"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Climate)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Climate_type") :
			getString("_UI_Climate_type") + " " + label;
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

		switch (notification.getFeatureID(Climate.class)) {
			case VisGridPackage.CLIMATE__NAME:
			case VisGridPackage.CLIMATE__CITY:
			case VisGridPackage.CLIMATE__TMYFILE:
			case VisGridPackage.CLIMATE__TEMPERATURE:
			case VisGridPackage.CLIMATE__HUMIDITY:
			case VisGridPackage.CLIMATE__SOLAR_FLUX:
			case VisGridPackage.CLIMATE__SOLAR_DIRECT:
			case VisGridPackage.CLIMATE__WIND_SPEED:
			case VisGridPackage.CLIMATE__WIND_DIR:
			case VisGridPackage.CLIMATE__WIND_GUST:
			case VisGridPackage.CLIMATE__RECORD_LOW:
			case VisGridPackage.CLIMATE__RECORD_LOW_DAY:
			case VisGridPackage.CLIMATE__RECORD_HIGH:
			case VisGridPackage.CLIMATE__RECORD_HIGH_DAY:
			case VisGridPackage.CLIMATE__RECORD_SOLAR:
			case VisGridPackage.CLIMATE__RAINFALL:
			case VisGridPackage.CLIMATE__SNOWDEPTH:
			case VisGridPackage.CLIMATE__INTERPOLATE:
			case VisGridPackage.CLIMATE__SOLAR_HORIZ:
			case VisGridPackage.CLIMATE__SOLAR_NORTH:
			case VisGridPackage.CLIMATE__SOLAR_NORTHEAST:
			case VisGridPackage.CLIMATE__SOLAR_EAST:
			case VisGridPackage.CLIMATE__SOLAR_SOUTHEAST:
			case VisGridPackage.CLIMATE__SOLAR_SOUTH:
			case VisGridPackage.CLIMATE__SOLAR_SOUTHWEST:
			case VisGridPackage.CLIMATE__SOLAR_WEST:
			case VisGridPackage.CLIMATE__SOLAR_NORTHWEST:
			case VisGridPackage.CLIMATE__SOLAR_RAW:
			case VisGridPackage.CLIMATE__READER:
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
