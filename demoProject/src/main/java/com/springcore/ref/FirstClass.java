package com.springcore.ref;

public class FirstClass {
	
	private int id;
	private String name;
	private SecondClass sc;
	private ThirdClass tc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SecondClass getSc() {
		return sc;
	}
	public void setSc(SecondClass sc) {
		this.sc = sc;
	}
	public ThirdClass getTc() {
		return tc;
	}
	public void setTc(ThirdClass tc) {
		this.tc = tc;
	}
	public FirstClass(int id, String name, SecondClass sc, ThirdClass tc) {
		super();
		this.id = id;
		this.name = name;
		this.sc = sc;
		this.tc = tc;
	}
	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FirstClass [id=" + id + ", name=" + name + ", sc=" + sc + ", tc=" + tc + "]";
	}
	

}
