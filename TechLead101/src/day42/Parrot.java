package day42;

public class Parrot extends Bird {
	

	public static void main(String[] args) {
		//talk();
		Parrot parrot  = new Parrot();
		parrot.name = "Costco";
		parrot.fly();
		
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
		System.out.println("Parrot, " + name + " is flying!");
	}
	
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Parrot talks!");

	}

}
