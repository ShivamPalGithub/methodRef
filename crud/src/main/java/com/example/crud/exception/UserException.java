package com.example.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class UserException extends RuntimeException{
	private  HttpStatus errorCode;
    private  String errorMessage;
    
    
	  public UserException(HttpStatus errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	public UserException() {
		super();
		
	}
	public HttpStatus getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
