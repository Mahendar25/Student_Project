package collections;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> mp=new Hashtable<>();
		mp.put(1, "Naruto");
		mp.put(2, "Obiyo");
		mp.put(3, "Sasuke");
		System.out.println(mp);
		Set<Integer> key=mp.keySet();
	
		for (Integer keys : key) {
			System.out.println(keys);
			
		}
		Set<String> value=(Set<String>) mp.values();
		for (String string : value) {
			System.out.println(string);
		}
		System.out.println(mp.values());
		System.out.println(mp.keySet());
		
		
	}

}
