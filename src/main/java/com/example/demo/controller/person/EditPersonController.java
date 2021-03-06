package com.example.demo.controller.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.beans.PersonBean;

@Controller
public class EditPersonController extends PersonController {
	
	private static final String CT_EDIT_PERSON_PAGE = "person/edit";
	private static final String CT_OBJPERSON = "personBean";
	private static final String CT_PERSON_LIST_PAGE = "person/list";

	@GetMapping(value="/person/edit/{personId}")
	public String getRequest(@PathVariable long personId, Map<String,Object> model){
		model.put(CT_OBJPERSON, personService.get(personId));
		return CT_EDIT_PERSON_PAGE;
	}
	
	@PostMapping(value="/person/edit")
	public String postRequest(@Valid @ModelAttribute(CT_OBJPERSON) PersonBean personBean, BindingResult binding,
		Map<String,Object> modelMap){
		if (super.testingErrors(binding, modelMap)){
			return CT_EDIT_PERSON_PAGE;
		}else{
			personService.add(personBean);
			return "redirect:/person/list";
		}	
	}

}
