package Collections1;

import java.util.*;

public class HashMap1 {
	public static void main(String args[]){  
		HashMap <Integer,String> map=new HashMap <Integer,String>(); 
		map.put(1,"Mango");  
		map.put(2,"Apple");    
		map.put(3,"Banana");   
		map.put(4,"Grapes");   
		//map.Set(5, "Mango");   


		Iterator itr= map.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Hash Code :" +"map".hashCode());
	}
}  



