package com.qa.firstApplication;

public class Bird extends Animal implements FlyingCreature, Hairy {

	public void eat() {
		System.out.println("peck");
	}
	public void fly() {
		System.out.println("flap");
	}
	public void preen() {
		System.out.println("Peck");
	}
}
