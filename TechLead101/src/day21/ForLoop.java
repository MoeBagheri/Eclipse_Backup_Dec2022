package day21;

import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (int i = 1; i < 5; i++) {
		// System.out.println("Hi "+i);
		// }
		print100(); // 1 ... 100
		System.out.println();
		
		printReverse100(); // 100 ... 1
		System.out.println();
		
		printTill(5);
		printTill(3);
		printTill(0);
		printTill(7);
		System.out.println("--");

		System.out.println(totalSum(5));	//15
		System.out.println(totalSum(3));	//6
		System.out.println(totalSum(6));	//21
		System.out.println(totalSum(1)); 	//1

		
		

	}

	/*
	 * print numbers from 1 to 100 inclusive
	 */
	public static void print100() {
		// TODO
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}

	/*
	 * print numbers from 100 to 1 inclusive
	 */
	public static void printReverse100() {
		// TODO
		for (int i = 100; i >= 1; i--) {
			System.out.print(i+ " ");

		}
		System.out.println();

	}

	public static void printTill(int number) {
		for (int i = 0; i <= number; i++) {
			System.out.print(i+ " ");
			

		}
		System.out.println();
		

	}
	
	public static int totalSum(int num) {
		int s = 0;
		for (int i = 0; i <= num; i++) {
			
			i = num;
			

		}
		return num;
		
	}

}
