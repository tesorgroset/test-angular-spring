package com.example.demo.beans;

import lombok.Data;

@Data
public class LoginResponse {
	private String user;
	private String jwtToken;
}
