package com.ricardo.springmvc.lesson9.handlers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.springmvc.lesson9.bean.Message;

/**
 * RestController 是Controller和ResponseBody的结合
 * 底下的方法可以不需要加ResponseBody,因为ResController已经默认给方法加上了
 */
@RestController
@RequestMapping(value="/show")
public class HelloWorldRestController {
	
	
	@RequestMapping(value="{title}/{content}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Message show(@PathVariable String title,@PathVariable String content){
		Message message = new Message(title,content);
		return message;
	}
}
