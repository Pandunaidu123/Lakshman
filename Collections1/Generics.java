package Collections1;

import java.util.*;

public class Generics {
	public static void main(String[] args)

	{
		
		int value=5;
		int a=10,b=0;
		Vector values =new Vector();
		values.add(1);
		values.add(10);
		values.add(100);
		values.add(1000);
		values.add("Siddu");
		values.add("Badri");
		values.add("Johnny");
		Iterator itr=values.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		try {
			
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		//throws new ArithmeticException("Exception Caught");
		System.out.println("Rest of the code remains as it is....!!");
			
	}

}
