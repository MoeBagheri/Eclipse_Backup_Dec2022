package day34;

public class Varargs {
	public static void main(String[] args) {
		int res = sum(5, 6);
		System.out.println(res);

		res = sum(1, 5, 9);
		System.out.println(res);

		int[] inputArr = { 4, 3, 7, 8, 9 };
		res = sum(inputArr);
		System.out.println(res);

		res = sum(9, 8, 10);

	}

	public static int sum(int... nums) {
		int sum = 0;

		for (int num : nums) {
			sum += num;
		}
		return sum;

	}
}