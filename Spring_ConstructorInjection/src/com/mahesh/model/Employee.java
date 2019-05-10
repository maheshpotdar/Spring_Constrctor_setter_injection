package com.mahesh.model;

public class Employee {

	private String name, address;
	private float marks;
	private long mobile;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// employee e1=new employee(String name, String address, float marks, long
	// mobile);
	public Employee(String name, String address, float marks, long mobile) {
		super();
		System.out.println("first (string,string,float,long)constructor");
		this.name = name;
		this.address = address;
		this.marks = marks;
		this.mobile = mobile;
	}

	// employee e2=new employee(String address);
	public Employee(String address) {
		System.out.println("second (String) constructor");
		this.address = address;
	}

	// employee e3=new employee(float marks);
	public Employee(float marks) {
		System.out.println("third (float) constructor");
		this.marks = marks;
	}

	// employee e4=new employee(float marks, long mobile);
	public Employee(float marks, long mobile) {
		System.out.println("fourth (float,long) constructor");
		this.marks = marks;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public float getMarks() {
		return marks;
	}

	public long getMobile() {
		return mobile;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", marks=" + marks + ", mobile=" + mobile + "]";
	}

}
