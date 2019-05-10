package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Engine {

	private String enginemodelyear;

	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public String getEnginemodelyear() {
		return enginemodelyear;
	}
	@Required
	public void setEnginemodelyear(String enginemodelyear) {
		this.enginemodelyear = enginemodelyear;
	}

	@Override
	public String toString() {
		return "Engine [enginemodelyear=" + enginemodelyear + "]";
	}

}
