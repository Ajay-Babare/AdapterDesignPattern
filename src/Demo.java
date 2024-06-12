public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		AppleCharger charger = new AdapterCharger(new DKCharger());
		
		Iphone13 iPhone13 = new Iphone13(charger);
		
		iPhone13.chargeIphone();
		
	}
}
