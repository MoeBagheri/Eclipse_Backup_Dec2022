package day31;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = { 6, 3, 2, 10, 0, 7, 5 };
		System.out.println(Arrays.toString(num));

		sort(num);
		System.out.println(Arrays.toString(num));

		// Selection sort algorithm
		// In selection sort, the idea of the algorithm is to find the smallest unsorted
		// element and add it to the beginning of the array.

//		Repeat until no unsorted elements remain:
//		- Search the unsorted part of the data to find the smallest value
//		- Swap the smallest found value with the first element of the unsorted part
	}

	public static void sort(int[] arr) {
		//  0  1  2   3  4  5  6
		// [6, 3, 2, 10, 0, 7, 5]
		for (int i = 0; i < arr.length; i++) {
			// get smallest index from unsorted part
			int smallestIndex = getSmallestIndex(i, arr);

			// swap the smallest value with first of unsorted part
			int tmpVar = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = tmpVar;
		}
	}

	public static int getSmallestIndex(int startIndex, int[] arr) {
		// assume start index is smallest value in array
		int min = arr[startIndex];
		int smallestIndex = startIndex;

		// iterate over the array and check assumption
		for (int i = startIndex + 1; i < arr.length; i++) {
			// if assumption is wrong update the it
			if (min > arr[i]) {
				min = arr[i];
				// update index as well
				smallestIndex = i;
			}
		}

		return smallestIndex;
	}

}