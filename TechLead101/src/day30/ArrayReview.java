package day30;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		//Array is fixed size collection of data (of the same type)
		// - array works with references similarly as objects do
		// - array's elements will have default values if nothing was assigned
		int [] numArr = new int[3];
		System.out.println(numArr); // [I@6bf2d08e
		
//		System.out.println(numArr[0]);
//		System.out.println(numArr[1]);
//		System.out.println(numArr[2]);
		String arrStr = Arrays.toString(numArr);
		System.out.println(arrStr);
		
//		System.out.println(numArr[3]);//ArrayIndexOutOfBoundsException
		
		String[] strArr = new String[] {"John", "Alex", "Kuba", "Ramesh"};
		System.out.println(Arrays.toString(strArr));
		
		double[] dNumsArr = {5.5, 1.5, 3.2, 1.1, 9.9};
		System.out.println(Arrays.toString(dNumsArr));

		dNumsArr = new double[] {1.5, 7.7, 1.9};
		System.out.println(dNumsArr);
		
		// length - instance variable
		int size = dNumsArr.length; // find out number of elements of array
		System.out.println("Size: "+ size);
	}
}