package com.example.demo.controller.person;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.controller.PricipalController;
import com.example.demo.services.PersonService;

public class PersonController extends PricipalController{

	@Autowired
	protected PersonService personService;
	
}
