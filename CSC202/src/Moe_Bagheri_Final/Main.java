
package Moe_Bagheri_Final;

import java.util.Scanner;

public class Main {
	
	// selectionSort();
	// bubbleSort();
	// shortBubble();
	// insertionSort();
	// mergeSort(0, SIZE - 1);
	// quickSort(0, SIZE - 1);
	// heapSort();

	// no magic numbers - used to select sort type
	private static final int SELECTION = 1;
	private static final int BUBBLE = 2;
	private static final int SHORT_BUBBLE = 3;
	private static final int INSERTION = 4;
	private static final int MERGE = 5;
	private static final int QUICK = 6;
	private static final int HEAP = 7;
	private static final String[] SORT_NAMES = {"none", "Selection", 
			"Bubble", "Short Bubble", "Insertion", "Merge",
			"Quick", "Heap"
	};
	
	// does a particular sort and reports statistics
	public static void doSort(int type, String filename) {
		// setup variables to hold timing
		long startTime;
		long endTime;


		
		// print a nice title
		System.out.println("---- "+SORT_NAMES[type]+" ----");

		// initialize random numbers
		Sorts.initValues(filename);
		
		// preview the values & confirm not sorted
		System.out.println(Sorts.isSorted());
		
		Scanner inputFrist = new Scanner(System. in);
		System.out.println("Enter an integer to print how many top Firts-last you want: ");
		int number = inputFrist. nextInt();
		//System.out.println("You entered " + number);
		
		
		Sorts.printValues(number);		
	
		// do the chosen sort
		System.out.println("SORTING");
		startTime = System.currentTimeMillis();
		if(type == SELECTION) {
			Sorts.swap(number, number) ;
			//System.out.println(Sort.swap);
			
		}
		else if(type == BUBBLE) {
			Sorts.bubbleSort();
			
		}
		else if(type == SHORT_BUBBLE) {
			Sorts.shortBubble();
		}
		else if(type == INSERTION) {
			Sorts.insertionSort();
		}
		else if(type == MERGE) {
			Sorts.mergeSort(0, Sorts.actualSize-1);
		}
		else if(type == QUICK) {
			Sorts.quickSort(0, Sorts.actualSize-1);
		}
		else if(type == HEAP) {
			Sorts.heapSort();
		}
		endTime = System.currentTimeMillis();
		
	//	System.out.println(Sorts.isSorted());
		
		// show summary
		System.out.println(Sorts.isSorted());
		

		//Scanner inputLast = new Scanner(System. in);
		//System.out.println("Enter an integer for the top ends: ");
		//int number = inputLast. nextInt();
		//System.out.println("You entered " + numberLast);
		
		
		Sorts.printValues(number);
		
		// show time
		System.out.println("--------");
		System.out.println("Time: " + (endTime-startTime) + "ms");
		
		System.out.println("--------");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		System.out.println("What file do you want to read? ");
				//System.out.println ("");
				System.out.println( "Ex: hw6_input.txt");
		Scanner sc = new Scanner(System.in);
		String filename = sc.nextLine();

		doSort(SELECTION, filename);
		doSort(BUBBLE, filename);
		doSort(SHORT_BUBBLE, filename);
		doSort(INSERTION, filename);
		
		doSort(MERGE, filename);
		doSort(QUICK, filename);
		doSort(HEAP, filename);
				
	}
}


