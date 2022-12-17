package day15;

import java.util.Scanner;

public class ChangeStr {
	public static void main(String[] args) {

		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();

		int nameLength = name.length();
		System.out.println(nameLength);
		if (nameLength > 5) {
			System.out.println("Your upper case name is: " + name.toUpperCase());

		} else {
			System.out.println("Your lower case name is: " + name.toLowerCase());

		}
}
}
