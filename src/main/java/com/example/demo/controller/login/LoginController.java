package com.example.demo.controller.login;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.LoginRequest;
import com.example.demo.beans.LoginResponse;
import com.example.demo.exception.UserPasswordIncorrectException;
import com.example.demo.services.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public LoginResponse login(@RequestBody @Valid LoginRequest loginBean) throws UserPasswordIncorrectException{
		return loginService.login(loginBean); 
	}

}
