package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Sheets {

	private String sheetscompname;
	private String sheetsmanuname;
	private String sheetsmanucountry;

	public Sheets() {
		// TODO Auto-generated constructor stub
	}

	public String getSheetscompname() {
		return sheetscompname;
	}

	public void setSheetscompname(String sheetscompname) {
		this.sheetscompname = sheetscompname;
	}

	public String getSheetsmanuname() {
		return sheetsmanuname;
	}
	
 
	public void setSheetsmanuname(String sheetsmanuname) {
		this.sheetsmanuname = sheetsmanuname;
	}

	public String getSheetsmanucountry() {
		return sheetsmanucountry;
	}

	public void setSheetsmanucountry(String sheetsmanucountry) {
		this.sheetsmanucountry = sheetsmanucountry;
	}

	public Sheets(String sheetscompname, String sheetsmanuname, String sheetsmanucountry) {
		super();
		this.sheetscompname = sheetscompname;
		this.sheetsmanuname = sheetsmanuname;
		this.sheetsmanucountry = sheetsmanucountry;
	}

	@Override
	public String toString() {
		return "Sheets [sheetscompname=" + sheetscompname + ", sheetsmanuname=" + sheetsmanuname
				+ ", sheetsmanucountry=" + sheetsmanucountry + "]";
	}

}
