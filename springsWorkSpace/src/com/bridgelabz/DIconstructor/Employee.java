package com.bridgelabz.DIconstructor;

/*************************************************************************************************************
 *
 * purpose:Dependency injection using constructor
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-06-18
 *
 **************************************************************************************************/

public class Employee {
	private int id;
	private String name;

	public Employee() {
		System.out.println("default constroctor");
	}

	public Employee(int id) {

		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		// System.out.println("djd");
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}

}
