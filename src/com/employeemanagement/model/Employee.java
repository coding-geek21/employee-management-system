package com.employeemanagement.model;


public class Employee {
	protected int id;
	protected String name;
	protected String email;
	protected String country;
	protected String designation;
	protected float salary;
	
	public Employee() {
	}
	
	public Employee(String name, String email, String country,String designation,float salary) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
		this.designation=designation;
		this.salary = salary;
	}

	public Employee(int id, String name, String email, String country,String designation,float salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
		this.designation=designation;
		this.salary = salary;
	}

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}