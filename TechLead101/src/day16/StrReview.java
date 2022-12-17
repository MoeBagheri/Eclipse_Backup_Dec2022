package day16;

public class StrReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Good (Morning) Moe!";
		
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(6));
	//	System.out.println(str.substring(-1));
	//	System.out.println(str.substring(60));
		System.out.println(str.substring(6,8));
		
	//	last letter off:
		System.out.println(str.substring(0,str.length()-1));
	
	//	index:
		System.out.println(str.indexOf('Q'));
		System.out.println(str.indexOf('M'));
		System.out.println(str.indexOf("Morning"));
		
	//	More Index:
		int indexOfStart = str.indexOf ('(');
		int indexOfEnd = str.indexOf (')');
		System.out.println("Here: "+ str.substring(indexOfStart +1, indexOfEnd));
		
	//	CharAt:
		System.out.println(str.charAt(6));
	//	System.out.println(str.charAt(60));
	//	System.out.println(str.charAt(-1));
		
	//	More CharAt:
		int L = str.length()-1;
		System.out.println(str.charAt(L));
		
	//	Replace:
		System.out.println(str.replace("Morning", "Night"));
	
		
		//	var strVar = "Good (Morning) Moe!";
		
	//	System.out.println(strVar.replace(/Morning/gi, "Night"));

	//	var str3 = "I have a cat, a dog, and a goat.";
	//	str = str.replace(/cat/gi, "dog");
		


	}

}
