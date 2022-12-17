package day22;

public class StrLoopPractice {

	public static void main(String[] args) {
		System.out.println(getNumberOfVowels("apple")); // 2
		System.out.println(getNumberOfVowels("Java")); // 2
		System.out.println(getNumberOfVowels("hello world")); // 3
		System.out.println(getNumberOfVowels("abc")); // 1
	}

	/*
	 * Return number of vowel letter in argument str Vowel letters: a, e, i, o, u
	 * 
	 * getNumberOfVowels("apple") -> 2 getNumberOfVowels("Java") -> 2
	 * getNumberOfVowels("hello world") -> 3 getNumberOfVowels("abc") -> 1
	 */
	public static int getNumberOfVowels(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')

				count++;
		}

		return count;
	}
}