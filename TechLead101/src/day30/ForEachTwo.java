package day30;

public class ForEachTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i : numbers) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("-----");

		String[] names = { "Moe", "Prim", "Cheetah" };
		for (String i : names) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("-----");

		double[] dNumArr = { 1.1, 2.2, 3.2, 4.5, 2.4 };
		for (double i : dNumArr) {
			System.out.print(i + " ");

		}

	}

}