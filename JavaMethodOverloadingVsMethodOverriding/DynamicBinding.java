package JavaMethodOverloadingVsMethodOverriding;

public class DynamicBinding extends Bind
{
	void eat()
	{
		System.out.println("Secunderabad");
	}
	public static void main(String[] args)
	{
		Bind b=new DynamicBinding();
		b.eat();
	}
}
	