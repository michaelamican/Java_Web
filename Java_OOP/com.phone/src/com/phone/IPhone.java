package com.phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	private String buzzer;
	private String hearMeNow;
	
	@Override
	public String ring() {
		this.buzzer = getRingTone();
		System.out.println(buzzer);
		return buzzer;
	}
		
	@Override
	public String unlock() {
		this.hearMeNow = getCarrier();
		System.out.println(hearMeNow);
		return hearMeNow;
		
	}
	@Override
	public void displayInfo() {
		getRingTone();
		getVersionNumber();
		getBatteryPercentage();
		getCarrier();
	}
}
