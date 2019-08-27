package com.qa.firstApplication;

public class Car extends Vehicle {
	
	private int wheels;
	public Car(int id, int wheels) {
		super(id);
		this.wheels = wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getWheels() {
		return wheels;
		
	}
}
