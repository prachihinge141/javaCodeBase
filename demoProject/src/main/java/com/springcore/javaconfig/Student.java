package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("stud") bean use kruya
public class Student {
	
	private Samosa samosa;
public void study()
{
	this.samosa.Eat();
	System.out.println("Students are Studing");
}
public Student(Samosa samosa) {
	super();
	this.samosa = samosa;
}
public Samosa getSamosa() {
	return samosa;
}
public void setSamosa(Samosa samosa) {
	this.samosa = samosa;
}



	
}
