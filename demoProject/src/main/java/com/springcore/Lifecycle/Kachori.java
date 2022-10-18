package com.springcore.Lifecycle;

public class Kachori {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kachori() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kachori [name=" + name + "]";
	}
	
	public void init()
	{
		System.out.println("inside init method");
	}
	
	public void destroy()
	{
		System.out.println("inside destrory method");
	}
    
}
