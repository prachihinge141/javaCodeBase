package com.springcore;

public class Student 
 {
     private int studentId; 
     private String studentName;
     private String studentAddress;
	
     public int getStudentId() {
    	System.out.println("getting student ID");
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting student ID");
		this.studentId = studentId;
	}
	public String getStudentName() {
		System.out.println("getting student name");
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting student name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		System.out.println("getting student Address");
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student Address");
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
     
     
 }
