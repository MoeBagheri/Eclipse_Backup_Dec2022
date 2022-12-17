package package3;

import java.util.Scanner;

public class main4 {
	public main4() {
	}

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println("Enter number: ");
				Scanner scan = new Scanner(System.in);
				int number = scan.nextInt();
				scan.close();
				if (number == 10 || number == 9 || number == 16) {
					System.out.println("luckey number");
				} else {
					System.out.println("not today");
				}
			} catch (Exception e) {
				System.out.println("Enter a valid number");
			}
		}
	}
}