package homework1;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 


public class Main {
//		public static void main (String[]args) {
		public static void main(String[] args) throws Exception {

		Main w = new Main();
		w.ReadFromFile();     
	}	private void ReadFromFile() {
		String pathname = "C:\\users\\Mhoss\\OneDrive\\Desktop\\Car4.txt"; //This is where you have to address the file!
		File file = new File (pathname);
		try {
	char[] ch = new char[1000];
			FileReader fr = new FileReader (file);
			fr.read(ch);
			System.out.println("The content of file --> " +file.getName()+" are:");
			for (char c: ch) {
				System.out.print(c);
				
				
				
				
				
				
				
				
			
				
			}fr.close();
		}catch (Exception e) {
				e.printStackTrace();
			}
		}


/*			
			List<String> lines = Collections.emptyList();
			try { 
				lines = Files.readAllLines(Paths.get("Car4.txt"), StandardCharsets.UTF_8);
			} catch (IOException e) {
				e.printStackTrace();
				} System.out.println("Content of List:");
				System.out.println(lines);	
				BufferedReader bufReader = new BufferedReader(new FileReader("Car4.txt"));
				ArrayList<String> listOfLines = new ArrayList<>();
				String line = bufReader.readLine();
				while (line != null) { listOfLines.add(line);
				line = bufReader.readLine();
				} bufReader.close();
//				System.out.println("Content of ArrayLiList:");
//				System.out.println(listOfLines);
		*/		} 
			
			
	
