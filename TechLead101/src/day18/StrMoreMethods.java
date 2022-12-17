package day18;

public class StrMoreMethods {

	public static void main(String[] args) {
		String name = "Moe Bagheri         ";
		String empty= "";
		String blank= "   ";
		
		//trim() removes white spaces
		System.out.println(name);
		System.out.println(name.length());
		String trimed = name.trim();
		System.out.println(trimed.length());
		System.out.println("---------");

		
		//checks if string is empty
		System.out.println(name.isEmpty());
		System.out.println(empty.isEmpty());
		System.out.println("---------");
		
		//isBlank()
		System.out.println(empty.isBlank());
		System.out.println(blank.isBlank());
		System.out.println("---------");

		
		
		//as same as:
		System.out.println(name.length()==0);
		System.out.println(empty.length()==0);
		System.out.println("---------");

		
		//String.value of converts argument to String
		int number =5;
		System.out.println(number+5);
		String strNumber = String.valueOf(number);
		System.out.println(strNumber+5);
		System.out.println("---------");

		
		//STR JOIN() Delimiter
		String names1 = String.join("|", "Moe", "Prim", "Cheetah");
		System.out.println(names1);
		String names2 = String.join("  $", "Moe", "Prim", "Cheetah");
		System.out.println(names2);
		System.out.println("---------");

		
		//repeat() repeats the string as many times as you want 5
		System.out.println(name.repeat(5));
		
		//index of
		System.out.println("HERE: "+name.indexOf('B'));
		System.out.println(name.indexOf("Bagheri"));
		System.out.println(name.indexOf("B"));

		
		
		
	}

}
