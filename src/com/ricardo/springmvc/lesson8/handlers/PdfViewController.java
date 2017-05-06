package com.ricardo.springmvc.lesson8.handlers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/pdf")
public class PdfViewController {
	
	
	@RequestMapping(value="pdfshow",method=RequestMethod.GET)
	public ModelAndView show(){
	      Map<String,String> userData = new HashMap<String,String>();
	      userData.put("100", "Xiao.Lu");
	      userData.put("102", "User 102");
	      userData.put("301", "User 301");
	      userData.put("400", "User 400");
	      return new ModelAndView("pdfview","userData",userData);

	}
}
