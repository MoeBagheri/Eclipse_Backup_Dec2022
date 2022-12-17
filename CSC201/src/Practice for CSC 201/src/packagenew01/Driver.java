package packagenew01;
import java.io.*;
import java.util.Scanner;

public class Driver {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		double tank;
		double weight;
		Main c = new Main();
		System.out.println("Set the tank size ");
		tank = sc.nextDouble();
		c.setTankSize(tank);
		System.out.println(c.TankSize());
		
		
	}
	


}
