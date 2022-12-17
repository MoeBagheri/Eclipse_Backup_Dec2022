package codingBat;

import java.util.Arrays;

public class CenteredAverage {
	
	public static void main(String[] args) {
	    int[] a = new int[] {1, 1, 5, 5, 10, 8, 7};
	    int res = centeredAverage(a); // 5

	    System.out.println(res);
	}


public static int centeredAverage(int[] nums) {
    // your code goes here
  int sum =0;
  int center=0;
  Arrays.sort(nums);
  
  for (int i=1; i<nums.length-1; i++){
    sum += nums[i];
    center = sum/(nums.length-2);
  }
  return center;
}
}
