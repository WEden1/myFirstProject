package com.qa.firstApplication;

import java.util.Scanner;

public class IterationTask {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("input a number");
		int number = input.nextInt();
		
		if (number>2000) {
			System.out.println("A");
			if(number>6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if(number>4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if(number>100) {
				System.out.println("3");
				if(number>600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if(number>500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
		
		
	}

}
