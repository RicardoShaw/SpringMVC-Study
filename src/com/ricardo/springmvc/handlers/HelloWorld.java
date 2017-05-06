package com.ricardo.springmvc.handlers;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* Controller 表示是spring的控制器*/
@Controller
public class HelloWorld {
	private static Logger logger = Logger.getLogger(HelloWorld.class);
	/**
	 * 1.使用RequestMapping注解来映射请求的URL
	 * 2.返回值会通过视图解析器解析为实际的物理视图
	 * 通过prefix+returnValue+suffix 这样的方式得到实际的物理视图,然后会转发操作
	 * "/WEB-INF/views/success.jsp
	 */
	@RequestMapping("hello")
	public String hello(){
		System.out.println("###############helloworld#######################");
        // 记录debug级别的信息  
        logger.debug("This is debug message.");  
        // 记录info级别的信息  
        logger.info("This is info message.");  
        // 记录error级别的信息  
        logger.error("This is error message."); 
		return "success";
	}
	
//	@RequestMapping("/image/helloworld")
//	public String Ihello(){
//		System.out.println("xixi");
//        // 记录debug级别的信息  
//        logger.debug("This is debug message.");  
//        // 记录info级别的信息  
//        logger.info("This is info message.");  
//        // 记录error级别的信息  
//        logger.error("This is error message."); 
//		return "success";
//	}

}
