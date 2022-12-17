package package02;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Class01 {

//	public Class01() {
//	}
	public static void main (String[]args) {
		Class01 w = new Class01();
		w.ReadFromFile();     
//		int[] data = readFiles("Car4.txt");
//		System.out.println(Arrays.toString(data));
	}
	
	private void ReadFromFile() {
		String pathname = "C:\\users\\Mhoss\\OneDrive\\Desktop\\Car4.txt"; //This is where you have to address the file!
		File file = new File (pathname);
	
		
//		int[] file = ReadFromFile("Car4.txt");
//		System.out.println(Arrays.toString(data))
//		int[] data = readFiles("Car4.txt");
//		System.out.println(Arrays.toString(data));
//	}

//	public static int[] readFiles(String file) {
		try {
			char[] ch = new char[1000];
			FileReader fr = new FileReader (file);
			fr.read(ch);
			System.out.println("The content of file --> " +file.getName()+" are:");
			for (char c: ch) {
				System.out.print(c);
			}
			fr.close();
		
//			File f = new File(file);
//			Scanner s = new Scanner(f);
//			int ctr = 0;
			
//			while (s.hasNextInt()) {
//			ctr++;
//			s.nextInt();
		
			
//	int[] arr = new int[ctr];
//	Scanner s1 = new Scanner(f);
//	for (int i = 0; i< arr.length; i++)
//	arr[i] = s1.nextInt();
//	return arr;
		}
//		catch(Exception e) {
//			return null;
//		catch(FileNotFoundException e) {
//			System.out.println("Error oppening the file --> " + file);
//			System.exit(0);
		catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	
