package com.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.setRingTone(ringTone);
	}

	public abstract void displayInfo();
	
	
	public String getRingTone() {
		System.out.println(ringTone);
		return ringTone;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	public String getVersionNumber() {
		System.out.println(versionNumber);
		return versionNumber;
	}
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public int getBatteryPercentage() {
		System.out.println(batteryPercentage);
		return batteryPercentage;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public String getCarrier() {
		System.out.println(carrier);
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
}
