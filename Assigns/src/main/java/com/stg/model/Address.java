/**
 * 
 */
package com.stg.model;


/**
 * @author training
 *
 */
public class Address  {
	private int doorNo;
	private String city;
	private String state;
	private int zipcode;
	public Address() {
		super();
	}
	public Address(int doorNo, String city, String state, int zipcode) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
}
