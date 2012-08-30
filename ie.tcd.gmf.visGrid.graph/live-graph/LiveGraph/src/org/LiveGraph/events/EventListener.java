package org.LiveGraph.events;

public interface EventListener {

	public boolean checkEventInterest(Event<? extends EventType> event) throws Exception;
	public boolean checkEventValid(Event<? extends EventType> event, boolean soFar) throws Exception;
	public void eventRaised(Event<? extends EventType> event) throws Exception;
	
	public boolean permissionRegisterWithEventManager(EventManager manager);
	public boolean permissionUnregisterWithEventManager(EventManager manager);
	public void completedRegisterWithEventManager(EventManager manager);
	public void completedUnregisterWithEventManager(EventManager manager);

}
