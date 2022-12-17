package day41;

//Java class is a blueprint/pattern for objects
public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public void increaseAge(int amount) {
		age += amount;
	}
}