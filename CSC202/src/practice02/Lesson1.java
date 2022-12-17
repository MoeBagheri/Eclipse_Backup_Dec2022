 package practice02;

import java.util.Scanner;

public class Lesson1 {

	public Lesson1() {
		// TODO Auto-generated constructor stub
	}

  	public static void main( String[] args ) {
      
      // Variable: a location in memory (RAM) that holds a value of a certain type
      // Data type: a type of data
      // Examples:
      // -int
      // -double
      // -boolean
      // -String
      // ...

      // In order to use a variable, you must...

      // 1. Declare it
      // Example:
      int x;

      // 2. Initialize it
      x = 5;
      
      // final: a keyword that makes a variable a constant
      // constant: a variable whose value can never change
      
      final int PI = 3.14;
      
      // Error
      //PI = 5;

      // Operator: a symbol that performs an "operation"

      // Examples:
      // =
      // ==
      // >
      // <
      // +
      // -
      // ...

      // Control flow statement: a mechanism that changes the normal flow of the code (run code conditionally or repeatedly)

      // Examples:
      // if statements
      // switch statements
      // for loops
      // while loops
      // do/while loops

      // If statement: runs code conditionally

      // Examples:

      if( true ){
        System.out.println( "Hello world" );
      }

      // Output:
      // Hello world

      if( false ){
        System.out.println( "Hello world" );
      }

      // Output:
      // 

      x = 6;

      if( x == 5 ){
        System.out.println( "x is five" );
      } else if( x == 6 ) {
        System.out.println( "x is six" );
      } else {
        System.out.println( "x is none of the above" );
      }

      // Output:
      // x is not five


      // Switch statement: just like a bunch of if/else statements that check for equality

      // Example: 

      switch( x ) {
        case 5:
          System.out.println( "x is five" );
          break;
        case 6:
          System.out.println( "x is six" );
          break;
        default:
          System.out.println( "x is none of the above options" );
          break;
      }

      // Output:
      // x is six


      // Loop: runs code repeatedly

      // For loop: best for when you know the number of iterations (when you can count from one number to another number)

      // Example:
      // TODO: Output "Hello world" 5 times

      for( int i = 0; i < 5; i++ ){
        System.out.println( "Hello world" );
      }

      // Output:
      // Hello world
      // Hello world
      // Hello world
      // Hello world
      // Hello world


      // While loop: best for when you DON'T know the number of iterations

      // (Bad) Example:

      int y = 0;

      while( y < 3 ){
        System.out.println( "Hello world" );

        y++;
      }

      // Output:
      // Hello world
      // Hello world
      // Hello world

      // (Good) Example:

      // NOTE: Math.random( ) returns a random number between 0 and 1

      while( Math.random( ) > 0.2 ){
        System.out.println( "Greater than 0.2" );
      }

      // Output:
      // Greater than 0.2
      // ...

      // NOTE: The number of times the loop outputs is random

      // Do/while loop: best  for when you DON'T know the number of iterations AND you need at least one iteration

      // Example:

      // TODO: Prompt the user to enter a number less than 10 until they do (while they have NOT)

      Scanner input = new Scanner( System.in );
      int number;

      do {
        System.out.println( "Enter a number less than 10" );
        number = input.nextInt( );
      } while( number >= 10 );

      
      // Array: a sequence of values of the same type. (it's like a variable that stores multiple values)
      // Example:
      //                  length
      //                     v
      //int[] values = new int[6];
      //values[0] = 5;
      //values[1] = 4;
      //values[2] = 10;
      // ... OR
      
      int[] values = { 5, 4, 10, 8, 1, 9 };
      
      //                       index  (indexes start at zero)
      //                         v
      System.out.println( values[4] );
      // Output: 1
      System.out.println( values.length );
      // Output: 6
      
      // TODO: Output every number in the array
      // System.out.println( values[0] );
      // System.out.println( values[1] );
      // System.out.println( values[2] );
      // ... OR
      
      for( int i = 0; i < values.length; i++ ){
        System.out.println( values[i] );
      }
      
      
      // Method: a block of code that can be executed later

      // In order to use a method, you must...

      // 1. Define it
      // Example:

      //public void doSomething( ){
      //  System.out.println( "Hello world" );
      //}

      // 2. Call it
      doSomething( );

      // Output:
      // Hello world

      // Main method: the method where the program starts executing. (referred to as the "entry point")

      // public static void main( String[] args ){
      
      // }
      
      // Parameter: a value you pass INTO a method when you call the method
      // Return value: a value you get OUT OF a method when you call the method
	  
      // In order to use parameter(s), you must...
      
      // 1. Define a method to ACCEPT parameter(s)
      // Example:
      public static void outputSum( double number1, double number2 ) {
       	System.out.println( "The sum is: " + ( number1 + number2 ) );
      }
      
      // 2. Pass VALUES into the method when you call it
      outputSum( 5, 10 );
      outputSum( 20, 10 );
      
      // In order to use a return value, you must...
      
      // 1. Define a method to return a value
      // Example:
      //          return type
      //              v
      public static double getSum( double number1, double number2 ) {
        // return statement
        //  v
        return number1 + number2;
      }
      
      // 2. Treat the method call itself AS the return value
      System.out.println( getSum( 5, 10 ) );
      System.out.println( getSum( 20, 10 ) );
      double sum = getSum( 50, 50 );
      
      
	}
  	
  	public static void doSomething( ){
      System.out.println( "Hello world" );
    }
}


// Class: a blueprint to create an object
// Object: a group of variables and methods

// To make an object from a class, you must...

// 1. Define a class

// Example:

class Person {
  
  // Access Modifier: a keyword that controls the accessibility of a property or method
  // public: accessible from anywhere
  // private: inaccessible from anywhere BUT this class
  // protected: inaccessible from anywhere BUT this class OR inheriting/derived classes 
  // default: accessible from anywhere in this package
  
  // Static: a keyword that makes a variable/method a member of the class itself rather than objects of that class
  
  public static String species = "Homosapien";
  public String name;
  public int age;
  
  // Constructor: a method that's automatically called when you make an instance of the class
  // NOTE: A constructor must 1. be public, 2. have NO return type, and 3. have the same name as the class
  public Person( String name, int age ){
    this.name = name;
    this.age = age;
  }
  
  public void introduceSelf( ){
    //return "Hi, my name is " + this.name + " and I'm " + this.age;
    System.out.println( "Hi, my name is " + this.name + " and I'm " + this.age );
  }
  
}

// 2. Make an object/instance

public class Main {
  
  public static void main( String[] args ){
    
    //Main.createTwoPeople( );
    createTwoPeople( );
  }
  
  public static void createTwoPeople( ){
    Person person1 = new Person( "Joe" , 20 );
    Person person2 = new Person( "Jake", 30 );
    
    System.out.println( person1.name );
    
    // "Hi, my name is Joe and I'm 20"
    person1.introduceSelf();
    person2.introduceSelf();
    
    //System.out.println( person1.name );
    
    System.out.println( "The species of all Person's is " + Person.species );
  }
  
}

// Inheritance: allows a class to "inherit" or "take on" the properties and methods of another class.
// 				Then, the inheriting class can have additional properties and methods.

// TODO: Make a class representing teachers and a class representing students

class Person {
  public String name;
  public int age;
  
  public void introduceSelf( ){
    System.out.println( "Hi, my name is " + this.name + " and I'm " + this.age );
  }
}

class Teacher extends Person {
  public int roomNumber;
  
  public Teacher(String name, int age, int roomNumber){
    this.name = name;
    this.age = age;
    this.roomNumber = roomNumber;
    
  }
}

class Student extends Person {
  public int studentId;
  public Student (String name, int age, int studentId){
    this.name = name;
    this.age = age;
    this.studentId = studentId;
  }
}

class Driver {
  public static void main( String[] args ) {
    Teacher teacher1 = new Teacher("Moe" , 40, 33 );
    Teacher teacher2 = new Teacher( "Joe" , 45, 35 );
    Teacher teacher3 = new Teacher( "Jake" , 41, 37 );
    Student student1 = new Student ("Jame" , 13, 3700);
    
  }
}

// ------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------

// Exercises:

// 1. Write a method called volumeOfPyramid that returns the volume of a pyrmid given the length, width, and height (as parameters).
// 	  Call the method with two different sets of parameter values AND output the volumes.

public static double volumeOfPyramid (double length, double width, double height ){

  return (length * width * height) / 3;
}

System.out.println(volumeOfPyramid (2,3,4));


// 2. Write a method called areaOfTrapezoid that returns the area of a trapezoid given the height and two bases
// 	  Call the method with two different sets of parameter values AND output the areas.

public static double areaOfTripizod (double a, double b, double h){
  return ((a+b)/2) * h;
}

System.out.println (areaOfTripizod (2,3,4));



// 3. Write a method called sumOfNumbers that returns the sum of the numbers in an array of doubles that is given as a parameter.
// 	  Call the method with an array of doubles as a parameter value.

// NOTE: Returning exits the method immediately

public static double sumOfNumbers (double[] array){
  double sumRes = 0;
  // return array[0] + array [1] + array[2];
  for (int i=0 ; i<arry.legth ; i++)
  {
    sumRes = sumRes + array[i];
  }
  return sumRes;
}

double[] numbers = {1,2,3};
Sytem.out.println(sumOfNumbers( numbers ));
// Expected Output: 6



// 4. a. Make a class that represents a rectangle with a width and height.
//    b. Give it a method that returns its area.
//    c. Make a class called Main with the main method.
//    d. Make an object from the class, give it a width and height, and output its area.


public class Rectangle {
  //public static void 
  public int width;
  public int height;
  
  
  public int area() {
   return this.width * this.height;
  
   // Syetem.out.println(area); 
  }
}

public class Driver {
  public static void main ( String[] args ){

    
    //Rectangle rect = new Rectangle();
    Square square = new Square(10);
    square.width = 20;
    // TODO: Set the width and the height of rect (like we set the name and age of a Person)
    
    System.out.println(rect.area());
  }
}

  /*
  Recursion-1 > count7
  prev  |  next  |  chance
  Given a non-negative int n, return the count of the occurrences of
		  7 as a digit, so for example 717 yields 2. (no loops).
		  Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
		  while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
          */
  /////////////////////////////
            

public int countX(String str)
{
	if(str.length() == 0)     
		return 0;
		
	if(str.charAt(0) == 'x')
		return 1 + countX(str.substring(1));
	return countX(str.substring(1));
}


countX( "xaaaxa" );

// length != 0
// charAt(0) == 'x'
// return 1 + countX( "aaaxa" )
  // length != 0
  // charAt(0) != 'x'
  // return countX( "aaxa" )
    // length != 0
    // charAt(0) != 'x'
    // return countX( "axa" )




  
  
  
  
  
  
  
  
  
  
  
  