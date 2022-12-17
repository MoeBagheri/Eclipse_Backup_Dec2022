package day29;

import java.util.Arrays;

public class Price {
public static void main(String[] args) {
	double [] price=new double [3];
	price[0]=14.99;
	price[1]=9.99;
	price[2]=1.5;
	
	//or:
	int [] price2 = {3,4,2,4,5,9};
 
	
	System.out.println(Arrays.toString(price));
	System.out.println(Arrays.toString(price2));

	
	//sum:
	double sum = price[0]+price[1]+price[2];
	System.out.println(sum);
	
	
	//to see the length
	System.out.println(price.length);

}
}
