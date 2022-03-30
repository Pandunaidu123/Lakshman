package JavaExceptionHandlingTutorial;

import com.sun.org.apache.bcel.internal.classfile.CodeException;

class InvalidAgeException  extends Exception  
{  
	public InvalidAgeException (String str)  
	{  
		// calling the constructor of parent Exception  
		super(str);  
	}  
}  

// class that uses custom exception InvalidAgeException  
