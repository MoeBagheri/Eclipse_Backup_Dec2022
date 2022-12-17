package day24;

public class Project {

	public static void main(String[] args) {

		boolean res1 = xyBalance("yxyxyxyx"); // ->false
		boolean res2 = xyBalance("bbbb"); // ->true
		boolean res3 = xyBalance("y"); // ->true
		boolean res4 = xyBalance("x"); // false
		boolean res5 = xyBalance("12xabxxydxyxyzz"); // true

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);

	}

	public static boolean xyBalance(String str) {
		int placeX = 0;
		int placeY = 0;

		if (str.length() == 1 && str.equals("x")) {
			return false;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				placeX = i;

			}
		}
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 'y') {
				placeY = j;
			}
		}

		if (placeX <= placeY) {
			return true;
		}
		return false;

	}
}