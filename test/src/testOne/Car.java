package testOne;

import java.util.Scanner;

public class Car {
		//private static Scanner keyboard = new Scanner(System.in);
		private int carNumber;
		private String make;
		private String model;
		private int year;
		private String color;
		private double mpghwy;
		private double mpgcty;
		private int weight;
		private int nCylinders;
		private double tankSize;
		private static String size;
		
		public void fixMe () {
			Scanner keyboard = new Scanner(System.in);
		
			while (nCylinders == 0) {
	    		System.out.println("The number of cylinders of car "
			+ carNumber+" below");
	    		nCylinders = keyboard.nextInt();
		}	
	    		while (tankSize == 0.0) {
		    		System.out.println("The number of tank size of car "
				+ carNumber+" below");
	    		tankSize = keyboard.nextDouble();	
	    		keyboard.close();
			
		}}
		
		public void findTankBigSize () {
			public static int getSmallest(int[] a, int tankSize ) {
				int temp;
			
			for (int i = 0; i <tankSize ; i++)   
	        {  
	            for (int j = i + 1; j < tankSize; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[0];  
	}  
		
		public static void Findsmalls() {
			int[] counter = new  int [2];
			 int[] counter  = {0,0}   
			 	for (int i=0; str.lenght;i++);
		}
		
		
		
		public Car(int _carNumber, String _make, String _model, 
				int _year, String _color, double _mpghwy, 
				double _mpgcty, int _weight, int _nCylinders, 
				double _tankSize, String _size) {
			carNumber = _carNumber;
			make = _make;
			model = _model;
			year = _year;
			color = _color;
			mpghwy = _mpghwy;
			mpgcty = _mpgcty;
			weight = _weight;
			nCylinders = _nCylinders;
			tankSize = _tankSize;
			size = _size;
		}
		
		public Car(int _carNumber) {
			carNumber = _carNumber;
		}
		
		
		
		
		public String toString() {
			return "there are " +  + ":" +size+
		"\n" +
			 "the Biggest one is"+(Findsmalls);
		}
}