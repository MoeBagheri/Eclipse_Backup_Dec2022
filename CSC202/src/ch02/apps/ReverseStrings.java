//----------------------------------------------------------------------
// ReverseStrings.java         by Dale/Joyce/Weems             Chapter 2
//
// Sample use of stack. Outputs strings in reverse order of entry.
//----------------------------------------------------------------------
package ch02.apps;

import ch02.stacks.*;
import java.util.Scanner;

public class ReverseStrings {
	public static void main(String[] args) {
		String str = "Welcome!";
		recReverse(str, 0);
	}

	public static void recReverse(String str, int pos) {
		if (pos < str.length()) {
			recReverse(str, pos + 1);
			System.out.print(str.charAt(pos));
		} // so this is one way to have the word "Welcome!" Reveresed.
	}

	/*
	 * Scanner scan = new Scanner(System.in);
	 * 
	 * StackInterface<String> stringStack; stringStack = new
	 * ArrayBoundedStack<String>(3);
	 * 
	 * String line;
	 * 
	 * for (int i = 1; i <= 3; i++) { System.out.print("Enter a line of text > ");
	 * line = scan.nextLine(); stringStack.push(line); }
	 * 
	 * System.out.println("\nReverse is:\n"); while (!stringStack.isEmpty()) { line
	 * = stringStack.top(); stringStack.pop(); System.out.println(line); } }
	 */
}