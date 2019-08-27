package com.qa.firstApplication;

public class Iteration {

	public static void main(String[] args) {
		//for loop --- when wee know how many times we want to loop;
		for (int i = 1;i<=5;i++)
		{
			System.out.println("I am line " + i);
		}
		
		int line = 1;
		// while loop --- when we don't know when it's going to end;
		while (line<=5) {
			System.out.println("I am line " + line++);
		}
		
		//example of prefix post-fix;
		int x = 2;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(++x);
		
		
		
	}
}
