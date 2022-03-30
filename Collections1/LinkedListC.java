package Collections1;

import java.util.*;  
public class LinkedListC{  
	 public static void main(String args[]){  
	  
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  al.add("Siddu");
	  al.add("Kushi");
	  for(String i : al)
	  {
		  System.out.println(i);
	  }
	 }  
	}  