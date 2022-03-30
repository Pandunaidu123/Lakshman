package LoopsInJava;

public class Nested
{
	public static void main(String[] args)
	{
		
		String str1 = new String("Goa");
	    String str2 = "Gowthami";
	    String str3 = str1.intern();
		System.out.println(str2);
		String city="Hyderabad";
		if(city=="Hyderabad")
		{
			System.out.println("Your city is Hyderabad");
		
		if(city=="Noida") {
			System.out.println("Your city is Noida");
		}
		else
		{
			System.out.println("Your city is Vijayawada");
		}
		}
		
	}
}