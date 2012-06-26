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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Connections} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionsItemProvider
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
	public ConnectionsItemProvider(AdapterFactory adapterFactory) {
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

			addCsv_readerPropertyDescriptor(object);
			addDiesel_dgPropertyDescriptor(object);
			addEnergy_storagePropertyDescriptor(object);
			addInverterPropertyDescriptor(object);
			addDc_dc_converterPropertyDescriptor(object);
			addBatteryPropertyDescriptor(object);
			addAuctionPropertyDescriptor(object);
			addControllerPropertyDescriptor(object);
			addController2PropertyDescriptor(object);
			addCapbankPropertyDescriptor(object);
			addCommPropertyDescriptor(object);
			addCapacitorPropertyDescriptor(object);
			addLinePropertyDescriptor(object);
			addLine_spacingPropertyDescriptor(object);
			addOverhead_linePropertyDescriptor(object);
			addUnderground_linePropertyDescriptor(object);
			addOverhead_line_conductorPropertyDescriptor(object);
			addUnderground_line_conductorPropertyDescriptor(object);
			addLine_configurationPropertyDescriptor(object);
			addTransformer_configurationPropertyDescriptor(object);
			addLoadPropertyDescriptor(object);
			addRegulator_configurationPropertyDescriptor(object);
			addTriplex_nodePropertyDescriptor(object);
			addTriplex_meterPropertyDescriptor(object);
			addTriplex_linePropertyDescriptor(object);
			addTriplex_line_configurationPropertyDescriptor(object);
			addTriplex_line_conductorPropertyDescriptor(object);
			addSwitchPropertyDescriptor(object);
			addSubstationPropertyDescriptor(object);
			addPqloadPropertyDescriptor(object);
			addVoltdumpPropertyDescriptor(object);
			addSeries_reactorPropertyDescriptor(object);
			addRestorationPropertyDescriptor(object);
			addFrequency_genPropertyDescriptor(object);
			addVolt_var_controlPropertyDescriptor(object);
			addFault_checkPropertyDescriptor(object);
			addMotorPropertyDescriptor(object);
			addBilldumpPropertyDescriptor(object);
			addResidential_endusePropertyDescriptor(object);
			addHouse_aPropertyDescriptor(object);
			addHousePropertyDescriptor(object);
			addWaterheaterPropertyDescriptor(object);
			addLightsPropertyDescriptor(object);
			addRefrigeratorPropertyDescriptor(object);
			addClotheswasherPropertyDescriptor(object);
			addDishwasherPropertyDescriptor(object);
			addOccupantloadPropertyDescriptor(object);
			addPlugloadPropertyDescriptor(object);
			addMicrowavePropertyDescriptor(object);
			addRangePropertyDescriptor(object);
			addFreezerPropertyDescriptor(object);
			addDryerPropertyDescriptor(object);
			addEvchargerPropertyDescriptor(object);
			addZIPloadPropertyDescriptor(object);
			addPlayerPropertyDescriptor(object);
			addShaperPropertyDescriptor(object);
			addRecorderPropertyDescriptor(object);
			addCollectorPropertyDescriptor(object);
			addHistogramPropertyDescriptor(object);
			addClimatePropertyDescriptor(object);
			addWeatherPropertyDescriptor(object);
			addOfficePropertyDescriptor(object);
			addMultizonePropertyDescriptor(object);
			addWindturb_dgPropertyDescriptor(object);
			addPower_electronicsPropertyDescriptor(object);
			addRectifierPropertyDescriptor(object);
			addMicroturbinePropertyDescriptor(object);
			addSolarPropertyDescriptor(object);
			addStubauctionPropertyDescriptor(object);
			addLinkPropertyDescriptor(object);
			addFusePropertyDescriptor(object);
			addRelayPropertyDescriptor(object);
			addRegulatorPropertyDescriptor(object);
			addTransformerPropertyDescriptor(object);
			addMeterPropertyDescriptor(object);
			addGeneratorPropertyDescriptor(object);
			addPlcPropertyDescriptor(object);
			addNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Csv reader feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCsv_readerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Csv_reader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Csv_reader_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Csv_reader(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diesel dg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiesel_dgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Diesel_dg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Diesel_dg_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Diesel_dg(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Energy storage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnergy_storagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Energy_storage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Energy_storage_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Energy_storage(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Inverter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Inverter_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Inverter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dc dc converter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDc_dc_converterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Dc_dc_converter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Dc_dc_converter_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Dc_dc_converter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Battery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBatteryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Battery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Battery_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Battery(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Auction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Auction_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Auction(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Controller_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Controller_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Controller(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Controller2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addController2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Controller2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Controller2_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Controller2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capbank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapbankPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Capbank_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Capbank_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Capbank(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Comm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Comm_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Comm(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capacitor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapacitorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Capacitor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Capacitor_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Capacitor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Line_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Line_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Line(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLine_spacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Line_spacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Line_spacing_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Line_spacing(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overhead line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverhead_linePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Overhead_line_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Overhead_line_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Overhead_line(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Underground line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnderground_linePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Underground_line_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Underground_line_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Underground_line(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overhead line conductor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverhead_line_conductorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Overhead_line_conductor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Overhead_line_conductor_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Overhead_line_conductor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Underground line conductor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnderground_line_conductorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Underground_line_conductor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Underground_line_conductor_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Underground_line_conductor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Line configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLine_configurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Line_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Line_configuration_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Line_configuration(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transformer configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformer_configurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Transformer_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Transformer_configuration_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Transformer_configuration(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Load_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Load(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulator configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulator_configurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Regulator_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Regulator_configuration_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Regulator_configuration(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triplex node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriplex_nodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Triplex_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Triplex_node_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Triplex_node(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triplex meter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriplex_meterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Triplex_meter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Triplex_meter_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Triplex_meter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triplex line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriplex_linePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Triplex_line_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Triplex_line_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Triplex_line(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triplex line configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriplex_line_configurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Triplex_line_configuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Triplex_line_configuration_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Triplex_line_configuration(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Triplex line conductor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriplex_line_conductorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Triplex_line_conductor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Triplex_line_conductor_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Triplex_line_conductor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Switch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwitchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Switch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Switch_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Switch(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Substation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubstationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Substation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Substation_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Substation(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pqload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPqloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Pqload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Pqload_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Pqload(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Voltdump feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVoltdumpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Voltdump_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Voltdump_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Voltdump(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Series reactor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeries_reactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Series_reactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Series_reactor_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Series_reactor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restoration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestorationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Restoration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Restoration_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Restoration(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frequency gen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrequency_genPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Frequency_gen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Frequency_gen_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Frequency_gen(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volt var control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolt_var_controlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Volt_var_control_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Volt_var_control_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Volt_var_control(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fault check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFault_checkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Fault_check_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Fault_check_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Fault_check(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Motor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMotorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Motor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Motor_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Motor(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Billdump feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBilldumpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Billdump_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Billdump_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Billdump(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Residential enduse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResidential_endusePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Residential_enduse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Residential_enduse_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Residential_enduse(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the House a feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHouse_aPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_House_a_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_House_a_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_House_a(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the House feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHousePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_House_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_House_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_House(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waterheater feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWaterheaterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Waterheater_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Waterheater_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Waterheater(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lights feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLightsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Lights_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Lights_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Lights(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refrigerator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefrigeratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Refrigerator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Refrigerator_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Refrigerator(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clotheswasher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClotheswasherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Clotheswasher_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Clotheswasher_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Clotheswasher(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dishwasher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDishwasherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Dishwasher_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Dishwasher_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Dishwasher(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Occupantload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOccupantloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Occupantload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Occupantload_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Occupantload(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlugloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Plugload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Plugload_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Plugload(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Microwave feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicrowavePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Microwave_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Microwave_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Microwave(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Range_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Range_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Range(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Freezer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreezerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Freezer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Freezer_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Freezer(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dryer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDryerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Dryer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Dryer_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Dryer(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evcharger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvchargerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Evcharger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Evcharger_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Evcharger(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZI Pload feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZIPloadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_ZIPload_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_ZIPload_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_ZIPload(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Player feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Player_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Player_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Player(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shaper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShaperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Shaper_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Shaper_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Shaper(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recorder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecorderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Recorder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Recorder_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Recorder(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Collector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Collector_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Collector(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Histogram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistogramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Histogram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Histogram_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Histogram(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Climate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClimatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Climate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Climate_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Climate(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Weather feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeatherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Weather_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Weather_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Weather(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Office feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOfficePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Office_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Office_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Office(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multizone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultizonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Multizone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Multizone_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Multizone(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Windturb dg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindturb_dgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Windturb_dg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Windturb_dg_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Windturb_dg(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Power electronics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPower_electronicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Power_electronics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Power_electronics_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Power_electronics(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rectifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRectifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Rectifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Rectifier_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Rectifier(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Microturbine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMicroturbinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Microturbine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Microturbine_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Microturbine(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSolarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Solar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Solar_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Solar(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stubauction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStubauctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Stubauction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Stubauction_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Stubauction(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Link_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Link_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Link(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fuse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFusePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Fuse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Fuse_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Fuse(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Relay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Relay_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Relay(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Regulator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Regulator_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Regulator(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transformer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Transformer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Transformer_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Transformer(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Meter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Meter_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Meter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Generator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Generator_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Generator(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Plc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Plc_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Plc(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connections_Node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connections_Node_feature", "_UI_Connections_type"),
				 VisGridPackage.eINSTANCE.getConnections_Node(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Connections.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connections"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Connections_type");
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
