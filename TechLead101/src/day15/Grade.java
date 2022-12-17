package day15;

public class Grade {

//	public static void main(String[] args) {
		displayScore('a'); // 90 - 100
		displayScore('A'); // 90 - 100
		displayScore('F'); // less than 50
		displayScore('B'); // 65 - 89
		displayScore('C'); // 50 - 64
		
		displayScore('x'); // not valid grade
		displayScore('Y'); // not valid grade
	}
	
	/*
	 * if grade is 'A' or 'a' then print "90 - 100"
	 * if grade is 'B' or 'b' then print "65 - 89"
	 * if grade is 'C' or 'c' then print "50 - 64"
	 * if grade is 'F' or 'f' then print "less than 50"
	 * otherwise print "not valid grade"
	 */
	public static void displayScore(char grade) {
		// TODO
		switch (grade) {
		case 'a':
		case 'A':
			System.out.println("90 - 100");
			break;
		case 'b', 'B':
			System.out.println("65 - 89");
			break;
		case 'c', 'C':
			System.out.println("50 - 64");
			break;
		case 'f', 'F':
			System.out.println("less than 50");
			break;
		default:
			System.out.println("not valid grade");
		}


	}
		
	
}
