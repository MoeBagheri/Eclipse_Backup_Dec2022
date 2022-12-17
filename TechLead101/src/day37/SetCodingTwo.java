package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetCodingTwo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B", "D"));
		System.out.println(list);
		// create a method that will remove duplicate values from list and return as new list
		
		List<String> resList = removeDuplicates(list);
		System.out.println(resList);
		
	}
	
	public static List<String> removeDuplicates(List<String> list) {
		// 1. Create set and load data from list
		Set<String> set = new LinkedHashSet<>(list);
		
		// 2. Create new list and load data back from set
		List<String> noDupList = new ArrayList<>(set);
		return noDupList;
	}
}