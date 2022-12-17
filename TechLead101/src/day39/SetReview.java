package day39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetReview {
	public static void main(String[] args) {
		// Set
		// 
		// 1. HashSet
		//    - it doesn't allow duplicates
		//    - doesn't maintain insertion order
		// 
		// 2. LinkedHashSet
		//    - it doesn't allow duplicates
		//    - it maintains insertion order
		// 
		// 3. TreeSet
		//    - sorted implementation of Set
		
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(7);
		set.add(1);
		set.add(-9);
		set.add(12);
		set.add(1);
		set.add(5);
		System.out.println(set); // [1, 5, 7, -9, 12]
		
		// set.get(0); there is no index definition in the Set
		for (Integer number : set) {
			System.out.println(number);
		}
		System.out.println("---");
		
		Set<Integer> setTwo = new LinkedHashSet<>();
		setTwo.add(5);
		setTwo.add(7);
		setTwo.add(1);
		setTwo.add(-9);
		setTwo.add(12);
		setTwo.add(1);
		setTwo.add(5);
		System.out.println(setTwo); // [5, 7, 1, -9, 12]
		
		Set<Integer> setThree = new TreeSet<>();
		setThree.add(5);
		setThree.add(7);
		setThree.add(1);
		setThree.add(-9);
		setThree.add(12);
		setThree.add(1);
		setThree.add(5);
		System.out.println(setThree); // [-9, 1, 5, 7, 12]
	}
}