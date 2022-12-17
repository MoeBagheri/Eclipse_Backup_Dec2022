package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class InputFromUser {
	private InputFromUser() {}
	
	/**
	 * This method is used to get input from console
	 * @param msg will be displayed to user
	 * @return input from user as String
	 */
    public static String getInput(String msg) {
        try {
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(msg);
            return buffReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}