package package1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class Second {
//	public Second() {
//	}
	public static void main(String[] args) {
// This is where the array starts!		
		//int[] a = {10,20,30};
		//int[] a = new int [5];
		//String[] st = new String [5];
		//a [2] = 25;
//IDK what to put here	st [1] = 
		//for(int temp : a) {
			//System.out.println(temp);
		System.out.println("Hi Welcome to my first program!");
//		try {
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("How many cars are going to be in your list?");
		a = input.nextInt();
		String[] names = new String[a];
//		}   First I need to learn if it catch the proble how to restart the loop?!
//		catch (Exception e) {
//			System.out.println("Enter a number Please!");
//		}
		for(int counter = 0; counter < a; counter++) {
			System.out.println("Enter the name of the car"+(counter+1));
			names[counter] = input.next();
			} input.close();
	System.out.println("Your info will be");
	for(int counter = 0; counter < a; counter++) {
		System.out.println(names[counter]);
//		System.out.println("Please enter the missing value!");	
// You Started to create the file from here!		
		String fileName = "Car001.txt";
		try {
		PrintWriter outputStream = new PrintWriter(fileName);
		PrintWriter outputStram = null;
// You can Start writing on the file from here!
		//outputStream.println("HI");
	//outputStream.println(a[2]);	
	//outputStream.println(st[1]);
		outputStream.println(names[counter]);  //IDK how can I put all the names in there?
		
// The file Will be closed from here!		
		outputStream.close();
		//System.out.println("Done!");	
	} catch (FileNotFoundException e) {
		System.out.println("Erorr!");
		e.printStackTrace();
	}
	}
	}
}


