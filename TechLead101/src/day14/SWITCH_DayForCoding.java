package day14;

import java.util.Random;

public class SWITCH_DayForCoding {

	//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a program that randomly prints days of the week

		Random r = new Random();
		int day = r.nextInt(8);
		System.out.println("day#: " + day + " & day: " + getDayName(day));
	}

	// Get the name for the Week
	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 0:
			dayName = "Monday";
			break;
		case 1:
			dayName = "Tuesday";
			break;
		case 2:
			dayName = "Wednesday";
			break;
		case 3:
			dayName = "Thursday";
			break;
		case 4:
			dayName = "Friday";
			break;
		case 5:
			dayName = "Saturday";
			break;
		case 6:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day range";
		}

		return dayName;

	}

}
