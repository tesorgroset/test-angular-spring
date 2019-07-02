package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

	@GetMapping(value="/personas/anio-matriculacion", consumes=MediaType.TEXT_PLAIN_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String calculaAnioMatriculacion(@RequestParam(required=true) String matricula){
		return "09/05/1978";  
	}
	
}
