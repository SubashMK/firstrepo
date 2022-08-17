/**
 * 
 */
package com.stg.model;

import java.util.List;

/**
 * @author training
 *
 */
public class Class {
	private String clsName;
	private char sec;
	private String clsGroup;
	public Class() {
		super();
	}
	public Class(String clsName, char sec, String clsGroup) {
		super();
		this.clsName = clsName;
		this.sec = sec;
		this.clsGroup = clsGroup;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public char getSec() {
		return sec;
	}
	public void setSec(char sec) {
		this.sec = sec;
	}
	public String getClsGroup() {
		return clsGroup;
	}
	public void setClsGroup(String clsGroup) {
		this.clsGroup = clsGroup;
	}
	

}
