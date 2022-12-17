package HomeWork_.src.homeWork2_Moe; //selection sort -->> wekipedia  //pathway -->> White**

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Car[][] cars = openFile();
		CarDealer[] dealers = new CarDealer[cars.length];
		for (int i = 0; i < cars.length; i++) {
			dealers[i] = new CarDealer((char) (i + 65) + "", cars[i]);
		}
		printSummary(cars, dealers);
		for (int i = 0; i < dealers.length; i++) {
			selectionSort(dealers[i]);
			System.out.println("Sorted Dealer" + dealers[i].getDealerID()+"\n");
			for (int j = 0; j < dealers[i].getCars().length; j++) {
				System.out.print("car_" + dealers[i].getCars()[j].getCarNumber() + "\n");

			}
			System.out.println();
		}
	}

	public static void printSummary(Car[][] cars, CarDealer[] dealers) {
		for (int i = 0; i < cars.length; i++) {
			//System.out.println("Dealer " + dealers[i].getDealerID());

			for (int j = 0; j < cars[i].length; j++) {
				//System.out.println(cars[i][j]);
			}
		}

	}

	public static void selectionSort(CarDealer dealer) {
		for (int j = 0; j < dealer.getCars().length - 1; j++) {
			int min = j;
			for (int k = j + 1; k < dealer.getCars().length; k++) {
				Car a = (dealer.getCars()[k]);
				Car b = (dealer.getCars()[min]);
				if (dealer.getDealerID().equals("A")) {
					if (a.getTankSize() < b.getTankSize()) {
						min = k;
					}
				} else if (dealer.getDealerID().equals("B")) {
					if (a.getYear() < b.getYear()) {
						min = k;
					}
				} else if (dealer.getDealerID().equals("C")) {
					if (a.getMpghwy() < b.getMpghwy()) {
						min = k;
					}
				}
			}
			Car temp = dealer.getCars()[j];
			dealer.getCars()[j] = dealer.getCars()[min];
			dealer.getCars()[min] = temp;
		}
	}

	public static Car[][] openFile() {

		Car[][] arr = null;
		String fileName = "src/homeWork2_Moe/cars.txt"; 
		try {
			Scanner inputStream = new Scanner(new File(fileName));
			String s = inputStream.nextLine();
			String[] s_arr = s.split(", ");
			arr = new Car[s_arr.length][];

			for (int i = 0; i < s_arr.length; i++) {
				int x = Integer.parseInt(s_arr[i].trim());
				arr[i] = new Car[x];
			}
			// 
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					String Line1 = inputStream.nextLine();
					String[] str_arr = Line1.split(", ", -1);

					//this is where all the other objects are
					String dealerID = str_arr[0];
					int carNumber = Integer.parseInt(str_arr[1]);
					
					String make = str_arr[2];
					int year = Integer.parseInt(str_arr[3]);
					String model = str_arr[4];
					String color = str_arr[5];
					double mpghwy = Double.parseDouble(str_arr[6]);
					double mpgcty = Double.parseDouble(str_arr[7]);
					int weight = Integer.parseInt(str_arr[8]);
					int nCylinders = Integer.parseInt(str_arr[9]);

					double tankSize = Double.parseDouble(str_arr[10]);

					Car c = new Car(dealerID, carNumber, make, model, year, color, mpghwy, mpgcty, weight, nCylinders, tankSize);
					arr[i][j] = c;
					// System.out.println(c);
				} 
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			System.out.println("The code you created cannot find this file -->> " + fileName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The file was found, but there is an Error while inputting this file -->> " + fileName);
		}
		return arr;
	}
}
