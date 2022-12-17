package day21;


import util.InputFromUser;

public class LogIn {
	public static final String PASSWORD = "qwerty1$";
	public static final int ATTEMPTS = 3;
	
	public static void main(String[] args) {
		
		//if(PASSWORD.equals(enteredPassword)) {
		//	System.out.println("Welcome to your dashboard");
		//}else {
		//	System.out.println("Wrong password");
		
		String enteredPassword = InputFromUser.getInput("Enter password:");
		int numberOfAttempts = 1;
		
		while (!PASSWORD.equals(enteredPassword)&&numberOfAttempts<ATTEMPTS) {
			enteredPassword = InputFromUser.getInput("Enter password:");
			numberOfAttempts++;
		}		
		if (numberOfAttempts == ATTEMPTS && !PASSWORD.equals(enteredPassword)) {
			System.out.println("Your accout is blocked.");
	    }else {
		System.out.println("Welcome to your dashboard!");
    }
  }
}
