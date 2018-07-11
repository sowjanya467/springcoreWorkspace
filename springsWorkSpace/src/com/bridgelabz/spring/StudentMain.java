package com.bridgelabz.spring;
/*************************************************************************************************************
*
* purpose:Program to understand BeanFactory methods
*
* @author sowjanya467
* @version 1.0
* @since 19-06-18
*
* **************************************************************************************************/

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("studentbean");
		boolean b = factory.containsBean("studentben");
		Class<?> type = factory.getType("studentbean");
		boolean c = factory.isSingleton("studentbean");
		boolean a = factory.isPrototype("studentbean");
		System.out.println("scope single " + c);
		System.out.println("contains " + b);
		System.out.println("class " + type);
		System.out.println("scope " + a);
		student.displayInfo();

	}

}
