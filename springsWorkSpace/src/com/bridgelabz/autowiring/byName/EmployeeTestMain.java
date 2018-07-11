package com.bridgelabz.autowiring.byName;
/*************************************************************************************************************
*
* purpose: annotations byName,byType
*
* @author sowjanya467
* @version 1.0
* @since 19-06-18
*
* **************************************************************************************************/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire.xml");

		EmployeeService service = ctx.getBean("employeeServiceByName", EmployeeService.class);

		System.out.println("Autowiring byName Employee Name=" + service.getEmployee().getName());

		AutowiredUsingbyType serviceByType = ctx.getBean("employeeServiceByType", AutowiredUsingbyType.class);

		System.out.println("Autowiring byType Employee Name=" + serviceByType.getEmployee().getName());

		AutowiredUsingConstructor serviceByConstructor = ctx.getBean("employeeServiceConstructor",
				AutowiredUsingConstructor.class);

		System.out.println("Autowiring by Constructor Employee Name=" + serviceByConstructor.getEmployee().getName());

		// printing hashcode to confirm all the objects are of different type
		System.out
				.println(service.hashCode() + "::" + serviceByType.hashCode() + "::" + serviceByConstructor.hashCode());

		// Testing @Autowired annotations
		AutowiredUsingbyType autowiredByTypeService = ctx.getBean("autowireByType", AutowiredUsingbyType.class);

		System.out.println("@Autowired byType. Employee Name=" + autowiredByTypeService.getEmployee().getName());

		AutowiredUsingConstructor autowiredByConstructorService = ctx.getBean("autowireByConstructor",
				AutowiredUsingConstructor.class);

		System.out.println(
				"@Autowired by Constructor. Employee Name=" + autowiredByConstructorService.getEmployee().getName());

	}

}
