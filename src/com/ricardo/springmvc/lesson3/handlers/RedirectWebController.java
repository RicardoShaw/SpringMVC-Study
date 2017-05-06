package com.ricardo.springmvc.lesson3.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RedirectWebController {

	
		@RequestMapping(value="/redirect")
		public String redirectTo(){
			return "redirect:final";
		}
		
		@RequestMapping(value="/final")
		public  String finalPage(){
			return "staticPages/final";
		}
}
