package day22;

import util.InputFromUser;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i + "hello");
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("day22-for loop");
			break;
		}
		int count = 0;
		while (count < 10) {
			if (count == 3) {
				break;
			}
			System.out.println(count + " java");
			count++;
		}
		System.out.println("----");
		int muFavNum = 7;
		for (int i = 0; i < 10; i++) {
			int number = Integer.parseInt(InputFromUser.getInput("Enter Number"));
			if (muFavNum == number) {
				System.out.println("bingo!");
				break;
			}
		}
		System.out.println("end of program");
	}

}
