package day24;

public class StrPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revStr("java"));
		
		System.out.println(isPal("civic"));
		System.out.println(isPal("Moe"));	
	}
public static String revStr (String str) {
	
	String rev ="";
	
	for (int i = str.length()-1; i >= 0 ; i--) {
		rev += str.charAt(i);
	}
	
	return rev;
	

	}


public static String isPal(String str) {
	String rev ="";
	
	for (int i = str.length()-1; i >= 0 ; i--) {
		rev += str.charAt(i);
	}
	if (str.equals(rev)) {
		return "Is pal";
	}
	return "Is not pal";
	
}
}
