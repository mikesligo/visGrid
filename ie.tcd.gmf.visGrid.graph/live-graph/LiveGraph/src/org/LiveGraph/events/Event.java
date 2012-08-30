package org.LiveGraph.events;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.softnetConsult.utils.exceptions.Bug;


public class Event<ET extends EventType> {

public static final boolean SAFE_EVENT_CAST = true;

private EventProducer producer;
private Class<? extends ET> domain;
private ET type;

private boolean hasValidated;

public boolean infoBoolean;
public long infoLong;
public double infoDouble;
public Object infoObject;

private List<EventAnnotation> annotations;
private List<EventAnnotation> exposedAnnotations;

public Event(EventProducer producer, Class<? extends ET> domain, ET type) {
	
	if (null == producer)	throw new NullPointerException("Cannot construct event for a null producer");
	if (null == domain)		throw new NullPointerException("Cannot construct event for a null domain");
	if (null == type)		throw new NullPointerException("Cannot construct event for a null type");
	
	this.producer = producer;
	this.domain = domain;
	this.type = type;
	
	this.hasValidated = false;
	
	this.infoBoolean = false;
	this.infoLong = 0L;
	this.infoDouble = Double.NaN;
	this.infoObject = null;
	
	this.annotations = null;
	this.exposedAnnotations = null;
}

public Event(EventProducer producer, Class<? extends ET> domain, ET type, boolean info) {
	this(producer, domain, type);
	this.infoBoolean = info;
}

public Event(EventProducer producer, Class<? extends ET> domain, ET type, long info) {
	this(producer, domain, type);
	this.infoLong = info;
}

public Event(EventProducer producer, Class<? extends ET> domain, ET type, double info) {
	this(producer, domain, type);
	this.infoDouble = info;
}

public Event(EventProducer producer, Class<? extends ET> domain, ET type, Object info) {
	this(producer, domain, type);
	this.infoObject = info;
}

public Event(EventProducer producer, Class<? extends ET> domain, ET type,
			 boolean infoBoolean, long infoLong, double infoDouble, Object infoObject) {
	this(producer, domain, type);
	this.infoBoolean = infoBoolean;
	this.infoLong = infoLong;
	this.infoDouble = infoDouble;
	this.infoObject = infoObject;
}

@SuppressWarnings("unchecked")
public <T extends EventType> Event<T> cast(Class<T> domain) {
	
	if (SAFE_EVENT_CAST) {
	
		if (null == domain)
			throw new NullPointerException("Cannot cast event to a null target domain");
		
		if (!getDomain().isAssignableFrom(domain)) {
			throw new ClassCastException("Cannot cast this event of type "
								+ this.getClass().getName() + "<" + getDomain().getName() + "> "
								+ "to Event<" + domain.getName() + ">");
		}
	}
	
	return (Event<T>) this;
}

public EventProducer getProducer() {
	return producer;
}

public Class<? extends ET> getDomain() {
	return domain;
}

public ET getType() {
	return type;
}

public boolean validated() {
	return hasValidated;
}

protected void setValidated(boolean validated) {
	hasValidated = validated;
}

public Validation.Requirement getValidationRequirement() {
	
	Class<? extends EventType> typeClass = type.getClass();
	Validation validation = typeClass.getAnnotation(Validation.class);
	if (null != validation)
		return validation.value();
	
	// If the event type is an enum, the annotation may have been attached not to the
	// class itself, but to the "field", i.e. the enum constant:
	if (typeClass.isEnum()) {
		
		try {
			Field declaringField = typeClass.getField(type.toString());
			validation = declaringField.getAnnotation(Validation.class);
		} catch(NoSuchFieldException e) {
			throw new Bug("This should never happen!", e);
		}
		
		if (null != validation)
			return validation.value();
	}
	
	return Validation.Requirement.MAY_VALIDATE;
}

public boolean getInfoBoolean() {
	return infoBoolean;
}

public long getInfoLong() {
	return infoLong;
}

public double getInfoDouble() {
	return infoDouble;
}

public Object getInfoObject() {
	return infoObject;
}

public void addAnnotation(EventListener listener, Object annotationInfo) {
	if (null == listener)
		throw new NullPointerException("A null EventListener cannot add an EventAnnotation");
	if (null == annotations)
		annotations = new ArrayList<EventAnnotation>();
	annotations.add(new EventAnnotation(listener, annotationInfo));
	exposedAnnotations = null;
}


public List<EventAnnotation> getAnnotations() {
	if (null == exposedAnnotations) {
		
		if (null == annotations)
			return Collections.emptyList();
		
		exposedAnnotations = new ArrayList<EventAnnotation>();
		for (EventAnnotation annotation : annotations)
			exposedAnnotations.add(annotation);
		exposedAnnotations = Collections.unmodifiableList(exposedAnnotations);
	}
	return exposedAnnotations;
}

public List<EventAnnotation> getAnnotations(EventListener byListener) {
	
	if (null == annotations)
		return Collections.emptyList();
	
	if (null == byListener)
		return getAnnotations();
	
	List<EventAnnotation> listenerAnnotations = new ArrayList<EventAnnotation>();
	for (EventAnnotation annotation : annotations) {
		if (annotation.getListener() == byListener)
			listenerAnnotations.add(annotation);
	}
	return Collections.unmodifiableList(listenerAnnotations);
}

@Override
public String toString() {
	String s = super.toString() + "{";
	s += "type=(" + getType().toString() + ");";
	s += "producer=(" + getProducer().toString() + ");";
	s += "info=(";
	s += "bool:" + getInfoBoolean() + ";";
	s += "long:" + getInfoLong() + ";";
	s += "dble:" + getInfoDouble() + ";";
	s += "objt:" + getInfoObject() + ";";
	s += ");";
	s += "validated=(" + (validated() ? "Y" : "N") + ");";
	s += "valid-reqr=(" + getValidationRequirement() + ");";
	s += "annotations=(" + (null == annotations ? 0 : annotations.size()) + ");";
	s += "}";
	return s;
}

}
