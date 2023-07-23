package com.rapidapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class RapidApiExceptionController {
		
	
	@ExceptionHandler(ResponseStatusException.class)
	public Exception exception() {
		return new ResponseStatusException(HttpStatus.CONFLICT,"Internal Server Error");
		
	}
	@ExceptionHandler(RapidApiException.class)
	public Exception notfoundException() {
		return new RapidApiException(HttpStatus.NOT_FOUND,"Internal Server Error","Not_Found");
		
	}
}
