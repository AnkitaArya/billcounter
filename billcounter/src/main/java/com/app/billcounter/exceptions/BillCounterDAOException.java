package com.app.billcounter.exceptions;

public class BillCounterDAOException extends RuntimeException{
	
	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private int statusCode;
	
	public BillCounterDAOException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillCounterDAOException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BillCounterDAOException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BillCounterDAOException(int statusCode, String message) {
        super(message);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
