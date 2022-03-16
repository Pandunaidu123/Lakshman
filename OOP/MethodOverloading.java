package oop;

class MV
{
	void A()
	{
		System.out.println("Method Overloading Concept");
	}
	void A(int a, int b)
	{
		System.out.println(a+ " "+b);
	}
	void A(int a, int b, int c)
	{
		c=a+b+c;
		System.out.println(a+ " "+b+ " "+c);
	}
}
public class MethodOverloading
{
public static void main(String[] args)
{
    MV  j=new MV();
	j.A();
	j.A(10,20);
	j.A(10,20,30);
}
}