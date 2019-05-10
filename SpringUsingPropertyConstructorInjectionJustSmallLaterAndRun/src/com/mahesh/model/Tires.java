package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Tires {

	private String tirecompname;
	private String tirecompcountry;
	private String tireprice;
	private String tirecompceoname;

	public Tires() {
		// TODO Auto-generated constructor stub
	}

	public String getTirecompname() {
		return tirecompname;
	}

	@Required
	public void setTirecompname(String tirecompname) {
		this.tirecompname = tirecompname;
	}

	public String getTirecompcountry() {
		return tirecompcountry;
	}

	public void setTirecompcountry(String tirecompcountry) {
		this.tirecompcountry = tirecompcountry;
	}

	public String getTireprice() {
		return tireprice;
	}

	@Required
	public void setTireprice(String tireprice) {
		this.tireprice = tireprice;
	}

	public String getTirecompceoname() {
		return tirecompceoname;
	}

	public void setTirecompceoname(String tirecompceoname) {
		this.tirecompceoname = tirecompceoname;
	}

	@Override
	public String toString() {
		return "Tires [tirecompname=" + tirecompname + ", tirecompcountry=" + tirecompcountry + ", tireprice="
				+ tireprice + ", tirecompceoname=" + tirecompceoname + "]";
	}

}
