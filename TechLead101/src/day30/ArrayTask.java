package day30;

public class ArrayTask {

	public static void main(String[] args) {
		String[] name = { "Isla", "Olivia", "Aurora", "Ada", "Cora" };
		// TODO print each name from name array in the new line by using for loop

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

		}

		System.out.println("---");
		byte[] score = { 9, 8, 7, 5, 5, 6, 9, 10 }; // 7.35
		int averageScore = 0;
		// TODO find out average score from score array by using for loop
		for (int i = 0; i < score.length; i++) {
			averageScore += score[i];

		}
		System.out.println("Average score is " + averageScore / score.length);

		System.out.println("---");

		// 0 1 2 3
		double[] coordinate = { 3.5, 5.9, 2.1, 1.9 };
		// TODO print numbers from coordinate array in reverse order
		// 1.9
		// 2.1
		// 5.9
		// 3.5

		for (int i = coordinate.length - 1; i >= 0; i--) {
			System.out.println(coordinate[i]);

		}

	}
}
