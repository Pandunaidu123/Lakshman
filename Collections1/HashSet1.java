package Collections1;


import java.util.*;
public class HashSet1 {
	public static void main(String[] args)
	{
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Raju");
		hs1.add("Raju2");
		hs1.add("Raju3");
		hs1.add("Raju4");
		hs1.add("Raju10");
		Iterator itr= hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
		System.out.println("-----------------------------");
		for(String i: hs1)
		{
			System.out.println(i);
		}
	}
}
