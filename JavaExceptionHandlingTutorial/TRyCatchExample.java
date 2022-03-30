package JavaExceptionHandlingTutorial;

public class TRyCatchExample {
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		System.out.println("Try-Catch Example");
		try 
		{
			int c=a/b;

		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught..!!");
		}
	}
}
