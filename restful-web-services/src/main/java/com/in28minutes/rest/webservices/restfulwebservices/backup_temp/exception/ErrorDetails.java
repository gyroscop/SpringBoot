package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorDetails {

	// timestamp
	// message 
	// description
	
	LocalDateTime  time ;
	String message;
	String description ;
	
	
	public ErrorDetails(LocalDateTime localDateTime, String message, String description) {
		super();
		this.time = localDateTime;
		this.message = message;
		this.description = description;
	}


	public LocalDateTime getTime() {
		return time;
	}


	public String getMessage() {
		return message;
	}


	public String getDescription() {
		return description;
	}
}
