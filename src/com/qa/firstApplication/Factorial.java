package com.qa.firstApplication;

public class Factorial {

	
	
	public int findFactorial(float number) {
		
		int division = 2;
		float result = number;
		
		while(result > 1) {
			result = result/division;
			division++;
		}
		
		if(result == 1) {
			return division - 1;
		}else {
			return 0;
		}
		
	}
	

	
	
}
