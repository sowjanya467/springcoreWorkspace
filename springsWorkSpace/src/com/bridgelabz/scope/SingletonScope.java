package com.bridgelabz.scope;
/*************************************************************************************************************
*
* purpose:program for singleton scope
*
* @author sowjanya467
* @version 1.0
* @since 27-05-17
*
* **************************************************************************************************/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Message m = (Message) context.getBean("messagebean");
		m.setName("sowjanya");
		String me = m.getName();
		System.out.println(me);
		Message m1 = (Message) context.getBean("messagebean");
		String m2 = m1.getName();
		System.out.println(m2);

	}

}
