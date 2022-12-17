package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class Review {
	public static void main(String[] args) {
		// The difference between array and ArrayList?
		// 1. Array is fixed size and ArrayList is dynamic sized collection.
		// 2. Array can work with primitives and objects, when ArrayList works with 
		//    objects only.
		
		// ArrayList is dynamic sized collection of data. ArrayList is based on array
		// internally.
		
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);
		
		// add(new element) adds element to the list
		names.add("John");
		names.add("Alex");
		names.add("Abby");
		names.add("Neeru");
		
		//                              0      1    2      3
		System.out.println(names); // [John, Alex, Abby, Neeru]
		// get(index) read element from list based on the index
		String name = names.get(2);
		System.out.println(name); // Abby
		
		// change first element value to Kuba
		names.set(0, "Kuba");
		System.out.println(names); // [Kuba, Alex, Abby, Neeru]
		
		int numberOfElements = names.size();
		System.out.println("Size: " + numberOfElements);
		System.out.println("---");
		
		// I want to create list that holds these values ['A', 'B', 'C', 'D']
		ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
		System.out.println(letters);
	}
}