package org.LiveGraph.events;

import java.io.PrintStream;
import java.io.PrintWriter;

public class UncheckedEventProcessingException extends RuntimeException {

public UncheckedEventProcessingException(EventProcessingException actualException) {
	super(actualException);
}

@Override
public EventProcessingException getCause() {
	return (EventProcessingException) super.getCause();
}

@Override
public synchronized String getLocalizedMessage() {
	return "Actual exception: " + getCause().getLocalizedMessage();
}

@Override
public synchronized void printStackTrace(PrintWriter s) {
	synchronized (s) {
        s.println(this);
        StackTraceElement[] trace = getStackTrace();
        for (int i = 0; i < trace.length; i++)
            s.println("\tat " + trace[i]);
        s.flush();
        
        s.print("Acual exception: ");
        getCause().printStackTrace(s);        
        s.flush();
    }
}

@Override
public synchronized void printStackTrace(PrintStream s) {	
	PrintWriter out = new PrintWriter(s);
	printStackTrace(out);
}

}
