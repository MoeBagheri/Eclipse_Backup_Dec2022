package package02;

public class Class03 {

	    private String Make;
	    private String Model;
    	private String Color;
		private int MPG_H;
		private int MPG_C;
		private double Weight;
		private int numberOfCylanders;
		private int TankSize;
		
		

	    public Class03(String initialMake,String initialModel,String initialColor,
	    		int initialMPG_H, int initialMPG_C, double initialWeight, int initialnumberOfCylanders,
	    		int initialTankSize)
	    {
//	        set(initialName, initialAge, initialWeight);
	    	 set ( initialMake, initialModel, initialColor,
	    			 initialMPG_H, initialMPG_C, initialWeight, initialnumberOfCylanders,
	    			initialTankSize);
	    	 
	    	 
	    }
	    public Class03(String initialMake)
	    {
	        set(initialMake,"No name yet.","No name yet.", 0,0,0,0,0);
	    }
	    
	    
	    public Class03(String initialModel)
	    {
	        set("No name yet.",initialModel,"No name yet.", 0,0,0,0,0);
	    }
	    
	    
	    public Class03(String initialColor)
	    {
	        set("No name yet.","No name yet.",initialColor, 0,0,0,0,0);
	    }
	    
	    
	    public Class03(int initialMPG_H)
	    {
	        set("No name yet.", "No name yet.","No name yet.", initialMPG_H,0,0,0,0);
	    }
	    
	    
	    
	    public Class03(int initialMPG_C)
	    {
	        set("No name yet.", "No name yet.","No name yet.",0,initialMPG_C,0,0,0);
	    }
	    
	    
	    
	    public Class03(double initialWeight)
	    {
	        set("No name yet.", "No name yet.","No name yet.",0, 0, initialWeight,0,0);
	    }
	    
	    
	    public Class03(int numberOfCylanders)
	    {
	        set("No name yet.", "No name yet.","No name yet.",0, 0, numberOfCylanders,0);
	    }
	    
	    
	    public Class03(int TankSize)
	    {
	        set("No name yet.", "No name yet.","No name yet.",0, 0,0,0, TankSize);
	    }
	    
	    
	    
	    public Class03( )
	    {
	        set("No name yet.","No name yet.","No name yet.",0,0,0, 0, 0);
	    }
	    
	    
	    
	    
	    public void setMake
//	    (String newName, int newAge, double newWeight)
	    (String newMake,String newModel,String newColor,
				int newMPG_H, int newMPG_C, double newWeight,
				int newnumberOfCylanders,int newTankSize)
	    
	    
	    {
//	        set(newName, newAge, newWeight);
	    	 set (newMake,newModel,newColor,newMPG_H,
			    		newMPG_C,newWeight,newnumberOfCylanders,newTankSize);
	    }
	    
	    
	    
	    
	    
	    public void setName(String newMake)
	    {
//	        set(newName, age, weight);//age and weight unchanged
	    	set(newMake, Model,Color,MPG_H,MPG_C,Weight,numberOfCylanders,TankSize);
	    }
	    
	    
	    public void setAge(int newModel)
	    {
//	        set(name, newAge, weight);//name and weight unchanged
	    	set(Make, newModel,Color,MPG_H,MPG_C,Weight,numberOfCylanders,TankSize);
	    }
	    
	    
	    
	    public void setWeight(double newColor)
	    {
//	        set(name, age, newWeight);//name and age unchanged
	    	set(Make, Model,newColor,MPG_H,MPG_C,Weight,numberOfCylanders,TankSize);
	    }
	    
	    public void setName(String newMPG_H)
	    {
//	        set(newName, age, weight);//age and weight unchanged
	    	set(Make,Model,Color,newMPG_H,MPG_C,Weight,numberOfCylanders,TankSize);
	    }
	    
	    
	    public void setName(String newMPG_C)
	    {
//	        set(newName, age, weight);//age and weight unchanged
	    	set(Make,Model,Color,MPG_H,newMPG_C,Weight,numberOfCylanders,TankSize);
	    }
	    
	    
	    public void setName(String newWeight)
	    {
//	        set(newName, age, weight);//age and weight unchanged
	    	set(Make,Model,Color,MPG_H,MPG_C,newWeight,numberOfCylanders,TankSize);
	    	
	    }
	    
	    
	    public void setName(String newnumberOfCylanders)
	    {
//	        set(newName, age, weight);//age and weight unchanged
	    	set(Make,Model,Color,MPG_H,MPG_C,Weight,newnumberOfCylanders,TankSize);
	    }
	    
	    
	    public void setName(String newTankSize)
	    {
//	        set(newName, age, weight);//age and weight unchanged
	    	set(Make,Model,Color,MPG_H,MPG_C,Weight,numberOfCylanders,newTankSize);

	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    private void set
//	    (String newName, int newAge,double newWeight)
	    (String newMake,String newModel,String newColor,
				int newMPG_H, int newMPG_C, double newWeight,
				int newnumberOfCylanders,int newTankSize)
	    
	    {
//	        name = newName;
	    	Make = newMake;
	    	Model = newModel;
	    	Color = newColor;
 
	        
	        
//	        if ((newAge < 0) || (newWeight < 0))
	        	if ((newMPG_H < 0) || (newWeight < 0) || (newMPG_C < 0)||
			    		 (newWeight < 0) || (newnumberOfCylanders < 0) || (newTankSize < 0))
	        {
	             System.out.println("Error: Negative Number");
	             System.exit(0);
	        }
	        else
	        {
	        //     age = newAge;
	        //     weight = newWeight;
	             
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

