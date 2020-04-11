package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PersonRepository;
import com.example.demo.beans.LoginRequest;
import com.example.demo.beans.LoginResponse;
import com.example.demo.exception.UserPasswordIncorrectException;
import com.example.demo.helpers.JWTHelper;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public LoginResponse login(LoginRequest loginBean) throws UserPasswordIncorrectException {
		LoginResponse loginResponse = new LoginResponse();
		if (personRepository.findByUserAndPassword(loginBean.getUser(),loginBean.getPassword()) != null){
			loginResponse.setUser(loginBean.getUser());
			loginResponse.setJwtToken(JWTHelper.generateJWT(loginBean.getUser()));
		}else{
			throw new UserPasswordIncorrectException();
		}
		return loginResponse;
	}

}
