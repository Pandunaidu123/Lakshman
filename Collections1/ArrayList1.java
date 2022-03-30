package Collections1;


import java.util.*; 
public class ArrayList1 {
	public static void main(String[] args)
	{
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Kushi");
		lst.add("Siddu");
		lst.add("Mahesh");
		lst.add("Pokiri");
		lst.add("Athidi");
		lst.add("Gabbarsingh");
		Iterator itr=lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	
		
		}
		System.out.println(lst);
		
		
	}
}


