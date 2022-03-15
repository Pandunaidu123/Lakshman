package Javaprogram;

public class For3 {
	public static void main(String[] args)
	{
		String s="Babu Techouts";
		int age=61;
		boolean bool=true;
		while(bool)
		{
			if(age<=18)
			{
				System.out.println(s+ "is eligible to take the voting right");
			}
			else if(age==60)
			{
				System.out.println(s+ "is eligible to take the pension from Govt.");
			}
			else
			{
				System.out.println(s+ " is not a eligible citizen for above schemes");
			}
			bool=false;
		}
	}
}