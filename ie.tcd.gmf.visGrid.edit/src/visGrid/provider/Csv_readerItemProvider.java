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

import visGrid.Csv_reader;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Csv_reader} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Csv_readerItemProvider
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
	public Csv_readerItemProvider(AdapterFactory adapterFactory) {
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

			addIndexPropertyDescriptor(object);
			addCity_namePropertyDescriptor(object);
			addState_namePropertyDescriptor(object);
			addLat_degPropertyDescriptor(object);
			addLat_minPropertyDescriptor(object);
			addLong_degPropertyDescriptor(object);
			addLong_minPropertyDescriptor(object);
			addLow_tempPropertyDescriptor(object);
			addHigh_tempPropertyDescriptor(object);
			addPeak_solarPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addTimefmtPropertyDescriptor(object);
			addTimezonePropertyDescriptor(object);
			addColumnsPropertyDescriptor(object);
			addFilenamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_index_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Index(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the City name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCity_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_city_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_city_name_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_City_name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addState_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_state_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_state_name_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_State_name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lat deg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLat_degPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_lat_deg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_lat_deg_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Lat_deg(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lat min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLat_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_lat_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_lat_min_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Lat_min(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Long deg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLong_degPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_long_deg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_long_deg_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Long_deg(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Long min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLong_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_long_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_long_min_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Long_min(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Low temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLow_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_low_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_low_temp_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Low_temp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the High temp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHigh_tempPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_high_temp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_high_temp_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_High_temp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peak solar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeak_solarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_peak_solar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_peak_solar_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Peak_solar(),
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
				 getString("_UI_Csv_reader_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_status_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Status(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timefmt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimefmtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_timefmt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_timefmt_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Timefmt(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timezone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimezonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_timezone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_timezone_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Timezone(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_columns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_columns_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Columns(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filename feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilenamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Csv_reader_filename_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Csv_reader_filename_feature", "_UI_Csv_reader_type"),
				 VisGridPackage.eINSTANCE.getCsv_reader_Filename(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Csv_reader.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Csv_reader"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Csv_reader)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Csv_reader_type") :
			getString("_UI_Csv_reader_type") + " " + label;
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

		switch (notification.getFeatureID(Csv_reader.class)) {
			case VisGridPackage.CSV_READER__INDEX:
			case VisGridPackage.CSV_READER__CITY_NAME:
			case VisGridPackage.CSV_READER__STATE_NAME:
			case VisGridPackage.CSV_READER__LAT_DEG:
			case VisGridPackage.CSV_READER__LAT_MIN:
			case VisGridPackage.CSV_READER__LONG_DEG:
			case VisGridPackage.CSV_READER__LONG_MIN:
			case VisGridPackage.CSV_READER__LOW_TEMP:
			case VisGridPackage.CSV_READER__HIGH_TEMP:
			case VisGridPackage.CSV_READER__PEAK_SOLAR:
			case VisGridPackage.CSV_READER__STATUS:
			case VisGridPackage.CSV_READER__TIMEFMT:
			case VisGridPackage.CSV_READER__TIMEZONE:
			case VisGridPackage.CSV_READER__COLUMNS:
			case VisGridPackage.CSV_READER__FILENAME:
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
