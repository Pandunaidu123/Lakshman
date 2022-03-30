package JavaMethodOverloadingVsMethodOverriding;


class Final extends Honda
{  
	void abc1()
	{
		//super.run2();
		System.out.println("running safely with 100kmph");
	}


	public static void main(String args[])
	{  
		Final fnl = new Final();  
		fnl.abc();  
		//fnl.run1();  
	}
}