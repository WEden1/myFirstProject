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
		
//		System.out.println(brumId);
//		System.out.println(brumWheels);
//		System.out.println(jennyId);
//		System.out.println(jennyHp);
		
		Vehicle veh1 = (Vehicle) brum;		
		Vehicle veh2 = (Vehicle) jenny;
		Vehicle veh3 = (Vehicle) brum;
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(veh1);
		vehicles.add(veh2);
		vehicles.add(veh3);
		
		Car brumAgain = (Car) vehicles.get(0);
		MotorBike jennyAgain = (MotorBike) vehicles.get(1);
		
		System.out.println("brumAgain wheels: " + brumAgain.getWheels());
		System.out.println("jennyAgain Hp: " + jennyAgain.getHp());

		for(Vehicle v :vehicles) {
			
		if(v instanceof Car)
		{
			System.out.println("Wheels: " + ((Car)v).getWheels());
		}	
		else if (v instanceof MotorBike)
		{
			System.out.println("Hp: " + ((MotorBike)v).getHp());
		}
		}
		
		
	}

}
