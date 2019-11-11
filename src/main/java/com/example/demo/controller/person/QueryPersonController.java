package com.example.demo.controller.person;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QueryPersonController extends PersonController{
	
	private static final String CT_PERSON_OBJ = "personObj";
	private static final String CT_PERSON_PAGE = "person/query";

	@GetMapping("/person/query/{idPerson}")
	private String getRequest(@PathVariable long idPerson,Map<String,Object> model){
		model.put(CT_PERSON_OBJ, personService.get(idPerson));
		return CT_PERSON_PAGE;
	}
	
}
