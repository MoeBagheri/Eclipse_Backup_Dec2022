package package03;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Class01 {

//	public Class01() {
		// TODO Auto-generated constructor stub
//	}
	public static void main(String[] args) {
	String fileName = "Car5.txt";
	Scanner inputStream = null;
	System.out.println("The File" + fileName + "contains the following lines:\n");
			try {
				inputStream = new Scanner(new File(fileName));
			}
			catch(FileNotFoundException e) {
				System.out.println("Error oppening the file --> " +
											fileName);
				System.exit(0);
			}
			while(inputStream.hasNextLine()) {
				String line = inputStream.nextLine();
				System.out.println(line);
			}
			inputStream.close();

		}

	}

