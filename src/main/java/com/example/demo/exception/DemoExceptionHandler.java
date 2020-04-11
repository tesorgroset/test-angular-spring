package com.example.demo.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.constantes.ErrorMessages;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ControllerAdvice
public class DemoExceptionHandler  extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<Object> manejadorExcepciones(Throwable ex, HttpHeaders headers, HttpStatus status) throws Throwable{
		String unkError = ErrorMessages.UNKNOWN_ERROR+": ";
		unkError += ex.getMessage();
		return new ResponseEntity<>(setBodyErrors(Arrays.asList(new String[] {unkError})), headers, status);
	}	
	
	@ExceptionHandler(UserPasswordIncorrectException.class)
	public ResponseEntity<Object> handleUserAndPassworedException(UserPasswordIncorrectException upiException,
																HttpHeaders headers,
													            HttpStatus status, WebRequest request){
		return new ResponseEntity<>(setBodyErrors(Arrays.asList(new String[] {ErrorMessages.LOGIN_USER_PW_INCORRECT})), headers, status);
	}
	
	private Map<String,Object> setBodyErrors(List<Object> errorList) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", new Date());
        body.put("errors", errorList);
        return body;
	}

	// error handle for @Valid
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        List<Object> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());
        return new ResponseEntity<>(setBodyErrors(errors), headers, status);
    }	
	
	
	/*@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
		return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
	}*/
	
}
