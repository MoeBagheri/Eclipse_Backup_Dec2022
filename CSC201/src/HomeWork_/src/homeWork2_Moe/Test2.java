/*package homeWork2_Moe;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import homwwork1.Car;
public class tes {
    public static void main(String[] args) {
    	
    	Car[] cars = openFile();
  //  	fixUnknowns (cars);
    	printSummary(cars);
    } 
    public static void printSummary(Car[] cars) {
    	for(int i=0; i<cars.length; i++)
    		System.out.println(cars[i]);
    
    }
 //   public static void setDealers(Car[] cars) {
  //      	for (int i=0; i<cars.length; i++)
   //     		cars[i].dealerSet(null);			//IDK this one
    //	 }
    
    //you are going to moarefi koni dealler ro// dealer.addCar(x,B) 
    
    public static Car[] openFile() {
    	//public 
	   Car[][] arr = null;
	   String fileName = "src/homeWork2/cars.txt";
       try{
           Scanner inputStream = new Scanner(new File(fileName));
           String s = inputStream.nextLine();
           
           String[] s_arr = s.split(", ");
           arr = new Car[s_arr.length][];
           
           int numberOfCars = 0;
           
           for(int i=0; i<s_arr.length; i++) {
        	   int x = Integer.parseInt(s_arr[i]);
        	   numberOfCars+= x;
           }
           for (int i=0; i<numberOfCars; i++) {
        	   String Line1 = inputStream.nextLine();
        	   String[] str_arr = Line1.split(", ", -1);
        	   
        	   if (str_arr [0].isEmpty()) 
        		   str_arr[0] = "A";
        	   String dealerA = str_arr[0].trim();
        	   char dealerASet = (dealerA.toUpperCase()).charAt(0);
        	   int dealerAToNum = (int) dealerASet;
        	   dealerAToNum -=65; 
        	   
        	   if (str_arr [1].isEmpty())
        		   str_arr[1] = "B";
        	   String dealerB = str_arr[0].trim();
        	   char dealerBSet = (dealerB.toUpperCase()).charAt(0);
        	   int dealerBToNum = (int) dealerBSet;
        	   dealerBToNum -=66;
        	   
        	   if (str_arr [2].isEmpty())
        		   str_arr[2] = "C";
        	   String dealerC = str_arr[0].trim();
        	   char dealerCSet = (dealerC.toUpperCase()).charAt(0);
        	   int dealerCToNum = (int) dealerBSet;
        	   dealerCToNum -=67;
           
        	   
        	   
        		   
    //    	   ary = new Car[][s_ary.length];	   
        	      
        	   int carNumber = Integer.parseInt(ary[0]);
        	   String make = ary[1];
        	   int year = Integer.parseInt(ary[2]);
        	   String model = ary[3];
        	   String color = ary[4];
        	   double mpghwy = Double.parseDouble(ary[5]);
        	   double mpgcty = Double.parseDouble(ary[6]);
        	   int weight = Integer.parseInt(ary[7]);
        	   int nCylinders = Integer.parseInt(ary[8]);
        	  
        	 //  if  (ary[8].equals ("")) 
        	//	   ary[8]="0";
        	   
        	   double tankSize = Double.parseDouble(arr[10]);
        	   
        	//   if  (ary[9].equals ("")) 
        	//	   ary[9]="0.0";
        		   
        		   Car c = new Car(carNumber, make, model, year, color, mpghwy, mpgcty, weight, 
        				   nCylinders, tankSize);
        	   ary[i] = c;
           }
           inputStream.close();
       } catch(FileNotFoundException e){
           System.out.println("The code you created cannot find this file -->> " + fileName); 
       } catch(Exception e){
           System.out.println("The file was found, but there is an Error while inputting this file -->> " + fileName); 
       }return ary;
   }  
}
*/