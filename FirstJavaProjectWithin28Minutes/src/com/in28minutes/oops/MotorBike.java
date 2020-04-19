package com.in28minutes.oops;

public class MotorBike {
	// state

	private int speed; // member variable

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;

	}



	void start() {
		System.out.println("Bike Started");
	}
}