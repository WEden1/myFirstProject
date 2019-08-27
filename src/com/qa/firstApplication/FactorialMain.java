package com.qa.firstApplication;

public class FactorialMain {

	public static void main(String[] args) {
		
		float number1 = 120;
		float number2 = 150;
		
		Factorial factor = new Factorial();
		int ans = factor.findFactorial(18);
		
		if(ans == 0) {
			System.out.println("NONE");
		}else {
		System.out.println(ans);
		}
	}
}
