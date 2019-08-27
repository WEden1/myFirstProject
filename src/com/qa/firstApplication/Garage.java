package com.qa.firstApplication;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> garage;
	private int bill;
	
	public void addVehicle(Vehicle veh){
		this.garage.add(veh);
	}
	
	public int getBill(Vehicle veh) {
		
		for (Vehicle v : garage) {
			
			if (v instanceof Scooter) {
				bill = ((Scooter)v).getTopSpeed() * 5;			
			}
			else if (v instanceof MotorBike) {
				
				bill = ((MotorBike) v).getHp() * 8;
			}
			else if(v instanceof Car)
			{
				bill = ((Car) v).getWheels() * 1000;
			}
		}
		return bill;
	}

	public void removeVehicle() {
		
		
		
	}
}
