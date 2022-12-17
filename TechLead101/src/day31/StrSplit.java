package day31;

public class StrSplit {

	public static void main(String[] args) {
		// String method split(pattern)
		String str = "Java 101 SDET";
		
		String[] productOfSplit = str.split(" ");
		
		// for each loop iterates over the array from left to right
		
		//                    ["Java", "101", "SDET"]
		for (String element : productOfSplit) {
			System.out.println(element);
		}
		System.out.println("---");
		
		String strTwo = "Java is great";
		String[] arr = strTwo.split(" is ");
		for (String element : arr) {
			System.out.println(element);
		}
		System.out.println("---");
		
		String itemsStr = "apple, orange, kiwi,banana, cherries";
		// itemsStr = itemsStr.replace(" ", "");
		String[] items = itemsStr.split(",");
		for (String item : items) {
			System.out.println(item.trim());
		}
		// print each item in new line
	}
}