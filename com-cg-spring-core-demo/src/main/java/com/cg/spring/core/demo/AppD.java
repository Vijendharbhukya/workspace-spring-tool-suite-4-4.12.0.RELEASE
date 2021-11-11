package com.cg.spring.core.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cg.spring.core.demo.model.EmployeeD;
 
@ComponentScan
public class AppD {
 	public static void main(String[] args) {
       	AnnotationConfigApplicationContext ctx = new 
       	AnnotationConfigApplicationContext(App.class);
       	EmployeeD emp = ctx.getBean(EmployeeD.class);
       	//emp.getDepartment.work();
 	}
}

