package com.qa.firstApplication;

public class MotorBike extends Vehicle{
	
	private int hp;
	public MotorBike(int id, int hp) {
		super(id);
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}

}
