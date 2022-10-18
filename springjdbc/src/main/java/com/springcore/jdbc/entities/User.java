package com.springcore.jdbc.entities;

import java.util.Date;
import java.time.LocalDateTime;

public class User {
	int userId;
	String userEmail;
	String firstName;
	String lastName;
	Date dateOfBirth;
	int companyId;
	String companyName;
	Date dateOfJoining;
	LocalDateTime lastLogin;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userEmail, String firstName, String lastName, Date dateOfBirth, int companyId,
			String companyName, Date dateOfJoining, LocalDateTime lastLogin) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.companyId = companyId;
		this.companyName = companyName;
		this.dateOfJoining = dateOfJoining;
		this.lastLogin = lastLogin;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", companyId=" + companyId + ", companyName="
				+ companyName + ", dateOfJoining=" + dateOfJoining + ", lastLogin=" + lastLogin + "]";
	}
	
	

}
