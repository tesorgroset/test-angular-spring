package com.example.demo.services;

import com.example.demo.beans.LoginRequest;
import com.example.demo.beans.LoginResponse;
import com.example.demo.exception.UserPasswordIncorrectException;

public interface LoginService {

	public LoginResponse login(LoginRequest loginBean) throws UserPasswordIncorrectException;

}
