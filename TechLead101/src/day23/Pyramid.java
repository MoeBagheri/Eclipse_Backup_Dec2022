package day23;

import java.util.Iterator;
import java.util.Scanner;

public class Pyramid {
	/*ask from user number of in put
	 * print pyramid based on this number
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		String pound ="#";
	//	String sign = pound;
		
		//Method 1:
		/*
		for (int i = 0; i < number; i++) {
			System.out.println(sign);
			
			pound += sign;
			}
		*/
		for (int i = 0; i < number; i++) {
		for (int j = 0; j < i+1; j++) {
				System.out.print(pound);
			}
			
			System.out.println();
			
			
		}
		for (int i = number-1; i > 0; i--) {
		for (int j = i-1; j >= 0; j--) {
			System.out.print(pound);
			//System.out.println("i="+i);;
		}
		System.out.println();
		}
		
		
		}
				
		

	}


