package com.example.demo.beans;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.example.demo.constantes.ErrorMessages;

import lombok.Data;

@Data
public class LoginRequest {
	
	/** for register
	(?=.*[0-9]) a digit must occur at least once
	(?=.*[a-z]) a lower case letter must occur at least once
	(?=.*[A-Z]) an upper case letter must occur at least once
	(?=.*[@#$%^&+=]) a special character must occur at least once
	(?=\\S+$) no whitespace allowed in the entire string
	.{8,} at least 8 characters	 */
	//private static final String POL_PW = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	
	@NotEmpty(message=ErrorMessages.LOGIN_USER_REQUIRED)
	// for register @Size(message=ErrorMessages.LOGIN_USER_SIZE)
	private String user;
	
	@NotEmpty(message=ErrorMessages.LOGIN_PW_REQUIRED)
	//for register: @Pattern(regexp=POL_PW,message=ErrorMessages.LOGIN_PW_POLICY)
	private String password;

}
