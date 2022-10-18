package com.springcore.ref;

public class SecondClass {

	private String course;
	private int amount;
	private ThirdClass tc;
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public ThirdClass getTc() {
		return tc;
	}
	public void setTc(ThirdClass tc) {
		this.tc = tc;
	}
	public SecondClass(String course, int amount, ThirdClass tc) {
		super();
		this.course = course;
		this.amount = amount;
		this.tc = tc;
	}
	public SecondClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SecondClass [course=" + course + ", amount=" + amount + ", tc=" + tc + "]";
	}
	
	
}
