package com.ricardo.springmvc.lesson8.handlers;

import java.util.Map;

import org.springframework.web.servlet.view.json.AbstractJackson2View;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserJsonView extends AbstractJackson2View{

	protected UserJsonView(ObjectMapper objectMapper, String contentType) {
		super(objectMapper, contentType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setModelKey(String modelKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object filterModel(Map<String, Object> model) {
		// TODO Auto-generated method stub
		return null;
	}

}
