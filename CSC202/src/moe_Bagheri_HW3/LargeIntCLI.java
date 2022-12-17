//--------------------------------------------------------------------
// LargeIntCLI.java        by Dale/Joyce/Weems               Chapter 6
//
// Allows user to add or subtract large integers.
//---------------------------------------------------------------------
package moe_Bagheri_HW3;

import java.util.Scanner;
import moe_Bagheri_HW3.LargeIntHw3;


public class LargeIntCLI {
	public static void main(String[] args) {
		System.out.println("BASE 17 VERSION");
		Scanner scan = new Scanner(System.in);

		LargeIntHw3<Character> first;
		LargeIntHw3<Character> second;

		String intString;
		String more = null; // used to stop or continue processing

		do {
			// Get large integers.
			System.out.println("Enter the first large integer: ");
			intString = scan.nextLine();
			first = new LargeIntHw3<Character>(intString);

			System.out.println("Enter the second large integer: ");
			intString = scan.nextLine();
			second = new LargeIntHw3<Character>(intString);
			System.out.println();

			// Perform and report the addition and subtraction.
			System.out.print("First number:  ");
			System.out.println(first);
			System.out.print("Second number: ");
			System.out.println(second);
			System.out.print("Sum:           ");
			System.out.println(LargeIntHw3.add(first, second));
			System.out.print("Difference:    ");
			System.out.println(LargeIntHw3.subtract(first, second));
			System.out.print("Product:       ");
			System.out.println(LargeIntHw3.multiply(first, second));

			// Determine if there is more to process.
			System.out.println();
			System.out.print("Process another pair of numbers? (Y=Yes): ");
			more = scan.nextLine();
			System.out.println();
		} while (more.equalsIgnoreCase("y"));
	}
}