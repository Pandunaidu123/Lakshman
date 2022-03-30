package JavaExceptionHandlingTutorial;

public class ArithmeticExceptions {
	public static void main(String[] args)
	{
		int b=0;
		try {
			int c=10/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}

		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		catch(Exception e)
		{
			System.out.println("Exception Raised");
		}
		
	}
}


