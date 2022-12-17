package day39;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		// What's array?
		// Fixed size collection of data of the same type
		
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]
		//   0    1    2    3    4
		// [int, int, int, int, int]
		
		numbers[0] = 7;
		System.out.println(Arrays.toString(numbers)); // [7, 0, 0, 0, 0]
		
		int element = numbers[2];
		System.out.println(element);
		
		int sizeOfArray = numbers.length;
		System.out.println("Size: " + sizeOfArray);
		
		// Array works with references, the same way as objects do
		String[] strs = {"wooden spoon", "car", "school", "tech lead", "eclipse"};
		// [wooden spoon, car, school, tech lead, eclipse]
		System.out.println(Arrays.toString(strs));
		
		// strsTwo is pointing to the same array as strs is pointing
		String[] strsTwo = strs;
		
		strs[0] = "apple";
		strsTwo[1] = "banana";
		
		System.out.println(Arrays.toString(strs)); // [apple, banana, school, tech lead, eclipse]
		System.out.println(Arrays.toString(strsTwo)); // [apple, banana, school, tech lead, eclipse]
		
		System.out.println("---");
		char[] chars = {'a', 'b', 'c', 'd', 'e'};
		// How to loop over the array?
		// using loop and index            
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}
		System.out.println("---");
		
		// for each
		for (char ch : chars) {
			System.out.println(ch);
		}
		
		// How do you sort your array in Java?
		// Arrays.sort()
		
		// What's the helper class for array?
		// Arrays
		
		
	}
}