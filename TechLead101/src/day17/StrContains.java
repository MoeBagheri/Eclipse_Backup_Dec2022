package day17;

import java.util.Scanner;

public class StrContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Type two things");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		String thing1 = scan1.nextLine();
		String thing2 = scan1.nextLine();
		System.out.println("Now Enter your search key");
		String thing3 = scan3.nextLine();
		scan1.close();
		scan2.close();
		scan3.close();

		if (thing1.equals(thing2)) {
			System.out.println("Same exact shit! now you can search your word in it");
	
		
		if (thing1.contains(thing3)) {
			System.out.println("Congradulation it is there!");

	}
		else{
			System.out.println("Nope!");
			
		}
		}else if (thing1.equalsIgnoreCase(thing2)) {
		}
			System.out.println("Same thing but diffrent case!");
			
		} 
			System.out.println("They are totally diffrent!");
			
		

	}

}