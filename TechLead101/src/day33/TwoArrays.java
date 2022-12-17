package day33;

import java.util.Arrays;

public class TwoArrays {
	public static void main(String[] args) {
		String[][] teams = {
				{"Alex", "Mark", "Akyl", "Daniel"},
				{"Ari", "Frank", "Nurik", "Anna"},
				{"Selvin", "Meerim", "GG"},
				{"Job", "Edil", "Evelyn", "Rocio"}
		};
		
		System.out.println(Arrays.deepToString(teams));
		
		// TODO print each name from teams element in all upper cases
		String str = "";
		for (int i = 0; i < teams.length; i++) {
			for (int j = 0; j < teams[i].length; j++) {
			str = teams[i][j];
			System.out.println(str.toUpperCase());
				
			}
		}
	}
}