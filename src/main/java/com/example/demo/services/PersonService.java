package com.example.demo.services;

import java.util.List;

import com.example.demo.beans.PersonBean;

public interface PersonService {

	public void add(PersonBean personBean);

	public void update(PersonBean personBean);

	public void delete(long id);

	public List<PersonBean> listAll();

	public PersonBean get(long id);

}
