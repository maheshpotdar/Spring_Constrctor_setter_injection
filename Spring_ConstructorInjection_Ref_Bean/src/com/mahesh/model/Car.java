package com.mahesh.model;

public class Car {

	private String carName;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String carName) {
		super();
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}

}
