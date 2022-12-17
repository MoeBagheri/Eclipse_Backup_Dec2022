package day14;

import java.util.Random;

public class Review {

		// this is global constanta 
		public static final int CONST_VALUE = 10;
		
	//	public static void main(String[] args) {
			
			////////////////////////////////////////////////////////
	
			/* Part 1 */
			
			// 1. Constants in Java & final keyword
			
			System.out.println(CONST_VALUE);
			
			// cannot change value of final const variables
			// CONST_VALUE = 15; compilation error
			
			final String name = "John Doe";
			System.out.println(name); // John Doe
			// name = "Alex"; compilation error
			
			printName("Alex");
		}
		
		public static void printName(final String name) {
			System.out.println(name);
			
		////////////////////////////////////////////////////////
			/* Part 2 */
			
			// Math class is a helper class to do more advance math with formulas
			
			int num = -13;
			System.out.println(Math.abs(num));
			
			double dNum = 3.9;
			dNum = Math.floor(dNum); // round down
			System.out.println(dNum); // 3.0
			
			dNum = 4.1;
			dNum = Math.ceil(dNum); // round up
			System.out.println(dNum); // 5.0
			
			dNum = 5.6;
			dNum = Math.round(dNum);
			System.out.println(dNum); // 6.0
			
			dNum =  5.4;
			dNum = Math.round(dNum);
			System.out.println(dNum); // 5.0
			
			dNum =  9.5;
			dNum = Math.round(dNum);
			System.out.println(dNum); // 10
			
			System.out.println(Math.min(1, 7)); // 1
			System.out.println(Math.max(5, 2)); // 5
			
			////////////////////////////////////////////////////////

			
			/* Part 3 */
			
			
				
					Random r = new Random();
					// nextInt(int bound)
					// it returns random number from 0 inclusive till bound exclusive
					
					// nextInt(10); -> 0 - 9
					
					int randomValue = r.nextInt(10);
					System.out.println("random value: " + randomValue);
			
				////////////////////////////////////////////////////////

					
					/* Part 4 */
					
					int y = 10;
					int x;
					
					// if y is greater than 5, assign x as y * 2 otherwise y * 3
//					if (y > 5) {
//						x = y * 2;
//					} else {
//						x = y * 3;
//					}
					
					// ternary operator is good when we need to assign some value based on the condition
					// = condition ? trueValue : falseValue  
					x = y > 5 ? y * 2 : y * 3;
					
					System.out.println("y: " + y);
					System.out.println("x: " + x);
					
					boolean b = false;
					//           F
					String str = b ? "left value" : "right value";
					System.out.println(str); // right value
					
					int value = 12;
					
					String msg = value % 2 == 0 ? "even" : "odd";
					System.out.println(msg); // even
					//             F
					int number = 5 > 6 ? 4 : (6 > 5 ? 7 : 8);
					System.out.println(number); // 7
					
					int numberTwo = 6 % 3 == 0 ? (5 > 9 ? 12 : 15) : (99 % 3 == 0 ? 100 : 1);
					System.out.println(numberTwo); // 15
					
		}
	

	}



