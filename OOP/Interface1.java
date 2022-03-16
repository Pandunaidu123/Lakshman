package oop;

interface A1{
	void Adisplay();
}
interface A2{
	void Bdisplay();
}
class ABC implements A1,A2
{
	public void Adisplay()
	{
		System.out.println("This is First Method");
	}

	public void Bdisplay()
	{
		System.out.println("This is Second Method");
	}
}
class Interface1{
	public static void main(String[] args) {
		ABC a=new ABC();
		a.Adisplay();
		a.Bdisplay();
	}
}