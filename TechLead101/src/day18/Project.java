package day18;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// implement getNumberOfLetters(String str) method.
		System.out.println(getNumberOfLetters("hello"));
		// Return: 5

		// implement transform(String str) method.
		// Use:
		System.out.println(transform("done"));
		// Return: "DONE"
		// implement getNumberOfLetters(String str) method.
		// Use:
		System.out.println(getNumberOfLetters("hello"));
		// Return: 5

		// implement transform(String str) method.
		// Use:
		System.out.println(transform("done"));
		// Return: "DONE"

		// implement noFirstAndLast(String str) method.
		// Use: 								
		System.out.println(noFirstAndLast("Java"));
		// Return: "av" -->done

		// implement injectVariable(String content, String key) method.
		// Use:
		System.out.println(injectVariable("Hello {name}, how are you?", "John"));
		// Return: "Hello John, how are you?"
		// Use:
		System.out.println(injectVariable("Today is {weather} day.", "sunny"));
		// Return: "Today is sunny day."
		// Use:
		System.out.println(injectVariable("Today is {weather} day.", "cold"));
		// Return: "Today is cold day."

		// implement getLastLetter(String str) method.
		// Use:
		System.out.println(getLastLetter("Python"));
		// Return: 'n'

		// implement isFirstUpperCase(String str) method.
		// Use:
		System.out.println(isFirstUpperCase("John Doe"));
		// Return: true
		// Use:
		System.out.println(isFirstUpperCase("Head first"));
		// Return: true
		// Use:
		System.out.println(isFirstUpperCase("apple"));
		// Return: false

		// implement noWhiteSpaces(String str) method.
		// Use:
		System.out.println(noWhiteSpaces("I love programming and I do enjoy coding challenges"));
		// Return: "IloveprogrammingandIdoenjoycodingchallenges"

		// implement isIdentical(String str, String str1) method.
		// Use:
		System.out.println(isIdentical("banana", "banana"));
		// Return: true

		// implement isSame(String str, String str1) method.
		// Use:
		System.out.println(isSame("banana", "Banana"));
		// Return: true

		// implement apple(String str) method.
		// Use:
		System.out.println(apple("I like apples"));
		// Return: "apple"
		// Use:
		System.out.println(apple("just something here"));
		// Return: "just something here"

	}

	public static int getNumberOfLetters(String str) {
		// implement method and return number of letter in str(white space is not a
		// letter)
		return str.length();
	}

	public static String transform(String str) {
		// if length of str is even return upper case version of it
		// if length of str is odd return lower case version of it
		if (str.length() % 2 == 0) {

			return str.toUpperCase();
		} else {
			return str.toLowerCase();
		}
	}

	public static String noFirstAndLast(String str) {
		// return str without first and last letters.
		// if str length is less than 2 return str without changes
		if (str.length() >= 2) {
			return str.substring(1, str.length() - 1);
		} else {
			return str;
		}
	}

	public static String injectVariable(String content, String key) {
		// { and } special characters
		// content variable will have one {} string
		// your job to find that and replace with kye variable value
		// ex: injectVariable("Hello {name}, how are you?", "Bob");
		// return: "Hello Bob, how are you?"
		// Note: Instead of 'name' could be anything. It's going to have only one
		// '{anything}' substring in the content
		
		int beginIndex=content.indexOf('{');
		int endIndex=content.indexOf('}');
		String sub = content.substring(beginIndex, endIndex+1);

		return content.replace(sub, key);
	}

	public static char getLastLetter(String str) {
		// return last char from str variable
		int len = str.length();
		return str.charAt(len-1);
	}

	public static boolean isFirstUpperCase(String str) {
		// if str has as first letter uppec case char return true otherwise false
		// it can any upper case letters

		String strF = str.substring(0,1);
		return strF.equals(strF.toUpperCase());
		
	}

	public static String noWhiteSpaces(String str) {
		// return str without white spaces
		return null;
	}

	public static boolean isIdentical(String str, String str1) {
		// return true if str and str1 are same. Case sensitive
		return false;
	}

	public static boolean isSame(String str, String str1) {
		// return true if str and str1 are same. Not case sensitive
		return false;
	}

	public static String apple(String str) {
		// if str contains "apple" return "apple" otherwise return str
		if (str.contains("apple")) {
			return "apple";
		}
		return str;
	}

}
