package com.qa.designPatterns;

public class Singleton {
	//private static instance of object
	private static Singleton obj = new Singleton();
	//private constructor
	private Singleton() {
	}
	//static get method
	public static Singleton getInstance() {
		return obj;
	}
	
	public void helloWorld() {
		System.out.println("Hello World");
	}
	
}
