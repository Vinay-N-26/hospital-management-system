package com.qsp.hospitalManagementSystem.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(exception = DoesNotExistException.class)
	public String handleDoesNotFoundException(DoesNotExistException doesNotExistException) {
		return doesNotExistException.getMessage();
	}
}
