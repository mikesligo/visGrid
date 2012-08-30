package org.LiveGraph.events;

public class EventAnnotation {

private EventListener listener;
private Object info;

public EventAnnotation(EventListener listener, Object info) {
	if (null == listener)
		throw new NullPointerException("May not create EventAnnotation for a null listener");
	this.listener = listener;
	this.info = info;
}

public EventListener getListener() {
	return listener;
}

public Object getInfo() {
	return info;
}

@Override
public String toString() {
	return "EventAnnotation {listener=("
			+ listener.toString() + "); info=("
			+ (null == info ? "null" : info.toString()) + ");}";
}

@Override
public boolean equals(Object o) {
	if (o == null)
		return false;
	if (o instanceof EventAnnotation)
		return equals((EventAnnotation) o);
	
	return false;
}

public boolean equals(EventAnnotation o) {
	if (o == null)
		return false;
	
	return getListener().equals(o.getListener())
			&& ( (getInfo() == o.getInfo()) || (getInfo().equals(o.getInfo())) );
}

}
