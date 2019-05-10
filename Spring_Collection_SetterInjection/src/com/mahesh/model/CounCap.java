package com.mahesh.model;

public class CounCap {
	private String counCapital;

	public CounCap() {
		// TODO Auto-generated constructor stub
	}

	public CounCap(String counCapital) {
		super();
		this.counCapital = counCapital;
	}

	public String getCounCapital() {
		return counCapital;
	}

	public void setCounCapital(String counCapital) {
		this.counCapital = counCapital;
	}

	@Override
	public String toString() {
		return "CounCap [counCapital=" + counCapital + "]";
	}

}
