package hW1_Tom_Mercer;

import java.util.Scanner;

public class Car {
		private static Scanner keyboard = new Scanner(System.in);
		private int carNum;
		private String make;
		private String model;
		private int year;
		private String color;
		private double mpghwy;
		private double mpgcty;
		private int curbWeight;
		private int nCylinders;
		private double fuelTank;
		
		private double getHwyRange() {
			return fuelTank * mpghwy;
		}
		
		private double getCtyRange() {
			return fuelTank * mpgcty;
		}
		
		public Car(int _carNum) {
			carNum = _carNum;
		}
		
		public Car(int _carNum, String _make, String _model, int _year, String _color, double _mpghwy, double _mpgcty, int _curbWeight, int _nCylinders, double _fuelTank) {
			carNum = _carNum;
			make = _make;
			model = _model;
			year = _year;
			color = _color;
			mpghwy = _mpghwy;
			mpgcty = _mpgcty;
			curbWeight = _curbWeight;
			nCylinders = _nCylinders;
			fuelTank = _fuelTank;
		}
		
		public void correctUnknowns() {
	    	if (make.equals("Unknown Make")) {
	    		System.out.println("The make of car # " + carNum + " is missing, please input the manufacturer below");
	    		make = keyboard.nextLine();
	    	}
	    	if (model.equals("Unknown Model")) {
	    		System.out.println("The model of car # " + carNum + " is missing, please input the " + make + " model below");
	    		model = keyboard.nextLine();
	    	}
	    	if (year == 0) {
	    		System.out.println("The model year of car # " + carNum + " is missing, please input the model year of the " + make + " " + model + " below");
	    		year = keyboard.nextInt();
	    	}
	    	if (color.equals("Unknown Color")) {
	    		System.out.println("The color of car # " + carNum + " is missing, please input the color of the " + year + " " + make + " " + model + " below");
	    		color = keyboard.nextLine();
	    	}
	    	if (mpghwy == 0.0) {
	    		System.out.println("The highway mpg of car # " + carNum + " is missing, please input the highway mpg of the " + year + " " + make + " " + model + " below");
	    		mpghwy = keyboard.nextDouble();
	    	}
	    	if (mpgcty == 0.0) {
	    		System.out.println("The city mpg of car # " + carNum + " is missing, please input the city mpg of the " + year + " " + make + " " + model + " below");
	    		mpgcty = keyboard.nextDouble();
	    	}
	    	if (curbWeight == 0) {
	    		System.out.println("The curb weight of car # " + carNum + " is missing, please input the curb weight, in pounds, of the " + year + " " + make + " " + model + " below");
	    		curbWeight = keyboard.nextInt();
	    	}
	    	if (nCylinders == 0) {
	    		System.out.println("The number of cylinders in the engine of car # " + carNum + " is missing, please input the number of cylinders in the " + year + " " + make + " " + model + " below");
	    		nCylinders = keyboard.nextInt();
	    	}
	    	if (fuelTank == 0.0) {
	    		System.out.println("The fuel tank size of car # " + carNum + " is missing, please input the fuel tank size, in gallons, of the " + year + " " + make + " " + model + " below");
	    		fuelTank = keyboard.nextDouble();
	    	}
		}
		
		public String toString() {
			String str =       ("Car_" + carNum + "\n" + 
								"\n" + 
								"	" + make + ", " + model + ", " + year + "\n" +
								"\n" +
								"	Highway range: " + getHwyRange() + "\n" +
								"\n" +
								"	City range: " + getCtyRange() + "\n" +
								"\n");
			return str;
		}


		
}