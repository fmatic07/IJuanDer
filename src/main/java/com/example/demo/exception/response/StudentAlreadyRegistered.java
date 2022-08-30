package com.example.demo.exception.response;

import org.springframework.http.HttpStatus;

public class StudentAlreadyRegistered {
	private HttpStatus httpStatus;
	private String message;
	
	public StudentAlreadyRegistered(HttpStatus httpStatus, String message) {
		super();
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
