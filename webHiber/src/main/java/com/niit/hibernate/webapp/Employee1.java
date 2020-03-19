package com.niit.hibernate.webapp;

import java.util.Date;

public class Employee1 extends Person1 {

	private Date joiningDate;
	private String departmentName;
	
	public Employee1() {
		
	}

	public Employee1(String firstName, String lastName, String departmentName, Date joiningDate) {
		super(firstName, lastName);
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
