package day40;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWord {
	public static void main(String[] args) {
		System.out.println(randomWord(4)); // JAVa
		System.out.println(randomWord(10)); // 
	}
	
	public static String randomWord(int length) {
		// A-Z 65 - 90  inclusive
		// a-z 97 - 122 inclusive
		
		// A..Za..z
		List<Character> letters = new ArrayList<>();
		generateLetters(letters, true);
		generateLetters(letters, false);
		
		StringBuilder sbWord = new StringBuilder();
		for (int i = 0; i < length; i++) {
			int randomIndex= new Random().nextInt(letters.size());
			char randomLetter = letters.get(randomIndex);
			sbWord.append(randomLetter);
		}

		return sbWord.toString();
	}
	
	private static void generateLetters(List<Character> list, boolean isUpper) {
		char start = isUpper ? 'A' : 'a';
		char end = isUpper ? 'Z' : 'z';
		while (start <= end) {
			list.add(start++);
		}
	}
}