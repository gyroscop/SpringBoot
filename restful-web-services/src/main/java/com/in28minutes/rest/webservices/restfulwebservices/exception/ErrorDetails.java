package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	//timestamp
	// message
	//Description
	
	LocalDateTime timestamp;
	StackTraceElement[] message;
	String description ;
	
	
	public ErrorDetails(LocalDateTime timestamp, StackTraceElement[] stackTraceElements, String description) {
		super();
		this.timestamp = timestamp;
		this.message = stackTraceElements;
		this.description = description;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public StackTraceElement[] getMessage() {
		return message;
	}
	public void setMessage(StackTraceElement[] message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
