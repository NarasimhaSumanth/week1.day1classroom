package week1.day1;

// shortcut for execution - control + f11

public class Mobile {
	// globalVariables
	String mobileModel = "onePlus";
	int mobileWeight = 2;
	boolean isFullCharge = false;
	double mobileCost = 30000.500;	
	
	
	//accessSpecifier returnType methodName() {}
	public void makeCall() {
		
		System.out.println("able to make a call");

	}
	
	//accessSpecifier returnType methodName() {}
	public void sendMsg() {
		
		System.out.println("message is sending");

	}
	
	public static void main(String[] args) {
		
		//className objectName = new className();
		Mobile myMobile = new Mobile();
		
		// use the object to call method
		myMobile.makeCall();
		myMobile.sendMsg();		
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
		
	}

}
