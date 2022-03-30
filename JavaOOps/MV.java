package JavaOOps;

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