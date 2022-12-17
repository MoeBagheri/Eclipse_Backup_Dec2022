package day38;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class City {
	public static void main(String[] args) {
		// TODO
		// 1. Create a Map<String, Integer> that will hold these values
		// {Arlington=229164, Leesburg=375629, Manassas=451721, Richmond=210309}
		// 2. Print your map

		Map<String, Integer> Cities = new HashMap<>();

		Cities.put("Arlington", 229164);
		Cities.put("Leesburg", 375629);
		Cities.put("Manassas", 451721);
		Cities.put("Richmond", 210309);
		System.out.println(Cities);

		/*
		 * TODO Loop over and print each element in this format: City: Arlington,
		 * Population: 229164
		 */

		// Set<String> Keys = Cities.keySet();
		for (String string : Cities.keySet()) {
			Integer Value = Cities.get(string);
			System.out.println("the populattion of " + string + " is " + Value);
		}
		System.out.println("--------------");

		/*
		 * Find the total population Find the average population .size() returns the
		 * number of elements in the map
		 */

		int totalPop = 0;
		int avPop = 0;
		// TODO
		for (String string : Cities.keySet()) {
			Integer Value = Cities.get(string);
			totalPop += Value;

		}
		avPop = totalPop/ Cities.size();
		System.out.println("total pop: " + totalPop);
		System.out.println("Average pop: " + avPop);

	}
}
