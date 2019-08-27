package com.qa.designPatterns;

public class TraineeMain {
	public static void main(String[] args) {
		
		Trainee train = new TraineeBuilder().name("william").buildTrainee();
		System.out.println(train.getName());
	}

}
