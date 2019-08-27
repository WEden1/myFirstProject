package com.qa.firstApplication;

public class Dog extends Animal{
	
	public String name;
	String colour;
	public boolean hasBall = false;
	public Dog() {
		
	}
	public Dog(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}
	public void speak() {
		System.out.println("Bork!!");
	}

}
