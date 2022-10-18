package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address2")
	private Address address1;

	public Address getAddress() {
		return address1;
	}

	public void setAddress(Address address1) {
		this.address1 = address1;
	}

	public Emp() {
		super();
	
	}
	
	

	public Emp(Address address1) {
		super();
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Emp [address1=" + address1 + "]";
	}
	
}
