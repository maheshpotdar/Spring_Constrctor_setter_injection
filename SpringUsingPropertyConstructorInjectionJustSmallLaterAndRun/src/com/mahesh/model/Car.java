package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carname;
	private String carprice;
	private String carcountry;

	private Tires tires;
	private Engine engine;
	private Sheets sheets;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarname() {
		return carname;
	}

	public Car(String carname, String carprice, String carcountry, Tires tires, Engine engine, Sheets sheets) {
		super();
		this.carname = carname;
		this.carprice = carprice;
		this.carcountry = carcountry;
		this.tires = tires;
		this.engine = engine;
		this.sheets = sheets;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarprice() {
		return carprice;
	}

	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}

	public String getCarcountry() {
		return carcountry;
	}

	public void setCarcountry(String carcountry) {
		this.carcountry = carcountry;
	}

	public Tires getTires() {
		return tires;
	}

	public void setTires(Tires tires) {
		this.tires = tires;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Sheets getSheets() {
		return sheets;
	}

	public void setSheets(Sheets sheets) {
		this.sheets = sheets;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carprice=" + carprice + ", carcountry=" + carcountry + ", tires=" + tires
				+ ", engine=" + engine + ", sheets=" + sheets + "]";
	}

	public void displayData() {
		System.out.println("Car Info:\n");
		System.out.println("Car Name: " + carname);
		System.out.println("Car Price: " + carprice);
		System.out.println("Car Country: " + carcountry);

		System.out.println("Engine Info\n");
		System.out.println("Engine modelyear: " + engine.getEnginemodelyear());

		System.out.println("Sheets Info\n");
		System.out.println("Sheets compname: " + sheets.getSheetscompname());
		System.out.println("Sheets country: " + sheets.getSheetsmanucountry());
		System.out.println("Sheets manu name: " + sheets.getSheetsmanuname());

		System.out.println("Tire Info\n");
		System.out.println("Tire ceoname: " + tires.getTirecompceoname());
		System.out.println("Tire country: " + tires.getTirecompcountry());
		System.out.println("Tire compname: " + tires.getTirecompname());
	}
}
