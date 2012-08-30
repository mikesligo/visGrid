package org.LiveGraph.events;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.LiveGraph.LiveGraph;

import com.softnetConsult.utils.exceptions.Bug;
import com.softnetConsult.utils.exceptions.ThrowableTools;
import com.softnetConsult.utils.exceptions.UnexpectedSwitchCase;


public class EventManager implements EventProducer {

private List<EventListener> listeners;
private Queue<Event<? extends EventType>> eventQueue;

private boolean shutDownWhenFinished;
private boolean shutDownImmediately;
private Thread eventDispatcher;

private List<ShutDownHook> shutDownHooks;

public EventManager() {
	
	listeners = new ArrayList<EventListener>();
	eventQueue = new LinkedList<Event<? extends EventType>>();
	shutDownWhenFinished = false;
	shutDownImmediately = false;
	eventDispatcher = null;
	shutDownHooks = new ArrayList<ShutDownHook>();
}

public boolean addShutDownHook(ShutDownHook hook) {
	if (null == hook)
		return false;
	if (shutDownHooks.contains(hook))
		return false;
	shutDownHooks.add(hook);
	return true;
}

public synchronized void startDispatchingEvents() {
	eventDispatcher = new Thread(new EventDispatcher(), "LiveGraph Event Dispatcher");
	eventDispatcher.start();
}

public synchronized void shutDownWhenFinished() {
	if (null == eventDispatcher)
		throw new IllegalStateException("Cannot shut down event dispatching as it is not running");
	shutDownWhenFinished = true;
	synchronized (eventQueue) {
	    eventQueue.notifyAll();
    }
}

public synchronized void shutDownImmediately() {
	if (null == eventDispatcher)
		throw new IllegalStateException("Cannot shut down event dispatching as it is not running");
	shutDownImmediately = true;
	synchronized (eventQueue) {
	    eventQueue.notifyAll();
    }
}

@SuppressWarnings("unused")
private void debug_printQueue() {
	synchronized (eventQueue) {
		System.out.println("Queue length: " + eventQueue.size());
		int i = 0;
		for (Event<? extends EventType> event : eventQueue) {
			System.out.printf("%3d) %s %n", i++, event.toString());
		}
	}
	System.out.println();
}

public void waitForEvents() {
	// Note that this method cannot guarantee an empty queue to the calling method since as soon as
	// this method is about to return, it looses the synchronisation lock on the event queue and a new
	// event may be enqued by another thread immediately. However, this method does guarantee that
	// all events that have been enqueued before this method was called have finished processing.
	
	Event<SystemEvent> noop = new Event<SystemEvent>(this, SystemEvent.class, SystemEvent.SYS_NoOp);
	raiseEvent(noop);
	synchronized (eventQueue) {
		while (!eventQueue.isEmpty() && !mustShutDown()) {
			eventQueue.notifyAll();
			try	{ eventQueue.wait(1000); }
			catch(InterruptedException e) { }
		}
    }
}

private synchronized boolean mustShutDown() {
	
	if (shutDownImmediately)
		return true;
	
	synchronized (eventQueue) {
		if (shutDownWhenFinished)
			return eventQueue.isEmpty();
		return false;
	}
}

private synchronized void hasShutDown() {
	eventDispatcher = null;
	for (ShutDownHook hook : shutDownHooks)
		hook.hasShutDown(this);
}

public boolean registerListener(EventListener listener) {
	
	if (null == listener)
		return false;
	
	synchronized(listeners) {
		
		if (managesListener(listener))
			return false;
		
		if (!listener.permissionRegisterWithEventManager(this))
			return false;
		
		listeners.add(listener);
		listener.completedRegisterWithEventManager(this);
		return true;
	}
}

public boolean managesListener(EventListener listener) {
	
	if (null == listener)
		return false;
	
	synchronized(listeners) {
	
		for (EventListener listen : listeners) {
			if (listen == listener)
				return true;
		}
		return false;
	}
}

public boolean unregisterListener(EventListener listener) {

	if (null == listener)
		return false;
	
	synchronized(listeners) {
	
		for (int i = 0; i < listeners.size(); i++) {
		
			EventListener listen = listeners.get(i);
			if (listen == listener) {
				if (!listen.permissionUnregisterWithEventManager(this))
					return false;
				
				listeners.remove(i);
				listen.completedRegisterWithEventManager(this);
				return true;
			}		
		}
		return false;
	}
}

public int countAllListeners() {
	synchronized(listeners) {
		return listeners.size();
	}
}

public List<EventListener> getInterestedListeners(Event<? extends EventType> event)
																	throws EventProcessingException {
	
	// Never work with null events:
	if (null == event)
		throw new NullPointerException("Cannot get interested listeners for a null event");
	
	// Go for it:
	synchronized(listeners) {
		
		List<EventListener> interested = new ArrayList<EventListener>();
		EventProcessingException exceptionContainer = null;
		
		for (EventListener listener : listeners) {
			
			try {
				
				if (listener.checkEventInterest(event))
					interested.add(listener);
				
			} catch(Exception ex) {
				if (null == exceptionContainer)
					exceptionContainer = new EventProcessingException();
				exceptionContainer.addCause(event, listener, ex);
			}
		}
		
		if (null != exceptionContainer)
			throw exceptionContainer;
		
		return Collections.unmodifiableList(interested);
	}
}

public boolean validateEvent(Event<? extends EventType> event) throws EventProcessingException,
																	  ValidationRequirementException {
	
	// Never work with null events:
	if (null == event)
		throw new NullPointerException("Cannot validate a null event");
	
	// Check the validation annotation and make sure not to throw a never-validate type event: 
	switch(event.getValidationRequirement()) {
		
		default:
			throw new UnexpectedSwitchCase(event.getValidationRequirement());
		
		case MUST_VALIDATE:
		case MAY_VALIDATE:
			break; // ok, lets validate.
			
		case NEVER_VALIDATE:
			throw new ValidationRequirementException(
										event, ValidationRequirementException.FailedOperation.VALIDATE);
	}
	
	// Lock the listeners and perform validation:
	synchronized(listeners) {

		// Holders:
		EventProcessingException exceptionContainer = null;
		boolean valid = true;
	
		// Perform validation for each listener:
		for (EventListener listener : listeners) {
		
			try {
				
				// Validate for current listener:
				if (!listener.checkEventValid(event, valid))
					valid = false;
				
			} catch(Exception ex) {
				// Catch all exceptions and remember them for later:
				if (null == exceptionContainer)
					exceptionContainer = new EventProcessingException();
				exceptionContainer.addCause(event, listener, ex);
			}		
		}
		
		// If we had exception it is not time to them them inside a container:
		if (null != exceptionContainer)
			throw exceptionContainer;
		
		// Set and return the validation result:
		event.setValidated(valid);
		return valid;
	}
}

public void raiseEvent(Event<? extends EventType> event) throws ValidationRequirementException {
	
	
	// Disallow null events:
	if (null == event)
		throw new NullPointerException("Cannot raise a null event");
	
	// Check the validation annotation and make sure not to throw events that still require validation: 
	switch(event.getValidationRequirement()) {
		
		default:
			throw new UnexpectedSwitchCase(event.getValidationRequirement());
		
		case MUST_VALIDATE:
			if (!event.validated()) {
				throw new ValidationRequirementException(						
											event, ValidationRequirementException.FailedOperation.RAISE);
			}
			break;
			
		case MAY_VALIDATE:
		case NEVER_VALIDATE:
			break; // For these validation is not compulsory.
	}
	

	
	// Enqueue the event and notify the dispatcher:
	synchronized(eventQueue) {
		eventQueue.add(event);
		eventQueue.notifyAll();
    }
}

public boolean eventValidateRaise(Event<? extends EventType> event) throws EventProcessingException {

	if (!validateEvent(event))
		return false;
	
	raiseEvent(event);
	return true;
}


// Called by EventDispatcher.run()
private void doRaiseEvent(Event<? extends EventType> event) throws EventProcessingException {
	
	// Synchromise on listeners:
	synchronized(listeners) {
		
		// Will hold any excaptions that may occur:
		EventProcessingException exceptionContainer = null;
			
		// Notify every listener:
		for (EventListener listener : listeners) {
		
			try {
				
				// Invoke listener handler:
				listener.eventRaised(event);
				
			} catch(Throwable ex) {
				
				// If exception occured - save it: 
				if (null == exceptionContainer)
					exceptionContainer = new EventProcessingException();
				exceptionContainer.addCause(event, listener, ex);
				
				// For exceptions - invoke all remaining listeners, for errors - break immediately:
				if (ex instanceof Exception) {						
				} else if (ex instanceof Error) {
					break;
				} else {
					throw new Bug("Unexpected subclass of Throwable: " + ex.getClass().getName());
				}
			}		
		} // for (EventListener listener : listeners)
		
		// If there was an exception - 
		if (null != exceptionContainer)
			throw exceptionContainer;
	}
}

private void raiseExceptionOccured(Event<? extends EventType> event, EventProcessingException exception) {
	
	justDisplayException(exception);
	
	if (event != null && SystemEvent.SYS_EventProcessingException == event.getType()) {
		Event<SystemEvent> exceptionEvent = new Event<SystemEvent>(this, SystemEvent.class,
																   SystemEvent.SYS_EventProcessingException,
																   exception);
		raiseEvent(exceptionEvent);
	}
}

private void justDisplayException(Throwable ex) {
	ex.printStackTrace();
	try {
		String err = ThrowableTools.stackTraceToString(ex);
		LiveGraph.application().guiManager().logErrorLn(err);
	} catch(Throwable ex2) {
		ex2.printStackTrace();
	}
}

public void eventProcessingFinished(Event<? extends EventType> event) {	
}

public boolean eventProcessingException(Event<? extends EventType> event, EventProcessingException exception) {
	return false;
}

private class EventDispatcher implements Runnable {

	public void run() {
		try {
			while(true) {
				try {			
					if (mustShutDown())
						return;
					runProtected();				
				} catch(Throwable e) {
					justDisplayException(e);
				}
			}
		} finally {
			hasShutDown();
		}
	}

	private void runProtected() {
		
		// Save the next event here:
		Event<? extends EventType> event = null;
		
		// Get hold of event queue:
		synchronized (eventQueue) {
			
			// While event queue is empty - wait:
			while(eventQueue.isEmpty()) {
				
				// If must shut down - quit:
				if (mustShutDown())
					return;
				
				// Wait for the queue to fill:
				try	{ eventQueue.wait(1000); }
				catch(InterruptedException e) { }
			}
			
			// Queue is not empty - remove head and proceed:
			event = eventQueue.poll();
			eventQueue.notifyAll();
        }
				
		try {
			// Raise the event:
			doRaiseEvent(event);
			event.getProducer().eventProcessingFinished(event);
			
		} catch(EventProcessingException ex) {
			
			// If an exception occured during RAISING (other exceptions fall through):
			
			// Notify producer that sent the event that lead to exception:
			boolean exceptionConsumed = false;
			try {
				exceptionConsumed = event.getProducer().eventProcessingException(event, ex);				
			} catch (Throwable ex2) {				
				// If another exception occured during notifying the producer, display it and recover: 
				justDisplayException(ex2);
			}
			
			// Only IF the procuder of the event that lead to the exception does not signal that it
			// consumed the exception THEN notify ALL listeners of the exception (and also print it): 
			if (!exceptionConsumed)
				raiseExceptionOccured(event, ex);
		}
	}

}  // private class EventDispatcher

public static interface ShutDownHook {
	public void hasShutDown(EventManager eventManager);
}  // public static class ShutDownHook

}  // public class EventManager
