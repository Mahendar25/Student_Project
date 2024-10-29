package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<String> pq1=new PriorityQueue<>();
		// default and initial capacity is 11
		// it does not allow null
		// it allows duplicate values
		// it does
		pq.offer("BMW");
		pq.add("Audi");
		//pq.offer(null);
		//pq.offer("");
		pq.offer("ab");
		pq.offer("AB");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq1.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		//System.out.println(pq1.remove());
	//	System.out.println(pq.contains("BMW"));
		System.out.println();
		PriorityQueue<Integer> pq2=new PriorityQueue<>();
		pq2.add(2);
		pq2.add(12);
		pq2.add(9);
		pq2.add(3);
		pq2.add(1);
		System.out.println(pq2);

	}

}
