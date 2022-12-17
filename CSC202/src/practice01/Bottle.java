package practice01;

import java.util.Scanner;

public class Bottle {
	private int _count;
	private final int MIN = 0;
	private final int MAX = 10;

	public Bottle() {
	}

	public void Read() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of the dimes");
		int dimes = Integer.parseInt(in.nextLine());

		while (dimes < MIN || dimes > MAX) {
			dimes = Integer.parseInt(in.nextLine());
			//
		}

		in.close();
		_count = dimes;
	}

	public void Set(int count) {
		_count = count;
	}

	public void Set(Bottle bottle) {
		_count = bottle.Get();

	}

	public int Get() {
		return _count;
	}

	public void ToString() {

		// System.out.println( _count*10);
		System.out.println("There are: " + _count + " dimes in the bottle ");
	}

}
