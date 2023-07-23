package com.rapidapi.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class RapidApiException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getMessage() {
		return message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	private String message;
	private String errorCode;
	private HttpStatus httpStatus;
	public RapidApiException(HttpStatus httpStatus,String message,String errorCode){
		this.errorCode = errorCode;
		this.message = message;
		this.httpStatus = httpStatus;
				
	}
	
	public String toString() {
		return this.httpStatus+": "+this.errorCode+"-"+this.message;
	}
}
