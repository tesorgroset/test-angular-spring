package com.example.demo.controller.person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.PersonService;

@Controller
public class PersonControllerList extends PersonController{
	
	@GetMapping(value="/person/list")
	private String getRequest(Map<String,Object> model){
		model.put("personList", personService.listAll());
		return "person/list";
	}

}
