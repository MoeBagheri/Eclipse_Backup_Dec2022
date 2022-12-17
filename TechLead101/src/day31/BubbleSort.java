package day31;

import java.util.Arrays;
/*
Pseudocode:
• Set swap counter to a non-zero value
• Repeat until the swap counter is not 0: 
  - Reset swap counter to 0
  - Look at each adjacent pair
  - if two adjacent elements are not in order, swap them and add one to the swap counter
*/ 
public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));
		
		sort(num);
		System.out.println(Arrays.toString(num));
	}
	
	public static void sort(int[] arr) {
		//  0  1  2  3  4  5  6
		// [0, 2, 3, 5, 6, 7, 10]
		
		int swapCounter = -1;
		int len = arr.length;
		
		while (swapCounter != 0) {			
			swapCounter = 0;
			len--;
			
			for (int i = 0; i < len; i++) {
				if (arr[i] > arr[i + 1]) {
					int tmpVar = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmpVar;
					
					swapCounter++;
				}
			}
		}
		
	}
}