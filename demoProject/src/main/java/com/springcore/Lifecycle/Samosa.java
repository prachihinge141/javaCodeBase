package com.springcore.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
     
	@PostConstruct
	public void start() {
		System.out.println("Samosa init method");
	}

	@PreDestroy
	public void end() {
		System.out.println("Samosa destroy method");
	}
}
