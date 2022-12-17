package day20;

import java.util.Scanner;

public class MyFavoriteNumber2 {
	public static final int My_Fav_num = 7;
	static int inputnumber;
	
	public static void main (String [] args) {
	//	int inputnumber;
		do {
			System.out.println("Enter number: ");
			Scanner scan = new Scanner(System.in);
			inputnumber = scan.nextInt();
			scan.close();
			
			
		}while (inputnumber != My_Fav_num );
		System.out.println("congrats");
	}
	
}
