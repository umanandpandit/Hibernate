package com.niit.hibernate.webapp;

public class Emp {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	private String name;
	Address address;     // has-a relation
	
	public String getName() {
		return name;
	}
	public Emp(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
