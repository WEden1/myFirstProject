package com.qa.firstApplication;

public class BoxMain {
	
	
	public static void main(String[] args) {
		
	Box box2 = new Box();
	
	Box.colour = "blue"; //Static can be accessed by the class instead of the object
	Box.item = "Cat";
	
	box2.colour = "blue";
	box2.item = "Cat";
	
	System.out.println(Box.colour);
	System.out.println(Box.item);
	
	System.out.println(box2.colour);
	System.out.println(box2.item);

	}

}
