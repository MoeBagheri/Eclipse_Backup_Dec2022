package day33;

import java.util.Arrays;

public class MArrayTwo {
	public static void main(String[] args) {
		double[][] numbers = {
				{1.1, 1.3, 2.1, 2.5, 6.5}, 
				{7.5, 4.3, 6.1, 3.1}, 
				{4.3, 9.9, 8.1, 7.5}
				};
		
		System.out.println(Arrays.deepToString(numbers));
		
		double sum = 0.0;
		//             0                       1                     2
		// [[1.1, 1.3, 2.1, 2.5, 6.5], [7.5, 4.3, 6.1, 3.1], [4.3, 9.9, 8.1, 7.5]]
		//    0   1    2     3    4      0    1    2    3      0    1    2    3
		
		for (int i = 0; i < numbers.length; i++) {
			double[] innerArray = numbers[i];
			System.out.println(Arrays.toString(innerArray));
			for (int j = 0; j < innerArray.length; j++) {	
				sum += innerArray[j];
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("---");
		
		sum = 0.0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j];
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("---");
		
		// for (element : array) 
		// [[1.1, 1.3, 2.1, 2.5, 6.5], [7.5, 4.3, 6.1, 3.1], [4.3, 9.9, 8.1, 7.5]]
		sum = 0.0;
		for (double[] innerArray : numbers) {
			System.out.println(Arrays.toString(innerArray));
			for (double element : innerArray) {
				sum += element;
			}
		}
		System.out.println("Sum: " + sum);
	}
}