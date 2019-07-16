package com.example.demo.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ControllerAdvice
public class DemoExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Throwable.class)
	public void manejadorExcepciones(Throwable ex) throws Throwable{
		try {
			ex.printStackTrace(new PrintWriter("c:/proyectos/brator/log/rest-angular.log"));
		} catch (FileNotFoundException e) {
			log.error("Fichero de log no encontrado"+e.getMessage());
		}
		throw ex;
	}	
	
}
