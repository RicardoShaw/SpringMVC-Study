package com.ricardo.springmvc.lesson2.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StaticWebSourceController {
		
		@RequestMapping(value="/staticpageindex")
		public String index(){
			return "staticPages/staticpageindex";
		}
		
		@RequestMapping(value="/staticPage")
		public String redirect(){
			/**
			 * 访问静态文件的时候，需要在需要使用的servlet的配置文件servletName-servlet.xml
			 * 中配置，详情请看Springmvc.xml文件
			 */
			return "redirect:staticPages/final.html";
		}
}
	