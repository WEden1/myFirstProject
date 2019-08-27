package com.qa.firstApplication;

public class App2 {
// Conditionals
	public static void main(String[] args) {
	
	int x = 4;
	int temp = 40;
	int precip = 0;
	
	if (temp>30 && precip <5) {
		System.out.println("too hot");
	}
	else if (temp<0) {
		System.out.println("too cold");
	}
	
	else
	{
		System.out.println("Just right");
	}

	}
}
