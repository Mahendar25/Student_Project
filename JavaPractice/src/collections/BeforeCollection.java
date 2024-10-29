package collections;
import java.util.Vector;
import java.util.Arrays;
import java.util.Hashtable;

public class BeforeCollection {

	public static void main(String[] args) {
		int[] ar=new int[] {1,2,3,4,5};
		Vector<Integer> v=new Vector<>();
		Hashtable<Integer,String> h=new Hashtable<>();
		
		for (Integer integer :ar) { 
			System.out.print(integer+",");
			
		}
		
		v.addElement(null);
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		System.out.println("\n"+v);
		
		
		h.put(0, "Supra");
		h.put(1, "GTR");
		h.put(2, "Dodge");
		System.out.println(h);
		h.put(1, "BMW");
		System.out.println(h);
		h.remove(1);
		System.out.println(h);
		System.out.println(h.contains("Supra"));
		//h.clear();
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println();
		Hashtable<Integer,String> ht=new Hashtable<>(h);
		
		ht.put(1,"Naruto");
		ht.put(2,"Obito");
		ht.put(3, "Kakashi");
		System.out.println(ht);
		
		//ht.putAll(h);
		//System.out.println(ht);
		
		System.out.println("Size of ht: "+ht.size());
		System.out.println(ht.get(1));
		
		
		
		
		
		
	}

}
