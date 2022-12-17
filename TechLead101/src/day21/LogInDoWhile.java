package day21;

import util.InputFromUser;

public class LogInDoWhile {

	public static final String PASSWORD = "qwerty1$";
	public static final int MAX_ATTEMPTS = 3;
	
	public static void main(String[] args) {
		String enteredPassword;
		int numberOfAttempts = 0;
		do {
			enteredPassword = InputFromUser.getInput("Enter password:");
			numberOfAttempts++;
		} while (!PASSWORD.equals(enteredPassword) && numberOfAttempts < MAX_ATTEMPTS);
		
		if (PASSWORD.equals(enteredPassword)) {
			System.out.println("Welcome to your dashboard!");
		} else {
			System.out.println("Your account is blocked");
		}
	}
}
