package com.example.hrtest;
import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee empObject=new Employee();
		
		System.out.println("Enter the name of Employee");
		String empName=sc.next();
		empObject.setName(empName);	
		
		System.out.println("Enter the Employee's ID");
		Integer empId=sc.nextInt();
		empObject.setId(empId);
		
		System.out.println("Enter the Employee's Salary");
		Double empSalary=sc.nextDouble();
		empObject.setSalary(empSalary);
		
		empObject.printName();
		empObject.printSalary();
	
		
		
	}

}
			//  OutPut of Program
			/*
		    Enter the name of Employee			
			raswanth
			Enter the Employee's ID
			101
			Enter the Employee's Salary
			1000000.00
			The Employee name raswanth
			The Employee salary 1000000.0
			*/