package AnnotationEnumRegex;

import java.util.regex.*;
public class Regex1 {
	public static void main(String[] args)
	{
		//First method
		Pattern p=Pattern.compile("....s");
		Matcher m=p.matcher("assss");
		boolean b= m.matches();
		System.out.println("------------------------------------------------------");
		boolean b2=Pattern.compile(".s").matcher("as").matches(); //2nd Method
		System.out.println("------------------------------------------------------");
		//3rd way
		boolean b3= Pattern.matches(".s", "as");
		System.out.println("------------------------------------------------------");

		System.out.println(b);
		System.out.println();
		System.out.println(b2);
		System.out.println();
		System.out.println(b3);
	}
	

}
