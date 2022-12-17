package day24;

public class Project2 {

	public static void main(String[] args) {

		System.out.println(xyBalance("aaxbby"));
	}

	public static void xyBalance(String str) {
		int placeX = 0;
		int placeY = 0;

		for (int i = 0; i < str.length(); i++) {
			if (i == 'x') {
				placeX += i;
			}
		}

	}
}