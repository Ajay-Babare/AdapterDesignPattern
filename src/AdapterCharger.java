
public class AdapterCharger implements AppleCharger {

	private AndroidCharger charger;
	
	public AdapterCharger(AndroidCharger charger) {
		super();
		this.charger = charger;
	}

	@Override
	public void chargePhone() {
		charger.chargeAndroidPhone();
		System.out.println("Your phone is charging with adapter");
	}

}
