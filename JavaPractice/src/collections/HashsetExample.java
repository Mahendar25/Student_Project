
package collections;

import java.util.*;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(0);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.println();
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(11);
		hs1.add(22);
		hs1.add(2);
		System.out.println(hs1);
		hs1.addAll(hs);
		System.out.println(hs1);
		hs1.remove(null);
		/*if u want to remove value from HashSet,
		 enter value u want to remove ,
		 otherwise the value is not found 
		 in HashSet it returns false.*/ 
		System.out.println(hs1 );
		System.out.println(hs1.remove(222));
		System.out.println("checking value in Hashset: "+hs1.contains(22));
		//to retrieve data using for loop.
		for(Integer i:hs1)
		{
			System.out.println(i);
		}
		

	}

}
