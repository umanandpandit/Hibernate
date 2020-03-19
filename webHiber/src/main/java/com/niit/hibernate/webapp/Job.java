package com.niit.hibernate.webapp;

public class Job {
	
	private String designation;
	private int salary;
	private String jobDescription;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String designation, int salary, String jobDescription) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.jobDescription = jobDescription;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	
}
