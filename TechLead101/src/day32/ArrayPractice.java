package day32;

import java.util.Iterator;

public class ArrayPractice {

	public static void main(String[] args) {
		System.out.println(getTotalSum(new int[] { 5, 4, 3, 2 })); // 14
		System.out.println(getTotalSum(new int[] { 1, 1, 3, 2 })); // 7
		System.out.println(getTotalSum(new int[] { 1, 1, 1, 1 })); // 4
		
		System.out.println("---");
		
		System.out.println(getTotalOddSum(new int[] {5, 4, 3, 2})); // 8
		System.out.println(getTotalOddSum(new int[] {1, 1, 3, 2})); // 5
		System.out.println(getTotalOddSum(new int[] {1, 1, 1, 1})); // 4
		
		System.out.println("---");
		
		System.out.println(getMaxMinSum(new int[] {5, 4, 3, 2}));
		System.out.println(getMaxMinSum(new int[] {1, 1, 3, 2}));
		System.out.println(getMaxMinSum(new int[] {1, 1, 1, 1}));
		System.out.println(getMaxMinSum(new int[] {10, 15, 8, 9}));
	}
//-
	/*
	 * getTotalSum([5, 4, 3, 2]) -> 14 
	 * getTotalSum([1, 1, 3, 2]) -> 7
	 * getTotalSum([1, 1, 1, 1]) -> 4
	 * getMaxMinSum([10, 15, 8, 9]) -> 23
	 */
	public static int getTotalSum(int[] arr) {
		int sum = 0;
	//1	
		//for (int i : arr) {
	//2
		for (int i = 0; i < arr.length; i++) {
			
	//1
		//sum += i;
	//2
		sum += arr[i];
		}
		
		return sum;
	}
	

/*
 * getTotalOddSum([5, 4, 3, 2]) -> 8
 * getTotalOddSum([1, 1, 3, 2]) -> 5
 * getTotalOddSum([1, 1, 1, 1]) -> 4
 */
public static int getTotalOddSum(int[] arr) {
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2!=0) {
			sum += arr[i];
		}
	}
	return sum;
}
	




/*
 * getMaxMinSum([5, 4, 3, 2])   -> 7
 * getMaxMinSum([1, 1, 3, 2])   -> 4
 * getMaxMinSum([1, 1, 1, 1])   -> 2
 * getMaxMinSum([10, 15, 8, 9]) -> 23
 * 
 * Complete this without built-in sorting from Arrays
 */
public static int getMaxMinSum(int[] arr) {

	int max = arr[0];
	int min = arr[0];

	// check our assumption
	for (int i = 1; i < arr.length; i++) {
		// check assumption, if it some value is smaller then update it
		if (min > arr[i]) {
			min = arr[i];
		}
		if (max < arr[i]) {
			max = arr[i];
		}
	}


	return min + max;

}
}