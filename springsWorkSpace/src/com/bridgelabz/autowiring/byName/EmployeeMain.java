package com.bridgelabz.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");

		Person employee = (Person) context.getBean("employee");

		System.out.println(employee.getFullName());

		System.out.println(employee.getDepartmentBean().getName());

	}

}
