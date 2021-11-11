package com.cg.spring.core.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee;
import com.cg.spring.core.demo.model.Person;
 
public class AppIN {
 
 	public static void main(String[] args) {
 
       	ApplicationContext context = new 
       	ClassPathXmlApplicationContext("SpringConfig2.xml");
 
       Person person = (Person) context.getBean("employee", Employee.class);
       person.eat();
 
       	((AbstractApplicationContext) context).close();
 	}
}
