/**
 * 
 */
package com.stg.model;

import java.util.List;

/**
 * @author training
 *
 */
public class Student {
	private int studId;
	private String studName;
	private int studAge;
	private String gender;
	private float marks;
	private List<Address> addresses;
	private List<Class> classes;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}
	public Student(int studId, String studName, int studAge, String gender, float marks, List<Address> addresses,
			List<Class> classes) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
		this.gender = gender;
		this.marks = marks;
		this.addresses = addresses;
		this.classes = classes;
	}
	public Student() {
		super();
	}
}
