package week1day1assesment;

public class Car {

// Driving Action methods are created	
	
	public void applyBreak()	{
		System.out.println(" Driving Actions");
		System.out.println(" Break applied while driving");
	}
	
	
	public void applyGear()	{
		
		System.out.println(" Gear Applied while driving");
	}
	
	public void swithonAc()	{
		
		System.out.println(" AC switched on while driving");
	}
	
	public void applyAcclerater()	{
		
		System.out.println(" Accleratered while driving");
	}
	
// methods created in main 
	public static void main(String[] args) {
		
//Object name DriveAction created
		Car DriveAction = new Car();
		
//All the methods are called through Objects in Main
		DriveAction.applyBreak();
		DriveAction.applyGear();
		DriveAction.swithonAc();
		DriveAction.applyAcclerater();
		

	}

}
