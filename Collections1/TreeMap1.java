package Collections1;

import java.util.*;  
class TreeMap1{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
        
     for(Integer i: map.keySet())
     {
    	 System.out.println(i+" "+map.get(i));
      }    
 }  
}  