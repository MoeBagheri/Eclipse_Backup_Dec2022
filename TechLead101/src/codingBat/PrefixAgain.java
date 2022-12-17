package codingBat;

public class PrefixAgain {

	public static void main(String[] args) {
		System.out.println(prefixAgain("abXYabc", 1)); // → true
		System.out.println(prefixAgain("abXYabc", 2)); // → true
		System.out.println(prefixAgain("abXYabc", 3)); // → false
		System.out.println(prefixAgain("abXYabc", 3)); // → false
		System.out.println(prefixAgain("aa", 1)); // → true
		System.out.println(prefixAgain("a", 1)); // → false

	}

	public static boolean prefixAgain(String str, int n) {
		if (str.substring(n, str.length()).contains(str.substring(0, n))) {
			return true;
		}

		else {
			return false;
		}
	}

}
