package com.qa.firstApplication;

public class DogToString {
	
	public int age;
	public String name;
	
	public String toString() {
		return "age: " + age+ "\n"
				+ "name: " + name;
	}
	
	DogToString(int age, String name){
		this.age = age;
		this.name = name;
	}

}
