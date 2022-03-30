package Collections1;

import java.util.*;  
class LinkedHashMap1{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  hm.put(103,"Siddu"); 
  
  
for(Integer i: hm.keySet())
{
	System.out.println(i+" ---> "+hm.get(i));
}
 }  
}  