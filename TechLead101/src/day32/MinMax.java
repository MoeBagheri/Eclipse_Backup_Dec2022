package day32;

public class MinMax {

	public static void main(String[] args) {
		System.out.println(getMin(new int[] { 5, 4, 3, 1, 8, 7, 9, 11 })); // 1
		System.out.println(getMin(new int[] { 5, 4, 3, 1, 8, 7, 9, 1 })); // 1
		System.out.println(getMin(new int[] { -9, 5, 4, 3, 1, 8, 7, 9, 1 })); // -9
		System.out.println(getMin(new int[] { -9, 5, 4, 3, 1, 8, 7, 9, -11 })); // -11
		System.out.println(getMin(new int[] { 5, 5, 5, 5 })); // 5
	 	System.out.println("---");

		System.out.println(getMax(new int[] { 5, 4, 3, 1, 8, 7, 9, 11 })); // 11
		System.out.println(getMax(new int[] { 5, 4, 3, 1, 8, 7, 9, 1 })); // 9
		System.out.println(getMax(new int[] { -9, 5, 4, 3, 1, 8, 7, 9, 100 })); // 100
		System.out.println(getMax(new int[] { -9, 5, 4, 3, 15, 8, 7, 9, -11 })); // 15
		System.out.println(getMax(new int[] { 5, 5, 5, 5 })); // 5
	}

	public static int getMin(int[] arr) {
		// 0 1 2 3 4 5 6 7
		// [5, 4, 3, 1, 8, 7, 9, 11]

		// assume the first element is the smallest
		int min = arr[0];

		// check our assumption
		for (int i = 1; i < arr.length; i++) {
			// check assumption, if it some value is smaller then update it
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getMax(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}