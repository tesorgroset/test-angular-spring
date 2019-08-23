package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
public class PersonaController {

	//Metodo que calcula el año de matriculacion
	@GetMapping(value="/personas/anio-matriculacion", consumes=MediaType.TEXT_PLAIN_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String calculaAnioMatriculacion(@RequestParam(required=true) String matricula) throws InterruptedException{
		//modificacion from master
		log.info("devolviendo el año de matriculacion");
		return matricula+"09/05/1978";  
	}
	
}




