package com.example.crud.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	
	  @ExceptionHandler(value = UserException.class) public ResponseEntity<String>
	  EmptyStudentListException(UserException userException) { return new
	  ResponseEntity<String>(userException.getErrorMessage(),userException.
	  getErrorCode()); }
	 
	  
	@ExceptionHandler(value = NoSuchElementException.class)
	protected ResponseEntity<UserException> handleNoSuchElementException(UserException ex) {
	    UserException userException = new UserException(HttpStatus.NOT_FOUND, ex.getErrorMessage());
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userException);
	}
	
	
}
