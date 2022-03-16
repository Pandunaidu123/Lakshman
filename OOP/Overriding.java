package oop;

class Parent {
	final void display()
	{
		System.out.println("This is Parent Class");
	}
}
class Child extends Parent{
	
	void display1()
	{
		//super.display();
		System.out.println("This is child class");
		
	}
}
public class Overriding{
	public static void main(String[] args)
	{
		Child c= new Child();
	    c.display();
		
	}
}