package com.example.demo.exception.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
public class ErrorResponse {

	private String message;
	private int statusCode;
	private long toOfError;
	
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorResponse(String message, int statusCode, long toOfError) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.toOfError = toOfError;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public long getToOfError() {
		return toOfError;
	}
	public void setToOfError(long toOfError) {
		this.toOfError = toOfError;
	}
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", statusCode=" + statusCode + ", toOfError=" + toOfError + "]";
	}
	
	

}
