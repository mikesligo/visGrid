package org.LiveGraph.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Validation {
	
	public static enum Requirement { MUST_VALIDATE, MAY_VALIDATE, NEVER_VALIDATE }
	public Requirement value() default Requirement.MAY_VALIDATE;
}
