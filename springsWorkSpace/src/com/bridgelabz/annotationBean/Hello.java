package com.bridgelabz.annotationBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
		String message = service.getName();
		System.out.println(message);
		service.setName("sowji");
		message = service.getName();
		System.out.println(message);

	}

}
