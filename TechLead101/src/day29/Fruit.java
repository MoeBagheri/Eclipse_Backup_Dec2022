package day29;

import java.util.Arrays;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String[] fruit = new String[4];
			
			fruit[0] = "orange";
			fruit[1] = "kiwi";
			fruit[2] = "banana";
			fruit[3] = "apple";
			
			String str = fruit[2];
			System.out.println(str);//banana
			
			fruit[3] = "charries";
			System.out.println(fruit[3]);
			
			String strArray = Arrays.toString(fruit);
			System.out.println(strArray); //[orange, kiwi, banana, charries]
		}
	}