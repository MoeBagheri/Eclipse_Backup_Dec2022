package testOne;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
    	Car[] cars = openFile();
    	fixUnknowns (cars);
    	printSummary(cars);
    	printTheBiggestTankSize(cars);
    	
    	
    	
    	
    } public static void printSummary(Car[] cars) {for(int i=0; i<cars.length; i++)
    		System.out.println(cars[i]);
    
    }public static void fixUnknowns(Car[] cars) {
        	for (int i=0; i<cars.length; i++)
        		cars[i].fixMe();
    	 }
    
    public static void printTheBiggestTankSize(Car[] cars) {
    	for (int i=0; i<cars.length; i++)
    		cars[i].findTankBigSize();
    }
    
    
    public static Car[] openFile() {
	   Car[] arr = null;
	   String fileName = "src/testOne/cars.txt";
       try{
           Scanner inputStream = new Scanner(new File(fileName));
           int numberOfCars = inputStream.nextInt();
           inputStream.nextLine();
           arr = new Car[numberOfCars];
           for (int i=0; i <numberOfCars; i++) {
        	   String newLine = inputStream.nextLine();
        	   String[] ary = newLine.split(", ");
        	   int carNumber = Integer.parseInt(ary[0]);
        	   String make = ary[1];
        	   int year = Integer.parseInt(ary[2]);
        	   String model = ary[3];
        	   String color = ary[4];
        	   double mpghwy = Double.parseDouble(ary[5]);
        	   double mpgcty = Double.parseDouble(ary[6]);
        	   int weight = Integer.parseInt(ary[7]); 
        	   int nCylinders = Integer.parseInt(ary[8]);
        	  // if  (ary[8].equals ("")) 
        		//   ary[8]="0";
        	   double tankSize = Double.parseDouble(ary[9]);
        	 //  if  (ary[9].equals ("")) 
        	   
        	  String size = ary[10];
        	   
        	   
        		 //  ary[9]="0.0";
        		   
        		   Car c = new Car(carNumber, 
        				   make, model, year, color, mpghwy, mpgcty, weight, nCylinders, tankSize, size);
        	   arr[i] = c;
           }inputStream.close();
       } catch(FileNotFoundException e){
           System.out.println("Cannot find file " + fileName); 
       } catch(Exception e){
           System.out.println("Problem with input from file " + fileName); 
       }return arr;
   }  
}