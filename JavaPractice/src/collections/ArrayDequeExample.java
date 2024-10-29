package collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
		//default capacity is 7
		ad.addFirst("Supra");
		ad.add("BMW");
		//ad.addLast("");
		ad.offer("Audi");
		ad.offer("Audi");
		ad.offerFirst("Rolles");
		ad.offerLast("Honda");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);

	}

}
