package JavaOOps;

public class Object {
	
	int age = 20;
	String name = "PanduNaidu"; 
	 
	void display() {
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("Name: "+obj.name);
		System.out.println("Age: "+obj.age);
	
	}
}
