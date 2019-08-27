package com.qa.firstApplication;

public class RockLover extends Penguin {
	public String music;
	public RockLover(String fluffiness, String music) {
		super(fluffiness);
		this.music = music;
	}
	public void dance() {
	System.out.println("tap tap");	
	}

}
