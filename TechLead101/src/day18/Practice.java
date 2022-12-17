package day18;

public class Practice {
	//public static void main(String[] args) {
		String name = " Moe    Bagheri   ";

		// return with no space any where:
		String newName = name.replace(" ", "");
		System.out.println(name.length() + " " + name);
		System.out.println(newName.length() + " " + newName);

		// return replace last and the first char
		int len = newName.length();

		String strF = newName.substring(0, 1);
		System.out.println(strF);

		String strL = newName.substring(len - 1, len);
		System.out.println(strL);

		String strM = newName.substring(1, len - 1);
		System.out.println(strM);

		System.out.println(strL + strM + strF);

	}
}
