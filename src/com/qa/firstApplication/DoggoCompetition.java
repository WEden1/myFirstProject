package com.qa.firstApplication;

public class DoggoCompetition {
	public static void main(String[] args) {
		
		int dogPosition = 53;

		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 1 && i != 11 && i != dogPosition) {
				System.out.println(i + "st");
			} else if (i % 10 == 2 && i != 12 && i != dogPosition) {
				System.out.println(i + "nd");
			} else if (i % 10 == 3 && i != 13 && i != dogPosition) {
				System.out.println(i + "rd");
			} else if (i % 10 == 4 || i % 10 == 5 || i % 10 == 6 || i % 10 == 7 || i % 10 == 8 || i % 10 == 9 && i != dogPosition) {
				System.out.println(i + "th");
			}
//			} else if(i==10 || i == 11 || i == 12 || i == 13 || i == 100 && i != dogPosition) {
//				System.out.println(i + "th");
//			}
			else if (i != dogPosition)
			{
				System.out.println(i + "th");
			}
		}
	}
}
