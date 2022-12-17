package day23;


public class Pyramid2 {
	public static void main(String[] args) {
		makePyramid(4);
	}
/*
   #  #
  ##  ##
 ###  ###
####  ####
 */
public static void makePyramid(int num) {
		
	String hash = "#";
	String empty = " ";
	int newnum = num;

	//int emptyNum =empty.length();
	//int hereSpace=emptyNum-num;

	//while (hereSpace >= 0) {
	
	for (int i=1; i<=num ;i++) {
		newnum--;
	for (int j=newnum; j >= newnum; j--) {
		System.out.print(empty.repeat(j)+hash.repeat(i)+" "+hash.repeat(i));
//System.out.println(j);

//System.out.println();
//System.out.println(i);

//			System.out.print(empty+hash+" "+hash);
//			empty += " ";
//			hash += "#";
}
		
		
		

	System.out.println();
	}
}
}

