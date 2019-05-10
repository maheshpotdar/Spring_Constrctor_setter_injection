package com.mahesh.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");
		Employee employee = (Employee) context.getBean("e1");
		System.out.println("1st Constuctor: " + employee.getName() + " " + employee.getAddress() + " "
				+ employee.getMarks() + " " + employee.getMobile() + "\n");
		System.out.println("---------------------------------------------------------------------");
		Employee employee2 = (Employee) context.getBean("e2");
		System.out.println("2nd Constuctor: " + employee2.getAddress() + "\n");
		System.out.println("---------------------------------------------------------------------");
		Employee employee3 = (Employee) context.getBean("e3");
		System.out.println("3rd Constuctor: " + employee3.getMarks() + "\n");
		System.out.println("---------------------------------------------------------------------");
		Employee employee4 =(Employee) context.getBean("e4");
		System.out.println("4th Constructor: "+employee4.getMarks()+" "+employee.getMobile());
	}
}
