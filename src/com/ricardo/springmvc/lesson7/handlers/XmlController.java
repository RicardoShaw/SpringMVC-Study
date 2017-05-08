package com.ricardo.springmvc.lesson7.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ricardo.springmvc.lesson7.bean.User;
import com.ricardo.springmvc.lesson7.bean.UserOne;


@Controller
@RequestMapping(value="user")
public class XmlController {
	
	@RequestMapping(value="xml/{name}",method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable String name){
		User user = new User();
		
		user.setName(name);
		user.setId(2);
		return user;
	}
	
	@RequestMapping(value="json/{name}",method = RequestMethod.GET)
	public @ResponseBody UserOne getUserOne(@PathVariable String name){
		UserOne user = new UserOne();
		
		user.setName(name);
		user.setId(2);
		return user;
	}

}
