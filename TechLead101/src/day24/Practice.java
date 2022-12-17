package day24;

public class Practice {
	/*
	 * Return true if the string "cat" and "dog" appear the same number of times in
	 * the given string.
	 * 
	 * Examples: Use: catDog("catdog") return: true
	 * 
	 * Use: catDog("catcat") return: false
	 * 
	 * Use: catDog("1cat1cadodog") return: true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res = catDog("catxdogxdog");
		System.out.println(res);
	}

	public static boolean catDog(String str) {
		// your code goes here
		int CountCat = 0;
		int CountDog = 0;

		for (int i = 0; i < str.length()-2; i++) {

			if (str.substring(i, i + 3).equals("cat")) {
				CountCat++;
			}
		}
		for (int i = 0; i < str.length()-2; i++) {
			if (str.substring(i, i + 3).equals("dog")) {
				CountDog++;
			}
		}
		if (CountCat == CountDog) {
			return true;
		} else {
			return false;
		}
	}
}

// if (str.length()>2){
// return str.contains("cat") && str.contains("dog");
// }else{
// return true;
