package day38;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPracticeTwo {
public static void main(String[] args) {
	Map<String, Integer> items = new HashMap<>();
	
	items.put("Apple", 5);
	items.put("Orange", 10);
	items.put("Kiwi", 5);
	items.put("Banana", 90);
	System.out.println(items);
	Integer amount = items.get("Orange");
	System.out.println(amount);
	
	boolean isKeyThere = items.containsKey("Mango");
	System.out.println(isKeyThere);
	
	isKeyThere = items.containsKey("Kiwi");
	System.out.println(isKeyThere);
	
	boolean isValueThere = items.containsValue(90);
	System.out.println(isValueThere);
	
	System.out.println(items);
	items.remove("Apple");
	System.out.println(items);
	
	Set<String> keys = items.keySet();
	System.out.println(keys);
	
	Collection<Integer> values = items.values();
	System.out.println(values);
	

	

}
}
