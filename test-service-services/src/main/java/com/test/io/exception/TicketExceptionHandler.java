package com.test.io.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.test.io.exceptions.TicketNotFoundException;

@RestControllerAdvice
public class TicketExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = TicketNotFoundException.class)

	public ResponseEntity<Object> exception(TicketNotFoundException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}
