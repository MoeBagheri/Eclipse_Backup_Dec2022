/*
package package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class First {

//	public First() {
		public static void main(String[] args) throws IOException{
			File fileName = new File("Car01.txt");
			ArrayList alist = new ArrayList();
			String car = " ";
			while (!car.isEmpty()) {
				
				
				
				car = ("Name a car please!");
				
				
				if (!car.isEmpty()) alist.add(car);
				
			}
			try {
				FileWriter fw = new FileWriter(fileName);
				Writer output = new Bufferedwriter(fw);
				int sz = alist.size();
				for (int i = 0; i<sz; i++) {
					output.write(alist.get(i).toString()+"\n");
				}
				output.close();
			}
			catch (Exception e) {
				System.out.println("Problem!");
			}
		}
}
*/
