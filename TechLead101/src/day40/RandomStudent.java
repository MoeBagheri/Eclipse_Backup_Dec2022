package day40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStudent {
	public static void main(String[] args) {
		// TODO Create a program that runs a gives us random student name
		// 1. Put these names into the array
		// 2. Generate random number from 0 till last index by using Random
		//    class
		// 3. Use that random number as index to read random element
		
		List<String> students = getStudents("src/day40/students.txt");
		System.out.println("Students: " + students);
		Random r = new Random();
		int rIndex = r.nextInt(students.size()); 
		System.out.println(students.get(rIndex));
	}
	
	public static List<String> getStudents(String filePath) {
		try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
			List<String> list = new ArrayList<>();
			bf.lines().forEach(line -> {
				list.add(line);
			});
			return list;
		} catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}