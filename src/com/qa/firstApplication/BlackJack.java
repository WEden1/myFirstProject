package com.qa.firstApplication;

public class BlackJack {
	public static void main(String [] args) {
		int ans1 = play(15,13);
		int ans2 = play(20,23);
		int ans3 = play(1,22);
		int ans4 = play(2,23);
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
	}
	
	public static int play(int num1, int num2) {
		if ((num1>0 & num1<=21) & (num1>num2 || num2>21)) {
			return num1;
		}
		else if  ((num2>0 & num2<=21) & (num2>num1 || num1>21)) {
			return num2;
		}
		else {
			return 0;
		}
	}
		

}
