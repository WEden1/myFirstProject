package com.qa.firstApplication;

public class Penguin extends Animal {
	public String fluffiness;
	
	public Penguin(String fluffiness) {
		this.fluffiness = fluffiness;
	}
	
	public void swim() {
		System.out.println("splash");
	}


}
