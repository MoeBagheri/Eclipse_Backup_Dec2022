package day17;

public class StrStartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = "Hi Moe";
		

		
		System.out.println(Str.startsWith("Hi")); 			//true
		System.out.println(Str.endsWith("Prim")); 			//false
		
		System.out.println(Str.contains("Moe")); 			//true
		System.out.println(Str.equals("Moe"));				//false
		System.out.println(Str.equals("Hi Moe"));			//true
		System.out.println(Str.equalsIgnoreCase("hi moe"));	//true
		
		System.out.println(Str.compareTo("X"));	
		System.out.println(Str.compareTo("%"));	
		System.out.println(Str.compareToIgnoreCase("hi Moe"));	
		System.out.println(Str.compareTo("hi moe"));	





		
	}

}
