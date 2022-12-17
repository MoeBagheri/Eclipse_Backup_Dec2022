package package01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Class04 {

//	public Class04() {
		// TODO Auto-generated constructor stub
//	}	
	    public static void main(String[] args) {
	    	int[][] myArr = readFile();
	    	calcRowSum(myArr);
	    	//calcColSum(myArr);
	    	//calcTotal(myArr);
	    }
	    public static void calcRowSum(int[][] arr) {
	    	for (int i=0;i<arr.length;i++) {
	    		int rowsum = 0;
	    		for (int j=0;j<arr[i].length;j++) {
	    			rowsum = rowsum + arr[i][j];
	    		}
	    		System.out.println("row " + i + " sum --> " + rowsum);
	    	}
	    	
	    }
	    public static int[][] readFile() {
	    	int[][] arr = null;
	        String fileName = "Car4.txt"; // change this
	        try {
	            Scanner inputStream = new Scanner(new File(fileName));
				String line1 = inputStream.nextLine();
				String[] arr1 = line1.split(" ");
				int NUM_ROW = Integer.parseInt(arr1[0]);
				int NUM_COL = Integer.parseInt(arr1[1]);
				
	            arr = new int[NUM_ROW][NUM_COL];
	            int row_count = 0;
	            while (inputStream.hasNextLine()) {
					String line = inputStream.nextLine();
					String[] str_arr = line.split(",");
					for (int i=0;i<NUM_COL;i++) {
						int num = Integer.parseInt(str_arr[i]);
						arr[row_count][i] = num;
					}
					row_count++;
				}
	            inputStream.close( );
	        }
	        catch(FileNotFoundException e)
	        {
	            System.out.println("Cannot find file " + fileName);
	        }
	        catch(Exception e)
	        {
	            System.out.println("Problem with input from file " + fileName);
	        }
	        return arr;
	    }
	}
	
