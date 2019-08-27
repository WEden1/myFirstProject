package com.qa.firstApplication;

public class App {
	
	// Variables and Methods

	public static String name = "William";	
	public static void main(String[] args) {
		String returnedValueFromMethod = imAConsultant(name);
		System.out.println(returnedValueFromMethod);
	}
	
	public static String imAConsultant(String myName) {
		String sentence = "I'm a consultant called " + myName;
		return sentence;
	}

}
