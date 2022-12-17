package tEST01;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test0111 {
	public static void main (String[]args) {
		Test0111 w = new Test0111(null, null, null, 0, 0, 0, 0, 0);
		w.ReadFromFile();     
	}
	public Test0111
	(String initialMake,String initialModel,String initialColor,
	int initialMPG_H, int initialMPG_C, double initialWeight, int initialnumberOfCylanders,
	int initialTankSize)
	{
	    set ( initialMake, initialModel, initialColor,
		 initialMPG_H, initialMPG_C, initialWeight, initialnumberOfCylanders,
		initialTankSize);
	}
	public void setTest01
	(String newMake,String newModel,String newColor,
			int newMPG_H, int newMPG_C, double newWeight,
			int newnumberOfCylanders,int newTankSize)
	{
	    set (newMake,newModel,newColor,newMPG_H,
	    		newMPG_C,newWeight,newnumberOfCylanders,newTankSize);
	}
	private void set
	(String newMake,String newModel,String newColor,
			int newMPG_H, int newMPG_C, double newWeight,
			int newnumberOfCylanders,int newTankSize)
	{
	
	    if ((newMPG_H < 0) || (newWeight < 0) || (newMPG_C < 0)||
	    		 (newWeight < 0) || (newnumberOfCylanders < 0) || (newTankSize < 0))
	    {
	        System.out.println("Error: Negative age or weight.");
	        System.exit(0);
	    }
	    else
	    {
	    	String Make = newMake;
	    	String Model =  newModel;
	    	String Color = newColor;
			int MPG_H = newMPG_H;
			int MPG_C = newMPG_C;
			double Weight = newWeight;
			int numberOfCylanders = newnumberOfCylanders;
			int TankSize= newTankSize;
	    }
	} 	
	
	
	
	 private static String Make;
 	private static String Model;
 	private static String Color;
		private static int MPG_H;
		private static int MPG_C;
		private static double Weight;
		private static int numberOfCylanders;
		private static int TankSize;
		private Object set;

	    public Test011
//	    (String initialName, int initialAge, double initialWeight)
	    (String initialMake,String initialModel,String initialColor,
	    		int initialMPG_H, int initialMPG_C, double initialWeight, int initialnumberOfCylanders,
	    		int initialTankSize)
	    
	    {
//	         set (initialName, initialAge, initialWeight);
	    	set ( initialMake, initialModel, initialColor,
	    			 initialMPG_H, initialMPG_C, initialWeight, initialnumberOfCylanders,
	    			initialTankSize);
	         
	    }
	    @SuppressWarnings("unused")
		private void set1(String initialMake, String initialModel, String initialColor,
 		  int initialMPG_H,
				int initialMPG_C, double initialWeight, int initialnumberOfCylanders,
				int initialTankSize) {
		}
	    
	    
	    
	    
		public Test0111(String initialMake)
	    {
	         this(initialMake, 0, 0, 0, 0,0,0,0);
	    }
		
		
		public Test01111(String initialModel)
	    {
	         this(0,initialModel, 0,0,0,0,0,0);
	    }
		
		
		public Test0111111(String initialColor)
	    {
	         this(0,0,initialColor, 0, 0,0,0,0);
	    }
		
		
		public Test0111(int initialMPG_H)
	    {
	         this(0,0,0, initialMPG_H,0, 0,0,0);
	    }
		
		
		
		public Test01(int initialMPG_C)
	    {
	         this(0,0,0,0, initialMPG_C, 0,0,0);
	    }
		
		
	    public Test0111(double initialWeight)
	    {
	         this(0,0,0,0, 0, initialWeight,0,0);   
	    }
		
	    public Test01(int initialnumberOfCylander)
	    {
	         this(0,0,0,0,0,0, initialnumberOfCylander, 0);  
	    }
		
	    
	    public Test01(int  initialTankSize)
	    {
	         this(0,0,0,0,0,0,0,  initialTankSize);
	    }
		
		
		
//	    public Test01(int initialAge)
//	    {
//	         this("No name yet.", initialAge, 0);
//	    }

	    public Test0111( )
	    {
	     this(Make, Model, Color, MPG_H, MPG_C, Weight, numberOfCylanders,TankSize);
	    }
public Test0111(int i, int j, int k, int initialMPG_H, int initialMPG_C, int initialWeight, int initialnumberOfCylander,
		int initialTankSize) {
	// TODO Auto-generated constructor stub
}
public Test0111(int i, int j, int k, int initialMPG_H, int initialMPG_C, double initialWeight,
		int initialnumberOfCylanders, int initialTankSize) {
	// TODO Auto-generated constructor stub
}
public Test0111(int i, String initialModel, int j, int initialMPG_H, int initialMPG_C, int initialWeight,
		int initialnumberOfCylanders, int initialTankSize) {
	// TODO Auto-generated constructor stub
}
public Test0111(String initialMake, int i, int j, int initialMPG_H, int initialMPG_C, int initialWeight,
		int initialnumberOfCylanders, int initialTankSize) {
	// TODO Auto-generated constructor stub
}
public Test0111(int i, int j, String initialColor, int initialMPG_H, int initialMPG_C, int initialWeight,
		int initialnumberOfCylanders, int initialTankSize) {
	// TODO Auto-generated constructor stub
}	
	
	
	
	
	private void ReadFromFile() {
		String pathname = "C:\\users\\Mhoss\\OneDrive\\Desktop\\Car4.txt"; //This is where you have to address the file!
		File file = new File (pathname);
		try {
			char[] ch = new char[1000];
			FileReader fr = new FileReader (file);
			fr.read(ch);
			System.out.println("The content of file --> " +file.getName()+" are:");
			for (char c: ch) {
				System.out.print(c);
			}
			fr.close();
		}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	
