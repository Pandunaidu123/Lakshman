package JavaMethodOverloadingVsMethodOverriding;

class StaticBinding{  
	private void eat()
	{
		System.out.println("dog is eating...");
	}  

	public static void main(String args[]){  
		StaticBinding sb =new StaticBinding();  
		sb.eat();  
	}  
}  
