package com.mahesh.model;

public class TwoWheeler {
	private String bikeName;

	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(String bikeName) {
		super();
		this.bikeName = bikeName;
	}

	public String getBikeName() {
		return bikeName;
	}

	@Override
	public String toString() {
		return "TwWheeler [bikeName=" + bikeName + "]";
	}

}
