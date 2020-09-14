package com.app.billcounter.exceptions;

import java.util.Collections;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BillCounterException extends RuntimeException{
	
	
    /** The exception message. */
    private String exceptionMessage;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

	public BillCounterException(String message, String exceptionMessage) {
		super(message);
		this.exceptionMessage = exceptionMessage;
	}

	public BillCounterException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BillCounterException(String exceptionMessage) {
		super();
		this.exceptionMessage = exceptionMessage;
	}

	public BillCounterException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
}
