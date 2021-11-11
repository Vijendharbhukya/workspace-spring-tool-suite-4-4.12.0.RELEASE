package com.cg.spring.core.demo.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class EmployeeD {
 
//   @Autowired
 	private Department department;
 
//   public Employee() {
//     	super();
//     	System.out.println("default constructor");
//   }
 
//   @Autowired
 	public EmployeeD(Department department) {
       	super();
       	System.out.println("parameterized constructor");
       	this.department = department;
 	}
 
 	public Department getDepartment() {
       	return department;
 	}
 
//   @Autowired
 	public void setDepartment(Department department) {
       	System.out.println("setter method");
       	this.department = department;
 	}
}
