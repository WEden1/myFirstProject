package com.qa.designPatterns;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		instance.helloWorld();
		
	}

}
