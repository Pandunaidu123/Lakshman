package Collections1;


import java.util.*;

public class VectorExample{  
	 public static void main(String args[]){  
	  
	 Vector<String> al=new Vector<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  al.add("Siddu");
	  al.add("Kushi");
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  