package AnnotationEnumRegex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SuppressWarnings(value = { "Unchecked" })
@interface SmartPhone
{
	String os() default "Symbian";
	int version() default 1;
	
}