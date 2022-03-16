package OOP;

 class Java3 {
	public void Pandu()
	{
		System.out.println("This is Hierarical Inheritence Program");
	}
	

	}
 class Java1 extends Java3{
	 public void Lakshman()
	 {
		 System.out.println("This is second Class Hierarchy"); 
	 }
	 
 }
 class Java2 extends Java3{
	 public void Laxman()
	 {
		 System.out.println("This is third class Hierarchy"); 
	 }
	 
 }
 public class HieraricalInheritence
 {
	public static void main(String[] args)
	{
		Java3 h=new Java3();
		Java1 j1=new Java1();
		Java2 j2=new Java2();
		h.Pandu();
		j1.Lakshman();
		j2.Laxman();
				
	}
 }
	 
 