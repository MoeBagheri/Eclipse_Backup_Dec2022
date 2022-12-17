package day32;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		
		selectionSort(num);
		System.out.println(Arrays.toString(num));
		
		// repeat till array is sorted
		// - find smallest element from unsorted part of the array
		// - swap it with first unsorted part 
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// find smallest element from unsorted part of the array
			int minIndex = getMinIndex(i, arr);
			
			// swap it with first unsorted part 
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
	}
	
	public static int getMinIndex(int from, int[] arr) {
		int min = arr[from];
		int index = from;
		
		for (int i = from + 1; i < arr.length; i++) {
			if (min > arr[i]) {
		 		min = arr[i];
				index = i;
			}
		}
		
		return index;
	}
}