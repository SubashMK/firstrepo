package com.stg.exception;

public class StudentException extends Exception {

	private String message;

	public StudentException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}
