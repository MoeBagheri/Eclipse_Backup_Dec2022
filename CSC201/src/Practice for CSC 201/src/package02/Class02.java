package package02; 

public class Class02 {

//	public Class02() {
		// TODO Auto-generated constructor stub
//	}
	public Class02
//	(String initialName, int initialAge,double initialWeight)
	(String initialMake,String initialModel,String initialColor,
	int initialMPG_H, int initialMPG_C, double initialWeight, int initialnumberOfCylanders,
	int initialTankSize)
	{
//	    set(initialName, initialAge, initialWeight);
	    set ( initialMake, initialModel, initialColor,
		 initialMPG_H, initialMPG_C, initialWeight, initialnumberOfCylanders,
		initialTankSize);
	}
	public void setClass02
//	(String newName, int newAge,double newWeight)
	(String newMake,String newModel,String newColor,
			int newMPG_H, int newMPG_C, double newWeight,
			int newnumberOfCylanders,int newTankSize)
	{
//	    set(newName, newAge, newWeight);
	    set (newMake,newModel,newColor,newMPG_H,
	    		newMPG_C,newWeight,newnumberOfCylanders,newTankSize);
	}
	private void set
//	(String newName, int newAge, double newWeight)
	(String newMake,String newModel,String newColor,
			int newMPG_H, int newMPG_C, double newWeight,
			int newnumberOfCylanders,int newTankSize)
	
	{
//	    name = newName;
//		MPG_H = newMPG_H
		
	    if ((newMPG_H < 0) || (newWeight < 0) || (newMPG_C < 0)||
	    		 (newWeight < 0) || (newnumberOfCylanders < 0) || (newTankSize < 0))
	    {
	        System.out.println("Error: Negative age or weight.");
	        System.exit(0);
	    }
	    else
	    {
//	    	MPG_H = newMPG_H;
//	        weight = newWeight;
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

}
