package com.ricardo.springmvc.lesson8.handlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ricardo.springmvc.lesson7.bean.User;


@Controller
public class XlsViewController {
	
	@RequestMapping(value="xlsshow",method=RequestMethod.GET)
	public ModelAndView show(){
		List<User> users = new ArrayList<User>();
		for(int i = 0 ; i<10 ; i++){
			User one = new User();
			one.setId(i);
			one.setName("xiao");
			users.add(one);
		}
		return new ModelAndView("xlsview","users",users);
	}
}
