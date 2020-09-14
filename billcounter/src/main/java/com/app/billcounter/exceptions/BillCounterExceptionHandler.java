package com.app.billcounter.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class BillCounterExceptionHandler {
		
		@ExceptionHandler(value = BillCounterServiceException.class)
		public ResponseEntity<ErrorResponse> handlerForBillCounterServiceException(BillCounterServiceException ex) {

			if (ex.getStatusCode() == 0) {
				ex.setStatusCode(HttpStatus.BAD_REQUEST.value());
			}
			return new ResponseEntity<ErrorResponse>(new ErrorResponse(ex.getMessage(), ex.getStatusCode()),
					HttpStatus.valueOf(ex.getStatusCode()));
		}
		
		@ExceptionHandler(value = BillCounterDAOException.class)
		public ResponseEntity<ErrorResponse> handlerForBillCounterDAOException(BillCounterDAOException ex) {

			if (ex.getStatusCode() == 0) {
				ex.setStatusCode(HttpStatus.SERVICE_UNAVAILABLE.value());
			}
			return new ResponseEntity<ErrorResponse>(new ErrorResponse(ex.getMessage(), ex.getStatusCode()),
					HttpStatus.valueOf(ex.getStatusCode()));
		}
	}
