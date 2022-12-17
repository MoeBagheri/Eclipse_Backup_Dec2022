package day24;

public class NumPal {

	public static void main(String[] args) {
		System.out.println(isNumPal(545)); // true
		System.out.println(isNumPal(1001)); // true
		System.out.println(isNumPal(13)); // false
		System.out.println(isNumPal(33)); // true 
		
		System.out.println(removeDup("Hello"));
		System.out.println(removeDup("moe"));

	}
	
	/*
	 * isNumPal(545)  -> true
	 * isNumPal(1001) -> true
	 * isNumPal(13)   -> false
	 * isNumPal(33)   -> true
	 */
	public static boolean isNumPal(int num) {
		 String strNum = num+"";
		 String rev ="";
			
			for (int i = strNum.length()-1; i >= 0 ; i--) {
				rev += strNum.charAt(i);
			}
			if (strNum.equals(rev)) {
				return true;
			}
			return false;
		
		
	}

	public static String removeDup (String str) {
		String noDup ="";
		for (int i = 0; i < str.length(); i++) {
			char ch = 
			if (!noDup.contains(String)) {
				
			}
			
		}
		
		
		return str;
		
		
	}

}