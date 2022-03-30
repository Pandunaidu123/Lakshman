package AnnotationEnumRegex;

public class Annotation
{
@SuppressWarnings(value = { "Unchecked" })
public static void main(String[] args)
{


	NokiaASeries obj=new NokiaASeries("Fire",5);
	Class c=obj.getClass();
	java.lang.annotation.Annotation an = c.getAnnotation(SmartPhone.class);
	SmartPhone s= (SmartPhone) an;
	System.out.println(s.os());
	System.out.println(s.version());
	
}
}

