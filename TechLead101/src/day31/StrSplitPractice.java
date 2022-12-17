package day31;

public class StrSplitPractice {
	public static void main(String[] args) {
		System.out.println(countWords("my name is moe bagheri")); // 5
	}

	public static int countWords(String str) {

		String[] items = str.split(" ");
		return items.length;

	}
}
