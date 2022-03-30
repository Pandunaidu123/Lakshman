package AnnotationEnumRegex;

public class EnumExample {
	public enum Season{WINTER,SUMMER,SPRING(),AUTUMN,FALL}
	public static void main(String[] args)
	{
		Season s=Season.SPRING;
		Season s2=Season.FALL; 
		System.out.println(s);
		System.out.println(s2);
		for(Season s1 :Season.values())
		{
			System.out.println(s1);
			
		}
		System.out.println("Lenth of enum is : "+Season.values().length);
		System.out.println("Value of WINTER is : "+Season.valueOf("WINTER"));
		System.out.println("Value of WINTER is : "+Season.valueOf("WINTER").ordinal());
		System.out.println("Value of WINTER is : "+Season.valueOf("SPRING").ordinal());
		System.out.println("Value of WINTER is : "+Season.valueOf("SUMMER").ordinal());
		System.out.println("Value of WINTER is : "+Season.valueOf("AUTUMN").ordinal());
		System.out.println("Value of WINTER is : "+Season.valueOf("FALL").ordinal());
	}

}
