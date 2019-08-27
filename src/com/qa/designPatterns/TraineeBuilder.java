package com.qa.designPatterns;

public class TraineeBuilder {
	
	private String name;
	private int age = 0;
	private String tech = "nothing";
	
	public Trainee buildTrainee() {
		return new Trainee(name, age, tech);
	}
	public TraineeBuilder name(String name) {
		this.name = name;
		return this;
	}
	public TraineeBuilder age(int age) {
		this.age = age;
		return this;
	}
	public TraineeBuilder tech(String tech) {
		this.tech = tech;
		return this;
	}
	

}
