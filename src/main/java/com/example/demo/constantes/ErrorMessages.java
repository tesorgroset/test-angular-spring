package com.example.demo.constantes;

public class ErrorMessages {

	public static final String UNKNOWN_ERROR = "error.unknown";
	public static final String PERSON_FIRST_NAME_EMPTY = "error.firstname.empty";
	
	private ErrorMessages() throws IllegalAccessException{
		throw new IllegalAccessException();
	}

}
