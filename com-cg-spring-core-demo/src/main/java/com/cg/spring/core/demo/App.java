package com.cg.spring.core.demo;
import com.cg.spring.core.demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author Vijendhar Bhukya Spring core demo project for CG trainees
 *         12 Oct Batch3
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = new Employee(101, "Sonu", 10.6);

//		Employee emp = ctx.getBean(Employee.class);

		Employee emp = ctx.getBean("employee", Employee.class);
		System.out.println(emp.toString());

		Employee emp2 = ctx.getBean("employee2", Employee.class);
		System.out.println(emp2.toString());

		((AbstractApplicationContext) ctx).close();

		System.out.println("End");

	}
}