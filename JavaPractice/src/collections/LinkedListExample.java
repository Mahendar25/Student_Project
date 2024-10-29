package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> le=new LinkedList<>();
		le.add(null);
		le.add(1);
		le.add(2);
		le.offerLast(2);
		le.add(3);
		le.add(3);
		System.out.println(le);
		

	}

}
