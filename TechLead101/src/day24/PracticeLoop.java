package day24;

public class PracticeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i < 10; i++) {
			
			if (i%3==0&&i%5==0) {
				System.out.println("Moe Bagheri");
			}else if (i%5==0) {
				System.out.println("Bagheri ");
			}else if (i%3==0) {
				System.out.println("Moe Bagheri ");
			}else {
				System.out.println(i);
			}
			
		}
	}

}
