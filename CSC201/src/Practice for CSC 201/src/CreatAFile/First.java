package CreatAFile;
import java.util.Formatter;
import java.io.*;
import java.lang.*;

public class First {
	private Formatter x;

	public static void main(String[] args) {
		final Formatter g;
		try {
			g = new Formatter("Car0001.txt");
			System.out.println("You created a file");
		}
		catch(Exception e) {
			System.out.println("ERROR!");
			
		}

	}
	public void addRecords() {
		x.format("%$%$%", "20", "kk", "dd");
	}
	public void closeFile() {
		x.close();
	}
	public void openFile() {
		// TODO Auto-generated method stub
		
	}

}
