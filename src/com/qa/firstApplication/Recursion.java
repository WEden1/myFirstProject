package com.qa.firstApplication;

public class Recursion {
	
	public static void main(String[] args) {
		
		System.out.println(handCount(6));
	}
	
	public static int handCount(int numOfPeople) {
		
		if (numOfPeople == 0) {
			return 0;
		}
		else {
			return handCount(numOfPeople-1)+2;
		}
	}

}
