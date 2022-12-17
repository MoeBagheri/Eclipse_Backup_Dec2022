package day32;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = { 6, 3, 2, 10, 0, 7, 5 };
		System.out.println(Arrays.toString(num));

		bubbleSort(num);
		System.out.println(Arrays.toString(num));

		// set swapCounter to a non-zero value
		// repeat till the swap counter is not 0
		// - reset swapCounter to 0
		// - Look at each adjacent pair
		// - if two elements are not sorted swap them and add one to swapCounter
	}

	public static void bubbleSort(int[] arr) {
		// set swapCounter to a non-zero value
		int swapCounter = -1;
		int countWhile = 0;
		int countFor = 0;
		int countIf = 0;
		int countAll = 0;
		// repeat till the swap counter is not 0
		while (swapCounter != 0) {
			// reset swapCounter to 0
			swapCounter = 0;

			// Look at each adjacent pair
			for (int i = 0; i < arr.length - 1; i++) {
				// if two elements are not sorted swap them and add one to swapCounter
				if (arr[i] > arr[i + 1]) {
					int tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swapCounter++;
					countIf++;
				}
				countFor++;
			} 
			countWhile++;
		}
		countAll = countIf + countFor + countWhile;
		System.out.println("countWhile: " + countWhile + " countFor: " + countFor + " countIf: " + countIf
				+ " countAll: " + countAll);

	}

}