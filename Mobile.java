package week1.day1;

//Class name Mobile

public class Mobile {
	//method names makeCall() and sendMsg()

	public void makeCall() {
		System.out.println("Make the call");
	}
	public void sendMsg() {
		System.out.println("Send the message");
	}
	public static void main(String [] args) {
		System.out.println("inside the main method");
		
		//Object name is Sony
		
		Mobile Sony = new Mobile();
		Sony.makeCall();
		Sony.sendMsg();
	}
}
