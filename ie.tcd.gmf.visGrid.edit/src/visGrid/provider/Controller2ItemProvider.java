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

import visGrid.Controller2;
import visGrid.VisGridPackage;

/**
 * This is the item provider adapter for a {@link visGrid.Controller2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Controller2ItemProvider
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
	public Controller2ItemProvider(AdapterFactory adapterFactory) {
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

			addInput_statePropertyDescriptor(object);
			addInput_setpointPropertyDescriptor(object);
			addInput_chainedPropertyDescriptor(object);
			addObservationPropertyDescriptor(object);
			addMean_observationPropertyDescriptor(object);
			addStdev_observationPropertyDescriptor(object);
			addExpectationPropertyDescriptor(object);
			addSetpointPropertyDescriptor(object);
			addSensitivityPropertyDescriptor(object);
			addPeriodPropertyDescriptor(object);
			addExpectation_propPropertyDescriptor(object);
			addExpectation_objPropertyDescriptor(object);
			addSetpoint_propPropertyDescriptor(object);
			addState_propPropertyDescriptor(object);
			addObservation_objPropertyDescriptor(object);
			addObservation_propPropertyDescriptor(object);
			addMean_observation_propPropertyDescriptor(object);
			addStdev_observation_propPropertyDescriptor(object);
			addCycle_lengthPropertyDescriptor(object);
			addBase_setpointPropertyDescriptor(object);
			addRamp_highPropertyDescriptor(object);
			addRamp_lowPropertyDescriptor(object);
			addRange_highPropertyDescriptor(object);
			addRange_lowPropertyDescriptor(object);
			addProb_offPropertyDescriptor(object);
			addOutput_statePropertyDescriptor(object);
			addOutput_setpointPropertyDescriptor(object);
			addControl_modePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input state feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_statePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_input_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_input_state_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Input_state(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_input_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_input_setpoint_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Input_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input chained feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInput_chainedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_input_chained_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_input_chained_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Input_chained(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_observation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_observation_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Observation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean observation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMean_observationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_mean_observation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_mean_observation_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Mean_observation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stdev observation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStdev_observationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_stdev_observation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_stdev_observation_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Stdev_observation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expectation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_expectation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_expectation_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Expectation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_setpoint_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sensitivity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSensitivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_sensitivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_sensitivity_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Sensitivity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_period_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_period_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Period(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expectation prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectation_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_expectation_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_expectation_prop_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Expectation_prop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expectation obj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectation_objPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_expectation_obj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_expectation_obj_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Expectation_obj(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Setpoint prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetpoint_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_setpoint_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_setpoint_prop_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Setpoint_prop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addState_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_state_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_state_prop_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_State_prop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observation obj feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservation_objPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_observation_obj_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_observation_obj_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Observation_obj(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Observation prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObservation_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_observation_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_observation_prop_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Observation_prop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mean observation prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMean_observation_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_mean_observation_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_mean_observation_prop_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Mean_observation_prop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stdev observation prop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStdev_observation_propPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_stdev_observation_prop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_stdev_observation_prop_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Stdev_observation_prop(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cycle length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCycle_lengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_cycle_length_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_cycle_length_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Cycle_length(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBase_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_base_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_base_setpoint_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Base_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ramp high feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamp_highPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_ramp_high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_ramp_high_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Ramp_high(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ramp low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamp_lowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_ramp_low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_ramp_low_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Ramp_low(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range high feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRange_highPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_range_high_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_range_high_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Range_high(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range low feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRange_lowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_range_low_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_range_low_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Range_low(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prob off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProb_offPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_prob_off_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_prob_off_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Prob_off(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output state feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_statePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_output_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_output_state_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Output_state(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output setpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutput_setpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_output_setpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_output_setpoint_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Output_setpoint(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControl_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller2_control_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller2_control_mode_feature", "_UI_Controller2_type"),
				 VisGridPackage.eINSTANCE.getController2_Control_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Controller2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Controller2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Controller2)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Controller2_type") :
			getString("_UI_Controller2_type") + " " + label;
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

		switch (notification.getFeatureID(Controller2.class)) {
			case VisGridPackage.CONTROLLER2__INPUT_STATE:
			case VisGridPackage.CONTROLLER2__INPUT_SETPOINT:
			case VisGridPackage.CONTROLLER2__INPUT_CHAINED:
			case VisGridPackage.CONTROLLER2__OBSERVATION:
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION:
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION:
			case VisGridPackage.CONTROLLER2__EXPECTATION:
			case VisGridPackage.CONTROLLER2__SETPOINT:
			case VisGridPackage.CONTROLLER2__SENSITIVITY:
			case VisGridPackage.CONTROLLER2__PERIOD:
			case VisGridPackage.CONTROLLER2__EXPECTATION_PROP:
			case VisGridPackage.CONTROLLER2__EXPECTATION_OBJ:
			case VisGridPackage.CONTROLLER2__SETPOINT_PROP:
			case VisGridPackage.CONTROLLER2__STATE_PROP:
			case VisGridPackage.CONTROLLER2__OBSERVATION_OBJ:
			case VisGridPackage.CONTROLLER2__OBSERVATION_PROP:
			case VisGridPackage.CONTROLLER2__MEAN_OBSERVATION_PROP:
			case VisGridPackage.CONTROLLER2__STDEV_OBSERVATION_PROP:
			case VisGridPackage.CONTROLLER2__CYCLE_LENGTH:
			case VisGridPackage.CONTROLLER2__BASE_SETPOINT:
			case VisGridPackage.CONTROLLER2__RAMP_HIGH:
			case VisGridPackage.CONTROLLER2__RAMP_LOW:
			case VisGridPackage.CONTROLLER2__RANGE_HIGH:
			case VisGridPackage.CONTROLLER2__RANGE_LOW:
			case VisGridPackage.CONTROLLER2__PROB_OFF:
			case VisGridPackage.CONTROLLER2__OUTPUT_STATE:
			case VisGridPackage.CONTROLLER2__OUTPUT_SETPOINT:
			case VisGridPackage.CONTROLLER2__CONTROL_MODE:
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
