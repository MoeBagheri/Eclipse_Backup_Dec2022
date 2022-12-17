package moe_Bagheri_HW3;

//---------------------------------------------------------------------------
// LargeInt.java            by Dale/Joyce/Weems                     Chapter 6
// 
// Provides a Large Integer ADT. Large integers can consist of any number
// of digits, plus a sign. Supports an add and a subtract operation.
//---------------------------------------------------------------------------

import java.util.Iterator;

import java.util.LinkedList;
import java.util.Deque;

//import support.DLLNode;

public class LargeIntHw3<T> {
	//protected LargeIntList characters; // Holds digits
	protected Deque<T> characters;
	
	// Constants for sign variable
	protected static final boolean PLUS = true;
	protected static final boolean MINUS = false;

	protected boolean sign;

	/*
	public int getValue(char character) {
		if((char)character >= '0' && (char)character <= '9') {
			return (char)character - '0';
		}
		else {
			return 10 + (char)character - 'A';
		}
	}
	*/
	
	// multiplication method 1: lots of addition
	// 123 * 45
	// 123 *  5
	// 123 + 123 + 123 + 123 + 123 + 123= 615
	// 123 * 40
	// 123 * 4 with 1 extra zero
	// 123 + 123 + 123 + 123 + 123 = 492
	// 615 + 4920 = 5535
	
	// multiplication method 2: actual multiplication
	// 123 * 45
	//  100 * 5  + 20 * 5  + 3 * 5
	// (100 * 4  + 20 * 4  + 3 * 4)*10
	// 500 + 100 + 15 + 4000 + 800 + 120 = 5535
	
	public static Character getCharacter(int t) {
		//int value = t - '0';
		char result;
		if(t >= 0 && t <= 9) {
			result = (char)('0' + t);
		}
		else {
			result = (char)('A' + t - 10);
		}

		return result;
	}
	public static int getValue(Character t) {
		int result;
		if(t >= '0' && t <= '9') {
			result = t - '0';
		}
		else {
			result = t - 'A' + 10;
		}

		return result;
	}
	
	public LargeIntHw3()
	// Instantiates an "empty" large integer.
	{
		characters = new LinkedList(); //new LargeIntList();
		sign = PLUS;
	}

	public LargeIntHw3(String intString)
	// Precondition: intString contains a well-formatted integer
	//
	// Instantiates a large integer as indicated by intString
	{
		characters = new LinkedList(); //new LargeIntList();
		sign = PLUS;

		int firstDigitPosition; // Position of first digit in intString
		int lastDigitPosition; // Position of last digit in intString

		// Used to translate character to byte
		char digitChar;
		//int digitInt;
		//Byte digitByte;

		firstDigitPosition = 0;
		if (intString.charAt(0) == '+') // Skip leading plus sign
			firstDigitPosition = 1;
		else if (intString.charAt(0) == '-') // Handle leading minus sign
		{
			firstDigitPosition = 1;
			sign = MINUS;
		}

		lastDigitPosition = intString.length() - 1;

		for (int count = firstDigitPosition; count <= lastDigitPosition; count++) {
			digitChar = intString.charAt(count);
			//digitInt = getValue(digitChar);
			
			//digitByte = (byte) digitInt;
			Character c = digitChar;
			T t = (T)c;
			characters.add(t); //the method add(T) is not applicapable for type Character

		}
				
	}

	public void setNegative() {
		sign = MINUS;
	}

	public String toString() {
		Character element;


		if(characters.size() == 0) {
			return "+0";
		}
		
		String largeIntString;
		if (sign == PLUS)
			largeIntString = "+";
		else
			largeIntString = "-";
		
		int count = characters.size();
		

		Iterator<T> forward = characters.iterator();
				//characters.forward();
		while (forward.hasNext()) {
			element = (Character)forward.next();
			largeIntString = largeIntString + element; //getCharacter(element);
			if ((((count - 1) % 3) == 0) && (count != 1))
				largeIntString = largeIntString + ",";
			count--;
		}
		return (largeIntString);
	}

	protected static boolean greaterList(Deque characters2, Deque characters3)
	// Precondition: first and second have no leading zeros
	//
	// Returns true if first represents a larger number than second;
	// otherwise, returns false

	{
		boolean greater = false;
		if (characters2.size() > characters3.size())
			greater = true;
		else if (characters2.size() < characters3.size())
			greater = false;
		else {
			Character digitFirst;
			Character digitSecond;
			Iterator<Character> firstForward = characters2.iterator();
			Iterator<Character> secondForward = characters3.iterator();

			// Set up loop
			int length = characters2.size();
			boolean keepChecking = true;
			int count = 1;

			while ((count <= length) && (keepChecking)) {
				digitFirst = firstForward.next();
				digitSecond = secondForward.next();
				if (digitFirst > digitSecond) {
					greater = true;
					keepChecking = false;
				} else if (digitFirst < digitSecond) {
					greater = false;
					keepChecking = false;
				}
				count++;
			}
		}
		return greater;
	}

	protected static Deque addLists(Deque larger, Deque smaller)
	// Precondition: larger > smaller
	//
	// Returns a specialized list that is a byte-by-byte sum of the two
	// argument lists
	{
		int digit1;
		int digit2;
		int temp;
		int carry = 0;

		int largerLength = larger.size();
		int smallerLength = smaller.size();
		int lengthDiff;

		LinkedList result = new LinkedList();

		LinkedList largerLinked = (LinkedList)larger;
		LinkedList smallerLinked = (LinkedList)smaller;
		//while(smallerLinked.size() < largerLinked.size()) {
		//	smallerLinked.add(0, '0');
		//}
		
		
		Iterator<Character> largerReverse = largerLinked.descendingIterator(); // .iterator(); //larger.reverse();
		Iterator<Character> smallerReverse = smallerLinked.descendingIterator(); //.iterator(); //smaller.reverse();
		// Process both lists while both have digits
		for (int count = 1; count <= smallerLength; count++) {
			digit1 = getValue(largerReverse.next());
			digit2 = getValue(smallerReverse.next());
			temp = digit1 + digit2 + carry;
			carry = (temp / 17);
			result.add(getCharacter(temp % 17));
		}

		// Finish processing of leftover digits
		lengthDiff = (largerLength - smallerLength);
		for (int count = 1; count <= lengthDiff; count++) {
			digit1 = getValue(largerReverse.next());
			
			temp = (char) (digit1 + carry);
			carry = (temp / 17);
			result.add(getCharacter(temp % 17));
		}
		if (carry != 0)
			result.add(getCharacter(carry));

		
		Deque resultReversed = new LinkedList();
		Iterator<Character> resultIter = result.descendingIterator(); // .iterator(); //larger.reverse();
		for(int i=1;i<=result.size();i++) {
			resultReversed.add(resultIter.next());
		}
		return resultReversed;
	}

	protected static Deque subtractLists(Deque larger, Deque smaller)
	// Precondition: larger >= smaller
	//
	// Returns a specialized list that is the difference of the two argument lists
	{
		int digit1;
		int digit2;
		int temp;
		boolean borrow = false;

		int largerLength = larger.size();
		int smallerLength = smaller.size();
		int lengthDiff;

		LinkedList result = new LinkedList();

		LinkedList largerLinked = (LinkedList)larger;
		LinkedList smallerLinked = (LinkedList)smaller;
		
		Iterator<Character> largerReverse = largerLinked.descendingIterator();//larger.iterator(); //larger.reverse();
		Iterator<Character> smallerReverse = smallerLinked.descendingIterator(); //smaller.iterator();

		// Process both lists while both have digits.
		for (int count = 1; count <= smallerLength; count++) {
			
			digit1 = getValue(largerReverse.next());
			if (borrow) {
				if (digit1 != 0) {
					digit1 = digit1 - 1;
					borrow = false;
				} else {
					digit1 = 9;
					borrow = true;
				}
			}
			
			digit2 = getValue(smallerReverse.next());
			
			if (digit2 <= digit1)
				result.add( getCharacter(digit1 - digit2));
			else {
				borrow = true;
				result.add( getCharacter(digit1 + 17 - digit2));
			}
		}

		// Finish processing of leftover digits
		lengthDiff = (largerLength - smallerLength);
		for (int count = 1; count <= lengthDiff; count++) {
			digit1 = getValue(largerReverse.next());
			if (borrow) {
				if (digit1 != 0) {
					digit1 = (char) (digit1 - 1);
					borrow = false;
				} else {
					digit1 = 16;
					borrow = true;
				}
			}
			result.add(getCharacter(digit1));
		}

		Deque resultReversed = new LinkedList();
		
		boolean started = false;
		Iterator<Character> resultIter = result.descendingIterator(); // .iterator(); //larger.reverse();
		for(int i=1;i<=result.size();i++) {
			Character n = resultIter.next();
			if(started == false && n == '0') {
				continue;
			}
			started = true;
			resultReversed.add(n);
		}
		return resultReversed;
	}

	protected static Deque multiplyLists(Deque larger, Deque smaller)
	{
		
		int digit1;
		int digit2;
		int temp;
		boolean borrow = false;

		int largerLength = larger.size();
		int smallerLength = smaller.size();
		int lengthDiff;
		
		LargeIntHw3 prod = new LargeIntHw3("0");

		LinkedList result = new LinkedList();

		LinkedList largerLinked = (LinkedList)larger;
		LinkedList smallerLinked = (LinkedList)smaller;
		
		Iterator<Character> largerReverse = largerLinked.descendingIterator();//larger.iterator(); //larger.reverse();
		Iterator<Character> smallerReverse = smallerLinked.descendingIterator(); //smaller.iterator();

		// Process both lists while both have digits.
		for (int count = 1; count <= smallerLength; count++) {
			digit1 = getValue(smallerReverse.next());

			int carry = 0;
			String nextNumber = "";
			largerReverse = largerLinked.descendingIterator();
			for(int count2 = 1; count2 <= largerLength;count2++) {
				digit2 = getValue(largerReverse.next());
				int times = digit1*digit2 + carry;
				int ones = times%17;
				carry = times/17;
				nextNumber = getCharacter(ones) + nextNumber;
			}
			if(carry > 0) {
				nextNumber = getCharacter(carry) + nextNumber;
			}
			for(int i=1;i<count;i++) {
				nextNumber = nextNumber + "0";
			}
			
			LargeIntHw3 nextVal = new LargeIntHw3(nextNumber);
			prod = add(nextVal, prod);
		
		}		
		
		
		return prod.characters;
	}
	
	public static LargeIntHw3 add(LargeIntHw3 first, LargeIntHw3 second)
	// Returns a LargeInt that is the sum of the two argument LargeInts
	{
		
		LargeIntHw3 sum = new LargeIntHw3();

		if (first.sign == second.sign) {
			if (greaterList(first.characters, second.characters))
				sum.characters = addLists(first.characters, second.characters);
			else
				sum.characters = addLists(second.characters, first.characters);
			sum.sign = first.sign;
		} else // Signs are different
		{
			if (greaterList(first.characters, second.characters)) {
				sum.characters = subtractLists(first.characters, second.characters);
				sum.sign = first.sign;
			} else {
				sum.characters = subtractLists(second.characters, first.characters);
				sum.sign = second.sign;
			}
		}

		return sum;
	}

	public static LargeIntHw3 subtract(LargeIntHw3 first, LargeIntHw3 second)
	// Returns a LargeInt that is the difference of the two argument LargeInts
	{
		LargeIntHw3 diff = new LargeIntHw3();

		// Create an inverse of second
		LargeIntHw3 negSecond = new LargeIntHw3();
		negSecond.sign = !second.sign;
		Iterator<Character> secondForward = second.characters.iterator(); //second.characters.forward();
		int length = second.characters.size();
		for (int count = 1; count <= length; count++)
			negSecond.characters.add(secondForward.next());

		// Add first to inverse of second
		diff = add(first, negSecond);

		return diff;
	}
	
	public static LargeIntHw3 multiply(LargeIntHw3 first, LargeIntHw3 second)
	// Returns a LargeInt that is the sum of the two argument LargeInts
	{
		LargeIntHw3 prod = new LargeIntHw3();


		// Add first to inverse of second
		prod.characters = multiplyLists(first.characters, second.characters);

		return prod;
		
	}
}


