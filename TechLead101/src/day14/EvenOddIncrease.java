package day14;

import java.util.Random;

public class EvenOddIncrease {

		// TODO Auto-generated method stub
		
	//	public static void main(String[] args) {
			Random r = new Random();
			int value = r.nextInt(1001); // 0 - 1000
			System.out.println("original value: " + value);
			
			// TODO if value is even number increase by 2
			//      otherwise increase by 3
			//      change this to use ternary operator
			
			if (value % 2 == 0) {
				value = value * 2;
			} else {
				value = value * 3;
			}
			
			value = value %2 == 0 ? (value=value*2) : (value = value * 3); 
			
			
			
			System.out.println("increased value: " + value);

	}

}
