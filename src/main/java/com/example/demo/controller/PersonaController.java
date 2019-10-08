package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.PersonBean;
import com.example.demo.services.PersonService;

import lombok.extern.log4j.Log4j2;


@RestController
@Log4j2
public class PersonaController extends PrincipalController{
	
	@Autowired
	private PersonService personService;

	//Metodo que calcula el año de matriculacion
	@GetMapping(value="/personas/anio-matriculacion", consumes=MediaType.TEXT_PLAIN_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String calculaAnioMatriculacion(@RequestParam(required=true) String matricula) throws InterruptedException{
		
		log.info("devolviendo el año de matriculacion");
		return matricula+"09/05/1978";  
	}
	
	@PostMapping(value="/persona")
	public void addPerson(@RequestBody @Valid PersonBean personBean){
		personService.add(personBean);
	}
	
	@PutMapping(value="/persona/{id}")
	public void updatePerson(@RequestBody @Valid PersonBean personBean){
		personService.update(personBean);
	}
	
	@DeleteMapping(value="/persona/{id}")
	public void deletePerson(@PathVariable long id){
		personService.delete(id);
	}
	
	@GetMapping(value="/persona")
	public List<PersonBean> personList(){
		return personService.listAll();
		
	}
	
	@GetMapping(value="persona/{id}")
	public PersonBean person(@PathVariable long id){
		return personService.get(id);
	}
	
}




