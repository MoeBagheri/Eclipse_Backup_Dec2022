package day31;

import java.util.Arrays;

public class MinPractice {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num));

		System.out.println(getMinValueTwo(num)); // 0	
		System.out.println(getMinValueTwo(new int[] {4, 2, 1, 5, 6, 9})); // 1
	}
	
	public static int getMinValue(int[] num) {
		// [6, 3, 2, 10, 0, 7, 5]
		outer:
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (num[i] > num[j] && i != j) {
					continue outer;
				}
			}
			return num[i];
		}
		
		return num[0];
	}
	
	public static int getMinValueTwo(int[] num) {
		//  0  1  2  3  4  5
		// [4, 2, 1, 5, 6, 9]
		
		// Assume first element is the smallest element
		int min = num[0];
		
		// check assumption
		//              6 < 6
		for (int i = 1; i < num.length; i++) {
			// if assumption was incorrect, update the min value
			if (min > num[i]) {	
				min = num[i];
			}
		}
		
		return min;
	}
}