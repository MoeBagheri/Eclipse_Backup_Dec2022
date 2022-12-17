package day39;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Student.generateStudents(students);
		System.out.println(students);
		System.out.println("---");
		
		// TODO print each student name in new lines
		for (Student student : students) {
			String studentName = student.name;
			System.out.println(studentName);
		}
		System.out.println("---");
		
		double totalGrade = 0.0;
		double averageGrade = 0.0;
		
		// TODO find out the total grade from students list
		for (Student student : students) {
			double studentGrade = student.grade;
			totalGrade += studentGrade;
		}
		//	System.out.println(studentGrade);
		
		// TODO find out the average grade from students list
		averageGrade = totalGrade/students.size();
		System.out.println("Total grade from students list:" + totalGrade);
		System.out.println("Average grade from students list:" + averageGrade);
		
	}
}

class Student {
	public String name;
	public double grade;
	
	public Student(String name, double grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String toString() {
		return "{name=" + name + ", grade=" + grade + "}"; 
	}
	
	public static void generateStudents(List<Student> list) {
		list.add(new Student("John", 78.5));
		list.add(new Student("Alex", 84.9));
		list.add(new Student("Kuba", 90.9));
		list.add(new Student("Ramesh", 100.0));
		list.add(new Student("Junjun", 80.0));
		list.add(new Student("Neeru", 95.5));
	}
}