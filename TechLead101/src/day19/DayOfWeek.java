package day19;

import java.util.Scanner;


public class DayOfWeek {
//	enum Weekday {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
// I created a class for this
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What day is today?");
		Scanner scan = new Scanner(System.in);
		String inputDay = scan.nextLine();
		scan.close();
		
	//	PrintDayMsg(Days.valueOf(inputDay));
		
		//trying to make this work:
	//	while (true) {
	//		try {
		Days.valueOf(inputDay);
		
		if (inputDay != "") {
			PrintDayMsg(Days.valueOf(inputDay));
		}else {
			System.out.println("Enter a valid Day");
		}
	//		} catch (Exception e) {
			//	System.out.println("Enter a valid number");
	//		}
			
		}
		//
		
			
				
			
	
		
		
	
	/*
	 * Based on the day print the following:
	 * Mon - HW day
	 * Tue - study day
	 * Wed - relaxing day
	 * Thu - study day
	 * Fri - coding day
	 * Sat - java epic day
	 * Sun - Kahoot day

*/
	
	public static void PrintDayMsg(Days day) {
		if (day.equals(Days.Monday)) {
			System.out.println("HW Day");
		}else if(day.equals(Days.Tuesday)){
			System.out.println("study day");
		}else if(day.equals(Days.Wednsday)){
			System.out.println("relaxing day");
		}else if(day.equals(Days.Thursday)){
			System.out.println("study day");
		}else if(day.equals(Days.Friday)){
			System.out.println("coding day");
		}else if(day.equals(Days.Saturday)){
			System.out.println("java epic day");
		}else if(day.equals(Days.Sunday)){
			System.out.println("Kahoot day");
		}
	}
}
