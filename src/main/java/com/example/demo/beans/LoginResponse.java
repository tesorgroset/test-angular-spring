package com.example.demo.beans;

import lombok.Data;

@Data
public class LoginResponse {
	private long id;
	private String user;
	private String firstName;
	private String lastName;
	private String jwtToken;
}
