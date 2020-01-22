package com.coreflex.restwebservice.bean;

import java.util.Date;

/**
 * @author Mukunda N
 *
 */
public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String details;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	@Override
	public String toString() {
		return "CustomizedExceptionResponse [timestamp=" + timestamp + ", message=" + message + ", details=" + details
				+ ", getTimestamp()=" + getTimestamp() + ", getMessage()=" + getMessage() + ", getDetails()="
				+ getDetails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
