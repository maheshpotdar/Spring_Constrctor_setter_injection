package com.mahesh.model;

public class Employee {

	private String empName, empAddress;
	private Car car;
	private TwoWheeler twWheeler;

	public Car getCar() {
		return car;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public TwoWheeler getTwWheeler() {
		return twWheeler;
	}

	public void setTwWheeler(TwoWheeler twWheeler) {
		this.twWheeler = twWheeler;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + ", car=" + car + ", twWheeler="
				+ twWheeler + "]";
	}

}
