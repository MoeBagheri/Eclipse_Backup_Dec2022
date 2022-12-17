package day40;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReview {
	public static void main(String[] args) {
		// Queue is first in first out data structure (FIFO)
		// offer adds element to the back of the queue
		// poll  gets element from the front of the queue
		
		Queue<String> names = new LinkedList<>();
		names.offer("Alex");
		names.offer("Kuba");
		names.offer("John");
		names.offer("Bek");
		System.out.println(names); // [Alex, Kuba, John, Bek]
		System.out.println("---");
		
		String name = names.poll();
		System.out.println(name); // Alex
		System.out.println(names); // [Kuba, John, Bek]
		System.out.println("---");
		
		name = names.poll();
		System.out.println(name); // Kuba
		System.out.println(names); // [John, Bek]
	}
}