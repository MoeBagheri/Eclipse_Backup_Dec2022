package day15;

public class StrNumbers {


//	public static void main(String[] args) {
	int res = getNumericValue("one");
	System.out.println(res);
	System.out.println("-----");
	
	System.out.println(getStrValue(2)); // two
	System.out.println(getStrValue(1)); // one
	System.out.println(getStrValue(4)); // four
	System.out.println(getStrValue(5)); // five
	System.out.println(getStrValue(7)); // not supported number
}

/*
 * if number is 1, return "one"
 * if number is 2, return "two"
 * if number is 3, return "three"
 * if number is 4, return "four"
 * if number is 5, return "five"
 * otherwise return "not supported number"
 */
public static String getStrValue(int number) {
	// TODO
	return "not supported number";
}

/*
 *	if strNumber "one" or "ONE",   return 1
 *  if strNumber "two" or "TWO",   return 2
 *  if strNumber "three" or "THREE", return 3
 *  if strNumber "four" or "FOUR",  return 4
 *  if strNumber "five" or "FIVE",  return 5
 *  otherwise return -1
 */
public static int getNumericValue(String strNumber) {
	switch(strNumber) {
	case "one", "ONE":
		return 1;
	case "two":
	case "TWO":	
		return 2;
	case "three", "THREE":
		return 3;
	case "four", "FOUR":
		return 4;
	case "five", "FIVE":
		return 5;
	default:
		return -1;
	}
}
}