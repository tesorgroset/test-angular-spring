package com.example.demo.constantes;

public class ErrorMessages {

	public static final String UNKNOWN_ERROR = "error.unknown";
	public static final String PERSON_FIRST_NAME_REQUIRED = "error.person.firstname.required";
	public static final String PERSON_FIRST_NAME_LENGTH = "error.person.firstname.length";	
	public static final String PERSON_LAST_NAME_REQUIRED = "error.person.lastname.required";
	public static final String PERSON_LAST_NAME_LENGTH = "error.person.lastname.length";
	public static final String PERSON_EDAD_POSITIVE = "error.person.edad.positive";
	public static final String PERSON_EDAD_RANGE = "error.person.edad.range";	
	public static final String PERSON_MATRICULA_REQUIRED = "error.person.matricula.required";
	
	private ErrorMessages() throws IllegalAccessException{
		throw new IllegalAccessException();
	}

}
