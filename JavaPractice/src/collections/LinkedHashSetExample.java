package collections;

import java.util.Enumeration;
import java.util.Vector;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		Enumeration en=v.elements();
		System.out.println(en.hasMoreElements());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		System.out.println(en.nextElement());
		
		System.out.println();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}

}
