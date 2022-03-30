package JavaOOps;

public class Finally {
	public static void main(String[] args)
	{
		int a=25;
		int b=5;
		try
		{
			int c=a/b;
			System.out.println(c);
			System.out.println("This doesn't raise any exception beacuse this is not an exception");
			
		}
		catch(NullPointerException e)
		{
		   System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed ");
		}
		System.out.println("Rest of the code");
	}
}
