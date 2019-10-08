package com.example.demo.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
	public ResponseEntity<String> manejadorExcepciones(Throwable ex) throws Throwable{
		try {
			ex.printStackTrace(new PrintWriter("c:/proyectos/brator/log/rest-angular.log"));
		} catch (FileNotFoundException e) {
			log.error("Fichero de log no encontrado"+e.getMessage());
		}
		return new ResponseEntity<>(ErrorMessages.UNKNOWN_ERROR,HttpStatus.BAD_REQUEST);
	}	
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
		return new ResponseEntity<>(message,HttpStatus.BAD_REQUEST);
	}
	
}
