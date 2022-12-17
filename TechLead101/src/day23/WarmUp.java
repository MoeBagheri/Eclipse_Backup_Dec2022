package day23;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countLetter("Frederick", 'e')); // 2
		System.out.println(countLetter("abc", 'b')); // 1
		System.out.println(countLetter("aaabbbcccbb", 'b')); // 5
		System.out.println(countLetter("hello", 'h')); // 1
		
		printLetters("hello world");
		
	}


	public static int countLetter(String str, char letter) {
		/*
		 * return number of letter in str countLetter("Frederick", 'e') -> 2
		 * countLetter("abc", 'b') -> 1 countLetter("aaabbbcccbb", 'b') -> 5
		 * countLetter("hello", 'h') -> 1
		 * 
		 * 1. Create count variable that will count number of letters 
		 * 2. Loop over the str
		 * 3. Check if current char is equal to letter if yes increase count if not
		 * keep going
		 */

		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	public static void printLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}
	}
	
	
}