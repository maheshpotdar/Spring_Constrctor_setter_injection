package com.mahesh.model;

public class Cricket {

	private String cricketerName;

	public Cricket() {
		// TODO Auto-generated constructor stub
	}

	public String getCricketerName() {
		return cricketerName;
	}

	public void setCricketerName(String cricketerName) {
		this.cricketerName = cricketerName;
	}

	public Cricket(String cricketerName) {
		super();
		this.cricketerName = cricketerName;
	}

	@Override
	public String toString() {
		return "Cricket [cricketerName=" + cricketerName + "]";
	}

}
