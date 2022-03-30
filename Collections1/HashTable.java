package Collections1;

import java.io.*;

import java.util.*;

class HashTable {
	public static void main(String args[])
	{
		Hashtable<Integer, String> ht1 = new Hashtable<>();

		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(3, "three");
		ht1.put(4, "four");
		ht1.put(5, "five");
		ht1.put(6, "six");
		ht1.put(7, "seven");
		ht1.put(8, "eight");
		ht1.put(9, "nine");
		ht1.put(10, "ten");		
		for(Integer i: ht1.keySet())
		{
			System.out.println(i+" "+ht1.get(i));
		}
		System.out.println("This is about Hashtable...");
	}
}
