package com.springcore.ref;

public class ThirdClass {

	private String location;
	private int pincode;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public ThirdClass(String location, int pincode) {
		super();
		this.location = location;
		this.pincode = pincode;
	}
	public ThirdClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ThirdClass [location=" + location + ", pincode=" + pincode + "]";
	}
	
	

}
