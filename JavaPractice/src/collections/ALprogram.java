package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ALprogram {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println(("initial Capacity: "+(Object)al));
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
	//	al1.add(2, null);
	//	System.out.println(al.containsAll(al1));

		System.out.println(al1);
//		System.out.println("Size of ArrayList: "+al.size());
//		
//		System.out.println(al.get(3));
//		al.set(2, 100);
//		System.out.println(al);
//		al.remove(1);
//		System.out.println(al);
//		//al.removeAll(al);
//		al.clone();
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//		System.out.println(al.contains(15));
//		
//		System.out.println(al.indexOf(null));
		al.forEach((elm)->{System.out.println(elm);});
		Iterator<Integer> it=al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
