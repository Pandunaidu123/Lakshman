package LoopsInJava;

public class Switch {

	public static void main(String[] args) {
		int a=30;
		int marks=50;
		String s=new String("Mumbai");
	    switch(a)
		{
			case 10:
				System.out.println("India is the Developing country");
				break;
			case 20:
				System.out.println("This is 20");
				break;
			case 30:
				switch(marks)
				{
			case 50:
				System.out.println("This is 30");
				break;
		default:
				System.out.println("Hyderabad");
		
		}
		}
		

	}

}