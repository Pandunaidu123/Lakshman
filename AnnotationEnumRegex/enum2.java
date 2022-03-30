package AnnotationEnumRegex;

public class enum2 {
	enum Season{
		WINTER(10),SUMMER(20),SPRING(30),AUTUMN(40),FALL(50);

		private int i;

		Season(int i) {
			this.i=i;
		}
	}
	public static void main(String[] args)
	{
		for(Season s: Season.values())
			System.out.println(s+" "+s.i);
	}


}



