package com.bridgelabz.inheritingBean;

/*************************************************************************************************************
 *
 * purpose: Class for person details
 *
 * @author sowjanya467
 * @version 1.0
 * @since 19-06-18
 *
 **************************************************************************************************/

public class PersonDetails {
	String city;
	String state;
	int zip;
	String country;

	public PersonDetails() {

	}

	public PersonDetails(String city, String state, int zip, String country) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;

	}

	public String toString() {
		return city + " " + state + " " + zip + " " + country;
	}

}
