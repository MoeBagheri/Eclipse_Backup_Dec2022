package hW1_Tom_Mercer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dealer {
    public static void main(String[] args) {
    	Car[] cars = readFile();
    	setUnknowns(cars);
    	outputSummary(cars);
    }
    
    public static void outputSummary(Car[] cars) {
    	for (int i=0; i<cars.length; i++)
    		System.out.println(cars[i]);
    }
    
    public static void setUnknowns(Car[] cars) {
    	for (int i=0; i<cars.length; i++)
    		cars[i].correctUnknowns();
    }
    
    public static Car[] readFile() {
    	Car[] arr = null;
    	String fileName = "src/homwwork2/Cars.txt";
        try {
            Scanner inputStream = new Scanner(new File(fileName));
            int num_cars = inputStream.nextInt();
            arr = new Car[num_cars];
            inputStream.nextLine();
            for (int i=0; i<num_cars; i++){
            	String line1 = inputStream.nextLine();
				String[] str_arr = line1.split(",", 10);
				int carNum = i + 1;
				if (str_arr[1].isEmpty()) 
					str_arr[1] = "Unknown Make";
				String make = str_arr[1].trim();
				if (str_arr[2].isEmpty())
					str_arr[2] = "0";
				int year = Integer.parseInt(str_arr[2].trim());
				if (str_arr[3].isEmpty())
					str_arr[3] = "Unknown Model";
				String model = str_arr[3].trim();
				if (str_arr[4].isEmpty())
					str_arr[4] = "Unknown Color";
				String color = str_arr[4].trim();
				if (str_arr[5].isEmpty())
					str_arr[5] = "0";
				double mpghwy = Double.parseDouble(str_arr[5].trim());
				if (str_arr[6].isEmpty())
					str_arr[6] = "0";
				double mpgcty = Double.parseDouble(str_arr[6].trim());
				if (str_arr[7].isEmpty())
					str_arr[7] = "0";
				int curbWeight = Integer.parseInt(str_arr[7].trim());
				if (str_arr[8].isEmpty())
					str_arr[8] = "0";
				int nCylinders = Integer.parseInt(str_arr[8].trim());
				if (str_arr[9].isEmpty())
					str_arr[9] = "0";
				double fuelTank = Double.parseDouble(str_arr[9].trim());
				Car c = new Car(carNum, make, model, year, color, mpghwy, mpgcty, curbWeight, nCylinders, fuelTank);
				arr[i] = c;
            }
            inputStream.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Cannot find file " + fileName);
        }
        catch(Exception e) {
            System.out.println("Problem with input from file " + fileName);
        }
        return arr;
    }
}