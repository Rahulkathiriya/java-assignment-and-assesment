package com;

public class address {

	String state;
	String city;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display() {

		System.out.println(state + " " + city);
	}

}
