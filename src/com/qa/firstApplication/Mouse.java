package com.qa.firstApplication;


// encapsulation!!!


public class Mouse {

	private String belly = "empty";
	public void eat() {
		belly = "full";
	}
	public void crap() {
		belly = "empty";
	}
	public String getBelly() {
		return belly;
	}
	public void setBelly(String belly) {
		if (belly.equals("full") || belly.equals("empty")) {
		this.belly = belly;
		}
	}
}
