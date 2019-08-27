package com.qa.firstApplication;

import java.util.ArrayList;

public class VehicleMain {
	
	public static void main(String[] args) {
		Car brum = new Car(55, 4);
		int brumId = brum.getId();
		int brumWheels = brum.getWheels();
		
		MotorBike jenny = new MotorBike(34768, 10);
		int jennyId = jenny.getId();
		int jennyHp = jenny.getHp();
		
		Scooter scoot = new Scooter(7657, 80);
		int scootID = scoot.getId();
		int scootTopSpeed = scoot.getTopSpeed();
		
		Garage garage = new Garage();
		garage.addVehicle(brum);
		garage.addVehicle(jenny);
		garage.addVehicle(scoot);
		
	}

}
