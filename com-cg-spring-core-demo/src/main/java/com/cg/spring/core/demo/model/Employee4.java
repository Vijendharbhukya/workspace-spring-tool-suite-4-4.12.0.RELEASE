package com.cg.spring.core.demo.model;

public class Employee4 implements Person {
	 
 	private int id;
 	private String name;
 	private double salary;

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee4(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
 	public void eat() {
       	System.out.println("Employee eats...");
 	}
 
 	// constructors, getters, setters, toString etc
 }

