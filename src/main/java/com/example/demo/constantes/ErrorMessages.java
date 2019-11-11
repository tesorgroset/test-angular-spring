package com.example.demo.constantes;

public class ErrorMessages {

	public static final String UNKNOWN_ERROR = "error.unknown";
	public static final String PERSON_FIRST_NAME = "error.person.firstname";
	public static final String PERSON_LAST_NAME = "error.person.lastname";
	public static final String PERSON_EDAD = "error.person.edad";
	public static final String PERSON_MATRICULA = "error.person.matricula";
	
	private ErrorMessages() throws IllegalAccessException{
		throw new IllegalAccessException();
	}

}
