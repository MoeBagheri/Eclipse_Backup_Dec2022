package day31;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 100, 0, 1, 5, 88, 90};
		System.out.println(Arrays.toString(num));
		Arrays.sort(num); // sort by using built-in java library
		
		System.out.println(Arrays.toString(num));
		
		String[] names = {"Bek", "John", "Kuba", "Alex", "Azamat", "Artem"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
	}
}