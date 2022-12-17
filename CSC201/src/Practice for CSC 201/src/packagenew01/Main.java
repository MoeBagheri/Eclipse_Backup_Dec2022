package packagenew01;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.text.*;

public class Main {


	private String make, model, color;
	private int year, cylinder, carNum;
	private double mpg_hwy, mpg_city, tank_size, weight;
	private double maxMilesHwy, maxMilesCity;
	File fileName = new File ("Car4.txt");

	public Main (int carNum, int year, String make, String model, String color, int cylinder,
	double mpg_hwy, double mgp_city, double tank_size, double weight){
		
		this.carNum = carNum;
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;	
		this.cylinder = cylinder;
		this.tank_size = tank_size;
		this.weight = weight;
	}
//	public Main() {
	// TODO Auto-generated constructor stub
//	}
	public void summary() {
		System.out.println("Make: " + make + " Model:  " + model + "Year: " + year);
		System.out.println("Max milage highway: ");
		System.out.println("Max milage city: ");
	}
	public void setMaxMilage() {
		maxMilesHwy = (mpg_hwy * tank_size);
		maxMilesCity = (mpg_city * tank_size);
	} 
	public double getTankSize(){
		return tank_size;
	}
	public double getWeight() {
		return weight;
	}
	public void setTankSize(double newTankSize) {
		if (tank_size == 0.0 && newTankSize > 0)
			tank_size = newTankSize;
		else if (newTankSize <= 0)
			System.out.println("Invalid entry tank must hold more than 0 gallons of gas");
		else 
			System.out.println("Error all tank size info instantiated");
		}
	public void readFile(){
		String line = null;
		try {
			 line = buffRead.readLine();
			while (line != null) {
				System.out.println(line);
				line = buffRead.readLine();
			}
			buffRead.close();
		}
			catch(FileNotFoundException e)
			{
				System.out.println("Error opening file " + fileName);
				System.exit(0);
			}
			catch(Exception e)
			{
				System.out.println("Problem with input from file " + fileName);
			}
		}
		public Main parseData(){
			String data_line = null;
		    String[] data;
		    try {
				 data_line = in.readLine();
				 while (data_line != null) {
					 data_line = in.readLine(); 
					 data = data_line.split(",");
						for(String s : data) {
							System.out.println(s);
						carNum = Integer.parseInt(data[0]);
						year = Integer.parseInt(data[1]);
						make = data[2];
						model = data[3];
						color = data[4];
						cylinder = Integer.parseInt(data[5]);
						mpg_hwy = Double.parseDouble(data[6]);
						mpg_city = Double.parseDouble(data[7]);
						}
				}
				 in.close(); System.exit(0);
		    	}
				catch(FileNotFoundException e)
				{
					System.out.println("Error opening file " + fileName);
					System.exit(0);
				}
				catch(Exception e)
				{
					System.out.println("Problem with input from file " + fileName);
					System.exit(0);
				}
		    	return new Main(carNum, year, make, model, color, cylinder,
					mpg_hwy, mpg_city, tank_size, weight);
			}
		  	public void test() {
		        Main a = new Main();

		        try {
		            List<String> carArray = Files.readAllLines(java.nio.file.Paths.get("Car4.txt"));

		            for (String line: carArray){
		                String[] arr = line.split(",");

		            }

		            System.out.println(carArray.toString());
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		  	}
}