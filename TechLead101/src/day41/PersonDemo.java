package day41;


public class PersonDemo {
	public static void main(String[] args) {
		// {firstName="John", lastName="Doe", age=30, 
		//     getFullName(), increaseAge(int amount)}
		
		Person objOne = new Person();
		//System.out.println(ojOne);  //address
		objOne.firstName = "John";
		objOne.lastName = "Doe";
		objOne.age = 30;
		System.out.println(objOne.getFullName());
		
		// {firstName="Kuba", lastName="Zhaanbaev", age=33, 
		//     getFullName(), increaseAge(int amount)}
	}
}