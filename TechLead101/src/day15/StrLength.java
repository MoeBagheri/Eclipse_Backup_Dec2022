package day15;

import java.util.Scanner;

public class StrLength {
	public static void main(String[] args) {

		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();

		int nameLength = name.length();
		System.out.println(nameLength);
		if (nameLength > 7) {
			System.out.println("You have a long name!");
		}
		System.out.println("Nice to meet you, " + name + "!");

		System.out.println();

		System.out.println("Your upper case name is: " + name.toUpperCase());
		System.out.println("Your lower case name is: " + name.toLowerCase());
		
		if (nameLength > 7) {
		System.out.println(":)");
		}
	}
}
