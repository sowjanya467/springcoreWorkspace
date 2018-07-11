package com.bridgelabz.spring;

/*************************************************************************************************************
 *
 * purpose:Pojo class
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-06-18
 *
 **************************************************************************************************/

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}

}
