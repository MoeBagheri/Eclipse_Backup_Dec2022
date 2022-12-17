package day31;

import java.util.Arrays;

public class StrAndChars {
	public static void main(String[] args) {
		// String method toCharArray()
		// It breaks down String into array of char

		String str = "hello";
		System.out.println(str);

		char[] chars = str.toCharArray();
		System.out.println(Arrays.toString(chars));// [h, e, l, l, o]

		String name = "John Doe";
		char[] nameChars = name.toCharArray();
		for (char letter : nameChars) {
			System.out.println(letter);
		}

	}
}