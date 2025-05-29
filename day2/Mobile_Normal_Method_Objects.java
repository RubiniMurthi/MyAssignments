package week1.day2;

public class Mobile_Normal_Method_Objects {
	
	
	public void makecall() {
		System.out.println("Dial No");
	}
	
	
	public void sendtext() {
		System.out.println("Type text");
	}

	public static void main(String[] args) {
		
		Mobile_Normal_Method_Objects PhoneOperation =new Mobile_Normal_Method_Objects();
		PhoneOperation.makecall();
		PhoneOperation.sendtext();
		
		
	}

}
