package com.example.demo.exception;

import org.springframework.web.client.HttpStatusCodeException;

public class StudentException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HttpStatusCodeException codeException;
	
	public StudentException(HttpStatusCodeException codeException) {
		super();
		this.codeException = codeException;
	}

	public HttpStatusCodeException getCodeException() {
		return codeException;
	}



	public void setCodeException(HttpStatusCodeException codeException) {
		this.codeException = codeException;
	}
}
