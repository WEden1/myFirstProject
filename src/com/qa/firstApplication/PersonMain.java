package com.qa.firstApplication;

public class PersonMain {

	
	//public == access modifier accessible to package  
	//static all instances share memory location;
	//void returns nothing
	//array of strings
	
	public static void main(String[] args) {
		Person p = new Person("p", 68);
		Person dylan = new Person("d", 23);
		Person sehher = new Person("s", 7657);
		
		for (Person person :Person.people)
		{
			System.out.println(person);
		}
	}
}
