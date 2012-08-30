package org.LiveGraph.events;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventProcessingException extends Exception {

private List<Cause> causes;

public EventProcessingException() {
	causes = new ArrayList<Cause>();
}

public synchronized void addCause(Event<? extends EventType> event, EventListener listener, Throwable exception) {
	causes.add(new Cause(event, listener, exception));
}

public synchronized int countCauses() {
	return causes.size();
}

public synchronized List<Cause> getCauses() {
	return Collections.unmodifiableList(causes);
}

@Override
public synchronized String getLocalizedMessage() {
	String s = String.format("EventProcessingException caused by %d actual Throwable(s):%n", countCauses());
	for (int i = 0; i < causes.size(); i++) {
		Cause c = causes.get(i);
		s += String.format("(#%d) Event: %s. Listener: %s.%n",
						   i + 1,
						   (null == c.getCausingEvent() ? "null" : c.getCausingEvent().toString()),
						   (null == c.getCausingListener() ? "null" : c.getCausingListener().toString()));
		
		s += String.format("(#%d) Throwable: %s.%n",
						   i + 1,
						   (null == c.getCausingException() ? "null" : c.getCausingException().toString()));
	}
	return s;
}

@Override
public synchronized void printStackTrace(PrintStream s) {	
	PrintWriter out = new PrintWriter(s);
	printStackTrace(out);
}

@Override
public synchronized void printStackTrace(PrintWriter s) {
	synchronized (s) {
        s.println(this);
        StackTraceElement[] trace = getStackTrace();
        for (int i = 0; i < trace.length; i++)
            s.println("\tat " + trace[i]);
        s.flush();
        
        for (int i = 0; i < causes.size(); i++) {
        	s.printf("Cause #%d of %d: %n", i + 1, countCauses());
        	Cause c = causes.get(i);
        	if (null != c.getCausingException())
        		c.getCausingException().printStackTrace(s);
        }
        s.flush();
    }
}


public static class Cause {

	private Event<? extends EventType> event;
	private EventListener listener;
	private Throwable exception;
	
	public Cause(Event<? extends EventType> ev, EventListener li, Throwable ex) {
		event = ev;
		listener = li;
		exception = ex;
	}
	
	public Event<? extends EventType> getCausingEvent() {
		return event;
	}
	
	public EventListener getCausingListener() {
		return listener;
	}
	
	public Throwable getCausingException() {
		return exception;
	}
	
} // private static class Cause

}
