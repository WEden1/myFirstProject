package com.qa.firstApplication;

public class Switch {
	
	public static void main(String [] args) {
	
		String[] day = {"monday", "thursday", "sunday"};
		
		switch(day[2]) {
		case "monday":
			System.out.println("I hate Mondays");
		case "tuesday":
		case "wednsday":
		case "thursday":
		case "friday":
			System.out.println("work");
			break;
		case "saturday":
		case "sunday":
				System.out.println("party");
				break;
		}
	}
	
	

}
