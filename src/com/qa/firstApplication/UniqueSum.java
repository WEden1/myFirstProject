package com.qa.firstApplication;

import java.util.Scanner;


// GOOD EFFORT NEEEDS WORK!!!

public class UniqueSum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("input value 1");
		int num1 = input.nextInt(); 
		System.out.println("input value 2");
		int num2 = input.nextInt(); 
		System.out.println("input value 3");
		int num3 = input.nextInt();
		float ans = sum(num1, num2, num3);

		
		System.out.println(ans);
		
	}
	
	public static float sum(int val1, int val2, int val3) {
		
		float total = val1 + val2 + val3;
		
		
		if (val1 == val2 && val1 == val3) {
			return 0;
		}
		else if(val1 == val2) 
		{
			return val3;
		}
		else if(val1 == val3){
			return val2;
		}
		else {
			return total;
		}
	}

}
