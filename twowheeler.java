package week1day1assesment;

public class twowheeler {

	static int noOfWheels = 2;
	short noOfMirrors = 3;
	long chassisNumber = 1234567L;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKM = 10001.2;
	
	public void tWheeler()
	{
		System.out.println("TwoWheeler Details");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twowheeler Honda = new twowheeler();
		Honda.tWheeler();

	System.out.println("No of Wheels 				=" + Honda.noOfWheels);
	System.out.println("No of Mirrors 				=" + Honda.noOfMirrors);
	System.out.println("ChassisNumber 				=" + Honda.chassisNumber);
	System.out.println("Two wheeler is Punctured 		=" + Honda.isPunctured);
	System.out.println("BikeName 				=" + Honda.bikeName);
	System.out.println("Bike Runnig KM 				=" + Honda.runningKM);	
	
	
//		System.out.println(Honda.noOfWheels);
//		System.out.println(Honda.noOfMirrors);
//		System.out.println(Honda.chassisNumber);
//		System.out.println(Honda.isPunctured);
//		System.out.println(Honda.bikeName);
//		System.out.println(Honda.runningKM);
	}

}
