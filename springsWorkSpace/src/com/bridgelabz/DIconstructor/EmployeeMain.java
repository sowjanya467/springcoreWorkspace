package com.bridgelabz.DIconstructor;
/*************************************************************************************************************
*
* purpose:Program for implementing dependency injection using constructors
*
* @author sowjanya467
* @version 1.0
* @since 27-05-17
*
* **************************************************************************************************/

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("diConstructor.xml");
		Employee employee = (Employee) context.getBean("e");
		/*
		 * Resource r=new ClassPathResource("diConstructor.xml"); BeanFactory
		 * factory=new XmlBeanFactory(r);
		 * 
		 * Employee employee=(Employee)factory.getBean("e");
		 */
		employee.show();
	}

}
