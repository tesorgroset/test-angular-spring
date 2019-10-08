package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.beans.PersonBean;
import com.example.demo.entity.Person;

@Service
public class PersonServiceImpl extends PersonsService implements PersonService {

	@Override
	@Transactional
	public void add(PersonBean personBean) {
		personRepository.save(personBean.toEntity());
	}

	@Override
	public void update(PersonBean personBean) {
		personRepository.save(personBean.toEntity());
		
	}

	@Override
	public void delete(long id) {
		Person pEntity = new Person();
		pEntity.setId(id);
		personRepository.delete(pEntity);
	}

	@Override
	public List<PersonBean> listAll() {
		return toPersonBeanList(personRepository.findAll());
	}

	@Override
	public PersonBean get(long id) {
		Optional<Person> pEntity = personRepository.findById(id);
		PersonBean pBean = null;
		if (pEntity.isPresent()){
			pBean = new PersonBean();
			pBean.toBean(pEntity.get());
		}
		return pBean;
	}


}
