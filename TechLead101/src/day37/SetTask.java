package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetTask {
	
	public static void main(String[] args) {
	
		System.out.println(removeDuplicates("Hello"));
		System.out.println(removeDuplicates("aaaaabb"));
		System.out.println(removeDuplicates("aaaabbcc"));
		System.out.println(26%20);


	}

	private static String removeDuplicates(String string) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<>();

		for (int i = 0; i < string.length(); i++) {
			List<String> list = new ArrayList<>(Arrays.asList(string));
			List<String> noDupList = new ArrayList<>(set);
			
			System.out.println(noDupList);
		}


		
		
		return null;
	}

}
