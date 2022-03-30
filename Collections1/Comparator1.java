package Collections1;

import java.util.*; 

public class Comparator1{    
	public static void main(String args[]){    
		ArrayList<Student> al=new ArrayList<Student>();    
		al.add(new Student(101,"Vijay",23));    
		al.add(new Student(106,"Ajay",27));    
		al.add(new Student(105,"Jai",21));   
		//Sorting elements on the basis of name  
		Comparator<Student1> cm1=Comparator.comparing(Student1::getName);  
		Comparator cm2 = null;
		Collections.sort(al,cm2);  
		System.out.println("Sorting by Name");  
		for(Student st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		//Sorting elements on the basis of age  
		Comparator<Student1> cm21=Comparator.comparing(Student1::getAge);  
		//Collections.sort(al,cm21);  
		System.out.println("Sorting by Age");  
		for(Student st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}    
	} 
}