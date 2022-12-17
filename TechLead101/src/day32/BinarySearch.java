package day32;
 
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] num = { 6, 3, 2, 10, 0, 7, 5 };
		System.out.println(Arrays.toString(num));

		// in order to use binary search the array should be sorted
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

		//  0  1  2  3  4  5  6
		// [0, 2, 3, 5, 6, 7, 10]

		int index = bSearch(num, 7);
		System.out.println("index of 7: " + index);

		index = bSearch(num, 12);
		System.out.println("index of 12: " + index);
	}

	public static int bSearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int middle = (start + end) / 2;

		while (arr[middle] != target) {
			if (start > end) {
				return -1;
			}

			if (arr[middle] < target) {
				start = middle + 1;
			}

			if (arr[middle] > target) {
				end = middle - 1;
			}

			middle = (start + end) / 2;
		}

		return middle;
	}
}