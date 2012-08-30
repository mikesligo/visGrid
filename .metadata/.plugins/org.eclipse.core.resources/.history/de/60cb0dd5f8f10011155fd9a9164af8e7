package org.LiveGraph.events;


public class ValidationRequirementException extends RuntimeException {

public static enum FailedOperation { VALIDATE, RAISE }

private Event<? extends EventType> event;
private FailedOperation failedOperation;

public ValidationRequirementException(Event<? extends EventType> event, FailedOperation failedOperation) {
	super("Cannot perform operation "
		+ (null == failedOperation ? "NULL" : failedOperation.toString())
		+ " on an event of type "
		+ (null == event ? "NULL" : event.getType().toString())
		+ " with a validation requirement "
		+ (null == event ? "NULL" : event.getValidationRequirement().toString())
		+ " and a current validation status "
		+ (null == event ? "NULL" : (event.validated() ? "VALIDATED" : "NOT-VALIDATED")));
	this.event = event;
	this.failedOperation = failedOperation;
}

public Event<? extends EventType> getEvent() {
	return event;
}

public FailedOperation getFailedOperation() {
	return failedOperation;
}

}
