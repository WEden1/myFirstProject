package com.qa.firstApplication;

public class Cat extends Animal {
	public String name;
	public int age;
	public String fur;
	public int lives = 9;
	
	
	//OverLoad!!!
	public Cat(String name, int age) {
		this.age = age;
		this.name = name;
		
	}
	public Cat(int age) {
		this.age = age;
	}
	
	//Override!!
	public void speak() {
		System.out.println("Meow!!");
	}
}
