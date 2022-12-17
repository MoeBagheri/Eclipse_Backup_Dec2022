package hw1_john_doe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hw1_driver {
    public static void main(String[] args) {
    	Rectangle2[] recs = readFile();
    	outputSize(recs);
    	tryTom(recs);
    }
    public static void tryTom(Rectangle2[] recs) {
    	//if rec.area < 20 --> "small" otherwise "big"
    	//THRESHOLD = 20;
    	for (int i=0; i<recs.length-1; i++) {
    		int larger_index = 
    				(recs[i].getArea() > recs[i+1].getArea())? i:i+1;
    		System.out.println("larger rec index->" + larger_index);
    	}    	
    }
    public static void outputSize(Rectangle2[] recs) {
    	int totArea = 0;
    	int totPeri = 0;
    	for (int i=0; i<recs.length; i++) {
    		totArea = totArea + recs[i].getArea();
    		totPeri = totPeri + recs[i].getPerimeter();
    	}
    	System.out.println("tot area -->" + totArea);
    	System.out.println("tot peri -->" + totPeri);
    	
    }
    
    public static Rectangle2[] readFile() {
    	Rectangle2[] arr = null;
        String fileName = "rec_dim.txt";
        try {
            Scanner inputStream = new Scanner(new File(fileName));
			int num_rec = inputStream.nextInt();
			arr = new Rectangle2[num_rec];
			inputStream.nextLine();
            int row_count = 0;
            for (int i=0; i<num_rec; i++){
				String line = inputStream.nextLine();
				String[] str_arr = line.split(" ");
				int width = Integer.parseInt(str_arr[0]);
				int length = Integer.parseInt(str_arr[1]);
				String color = str_arr[2];
				Rectangle2 r = new Rectangle2();
				r.setDimensions(newWidth, newHeight);
				arr[i] = r;
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
