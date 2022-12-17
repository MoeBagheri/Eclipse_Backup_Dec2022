package day38;

import java.util.Map;
import java.util.HashMap;

public class HashMapPractice {
	// Map
	// Map is key-value based data structure
	// list -> [value, value, value]
	// map  -> [{key=value}, {key=value}, {key=value}]
	// Keys are unique in the map
	// 1. HashMap
	// 2. LinkedHashMap
	// 3. Hashtable
	// 4. TreeMap
	public static void main(String[] args) {
		//     K,     V  
		Map<String, Double> fruits = new HashMap<>();
		// put(K, V) - add element to the map
		fruits.put("orange", 1.05);
		fruits.put("mango", 0.5);
		fruits.put("apple", 0.75);
		fruits.put("lemon", 1.47);
		fruits.put("banana", 1.49);
		fruits.put("orange", 2.1);
		
		// keys are unique in the map
		// {orange=2.1, banana=1.39, apple=0.75, lemon=1.47, mango=0.5}
		System.out.println(fruits); 
		
		// get(K) get value based on the key
		String key = "lemon";
		Double price = fruits.get(key);
		System.out.println("price of " + key + " is " + price);
		
		// if key is not in the map, get(K) returns null
		Double priceTwo = fruits.get("kiwi");
		System.out.println(priceTwo); // null
	}
}