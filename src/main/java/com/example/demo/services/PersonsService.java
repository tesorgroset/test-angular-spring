package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.PersonRepository;
import com.example.demo.beans.PersonBean;
import com.example.demo.entity.Person;

public class PersonsService extends PrincipalService{

	@Autowired
	protected PersonRepository personRepository;
	
	protected List<PersonBean> toPersonBeanList(Iterable<Person> personEntityList) {
		List<PersonBean> personBeanList = null;
		if (personEntityList != null){
			personBeanList = new ArrayList<>();
			for (Person pEntity : personEntityList){
				PersonBean personBean = new PersonBean();
				personBean.toBean(pEntity);
				personBeanList.add(personBean);
			}
		}
		return personBeanList;
	}
	
	
}
