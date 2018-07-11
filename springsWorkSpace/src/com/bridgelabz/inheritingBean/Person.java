package com.bridgelabz.inheritingBean;

/*************************************************************************************************************
 *
 * purpose:Class for person
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-06-18
 *
 **************************************************************************************************/

public class Person {
	String firstName;
	String lastName;
	PersonDetails person;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String firstname, String lastname, PersonDetails person) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.person = person;
	}

	public void display() {
		System.out.println(firstName + " " + lastName);
		System.out.println(person);
	}
}
