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

import visGrid.Frequency_gen;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Frequency_gen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Frequency_genItemProvider
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
	public Frequency_genItemProvider(AdapterFactory adapterFactory) {
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

			addFrequency_ModePropertyDescriptor(object);
			addFrequencyPropertyDescriptor(object);
			addFreqChangePropertyDescriptor(object);
			addDeadbandPropertyDescriptor(object);
			addTolerancePropertyDescriptor(object);
			addMPropertyDescriptor(object);
			addDPropertyDescriptor(object);
			addRated_powerPropertyDescriptor(object);
			addGen_powerPropertyDescriptor(object);
			addLoad_powerPropertyDescriptor(object);
			addGov_delayPropertyDescriptor(object);
			addRamp_ratePropertyDescriptor(object);
			addLow_Freq_OIPropertyDescriptor(object);
			addHigh_Freq_OIPropertyDescriptor(object);
			addAvg24PropertyDescriptor(object);
			addStd24PropertyDescriptor(object);
			addAvg168PropertyDescriptor(object);
			addStd168PropertyDescriptor(object);
			addNum_Resp_EqsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Frequency Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrequency_ModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Frequency_Mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Frequency_Mode_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Frequency_Mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Frequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Frequency_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Frequency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Freq Change feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreqChangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_FreqChange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_FreqChange_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_FreqChange(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadband feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadbandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Deadband_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Deadband_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Deadband(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tolerance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTolerancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Tolerance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Tolerance_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Tolerance(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the M feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_M_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_M_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_M(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the D feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_D_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_D_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_D(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rated power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRated_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Rated_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Rated_power_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Rated_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGen_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Gen_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Gen_power_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Gen_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load power feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoad_powerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Load_power_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Load_power_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Load_power(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gov delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGov_delayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Gov_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Gov_delay_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Gov_delay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ramp rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamp_ratePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Ramp_rate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Ramp_rate_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Ramp_rate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Low Freq OI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLow_Freq_OIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Low_Freq_OI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Low_Freq_OI_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Low_Freq_OI(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the High Freq OI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHigh_Freq_OIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_High_Freq_OI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_High_Freq_OI_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_High_Freq_OI(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avg24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvg24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_avg24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_avg24_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Avg24(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Std24 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStd24PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_std24_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_std24_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Std24(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Avg168 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvg168PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_avg168_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_avg168_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Avg168(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Std168 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStd168PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_std168_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_std168_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Std168(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Resp Eqs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNum_Resp_EqsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Frequency_gen_Num_Resp_Eqs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Frequency_gen_Num_Resp_Eqs_feature", "_UI_Frequency_gen_type"),
				 VisGridPackage.eINSTANCE.getFrequency_gen_Num_Resp_Eqs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Frequency_gen.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Frequency_gen"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Frequency_gen)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Frequency_gen_type") :
			getString("_UI_Frequency_gen_type") + " " + label;
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

		switch (notification.getFeatureID(Frequency_gen.class)) {
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY_MODE:
			case VisGridPackage.FREQUENCY_GEN__FREQUENCY:
			case VisGridPackage.FREQUENCY_GEN__FREQ_CHANGE:
			case VisGridPackage.FREQUENCY_GEN__DEADBAND:
			case VisGridPackage.FREQUENCY_GEN__TOLERANCE:
			case VisGridPackage.FREQUENCY_GEN__M:
			case VisGridPackage.FREQUENCY_GEN__D:
			case VisGridPackage.FREQUENCY_GEN__RATED_POWER:
			case VisGridPackage.FREQUENCY_GEN__GEN_POWER:
			case VisGridPackage.FREQUENCY_GEN__LOAD_POWER:
			case VisGridPackage.FREQUENCY_GEN__GOV_DELAY:
			case VisGridPackage.FREQUENCY_GEN__RAMP_RATE:
			case VisGridPackage.FREQUENCY_GEN__LOW_FREQ_OI:
			case VisGridPackage.FREQUENCY_GEN__HIGH_FREQ_OI:
			case VisGridPackage.FREQUENCY_GEN__AVG24:
			case VisGridPackage.FREQUENCY_GEN__STD24:
			case VisGridPackage.FREQUENCY_GEN__AVG168:
			case VisGridPackage.FREQUENCY_GEN__STD168:
			case VisGridPackage.FREQUENCY_GEN__NUM_RESP_EQS:
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
