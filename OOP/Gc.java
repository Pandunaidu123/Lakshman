package oop;

public class Gc {
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]){
		Gc s1=new Gc();
		//Gc s2=new Gc();
		s1=null;
		//s2=null;
		System.gc();
	}
}



