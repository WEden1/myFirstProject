package com.qa.firstApplication;

public class Scooter extends Vehicle{
	
	private int topSpeed;
	public Scooter(int id, int topSpeed) {
		super(id);
		this.topSpeed = topSpeed;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
}
