package com.example.hr;

public class Employee {
	String name;
	Integer id;
	Double salary;
	
	
	// Print the name of Employee
	public void printName() {
		System.out.println("The Employee name "+name);
	}
	
	//Print the Employee Salary
	public void printSalary() {
		System.out.println("The Employee salary "+salary);
	}
	
	
	// Getter And Setter method of variable 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
	

}
