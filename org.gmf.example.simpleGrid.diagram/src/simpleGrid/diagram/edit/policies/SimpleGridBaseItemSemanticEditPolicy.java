package simpleGrid.diagram.edit.policies;

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
public class SimpleGridBaseItemSemanticEditPolicy extends SemanticEditPolicy {

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
	protected SimpleGridBaseItemSemanticEditPolicy(IElementType elementType) {
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
						simpleGrid.diagram.part.SimpleGridVisualIDRegistry
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
					simpleGrid.diagram.edit.helpers.SimpleGridBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(
				simpleGrid.diagram.edit.helpers.SimpleGridBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(
				simpleGrid.diagram.edit.helpers.SimpleGridBaseEditHelper.EDIT_POLICY_COMMAND,
				null);
		request.setParameter(
				simpleGrid.diagram.edit.helpers.SimpleGridBaseEditHelper.CONTEXT_ELEMENT_TYPE,
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
		IElementType requestContextElementType = simpleGrid.diagram.providers.SimpleGridElementTypes
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
		LinkConstraints cached = simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			simpleGrid.diagram.part.SimpleGridDiagramEditorPlugin.getInstance()
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
		public boolean canCreateTransformerTransformer_configuration_4006(
				simpleGrid.Transformer source,
				simpleGrid.Transformer_configuration target) {
			if (source != null) {
				if (source.getTransformer_configuration().contains(target)) {
					return false;
				}
			}

			return canExistTransformerTransformer_configuration_4006(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHouseWaterheater_4017(simpleGrid.House source,
				simpleGrid.Waterheater target) {
			if (source != null) {
				if (source.getWaterheater().contains(target)) {
					return false;
				}
			}

			return canExistHouseWaterheater_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_Line_configurationTriplex_line_conductor_4008(
				simpleGrid.Triplex_Line_configuration source,
				simpleGrid.Triplex_line_conductor target) {
			if (source != null) {
				if (source.getTriplex_line_conductor().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_Line_configurationTriplex_line_conductor_4008(
					source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_lineTriplex_line_configuration_4011(
				simpleGrid.Triplex_line source,
				simpleGrid.Triplex_Line_configuration target) {
			if (source != null) {
				if (source.getTriplex_line_configuration().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_lineTriplex_line_configuration_4011(source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_nodeTriplex_line_4005(
				simpleGrid.Triplex_node source, simpleGrid.Triplex_line target) {
			if (source != null) {
				if (source.getTriplex_line().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_nodeTriplex_line_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateNodeTransformer_4014(simpleGrid.Node source,
				simpleGrid.Transformer target) {
			if (source != null) {
				if (source.getTransformer().contains(target)) {
					return false;
				}
			}

			return canExistNodeTransformer_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_meterHouse_4001(
				simpleGrid.Triplex_meter source, simpleGrid.House target) {
			if (source != null) {
				if (source.getHouse().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_meterHouse_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTriplex_lineTriplex_meter_4007(
				simpleGrid.Triplex_line source, simpleGrid.Triplex_meter target) {
			if (source != null) {
				if (source.getTriplex_meter().contains(target)) {
					return false;
				}
			}

			return canExistTriplex_lineTriplex_meter_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTransformerTriplex_node_4013(
				simpleGrid.Transformer source, simpleGrid.Triplex_node target) {
			if (source != null) {
				if (source.getTriplex_node().contains(target)) {
					return false;
				}
			}

			return canExistTransformerTriplex_node_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistTransformerTransformer_configuration_4006(
				simpleGrid.Transformer source,
				simpleGrid.Transformer_configuration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHouseWaterheater_4017(simpleGrid.House source,
				simpleGrid.Waterheater target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_Line_configurationTriplex_line_conductor_4008(
				simpleGrid.Triplex_Line_configuration source,
				simpleGrid.Triplex_line_conductor target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_lineTriplex_line_configuration_4011(
				simpleGrid.Triplex_line source,
				simpleGrid.Triplex_Line_configuration target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_nodeTriplex_line_4005(
				simpleGrid.Triplex_node source, simpleGrid.Triplex_line target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistNodeTransformer_4014(simpleGrid.Node source,
				simpleGrid.Transformer target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_meterHouse_4001(
				simpleGrid.Triplex_meter source, simpleGrid.House target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTriplex_lineTriplex_meter_4007(
				simpleGrid.Triplex_line source, simpleGrid.Triplex_meter target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTransformerTriplex_node_4013(
				simpleGrid.Transformer source, simpleGrid.Triplex_node target) {
			return true;
		}
	}

}
