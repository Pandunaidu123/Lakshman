package oop;

abstract class A{
 abstract void display();
}
abstract class B extends A
{
	void display()
	{
		System.out.println("This is an Abstract class ");
		
	}
	abstract void show();
}
class AbstractClass1 extends B
{
	void show()
	{
		System.out.println("This is not an Abstract class");
	}
}
class AbstractClass {
public static void main(String[] args)
{
	AbstractClass1 ac=new AbstractClass1();
	ac.show();
	ac.display();
	
}
}