package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee;
 
public class AppSB {
 
 	public static void main(String[] args) {
 
       ApplicationContext context = new 
       ClassPathXmlApplicationContext("SpringConfig.xml");
 
       Employee emp = context.getBean("employee", Employee.class);
       Employee emp2 = context.getBean("employee", Employee.class);
 
       System.out.println(emp.toString());
       System.out.println(emp2.toString());
 
       emp.setFirstName("Monu");
       emp.setEid(102);

       System.out.println(emp.toString());
       System.out.println(emp2.toString());
 
       ((AbstractApplicationContext) context).close();
 	}
}



