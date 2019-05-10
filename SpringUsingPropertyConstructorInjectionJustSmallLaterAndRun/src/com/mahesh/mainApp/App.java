package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Car;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");

		context.getBean("s1");
		context.getBean("t1");
		Car car = (Car) context.getBean("c1");
		car.displayData();
	}

}
