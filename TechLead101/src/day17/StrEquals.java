package day17;

import java.util.Scanner;

public class StrEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type two things");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String thing1 = scan1.nextLine();
		String thing2 = scan1.nextLine();
		scan1.close();
		scan2.close();

		if (thing1.equals(thing2)) {
			System.out.println("Same exact shit!");
		} else if (thing1.equalsIgnoreCase(thing2)) {
			System.out.println("Same thing but diffrent case!");

		} else {
			System.out.println("They are totally diffrent!");
			
		}

	}

}