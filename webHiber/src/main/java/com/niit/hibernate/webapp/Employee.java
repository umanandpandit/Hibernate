package com.niit.hibernate.webapp;

import java.util.Set;

public class Employee {
	
	private int employeeId;
	private String employeeName ;
	private Set<String> phoneNumber ;
	
	public Set<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Set<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}
