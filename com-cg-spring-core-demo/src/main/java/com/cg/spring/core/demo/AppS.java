package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.spring.core.demo.model.Student;
@ComponentScan
public class AppS {
   public static void main(String[] args) {
	System.out.println("Start");
	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppS.class);
	Student st=ctx.getBean(Student.class);
	System.out.println(st.toString());
	((AbstractApplicationContext) ctx).close();
	System.out.println("End");
}
}
