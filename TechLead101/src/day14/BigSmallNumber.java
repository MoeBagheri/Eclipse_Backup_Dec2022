package day14;

import java.util.Random;

public class BigSmallNumber {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int value = r.nextInt(101);
		String msg = "";
		
		msg = value > 50 ? ("Big Number") : ("Small Number");
		
		System.out.println("value: " + value);
		System.out.println("Messege: " + msg);

	}

}
