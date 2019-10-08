package com.example.demo.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.example.demo.constantes.ErrorMessages;
import com.example.demo.entity.Person;

import lombok.Data;

@Data
public class PersonBean {
	
	private long id;

	@NotBlank(message=ErrorMessages.PERSON_FIRST_NAME_EMPTY)
	@Size(min=3, max=17)
	private String firstName;
	
	@NotBlank @Size(min=3, max=35)
	private String lastName;
	
	@Positive @Range(max=125)
	private int edad;
	
	private String direccion;
	
	private String modeloCoche;
	
	@NotBlank //@Pattern(regexp="")
	private String matricula;

	public Person toEntity() {
		Person personEntity = new Person();
		personEntity.setId(id);
		personEntity.setFirstName(firstName);
		personEntity.setLastName(lastName);
		personEntity.setEdad(edad);
		personEntity.setDireccion(direccion);
		personEntity.setModeloCoche(modeloCoche);
		personEntity.setMatricula(matricula);
		return personEntity;
	}

	public void toBean(Person pEntity) {
		id = pEntity.getId();
		firstName = pEntity.getFirstName();
		lastName = pEntity.getLastName();
		edad = pEntity.getEdad();
		direccion = pEntity.getDireccion();
		modeloCoche = pEntity.getModeloCoche();
		matricula = pEntity.getMatricula();
	}
	
}
