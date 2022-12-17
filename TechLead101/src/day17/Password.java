package day17;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter password to chek it up");
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		scan.close();

		if (password.length() < 5) {
			System.out.println("Rejected, should be atleast 5 chars");
		} else if (!(password.contains("!") || password.contains("$") || password.contains("%"))) {
			System.out.println("Rejected you need !, $, or %");
			
		} else if (!hasNumeric(password)) {
			System.out.println("Rejected you need numeric");
		} else {
			System.out.println("Good To Go!");
		}

	}

	public static boolean hasNumeric(String str) {
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
}
