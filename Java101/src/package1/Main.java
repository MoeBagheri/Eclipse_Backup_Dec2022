package package1;
public class Main {	
	public static void main(String [] args) {
		
		//int x = 2;
		
		
		
		/*
		
		what is your name
		welcome name
		enter a number
		show the star for that amount
		*/
		
		
	//	Scanner UI = new Scanner(System.in);
		//String name;
		
	//	System.out.println("What is your name?");
	//	String name = UI.nextLine();
	//	System.out.println("Welcome " + name);
	//	System.out.println(name + ", please enter the number of stars");
	//	int StarsNumber = UI.nextInt();
			
		//int counter = 1;		
		//while (StarsNumber >= counter) {
		//System.out.print("*");
		//counter++;	
		//}
		
		//for (int counter = 1; counter <= StarsNumber; counter++ ) {
			
			//System.out.print("*");
		//}
		
	//	int [] index = new int[1];
	//	index [0] = 1;
	//	index [1] = 3;
	//this is equal to:
	//	int [] indexDo = {3,5,8};
		
	//System.out.println(index[0]);	
		
	//	Scanner UI = new Scanner(System.in);
		
		
		
	//	System.out.println("Please enter the Index number");
	//	int IndexNumber = UI.nextInt();
	//	int [] index = new  int [IndexNumber];
	//	System.out.println(index.length);

		//Scanner UI = new Scanner(System.in);
		
		//int [] index =  {1,2,1};
		
		//index [0] =  UI.nextInt();
		//index [1] =  UI.nextInt();
		
		
		//int result = 0;
	//	for (int i = 0; i < index.length; i++) {
	//		result = result + index[i];
	//	}
	//	System.out.println(result);
		
				
	//Dice 1000000 times show
			//the possibility of each number 
	
		/*
		Random dice = new Random();
		int counter1 = 0, counter2=0, counter3=0 ;
		
		for (int i = 1; i <= 10; i++) {
			int result = dice.nextInt(3)+1;
			
		
		
		switch (result) {
		case 1: 
			counter1++;
			break;
		
		case 2:
			counter2++;
			break;
			
		case 3:
			counter3++;
			break;

		}
		}
		System.out.println(counter1);
		System.out.println(counter2);
		System.out.println(counter3);
		
		System.out.println(counter1+counter2+counter3);
	
			*/
		
		
	//	char x = 'h';
	//			System.out.println(x);
		
	//	String s = "kbs as alb";
	//	System.out.println(s.indexOf("a"));
	
	//	String s = "kj, lih, jk";
	//	String [] q = s.split(", ");
	
	//	int d = q.length;
	//	System.out.print(d);
		
//		String [] m = s.split(" ,");
	//	for(int i = 0; i < s.length(); i++) {
//			System.out.println(m[i]);
			
	//	}

		int [][] sales = {	{1,2,3},
							{10,20,30},
							{100,200,300},
									};
		int [] sum = new int [3];
		for(int i = 0; i < sales.length; i++) {
			for(int j = 0; j < sales[i].length; j++) {
			
				sum [i] += sales [i][j];
			}
		}
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sales[i]);
			
		}
	}
}