package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private List<String> friends;
	private Map<String , String> courses;
	private Set<String> shift;
	
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Set<String> getShift() {
		return shift;
	}
	public void setShift(Set<String> shift) {
		this.shift = shift;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + ", shift=" + shift + "]";
	}
	

	
	
}
