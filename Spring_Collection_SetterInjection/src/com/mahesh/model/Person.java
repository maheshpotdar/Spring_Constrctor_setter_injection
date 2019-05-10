package com.mahesh.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private List<Fruits> lstOfFruits;
	private Set<Cricket> setOfCricketers;
	private Map<String, String> mapOfCountryCapital;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(List<Fruits> lstOfFruits, Set<Cricket> setOfCricketers, Map mapOfCountryCapital) {
		super();
		this.lstOfFruits = lstOfFruits;
		this.setOfCricketers = setOfCricketers;
		this.mapOfCountryCapital = mapOfCountryCapital;
	}

	public List<Fruits> getLstOfFruits() {
		return lstOfFruits;
	}

	public void setLstOfFruits(List<Fruits> lstOfFruits) {
		this.lstOfFruits = lstOfFruits;
	}

	public Set<Cricket> getSetOfCricketers() {
		return setOfCricketers;
	}

	public void setSetOfCricketers(Set<Cricket> setOfCricketers) {
		this.setOfCricketers = setOfCricketers;
	}

	public Map getMapOfCountryCapital() {
		return mapOfCountryCapital;
	}

	public void setMapOfCountryCapital(Map mapOfCountryCapital) {
		this.mapOfCountryCapital = mapOfCountryCapital;
	}

	@Override
	public String toString() {
		return "Person [lstOfFruits=" + lstOfFruits + ", setOfCricketers=" + setOfCricketers + ", mapOfCountryCapital="
				+ mapOfCountryCapital + "]";
	}

}
