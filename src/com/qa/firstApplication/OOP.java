package com.qa.firstApplication;

import java.util.ArrayList;

public class OOP {
	
	public static void main(String[] args) {
		Animal Kitty = new Cat("Heironymus", 11);
		Animal dog = new Dog();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(Kitty);
		animals.add(dog);
		
		for (Animal a: animals)
		{
			a.speak();
		}

//		Cat meowser = new Cat();
//		Cat catDaemon = meowser;// locations in memory change
//		System.out.println(catDaemon);
//		meowser.name = "Shakespear";
//		System.out.println(catDaemon.name);
//		
//		Dog bobafech = new Dog("Chewbarker", "brown");
//		System.out.println("Name: " + bobafech.name);
//		System.out.println("Colour: " + bobafech.colour);
//		
		
		//Getter and Setters
//		Mouse juliusCheeser = new Mouse();
//		juliusCheeser.eat();
//		System.out.println(juliusCheeser.getBelly());
//		juliusCheeser.crap();
//		System.out.println(juliusCheeser.getBelly());
//		juliusCheeser.setBelly("full");
//		System.out.println(juliusCheeser.getBelly());
////	
//		Penguin pingu = new Penguin("Very");
//		pingu.sleep();
//		pingu.eat();
//		pingu.swim();
//		
//		RockLover ping = new RockLover("very", "Metal!!");
//		ping.dance();
		
		
		
		
	}
}
