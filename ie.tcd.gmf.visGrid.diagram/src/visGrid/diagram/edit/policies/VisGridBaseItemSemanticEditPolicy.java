package visGrid.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class VisGridBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected VisGridBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						visGrid.diagram.part.VisGridVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(
					visGrid.diagram.edit.helpers.VisGridBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(
				visGrid.diagram.edit.helpers.VisGridBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(
				visGrid.diagram.edit.helpers.VisGridBaseEditHelper.EDIT_POLICY_COMMAND,
				null);
		request.setParameter(
				visGrid.diagram.edit.helpers.VisGridBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = visGrid.diagram.providers.VisGridElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = visGrid.diagram.part.VisGridDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			visGrid.diagram.part.VisGridDiagramEditorPlugin.getInstance()
					.setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_nodeConnection_4001(
				visGrid.Triplex_node source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_nodeConnection_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOverhead_line_conductorConnection_4002(
				visGrid.Overhead_line_conductor source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistOverhead_line_conductorConnection_4002(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsHouse_a_4003(
				visGrid.Connections source, visGrid.House_a target) {
			if (source != null) {
				if (source.getHouse_a().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsHouse_a_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTriplex_line_conductor_4004(
				visGrid.Connections source,
				visGrid.Triplex_line_conductor target) {
			if (source != null) {
				if (source.getTriplex_line_conductor().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTriplex_line_conductor_4004(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsEnergy_storage_4005(
				visGrid.Connections source, visGrid.Energy_storage target) {
			if (source != null) {
				if (source.getEnergy_storage().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsEnergy_storage_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsDc_dc_converter_4006(
				visGrid.Connections source, visGrid.Dc_dc_converter target) {
			if (source != null) {
				if (source.getDc_dc_converter().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsDc_dc_converter_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRegulator_configurationConnection_4007(
				visGrid.Regulator_configuration source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRegulator_configurationConnection_4007(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsHouse_4008(
				visGrid.Connections source, visGrid.House target) {
			if (source != null) {
				if (source.getHouse().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsHouse_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateZIPloadConnection_4009(visGrid.ZIPload source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistZIPloadConnection_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsClimate_4010(
				visGrid.Connections source, visGrid.Climate target) {
			if (source != null) {
				if (source.getClimate().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsClimate_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLine_configurationConnection_4011(
				visGrid.Line_configuration source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistLine_configurationConnection_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSwitchConnection_4012(visGrid.Switch source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistSwitchConnection_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLinkConnection_4013(visGrid.Link source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistLinkConnection_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsUnderground_line_conductor_4014(
				visGrid.Connections source,
				visGrid.Underground_line_conductor target) {
			if (source != null) {
				if (source.getUnderground_line_conductor().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsUnderground_line_conductor_4014(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClimateConnection_4015(visGrid.Climate source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistClimateConnection_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCapbankConnection_4016(visGrid.Capbank source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistCapbankConnection_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsStubauction_4017(
				visGrid.Connections source, visGrid.Stubauction target) {
			if (source != null) {
				if (source.getStubauction().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsStubauction_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOccupantloadConnection_4018(
				visGrid.Occupantload source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistOccupantloadConnection_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateWaterheaterConnection_4019(
				visGrid.Waterheater source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistWaterheaterConnection_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNodeConnection_4020(visGrid.Node source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistNodeConnection_4020(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsShaper_4021(
				visGrid.Connections source, visGrid.Shaper target) {
			if (source != null) {
				if (source.getShaper().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsShaper_4021(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsPlc_4022(visGrid.Connections source,
				visGrid.Plc target) {
			if (source != null) {
				if (source.getPlc().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsPlc_4022(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsOffice_4023(
				visGrid.Connections source, visGrid.Office target) {
			if (source != null) {
				if (source.getOffice().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsOffice_4023(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMeterConnection_4024(visGrid.Meter source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistMeterConnection_4024(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSolarConnection_4025(visGrid.Solar source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistSolarConnection_4025(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelayConnection_4026(visGrid.Relay source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRelayConnection_4026(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCsv_readerConnection_4027(
				visGrid.Csv_reader source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistCsv_readerConnection_4027(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsAuction_4028(
				visGrid.Connections source, visGrid.Auction target) {
			if (source != null) {
				if (source.getAuction().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsAuction_4028(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLightsConnection_4029(visGrid.Lights source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistLightsConnection_4029(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRefrigerator_4030(
				visGrid.Connections source, visGrid.Refrigerator target) {
			if (source != null) {
				if (source.getRefrigerator().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRefrigerator_4030(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateClotheswasherConnection_4031(
				visGrid.Clotheswasher source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistClotheswasherConnection_4031(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePlugloadConnection_4032(
				visGrid.Plugload source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistPlugloadConnection_4032(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsVoltdump_4033(
				visGrid.Connections source, visGrid.Voltdump target) {
			if (source != null) {
				if (source.getVoltdump().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsVoltdump_4033(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMicroturbineConnection_4034(
				visGrid.Microturbine source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistMicroturbineConnection_4034(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBilldumpConnection_4035(
				visGrid.Billdump source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistBilldumpConnection_4035(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsInverter_4036(
				visGrid.Connections source, visGrid.Inverter target) {
			if (source != null) {
				if (source.getInverter().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsInverter_4036(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsResidential_enduse_4037(
				visGrid.Connections source, visGrid.Residential_enduse target) {
			if (source != null) {
				if (source.getResidential_enduse().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsResidential_enduse_4037(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsSubstation_4038(
				visGrid.Connections source, visGrid.Substation target) {
			if (source != null) {
				if (source.getSubstation().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsSubstation_4038(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_lineConnection_4039(
				visGrid.Triplex_line source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_lineConnection_4039(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTransformerConnection_4040(
				visGrid.Transformer source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTransformerConnection_4040(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateWeatherConnection_4041(visGrid.Weather source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistWeatherConnection_4041(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEnergy_storageConnection_4042(
				visGrid.Energy_storage source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistEnergy_storageConnection_4042(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsMicroturbine_4043(
				visGrid.Connections source, visGrid.Microturbine target) {
			if (source != null) {
				if (source.getMicroturbine().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsMicroturbine_4043(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHouse_aConnection_4044(visGrid.House_a source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistHouse_aConnection_4044(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsLine_configuration_4045(
				visGrid.Connections source, visGrid.Line_configuration target) {
			if (source != null) {
				if (source.getLine_configuration().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsLine_configuration_4045(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsFault_check_4046(
				visGrid.Connections source, visGrid.Fault_check target) {
			if (source != null) {
				if (source.getFault_check().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsFault_check_4046(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDryerConnection_4047(visGrid.Dryer source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistDryerConnection_4047(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsPlayer_4048(
				visGrid.Connections source, visGrid.Player target) {
			if (source != null) {
				if (source.getPlayer().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsPlayer_4048(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateFault_checkConnection_4049(
				visGrid.Fault_check source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistFault_checkConnection_4049(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsClotheswasher_4050(
				visGrid.Connections source, visGrid.Clotheswasher target) {
			if (source != null) {
				if (source.getClotheswasher().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsClotheswasher_4050(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsLine_spacing_4051(
				visGrid.Connections source, visGrid.Line_spacing target) {
			if (source != null) {
				if (source.getLine_spacing().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsLine_spacing_4051(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsFuse_4052(
				visGrid.Connections source, visGrid.Fuse target) {
			if (source != null) {
				if (source.getFuse().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsFuse_4052(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsComm_4053(
				visGrid.Connections source, visGrid.Comm target) {
			if (source != null) {
				if (source.getComm().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsComm_4053(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsEvcharger_4054(
				visGrid.Connections source, visGrid.Evcharger target) {
			if (source != null) {
				if (source.getEvcharger().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsEvcharger_4054(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsLights_4055(
				visGrid.Connections source, visGrid.Lights target) {
			if (source != null) {
				if (source.getLights().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsLights_4055(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMultizoneConnection_4056(
				visGrid.Multizone source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistMultizoneConnection_4056(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsController_4057(
				visGrid.Connections source, visGrid.Controller target) {
			if (source != null) {
				if (source.getController().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsController_4057(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsSeries_reactor_4058(
				visGrid.Connections source, visGrid.Series_reactor target) {
			if (source != null) {
				if (source.getSeries_reactor().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsSeries_reactor_4058(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTransformer_configuration_4059(
				visGrid.Connections source,
				visGrid.Transformer_configuration target) {
			if (source != null) {
				if (source.getTransformer_configuration().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTransformer_configuration_4059(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsPqload_4060(
				visGrid.Connections source, visGrid.Pqload target) {
			if (source != null) {
				if (source.getPqload().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsPqload_4060(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsPower_electronics_4061(
				visGrid.Connections source, visGrid.Power_electronics target) {
			if (source != null) {
				if (source.getPower_electronics().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsPower_electronics_4061(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_line_conductorConnection_4062(
				visGrid.Triplex_line_conductor source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_line_conductorConnection_4062(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMotorConnection_4063(visGrid.Motor source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistMotorConnection_4063(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsCsv_reader_4064(
				visGrid.Connections source, visGrid.Csv_reader target) {
			if (source != null) {
				if (source.getCsv_reader().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsCsv_reader_4064(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateInverterConnection_4065(
				visGrid.Inverter source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistInverterConnection_4065(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsBilldump_4066(
				visGrid.Connections source, visGrid.Billdump target) {
			if (source != null) {
				if (source.getBilldump().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsBilldump_4066(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSubstationConnection_4067(
				visGrid.Substation source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistSubstationConnection_4067(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsSolar_4068(
				visGrid.Connections source, visGrid.Solar target) {
			if (source != null) {
				if (source.getSolar().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsSolar_4068(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePqloadConnection_4069(visGrid.Pqload source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistPqloadConnection_4069(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOfficeConnection_4070(visGrid.Office source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistOfficeConnection_4070(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsOccupantload_4071(
				visGrid.Connections source, visGrid.Occupantload target) {
			if (source != null) {
				if (source.getOccupantload().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsOccupantload_4071(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRefrigeratorConnection_4072(
				visGrid.Refrigerator source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRefrigeratorConnection_4072(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHouseConnection_4073(visGrid.House source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistHouseConnection_4073(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDc_dc_converterConnection_4074(
				visGrid.Dc_dc_converter source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistDc_dc_converterConnection_4074(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRectifierConnection_4075(
				visGrid.Rectifier source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRectifierConnection_4075(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsGenerator_4076(
				visGrid.Connections source, visGrid.Generator target) {
			if (source != null) {
				if (source.getGenerator().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsGenerator_4076(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRestorationConnection_4077(
				visGrid.Restoration source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRestorationConnection_4077(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBatteryConnection_4078(visGrid.Battery source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistBatteryConnection_4078(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsFreezer_4079(
				visGrid.Connections source, visGrid.Freezer target) {
			if (source != null) {
				if (source.getFreezer().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsFreezer_4079(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRange_4080(
				visGrid.Connections source, visGrid.Range target) {
			if (source != null) {
				if (source.getRange().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRange_4080(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRecorder_4081(
				visGrid.Connections source, visGrid.Recorder target) {
			if (source != null) {
				if (source.getRecorder().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRecorder_4081(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateFrequency_genConnection_4082(
				visGrid.Frequency_gen source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistFrequency_genConnection_4082(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTriplex_node_4083(
				visGrid.Connections source, visGrid.Triplex_node target) {
			if (source != null) {
				if (source.getTriplex_node().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTriplex_node_4083(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRegulatorConnection_4084(
				visGrid.Regulator source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRegulatorConnection_4084(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateControllerConnection_4085(
				visGrid.Controller source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistControllerConnection_4085(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCommConnection_4086(visGrid.Comm source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistCommConnection_4086(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsCollector_4087(
				visGrid.Connections source, visGrid.Collector target) {
			if (source != null) {
				if (source.getCollector().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsCollector_4087(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateVolt_var_controlConnection_4088(
				visGrid.Volt_var_control source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistVolt_var_controlConnection_4088(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateFreezerConnection_4089(visGrid.Freezer source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistFreezerConnection_4089(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRegulator_configuration_4090(
				visGrid.Connections source,
				visGrid.Regulator_configuration target) {
			if (source != null) {
				if (source.getRegulator_configuration().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRegulator_configuration_4090(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsMeter_4091(
				visGrid.Connections source, visGrid.Meter target) {
			if (source != null) {
				if (source.getMeter().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsMeter_4091(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsController2_4092(
				visGrid.Connections source, visGrid.Controller2 target) {
			if (source != null) {
				if (source.getController2().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsController2_4092(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateWindturb_dgConnection_4093(
				visGrid.Windturb_dg source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistWindturb_dgConnection_4093(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsDryer_4094(
				visGrid.Connections source, visGrid.Dryer target) {
			if (source != null) {
				if (source.getDryer().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsDryer_4094(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTriplex_line_4095(
				visGrid.Connections source, visGrid.Triplex_line target) {
			if (source != null) {
				if (source.getTriplex_line().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTriplex_line_4095(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEvchargerConnection_4096(
				visGrid.Evcharger source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistEvchargerConnection_4096(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsLink_4097(
				visGrid.Connections source, visGrid.Link target) {
			if (source != null) {
				if (source.getLink().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsLink_4097(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateStubauctionConnection_4098(
				visGrid.Stubauction source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistStubauctionConnection_4098(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateGeneratorConnection_4099(
				visGrid.Generator source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistGeneratorConnection_4099(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsMultizone_4100(
				visGrid.Connections source, visGrid.Multizone target) {
			if (source != null) {
				if (source.getMultizone().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsMultizone_4100(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateShaperConnection_4101(visGrid.Shaper source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistShaperConnection_4101(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsWindturb_dg_4102(
				visGrid.Connections source, visGrid.Windturb_dg target) {
			if (source != null) {
				if (source.getWindturb_dg().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsWindturb_dg_4102(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRecorderConnection_4103(
				visGrid.Recorder source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRecorderConnection_4103(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsPlugload_4104(
				visGrid.Connections source, visGrid.Plugload target) {
			if (source != null) {
				if (source.getPlugload().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsPlugload_4104(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsMicrowave_4105(
				visGrid.Connections source, visGrid.Microwave target) {
			if (source != null) {
				if (source.getMicrowave().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsMicrowave_4105(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDishwasherConnection_4106(
				visGrid.Dishwasher source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistDishwasherConnection_4106(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsZIPload_4107(
				visGrid.Connections source, visGrid.ZIPload target) {
			if (source != null) {
				if (source.getZIPload().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsZIPload_4107(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRectifier_4108(
				visGrid.Connections source, visGrid.Rectifier target) {
			if (source != null) {
				if (source.getRectifier().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRectifier_4108(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsHistogram_4109(
				visGrid.Connections source, visGrid.Histogram target) {
			if (source != null) {
				if (source.getHistogram().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsHistogram_4109(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsCapacitor_4110(
				visGrid.Connections source, visGrid.Capacitor target) {
			if (source != null) {
				if (source.getCapacitor().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsCapacitor_4110(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTransformer_configurationConnection_4111(
				visGrid.Transformer_configuration source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTransformer_configurationConnection_4111(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRegulator_4112(
				visGrid.Connections source, visGrid.Regulator target) {
			if (source != null) {
				if (source.getRegulator().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRegulator_4112(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCollectorConnection_4113(
				visGrid.Collector source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistCollectorConnection_4113(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsWaterheater_4114(
				visGrid.Connections source, visGrid.Waterheater target) {
			if (source != null) {
				if (source.getWaterheater().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsWaterheater_4114(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateDiesel_dgConnection_4115(
				visGrid.Diesel_dg source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistDiesel_dgConnection_4115(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsSwitch_4116(
				visGrid.Connections source, visGrid.Switch target) {
			if (source != null) {
				if (source.getSwitch().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsSwitch_4116(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLoadConnection_4117(visGrid.Load source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistLoadConnection_4117(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTransformer_4118(
				visGrid.Connections source, visGrid.Transformer target) {
			if (source != null) {
				if (source.getTransformer().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTransformer_4118(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePlayerConnection_4119(visGrid.Player source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistPlayerConnection_4119(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePlcConnection_4120(visGrid.Plc source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistPlcConnection_4120(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateController2Connection_4121(
				visGrid.Controller2 source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistController2Connection_4121(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsLine_4122(
				visGrid.Connections source, visGrid.Line target) {
			if (source != null) {
				if (source.getLine().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsLine_4122(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOverhead_lineConnection_4123(
				visGrid.Overhead_line source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistOverhead_lineConnection_4123(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHistogramConnection_4124(
				visGrid.Histogram source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistHistogramConnection_4124(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLine_spacingConnection_4125(
				visGrid.Line_spacing source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistLine_spacingConnection_4125(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_line_configurationConnection_4126(
				visGrid.Triplex_line_configuration source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_line_configurationConnection_4126(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTriplex_meter_4127(
				visGrid.Connections source, visGrid.Triplex_meter target) {
			if (source != null) {
				if (source.getTriplex_meter().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTriplex_meter_4127(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUnderground_line_conductorConnection_4128(
				visGrid.Underground_line_conductor source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistUnderground_line_conductorConnection_4128(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateVoltdumpConnection_4129(
				visGrid.Voltdump source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistVoltdumpConnection_4129(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCapacitorConnection_4130(
				visGrid.Capacitor source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistCapacitorConnection_4130(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsUnderground_line_4131(
				visGrid.Connections source, visGrid.Underground_line target) {
			if (source != null) {
				if (source.getUnderground_line().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsUnderground_line_4131(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSeries_reactorConnection_4132(
				visGrid.Series_reactor source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistSeries_reactorConnection_4132(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_meterConnection_4133(
				visGrid.Triplex_meter source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_meterConnection_4133(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsNode_4134(
				visGrid.Connections source, visGrid.Node target) {
			if (source != null) {
				if (source.getNode().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsNode_4134(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePower_electronicsConnection_4135(
				visGrid.Power_electronics source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistPower_electronicsConnection_4135(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsDiesel_dg_4136(
				visGrid.Connections source, visGrid.Diesel_dg target) {
			if (source != null) {
				if (source.getDiesel_dg().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsDiesel_dg_4136(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLineConnection_4137(visGrid.Line source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistLineConnection_4137(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAuctionConnection_4138(visGrid.Auction source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistAuctionConnection_4138(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMicrowaveConnection_4139(
				visGrid.Microwave source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistMicrowaveConnection_4139(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsLoad_4140(
				visGrid.Connections source, visGrid.Load target) {
			if (source != null) {
				if (source.getLoad().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsLoad_4140(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsFrequency_gen_4141(
				visGrid.Connections source, visGrid.Frequency_gen target) {
			if (source != null) {
				if (source.getFrequency_gen().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsFrequency_gen_4141(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRestoration_4142(
				visGrid.Connections source, visGrid.Restoration target) {
			if (source != null) {
				if (source.getRestoration().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRestoration_4142(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsMotor_4143(
				visGrid.Connections source, visGrid.Motor target) {
			if (source != null) {
				if (source.getMotor().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsMotor_4143(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateResidential_enduseConnection_4144(
				visGrid.Residential_enduse source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistResidential_enduseConnection_4144(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsWeather_4145(
				visGrid.Connections source, visGrid.Weather target) {
			if (source != null) {
				if (source.getWeather().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsWeather_4145(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsDishwasher_4146(
				visGrid.Connections source, visGrid.Dishwasher target) {
			if (source != null) {
				if (source.getDishwasher().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsDishwasher_4146(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsTriplex_line_configuration_4147(
				visGrid.Connections source,
				visGrid.Triplex_line_configuration target) {
			if (source != null) {
				if (source.getTriplex_line_configuration().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsTriplex_line_configuration_4147(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsBattery_4148(
				visGrid.Connections source, visGrid.Battery target) {
			if (source != null) {
				if (source.getBattery().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsBattery_4148(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUnderground_lineConnection_4149(
				visGrid.Underground_line source, visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistUnderground_lineConnection_4149(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsOverhead_line_conductor_4150(
				visGrid.Connections source,
				visGrid.Overhead_line_conductor target) {
			if (source != null) {
				if (source.getOverhead_line_conductor().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsOverhead_line_conductor_4150(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRangeConnection_4151(visGrid.Range source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistRangeConnection_4151(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsCapbank_4152(
				visGrid.Connections source, visGrid.Capbank target) {
			if (source != null) {
				if (source.getCapbank().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsCapbank_4152(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsVolt_var_control_4153(
				visGrid.Connections source, visGrid.Volt_var_control target) {
			if (source != null) {
				if (source.getVolt_var_control().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsVolt_var_control_4153(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateFuseConnection_4154(visGrid.Fuse source,
				visGrid.Connections target) {
			if (source != null) {
				if (source.getConnection().contains(target)) {
					return false;
				}
			}

			return canExistFuseConnection_4154(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsRelay_4155(
				visGrid.Connections source, visGrid.Relay target) {
			if (source != null) {
				if (source.getRelay().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsRelay_4155(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectionsOverhead_line_4156(
				visGrid.Connections source, visGrid.Overhead_line target) {
			if (source != null) {
				if (source.getOverhead_line().contains(target)) {
					return false;
				}
			}

			return canExistConnectionsOverhead_line_4156(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_nodeConnection_4001(
				visGrid.Triplex_node source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOverhead_line_conductorConnection_4002(
				visGrid.Overhead_line_conductor source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsHouse_a_4003(
				visGrid.Connections source, visGrid.House_a target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTriplex_line_conductor_4004(
				visGrid.Connections source,
				visGrid.Triplex_line_conductor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsEnergy_storage_4005(
				visGrid.Connections source, visGrid.Energy_storage target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsDc_dc_converter_4006(
				visGrid.Connections source, visGrid.Dc_dc_converter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRegulator_configurationConnection_4007(
				visGrid.Regulator_configuration source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsHouse_4008(
				visGrid.Connections source, visGrid.House target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistZIPloadConnection_4009(visGrid.ZIPload source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsClimate_4010(
				visGrid.Connections source, visGrid.Climate target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLine_configurationConnection_4011(
				visGrid.Line_configuration source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSwitchConnection_4012(visGrid.Switch source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLinkConnection_4013(visGrid.Link source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsUnderground_line_conductor_4014(
				visGrid.Connections source,
				visGrid.Underground_line_conductor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClimateConnection_4015(visGrid.Climate source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCapbankConnection_4016(visGrid.Capbank source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsStubauction_4017(
				visGrid.Connections source, visGrid.Stubauction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOccupantloadConnection_4018(
				visGrid.Occupantload source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistWaterheaterConnection_4019(
				visGrid.Waterheater source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNodeConnection_4020(visGrid.Node source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsShaper_4021(
				visGrid.Connections source, visGrid.Shaper target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsPlc_4022(visGrid.Connections source,
				visGrid.Plc target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsOffice_4023(
				visGrid.Connections source, visGrid.Office target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMeterConnection_4024(visGrid.Meter source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSolarConnection_4025(visGrid.Solar source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRelayConnection_4026(visGrid.Relay source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCsv_readerConnection_4027(
				visGrid.Csv_reader source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsAuction_4028(
				visGrid.Connections source, visGrid.Auction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLightsConnection_4029(visGrid.Lights source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRefrigerator_4030(
				visGrid.Connections source, visGrid.Refrigerator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistClotheswasherConnection_4031(
				visGrid.Clotheswasher source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPlugloadConnection_4032(visGrid.Plugload source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsVoltdump_4033(
				visGrid.Connections source, visGrid.Voltdump target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMicroturbineConnection_4034(
				visGrid.Microturbine source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBilldumpConnection_4035(visGrid.Billdump source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsInverter_4036(
				visGrid.Connections source, visGrid.Inverter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsResidential_enduse_4037(
				visGrid.Connections source, visGrid.Residential_enduse target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsSubstation_4038(
				visGrid.Connections source, visGrid.Substation target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_lineConnection_4039(
				visGrid.Triplex_line source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTransformerConnection_4040(
				visGrid.Transformer source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistWeatherConnection_4041(visGrid.Weather source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEnergy_storageConnection_4042(
				visGrid.Energy_storage source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsMicroturbine_4043(
				visGrid.Connections source, visGrid.Microturbine target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHouse_aConnection_4044(visGrid.House_a source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsLine_configuration_4045(
				visGrid.Connections source, visGrid.Line_configuration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsFault_check_4046(
				visGrid.Connections source, visGrid.Fault_check target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDryerConnection_4047(visGrid.Dryer source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsPlayer_4048(
				visGrid.Connections source, visGrid.Player target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistFault_checkConnection_4049(
				visGrid.Fault_check source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsClotheswasher_4050(
				visGrid.Connections source, visGrid.Clotheswasher target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsLine_spacing_4051(
				visGrid.Connections source, visGrid.Line_spacing target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsFuse_4052(visGrid.Connections source,
				visGrid.Fuse target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsComm_4053(visGrid.Connections source,
				visGrid.Comm target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsEvcharger_4054(
				visGrid.Connections source, visGrid.Evcharger target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsLights_4055(
				visGrid.Connections source, visGrid.Lights target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMultizoneConnection_4056(
				visGrid.Multizone source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsController_4057(
				visGrid.Connections source, visGrid.Controller target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsSeries_reactor_4058(
				visGrid.Connections source, visGrid.Series_reactor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTransformer_configuration_4059(
				visGrid.Connections source,
				visGrid.Transformer_configuration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsPqload_4060(
				visGrid.Connections source, visGrid.Pqload target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsPower_electronics_4061(
				visGrid.Connections source, visGrid.Power_electronics target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_line_conductorConnection_4062(
				visGrid.Triplex_line_conductor source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMotorConnection_4063(visGrid.Motor source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsCsv_reader_4064(
				visGrid.Connections source, visGrid.Csv_reader target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistInverterConnection_4065(visGrid.Inverter source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsBilldump_4066(
				visGrid.Connections source, visGrid.Billdump target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSubstationConnection_4067(
				visGrid.Substation source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsSolar_4068(
				visGrid.Connections source, visGrid.Solar target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPqloadConnection_4069(visGrid.Pqload source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOfficeConnection_4070(visGrid.Office source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsOccupantload_4071(
				visGrid.Connections source, visGrid.Occupantload target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRefrigeratorConnection_4072(
				visGrid.Refrigerator source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHouseConnection_4073(visGrid.House source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDc_dc_converterConnection_4074(
				visGrid.Dc_dc_converter source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRectifierConnection_4075(
				visGrid.Rectifier source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsGenerator_4076(
				visGrid.Connections source, visGrid.Generator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRestorationConnection_4077(
				visGrid.Restoration source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBatteryConnection_4078(visGrid.Battery source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsFreezer_4079(
				visGrid.Connections source, visGrid.Freezer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRange_4080(
				visGrid.Connections source, visGrid.Range target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRecorder_4081(
				visGrid.Connections source, visGrid.Recorder target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistFrequency_genConnection_4082(
				visGrid.Frequency_gen source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTriplex_node_4083(
				visGrid.Connections source, visGrid.Triplex_node target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRegulatorConnection_4084(
				visGrid.Regulator source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistControllerConnection_4085(
				visGrid.Controller source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCommConnection_4086(visGrid.Comm source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsCollector_4087(
				visGrid.Connections source, visGrid.Collector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistVolt_var_controlConnection_4088(
				visGrid.Volt_var_control source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistFreezerConnection_4089(visGrid.Freezer source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRegulator_configuration_4090(
				visGrid.Connections source,
				visGrid.Regulator_configuration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsMeter_4091(
				visGrid.Connections source, visGrid.Meter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsController2_4092(
				visGrid.Connections source, visGrid.Controller2 target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistWindturb_dgConnection_4093(
				visGrid.Windturb_dg source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsDryer_4094(
				visGrid.Connections source, visGrid.Dryer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTriplex_line_4095(
				visGrid.Connections source, visGrid.Triplex_line target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistEvchargerConnection_4096(
				visGrid.Evcharger source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsLink_4097(visGrid.Connections source,
				visGrid.Link target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistStubauctionConnection_4098(
				visGrid.Stubauction source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistGeneratorConnection_4099(
				visGrid.Generator source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsMultizone_4100(
				visGrid.Connections source, visGrid.Multizone target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistShaperConnection_4101(visGrid.Shaper source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsWindturb_dg_4102(
				visGrid.Connections source, visGrid.Windturb_dg target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRecorderConnection_4103(visGrid.Recorder source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsPlugload_4104(
				visGrid.Connections source, visGrid.Plugload target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsMicrowave_4105(
				visGrid.Connections source, visGrid.Microwave target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDishwasherConnection_4106(
				visGrid.Dishwasher source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsZIPload_4107(
				visGrid.Connections source, visGrid.ZIPload target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRectifier_4108(
				visGrid.Connections source, visGrid.Rectifier target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsHistogram_4109(
				visGrid.Connections source, visGrid.Histogram target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsCapacitor_4110(
				visGrid.Connections source, visGrid.Capacitor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTransformer_configurationConnection_4111(
				visGrid.Transformer_configuration source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRegulator_4112(
				visGrid.Connections source, visGrid.Regulator target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCollectorConnection_4113(
				visGrid.Collector source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsWaterheater_4114(
				visGrid.Connections source, visGrid.Waterheater target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistDiesel_dgConnection_4115(
				visGrid.Diesel_dg source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsSwitch_4116(
				visGrid.Connections source, visGrid.Switch target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLoadConnection_4117(visGrid.Load source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTransformer_4118(
				visGrid.Connections source, visGrid.Transformer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPlayerConnection_4119(visGrid.Player source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPlcConnection_4120(visGrid.Plc source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistController2Connection_4121(
				visGrid.Controller2 source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsLine_4122(visGrid.Connections source,
				visGrid.Line target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOverhead_lineConnection_4123(
				visGrid.Overhead_line source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHistogramConnection_4124(
				visGrid.Histogram source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLine_spacingConnection_4125(
				visGrid.Line_spacing source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_line_configurationConnection_4126(
				visGrid.Triplex_line_configuration source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTriplex_meter_4127(
				visGrid.Connections source, visGrid.Triplex_meter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistUnderground_line_conductorConnection_4128(
				visGrid.Underground_line_conductor source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistVoltdumpConnection_4129(visGrid.Voltdump source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCapacitorConnection_4130(
				visGrid.Capacitor source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsUnderground_line_4131(
				visGrid.Connections source, visGrid.Underground_line target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSeries_reactorConnection_4132(
				visGrid.Series_reactor source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_meterConnection_4133(
				visGrid.Triplex_meter source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsNode_4134(visGrid.Connections source,
				visGrid.Node target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPower_electronicsConnection_4135(
				visGrid.Power_electronics source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsDiesel_dg_4136(
				visGrid.Connections source, visGrid.Diesel_dg target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistLineConnection_4137(visGrid.Line source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAuctionConnection_4138(visGrid.Auction source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMicrowaveConnection_4139(
				visGrid.Microwave source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsLoad_4140(visGrid.Connections source,
				visGrid.Load target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsFrequency_gen_4141(
				visGrid.Connections source, visGrid.Frequency_gen target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRestoration_4142(
				visGrid.Connections source, visGrid.Restoration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsMotor_4143(
				visGrid.Connections source, visGrid.Motor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistResidential_enduseConnection_4144(
				visGrid.Residential_enduse source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsWeather_4145(
				visGrid.Connections source, visGrid.Weather target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsDishwasher_4146(
				visGrid.Connections source, visGrid.Dishwasher target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsTriplex_line_configuration_4147(
				visGrid.Connections source,
				visGrid.Triplex_line_configuration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsBattery_4148(
				visGrid.Connections source, visGrid.Battery target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistUnderground_lineConnection_4149(
				visGrid.Underground_line source, visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsOverhead_line_conductor_4150(
				visGrid.Connections source,
				visGrid.Overhead_line_conductor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRangeConnection_4151(visGrid.Range source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsCapbank_4152(
				visGrid.Connections source, visGrid.Capbank target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsVolt_var_control_4153(
				visGrid.Connections source, visGrid.Volt_var_control target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistFuseConnection_4154(visGrid.Fuse source,
				visGrid.Connections target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsRelay_4155(
				visGrid.Connections source, visGrid.Relay target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectionsOverhead_line_4156(
				visGrid.Connections source, visGrid.Overhead_line target) {
			return true;
		}
	}

}
