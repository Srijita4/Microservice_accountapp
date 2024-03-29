package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AccountNotFoundException extends Exception {
	private String message;

	public AccountNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AccountNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

