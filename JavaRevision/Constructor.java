package JavaRevision;

import java.io.*;
import java.util.*;

class Constructor1{
	private int  id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Constructor
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id and name ");
		int id=sc.nextInt();
		String name=sc.nextLine();
		Constructor1 c1= new Constructor1();
		Constructor c=new Constructor();
		c1.setId(id);
		c1.setName(name);
		System.out.println("Employee ID is : "+ c1.getId()+"\n"+"Employee Name is : "+c1.getName());
		
	}
}