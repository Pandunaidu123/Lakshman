package JavaMethodOverloadingVsMethodOverriding;

public class GarbageCollection {
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]){
		GarbageCollection s1=new GarbageCollection();
		s1=null;
		System.gc();
	}
}



