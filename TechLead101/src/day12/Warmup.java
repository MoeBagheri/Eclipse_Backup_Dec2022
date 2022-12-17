package day12;

public class Warmup {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEven(5));
		System.out.println(getEven(2));
		System.out.println(getEven(4));
		System.out.println(getEven(10));
	}

	public static String getEven(int number) {

		if (number == 10) {
			return "ten";
		} else {
			if (number % 2 == 0) {
				return "even";
			} else {
				return "odd";
			}
		}

	}

}
