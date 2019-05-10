package com.mahesh.model;

public class Employee {

	private String empName, empAddress;
	private Car car;
	private TwoWheeler twWheeler;

	public Car getCar() {
		return car;
	}

	public TwoWheeler getTwWheeler() {
		return twWheeler;
	}

	public Employee(String empName, String empAddress, Car car, TwoWheeler twWheeler) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.car = car;
		this.twWheeler = twWheeler;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String empAddress) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAddress=" + empAddress + ", car=" + car + ", twWheeler="
				+ twWheeler + "]";
	}

}
