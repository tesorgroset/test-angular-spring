package com.example.demo.constantes;

public class ErrorMessages {

	public static final String UNKNOWN_ERROR = "error.unknown";
	
	// PERSON CRUD
	public static final String PERSON_FIRST_NAME_REQUIRED = "error.person.firstname.required";
	public static final String PERSON_FIRST_NAME_LENGTH = "error.person.firstname.length";	
	public static final String PERSON_LAST_NAME_REQUIRED = "error.person.lastname.required";
	public static final String PERSON_LAST_NAME_LENGTH = "error.person.lastname.length";
	public static final String PERSON_EDAD_POSITIVE = "error.person.edad.positive";
	public static final String PERSON_EDAD_RANGE = "error.person.edad.range";	
	public static final String PERSON_MATRICULA_REQUIRED = "error.person.matricula.required";
	
	// LOGIN
	public static final String LOGIN_USER_REQUIRED = "error.login.user.required";
	public static final String LOGIN_USER_SIZE = "error.login.user.length";
	public static final String LOGIN_PW_REQUIRED = "error.login.pw.required";
	public static final String LOGIN_PW_POLICY = "error.login.pw.policy";
	public static final String LOGIN_USER_PW_INCORRECT = "error.login.user.pw.incorrect";
	
	private ErrorMessages() throws IllegalAccessException{
		throw new IllegalAccessException();
	}

}
