package homwwork1;

import java.util.Scanner;

public class Car {
		//private static Scanner keyboard = new Scanner(System.in);
		private int carNumber;
		private String make;
		private String model;
		private int year;
		//private String color;
		private double mpghwy;
		private double mpgcty;
		//private int weight;
		private int nCylinders;
		private double tankSize;
		
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
		
		public Car(int _carNumber, String _make, String _model, int _year, String _color, double _mpghwy, double _mpgcty, int _weight, int _nCylinders, double _tankSize) {
			carNumber = _carNumber;
			make = _make;
			model = _model;
			year = _year;
			//color = _color;
			mpghwy = _mpghwy;
			mpgcty = _mpgcty;
			//weight = _weight;
			nCylinders = _nCylinders;
			tankSize = _tankSize;
		}
		
		public Car(int _carNumber) {
			carNumber = _carNumber;
		}
		
		public String toString() {
			return "Car_" + carNumber + ":" +
			 "\n" + make + ", " + model + ", " + year+ 
			 "\n" + "max mileage on hwy: " + (tankSize * mpghwy) +
			 "\n" + "max mileage on city: " +(tankSize * mpgcty);
		}
}