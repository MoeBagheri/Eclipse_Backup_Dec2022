package package3;

import java.util.Scanner;

public class main2 {

	public main2() {
	}

	//public static void main(String[] args) {

		while (true) {
			try {

				//
				System.out.println("Enter number: ");
				@SuppressWarnings("resource")
				Scanner scan = new Scanner(System.in);
				int number = scan.nextInt();
				//

				if (number == 10) {
					System.out.println("ten");
				} else {
					if (number >= 7 && number <= 14) {
						System.out.println("in range");
					} else {
						System.out.println("not in range");
					}
				}
				//

			} catch (Exception e) {
				System.out.println("Enter a valid number");
			}
			System.exit(1);
		}
		

	}
}
