package com.library.exceptionhandler;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LMSRestExceptionController extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String error = "Malformed JSON request";
		return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex));
	}

	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	protected ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
		ApiError apiError = new ApiError(HttpStatus.NOT_ACCEPTABLE);
		apiError.setMessage(ex.getMessage());
		apiError.setDebugMessage("Consider modifying the JSON request");
		return buildResponseEntity(apiError);
	}
	
	@ExceptionHandler(BookNotFoundException.class)
	protected ResponseEntity<Object> handleDataIntegrityViolationException(BookNotFoundException ex) {
		ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
		apiError.setMessage(ex.getMessage());
		apiError.setDebugMessage("Book Id(primary key) in JSON request does not exist");
		return buildResponseEntity(apiError);
	}

/*	@ExceptionHandler(Exception.class)
	protected ResponseEntity<Object> handleAllOtherExceptions(Exception ex) {
		ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR);
		apiError.setMessage(ex.getMessage());
		apiError.setDebugMessage("Unexpected Error Occured");
		return buildResponseEntity(apiError);
	}*/
}