package collections;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<>();
		
		tm.put( "C",5);
		tm.put("R",8);
		tm.put( "A",1);
		tm.put("B",6);
		tm.put("C", 20);
		tm.put("D", null);
		System.out.println(tm);
		
		TreeMap<String,Integer> tm1=new TreeMap<>();
		tm1.put( "F",5);
		tm1.put("R",8);
		tm1.put( "A",11);
		tm1.put("B",6);
		tm1.put("C", 10);
		tm1.putAll(tm);	
		System.out.println(tm1);
		
		System.out.println(tm1.get("C"));
		System.out.println(tm1.containsValue(20));
		
		tm1.put(" ", 100);	
		System.out.println(tm1);
		
		tm1.pollFirstEntry();//removing first element
		System.out.println(tm1);
//		tm1.pollLastEntry();
//		System.out.println(tm1);
		
		System.out.println(tm1.firstEntry());
		
		System.out.println(tm1.floorKey("S"));
		
		
		
		
		
	}

}
