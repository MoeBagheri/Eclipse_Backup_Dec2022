package day16;

public class Practice {
	public static void main(String[] args) {
		String str = "Apple.Banana.Kiwi.Orange";
		System.out.println(str); // Apple.Banana.Kiwi.Orange
		
		// TODO 
		// replace(oldValue, newValue)
		// toLowerCase();
		str = str.toLowerCase();
		str = str.replace(".", ", ");
		
		


		
		System.out.println(str); // apple, banana, kiwi, orange
	}
}

