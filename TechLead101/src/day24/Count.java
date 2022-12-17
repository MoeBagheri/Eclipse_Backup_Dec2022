package day24;

public class Count {

	public static void main(String[] args) {

		System.out.println(catDog("catcatxdogxdog"));
	}

	public static int catDog(String str) {
		// your code goes here
		int CountCat = 0;
		String cat = "";

		for (int i = 0; i < str.length()-2; i++) {
			if (i=='c'){
				 cat = str.substring(i, i + 2);
				
			}else if (cat.compare("cat")) {
				CountCat++;
			}
			
		}
		return CountCat;

	}
}