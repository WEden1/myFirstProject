package com.qa.firstApplication;

import java.util.ArrayList;

public class Person {

	public String name;
	public int age;
	public static ArrayList<Person> people = new ArrayList<Person>();
	
	@Override
	public String toString() {
		return "name:" + name + "age: "+ age;
	}
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
		
		people.add(this);
	
	}
}
