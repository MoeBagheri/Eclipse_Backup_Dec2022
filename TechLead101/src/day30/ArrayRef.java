package day30;

import java.util.Arrays;

public class ArrayRef {
	public static void main(String[] args) {
		int[] num = {1,2,3,4};
		System.out.println(Arrays.toString(num));
		int []num2 = num;
		System.out.println(Arrays.toString(num2));
		num2[0]=10;
		num2[1]=12;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));

	}

}
