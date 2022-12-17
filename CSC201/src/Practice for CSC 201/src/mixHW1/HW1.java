package mixHW1;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
	public static void main (String[]args) {
		HW1 w = new HW1();
		w.ReadFromFile();     

	}	
	private void ReadFromFile() {
		String pathname = "C:\\users\\Mhoss\\OneDrive\\Desktop\\Car4.txt"; //This is where you have to address the file!
		File file = new File (pathname);

		try {
			char[] ch = new char[1000];
			FileReader fr = new FileReader (file);
			fr.read(ch);
			System.out.println("The content of file --> " +file.getName()+" are:");
			for (char c: ch) {
				System.out.print(c);
			}
			fr.close();
		
		}

		catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	
