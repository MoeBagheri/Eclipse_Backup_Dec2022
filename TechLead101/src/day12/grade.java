package day12;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGrade(95)); // A
		System.out.println(getGrade(90)); // A
		System.out.println(getGrade(101)); // 0
		System.out.println(getGrade(85)); // B
		System.out.println(getGrade(70)); // C
		System.out.println(getGrade(60)); // D
		System.out.println(getGrade(69)); // D
		System.out.println(getGrade(10)); // F
		System.out.println(getGrade(59)); // F
		System.out.println(getGrade(-5)); // 0
	}

	public static char getGrade(int score) {
		if (score >90 && score <=100) {
			return 'A';
		}
		else if (score >80 && score <=89) {
			return 'B';
		}
		if (score >70 && score <=79) {
			return 'C';
		}
		if (score >60 && score <=69) {
			return 'D';
		}
		if (score >0 && score <=59) {
			return 'F';
		}
		
		else {
			return '0';
		}
	}
}
