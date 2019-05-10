package com.mahesh.model;

public class Fruits {

	private String fruitsname;

	public Fruits() {
		// TODO Auto-generated constructor stub
	}

	public String getFruitsname() {
		return fruitsname;
	}

	public void setFruitsname(String fruitsname) {
		this.fruitsname = fruitsname;
	}

	@Override
	public String toString() {
		return "Fruits [fruitsname=" + fruitsname + "]";
	}

	public Fruits(String fruitsname) {
		super();
		this.fruitsname = fruitsname;
	}

}
