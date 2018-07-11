package com.bridgelabz.autowiring.byName;
/*************************************************************************************************************
*
* purpose:sample program for annotation
*
* @author sowjanya467
* @version 1.0
* @since 19-06-18
*
* **************************************************************************************************/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		SampleB a = context.getBean("a", SampleB.class);
		a.display();

	}

}
