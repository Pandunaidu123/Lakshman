package oop;

class Thiskeyword
{
	int a=10;
	void display()
	{
		int a=20;  
		System.out.println("a : "+a);
		System.out.println("a = "+(this.a));
	}
	public static void main(String[] args)
	{
		Thiskeyword thiskeyword=new Thiskeyword();
		thiskeyword.display();
	}
	
}