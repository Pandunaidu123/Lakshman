package Collections1;

import java.util.*;
public class Comparable1
{
	public static void main(String[] args)
	{
	
		ArrayList<Student> al= new ArrayList<Student>(); 
		al.add(new Student(101, "vijay ", 20));
		al.add(new Student(102, "Siddu ", 21));
		al.add(new Student(103, "Raju  ", 22));
		al.add(new Student(101, "Siddu ", 23));
		al.add(new Student(102, "Pavan ", 24));
		al.add(new Student(103, "Kushi ", 25));
		Collections.sort(al);
		for(Student st:al)
		{
			//System.out.println(st.rollno+" "+st.name+" "+st.age);
			//System.out.println(st.rollno);
			//System.out.println(st.name);
			//System.out.println(st.age);
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		
		}
	}
}
