//----------------------------------------------------------------------------
// Sorts.java               by Dale/Joyce/Weems                     Chapter 11
//
// Test harness used to run sorting algorithms.
//----------------------------------------------------------------------------
package Moe_Bagheri_Final;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Sorts {
	static int actualSize;
	static final int SIZE = 50000; // size of array to be sorted
	static MapEntry[] values = new MapEntry[SIZE]; // values to be sorted

	static void initValues(String filename)
	// Initializes the values array with random integers from 0 to 99.
	{
		try {
			Scanner in = new Scanner(new File(filename));
			actualSize = 0;
			while(in.hasNextLine()) {
				String line = in.nextLine();
				if(line.length() > 0) {
					String[] parts = line.split("#");
					if(parts.length == 2) {					
						values[actualSize] = new MapEntry(parts[0], parts[1]);
						actualSize++;
					}
				}
			}
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	static public boolean isSorted()
	// Returns true if the array values are sorted and false otherwise.
	{
		for (int index = 0; index < (actualSize - 1); index++)
			if (values[index].compareTo(values[index + 1]) > 0)
				return false;
		return true;
	}

	static public int swap(int index1, int index2)
	// Precondition: index1 and index2 are >= 0 and < SIZE.
	//
	// Swaps the integers at locations index1 and index2 of the values array.
	{
		MapEntry temp = values[index1];
		values[index1] = values[index2];
		values[index2] = temp;
		int counter = 0 ;

		for (int i = 1; i < 20; i++) {
		    if (i % 2 == 1) {
		        counter += 1;
		    }
		  //  return counter;
		    //System.out.print(" Number of swaps: "+counter);
		    
		}
		return counter;
	}

	static public void printValues(int limit)
	// Prints all the values integers.
	{
		MapEntry value;
		System.out.println("The values array is:");
		
		for (int index = 0; index < limit; index++) {
			value = values[index];
			System.out.println(value);
		}
		System.out.println("...");
		//System.out.println("...");
		System.out.println("the middle:");
		for (int index = actualSize/limit; index < limit; index++) {
			value = values[index];
			System.out.println(value);
		}
		System.out.println("...");
		for (int index = actualSize-limit; index < actualSize; index++) {
			value = values[index];
			System.out.println(value);
		}

	}

	/////////////////////////////////////////////////////////////////
	//
	// Selection Sort

	static int minIndex(int startIndex, int endIndex)
	// Returns the index of the smallest value in
	// values[startIndex]..values[endIndex].
	{
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index <= endIndex; index++)
			if (values[index].compareTo(values[indexOfMin]) < 0)
				indexOfMin = index;
		return indexOfMin;
	}

	static void selectionSort()
	// Sorts the values array using the selection sort algorithm.
	{
		//int selectionSortSwaps = 0;
		
		
		int endIndex = actualSize - 1;
		for (int current = 0; current < endIndex; current++)
			swap(current, minIndex(current, endIndex));
		
	}
		
	// put a swapCount++ in there, and declare it at the top swapCount = 0
	
	/////////////////////////////////////////////////////////////////
	//
	// Bubble Sort

	static void bubbleUp(int startIndex, int endIndex)
	// Switches adjacent pairs that are out of order
	// between values[startIndex]..values[endIndex]
	// beginning at values[endIndex].
	{
		for (int index = endIndex; index > startIndex; index--)
			if (values[index].compareTo(values[index - 1]) < 0)
				swap(index, index - 1);
	}

	static void bubbleSort()
	// Sorts the values array using the bubble sort algorithm.
	{
		int current = 0;

		while (current < (actualSize - 1)) {
			bubbleUp(current, actualSize - 1);
			current++;
		}
	}

	/////////////////////////////////////////////////////////////////
	//
	// Short Bubble Sort

	static boolean bubbleUp2(int startIndex, int endIndex)
	// Switches adjacent pairs that are out of order
	// between values[startIndex]..values[endIndex]
	// beginning at values[endIndex].
	//
	// Returns false if a swap was made; otherwise, returns true.
	{
		boolean sorted = true;
		for (int index = endIndex; index > startIndex; index--)
			if (values[index].compareTo(values[index - 1]) < 0){
				swap(index, index - 1);
				sorted = false;
			}
		return sorted;
	}

	static void shortBubble()
	// Sorts the values array using the bubble sort algorithm.
	// The process stops as soon as values is sorted.
	{
		int current = 0;
		boolean sorted = false;
		while ((current < (actualSize - 1)) && !sorted) {
			sorted = bubbleUp2(current, actualSize - 1);
			current++;
		}
	}

	/////////////////////////////////////////////////////////////////
	//
	// Insertion Sort

	static void insertItem(int startIndex, int endIndex)
	// Upon completion, values[0]..values[endIndex] are sorted.
	{
		boolean finished = false;
		int current = endIndex;
		boolean moreToSearch = true;
		while (moreToSearch && !finished) {
			if (values[current].compareTo(values[current - 1]) < 0) {
				swap(current, current - 1);
				current--;
				moreToSearch = (current != startIndex);
			} else
				finished = true;
		}
	}

	static void insertionSort()
	// Sorts the values array using the insertion sort algorithm.
	{
		for (int count = 1; count < actualSize; count++)
			insertItem(0, count);
	}

	/////////////////////////////////////////////////////////////////
	//
	// Merge Sort

	static void merge(int leftFirst, int leftLast, int rightFirst, int rightLast)
	// Preconditions: values[leftFirst]..values[leftLast] are sorted.
	// values[rightFirst]..values[rightLast] are sorted.
	//
	// Sorts values[leftFirst]..values[rightLast] by merging the two subarrays.
	{
		MapEntry[] tempArray = new MapEntry[rightLast-leftFirst+1];
		int index = 0;
		int saveFirst = leftFirst; // to remember where to copy back

		while ((leftFirst <= leftLast) && (rightFirst <= rightLast)) {
			if (values[leftFirst].compareTo(values[rightFirst]) < 0) {
				tempArray[index] = values[leftFirst];
				leftFirst++;
			} else {
				tempArray[index] = values[rightFirst];
				rightFirst++;
			}
			index++;
		}

		while (leftFirst <= leftLast)
		// Copy remaining items from left half.
		{
			tempArray[index] = values[leftFirst];
			leftFirst++;
			index++;
		}

		while (rightFirst <= rightLast)
		// Copy remaining items from right half.
		{
			tempArray[index] = values[rightFirst];
			rightFirst++;
			index++;
		}

		for (index = saveFirst; index <= rightLast; index++)
			values[index] = tempArray[index-saveFirst];


	}

	static void mergeSort(int first, int last)
	// Sorts the values array using the merge sort algorithm.
	{
		if (first < last) {
			int middle = (first + last) / 2;
			mergeSort(first, middle);
			mergeSort(middle + 1, last);
			merge(first, middle, middle + 1, last);
		}
	}

	/////////////////////////////////////////////////////////////////
	//
	// Quick Sort

	static int split(int first, int last) {
		MapEntry splitVal = values[first];
		int saveF = first;
		boolean onCorrectSide;

		first++;
		do {
			onCorrectSide = true;
			while (onCorrectSide) // move first toward last
				if (values[first].compareTo(splitVal) > 0)
					onCorrectSide = false;
				else {
					first++;
					onCorrectSide = (first <= last);
				}

			onCorrectSide = (first <= last);
			while (onCorrectSide) // move last toward first
				if (values[last].compareTo(splitVal) <= 0)
					onCorrectSide = false;
				else {
					last--;
					onCorrectSide = (first <= last);
				}

			if (first < last) {
				swap(first, last);
				first++;
				last--;
			}
		} while (first <= last);

		swap(saveF, last);
		return last;
	}

	static void quickSort(int first, int last) {
		if (first < last) {
			int splitPoint;

			splitPoint = split(first, last);
			// values[first]..values[splitPoint - 1] <= splitVal
			// values[splitPoint] = splitVal
			// values[splitPoint+1]..values[last] > splitVal

			quickSort(first, splitPoint - 1);
			quickSort(splitPoint + 1, last);
		}
	}

	/////////////////////////////////////////////////////////////////
	//
	// Heap Sort

	static int newHole(int hole, int lastIndex, MapEntry item)
	// If either child of hole is larger than item this returns the index
	// of the larger child; otherwise it returns the index of hole.
	{
		int left = (hole * 2) + 1;
		int right = (hole * 2) + 2;
		if (left > lastIndex)
			// hole has no children
			return hole;
		else if (left == lastIndex)
			// hole has left child only
			if (item.compareTo(values[left]) < 0)
				// item < left child
				return left;
			else
				// item >= left child
				return hole;
		else
		// hole has two children
		if (values[left].compareTo(values[right]) < 0)
			// left child < right child
			if (values[right].compareTo(item) <= 0)
				// right child <= item
				return hole;
			else
				// item < right child
				return right;
		else
		// left child >= right child
		if (values[left].compareTo(item) < 0)
			// left child <= item
			return hole;
		else
			// item < left child
			return left;
	}

	static void reheapDown(MapEntry item, int root, int lastIndex)
	// Precondition: Current root position is "empty".
	//
	// Inserts item into the tree and ensures shape and order properties.
	{
		int hole = root; // current index of hole
		int newhole; // index where hole should move to

		newhole = newHole(hole, lastIndex, item); // find next hole
		while (newhole != hole) {
			values[hole] = values[newhole]; // move value up
			hole = newhole; // move hole down
			newhole = newHole(hole, lastIndex, item); // find next hole
		}
		values[hole] = item; // fill in the final hole
	}

	static void heapSort()
	// Sorts the values array using the heap sort algorithm.
	{
		int index;
		// Convert the array of values into a heap.
		for (index = actualSize / 2 - 1; index >= 0; index--)
			reheapDown(values[index], index, actualSize - 1);

		// Sort the array.
		for (index = actualSize - 1; index >= 1; index--) {
			swap(0, index);
			reheapDown(values[0], 0, index - 1);
		}
	}

	/////////////////////////////////////////////////////////////////
	//
	// Main
	/*
	public static void main(String[] args) {
		initValues();
		printValues();
		System.out.println("values is sorted: " + isSorted());
		System.out.println();

		// make call to sorting method here (just remove //)
		// selectionSort();
		// bubbleSort();
		// shortBubble();
		// insertionSort();
		// mergeSort(0, SIZE - 1);
		// quickSort(0, SIZE - 1);
		// heapSort();

		printValues();
		System.out.println("values is sorted: " + isSorted());
		System.out.println();
	}
	*/
}
