package com.niit.hibernate.webapp;

public class Person {
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String emailAddress, Job job) {
		super();
		this.id = id;
		this.name = name;
		this.emailAddress = emailAddress;
		this.job = job;
	}



	private int id;
	private String name;
	private String emailAddress;
	
	private Job job;

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emailAddress=" + emailAddress + ", job=" + job + "]";
	}
	
}
