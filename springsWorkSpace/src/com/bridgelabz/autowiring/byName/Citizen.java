package com.bridgelabz.autowiring.byName;

import com.bridgelabz.DIcObj.Address;

public class Citizen {
	private String fName;
	private String lName;
	private String aadharNum;
	private Address address;

	public Citizen() {
		// TODO Auto-generated constructor stub
	}

	// public Citizen(String fName,String lName String aadharNum)
	{

	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the aadharNum
	 */
	public String getAadharNum() {
		return aadharNum;
	}

	/**
	 * @param aadharNum
	 *            the aadharNum to set
	 */
	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
