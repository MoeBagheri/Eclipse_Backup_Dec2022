package day36;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Countries {
	public static void main(String[] args) {
		// this is not resizable list (you cannot add new elements and you cannot remove old once)
		List<String> countriesTwo = Arrays.asList("USA", "France", "Brazil");
		// countriesTwo.add("Argentina");
		System.out.println(countriesTwo);
		System.out.println("---");
		
		List<String> countries = new ArrayList<>(Arrays.asList("USA", "France", "Brazil"));
		countries.add("Argentina");
		System.out.println(countries);
		
		// TODO print each element of countries list in the new line
		// 1. By using regular loop
		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));
		}
		
		System.out.println("---");	
		// 2. By using for each loop
		for (String country : countries) {
			System.out.println(country);
		}
		
		System.out.println("---");
		// 3. By using Iterator	
		Iterator<String> iterator = countries.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}