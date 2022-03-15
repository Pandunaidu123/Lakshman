package ioop2;

class Static
{
	static void Run()
	{
		System.out.println("Lakshmi Narayana");
	}
	public void Lunch()
	{
		System.out.println("Techouts Solutions, Gachibowli, Hyderabad..!!");
	}
	public static void main(String[] main)
	{
		Run();
		Static s=new Static();
		s.Lunch();
	}
}
    