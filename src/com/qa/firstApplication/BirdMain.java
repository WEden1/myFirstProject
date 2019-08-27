package com.qa.firstApplication;

public class BirdMain {
public static void main(String[] args) {
	Bird bird = new Bird();
	bird.fly();
	
	FlyingCreature flyBoy = (FlyingCreature) bird;
	Hairy  hairyBoy = (Hairy) bird;
	flyBoy.fly();
	hairyBoy.preen();
}
}
