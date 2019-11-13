package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class PricipalController {
	
	protected boolean testingErrors(BindingResult result, Map<String,Object> map){
		if (result.hasErrors()){
			Map<String,String> listaErr = new HashMap<>();
			for (ObjectError oe : result.getAllErrors()){
				listaErr.put(oe.getObjectName(), oe.getDefaultMessage());
			}
			map.put("errorMessages", listaErr.values());
			return true;
		}else{
			return false;
		}
		
	}
	
}
