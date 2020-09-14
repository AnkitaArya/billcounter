package com.app.billcounter.exceptions;

public class BillCounterServiceException extends RuntimeException{
	/**
	 * Default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Https Status code
	 */
	 private int statusCode;

	public BillCounterServiceException(int statusCode ,String message) {
        super(message);
		this.statusCode = statusCode;
	}

	public BillCounterServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
