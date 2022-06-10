package JavaRevision;

import java.util.*;

public class TreeMap{
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "Pandu");
		m.put(2, "Siddu");
		m.put(4, "Ram");
		m.put(3, "Raghu");
		m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	
	}
}
