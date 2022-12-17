package package3;

public class main3 {

		//public static void main(String[] args) {

			
			System.out.println(min(1, 2, 3)); // 1
			System.out.println(min(5, 2, 3)); // 2
			System.out.println(min(4, 4, 0)); // 0
			System.out.println(min(1, 1, 1)); // 1
			System.out.println(min(2, 2, 5)); // 2
		}
		
		/*
		 * return type: int
		 * name: min
		 * arguments: 3 int arguments
		 * 
		 * Create a method that accepts 3 int arguments and returns the smallest one
		 */
		//TODO
		public static int min(int num1, int num2, int num3) {
			if (num1 > num2) {
				return num2;
			}if (num2 > num3) {
				return num3;
			}else return num1;
			
			}
		}
		
		
	
	