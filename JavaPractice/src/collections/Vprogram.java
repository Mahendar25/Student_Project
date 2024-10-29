package collections;

import java.util.*;

public class Vprogram {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
	
		v.add("Naruto");
		v.add("Obito");
		v.add(1,"Sasuke");//assigning specific index
		v.add("Sakura");
		v.add("Hinata");
		v.add("");
		v.add(null);
		v.set(3, "Kurama"); 
		//v.addElement(v);
	
		System.out.println(v);
		
		Vector<String> v1=new Vector<>();
		v1.add("kong");
		v1.add("King");	
	//	v1.addAll(2, v);// adding all values of  first vector
	//	v1.addFirst(v);
		v1.addLast("Gara");
		//v1.removeAll(v1);
		
		
		
		
		//System.out.println(v.get(1));//retriving value by get() method.
		
	//	System.out.println(v1.removeLast());
		System.out.println(v1);
		v1.remove(v);
		//v1.clear();
		System.out.println(v1);
		//System.out.println(v.size());
		//System.out.println(v.capacity());
		System.out.println("\nItarating the elements by using Iterator-->interface with while loop ");
		Iterator<String> it=v.iterator(); 
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Iterating the elements by using for loop ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		

	}

}
